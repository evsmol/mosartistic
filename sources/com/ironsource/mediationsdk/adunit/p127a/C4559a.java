package com.ironsource.mediationsdk.adunit.p127a;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4386c;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.p122c.C4387a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.a.a */
public class C4559a {
    /* renamed from: a */
    public static int m13268a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: a */
    public static void m13269a(Context context) {
        C4387a aVar = C4387a.C4389a.f10471a;
        if (context != null) {
            try {
                if (!aVar.f10468c.getAndSet(true)) {
                    aVar.mo33198a("auid", C4407h.m12588y(context));
                    aVar.mo33198a("model", C4407h.m12557g());
                    aVar.mo33198a("make", C4407h.m12559h());
                    aVar.mo33198a("os", C4407h.m12561i());
                    String e = C4407h.m12553e();
                    if (e != null) {
                        aVar.mo33198a("osv", e.replaceAll("[^0-9/.]", ""));
                        aVar.mo33198a("osvf", e);
                    }
                    aVar.mo33198a("apilvl", String.valueOf(C4407h.m12555f()));
                    String i = C4407h.m12562i(context);
                    if (!TextUtils.isEmpty(i)) {
                        aVar.mo33198a("carrier", i);
                    }
                    String d = C4386c.m12481d(context);
                    if (!TextUtils.isEmpty(d)) {
                        aVar.mo33198a("instlr", d);
                    }
                    String A = C4407h.m12533A(context);
                    if (!TextUtils.isEmpty(A)) {
                        aVar.mo33198a("dt", A);
                    }
                    aVar.mo33198a("bid", context.getPackageName());
                    aVar.mo33198a("mem", String.valueOf(C4407h.m12550d(context)));
                    aVar.mo33198a("tkv", DtbConstants.APS_ADAPTER_VERSION_2);
                    aVar.mo33198a("tsu", Long.valueOf(C4386c.m12477b(context)));
                    aVar.mo33198a("tai", Long.valueOf(C4386c.m12474a(context)));
                    aVar.mo33198a("apv", C4386c.m12479c(context));
                    aVar.mo33198a("ptype", Integer.valueOf(C4377a.C43781.m12468f(context)));
                    aVar.mo33198a("simop", C4377a.C43781.m12467e(context));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        aVar.mo33199b(context);
    }

    /* renamed from: a */
    public static void m13270a(String str, Object obj) {
        C4387a.C4389a.f10471a.mo33198a(str, obj);
    }

    /* renamed from: a */
    public static void m13271a(String str, JSONObject jSONObject) {
        C4387a aVar = C4387a.C4389a.f10471a;
        if (jSONObject != null) {
            try {
                Object obj = aVar.f10466a.get(str);
                if (!(obj instanceof JSONObject)) {
                    aVar.mo33198a(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                aVar.mo33198a(str, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m13272a(Map<String, Object> map) {
        C4387a aVar = C4387a.C4389a.f10471a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        aVar.mo33198a(next, map.get(next));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static int m13273b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_LOAD_DURING_SHOW;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }
}
