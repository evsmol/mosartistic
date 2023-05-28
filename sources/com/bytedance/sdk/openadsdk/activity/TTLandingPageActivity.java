package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C0207d;
import com.bytedance.sdk.openadsdk.common.C0217f;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.C0749z;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p038e.C0773d;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0982j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTLandingPageActivity extends Activity implements C0773d {

    /* renamed from: b */
    private static final String f157b = TTLandingPageActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f158A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C0217f f159B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C0207d f160C;

    /* renamed from: D */
    private String f161D = "ダウンロード";

    /* renamed from: a */
    C0150n f162a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SSWebView f163c;

    /* renamed from: d */
    private ImageView f164d;

    /* renamed from: e */
    private ImageView f165e;

    /* renamed from: f */
    private TextView f166f;

    /* renamed from: g */
    private Context f167g;

    /* renamed from: h */
    private int f168h;

    /* renamed from: i */
    private ViewStub f169i;

    /* renamed from: j */
    private ViewStub f170j;

    /* renamed from: k */
    private ViewStub f171k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Button f172l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressBar f173m;

    /* renamed from: n */
    private String f174n;

    /* renamed from: o */
    private String f175o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C0709w f176p;

    /* renamed from: q */
    private int f177q;

    /* renamed from: r */
    private String f178r;

    /* renamed from: s */
    private C0477n f179s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C1008c f180t;

    /* renamed from: u */
    private String f181u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public AtomicBoolean f182v = new AtomicBoolean(true);

    /* renamed from: w */
    private JSONArray f183w = null;

    /* renamed from: x */
    private String f184x;

    /* renamed from: y */
    private int f185y = 0;

    /* renamed from: z */
    private int f186z = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            C0558m.m2665a(this);
        } catch (Throwable unused) {
        }
        setContentView(C10647t.m31284f(this, "tt_activity_ttlandingpage"));
        Intent intent = getIntent();
        this.f168h = intent.getIntExtra("sdk_version", 1);
        this.f174n = intent.getStringExtra("adid");
        this.f175o = intent.getStringExtra("log_extra");
        this.f177q = intent.getIntExtra("source", -1);
        String stringExtra = intent.getStringExtra("url");
        this.f181u = stringExtra;
        m231a(4);
        String stringExtra2 = intent.getStringExtra("web_title");
        intent.getStringExtra("icon_url");
        this.f178r = intent.getStringExtra("event_tag");
        this.f184x = intent.getStringExtra("gecko_id");
        if (C0934b.m4334c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.f179s = C0402b.m1636a(new JSONObject(stringExtra3));
                } catch (Exception e) {
                    C10638l.m31239c(f157b, "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                }
            }
        } else {
            this.f179s = C0625t.m3022a().mo2031c();
            C0625t.m3022a().mo2036h();
        }
        if (this.f179s == null) {
            finish();
            return;
        }
        this.f158A = C0558m.m2673h().mo1693g();
        m239c();
        this.f167g = this;
        if (this.f163c != null) {
            C0728b.m3733a((Context) this).mo2470a(false).mo2472b(false).mo2471a(this.f163c.getWebView());
        }
        SSWebView sSWebView = this.f163c;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            this.f162a = new C0150n(this, this.f179s, this.f163c.getWebView()).mo428a(true);
        }
        m241d();
        this.f163c.setLandingPage(true);
        this.f163c.setTag("landingpage");
        this.f163c.setMaterialMeta(this.f179s.mo1372aC());
        this.f163c.setWebViewClient(new C0730d(this.f167g, this.f176p, this.f174n, this.f162a, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTLandingPageActivity.this.f173m != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f173m.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }
        });
        SSWebView sSWebView2 = this.f163c;
        if (sSWebView2 != null) {
            sSWebView2.setUserAgentString(C0981i.m4546a(sSWebView2.getWebView(), this.f168h));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f163c.setMixedContentMode(0);
        }
        C0136e.m592a(this.f167g, this.f179s);
        C0982j.m4548a(this.f163c, stringExtra);
        this.f163c.setWebChromeClient(new C0729c(this.f176p, this.f162a) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTLandingPageActivity.this.f158A) {
                    if (TTLandingPageActivity.this.f159B != null) {
                        TTLandingPageActivity.this.f159B.mo554a(webView, i);
                    }
                    if (TTLandingPageActivity.this.f160C != null && i == 100) {
                        TTLandingPageActivity.this.f160C.mo540a(webView);
                    }
                } else if (TTLandingPageActivity.this.f173m != null && !TTLandingPageActivity.this.isFinishing()) {
                    if (i != 100 || !TTLandingPageActivity.this.f173m.isShown()) {
                        TTLandingPageActivity.this.f173m.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.f173m.setVisibility(8);
                    }
                }
            }
        });
        if (this.f158A) {
            this.f163c.getWebView().setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a */
                float f189a = 0.0f;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.f189a = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 2) {
                        float y = motionEvent.getY();
                        float f = this.f189a;
                        if (y - f > 8.0f) {
                            if (TTLandingPageActivity.this.f159B != null) {
                                TTLandingPageActivity.this.f159B.mo553a();
                            }
                            if (TTLandingPageActivity.this.f160C != null) {
                                TTLandingPageActivity.this.f160C.mo539a();
                            }
                            return false;
                        } else if (y - f < -8.0f) {
                            if (TTLandingPageActivity.this.f159B != null) {
                                TTLandingPageActivity.this.f159B.mo555b();
                            }
                            if (TTLandingPageActivity.this.f160C != null) {
                                TTLandingPageActivity.this.f160C.mo541b();
                            }
                        }
                    }
                    return false;
                }
            });
        }
        this.f163c.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (TTLandingPageActivity.this.f180t != null) {
                    TTLandingPageActivity.this.f180t.mo2930d();
                }
            }
        });
        TextView textView = this.f166f;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = C10647t.m31276a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra2);
        }
        m230a();
    }

    /* renamed from: a */
    private void m230a() {
        C0477n nVar = this.f179s;
        if (nVar != null && nVar.mo1332L() == 4) {
            ViewStub viewStub = this.f171k;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            Button button = (Button) findViewById(C10647t.m31283e(this, "tt_browser_download_btn"));
            this.f172l = button;
            if (button != null) {
                m233a(m235b());
                if (this.f180t == null) {
                    this.f180t = C1009d.m4776a(this, this.f179s, TextUtils.isEmpty(this.f178r) ? C0996u.m4615a(this.f177q) : this.f178r);
                }
                C0405a aVar = new C0405a(this, this.f179s, this.f178r, this.f177q);
                aVar.mo1091a(false);
                this.f172l.setOnClickListener(aVar);
                this.f172l.setOnTouchListener(aVar);
                aVar.mo1095c(true);
                aVar.mo1106a(this.f180t);
            }
        }
    }

    /* renamed from: b */
    private String m235b() {
        C0477n nVar = this.f179s;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo1343W())) {
            this.f161D = this.f179s.mo1343W();
        }
        return this.f161D;
    }

    /* renamed from: a */
    private void m233a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f172l) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTLandingPageActivity.this.f172l != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.f172l.setText(str);
                    }
                }
            });
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m230a();
    }

    /* renamed from: c */
    private void m239c() {
        ViewStub viewStub;
        this.f163c = (SSWebView) findViewById(C10647t.m31283e(this, "tt_browser_webview"));
        this.f171k = (ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_download_btn_stub"));
        this.f169i = (ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_titlebar_view_stub"));
        this.f170j = (ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_titlebar_dark_view_stub"));
        if (this.f158A) {
            ((ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_new_title_bar_view_stub"))).setVisibility(0);
            ((ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            C0217f fVar = new C0217f(this, (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_title_bar")), this.f179s);
            this.f159B = fVar;
            ImageView c = fVar.mo556c();
            this.f165e = c;
            c.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.f160C = new C0207d(this, (LinearLayout) findViewById(C10647t.m31283e(this, "tt_bottom_bar")), this.f163c, this.f179s, "landingpage");
            return;
        }
        int o = C0503h.m2281d().mo1614o();
        if (o == 0) {
            ViewStub viewStub2 = this.f169i;
            if (viewStub2 != null) {
                viewStub2.setVisibility(0);
            }
        } else if (o == 1 && (viewStub = this.f170j) != null) {
            viewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_back"));
        this.f164d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f163c == null) {
                        return;
                    }
                    if (TTLandingPageActivity.this.f163c.mo64308e()) {
                        TTLandingPageActivity.this.f163c.mo64309f();
                    } else if (TTLandingPageActivity.this.m243e()) {
                        TTLandingPageActivity.this.onBackPressed();
                    } else {
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(C10647t.m31283e(this, "tt_titlebar_close"));
        this.f165e = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f166f = (TextView) findViewById(C10647t.m31283e(this, "tt_titlebar_title"));
        ProgressBar progressBar = (ProgressBar) findViewById(C10647t.m31283e(this, "tt_browser_progress"));
        this.f173m = progressBar;
        progressBar.setVisibility(0);
    }

    /* renamed from: d */
    private void m241d() {
        C0709w wVar = new C0709w(this);
        this.f176p = wVar;
        wVar.mo2365b(this.f163c).mo2378d(this.f174n).mo2383e(this.f175o).mo2345a(this.f179s).mo2364b(this.f177q).mo2339a(this.f179s.mo1326F()).mo2385f(C0996u.m4673i(this.f179s)).mo2342a(this.f163c).mo2372c("landingpage").mo2347a((C0773d) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C0709w wVar = this.f176p;
        if (wVar != null) {
            wVar.mo2395l();
        }
        C0150n nVar = this.f162a;
        if (nVar != null) {
            nVar.mo441d();
        }
        m245f();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C0150n nVar = this.f162a;
        if (nVar != null) {
            nVar.mo442e();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C0625t.m3022a().mo2029b(true);
        C0709w wVar = this.f176p;
        if (wVar != null) {
            wVar.mo2396m();
        }
    }

    public void onBackPressed() {
        if (!m243e() || this.f182v.getAndSet(true)) {
            super.onBackPressed();
            return;
        }
        m234a(true);
        m231a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m243e() {
        return !TextUtils.isEmpty(this.f181u) && this.f181u.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m231a(int i) {
        if (this.f165e != null && m243e()) {
            C1002v.m4716a((View) this.f165e, i);
        }
    }

    /* renamed from: a */
    private void m234a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f176p.mo2359a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m245f() {
        if (this.f179s != null) {
            JSONArray b = m236b(this.f181u);
            int f = C0996u.m4657f(this.f179s);
            int e = C0996u.m4653e(this.f179s);
            C0561n<C0106a> f2 = C0558m.m2671f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C0479o oVar = new C0479o();
                oVar.f1730e = b;
                AdSlot x = this.f179s.mo1477x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo1840a(x, oVar, e, new C0561n.C0562a() {
                        /* renamed from: a */
                        public void mo186a(int i, String str) {
                            TTLandingPageActivity.this.m231a(0);
                        }

                        /* renamed from: a */
                        public void mo187a(C0448a aVar, C0449b bVar) {
                            if (aVar != null) {
                                try {
                                    TTLandingPageActivity.this.f182v.set(false);
                                    TTLandingPageActivity.this.f176p.mo2366b(new JSONObject(aVar.mo1201c()));
                                } catch (Exception unused) {
                                    TTLandingPageActivity.this.m231a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m236b(String str) {
        int i;
        JSONArray jSONArray = this.f183w;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f183w;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        SSWebView sSWebView;
        super.onDestroy();
        C0150n nVar = this.f162a;
        if (!(nVar == null || (sSWebView = this.f163c) == null)) {
            nVar.mo436a(sSWebView);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.f163c;
        if (sSWebView2 != null) {
            C0749z.m3817a(this.f167g, sSWebView2.getWebView());
            C0749z.m3818a(this.f163c.getWebView());
        }
        this.f163c = null;
        C0709w wVar = this.f176p;
        if (wVar != null) {
            wVar.mo2398n();
        }
        C0150n nVar2 = this.f162a;
        if (nVar2 != null) {
            nVar2.mo443f();
        }
    }

    /* renamed from: a */
    public void mo169a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f183w = jSONArray;
            m245f();
        }
    }
}
