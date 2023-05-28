package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.sdk.component.adexpress.C10261a;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10279b;
import com.bytedance.sdk.component.adexpress.p298b.C10289f;
import com.bytedance.sdk.component.adexpress.p298b.C10294j;
import com.bytedance.sdk.component.adexpress.p298b.C10296l;
import com.bytedance.sdk.component.adexpress.p300d.C10308a;
import com.bytedance.sdk.component.adexpress.p300d.C10310b;
import com.bytedance.sdk.component.adexpress.p300d.C10313e;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p000b.C0164u;
import com.bytedance.sdk.openadsdk.utils.C0953a;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0994s;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.o */
/* compiled from: WebViewRender */
public class C0604o extends C10308a {

    /* renamed from: e */
    C0953a f2253e;

    /* renamed from: f */
    private Context f2254f;

    /* renamed from: g */
    private String f2255g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0477n f2256h;

    /* renamed from: i */
    private JSONObject f2257i;

    /* renamed from: j */
    private C0164u f2258j;

    /* renamed from: k */
    private String f2259k;

    /* renamed from: l */
    private C0150n f2260l;

    /* renamed from: m */
    private final Map<String, C1008c> f2261m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private C0709w f2262n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10289f f2263o;

    /* renamed from: p */
    private C0477n.C0478a f2264p;

    /* renamed from: q */
    private final Runnable f2265q = new Runnable() {
        public void run() {
            if (!C0604o.this.f25488d.get()) {
                if (!(C0604o.this.f2256h == null || C0604o.this.f2256h.mo1327G() == null)) {
                    C0604o oVar = C0604o.this;
                    C10279b unused = oVar.f25487c = C10266a.m29497c(oVar.f2256h.mo1327G().mo1485b());
                }
                C0547k.m2622d().post(C0604o.this.f2266r);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f2266r = new Runnable() {
        public void run() {
            if (!C0604o.this.f25488d.get() && C0604o.this.f2263o != null) {
                C0604o oVar = C0604o.this;
                C0604o.super.mo1937a(oVar.f2263o);
            }
        }
    };

    /* renamed from: s */
    private int f2267s = 8;

    public C0604o(Context context, C10296l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, C0164u uVar, C0477n nVar) {
        super(context, lVar, themeStatusBroadcastReceiver);
        if (this.f25485a != null && this.f25485a.getWebView() != null) {
            this.f2254f = context;
            this.f2255g = lVar.mo63176b();
            this.f2256h = nVar;
            this.f2258j = uVar;
            this.f2257i = lVar.mo63175a();
            String e = C10266a.m29500e();
            this.f2259k = e;
            mo63238a(C0994s.m4605b(e));
            themeStatusBroadcastReceiver.mo63708a(this);
            mo2003n();
            mo2002m();
            mo2004o();
        }
    }

    /* renamed from: m */
    public void mo2002m() {
        if (this.f25485a != null && this.f25485a.getWebView() != null) {
            C0709w wVar = new C0709w(this.f2254f);
            this.f2262n = wVar;
            wVar.mo2365b(this.f25485a).mo2345a(this.f2256h).mo2378d(this.f2256h.mo1345Y()).mo2383e(this.f2256h.mo1382ac()).mo2364b(C0996u.m4610a(this.f2255g)).mo2385f(C0996u.m4673i(this.f2256h)).mo2341a((C10294j) this).mo2355a(this.f2257i).mo2342a(this.f25485a).mo2343a(this.f2258j);
        }
    }

    /* renamed from: n */
    public void mo2003n() {
        C0477n nVar = this.f2256h;
        if (nVar != null && nVar.mo1327G() != null) {
            this.f2264p = this.f2256h.mo1327G();
        }
    }

    /* renamed from: o */
    public void mo2004o() {
        if (this.f25485a != null && this.f25485a.getWebView() != null) {
            this.f25485a.setBackgroundColor(0);
            this.f25485a.setBackgroundResource(17170445);
            m2906a(this.f25485a);
            if (mo1993a() != null) {
                this.f2260l = new C0150n(this.f2254f, this.f2256h, mo1993a().getWebView()).mo428a(false);
            }
            this.f2260l.mo437a(this.f2258j);
            this.f25485a.setWebViewClient(new C0592g(this.f2254f, this.f2262n, this.f2256h, this.f2260l));
            this.f25485a.setWebChromeClient(new C0729c(this.f2262n, this.f2260l));
            if (Build.VERSION.SDK_INT >= 17) {
                C10313e.m29785a().mo63263a(this.f25485a, (C10310b) this.f2262n);
            }
        }
    }

    /* renamed from: a */
    public void mo1937a(C10289f fVar) {
        this.f2263o = fVar;
        C10615e.m31156a().execute(this.f2265q);
    }

    /* renamed from: a */
    private void m2906a(SSWebView sSWebView) {
        if (sSWebView != null) {
            try {
                C0728b.m3733a(this.f2254f).mo2470a(false).mo2471a(sSWebView.getWebView());
                sSWebView.setVerticalScrollBarEnabled(false);
                sSWebView.setHorizontalScrollBarEnabled(false);
                sSWebView.mo64301a(true);
                sSWebView.mo64322j();
                sSWebView.setUserAgentString(C0981i.m4546a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setAllowFileAccess(false);
                sSWebView.setSupportZoom(true);
                sSWebView.setBuiltInZoomControls(true);
                sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                sSWebView.setUseWideViewPort(true);
            } catch (Exception e) {
                C10638l.m31242e("WebViewRender", e.toString());
            }
        }
    }

    /* renamed from: a */
    public SSWebView mo1993a() {
        return this.f25485a;
    }

    /* renamed from: d */
    public void mo1996d() {
        if (!this.f25488d.get()) {
            C0709w wVar = this.f2262n;
            if (wVar != null) {
                wVar.mo2368b();
                this.f2262n = null;
            }
            super.mo1996d();
            C0547k.m2622d().removeCallbacks(this.f2266r);
            this.f2261m.clear();
        }
    }

    /* renamed from: f */
    public void mo1997f() {
        if (mo1993a() != null) {
            try {
                mo1993a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public void mo1999j() {
        super.mo1999j();
        if (this.f2262n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expressShow", true);
                this.f2262n.mo2359a("expressShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo2000k() {
        C0953a c = C0503h.m2281d().mo1592c();
        this.f2253e = c;
        if (c != null) {
            c.mo2881a((C10261a) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo2001l() {
        super.mo2001l();
        C0953a aVar = this.f2253e;
        if (aVar != null) {
            aVar.mo2883b((C10261a) this);
        }
    }

    /* renamed from: g */
    public void mo1998g() {
        C0709w wVar = this.f2262n;
        if (wVar != null) {
            wVar.mo2359a("expressWebviewRecycle", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public void mo1994a(int i) {
        if (i != this.f2267s) {
            this.f2267s = i;
            m2909b(i == 0);
        }
    }

    /* renamed from: b */
    private void m2909b(boolean z) {
        if (this.f2262n != null && this.f25485a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z);
                this.f2262n.mo2359a("expressAdShow", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public C0709w mo2005p() {
        return this.f2262n;
    }

    /* renamed from: b */
    public void mo1995b(int i) {
        if (this.f2262n != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f2262n.mo2359a("themeChange", jSONObject);
        }
    }

    /* renamed from: b */
    public static boolean m2910b(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }
}
