package com.bytedance.sdk.openadsdk.p039f.p040a;

import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.p293a.C10224e;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.f.a.d */
/* compiled from: InteractiveFinishMethod */
public class C0782d extends C10224e<JSONObject, JSONObject> {

    /* renamed from: a */
    private WeakReference<C0709w> f2951a;

    /* renamed from: a */
    public static void m3923a(C10245r rVar, C0709w wVar) {
        rVar.mo63072a("interactiveFinish", (C10224e<?, ?>) new C0782d(wVar));
    }

    /* renamed from: a */
    public JSONObject mo216a(JSONObject jSONObject, C10225f fVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<C0709w> weakReference = this.f2951a;
        if (!(weakReference == null || weakReference.get() == null)) {
            C0709w wVar = (C0709w) this.f2951a.get();
            C0477n c = wVar.mo2371c();
            boolean z = true;
            try {
                int i = 0;
                if (jSONObject.optInt(Constants.FINISH, 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int aA = c != null ? c.mo1370aA() : 0;
                if (optInt >= 0 && aA >= 0) {
                    optInt = Math.min(optInt, aA);
                } else if (optInt < 0) {
                    optInt = aA >= 0 ? aA : 0;
                }
                if (z) {
                    wVar.mo2374c(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public C0782d(C0709w wVar) {
        this.f2951a = new WeakReference<>(wVar);
    }
}
