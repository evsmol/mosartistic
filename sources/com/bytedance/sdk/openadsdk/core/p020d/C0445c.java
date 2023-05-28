package com.bytedance.sdk.openadsdk.core.p020d;

import android.content.Context;
import com.bytedance.sdk.component.p323e.C10576b;
import com.bytedance.sdk.component.p323e.p324a.C10575a;
import com.bytedance.sdk.component.p323e.p325b.C10581c;
import com.bytedance.sdk.component.p323e.p325b.C10582d;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.c */
/* compiled from: FrequentCallEventHelper */
public class C0445c {
    /* renamed from: a */
    public static void m1820a(Context context, String str, long j) {
        JSONObject a = m1819a(str, j);
        C10582d b = C0835d.m4093a().mo2660b().mo64150b();
        b.mo64176a(C0996u.m4665g("/api/ad/union/sdk/stats/"));
        b.mo64186c(a.toString());
        b.mo64184a((C10575a) new C10575a() {
            /* renamed from: a */
            public void mo444a(C10581c cVar, C10576b bVar) {
                if (bVar != null) {
                    C10638l.m31231a("uploadFrequentEvent", Boolean.valueOf(bVar.mo64166f()), bVar.mo64164d());
                    return;
                }
                C10638l.m31238c("uploadFrequentEvent", "NetResponse is null");
            }

            /* renamed from: a */
            public void mo445a(C10581c cVar, IOException iOException) {
                C10638l.m31238c("uploadFrequentEvent", iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private static JSONObject m1819a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", "4.5.0.6");
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
