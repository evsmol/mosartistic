package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.amazon.aps.shared.APSAnalytics;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;
import com.bytedance.sdk.component.adexpress.dynamic.p305d.C10376b;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10634k;
import com.bytedance.sdk.component.widget.SSWebView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f */
/* compiled from: DynamicJsParser */
public class C10363f implements C10370i {

    /* renamed from: e */
    private static String f25712e;

    /* renamed from: f */
    private static final Set<String> f25713f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill"})));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f25714a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SSWebView f25715b;

    /* renamed from: c */
    private String f25716c;

    /* renamed from: d */
    private C10376b f25717d;

    public C10363f(Context context, String str) {
        this.f25714a = context;
        this.f25716c = str;
        SSWebView sSWebView = new SSWebView(this.f25714a);
        this.f25715b = sSWebView;
        sSWebView.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f25715b.mo64296a((Object) new C10365a(), "JS_DYNAMIC_LAYOUT_OBJ");
        }
        this.f25715b.mo64297a("about:blank");
        m30161a();
    }

    /* renamed from: a */
    public static void m30163a(String str) {
        f25712e = str;
    }

    /* renamed from: a */
    private void m30161a() {
        if (!m30174i() || Build.VERSION.SDK_INT < 19) {
            m30166b();
        } else {
            m30168c();
        }
        m30166b();
    }

    /* renamed from: b */
    private void m30166b() {
        SSWebView sSWebView;
        String e = m30170e();
        if (!TextUtils.isEmpty(e) && (sSWebView = this.f25715b) != null) {
            C10634k.m31223a(sSWebView.getWebView(), e);
        }
    }

    /* renamed from: c */
    private void m30168c() {
        try {
            String f = m30171f();
            String h = m30173h();
            if (TextUtils.isEmpty(h)) {
                m30166b();
                return;
            }
            SSWebView sSWebView = this.f25715b;
            sSWebView.mo64298a(f + h, (ValueCallback<String>) null);
        } catch (Throwable unused) {
            m30166b();
        }
    }

    /* renamed from: a */
    public void mo63597a(C10376b bVar) {
        this.f25717d = bVar;
    }

    /* renamed from: a */
    public void mo63596a(C10296l lVar) {
        C10376b bVar;
        if (TextUtils.isEmpty(f25712e) && (bVar = this.f25717d) != null) {
            bVar.mo63277a((C10351h) null);
            m30172g();
        }
        C10373l.m30210b(m30165b(lVar));
        m30169d();
    }

    /* renamed from: b */
    private String m30165b(C10296l lVar) {
        return lVar == null ? "" : lVar.mo63192r();
    }

    /* renamed from: d */
    private void m30169d() {
        String str = "javascript:var res = getLayoutInfo(" + this.f25716c + ");window." + "JS_DYNAMIC_LAYOUT_OBJ" + ".calculateResult(JSON.stringify(res));";
        SSWebView sSWebView = this.f25715b;
        if (sSWebView != null) {
            C10634k.m31223a(sSWebView.getWebView(), str);
        }
    }

    /* renamed from: e */
    private static String m30170e() {
        String str;
        if (TextUtils.isEmpty(f25712e)) {
            return null;
        }
        String f = m30171f();
        if (m30174i()) {
            str = "(function () {var se = document.createElement('script');se.type = 'text/javascript';se.src = '" + ("file//" + C10268b.m29508f() + "/" + C10626e.m31201a(f25712e)) + "';document.body.appendChild(se);})();";
        } else {
            str = "(function () {var JS_TTDYNAMIC_URL = '" + f25712e + "';var xhrObj = new XMLHttpRequest();xhrObj.open('GET', JS_TTDYNAMIC_URL, false);xhrObj.send('');var se = document.createElement('script');se.type = 'text/javascript';se.text = xhrObj.responseText;document.getElementsByTagName('head')[0].appendChild(se);})();";
        }
        return "javascript:" + f + str;
    }

    /* renamed from: f */
    private static String m30171f() {
        return "var global = Function('return this')();global.jsCoreGlobal = {width:" + C10305b.m29751b(C10262a.m29464a().mo63095c().mo1819b(), (float) C10305b.m29749a(C10262a.m29464a().mo63095c().mo1819b())) + ",height:" + C10305b.m29751b(C10262a.m29464a().mo63095c().mo1819b(), (float) C10305b.m29750b(C10262a.m29464a().mo63095c().mo1819b())) + ",os:'Android'};global.systemFontSizeRatioNative = " + 1.2d + ";";
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.f$a */
    /* compiled from: DynamicJsParser */
    private class C10365a {
        @JavascriptInterface
        public double systemFontSizeRatioNative() {
            return 1.2d;
        }

        private C10365a() {
        }

        @JavascriptInterface
        public String jsCoreGlobal() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, C10305b.m29751b(C10363f.this.f25714a, (float) C10305b.m29749a(C10363f.this.f25714a)));
                jSONObject.put(IabUtils.KEY_HEIGHT, C10305b.m29751b(C10363f.this.f25714a, (float) C10305b.m29750b(C10363f.this.f25714a)));
                jSONObject.put("os", APSAnalytics.OS_NAME);
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @JavascriptInterface
        public String getDomSizeFromNative(String str, String str2, String str3, boolean z, boolean z2, int i) {
            return C10373l.m30209b(str, str2, str3, z, z2, i);
        }

        @JavascriptInterface
        public void calculateResult(String str) {
            C10363f.this.m30167b(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30167b(String str) {
        C10351h hVar = new C10351h();
        try {
            C10351h.m30083a(new JSONObject(str), hVar, (C10351h) null);
        } catch (Exception unused) {
            hVar = null;
        }
        C10376b bVar = this.f25717d;
        if (bVar != null) {
            bVar.mo63277a(hVar);
        }
        m30172g();
    }

    /* renamed from: g */
    private void m30172g() {
        C10631h.m31218b().post(new Runnable() {
            public void run() {
                if (C10363f.this.f25715b != null) {
                    C10363f.this.f25715b.mo64324l();
                }
                SSWebView unused = C10363f.this.f25715b = null;
            }
        });
    }

    /* renamed from: h */
    private String m30173h() {
        try {
            return mo63595a((InputStream) new FileInputStream(C10268b.m29508f() + "/" + C10626e.m31201a(f25712e)));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    private static boolean m30174i() {
        if (TextUtils.isEmpty(f25712e)) {
            return false;
        }
        String a = C10626e.m31201a(f25712e);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        return new File(C10268b.m29508f(), a).exists();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004c A[SYNTHETIC, Splitter:B:30:0x004c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo63595a(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "is error"
            java.lang.String r1 = "br error"
            java.lang.String r2 = "TemplateToModelParser"
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            r6.<init>(r8)     // Catch:{ all -> 0x0039 }
            r5.<init>(r6)     // Catch:{ all -> 0x0039 }
        L_0x0016:
            java.lang.String r6 = r5.readLine()     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x0020
            r4.append(r6)     // Catch:{ all -> 0x0037 }
            goto L_0x0016
        L_0x0020:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0037 }
            r5.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r1, r4)
        L_0x002c:
            if (r8 == 0) goto L_0x0036
            r8.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r0, r8)
        L_0x0036:
            return r3
        L_0x0037:
            r4 = move-exception
            goto L_0x003b
        L_0x0039:
            r4 = move-exception
            r5 = r3
        L_0x003b:
            java.lang.String r6 = "readStream error"
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r6, r4)     // Catch:{ all -> 0x0055 }
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r1, r4)
        L_0x004a:
            if (r8 == 0) goto L_0x0054
            r8.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r0, r8)
        L_0x0054:
            return r3
        L_0x0055:
            r3 = move-exception
            if (r5 == 0) goto L_0x0060
            r5.close()     // Catch:{ all -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r1, r4)
        L_0x0060:
            if (r8 == 0) goto L_0x006a
            r8.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C10638l.m31230a(r2, r0, r8)
        L_0x006a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p304c.C10363f.mo63595a(java.io.InputStream):java.lang.String");
    }
}
