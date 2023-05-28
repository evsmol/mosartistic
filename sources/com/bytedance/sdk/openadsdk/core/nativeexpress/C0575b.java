package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.p298b.C10286d;
import com.bytedance.sdk.component.adexpress.p298b.C10289f;
import com.bytedance.sdk.component.adexpress.p298b.C10298m;
import com.bytedance.sdk.component.adexpress.p298b.C10299n;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C0747y;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.p021e.C0455g;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.dislike.C0759b;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1007b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b */
/* compiled from: BrandBannerController */
public class C0575b {

    /* renamed from: a */
    public static final Set<String> f2176a = new HashSet<String>() {
        {
            add(".jpeg");
            add(".png");
            add(".bmp");
            add(".gif");
            add(".jpg");
            add(".webp");
        }
    };

    /* renamed from: b */
    private final Context f2177b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0579b f2178c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10299n f2179d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public NativeExpressView f2180e;

    /* renamed from: f */
    private int f2181f;

    /* renamed from: g */
    private int f2182g;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$c */
    /* compiled from: BrandBannerController */
    interface C0584c {
        /* renamed from: a */
        void mo1936a(int i, int i2);

        /* renamed from: b */
        void mo1942b(String str);

        /* renamed from: c */
        void mo1944c(String str);
    }

    public C0575b(Context context, NativeExpressView nativeExpressView, C0477n nVar) {
        this.f2177b = context;
        this.f2180e = nativeExpressView;
        m2778a(nativeExpressView);
        this.f2178c = new C0579b(context, nVar, this.f2181f, this.f2182g);
    }

    /* renamed from: a */
    private void m2778a(NativeExpressView nativeExpressView) {
        C0598k a = BannerExpressBackupView.m1712a(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() <= 0 || nativeExpressView.getExpectExpressHeight() <= 0) {
            int c = C1002v.m4740c(this.f2177b);
            this.f2181f = c;
            this.f2182g = Float.valueOf(((float) c) / a.f2239b).intValue();
        } else {
            this.f2181f = C1002v.m4749e(this.f2177b, (float) nativeExpressView.getExpectExpressWidth());
            this.f2182g = C1002v.m4749e(this.f2177b, (float) nativeExpressView.getExpectExpressHeight());
        }
        int i = this.f2181f;
        if (i > 0 && i > C1002v.m4740c(this.f2177b)) {
            float c2 = ((float) C1002v.m4740c(this.f2177b)) / ((float) this.f2181f);
            this.f2181f = C1002v.m4740c(this.f2177b);
            this.f2182g = Float.valueOf(((float) this.f2182g) * c2).intValue();
        }
    }

    /* renamed from: a */
    public void mo1924a(C10299n nVar) {
        this.f2179d = nVar;
    }

    /* renamed from: a */
    public void mo1923a() {
        C0579b bVar = this.f2178c;
        if (bVar != null) {
            bVar.mo1937a((C10289f) new C10289f() {
                /* renamed from: a */
                public void mo1930a(View view, C10298m mVar) {
                    if (C0575b.this.f2180e != null && view != null) {
                        C0575b.this.f2180e.removeView(view);
                        if (view.getParent() != null) {
                            ((ViewGroup) view.getParent()).removeView(view);
                        }
                        C0575b.this.f2180e.addView(view, new ViewGroup.LayoutParams(-1, -1));
                        if (C0575b.this.f2179d != null) {
                            C0575b.this.f2179d.mo966a(C0575b.this.f2178c, mVar);
                        }
                    } else if (C0575b.this.f2179d != null) {
                        C0575b.this.f2179d.mo1880a_(106);
                    }
                }

                /* renamed from: a */
                public void mo1929a(int i) {
                    if (C0575b.this.f2179d != null) {
                        C0575b.this.f2179d.mo1880a_(106);
                    }
                }
            });
            return;
        }
        C10299n nVar = this.f2179d;
        if (nVar != null) {
            nVar.mo1880a_(106);
        }
    }

    /* renamed from: b */
    public void mo1928b() {
        C0579b bVar = this.f2178c;
        if (bVar != null) {
            bVar.mo1935a();
            this.f2178c = null;
        }
        this.f2179d = null;
        this.f2180e = null;
    }

    /* renamed from: a */
    public void mo1925a(TTAdDislike tTAdDislike) {
        C0579b bVar = this.f2178c;
        if (bVar != null) {
            bVar.mo1938a(tTAdDislike);
        }
    }

    /* renamed from: a */
    public void mo1926a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C0579b bVar = this.f2178c;
        if (bVar != null) {
            bVar.mo1939a(tTDislikeDialogAbstract);
        }
    }

    /* renamed from: a */
    public void mo1927a(String str) {
        C0579b bVar = this.f2178c;
        if (bVar != null) {
            bVar.mo1940a(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$b */
    /* compiled from: BrandBannerController */
    public static class C0579b implements C10286d<View>, C0584c {

        /* renamed from: a */
        AtomicBoolean f2186a = new AtomicBoolean(false);

        /* renamed from: b */
        AtomicBoolean f2187b = new AtomicBoolean(false);

        /* renamed from: c */
        WeakReference<ImageView> f2188c;

        /* renamed from: d */
        private C0759b f2189d;

        /* renamed from: e */
        private TTDislikeDialogAbstract f2190e;

        /* renamed from: f */
        private String f2191f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Context f2192g;

        /* renamed from: h */
        private final int f2193h;

        /* renamed from: i */
        private final int f2194i;

        /* renamed from: j */
        private FrameLayout f2195j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C0477n f2196k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C0602n f2197l;

        /* renamed from: m */
        private int f2198m;

        /* renamed from: n */
        private SSWebView f2199n;

        /* renamed from: o */
        private C10289f f2200o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f2201p = 0;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<String> f2202q;

        /* renamed from: c */
        public int mo1943c() {
            return 5;
        }

        public C0579b(Context context, C0477n nVar, int i, int i2) {
            this.f2192g = context;
            this.f2193h = i;
            this.f2194i = i2;
            this.f2196k = nVar;
            this.f2198m = C1002v.m4749e(context, 3.0f);
            this.f2197l = new C0602n(context);
            m2796f();
        }

        /* renamed from: f */
        private void m2796f() {
            FrameLayout frameLayout = new FrameLayout(this.f2192g);
            this.f2195j = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f2193h, this.f2194i);
            }
            layoutParams.width = this.f2193h;
            layoutParams.height = this.f2194i;
            layoutParams.gravity = 17;
            this.f2195j.setLayoutParams(layoutParams);
            this.f2195j.addView(m2799i());
            this.f2195j.addView(m2797g());
            ImageView h = m2798h();
            this.f2195j.addView(h);
            this.f2188c = new WeakReference<>(h);
        }

        /* renamed from: a */
        public void mo1937a(C10289f fVar) {
            if (!this.f2186a.get()) {
                this.f2187b.set(false);
                if (this.f2192g == null) {
                    fVar.mo1929a(106);
                    return;
                }
                this.f2201p = 0;
                this.f2200o = fVar;
                this.f2199n.mo64299a((String) null, this.f2196k.mo1405az(), "text/html", "UTF-8", (String) null);
            }
        }

        /* renamed from: g */
        private View m2797g() {
            View inflate = LayoutInflater.from(this.f2192g).inflate(C10647t.m31284f(this.f2192g, "tt_backup_ad1"), (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = this.f2198m;
            layoutParams.leftMargin = this.f2198m;
            inflate.setLayoutParams(layoutParams);
            inflate.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTWebsiteActivity.m414a(C0579b.this.f2192g, C0579b.this.f2196k, "banner_ad");
                }
            });
            return inflate;
        }

        /* renamed from: h */
        private ImageView m2798h() {
            ImageView imageView = new ImageView(this.f2192g);
            imageView.setImageDrawable(this.f2192g.getResources().getDrawable(C10647t.m31282d(this.f2192g, "tt_dislike_icon2")));
            int e = C1002v.m4749e(this.f2192g, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e, e);
            layoutParams.gravity = 8388613;
            layoutParams.rightMargin = this.f2198m;
            layoutParams.topMargin = this.f2198m;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C0579b.this.mo1941b();
                }
            });
            return imageView;
        }

        /* renamed from: i */
        private SSWebView m2799i() {
            SSWebView b = C0585c.m2815a().mo1952b();
            this.f2199n = b;
            if (b == null) {
                this.f2199n = new SSWebView(this.f2192g);
            }
            C0585c.m2815a().mo1955c(this.f2199n);
            this.f2199n.setWebViewClient(new C0578a(this.f2197l, this));
            this.f2199n.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    if (!C0579b.this.f2187b.get()) {
                        super.onProgressChanged(webView, i);
                        if (C0579b.this.f2201p == 0 && i >= 75) {
                            C0579b.this.mo1945d();
                            C0579b.this.f2187b.set(true);
                        }
                        if (i == 100 && C0579b.this.f2202q != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                JSONArray jSONArray = new JSONArray();
                                for (String put : C0579b.this.f2202q) {
                                    jSONArray.put(put);
                                }
                                jSONObject.put("error_url", jSONArray);
                                C0136e.m622b(C0579b.this.f2192g, C0579b.this.f2196k, "banner_ad", "html_banner_error_url", jSONObject);
                                List unused = C0579b.this.f2202q = null;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            });
            this.f2199n.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    C0579b.this.f2197l.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.f2199n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f2199n;
        }

        /* renamed from: e */
        public View mo1946e() {
            return this.f2195j;
        }

        /* renamed from: a */
        public void mo1935a() {
            this.f2195j = null;
            this.f2189d = null;
            this.f2190e = null;
            this.f2200o = null;
            this.f2196k = null;
            this.f2197l = null;
            if (this.f2199n != null) {
                C0585c.m2815a().mo1951a(this.f2199n);
            }
            this.f2186a.set(true);
            this.f2187b.set(false);
        }

        /* renamed from: a */
        public void mo1938a(TTAdDislike tTAdDislike) {
            if (tTAdDislike instanceof C0759b) {
                this.f2189d = (C0759b) tTAdDislike;
            }
        }

        /* renamed from: a */
        public void mo1939a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            C0477n nVar;
            if (!(tTDislikeDialogAbstract == null || (nVar = this.f2196k) == null)) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
            }
            this.f2190e = tTDislikeDialogAbstract;
        }

        /* renamed from: b */
        public void mo1941b() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f2190e;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            C0759b bVar = this.f2189d;
            if (bVar != null) {
                bVar.showDislikeDialog();
            } else {
                TTDelegateActivity.m183a(this.f2196k, this.f2191f);
            }
        }

        /* renamed from: a */
        public void mo1940a(String str) {
            this.f2191f = str;
        }

        /* renamed from: b */
        public void mo1942b(String str) {
            if (!TextUtils.isEmpty(str)) {
                boolean z = false;
                if (str.contains("play.google.com/store/apps/details?id=")) {
                    z = C1007b.m4764b(this.f2192g, str.substring(str.indexOf("?id=") + 4));
                }
                if (!z) {
                    C0747y.m3812a(this.f2192g, this.f2196k, -1, (TTNativeAd) null, (TTNativeExpressAd) null, "", true, str);
                }
                if (this.f2197l != null) {
                    View view = null;
                    WeakReference<ImageView> weakReference = this.f2188c;
                    if (weakReference != null) {
                        view = (View) weakReference.get();
                    }
                    C0455g a = this.f2197l.mo1986a(this.f2192g, (View) this.f2195j.getParent(), view);
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_scence", 1);
                    C0136e.m604a(this.f2192g, Constants.CLICK, this.f2196k, a, "banner_ad", true, (Map<String, Object>) hashMap, this.f2197l.mo1988b() ? 1 : 2);
                }
                C0602n nVar = this.f2197l;
                if (nVar != null) {
                    nVar.mo1987a();
                }
            }
        }

        /* renamed from: d */
        public void mo1945d() {
            if (this.f2200o != null) {
                C10298m mVar = new C10298m();
                mVar.mo63211a(true);
                mVar.mo63207a((double) C1002v.m4745d(this.f2192g, (float) this.f2193h));
                mVar.mo63214b((double) C1002v.m4745d(this.f2192g, (float) this.f2194i));
                this.f2200o.mo1930a(this.f2195j, mVar);
            }
        }

        /* renamed from: a */
        public void mo1936a(int i, int i2) {
            this.f2201p = i2;
            C10289f fVar = this.f2200o;
            if (fVar != null) {
                fVar.mo1929a(i);
            }
            C0136e.m596a(this.f2192g, this.f2196k, "banner_ad", "render_html_fail");
        }

        /* renamed from: c */
        public void mo1944c(String str) {
            if (this.f2202q == null) {
                this.f2202q = new ArrayList();
            }
            this.f2202q.add(str);
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$a */
    /* compiled from: BrandBannerController */
    static class C0578a extends SSWebView.C10655a {

        /* renamed from: a */
        C0602n f2184a;

        /* renamed from: b */
        C0584c f2185b;

        public C0578a(C0602n nVar, C0584c cVar) {
            this.f2184a = nVar;
            this.f2185b = cVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C0584c cVar;
            C0602n nVar = this.f2184a;
            if (nVar == null || !nVar.mo1988b() || (cVar = this.f2185b) == null) {
                return false;
            }
            cVar.mo1942b(str);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r1 = r2.getUrl().toString();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceivedHttpError(android.webkit.WebView r1, android.webkit.WebResourceRequest r2, android.webkit.WebResourceResponse r3) {
            /*
                r0 = this;
                super.onReceivedHttpError(r1, r2, r3)
                if (r2 == 0) goto L_0x0040
                if (r3 == 0) goto L_0x0040
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r1 < r3) goto L_0x0040
                boolean r1 = r2.isForMainFrame()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                if (r1 == 0) goto L_0x0040
                android.net.Uri r1 = r2.getUrl()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "."
                int r2 = r1.lastIndexOf(r2)
                if (r2 <= 0) goto L_0x0040
                java.lang.String r2 = r1.substring(r2)
                java.lang.String r2 = r2.toLowerCase()
                java.util.Set<java.lang.String> r3 = com.bytedance.sdk.openadsdk.core.nativeexpress.C0575b.f2176a
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L_0x0040
                com.bytedance.sdk.openadsdk.core.nativeexpress.b$c r2 = r0.f2185b
                if (r2 == 0) goto L_0x0040
                r2.mo1944c(r1)
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.C0575b.C0578a.onReceivedHttpError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT >= 23 && webResourceRequest != null && webResourceRequest.isForMainFrame() && webResourceError != null) {
                String str = null;
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                m2789a(str, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
            }
        }

        /* renamed from: a */
        private void m2789a(String str, int i, String str2) {
            C0584c cVar = this.f2185b;
            if (cVar != null) {
                cVar.mo1936a(106, i);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                m2789a(str2, i, str);
            }
        }
    }
}
