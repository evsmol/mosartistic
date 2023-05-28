package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.C4412k;
import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.sdk.p141e.p142a.C4926a;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.c */
public final class C4979c {

    /* renamed from: a */
    private C4559a f12728a = new C4559a();

    /* renamed from: a */
    public final void mo34714a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", C4926a.f12585a);
        hashMap.put("ompv", "7");
        C4559a.m13272a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public final void mo34715a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C4559a.m13270a("imm", (Object) Boolean.valueOf(C4407h.m12543a(activity)));
            }
        }
    }

    /* renamed from: b */
    public final void mo34716b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                C4559a.m13270a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo34717b(Context context) {
        C4559a.m13270a("gpi", (Object) Boolean.valueOf(C4412k.m12593a(context)));
    }

    /* renamed from: c */
    public final void mo34718c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C4559a.m13271a(Constants.DEBUG_INTERSTITIAL, jSONObject);
        }
    }
}
