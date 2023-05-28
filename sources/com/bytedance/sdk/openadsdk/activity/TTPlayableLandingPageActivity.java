package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.sdk.component.p293a.C10224e;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C0204a;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.C0749z;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p016b.C0410d;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import com.bytedance.sdk.openadsdk.p041g.C0787d;
import com.bytedance.sdk.openadsdk.p041g.C0789f;
import com.bytedance.sdk.openadsdk.p041g.C0790g;
import com.bytedance.sdk.openadsdk.p048j.C0836a;
import com.bytedance.sdk.openadsdk.p048j.C0840c;
import com.bytedance.sdk.openadsdk.p048j.C0869f;
import com.bytedance.sdk.openadsdk.p048j.C0871g;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0982j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTPlayableLandingPageActivity extends Activity implements C10652x.C10653a, C0410d, C0789f {

    /* renamed from: J */
    private static final C0869f.C0870a f198J = new C0869f.C0870a() {
        /* renamed from: a */
        public void mo202a(String str, String str2) {
            C10638l.m31235b(str, str2);
        }

        /* renamed from: a */
        public void mo203a(String str, String str2, Throwable th) {
            C10638l.m31239c(str, str2, th);
        }
    };

    /* renamed from: A */
    private C1008c f199A;

    /* renamed from: B */
    private AtomicBoolean f200B = new AtomicBoolean(false);

    /* renamed from: C */
    private String f201C;

    /* renamed from: D */
    private int f202D = 0;

    /* renamed from: E */
    private int f203E = 0;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C0871g f204F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f205G = false;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C0164u f206H;

    /* renamed from: I */
    private C0150n f207I;

    /* renamed from: a */
    TTAdDislike f208a;

    /* renamed from: b */
    protected C0790g f209b;

    /* renamed from: c */
    protected C0787d f210c = new C0787d() {
        /* renamed from: a */
        public void mo124a() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && C0480p.m2194e(TTPlayableLandingPageActivity.this.f230w) && C0480p.m2196g(TTPlayableLandingPageActivity.this.f230w)) {
                TTPlayableLandingPageActivity.this.f231x.removeMessages(2);
                TTPlayableLandingPageActivity.this.f231x.sendMessage(TTPlayableLandingPageActivity.this.m253a(1));
            }
        }

        /* renamed from: b */
        public void mo126b() {
            if (C0480p.m2194e(TTPlayableLandingPageActivity.this.f230w) && C0480p.m2195f(TTPlayableLandingPageActivity.this.f230w)) {
                TTPlayableLandingPageActivity.this.f231x.sendMessageDelayed(TTPlayableLandingPageActivity.this.m253a(0), 1000);
            }
        }

        /* renamed from: a */
        public void mo125a(int i) {
            if (C0480p.m2194e(TTPlayableLandingPageActivity.this.f230w) && TTPlayableLandingPageActivity.this.f221n != null) {
                TTPlayableLandingPageActivity.this.f221n.setProgress(i);
            }
        }
    };

    /* renamed from: d */
    private SSWebView f211d;

    /* renamed from: e */
    private SSWebView f212e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f213f = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f214g = true;

    /* renamed from: h */
    private RelativeLayout f215h;

    /* renamed from: i */
    private View f216i;

    /* renamed from: j */
    private ImageView f217j;

    /* renamed from: k */
    private Context f218k;

    /* renamed from: l */
    private int f219l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f220m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public PlayableLoadingView f221n;

    /* renamed from: o */
    private String f222o;

    /* renamed from: p */
    private String f223p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C0709w f224q;

    /* renamed from: r */
    private C0709w f225r;

    /* renamed from: s */
    private int f226s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f227t;

    /* renamed from: u */
    private String f228u;

    /* renamed from: v */
    private final String f229v = "embeded_ad";
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C0477n f230w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C10652x f231x = new C10652x(Looper.getMainLooper(), this);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f232y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f233z;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Message m253a(int i) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i;
        return obtain;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            C0558m.m2665a(this);
        } catch (Throwable unused) {
        }
        m256a(bundle);
        C0477n nVar = this.f230w;
        if (nVar != null) {
            int h = C0480p.m2197h(nVar);
            if (h != 0) {
                if (h == 1) {
                    setRequestedOrientation(1);
                } else if (h == 2) {
                    setRequestedOrientation(0);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                setRequestedOrientation(14);
            } else {
                setRequestedOrientation(1);
            }
            this.f218k = this;
            setContentView(C10647t.m31284f(this, "tt_activity_ttlandingpage_playable"));
            m275h();
            m269e();
            mo188a();
            m283l();
            m272f();
            m273g();
            C0164u uVar = this.f206H;
            if (uVar != null) {
                uVar.mo481h();
            }
            C0790g gVar = new C0790g(getApplicationContext());
            this.f209b = gVar;
            gVar.mo2564a((C0789f) this);
        }
    }

    /* renamed from: d */
    private void m266d() {
        if (this.f204F == null) {
            if (C0503h.m2281d().mo1618s()) {
                C0869f.m4153a(f198J);
            }
            C00646 r0 = new C0836a() {
                /* renamed from: a */
                public void mo211a(JSONObject jSONObject) {
                }

                /* renamed from: b */
                public void mo212b() {
                }

                /* renamed from: b */
                public void mo213b(JSONObject jSONObject) {
                }

                /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.openadsdk.p048j.C0841d mo210a() {
                    /*
                        r7 = this;
                        java.lang.String r0 = com.bytedance.sdk.openadsdk.common.C0204a.m843f()
                        int r1 = r0.hashCode()
                        r2 = 1653(0x675, float:2.316E-42)
                        r3 = 4
                        r4 = 3
                        r5 = 2
                        r6 = 1
                        if (r1 == r2) goto L_0x004a
                        r2 = 1684(0x694, float:2.36E-42)
                        if (r1 == r2) goto L_0x0040
                        r2 = 1715(0x6b3, float:2.403E-42)
                        if (r1 == r2) goto L_0x0036
                        r2 = 1746(0x6d2, float:2.447E-42)
                        if (r1 == r2) goto L_0x002c
                        r2 = 3649301(0x37af15, float:5.11376E-39)
                        if (r1 == r2) goto L_0x0022
                        goto L_0x0054
                    L_0x0022:
                        java.lang.String r1 = "wifi"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 4
                        goto L_0x0055
                    L_0x002c:
                        java.lang.String r1 = "5g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 3
                        goto L_0x0055
                    L_0x0036:
                        java.lang.String r1 = "4g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 2
                        goto L_0x0055
                    L_0x0040:
                        java.lang.String r1 = "3g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 1
                        goto L_0x0055
                    L_0x004a:
                        java.lang.String r1 = "2g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 0
                        goto L_0x0055
                    L_0x0054:
                        r0 = -1
                    L_0x0055:
                        if (r0 == 0) goto L_0x006e
                        if (r0 == r6) goto L_0x006b
                        if (r0 == r5) goto L_0x0068
                        if (r0 == r4) goto L_0x0065
                        if (r0 == r3) goto L_0x0062
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_UNKNOWN
                        return r0
                    L_0x0062:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_WIFI
                        return r0
                    L_0x0065:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_5G
                        return r0
                    L_0x0068:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_4G
                        return r0
                    L_0x006b:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_3G
                        return r0
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.p048j.C0841d.TYPE_2G
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C00646.mo210a():com.bytedance.sdk.openadsdk.j.d");
                }

                /* renamed from: c */
                public void mo214c(JSONObject jSONObject) {
                    C0136e.m622b(TTPlayableLandingPageActivity.this.getApplicationContext(), TTPlayableLandingPageActivity.this.f230w, "embeded_ad", "playable_track", jSONObject);
                }
            };
            C00657 r1 = new C0840c() {
                /* renamed from: a */
                public void mo215a(String str, JSONObject jSONObject) {
                    TTPlayableLandingPageActivity.this.f224q.mo2359a(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", this.f222o);
                jSONObject.put("log_extra", this.f223p);
                this.f204F = C0871g.m4159a(getApplicationContext(), this.f211d.getWebView(), r1, r0).mo2707f(this.f227t).mo2704e(C0204a.m838a(C0558m.m2663a())).mo2682a(C0204a.m837a()).mo2684a(jSONObject).mo2691b(C0204a.m842e()).mo2683a("sdkEdition", C0204a.m840c()).mo2701d(C0204a.m841d()).mo2697c(false).mo2685a(this.f205G).mo2692b(true);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(C0480p.m2191b(this.f230w))) {
                this.f204F.mo2696c(C0480p.m2191b(this.f230w));
            }
            Set<String> j = this.f204F.mo2715j();
            final WeakReference weakReference = new WeakReference(this.f204F);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next)) {
                    this.f224q.mo2338a().mo63072a(next, (C10224e<?, ?>) new C10224e<JSONObject, JSONObject>() {
                        /* renamed from: a */
                        public JSONObject mo216a(JSONObject jSONObject, C10225f fVar) throws Exception {
                            try {
                                C0871g gVar = (C0871g) weakReference.get();
                                if (gVar == null) {
                                    return null;
                                }
                                return gVar.mo2699c(mo63024a(), jSONObject);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: e */
    private void m269e() {
        if (this.f230w.mo1332L() == 4) {
            this.f199A = C1009d.m4776a(this.f218k, this.f230w, "interaction");
        }
    }

    /* renamed from: f */
    private void m272f() {
        int i = C0558m.m2673h().mo1711n(String.valueOf(C0996u.m4657f(this.f230w))).f1854p;
        if (i >= 0) {
            this.f231x.sendEmptyMessageDelayed(1, (long) (i * 1000));
        } else {
            C1002v.m4716a((View) this.f215h, 0);
        }
    }

    /* renamed from: a */
    private void m256a(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.f219l = intent.getIntExtra("sdk_version", 1);
            this.f222o = intent.getStringExtra("adid");
            this.f223p = intent.getStringExtra("log_extra");
            this.f226s = intent.getIntExtra("source", -1);
            this.f232y = intent.getBooleanExtra("ad_pending_download", false);
            this.f227t = intent.getStringExtra("url");
            this.f201C = intent.getStringExtra("gecko_id");
            this.f228u = intent.getStringExtra("web_title");
            if (C0934b.m4334c()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f230w = C0402b.m1636a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C10638l.m31239c("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.f230w = C0625t.m3022a().mo2031c();
                C0625t.m3022a().mo2036h();
            }
        }
        if (bundle != null) {
            try {
                this.f219l = bundle.getInt("sdk_version", 1);
                this.f222o = bundle.getString("adid");
                this.f223p = bundle.getString("log_extra");
                this.f226s = bundle.getInt("source", -1);
                this.f232y = bundle.getBoolean("ad_pending_download", false);
                this.f227t = bundle.getString("url");
                this.f228u = bundle.getString("web_title");
                String string = bundle.getString("material_meta", (String) null);
                if (!TextUtils.isEmpty(string)) {
                    this.f230w = C0402b.m1636a(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f230w == null) {
            C10638l.m31242e("TTPWPActivity", "material is null, no data to display");
            finish();
            return;
        }
        try {
            this.f205G = C0558m.m2673h().mo1678b(Integer.parseInt(this.f230w.mo1477x().getCodeId()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m273g() {
        SSWebView sSWebView = this.f211d;
        if (sSWebView != null) {
            sSWebView.setLandingPage(true);
            this.f211d.setTag("landingpage");
            this.f211d.setMaterialMeta(this.f230w.mo1372aC());
            C0150n a = new C0150n(this, this.f230w, this.f211d.getWebView()).mo428a(true);
            this.f207I = a;
            a.mo438a("embeded_ad");
            this.f207I.mo437a(this.f206H);
            this.f211d.setWebViewClient(new C0730d(this.f218k, this.f224q, this.f222o, this.f207I, true) {
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (TTPlayableLandingPageActivity.this.f204F != null) {
                        TTPlayableLandingPageActivity.this.f204F.mo2710g(str);
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
                    /*
                        r0 = this;
                        super.onPageFinished(r1, r2)
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        boolean r1 = r1.isFinishing()
                        if (r1 == 0) goto L_0x000c
                        return
                    L_0x000c:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f204F
                        if (r1 == 0) goto L_0x001d
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.f204F
                        r1.mo2711h((java.lang.String) r2)
                    L_0x001d:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0024 }
                        com.bytedance.sdk.openadsdk.g.d r1 = r1.f210c     // Catch:{ all -> 0x0024 }
                        r1.mo126b()     // Catch:{ all -> 0x0024 }
                    L_0x0024:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f220m     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0037
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.f220m     // Catch:{ all -> 0x0055 }
                        r2 = 8
                        r1.setVisibility(r2)     // Catch:{ all -> 0x0055 }
                    L_0x0037:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        boolean r1 = r1.f213f     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        r1.m278i()     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        java.lang.String r2 = "py_loading_success"
                        r1.m259a((java.lang.String) r2)     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f2819c     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f2819c     // Catch:{ all -> 0x0055 }
                        r2 = 1
                        r1.mo2367b((boolean) r2)     // Catch:{ all -> 0x0055 }
                    L_0x0055:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.C00679.onPageFinished(android.webkit.WebView, java.lang.String):void");
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    if (!(TTPlayableLandingPageActivity.this.f227t == null || webResourceRequest == null || webResourceRequest.getUrl() == null || !TTPlayableLandingPageActivity.this.f227t.equals(webResourceRequest.getUrl().toString()))) {
                        boolean unused = TTPlayableLandingPageActivity.this.f213f = false;
                    }
                    if (!(TTPlayableLandingPageActivity.this.f204F == null || webResourceRequest == null)) {
                        try {
                            TTPlayableLandingPageActivity.this.f204F.mo2690a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        } catch (Throwable unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    boolean unused = TTPlayableLandingPageActivity.this.f213f = false;
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    boolean unused = TTPlayableLandingPageActivity.this.f213f = false;
                    if (TTPlayableLandingPageActivity.this.f204F != null) {
                        TTPlayableLandingPageActivity.this.f204F.mo2687a(i, str, str2);
                    }
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TTPlayableLandingPageActivity.this.f204F != null) {
                            TTPlayableLandingPageActivity.this.f204F.mo2713i(str);
                        }
                    } catch (Exception unused) {
                    }
                    return super.shouldInterceptRequest(webView, str);
                }
            });
            m257a(this.f211d);
            m257a(this.f212e);
            m280j();
            C0982j.m4548a(this.f211d, this.f227t);
            this.f211d.setWebChromeClient(new C0729c(this.f224q, this.f207I) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (!TTPlayableLandingPageActivity.this.isFinishing()) {
                        try {
                            TTPlayableLandingPageActivity.this.f210c.mo125a(i);
                        } catch (Throwable unused) {
                        }
                        if (TTPlayableLandingPageActivity.this.f220m == null) {
                            return;
                        }
                        if (i != 100 || !TTPlayableLandingPageActivity.this.f220m.isShown()) {
                            TTPlayableLandingPageActivity.this.f220m.setProgress(i);
                            return;
                        }
                        TTPlayableLandingPageActivity.this.f220m.setVisibility(8);
                        TTPlayableLandingPageActivity.this.m278i();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f230w != null ? this.f230w.mo1397ar().toString() : null);
            bundle.putInt("sdk_version", this.f219l);
            bundle.putString("adid", this.f222o);
            bundle.putString("log_extra", this.f223p);
            bundle.putInt("source", this.f226s);
            bundle.putBoolean("ad_pending_download", this.f232y);
            bundle.putString("url", this.f227t);
            bundle.putString("web_title", this.f228u);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: h */
    private void m275h() {
        this.f221n = (PlayableLoadingView) findViewById(C10647t.m31283e(this, "tt_playable_loading"));
        this.f211d = (SSWebView) findViewById(C10647t.m31283e(this, "tt_browser_webview"));
        this.f212e = (SSWebView) findViewById(C10647t.m31283e(this, "tt_browser_webview_loading"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_playable_ad_close_layout"));
        this.f215h = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.f206H != null) {
                        TTPlayableLandingPageActivity.this.f206H.mo482i();
                    }
                    TTPlayableLandingPageActivity.this.m259a("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        this.f220m = (ProgressBar) findViewById(C10647t.m31283e(this, "tt_browser_progress"));
        View findViewById = findViewById(C10647t.m31283e(this, "tt_playable_ad_dislike"));
        this.f216i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity.this.mo190b();
            }
        });
        ImageView imageView = (ImageView) findViewById(C10647t.m31283e(this, "tt_playable_ad_mute"));
        this.f217j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                boolean unused = tTPlayableLandingPageActivity.f205G = !tTPlayableLandingPageActivity.f205G;
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity2.mo191b(tTPlayableLandingPageActivity2.f205G);
                if (TTPlayableLandingPageActivity.this.f204F != null) {
                    TTPlayableLandingPageActivity.this.f204F.mo2685a(TTPlayableLandingPageActivity.this.f205G);
                }
            }
        });
        this.f211d.setBackgroundColor(-16777216);
        this.f212e.setBackgroundColor(-16777216);
        C1002v.m4716a((View) this.f211d, 4);
        C1002v.m4716a((View) this.f212e, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo188a() {
        if (this.f221n != null) {
            C0477n nVar = this.f230w;
            if (nVar == null || C0480p.m2194e(nVar)) {
                this.f221n.mo2410b();
                if (this.f221n.getPlayView() != null) {
                    C00613 r1 = new C0405a(this, this.f230w, "embeded_ad", this.f226s) {
                        /* renamed from: a */
                        public void mo106a(View view, float f, float f2, float f3, float f4, SparseArray<C0408c.C0409a> sparseArray, boolean z) {
                            if (this.f1334d == null || this.f1334d.mo1438i() != 1 || z) {
                                super.mo106a(view, f, f2, f3, f4, sparseArray, z);
                                boolean unused = TTPlayableLandingPageActivity.this.f232y = true;
                                boolean unused2 = TTPlayableLandingPageActivity.this.f233z = true;
                                HashMap hashMap = new HashMap();
                                hashMap.put("playable_url", TTPlayableLandingPageActivity.this.f227t);
                                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                                C0136e.m629e((Context) tTPlayableLandingPageActivity, tTPlayableLandingPageActivity.f230w, this.f1335e, "click_playable_download_button_loading", (Map<String, Object>) hashMap);
                            }
                        }
                    };
                    r1.mo1106a(this.f199A);
                    this.f221n.getPlayView().setOnClickListener(r1);
                }
                if (C0480p.m2196g(this.f230w)) {
                    this.f231x.sendMessageDelayed(m253a(2), 10000);
                    return;
                }
                return;
            }
            this.f221n.mo2409a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m278i() {
        SSWebView sSWebView;
        if (!this.f200B.getAndSet(true) && (sSWebView = this.f211d) != null && this.f212e != null) {
            C1002v.m4716a((View) sSWebView, 0);
            C1002v.m4716a((View) this.f212e, 8);
        }
    }

    /* renamed from: a */
    private void m257a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C0728b.m3733a(this.f218k).mo2470a(false).mo2472b(false).mo2471a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C0981i.m4546a(sSWebView.getWebView(), this.f219l));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m259a(String str) {
        C0136e.m626c((Context) this, this.f230w, "embeded_ad", str, (JSONObject) null);
    }

    /* renamed from: j */
    private void m280j() {
        if (this.f212e != null) {
            String k = m281k();
            if (!TextUtils.isEmpty(k)) {
                this.f212e.setWebViewClient(new C0730d(this.f218k, this.f225r, this.f222o, (C0150n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        if (TTPlayableLandingPageActivity.this.f214g) {
                            TTPlayableLandingPageActivity.this.m259a("loading_h5_success");
                        }
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = TTPlayableLandingPageActivity.this.f214g = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = TTPlayableLandingPageActivity.this.f214g = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = TTPlayableLandingPageActivity.this.f214g = false;
                    }
                });
                this.f212e.mo64297a(k);
            }
        }
    }

    /* renamed from: k */
    private String m281k() {
        C0477n nVar;
        String j = C0558m.m2673h().mo1703j();
        if (TextUtils.isEmpty(j) || (nVar = this.f230w) == null || nVar.mo1380aa() == null) {
            return j;
        }
        String b = this.f230w.mo1380aa().mo1217b();
        double d = this.f230w.mo1380aa().mo1222d();
        int e = this.f230w.mo1380aa().mo1223e();
        String a = (this.f230w.mo1333M() == null || TextUtils.isEmpty(this.f230w.mo1333M().mo1281a())) ? "" : this.f230w.mo1333M().mo1281a();
        String Y = this.f230w.mo1345Y();
        String c = this.f230w.mo1380aa().mo1220c();
        String a2 = this.f230w.mo1380aa().mo1213a();
        String b2 = this.f230w.mo1380aa().mo1217b();
        StringBuffer stringBuffer = new StringBuffer(j);
        stringBuffer.append("?appname=");
        stringBuffer.append(b);
        stringBuffer.append("&stars=");
        stringBuffer.append(d);
        stringBuffer.append("&comments=");
        stringBuffer.append(e);
        stringBuffer.append("&icon=");
        stringBuffer.append(a);
        stringBuffer.append("&downloading=");
        stringBuffer.append(false);
        stringBuffer.append("&id=");
        stringBuffer.append(Y);
        stringBuffer.append("&pkg_name=");
        stringBuffer.append(c);
        stringBuffer.append("&download_url=");
        stringBuffer.append(a2);
        stringBuffer.append("&name=");
        stringBuffer.append(b2);
        return stringBuffer.toString();
    }

    /* renamed from: l */
    private void m283l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f230w);
        this.f206H = new C0164u(3, "embeded_ad", this.f230w);
        C0709w wVar = new C0709w(this);
        this.f224q = wVar;
        wVar.mo2365b(this.f211d).mo2345a(this.f230w).mo2353a((List<C0477n>) arrayList).mo2378d(this.f222o).mo2383e(this.f223p).mo2372c("embeded_ad").mo2364b(this.f226s).mo2344a((C0410d) this).mo2343a(this.f206H).mo2350a(this.f210c).mo2342a(this.f211d).mo2385f(C0996u.m4673i(this.f230w));
        C0709w wVar2 = new C0709w(this);
        this.f225r = wVar2;
        wVar2.mo2365b(this.f212e).mo2345a(this.f230w).mo2378d(this.f222o).mo2383e(this.f223p).mo2344a((C0410d) this).mo2364b(this.f226s).mo2373c(false).mo2343a(this.f206H).mo2342a(this.f212e).mo2385f(C0996u.m4673i(this.f230w));
        m266d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C0164u uVar = this.f206H;
        if (uVar != null) {
            uVar.mo484k();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C0709w wVar = this.f224q;
        if (wVar != null) {
            wVar.mo2395l();
            SSWebView sSWebView = this.f211d;
            if (sSWebView != null) {
                this.f224q.mo2367b(sSWebView.getVisibility() == 0);
            }
        }
        C0709w wVar2 = this.f225r;
        if (wVar2 != null) {
            wVar2.mo2395l();
        }
        C0871g gVar = this.f204F;
        if (gVar != null) {
            gVar.mo2723r();
            this.f204F.mo2692b(true);
        }
        C0150n nVar = this.f207I;
        if (nVar != null) {
            nVar.mo441d();
        }
        C0790g gVar2 = this.f209b;
        if (gVar2 != null) {
            gVar2.mo2564a((C0789f) this);
            this.f209b.mo2571e();
            if (this.f209b.mo2573g() == 0) {
                this.f205G = true;
            }
            mo191b(this.f205G);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C0625t.m3022a().mo2029b(true);
        C0709w wVar = this.f224q;
        if (wVar != null) {
            wVar.mo2396m();
            this.f224q.mo2367b(false);
        }
        C0709w wVar2 = this.f225r;
        if (wVar2 != null) {
            wVar2.mo2396m();
        }
        C0871g gVar = this.f204F;
        if (gVar != null) {
            gVar.mo2685a(true);
            this.f204F.mo2722q();
            this.f204F.mo2692b(false);
        }
        C0790g gVar2 = this.f209b;
        if (gVar2 != null) {
            gVar2.mo2572f();
            this.f209b.mo2564a((C0789f) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C0164u uVar = this.f206H;
        if (uVar != null) {
            uVar.mo483j();
        }
        C0150n nVar = this.f207I;
        if (nVar != null) {
            nVar.mo442e();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C0164u uVar = this.f206H;
        if (uVar != null) {
            uVar.mo482i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        C0164u uVar = this.f206H;
        if (uVar != null) {
            uVar.mo466a(true);
            this.f206H.mo486m();
        }
        C10652x xVar = this.f231x;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f211d;
        if (sSWebView != null) {
            C0749z.m3817a(this.f218k, sSWebView.getWebView());
            C0749z.m3818a(this.f211d.getWebView());
            this.f211d.mo64324l();
        }
        this.f211d = null;
        C0709w wVar = this.f224q;
        if (wVar != null) {
            wVar.mo2398n();
        }
        C0709w wVar2 = this.f225r;
        if (wVar2 != null) {
            wVar2.mo2398n();
        }
        C0871g gVar = this.f204F;
        if (gVar != null) {
            gVar.mo2727v();
        }
        C0150n nVar = this.f207I;
        if (nVar != null) {
            nVar.mo443f();
        }
        this.f209b = null;
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        int i = message.what;
        if (i == 1) {
            C1002v.m4716a((View) this.f215h, 0);
        } else if (i == 2) {
            C10638l.m31228a("playable hidden loading , type:" + message.arg1);
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            hashMap.put("playable_url", this.f227t);
            C0136e.m629e((Context) this, this.f230w, "embeded_ad", "remove_loading_page", (Map<String, Object>) hashMap);
            this.f231x.removeMessages(2);
            PlayableLoadingView playableLoadingView = this.f221n;
            if (playableLoadingView != null) {
                playableLoadingView.mo2409a();
            }
        }
    }

    /* renamed from: a */
    public void mo189a(boolean z) {
        C1008c cVar;
        this.f232y = true;
        this.f233z = z;
        if (!z) {
            try {
                Toast.makeText(this.f218k, C10647t.m31276a(C0558m.m2663a(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (this.f233z && (cVar = this.f199A) != null) {
            cVar.mo2930d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo190b() {
        if (this.f230w != null && !isFinishing()) {
            if (this.f208a == null) {
                mo192c();
            }
            this.f208a.showDislikeDialog();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo192c() {
        this.f208a = new C0759b(this, this.f230w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo191b(boolean z) {
        int i;
        try {
            this.f205G = z;
            if (z) {
                i = C10647t.m31282d(this.f218k, "tt_mute");
            } else {
                i = C10647t.m31282d(this.f218k, "tt_unmute");
            }
            this.f217j.setImageResource(i);
            if (this.f204F != null) {
                this.f204F.mo2685a(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo63b(int i) {
        mo191b(i <= 0);
    }
}
