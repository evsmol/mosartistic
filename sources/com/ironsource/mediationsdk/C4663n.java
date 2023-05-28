package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4712a;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.n */
public abstract class C4663n {

    /* renamed from: a */
    protected C4712a f11672a;

    /* renamed from: b */
    protected IronSourceSegment f11673b;

    /* renamed from: c */
    private HashSet<ImpressionDataListener> f11674c = new HashSet<>();

    public C4663n(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        this.f11674c = hashSet;
        this.f11672a = new C4712a();
        this.f11673b = ironSourceSegment;
    }

    /* renamed from: c */
    protected static String m13642c() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34044a(IronSource.AD_UNIT ad_unit) {
        this.f11672a.mo34171a(ad_unit, false);
    }

    /* renamed from: a */
    public final void mo34045a(IronSourceSegment ironSourceSegment) {
        this.f11673b = ironSourceSegment;
    }

    /* renamed from: a */
    public final void mo34046a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f11674c.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34047a(C4707b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo34156a(str);
            if (a != null) {
                Iterator<ImpressionDataListener> it = this.f11674c.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34048a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("isAdUnitCapped", false);
        }
        this.f11672a.mo34171a(ad_unit, z);
    }

    /* renamed from: b */
    public final void mo34049b() {
        synchronized (this) {
            this.f11674c.clear();
        }
    }

    /* renamed from: b */
    public final void mo34050b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f11674c.remove(impressionDataListener);
        }
    }
}
