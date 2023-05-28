package com.ironsource.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.sdk.p144g.C4936d;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d */
public final class C4906d {

    /* renamed from: a */
    private static String f12529a = "ManRewInst_";

    /* renamed from: a */
    public static String m14289a() {
        return String.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static String m14290a(C4751b bVar) {
        return (bVar.mo34238a() ? C4936d.C4941e.Banner : bVar.f12060a ? C4936d.C4941e.RewardedVideo : C4936d.C4941e.Interstitial).toString();
    }

    /* renamed from: a */
    public static String m14291a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        }
        return f12529a + jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
    }
}
