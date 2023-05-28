package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C4845x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.h */
final class C4808h {

    /* renamed from: c */
    private static final String f12259c = C4808h.class.getCanonicalName();

    /* renamed from: a */
    private final C4783d f12260a;

    /* renamed from: b */
    private final C4838t f12261b;

    C4808h(C4783d dVar, C4838t tVar) {
        this.f12260a = dVar;
        this.f12261b = tVar;
    }

    /* renamed from: a */
    private static String m14061a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f12259c;
            Logger.m14507i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f12261b.mo34414a(str, str2, str3)) {
                this.f12260a.mo34329a(str, str2);
                return;
            }
            C4783d dVar = this.f12260a;
            String a = m14061a(str, str2, str3);
            if (dVar.f12172a != null) {
                C4845x.C4868d dVar2 = dVar.f12172a;
                C4845x.this.mo34441b(C4845x.m14166a("unauthorizedMessage", a, (String) null, (String) null));
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str5 = f12259c;
            Logger.m14507i(str5, "messageHandler failed with exception " + e.getMessage());
        }
    }
}
