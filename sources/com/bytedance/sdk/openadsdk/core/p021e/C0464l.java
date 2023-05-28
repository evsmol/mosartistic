package com.bytedance.sdk.openadsdk.core.p021e;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.adexpress.p299c.C10304a;
import com.bytedance.sdk.component.p313d.C10561j;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.C0709w;
import com.bytedance.sdk.openadsdk.core.C0749z;
import com.bytedance.sdk.openadsdk.core.p016b.C0405a;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.video.p034c.C0667c;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0728b;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0150n;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0981i;
import com.bytedance.sdk.openadsdk.utils.C0982j;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.l */
/* compiled from: LandingPageModel */
public class C0464l {

    /* renamed from: A */
    private LinearLayout f1589A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public View f1590B;

    /* renamed from: C */
    private ImageView f1591C;

    /* renamed from: D */
    private View f1592D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public long f1593E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public AtomicBoolean f1594F = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Activity f1595G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f1596H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C1008c f1597I;

    /* renamed from: J */
    private C0150n f1598J;

    /* renamed from: K */
    private AtomicBoolean f1599K = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f1600L = false;

    /* renamed from: a */
    ImageView f1601a;

    /* renamed from: b */
    FrameLayout f1602b;

    /* renamed from: c */
    TextView f1603c;

    /* renamed from: d */
    FrameLayout f1604d;

    /* renamed from: e */
    TextView f1605e;

    /* renamed from: f */
    RelativeLayout f1606f;

    /* renamed from: g */
    C0477n f1607g;

    /* renamed from: h */
    FrameLayout f1608h;

    /* renamed from: i */
    ObjectAnimator f1609i;

    /* renamed from: j */
    ObjectAnimator f1610j;

    /* renamed from: k */
    ObjectAnimator f1611k;

    /* renamed from: l */
    ObjectAnimator f1612l;

    /* renamed from: m */
    ObjectAnimator f1613m;

    /* renamed from: n */
    C10192c.C10193a f1614n;

    /* renamed from: o */
    C0405a f1615o;

    /* renamed from: p */
    C0406b f1616p;

    /* renamed from: q */
    private View f1617q;

    /* renamed from: r */
    private View f1618r;

    /* renamed from: s */
    private TextView f1619s;

    /* renamed from: t */
    private TextView f1620t;

    /* renamed from: u */
    private TTRoundRectImageView f1621u;

    /* renamed from: v */
    private TextView f1622v;

    /* renamed from: w */
    private C0709w f1623w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public SSWebView f1624x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public FrameLayout f1625y;

    /* renamed from: z */
    private AnimatorSet f1626z;

    public C0464l(Activity activity, C0477n nVar, String str, FrameLayout frameLayout) {
        this.f1595G = activity;
        this.f1607g = nVar;
        this.f1596H = str;
        if (m1967b(nVar)) {
            this.f1596H = "landingpage_split_screen";
        } else if (m1969c(nVar)) {
            this.f1596H = "landingpage_direct";
        }
        this.f1615o = new C0405a(C0558m.m2663a(), this.f1607g, this.f1596H, C0996u.m4610a(str));
        this.f1616p = new C0406b(C0558m.m2663a(), this.f1607g, this.f1596H, C0996u.m4610a(str), true);
        this.f1608h = frameLayout;
        try {
            if (m1969c(this.f1607g)) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "timeDown", new int[]{0, (int) (this.f1607g.mo1347a().mo1315b() * 1000)});
                this.f1611k = ofInt;
                ofInt.setDuration(this.f1607g.mo1347a().mo1315b() * 1000);
                this.f1611k.setInterpolator(new LinearInterpolator());
                this.f1611k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (C0464l.this.f1614n != null && C0464l.this.f1607g.mo1347a() != null) {
                            C0464l.this.f1614n.mo34a(((Integer) valueAnimator.getAnimatedValue()).longValue(), C0464l.this.f1607g.mo1347a().mo1315b() * 1000);
                        }
                    }
                });
                this.f1611k.start();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo1295a(C10192c.C10193a aVar) {
        this.f1614n = aVar;
    }

    /* renamed from: a */
    public void mo1293a() {
        Activity activity = this.f1595G;
        SSWebView sSWebView = (SSWebView) activity.findViewById(C10647t.m31283e(activity, "tt_reward_browser_webview_loading"));
        this.f1624x = sSWebView;
        if (sSWebView == null || C0477n.m2008a(this.f1607g)) {
            C1002v.m4716a((View) this.f1624x, 8);
        } else {
            this.f1624x.mo64295a();
        }
        Activity activity2 = this.f1595G;
        this.f1625y = (FrameLayout) activity2.findViewById(C10647t.m31283e(activity2, "tt_reward_loading_container"));
        Activity activity3 = this.f1595G;
        this.f1589A = (LinearLayout) activity3.findViewById(C10647t.m31283e(activity3, "wave_container"));
        Activity activity4 = this.f1595G;
        this.f1590B = activity4.findViewById(C10647t.m31283e(activity4, "tt_up_slide"));
        Activity activity5 = this.f1595G;
        this.f1591C = (ImageView) activity5.findViewById(C10647t.m31283e(activity5, "tt_up_slide_image"));
        Activity activity6 = this.f1595G;
        this.f1592D = activity6.findViewById(C10647t.m31283e(activity6, "tt_video_container_root"));
        Activity activity7 = this.f1595G;
        this.f1602b = (FrameLayout) activity7.findViewById(C10647t.m31283e(activity7, "tt_image_reward_container"));
        Activity activity8 = this.f1595G;
        this.f1601a = (ImageView) activity8.findViewById(C10647t.m31283e(activity8, "tt_image_reward"));
        Activity activity9 = this.f1595G;
        this.f1606f = (RelativeLayout) activity9.findViewById(C10647t.m31283e(activity9, "tt_browser_webview_page_loading"));
        Activity activity10 = this.f1595G;
        this.f1603c = (TextView) activity10.findViewById(C10647t.m31283e(activity10, "tt_loading_tip"));
        Activity activity11 = this.f1595G;
        this.f1604d = (FrameLayout) activity11.findViewById(C10647t.m31283e(activity11, "tt_video_container_back"));
        Activity activity12 = this.f1595G;
        this.f1618r = activity12.findViewById(C10647t.m31283e(activity12, "tt_back_container"));
        Activity activity13 = this.f1595G;
        this.f1617q = activity13.findViewById(C10647t.m31283e(activity13, "tt_loading_container"));
        Activity activity14 = this.f1595G;
        this.f1619s = (TextView) activity14.findViewById(C10647t.m31283e(activity14, "tt_back_container_title"));
        Activity activity15 = this.f1595G;
        this.f1620t = (TextView) activity15.findViewById(C10647t.m31283e(activity15, "tt_back_container_des"));
        Activity activity16 = this.f1595G;
        this.f1621u = (TTRoundRectImageView) activity16.findViewById(C10647t.m31283e(activity16, "tt_back_container_icon"));
        Activity activity17 = this.f1595G;
        this.f1622v = (TextView) activity17.findViewById(C10647t.m31283e(activity17, "tt_back_container_download"));
        if (!(this.f1603c == null || this.f1607g.mo1347a() == null)) {
            this.f1603c.setText(this.f1607g.mo1347a().mo1317c());
        }
        Activity activity18 = this.f1595G;
        this.f1605e = (TextView) activity18.findViewById(C10647t.m31283e(activity18, "tt_ad_loading_logo"));
        if ((m1969c(this.f1607g) || m1967b(this.f1607g)) && this.f1607g.mo1347a() != null) {
            TextView textView = this.f1605e;
            if (textView != null) {
                textView.setVisibility(8);
            }
            C0547k.m2622d().postDelayed(new Runnable() {
                public void run() {
                    if (!C0464l.this.f1594F.get()) {
                        C0136e.m595a(C0558m.m2663a(), C0464l.this.f1607g, C0464l.this.f1596H, System.currentTimeMillis() - C0464l.this.f1593E, false);
                        C0464l.this.m1984m();
                    }
                }
            }, this.f1607g.mo1347a().mo1312a() * 1000);
        }
        m1977i();
        if (m1967b(this.f1607g)) {
            m1986o();
            if (!mo1297c()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1625y.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.f1625y.setLayoutParams(layoutParams);
            }
        }
        if (m1969c(this.f1607g)) {
            this.f1592D.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m1977i() {
        SSWebView sSWebView = this.f1624x;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            C0728b.m3733a(C0558m.m2663a()).mo2470a(false).mo2472b(false).mo2471a(this.f1624x.getWebView());
            SSWebView sSWebView2 = this.f1624x;
            if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
                C0150n a = new C0150n(C0558m.m2663a(), this.f1607g, this.f1624x.getWebView()).mo428a(true);
                this.f1598J = a;
                a.mo438a(this.f1596H);
            }
            m1979j();
            this.f1624x.setLandingPage(true);
            this.f1624x.setTag(this.f1596H);
            this.f1624x.setMaterialMeta(this.f1607g.mo1372aC());
            this.f1624x.setWebViewClient(new C0730d(C0558m.m2663a(), this.f1623w, this.f1607g.mo1345Y(), this.f1598J, true) {
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    C0464l.this.m1981k();
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (C0464l.this.f1595G instanceof C0667c) {
                        ((C0667c) C0464l.this.f1595G).mo71f();
                    }
                    long unused = C0464l.this.f1593E = System.currentTimeMillis();
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String b = m3740b(str2);
                    if (this.f2822f != null) {
                        this.f2822f.mo432a(webView, i, str, str2, m3740b(str2));
                    }
                    boolean z = true;
                    boolean z2 = b != null && b.startsWith("image");
                    if (b == null || !b.startsWith("mp4")) {
                        z = false;
                    }
                    if (!z2 && !z && !C0464l.this.f1594F.get()) {
                        C0464l.this.m1984m();
                    }
                }

                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        C0464l.this.m1984m();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }
            });
            this.f1624x.setWebChromeClient(new C0729c(this.f1623w, this.f1598J) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (C0464l.this.f1595G != null && !C0464l.this.f1595G.isFinishing() && i == 100) {
                        C0464l.this.m1981k();
                    }
                }
            });
            if (this.f1597I == null) {
                this.f1597I = C1009d.m4776a(C0558m.m2663a(), this.f1607g, this.f1596H);
            }
            this.f1624x.setDownloadListener(new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (C0464l.this.f1597I != null) {
                        C0464l.this.f1597I.mo2930d();
                    }
                }
            });
            SSWebView sSWebView3 = this.f1624x;
            if (sSWebView3 != null) {
                sSWebView3.setUserAgentString(C0981i.m4546a(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f1624x.setMixedContentMode(0);
            }
            this.f1624x.getWebView().setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C0464l.this.f1600L) {
                        C0464l.this.f1616p.onTouch(view, motionEvent);
                    }
                    if (C0464l.this.f1600L || motionEvent.getAction() != 1) {
                        return false;
                    }
                    C0464l.this.f1624x.getWebView().performClick();
                    boolean unused = C0464l.this.f1600L = true;
                    return false;
                }
            });
            this.f1624x.getWebView().setOnClickListener(this.f1616p);
            C0136e.m593a(C0558m.m2663a(), this.f1607g, this.f1596H);
            C0982j.m4548a(this.f1624x, this.f1607g.mo1335O());
        }
        if (this.f1624x != null) {
            m1988q();
        }
    }

    /* renamed from: j */
    private void m1979j() {
        C0709w wVar = new C0709w(C0558m.m2663a());
        this.f1623w = wVar;
        wVar.mo2365b(this.f1624x).mo2378d(this.f1607g.mo1345Y()).mo2383e(this.f1607g.mo1382ac()).mo2345a(this.f1607g).mo2364b(-1).mo2339a(this.f1607g.mo1326F()).mo2372c(this.f1596H).mo2385f(C0996u.m4673i(this.f1607g)).mo2342a(this.f1624x);
    }

    /* renamed from: a */
    public static boolean m1965a(C0477n nVar) {
        if (nVar == null) {
            return false;
        }
        return m1969c(nVar) || m1967b(nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m1981k() {
        if (!this.f1594F.get() && !this.f1599K.get()) {
            this.f1594F.set(true);
            C0136e.m595a(C0558m.m2663a(), this.f1607g, this.f1596H, System.currentTimeMillis() - this.f1593E, true);
            m1982l();
        }
    }

    /* renamed from: l */
    private void m1982l() {
        this.f1606f.setVisibility(8);
        if (!m1969c(this.f1607g) && mo1297c()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", new float[]{0.0f, 1.0f});
            this.f1613m = ofFloat;
            ofFloat.setDuration(100);
            this.f1613m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C0464l.this.f1625y.getLayoutParams();
                    layoutParams.weight = (float) (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                    C0464l.this.mo1294a((float) (1.0d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                    C0464l.this.f1625y.setLayoutParams(layoutParams);
                }
            });
            this.f1613m.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m1984m() {
        if (!this.f1594F.get()) {
            m1985n();
            this.f1599K.set(true);
            Activity activity = this.f1595G;
            if (activity instanceof C0667c) {
                ((C0667c) activity).mo77k();
            }
            this.f1617q.setVisibility(8);
            this.f1618r.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1618r.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.addRule(10, 0);
            this.f1618r.setLayoutParams(layoutParams);
            if (this.f1607g.mo1333M() != null && !TextUtils.isEmpty(this.f1607g.mo1333M().mo1281a())) {
                C0835d.m4093a().mo2659a(this.f1607g.mo1333M().mo1281a(), (ImageView) this.f1621u);
            }
            this.f1619s.setText(this.f1607g.mo1331K());
            this.f1620t.setText(this.f1607g.mo1342V());
            if (this.f1622v != null) {
                mo1296b();
                this.f1622v.setClickable(true);
                this.f1622v.setOnClickListener(this.f1615o);
                this.f1622v.setOnTouchListener(this.f1615o);
            }
        }
    }

    /* renamed from: n */
    private void m1985n() {
        if (m1969c(this.f1607g)) {
            Activity activity = this.f1595G;
            if (activity instanceof C0667c) {
                ((C0667c) activity).mo71f();
                ((C0667c) this.f1595G).mo70e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1296b() {
        C0477n nVar = this.f1607g;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo1343W())) {
            this.f1622v.setText(this.f1607g.mo1343W());
        }
    }

    /* renamed from: o */
    private void m1986o() {
        if (mo1297c()) {
            this.f1590B.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f1591C, "translationY", new float[]{16.0f, 0.0f}).setDuration(500);
            this.f1609i = duration;
            duration.setRepeatMode(2);
            this.f1609i.setRepeatCount(-1);
            this.f1609i.start();
            this.f1590B.setClickable(true);
            this.f1590B.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!C0464l.this.f1600L) {
                        C0464l.this.f1616p.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    C0464l.this.f1612l = ObjectAnimator.ofFloat(this, "timeSlide", new float[]{0.0f, 1.0f});
                    C0464l.this.f1612l.setDuration(200);
                    C0464l.this.f1612l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) C0464l.this.f1625y.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            C0464l.this.mo1294a((float) (0.800000011920929d - (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            C0464l.this.f1625y.setLayoutParams(layoutParams);
                        }
                    });
                    C0464l.this.f1590B.performClick();
                    boolean unused = C0464l.this.f1600L = true;
                    C0464l.this.f1612l.start();
                    C0464l.this.f1590B.setVisibility(8);
                    return true;
                }
            });
            this.f1590B.setOnClickListener(this.f1616p);
        }
        if (!m1987p()) {
            this.f1608h.setVisibility(8);
            this.f1602b.setVisibility(0);
            this.f1601a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f1601a.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C0136e.m617b(C0558m.m2663a(), C0464l.this.f1607g, C0464l.this.f1596H);
                }
            });
            C0477n nVar = this.f1607g;
            if (!(nVar == null || nVar.mo1336P() == null || this.f1607g.mo1336P().size() <= 0 || this.f1607g.mo1336P().get(0) == null || TextUtils.isEmpty(this.f1607g.mo1336P().get(0).mo1281a()))) {
                C0835d.m4093a().mo2658a(this.f1607g.mo1336P().get(0), this.f1601a);
            }
        }
        try {
            C0750a.m3822a().mo64068a(this.f1607g.mo1336P().get(0).mo1281a()).mo64107a(C10571t.BITMAP).mo64102a((C10565n) new C10565n<Bitmap>() {
                /* renamed from: a */
                public void mo256a(int i, String str, Throwable th) {
                }

                /* renamed from: a */
                public void mo257a(C10561j<Bitmap> jVar) {
                    Bitmap a;
                    try {
                        Bitmap b = jVar.mo64116b();
                        if (Build.VERSION.SDK_INT >= 17 && (a = C10304a.m29746a(C0558m.m2663a(), b, 25)) != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(C0558m.m2663a().getResources(), a);
                            if (!C0464l.this.m1987p()) {
                                C0464l.this.f1602b.setBackground(bitmapDrawable);
                                return;
                            }
                            C0464l.this.f1604d.setBackground(bitmapDrawable);
                            View view = null;
                            if (C0464l.this.f1595G instanceof C0667c) {
                                view = ((C0667c) C0464l.this.f1595G).mo79m();
                            }
                            if (view != null && (view.getParent() instanceof View)) {
                                ((View) view.getParent()).setBackground(bitmapDrawable);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m1987p() {
        return C0477n.m2012c(this.f1607g);
    }

    /* renamed from: q */
    private void m1988q() {
        this.f1626z = new AnimatorSet();
        LinearLayout linearLayout = this.f1589A;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            this.f1610j = duration;
            duration.setRepeatMode(2);
            this.f1610j.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f1626z.play(this.f1610j);
            for (int i = 1; i < this.f1589A.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f1589A.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f1626z.start();
        }
    }

    /* renamed from: c */
    public boolean mo1297c() {
        return this.f1607g.mo1383ad() == 15 || this.f1607g.mo1383ad() == 16;
    }

    /* renamed from: a */
    public void mo1294a(float f) {
        try {
            ((C0667c) this.f1595G).mo78l();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static boolean m1967b(C0477n nVar) {
        if (nVar.mo1332L() == 3 && nVar.mo1428f() == 6 && !C0480p.m2190a(nVar) && nVar.mo1392am() == 1 && (nVar.mo1393an() == 0.0f || nVar.mo1393an() == 100.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m1969c(C0477n nVar) {
        if (nVar == null || nVar.mo1332L() != 3 || nVar.mo1428f() != 5 || C0480p.m2190a(nVar)) {
            return false;
        }
        if (nVar.mo1393an() == 0.0f || nVar.mo1393an() == 100.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m1971d(C0477n nVar) {
        if (nVar != null && C0558m.m2673h().mo1693g() && nVar.mo1325E() && !m1967b(nVar) && !m1969c(nVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo1298d() {
        FrameLayout frameLayout = this.f1625y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            this.f1592D.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo1299e() {
        SSWebView sSWebView;
        C0150n nVar = this.f1598J;
        if (!(nVar == null || (sSWebView = this.f1624x) == null)) {
            nVar.mo436a(sSWebView);
        }
        ObjectAnimator objectAnimator = this.f1611k;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f1611k.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f1612l;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f1612l.cancel();
        }
        ObjectAnimator objectAnimator3 = this.f1613m;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllUpdateListeners();
            this.f1613m.cancel();
        }
        AnimatorSet animatorSet = this.f1626z;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator4 = this.f1610j;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        ObjectAnimator objectAnimator5 = this.f1609i;
        if (objectAnimator5 != null) {
            objectAnimator5.cancel();
        }
        if (this.f1624x != null) {
            C0749z.m3817a(C0558m.m2663a(), this.f1624x.getWebView());
            C0749z.m3818a(this.f1624x.getWebView());
        }
        this.f1624x = null;
        C0709w wVar = this.f1623w;
        if (wVar != null) {
            wVar.mo2398n();
        }
        C0150n nVar2 = this.f1598J;
        if (nVar2 != null) {
            nVar2.mo443f();
        }
    }

    /* renamed from: f */
    public void mo1300f() {
        C0709w wVar = this.f1623w;
        if (wVar != null) {
            wVar.mo2395l();
        }
        C0150n nVar = this.f1598J;
        if (nVar != null) {
            nVar.mo441d();
        }
    }

    /* renamed from: g */
    public void mo1301g() {
        C0150n nVar = this.f1598J;
        if (nVar != null) {
            nVar.mo442e();
        }
    }

    /* renamed from: h */
    public void mo1302h() {
        C0625t.m3022a().mo2029b(true);
        C0709w wVar = this.f1623w;
        if (wVar != null) {
            wVar.mo2396m();
        }
    }
}
