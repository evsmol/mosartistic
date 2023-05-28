package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.Y */
public abstract class C4514Y implements C4729n.C4730a {

    /* renamed from: c */
    protected AbstractAdapter f11015c;

    /* renamed from: d */
    protected C4646a f11016d;

    /* renamed from: e */
    boolean f11017e;

    /* renamed from: f */
    protected JSONObject f11018f;

    /* renamed from: g */
    protected String f11019g;

    /* renamed from: h */
    protected int f11020h;

    /* renamed from: i */
    protected Long f11021i = null;

    C4514Y(C4646a aVar, AbstractAdapter abstractAdapter) {
        this.f11016d = aVar;
        this.f11015c = abstractAdapter;
        this.f11018f = aVar.f11592b;
    }

    /* renamed from: a */
    private String mo33456a() {
        return this.f11016d.f11591a.isMultipleInstances() ? this.f11016d.f11591a.getProviderTypeForReflection() : this.f11016d.f11591a.getProviderName();
    }

    /* renamed from: b */
    public final void mo33608b(String str) {
        C4619f.m13526a();
        this.f11019g = C4619f.m13537d(str);
    }

    /* renamed from: d */
    public void mo33546d() {
        try {
            if (this.f11015c != null) {
                this.f11015c.releaseMemory(this.f11016d.f11596f, this.f11018f);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.f11015c = null;
    }

    /* renamed from: e */
    public int mo33465e() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo33609h() {
        return this.f11016d.f11593c;
    }

    /* renamed from: i */
    public final int mo33610i() {
        return this.f11016d.f11594d;
    }

    /* renamed from: j */
    public final int mo33611j() {
        return this.f11016d.f11595e;
    }

    /* renamed from: k */
    public final String mo33612k() {
        return this.f11016d.f11591a.getProviderName();
    }

    /* renamed from: l */
    public final String mo33613l() {
        return this.f11016d.f11591a.getProviderTypeForReflection();
    }

    /* renamed from: m */
    public final int mo33614m() {
        return this.f11020h;
    }

    /* renamed from: n */
    public final Map<String, Object> mo33615n() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f11015c != null ? this.f11015c.getVersion() : str);
            if (this.f11015c != null) {
                str = this.f11015c.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f11016d.f11591a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f11016d.f11591a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(mo33609h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo33465e()));
            if (!TextUtils.isEmpty(this.f11019g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f11019g);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo33612k() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: o */
    public final Long mo33616o() {
        return this.f11021i;
    }

    /* renamed from: p */
    public final String mo33617p() {
        return String.format("%s %s", new Object[]{mo33456a(), Integer.valueOf(hashCode())});
    }
}
