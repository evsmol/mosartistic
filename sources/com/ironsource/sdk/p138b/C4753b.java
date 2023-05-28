package com.ironsource.sdk.p138b;

import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.appnext.base.p264b.C8849c;
import com.ironsource.environment.p124e.C4399a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.b */
public class C4753b {

    /* renamed from: a */
    public C4752a f12068a;

    /* renamed from: b */
    public C4756d f12069b = new C4756d();

    /* renamed from: c */
    public WebView f12070c;

    /* renamed from: d */
    public String f12071d;

    /* renamed from: e */
    public String f12072e = C4753b.class.getSimpleName();

    /* renamed from: f */
    private String[] f12073f = {"handleGetViewVisibility"};

    /* renamed from: g */
    private final String[] f12074g = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};

    /* renamed from: d */
    private static String m13933d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", new Object[]{str});
    }

    /* renamed from: e */
    private void m13934e(final String str) {
        final String str2 = "javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}";
        C4399a.f10491a.mo33205a(new Runnable() {
            public final void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        C4753b.this.f12070c.evaluateJavascript(str2, (ValueCallback) null);
                    } else {
                        C4753b.this.f12070c.loadUrl(str2);
                    }
                } catch (Throwable unused) {
                    String a = C4753b.this.f12072e;
                    Log.e(a, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + str + "Android API level: " + Build.VERSION.SDK_INT);
                }
            }
        });
    }

    /* renamed from: a */
    public final JSONObject mo34241a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f12069b.mo34255a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f12071d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public JSONObject mo34242a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put(C8849c.DATA, this.f12069b.mo34255a());
        } catch (Exception e) {
            String str = this.f12072e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e.printStackTrace();
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final void mo34243a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f12071d);
            mo34247a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo34244a(String str, int i, boolean z) {
        C4756d dVar = this.f12069b;
        boolean z2 = true;
        if (dVar.f12080a.containsKey(str)) {
            dVar.f12080a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.f12080a.put("isShown", Boolean.valueOf(z));
        if ((!dVar.f12080a.get("isWindowVisible").booleanValue() && !dVar.f12080a.get("isVisible").booleanValue()) || !dVar.f12080a.get("isShown").booleanValue()) {
            z2 = false;
        }
        dVar.f12080a.put("isViewVisible", Boolean.valueOf(z2));
        if ((Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) && this.f12068a != null && this.f12069b != null) {
            mo34247a("containerIsVisible", mo34241a());
        }
    }

    /* renamed from: a */
    public final void mo34245a(String str, String str2) {
        C4752a aVar = this.f12068a;
        if (aVar != null) {
            aVar.mo34239a(str, str2, this.f12071d);
        }
    }

    /* renamed from: a */
    public final void mo34246a(String str, String str2, String str3) {
        if (this.f12070c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f12072e, str4);
            this.f12068a.mo34239a(str3, str4, this.f12071d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        m13934e(m13933d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f12071d);
        mo34247a(str2, jSONObject);
    }

    /* renamed from: a */
    public final void mo34247a(String str, JSONObject jSONObject) {
        C4752a aVar = this.f12068a;
        if (aVar != null) {
            aVar.mo34240a(str, jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo34248b(String str) {
        JSONObject a = this.f12069b.mo34255a();
        a.put("adViewId", this.f12071d);
        mo34247a(str, a);
    }

    /* renamed from: c */
    public boolean mo34249c(String str) {
        for (String equalsIgnoreCase : this.f12073f) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
