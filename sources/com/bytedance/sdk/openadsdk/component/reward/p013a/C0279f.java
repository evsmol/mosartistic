package com.bytedance.sdk.openadsdk.component.reward.p013a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.p299c.C10306c;
import com.bytedance.sdk.component.p293a.C10224e;
import com.bytedance.sdk.component.p293a.C10225f;
import com.bytedance.sdk.component.p293a.C10245r;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.C0204a;
import com.bytedance.sdk.openadsdk.common.C0206c;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.p016b.C0408c;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.video.p033b.C0642a;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import com.bytedance.sdk.openadsdk.p041g.C0784a;
import com.bytedance.sdk.openadsdk.p041g.C0788e;
import com.bytedance.sdk.openadsdk.p041g.C0792h;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p048j.C0836a;
import com.bytedance.sdk.openadsdk.p048j.C0840c;
import com.bytedance.sdk.openadsdk.p048j.C0869f;
import com.bytedance.sdk.openadsdk.p048j.C0871g;
import com.bytedance.sdk.openadsdk.utils.C0959b;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0982j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f */
/* compiled from: RewardFullWebViewManager */
public class C0279f {

    /* renamed from: I */
    private static final C0869f.C0870a f924I = new C0869f.C0870a() {
        /* renamed from: a */
        public void mo202a(String str, String str2) {
            C10638l.m31235b(str, str2);
        }

        /* renamed from: a */
        public void mo203a(String str, String str2, Throwable th) {
            C10638l.m31239c(str, str2, th);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f925A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public long f926B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public SparseArray<C0408c.C0409a> f927C = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f928D = true;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public float f929E = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public float f930F = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C0206c f931G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f932H;

    /* renamed from: a */
    C0709w f933a;

    /* renamed from: b */
    C0709w f934b;

    /* renamed from: c */
    protected boolean f935c = true;

    /* renamed from: d */
    protected String f936d;

    /* renamed from: e */
    C0150n f937e;

    /* renamed from: f */
    AtomicBoolean f938f = new AtomicBoolean(true);

    /* renamed from: g */
    int f939g = 0;

    /* renamed from: h */
    String f940h = "";

    /* renamed from: i */
    protected C0164u f941i;

    /* renamed from: j */
    boolean f942j = false;

    /* renamed from: k */
    protected C0784a f943k = new C0784a() {
        /* renamed from: a */
        public int mo816a() {
            int measuredHeight = C0279f.this.f951s != null ? C0279f.this.f951s.getMeasuredHeight() : -1;
            C10638l.m31238c("TTAndroidObject", "mWebView>>>>height=" + measuredHeight);
            return measuredHeight <= 0 ? C1002v.m4744d(C0558m.m2663a()) : measuredHeight;
        }

        /* renamed from: b */
        public int mo817b() {
            int measuredWidth = C0279f.this.f951s != null ? C0279f.this.f951s.getMeasuredWidth() : -1;
            C10638l.m31238c("TTAndroidObject", "mWebView>>>>width=" + measuredWidth);
            return measuredWidth <= 0 ? C1002v.m4740c(C0558m.m2663a()) : measuredWidth;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Activity f944l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C0477n f945m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f946n;

    /* renamed from: o */
    private int f947o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f948p;

    /* renamed from: q */
    private int f949q;

    /* renamed from: r */
    private int f950r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SSWebView f951s;

    /* renamed from: t */
    private SSWebView f952t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f953u = false;

    /* renamed from: v */
    private boolean f954v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C0871g f955w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public View f956x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public View f957y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f958z;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.f$a */
    /* compiled from: RewardFullWebViewManager */
    public interface C0291a {
        /* renamed from: a */
        void mo103a(WebView webView, int i);

        /* renamed from: a */
        void mo104a(WebView webView, String str);

        /* renamed from: a */
        void mo105a(WebView webView, String str, Bitmap bitmap);
    }

    /* renamed from: q */
    public void mo803q() {
    }

    public C0279f(Activity activity) {
        this.f944l = activity;
    }

    /* renamed from: a */
    public void mo777a(C0477n nVar, String str, int i, boolean z) {
        if (!this.f954v) {
            this.f954v = true;
            this.f945m = nVar;
            this.f946n = str;
            this.f947o = i;
            this.f948p = z;
            mo770a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo770a() {
        C0206c cVar;
        this.f956x = this.f944l.findViewById(16908290);
        boolean d = C0464l.m1971d(this.f945m);
        this.f932H = d;
        if (!d || (cVar = this.f931G) == null) {
            Activity activity = this.f944l;
            SSWebView sSWebView = (SSWebView) activity.findViewById(C10647t.m31283e(activity, "tt_reward_browser_webview"));
            this.f951s = sSWebView;
            if (sSWebView == null || C0477n.m2008a(this.f945m)) {
                C1002v.m4716a((View) this.f951s, 8);
            } else {
                this.f951s.mo64295a();
            }
        } else {
            this.f951s = cVar.mo537d();
        }
        Activity activity2 = this.f944l;
        SSWebView sSWebView2 = (SSWebView) activity2.findViewById(C10647t.m31283e(activity2, "tt_browser_webview_loading"));
        this.f952t = sSWebView2;
        if (sSWebView2 == null || C0477n.m2008a(this.f945m)) {
            C1002v.m4716a((View) this.f952t, 8);
        } else {
            this.f952t.mo64295a();
        }
        SSWebView sSWebView3 = this.f951s;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (C0279f.this.f951s != null && C0279f.this.f951s.getViewTreeObserver() != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            C0279f.this.f951s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            C0279f.this.f951s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        int measuredWidth = C0279f.this.f951s.getMeasuredWidth();
                        int measuredHeight = C0279f.this.f951s.getMeasuredHeight();
                        if (C0279f.this.f951s.getVisibility() == 0) {
                            C0279f.this.mo773a(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.f952t;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.f952t.setTag(C0480p.m2190a(this.f945m) ? this.f946n : "landingpage_endcard");
            this.f952t.setWebViewClient(new SSWebView.C10655a());
            C0477n nVar = this.f945m;
            if (nVar != null) {
                this.f952t.setMaterialMeta(nVar.mo1372aC());
            }
        }
    }

    /* renamed from: a */
    public void mo779a(Boolean bool, String str, boolean z, C0788e eVar, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("rit_scene", str);
        }
        if (C0480p.m2190a(this.f945m)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.f941i = m1163A();
        C0709w wVar = new C0709w(this.f944l);
        this.f933a = wVar;
        int i = 7;
        C0709w a = wVar.mo2365b(this.f951s).mo2345a(this.f945m).mo2378d(this.f945m.mo1345Y()).mo2383e(this.f945m.mo1382ac()).mo2364b(bool.booleanValue() ? 7 : 5).mo2348a(this.f943k).mo2385f(C0996u.m4673i(this.f945m)).mo2342a(this.f951s);
        if (m1193z()) {
            str2 = "landingpage_endcard";
        }
        a.mo2372c(str2).mo2354a((Map<String, Object>) hashMap).mo2343a(this.f941i);
        C0709w wVar2 = new C0709w(this.f944l);
        this.f934b = wVar2;
        C0709w e = wVar2.mo2365b(this.f952t).mo2345a(this.f945m).mo2378d(this.f945m.mo1345Y()).mo2383e(this.f945m.mo1382ac());
        if (!bool.booleanValue()) {
            i = 5;
        }
        e.mo2364b(i).mo2342a(this.f952t).mo2385f(C0996u.m4673i(this.f945m)).mo2343a(this.f941i);
        if (C0480p.m2190a(this.f945m)) {
            mo778a(eVar, z);
        }
        this.f933a.mo2352a((C0792h) new C0792h() {
            /* renamed from: a */
            public void mo818a() {
                SSWebView a = C0279f.this.f951s;
                if (a == null) {
                    C10638l.m31235b("RewardFullWebViewManage", "webView has destroy when onPauseWebView");
                    return;
                }
                a.mo64323k();
                C10638l.m31235b("RewardFullWebViewManage", "js make webView onPause OK");
            }

            /* renamed from: b */
            public void mo819b() {
                SSWebView a = C0279f.this.f951s;
                if (a == null) {
                    C10638l.m31235b("RewardFullWebViewManage", "webView has destroy when onPauseWebViewTimers");
                    return;
                }
                a.mo64326n();
                C10638l.m31235b("RewardFullWebViewManage", "js make webView pauseTimers OK");
            }
        });
    }

    /* renamed from: a */
    public void mo778a(final C0788e eVar, boolean z) {
        C10245r a;
        C02909 r7;
        if (C0503h.m2281d().mo1618s()) {
            C0869f.m4153a(f924I);
        }
        C02887 r1 = new C0836a() {
            /* renamed from: a */
            public void mo211a(JSONObject jSONObject) {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.C02887.mo210a():com.bytedance.sdk.openadsdk.j.d");
            }

            /* renamed from: b */
            public void mo212b() {
                C0279f.this.f933a.mo2380d(true);
                C0788e eVar = eVar;
                if (eVar != null) {
                    eVar.mo123a();
                }
            }

            /* renamed from: c */
            public void mo214c(JSONObject jSONObject) {
                C0136e.m622b(C0558m.m2663a(), C0279f.this.f945m, C0279f.this.f946n, "playable_track", jSONObject);
            }
        };
        C02898 r72 = new C0840c() {
            /* renamed from: a */
            public void mo215a(String str, JSONObject jSONObject) {
                C0279f.this.f933a.mo2359a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.f945m.mo1345Y());
            jSONObject.put("log_extra", this.f945m.mo1382ac());
            C0871g a2 = C0871g.m4159a(C0558m.m2663a(), this.f951s.getWebView(), r72, r1).mo2707f(this.f936d).mo2704e(C0204a.m838a(C0558m.m2663a())).mo2682a(C0204a.m837a()).mo2684a(jSONObject).mo2683a("sdkEdition", C0204a.m840c()).mo2691b(C0204a.m842e()).mo2701d(C0204a.m841d()).mo2697c(false).mo2685a(z);
            this.f955w = a2;
            if (a2 == null) {
                r7 = new C10618g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C0796b.m3985a().mo2608a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
                C10615e.m31160a(r7, 5);
            }
        } catch (Throwable unused) {
            if (this.f955w == null) {
                r7 = new C10618g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            C0796b.m3985a().mo2608a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
            }
        }
        if (this.f955w != null && !TextUtils.isEmpty(C0480p.m2191b(this.f945m))) {
            this.f955w.mo2696c(C0480p.m2191b(this.f945m));
        }
        C0871g gVar = this.f955w;
        if (gVar != null) {
            Set<String> j = gVar.mo2715j();
            final WeakReference weakReference = new WeakReference(this.f955w);
            for (String next : j) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next) && (a = this.f933a.mo2338a()) != null) {
                    a.mo63072a(next, (C10224e<?, ?>) new C10224e<JSONObject, JSONObject>() {
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

    /* renamed from: a */
    public void mo773a(int i, int i2) {
        Activity activity;
        if (this.f933a != null && (activity = this.f944l) != null && !activity.isFinishing()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IabUtils.KEY_WIDTH, i);
                jSONObject.put(IabUtils.KEY_HEIGHT, i2);
                this.f933a.mo2359a("resize", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo781a(boolean z) {
        this.f935c = z;
    }

    /* renamed from: b */
    public void mo784b() {
        if (TextUtils.isEmpty(this.f936d) || !this.f936d.contains("play.google.com/store")) {
            SSWebView sSWebView = this.f951s;
            if (sSWebView != null && this.f935c) {
                C0982j.m4548a(sSWebView, this.f936d + "&is_pre_render=1");
                return;
            }
            return;
        }
        this.f942j = true;
    }

    /* renamed from: b */
    public void mo785b(int i, int i2) {
        this.f949q = i;
        this.f950r = i2;
    }

    /* renamed from: c */
    public SSWebView mo787c() {
        return this.f951s;
    }

    /* renamed from: d */
    public SSWebView mo789d() {
        return this.f952t;
    }

    /* renamed from: e */
    public C0709w mo791e() {
        return this.f933a;
    }

    /* renamed from: f */
    public C0709w mo792f() {
        return this.f934b;
    }

    /* renamed from: g */
    public C0150n mo793g() {
        return this.f937e;
    }

    /* renamed from: h */
    public void mo794h() {
        this.f936d = C0480p.m2193d(this.f945m);
        float an = this.f945m.mo1393an();
        if (!TextUtils.isEmpty(this.f936d)) {
            if (this.f947o == 1) {
                if (this.f936d.contains("?")) {
                    this.f936d += "&orientation=portrait";
                } else {
                    this.f936d += "?orientation=portrait";
                }
            }
            if (this.f936d.contains("?")) {
                this.f936d += "&height=" + this.f950r + "&width=" + this.f949q + "&aspect_ratio=" + an;
            } else {
                this.f936d += "?height=" + this.f950r + "&width=" + this.f949q + "&aspect_ratio=" + an;
            }
        }
        if (!C0480p.m2190a(this.f945m)) {
            this.f936d = C0959b.m4465a(this.f936d);
        }
    }

    /* renamed from: i */
    public void mo795i() {
        SSWebView sSWebView;
        C0150n nVar = this.f937e;
        if (!(nVar == null || (sSWebView = this.f951s) == null)) {
            nVar.mo436a(sSWebView);
        }
        this.f951s = null;
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo466a(true);
            this.f941i.mo486m();
        }
        C0709w wVar = this.f933a;
        if (wVar != null) {
            wVar.mo2398n();
        }
        C0150n nVar2 = this.f937e;
        if (nVar2 != null) {
            nVar2.mo443f();
        }
        C0871g gVar = this.f955w;
        if (gVar != null) {
            gVar.mo2727v();
        }
        this.f944l = null;
    }

    /* renamed from: a */
    public void mo772a(int i) {
        C0477n nVar;
        C1002v.m4716a((View) this.f951s, i);
        SSWebView sSWebView = this.f951s;
        if (sSWebView != null) {
            C1002v.m4716a((View) sSWebView.getWebView(), i);
        }
        if (this.f951s != null && (nVar = this.f945m) != null) {
            if (nVar.mo1325E() || C0480p.m2190a(this.f945m)) {
                this.f951s.setLandingPage(true);
                this.f951s.setTag(C0480p.m2190a(this.f945m) ? this.f946n : "landingpage_endcard");
                C0477n nVar2 = this.f945m;
                if (nVar2 != null) {
                    this.f951s.setMaterialMeta(nVar2.mo1372aC());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo776a(C0206c cVar) {
        this.f931G = cVar;
    }

    /* renamed from: a */
    public void mo771a(float f) {
        C1002v.m4715a((View) this.f951s, f);
    }

    /* renamed from: b */
    public void mo786b(boolean z) {
        Activity activity;
        if (this.f933a != null && (activity = this.f944l) != null && !activity.isFinishing()) {
            try {
                this.f933a.mo2367b(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo780a(String str, final C0291a aVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.f951s;
        if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
            C0150n a = new C0150n(this.f944l, this.f945m, this.f951s.getWebView()).mo428a(true);
            this.f937e = a;
            a.mo428a(true);
            C0150n nVar = this.f937e;
            if (m1193z()) {
                str = "landingpage_endcard";
            }
            nVar.mo438a(str);
            final C0291a aVar2 = aVar;
            this.f951s.setWebViewClient(new C0730d(C0558m.m2663a(), this.f933a, this.f945m.mo1345Y(), this.f937e, this.f945m.mo1325E() || C0480p.m2190a(this.f945m)) {
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    if (!C0480p.m2190a(C0279f.this.f945m)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse a = C0642a.m3091a().mo2121a(C0279f.this.f945m.mo1330J().mo62926k(), C0279f.this.f945m.mo1330J().mo62925j(), str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (C0279f.this.f941i != null) {
                        C10306c.C10307a a2 = C10306c.m29755a(str);
                        int i = a != null ? 1 : 2;
                        if (a2 == C10306c.C10307a.HTML) {
                            C0279f.this.f941i.mo464a(str, currentTimeMillis, currentTimeMillis2, i);
                        } else if (a2 == C10306c.C10307a.JS) {
                            C0279f.this.f941i.mo471b(str, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    return a;
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        C10638l.m31239c("RewardFullWebViewManage", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    Log.i("RewardFullWebViewManage", "onReceivedError: description=" + str + "  url =" + str2);
                    if (!C0279f.this.m1171a(str2)) {
                        C0279f.this.f938f.set(false);
                        C0279f.this.f939g = i;
                        C0279f.this.f940h = str;
                        try {
                            if (C0279f.this.f955w != null) {
                                C0279f.this.f955w.mo2687a(i, str, str2);
                            }
                        } catch (Throwable unused) {
                        }
                        if (C0279f.this.f941i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23) {
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                }
                                C0279f.this.f941i.mo465a(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        super.onReceivedError(webView, i, str, str2);
                    }
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (!(webResourceError == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedError WebResourceError : description=" + webResourceError.getDescription() + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !C0279f.this.m1171a(webResourceRequest.getUrl().toString())) {
                        C0279f.this.f938f.set(false);
                        if (C0279f.this.f941i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                C0279f.this.f941i.mo465a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            C0279f.this.f939g = webResourceError.getErrorCode();
                            C0279f.this.f940h = String.valueOf(webResourceError.getDescription());
                        }
                        if (webResourceRequest != null) {
                            super.onReceivedError(webView, webResourceRequest, webResourceError);
                        }
                    }
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    try {
                        if (C0279f.this.f955w != null) {
                            C0279f.this.f955w.mo2690a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        }
                    } catch (Throwable unused) {
                    }
                    if (!(webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && !TextUtils.isEmpty(C0279f.this.f936d) && C0279f.this.f936d.equals(String.valueOf(webResourceRequest.getUrl()))) {
                        C0279f.this.f938f.set(false);
                        if (webResourceResponse != null) {
                            C0279f.this.f939g = webResourceResponse.getStatusCode();
                            C0279f.this.f940h = "onReceivedHttpError";
                        }
                    }
                    if (C0279f.this.f941i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            C0279f.this.f941i.mo465a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (C0279f.this.f941i != null) {
                        C0279f.this.f941i.mo479f();
                    }
                    if (C0279f.this.f955w != null) {
                        C0279f.this.f955w.mo2711h(str);
                    }
                    C0291a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo104a(webView, str);
                    }
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C0279f.this.f941i != null) {
                        C0279f.this.f941i.mo477e();
                    }
                    if (C0279f.this.f955w != null) {
                        C0279f.this.f955w.mo2710g(str);
                    }
                    C0291a aVar = aVar2;
                    if (aVar != null) {
                        aVar.mo105a(webView, str, bitmap);
                    }
                }
            });
            if (!(!this.f945m.mo1325E() || (sSWebView = this.f951s) == null || sSWebView.getWebView() == null)) {
                this.f951s.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|34|(1:38)|39|40) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0152 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
                        /*
                            r19 = this;
                            r1 = r19
                            java.lang.String r0 = "tt_id_click_end"
                            java.lang.String r2 = "tt_id_click_begin"
                            r3 = 0
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            r5 = 0
                            r7 = 3
                            r8 = -1
                            r9 = 2
                            r10 = 1
                            if (r4 == 0) goto L_0x00e9
                            if (r4 == r10) goto L_0x00e7
                            if (r4 == r9) goto L_0x0020
                            if (r4 == r7) goto L_0x001c
                            r12 = -1
                            goto L_0x015f
                        L_0x001c:
                            r7 = 4
                            r12 = 4
                            goto L_0x015f
                        L_0x0020:
                            float r2 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float r4 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f958z     // Catch:{ all -> 0x0360 }
                            float r2 = r2 - r7
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 >= 0) goto L_0x004d
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f925A     // Catch:{ all -> 0x0360 }
                            float r2 = r4 - r2
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.C0558m.f2080a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 < 0) goto L_0x0052
                        L_0x004d:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r2.f928D = r3     // Catch:{ all -> 0x0360 }
                        L_0x0052:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f929E     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getX()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f958z     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f929E = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f930F     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.f925A     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.f930F = r7     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            long r13 = r2.f926B     // Catch:{ all -> 0x0360 }
                            long r11 = r11 - r13
                            r13 = 200(0xc8, double:9.9E-322)
                            r2 = 1090519040(0x41000000, float:8.0)
                            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00b1
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f929E     // Catch:{ all -> 0x0360 }
                            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                            if (r7 > 0) goto L_0x00af
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f930F     // Catch:{ all -> 0x0360 }
                            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00b1
                        L_0x00af:
                            r7 = 1
                            goto L_0x00b2
                        L_0x00b1:
                            r7 = 2
                        L_0x00b2:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean r11 = r11.f932H     // Catch:{ all -> 0x0360 }
                            if (r11 == 0) goto L_0x00e5
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r11 = r11.f925A     // Catch:{ all -> 0x0360 }
                            float r11 = r4 - r11
                            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                            if (r2 <= 0) goto L_0x00cf
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r2 = r2.f931G     // Catch:{ all -> 0x0360 }
                            r2.mo533a()     // Catch:{ all -> 0x0360 }
                        L_0x00cf:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.f925A     // Catch:{ all -> 0x0360 }
                            float r4 = r4 - r2
                            r2 = -1056964608(0xffffffffc1000000, float:-8.0)
                            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                            if (r2 >= 0) goto L_0x00e5
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r2 = r2.f931G     // Catch:{ all -> 0x0360 }
                            r2.mo535b()     // Catch:{ all -> 0x0360 }
                        L_0x00e5:
                            r12 = r7
                            goto L_0x015f
                        L_0x00e7:
                            r12 = 3
                            goto L_0x015f
                        L_0x00e9:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r7 = new android.util.SparseArray     // Catch:{ all -> 0x0360 }
                            r7.<init>()     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray unused = r4.f927C = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f958z = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            float unused = r4.f925A = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            long unused = r4.f926B = r11     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f951s     // Catch:{ Exception -> 0x0152 }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x0152 }
                            int r7 = com.bytedance.sdk.component.utils.C10647t.m31283e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Object r4 = r4.getTag(r7)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0152 }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x0152 }
                            long r13 = r4.f926B     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r4 >= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x0152 }
                            long unused = r4.f926B = r11     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f951s     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x0152 }
                            int r2 = com.bytedance.sdk.component.utils.C10647t.m31283e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0152 }
                            r4.setTag(r2, r7)     // Catch:{ Exception -> 0x0152 }
                        L_0x0152:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                            float unused = r2.f929E = r4     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float unused = r2.f930F = r4     // Catch:{ all -> 0x0360 }
                            r12 = 0
                        L_0x015f:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r2 = r2.f927C     // Catch:{ all -> 0x0360 }
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.b.c$a r7 = new com.bytedance.sdk.openadsdk.core.b.c$a     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getSize()     // Catch:{ all -> 0x0360 }
                            double r13 = (double) r11     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getPressure()     // Catch:{ all -> 0x0360 }
                            double r8 = (double) r11     // Catch:{ all -> 0x0360 }
                            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            r11 = r7
                            r15 = r8
                            r11.<init>(r12, r13, r15, r17)     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            int r2 = r21.getAction()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            int r2 = r20.getVisibility()     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            float r2 = r20.getAlpha()     // Catch:{ all -> 0x0360 }
                            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0360 }
                            int r2 = r2.intValue()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean r2 = r2.f953u     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0360 }
                            r2.<init>()     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_x"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f958z     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_y"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.f925A     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_time"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            long r7 = r7.f926B     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_x"
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_y"
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x021e }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f951s     // Catch:{ Exception -> 0x021e }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x021e }
                            android.content.Context r9 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x021e }
                            int r9 = com.bytedance.sdk.component.utils.C10647t.m31283e(r9, r0)     // Catch:{ Exception -> 0x021e }
                            java.lang.Object r4 = r4.getTag(r9)     // Catch:{ Exception -> 0x021e }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x021e }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x021e }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x021e
                            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x021e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ Exception -> 0x021d }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.f951s     // Catch:{ Exception -> 0x021d }
                            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ Exception -> 0x021d }
                            int r0 = com.bytedance.sdk.component.utils.C10647t.m31283e(r5, r0)     // Catch:{ Exception -> 0x021d }
                            r5 = -1
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x021d }
                            r4.setTag(r0, r5)     // Catch:{ Exception -> 0x021d }
                        L_0x021d:
                            r7 = r11
                        L_0x021e:
                            java.lang.String r0 = "up_time"
                            r2.put(r0, r7)     // Catch:{ all -> 0x0360 }
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f932H     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x0248
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f944l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_title_bar_feedback"
                            int r6 = com.bytedance.sdk.component.utils.C10647t.m31283e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f957y = r5     // Catch:{ all -> 0x0360 }
                            goto L_0x0261
                        L_0x0248:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.f944l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C0558m.m2663a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_top_dislike"
                            int r6 = com.bytedance.sdk.component.utils.C10647t.m31283e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.f957y = r5     // Catch:{ all -> 0x0360 }
                        L_0x0261:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f957y     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x029e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f957y     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f957y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f957y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x029e:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f956x     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x02de
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.f956x     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f956x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.f956x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x02de:
                            java.lang.String r0 = "toolType"
                            r4 = r21
                            int r5 = r4.getToolType(r3)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "deviceId"
                            int r5 = r21.getDeviceId()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "source"
                            int r4 = r21.getSource()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ft"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r4 = r4.f927C     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.h r5 = com.bytedance.sdk.openadsdk.core.C0503h.m2281d()     // Catch:{ all -> 0x0360 }
                            boolean r5 = r5.mo1591b()     // Catch:{ all -> 0x0360 }
                            if (r5 == 0) goto L_0x030f
                            r5 = 1
                            goto L_0x0310
                        L_0x030f:
                            r5 = 2
                        L_0x0310:
                            org.json.JSONObject r4 = com.bytedance.sdk.openadsdk.core.p021e.C0455g.m1867a(r4, r5)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "user_behavior_type"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean r4 = r4.f928D     // Catch:{ all -> 0x0360 }
                            if (r4 == 0) goto L_0x0323
                            r4 = 1
                            goto L_0x0324
                        L_0x0323:
                            r4 = 2
                        L_0x0324:
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "click_scence"
                            r4 = 2
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.f948p     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "click"
                            if (r0 == 0) goto L_0x0349
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f944l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f945m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "rewarded_video"
                            com.bytedance.sdk.openadsdk.p000b.C0136e.m600a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                            goto L_0x035a
                        L_0x0349:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.f944l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f945m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "fullscreen_interstitial_ad"
                            com.bytedance.sdk.openadsdk.p000b.C0136e.m600a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.p021e.C0477n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                        L_0x035a:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r0.f953u = r10     // Catch:{ all -> 0x0360 }
                            goto L_0x0368
                        L_0x0360:
                            r0 = move-exception
                            java.lang.String r2 = "RewardFullWebViewManage"
                            java.lang.String r4 = "TouchRecordTool onTouch error"
                            android.util.Log.e(r2, r4, r0)
                        L_0x0368:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p013a.C0279f.C02832.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
            }
            this.f951s.setWebChromeClient(new C0729c(this.f933a, this.f937e) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    C0291a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo103a(webView, i);
                    }
                }
            });
            mo775a(this.f951s);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f951s.setLayerType(1, (Paint) null);
            }
            this.f951s.setBackgroundColor(-1);
            this.f951s.setDisplayZoomControls(false);
        }
        mo784b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m1171a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        C0477n nVar = this.f945m;
        if (nVar == null || !nVar.mo1325E() || !str.endsWith(".mp4")) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m1193z() {
        String str = this.f936d;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo774a(DownloadListener downloadListener) {
        SSWebView sSWebView = this.f951s;
        if (sSWebView != null && downloadListener != null) {
            sSWebView.setDownloadListener(downloadListener);
        }
    }

    /* renamed from: j */
    public boolean mo796j() {
        return this.f938f.get();
    }

    /* renamed from: a */
    public void mo775a(SSWebView sSWebView) {
        if (sSWebView != null) {
            C0728b.m3733a((Context) this.f944l).mo2470a(false).mo2472b(false).mo2471a(sSWebView.getWebView());
            sSWebView.setUserAgentString(C0981i.m4546a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* renamed from: k */
    public void mo797k() {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo483j();
        }
        C0150n nVar = this.f937e;
        if (nVar != null) {
            nVar.mo442e();
        }
    }

    /* renamed from: l */
    public void mo798l() {
        SSWebView sSWebView = this.f951s;
        if (sSWebView != null) {
            sSWebView.mo64323k();
        }
        C0709w wVar = this.f933a;
        if (wVar != null) {
            wVar.mo2396m();
            this.f933a.mo2367b(false);
            mo788c(false);
            mo783a(true, false);
        }
        C0871g gVar = this.f955w;
        if (gVar != null) {
            gVar.mo2722q();
            this.f955w.mo2692b(false);
        }
    }

    /* renamed from: c */
    public void mo788c(boolean z) {
        try {
            if (this.f955w != null) {
                this.f955w.mo2692b(z);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            this.f933a.mo2359a("viewableChange", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo783a(boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put("endcard_show", z2);
            this.f933a.mo2359a("endcard_control_event", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo790d(boolean z) {
        Activity activity;
        if (this.f933a != null && (activity = this.f944l) != null && !activity.isFinishing()) {
            C0871g gVar = this.f955w;
            if (gVar != null) {
                gVar.mo2685a(z);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endcard_mute", z);
                this.f933a.mo2359a("volumeChange", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: m */
    public void mo799m() {
        SSWebView sSWebView = this.f951s;
        if (sSWebView != null) {
            sSWebView.mo64321i();
        }
        C0709w wVar = this.f933a;
        if (wVar != null) {
            wVar.mo2395l();
            SSWebView sSWebView2 = this.f951s;
            if (sSWebView2 != null) {
                if (sSWebView2.getVisibility() == 0) {
                    this.f933a.mo2367b(true);
                    mo788c(true);
                    mo783a(false, true);
                } else {
                    this.f933a.mo2367b(false);
                    mo788c(false);
                    mo783a(true, false);
                }
            }
        }
        C0150n nVar = this.f937e;
        if (nVar != null) {
            nVar.mo441d();
        }
        C0871g gVar = this.f955w;
        if (gVar != null) {
            gVar.mo2723r();
            if (C1002v.m4747d((View) this.f951s)) {
                this.f955w.mo2692b(true);
            }
        }
    }

    /* renamed from: n */
    public int mo800n() {
        return this.f939g;
    }

    /* renamed from: o */
    public String mo801o() {
        return this.f940h;
    }

    /* renamed from: p */
    public String mo802p() {
        return this.f936d;
    }

    /* renamed from: r */
    public void mo804r() {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo482i();
        }
    }

    /* renamed from: a */
    public void mo782a(boolean z, int i, String str) {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            if (z) {
                uVar.mo467b();
            } else {
                uVar.mo462a(i, str);
            }
        }
    }

    /* renamed from: s */
    public void mo805s() {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo481h();
        }
    }

    /* renamed from: t */
    public void mo806t() {
        C0150n nVar = this.f937e;
        if (nVar != null) {
            nVar.mo430a(System.currentTimeMillis());
        }
    }

    /* renamed from: u */
    public boolean mo807u() {
        return this.f942j;
    }

    /* renamed from: v */
    public void mo808v() {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo473c();
            this.f941i.mo475d();
        }
    }

    /* renamed from: w */
    public void mo809w() {
        C0164u uVar = this.f941i;
        if (uVar != null) {
            uVar.mo484k();
        }
    }

    /* renamed from: A */
    private C0164u m1163A() {
        return new C0164u(C0480p.m2190a(this.f945m) ? 3 : 2, this.f948p ? "rewarded_video" : "fullscreen_interstitial_ad", this.f945m);
    }

    /* renamed from: x */
    public boolean mo810x() {
        C0709w wVar = this.f933a;
        if (wVar == null) {
            return false;
        }
        return wVar.mo2393j();
    }

    /* renamed from: y */
    public boolean mo811y() {
        SSWebView sSWebView = this.f951s;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return true;
        }
        return false;
    }
}
