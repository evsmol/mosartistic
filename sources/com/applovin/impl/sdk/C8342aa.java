package com.applovin.impl.sdk;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.p254c.C8382d;
import com.applovin.impl.sdk.p254c.C8383e;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.aa */
public class C8342aa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WebView f20535a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f20536b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f20537c = new Object();

    /* renamed from: d */
    private static final AtomicBoolean f20538d = new AtomicBoolean();

    static {
        if (m24986b()) {
            f20536b = (String) C8383e.m25219b(C8382d.f20991D, "", C8490n.m25593Q());
            return;
        }
        f20536b = "";
        C8383e.m25217a(C8382d.f20991D, null, C8490n.m25593Q());
        C8383e.m25217a(C8382d.f20992E, null, C8490n.m25593Q());
    }

    /* renamed from: a */
    public static String m24982a() {
        String str;
        synchronized (f20537c) {
            str = f20536b;
        }
        return str;
    }

    /* renamed from: a */
    public static void m24984a(C8490n nVar) {
    }

    /* renamed from: b */
    public static void m24985b(final C8490n nVar) {
        if (!m24986b() && !f20538d.getAndSet(true)) {
            AppLovinSdkUtils.runOnUiThread(C8571h.m26084b() ? new Runnable() {
                public void run() {
                    try {
                        synchronized (C8342aa.f20537c) {
                            String unused = C8342aa.f20536b = WebSettings.getDefaultUserAgent(C8490n.m25593Q());
                            C8383e.m25217a(C8382d.f20991D, C8342aa.f20536b, C8490n.m25593Q());
                            C8383e.m25217a(C8382d.f20992E, Build.VERSION.RELEASE, C8490n.m25593Q());
                        }
                    } catch (Throwable th) {
                        C8490n.this.mo57320D();
                        if (C8626v.m26252a()) {
                            C8490n.this.mo57320D().mo57819b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            } : new Runnable() {
                public void run() {
                    try {
                        C8342aa.m24984a(C8490n.this);
                        synchronized (C8342aa.f20537c) {
                            String unused = C8342aa.f20536b = C8342aa.f20535a.getSettings().getUserAgentString();
                            C8383e.m25217a(C8382d.f20991D, C8342aa.f20536b, C8490n.m25593Q());
                            C8383e.m25217a(C8382d.f20992E, Build.VERSION.RELEASE, C8490n.m25593Q());
                        }
                    } catch (Throwable th) {
                        C8490n.this.mo57320D();
                        if (C8626v.m26252a()) {
                            C8490n.this.mo57320D().mo57819b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static boolean m24986b() {
        boolean equals;
        synchronized (f20537c) {
            equals = Build.VERSION.RELEASE.equals((String) C8383e.m25219b(C8382d.f20992E, "", C8490n.m25593Q()));
        }
        return equals;
    }
}
