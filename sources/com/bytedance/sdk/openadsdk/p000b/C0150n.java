package com.bytedance.sdk.openadsdk.p000b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.n */
/* compiled from: LandingPageLog */
public class C0150n {

    /* renamed from: a */
    private static final int[] f566a = {10, 30, 50, 75, 100};

    /* renamed from: b */
    private int f567b = 0;

    /* renamed from: c */
    private long f568c = -1;

    /* renamed from: d */
    private int f569d = 1;

    /* renamed from: e */
    private AtomicBoolean f570e = new AtomicBoolean(false);

    /* renamed from: f */
    private AtomicBoolean f571f = new AtomicBoolean(false);

    /* renamed from: g */
    private int f572g = -1;

    /* renamed from: h */
    private String f573h;

    /* renamed from: i */
    private String f574i;

    /* renamed from: j */
    private final Context f575j = C0558m.m2663a();

    /* renamed from: k */
    private final C0477n f576k;

    /* renamed from: l */
    private String f577l = "landingpage";

    /* renamed from: m */
    private long f578m = 0;

    /* renamed from: n */
    private long f579n = 0;

    /* renamed from: o */
    private long f580o = 0;

    /* renamed from: p */
    private long f581p = 0;

    /* renamed from: q */
    private long f582q = 0;

    /* renamed from: r */
    private long f583r = 0;

    /* renamed from: s */
    private boolean f584s = false;

    /* renamed from: t */
    private boolean f585t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public AtomicInteger f586u = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public WebView f587v;

    /* renamed from: w */
    private boolean f588w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f589x = "";

    /* renamed from: y */
    private C0164u f590y;

    /* renamed from: z */
    private boolean f591z = false;

    /* renamed from: a */
    public C0477n mo429a() {
        return this.f576k;
    }

    public C0150n(Context context, C0477n nVar, WebView webView) {
        this.f576k = nVar;
        this.f587v = webView;
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f587v.addJavascriptInterface(new C0153a(), "JS_LANDING_PAGE_LOG_OBJ");
            }
            if (nVar != null && nVar.mo1377aH() != null) {
                this.f568c = nVar.mo1377aH().optLong("page_id", -1);
            }
        }
    }

    /* renamed from: a */
    public void mo430a(long j) {
        this.f580o = j;
    }

    /* renamed from: a */
    public void mo438a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f577l = str;
        }
    }

    /* renamed from: b */
    public C0164u mo439b() {
        return this.f590y;
    }

    /* renamed from: a */
    public void mo437a(C0164u uVar) {
        this.f590y = uVar;
    }

    /* renamed from: a */
    public C0150n mo428a(boolean z) {
        this.f588w = z;
        return this;
    }

    /* renamed from: c */
    public boolean mo440c() {
        return this.f591z;
    }

    /* renamed from: a */
    public void mo431a(WebView webView, int i) {
        if (webView != null) {
            C10638l.m31235b("LandingPageLog", "onWebProgress: " + i);
            if (this.f581p == 0 && i > 0) {
                this.f581p = System.currentTimeMillis();
            } else if (this.f582q == 0 && i == 100) {
                this.f582q = System.currentTimeMillis();
            }
            if (this.f567b == f566a.length) {
                return;
            }
            if ("landingpage".equals(this.f577l) || "landingpage_endcard".equals(this.f577l) || "landingpage_split_screen".equals(this.f577l) || "landingpage_direct".equals(this.f577l)) {
                int i2 = this.f567b;
                while (true) {
                    int[] iArr = f566a;
                    if (i2 < iArr.length && i >= iArr[this.f567b]) {
                        int i3 = i2 + 1;
                        this.f567b = i3;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", webView.getUrl());
                            if (this.f568c != -1) {
                                jSONObject.put("page_id", this.f568c);
                            }
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put("pct", f566a[i2]);
                        } catch (Exception unused) {
                        }
                        m705a("progress_load_finish", jSONObject);
                        i2 = i3;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo434a(WebView webView, String str, Bitmap bitmap) {
        C10638l.m31235b("LandingPageLog", "onWebStarted: " + String.valueOf(str));
        C0164u uVar = this.f590y;
        if (uVar != null) {
            uVar.mo477e();
        }
        if (this.f570e.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (Exception unused) {
            }
            m705a("load_start", jSONObject);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0082 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo435a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onWebFinished: "
            r0.append(r1)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "LandingPageLog"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r0, (java.lang.String) r12)
            com.bytedance.sdk.openadsdk.b.u r12 = r10.f590y
            if (r12 == 0) goto L_0x0021
            r12.mo479f()
        L_0x0021:
            r12 = 1
            if (r11 == 0) goto L_0x0033
            boolean r0 = r10.f584s
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.f588w
            if (r0 == 0) goto L_0x0033
            r10.f584s = r12
            java.lang.String r0 = "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});"
            com.bytedance.sdk.component.utils.C10634k.m31223a(r11, r0)
        L_0x0033:
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.f571f
            r0 = 0
            boolean r11 = r11.compareAndSet(r0, r12)
            if (r11 != 0) goto L_0x003d
            return
        L_0x003d:
            int r11 = r10.f569d
            r1 = 3
            r2 = 2
            if (r11 == r1) goto L_0x0045
            r10.f569d = r2
        L_0x0045:
            long r3 = java.lang.System.currentTimeMillis()
            r10.f578m = r3
            int r11 = r10.f569d
            if (r11 != r2) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r12 = 0
        L_0x0051:
            java.lang.String r11 = "render_type_2"
            java.lang.String r1 = "h5"
            java.lang.String r2 = "render_type"
            java.lang.String r3 = "error_url"
            java.lang.String r4 = "error_msg"
            java.lang.String r5 = "error_code"
            if (r12 == 0) goto L_0x00cd
            long r6 = r10.f582q
            long r8 = r10.f581p
            long r6 = r6 - r8
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r8 = r10.f572g     // Catch:{ Exception -> 0x0082 }
            r12.put(r5, r8)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = r10.f573h     // Catch:{ Exception -> 0x0082 }
            r12.put(r4, r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = r10.f574i     // Catch:{ Exception -> 0x0082 }
            r12.put(r3, r4)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r11, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            com.bytedance.sdk.openadsdk.core.i.f r11 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.core.i.c r11 = r11.mo1705k()     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r13 = r11.f1865a     // Catch:{ all -> 0x00c0 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00c0 }
            if (r13 != 0) goto L_0x00c0
            boolean r13 = r11.f1866b     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r11 = r11.f1865a     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.i.d r13 = com.bytedance.sdk.openadsdk.p046i.C0835d.m4093a()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.a r13 = r13.mo2660b()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.b.b r13 = r13.mo64151c()     // Catch:{ all -> 0x00c0 }
            r13.mo64176a((java.lang.String) r11)     // Catch:{ all -> 0x00c0 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "content-type"
            java.lang.String r1 = "application/json; charset=utf-8"
            r11.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            r13.mo64181d(r11)     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.b.n$1 r11 = new com.bytedance.sdk.openadsdk.b.n$1     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            r13.mo64173a(r11)     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = 600000(0x927c0, double:2.964394E-318)
            long r0 = java.lang.Math.min(r6, r0)
            java.lang.String r11 = "load_finish"
            r10.m706a((java.lang.String) r11, (org.json.JSONObject) r12, (long) r0)
            goto L_0x00f0
        L_0x00cd:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r13 = r10.f572g     // Catch:{ Exception -> 0x00eb }
            r12.put(r5, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.f573h     // Catch:{ Exception -> 0x00eb }
            r12.put(r4, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.f574i     // Catch:{ Exception -> 0x00eb }
            r12.put(r3, r13)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r11, r13)     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            java.lang.String r11 = "load_fail"
            r10.m705a((java.lang.String) r11, (org.json.JSONObject) r12)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0150n.mo435a(android.webkit.WebView, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m707b(String str) {
        return "javascript:" + str;
    }

    /* renamed from: a */
    public void mo432a(WebView webView, int i, String str, String str2, String str3) {
        C10638l.m31235b("LandingPageLog", "onWebError: " + i + ", " + String.valueOf(str) + ", " + String.valueOf(str2));
        C0164u uVar = this.f590y;
        if (uVar != null) {
            uVar.mo480g();
        }
        if (!(str3 != null && str3.startsWith("image")) && this.f569d != 2) {
            this.f569d = 3;
        }
        this.f572g = i;
        this.f573h = str;
        this.f574i = str2;
    }

    /* renamed from: d */
    public void mo441d() {
        C10638l.m31235b("LandingPageLog", "onResume");
        if (this.f583r == 0) {
            this.f583r = System.currentTimeMillis();
        }
        this.f578m = System.currentTimeMillis();
    }

    /* renamed from: e */
    public void mo442e() {
        C10638l.m31235b("LandingPageLog", "onStop");
        if ("landingpage".equals(this.f577l) || "landingpage_endcard".equals(this.f577l) || "landingpage_split_screen".equals(this.f577l) || "landingpage_direct".equals(this.f577l)) {
            if (!(this.f569d == 2)) {
                return;
            }
            if (this.f580o > 0 || !mo440c()) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f579n = currentTimeMillis;
                long max = currentTimeMillis - Math.max(this.f578m, this.f580o);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f569d);
                    jSONObject.put("max_scroll_percent", this.f586u.get());
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                m706a("stay_page", jSONObject, Math.min(max, TTAdConstant.AD_MAX_EVENT_TIME));
            }
        }
    }

    /* renamed from: a */
    public void mo436a(SSWebView sSWebView) {
        int I;
        Bitmap a;
        C0477n nVar;
        if (("landingpage".equals(this.f577l) || "landingpage_endcard".equals(this.f577l) || "landingpage_split_screen".equals(this.f577l) || "landingpage_direct".equals(this.f577l)) && (I = C0558m.m2673h().mo1671I()) != 0 && new Random().nextInt(100) + 1 <= I && sSWebView != null && sSWebView.getWebView() != null && sSWebView.getVisibility() == 0 && (a = C1002v.m4710a(sSWebView)) != null && (nVar = this.f576k) != null) {
            C1002v.m4726a(nVar, this.f577l, "landing_page_blank", a, sSWebView.getUrl(), this.f568c);
        }
    }

    /* renamed from: f */
    public void mo443f() {
        C10638l.m31235b("LandingPageLog", "onDestroy");
        this.f587v = null;
        if (this.f571f.compareAndSet(false, true)) {
            C0136e.m594a(this.f575j, this.f576k, this.f577l, System.currentTimeMillis() - this.f583r);
        }
    }

    /* renamed from: a */
    public void mo433a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || TextUtils.isEmpty(webResourceRequest.getUrl().toString())) {
        }
    }

    /* renamed from: a */
    private void m705a(String str, JSONObject jSONObject) {
        m706a(str, jSONObject, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:9|10|11|(1:13)(1:14)|15|(1:17)(1:18)|19|20|21|22|(3:23|24|(1:26))|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ JSONException -> 0x0052 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m706a(java.lang.String r7, org.json.JSONObject r8, long r9) {
        /*
            r6 = this;
            boolean r0 = r6.f588w
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r6.f576k
            if (r0 == 0) goto L_0x0090
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0011
            goto L_0x0090
        L_0x0011:
            r0 = 0
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = "is_playable"
            com.bytedance.sdk.openadsdk.core.e.n r2 = r6.f576k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2190a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r2)     // Catch:{ JSONException -> 0x0039 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r1 = "usecache"
            com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.p033b.C0642a.m3091a()     // Catch:{ JSONException -> 0x0039 }
            com.bytedance.sdk.openadsdk.core.e.n r5 = r6.f576k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = r2.mo2123a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r5)     // Catch:{ JSONException -> 0x0039 }
            if (r2 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0039 }
        L_0x0039:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r1.<init>()     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r0 = "ad_extra_data"
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x0052 }
            r1.put(r0, r8)     // Catch:{ JSONException -> 0x0052 }
            r2 = 0
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0052
            java.lang.String r8 = "duration"
            r1.put(r8, r9)     // Catch:{ JSONException -> 0x0052 }
        L_0x0052:
            r0 = r1
        L_0x0053:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sendEvent: "
            r8.append(r9)
            java.lang.String r9 = r6.f577l
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            r8.append(r9)
            java.lang.String r9 = ", ext="
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "LandingPageLog"
            com.bytedance.sdk.component.utils.C10638l.m31235b((java.lang.String) r9, (java.lang.String) r8)
            android.content.Context r8 = r6.f575j
            com.bytedance.sdk.openadsdk.core.e.n r9 = r6.f576k
            java.lang.String r10 = r6.f577l
            com.bytedance.sdk.openadsdk.p000b.C0136e.m626c((android.content.Context) r8, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r9, (java.lang.String) r10, (java.lang.String) r7, (org.json.JSONObject) r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p000b.C0150n.m706a(java.lang.String, org.json.JSONObject, long):void");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.n$a */
    /* compiled from: LandingPageLog */
    private class C0153a {
        private C0153a() {
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i = 100;
                } else if (intValue >= 0) {
                    i = intValue;
                }
            } catch (Throwable unused) {
            }
            C0150n.this.f586u.set(i);
        }

        @JavascriptInterface
        public String getUrl() {
            return C0150n.this.f589x;
        }
    }
}
