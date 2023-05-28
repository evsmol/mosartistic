package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.w */
public class C4736w {

    /* renamed from: a */
    protected AbstractAdapter f12000a;

    /* renamed from: b */
    protected C4646a f12001b;

    /* renamed from: c */
    protected JSONObject f12002c;

    /* renamed from: d */
    int f12003d;

    /* renamed from: e */
    protected String f12004e;

    /* renamed from: f */
    protected JSONObject f12005f;

    /* renamed from: g */
    protected List<String> f12006g;

    /* renamed from: h */
    protected String f12007h;

    /* renamed from: i */
    private C4737a f12008i;

    /* renamed from: j */
    private Timer f12009j;

    /* renamed from: k */
    private final Object f12010k = new Object();

    /* renamed from: l */
    private final Object f12011l = new Object();

    /* renamed from: com.ironsource.mediationsdk.w$a */
    public enum C4737a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C4736w(C4646a aVar, AbstractAdapter abstractAdapter) {
        this.f12001b = aVar;
        this.f12000a = abstractAdapter;
        this.f12002c = aVar.f11592b;
        this.f12008i = C4737a.NOT_LOADED;
        this.f12009j = null;
        this.f12004e = "";
        this.f12005f = null;
        this.f12006g = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4737a mo34213a(C4737a[] aVarArr, C4737a aVar) {
        C4737a aVar2;
        synchronized (this.f12010k) {
            aVar2 = this.f12008i;
            if (Arrays.asList(aVarArr).contains(this.f12008i)) {
                mo34214a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34214a(C4737a aVar) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlySmash " + this.f12001b.f11591a.getProviderName() + ": current state=" + this.f12008i + ", new state=" + aVar, 0);
        synchronized (this.f12010k) {
            this.f12008i = aVar;
        }
    }

    /* renamed from: a */
    public final void mo34215a(String str) {
        C4619f.m13526a();
        this.f12007h = C4619f.m13537d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34216a(TimerTask timerTask) {
        synchronized (this.f12011l) {
            mo34224h();
            Timer timer = new Timer();
            this.f12009j = timer;
            timer.schedule(timerTask, (long) (this.f12003d * 1000));
        }
    }

    /* renamed from: a */
    public final void mo34217a(JSONObject jSONObject) {
        this.f12005f = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo34218a(C4737a aVar, C4737a aVar2) {
        synchronized (this.f12010k) {
            if (this.f12008i != aVar) {
                return false;
            }
            mo34214a(aVar2);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo34219b(String str) {
        this.f12004e = str;
    }

    /* renamed from: c */
    public Map<String, Object> mo34070c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f12000a != null ? this.f12000a.getVersion() : str);
            if (this.f12000a != null) {
                str = this.f12000a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f12001b.f11591a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f12001b.f11591a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f12001b.f11593c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f12004e)) {
                    hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f12004e);
                }
                if (this.f12005f != null && this.f12005f.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f12005f);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f12007h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f12007h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo34220d() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: d */
    public final String mo34220d() {
        return this.f12001b.f11591a.getProviderName();
    }

    /* renamed from: e */
    public final int mo34221e() {
        return this.f12001b.f11594d;
    }

    /* renamed from: f */
    public final String mo34222f() {
        return this.f12001b.f11591a.getSubProviderId();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo34223g() {
        C4737a aVar = this.f12008i;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo34224h() {
        synchronized (this.f12011l) {
            if (this.f12009j != null) {
                this.f12009j.cancel();
                this.f12009j = null;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo34225i() {
        return this.f12001b.f11593c;
    }
}
