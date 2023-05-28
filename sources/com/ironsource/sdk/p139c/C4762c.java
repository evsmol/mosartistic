package com.ironsource.sdk.p139c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.sdk.C4742a;
import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p138b.C4752a;
import com.ironsource.sdk.p138b.C4753b;
import com.ironsource.sdk.p138b.C4755c;
import com.ironsource.sdk.p139c.C4768e;
import com.ironsource.sdk.utils.C4987d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.c */
public class C4762c implements C4768e {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f12096e = C4762c.class.getSimpleName();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public final String f12097a;
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public WebView f12098b;

    /* renamed from: c */
    public C4753b f12099c;

    /* renamed from: d */
    public C4742a f12100d;

    /* renamed from: f */
    private final String f12101f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Activity f12102g;

    public C4762c(C4752a aVar, Activity activity, String str, C4742a aVar2) {
        this.f12102g = activity;
        C4753b bVar = new C4753b();
        this.f12099c = bVar;
        bVar.f12071d = str;
        this.f12101f = IronSourceStorageUtils.getNetworkStorageDir(activity.getApplicationContext());
        this.f12097a = str;
        this.f12099c.f12068a = aVar;
        this.f12100d = aVar2;
    }

    /* renamed from: a */
    static /* synthetic */ void m13959a(C4762c cVar, final String str) {
        Logger.m14507i(f12096e, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f12102g);
        cVar.f12098b = webView;
        webView.addJavascriptInterface(new C4761b(cVar), "containerMsgHandler");
        cVar.f12098b.setWebViewClient(new C4755c(new C4768e.C4769a() {
            /* renamed from: a */
            public final void mo34273a(String str) {
                String a = C4762c.f12096e;
                Logger.m14507i(a, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                C4762c.this.mo34269b(str, str);
            }

            /* renamed from: b */
            public final void mo34274b(String str) {
                String a = C4762c.f12096e;
                Logger.m14507i(a, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) C4762c.this.f12098b.getParent()).removeView(C4762c.this.f12098b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C4762c.this.m13963c();
            }
        }));
        C4987d.m14534a(cVar.f12098b);
        cVar.f12099c.f12070c = cVar.f12098b;
    }

    /* renamed from: b */
    static /* synthetic */ String m13961b(C4762c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(cVar.f12101f);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m13963c() {
        mo34258a("", "");
    }

    /* renamed from: a */
    public final synchronized void mo34258a(final String str, final String str2) {
        if (this.f12102g != null) {
            Logger.m14507i(f12096e, "performCleanup");
            C4399a.f10491a.mo33205a(new Runnable() {
                public final void run() {
                    try {
                        if (C4762c.this.f12098b != null) {
                            C4762c.this.f12098b.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", C4762c.this.f12097a);
                        if (C4762c.this.f12099c != null) {
                            C4762c.this.f12099c.mo34247a(str, jSONObject);
                            C4753b c = C4762c.this.f12099c;
                            c.f12068a = null;
                            c.f12069b = null;
                        }
                        C4753b unused = C4762c.this.f12099c = null;
                        Activity unused2 = C4762c.this.f12102g = null;
                    } catch (Exception e) {
                        String a = C4762c.f12096e;
                        Log.e(a, "performCleanup | could not destroy ISNAdView webView ID: " + C4762c.this.f12097a);
                        C4747d.m13921a(C4749f.f12051o, (Map<String, Object>) new C4743a().mo34234a("callfailreason", e.getMessage()).f12028a);
                        C4762c.this.mo34269b(str2, e.getMessage());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34259a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            mo34269b(str3, "action parameter empty");
            return;
        }
        String str4 = f12096e;
        Logger.m14507i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f12098b.onPause();
            } else if (str.equals("onResume")) {
                this.f12098b.onResume();
            } else {
                mo34269b(str3, "action not supported");
                return;
            }
            this.f12099c.mo34243a(str2);
        } catch (Exception unused) {
            mo34269b(str3, "failed to perform action");
        }
    }

    /* renamed from: a */
    public final void mo34260a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f12099c.mo34248b(str);
        } catch (Exception e) {
            String str3 = f12096e;
            Logger.m14507i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public final WebView mo34261b() {
        return this.f12098b;
    }

    /* renamed from: b */
    public final void mo34269b(String str, String str2) {
        C4753b bVar = this.f12099c;
        if (bVar != null) {
            bVar.mo34245a(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo34262b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f12099c.mo34246a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            String str3 = f12096e;
            Logger.m14507i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        C4753b bVar = this.f12099c;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.mo34249c(optString)) {
                bVar.mo34247a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.mo34246a(bVar.mo34242a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.f12072e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e.printStackTrace();
        }
    }
}
