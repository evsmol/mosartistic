package com.bytedance.sdk.openadsdk.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.adexpress.p299c.C10304a;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10626e;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.C0224a;
import com.bytedance.sdk.openadsdk.component.p006a.C0236a;
import com.bytedance.sdk.openadsdk.component.p006a.C0237b;
import com.bytedance.sdk.openadsdk.component.p008c.C0251a;
import com.bytedance.sdk.openadsdk.component.p010e.C0255a;
import com.bytedance.sdk.openadsdk.component.p010e.C0256b;
import com.bytedance.sdk.openadsdk.component.p011f.C0260a;
import com.bytedance.sdk.openadsdk.component.p012g.C0262b;
import com.bytedance.sdk.openadsdk.component.view.ButtonFlash;
import com.bytedance.sdk.openadsdk.component.view.C0376a;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0619p;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p016b.C0406b;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0903a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p046i.C0826a;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0831b;
import com.bytedance.sdk.openadsdk.utils.C0977g;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public class TTAppOpenAdActivity extends Activity implements C10652x.C10653a {

    /* renamed from: F */
    private static TTAppOpenAd.AppOpenAdInteractionListener f0F;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f1A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f2B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C0477n f3C;

    /* renamed from: D */
    private IListenerManager f4D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public TTAppOpenAd.AppOpenAdInteractionListener f5E;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f6G;

    /* renamed from: a */
    TTAdDislikeDialog f7a;

    /* renamed from: b */
    TTAdDislikeToast f8b;

    /* renamed from: c */
    final AtomicBoolean f9c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicBoolean f10d = new AtomicBoolean(false);

    /* renamed from: e */
    protected boolean f11e = false;

    /* renamed from: f */
    protected final AtomicBoolean f12f = new AtomicBoolean(false);

    /* renamed from: g */
    protected final C10652x f13g = new C10652x(Looper.getMainLooper(), this);

    /* renamed from: h */
    private final String f14h = "open_ad";

    /* renamed from: i */
    private RelativeLayout f15i;

    /* renamed from: j */
    private FrameLayout f16j;

    /* renamed from: k */
    private ImageView f17k;

    /* renamed from: l */
    private TextView f18l;

    /* renamed from: m */
    private ButtonFlash f19m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C0256b f20n = new C0256b();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ValueAnimator f21o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C0262b f22p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f23q;

    /* renamed from: r */
    private C0237b f24r;

    /* renamed from: s */
    private final C0376a f25s = new C0376a();

    /* renamed from: t */
    private float f26t;

    /* renamed from: u */
    private float f27u;

    /* renamed from: v */
    private ImageView f28v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public long f29w = 0;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C0146j f30x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public AtomicBoolean f31y = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f32z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m9b(bundle)) {
            if (!TTAdSdk.isInitSuccess()) {
                finish();
            }
            this.f32z = C0477n.m2012c(this.f3C);
            m14f();
            m15g();
            m17h();
            m20i();
            m22j();
            m24k();
        }
    }

    /* renamed from: f */
    private void m14f() {
        int f = C10647t.m31284f(this, "tt_app_open_view");
        int d = this.f3C.mo1420d();
        if (d == 2) {
            f = C10647t.m31284f(this, "tt_app_open_view2");
        } else if (d == 3) {
            f = C10647t.m31284f(this, "tt_app_open_view3");
        }
        setContentView(f);
    }

    /* renamed from: g */
    private void m15g() {
        int i;
        int i2;
        int am = this.f3C.mo1392am();
        if (this.f3C.mo1420d() == 3) {
            am = 2;
        }
        if (am != 2) {
            setRequestedOrientation(1);
        } else if (mo11e()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        int i3 = C1002v.m4755i(getApplicationContext());
        int h = C1002v.m4754h(getApplicationContext());
        if (am == 2) {
            i = Math.max(i3, h);
            i2 = Math.min(i3, h);
        } else {
            i = Math.min(i3, h);
            i2 = Math.max(i3, h);
        }
        this.f26t = (float) i2;
        this.f27u = (float) i;
        float j = C1002v.m4756j(getApplicationContext());
        if (!C1002v.m4742c((Activity) this)) {
            return;
        }
        if (am == 1) {
            this.f26t -= j;
        } else if (am == 2) {
            this.f27u -= j;
        }
    }

    /* renamed from: h */
    private void m17h() {
        this.f15i = (RelativeLayout) findViewById(C10647t.m31283e(this, "tt_open_ad_container"));
        this.f28v = (ImageView) findViewById(C10647t.m31283e(this, "tt_open_ad_back_image"));
        this.f16j = (FrameLayout) findViewById(C10647t.m31283e(this, "tt_open_ad_video_container"));
        this.f17k = (ImageView) findViewById(C10647t.m31283e(this, "tt_open_ad_image"));
        this.f19m = (ButtonFlash) findViewById(C10647t.m31283e(this, "tt_open_ad_click_button"));
        this.f18l = (TextView) findViewById(C10647t.m31283e(this, "tt_ad_logo"));
        this.f25s.mo1046a(this);
        this.f20n.mo633a((Activity) this);
    }

    /* renamed from: i */
    private void m20i() {
        this.f25s.mo1047a(this.f3C, this.f27u, this.f26t);
    }

    /* renamed from: j */
    private void m22j() {
        this.f18l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.m414a(TTAppOpenAdActivity.this, TTAppOpenAdActivity.this.f3C, "open_ad");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f20n.mo634a((C0255a) new C0255a() {
            /* renamed from: a */
            public void mo26a(View view) {
                C0619p.m2997c(TTAppOpenAdActivity.this.f1A);
                TTAppOpenAdActivity.this.m36t();
                if (TTAppOpenAdActivity.this.f22p != null) {
                    TTAppOpenAdActivity.this.f22p.mo653a(4);
                }
                C0251a.m979a(TTAppOpenAdActivity.this.f3C, TTAppOpenAdActivity.this.f20n.mo638d(), TTAppOpenAdActivity.this.f20n.mo640f(), TTAppOpenAdActivity.this.f20n.mo639e());
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: b */
            public void mo27b(View view) {
                TTAppOpenAdActivity.this.mo1a();
            }

            /* renamed from: a */
            public void mo25a() {
                if (C0934b.m4334c()) {
                    TTAppOpenAdActivity.this.m6a("onAdTimeOver");
                } else if (TTAppOpenAdActivity.this.f5E != null) {
                    TTAppOpenAdActivity.this.f5E.onAdCountdownToZero();
                }
                TTAppOpenAdActivity.this.finish();
            }
        });
        C0237b bVar = new C0237b(this.f3C, this);
        this.f24r = bVar;
        bVar.mo598a((C0406b.C0407a) new C0406b.C0407a() {
            /* renamed from: a */
            public void mo28a(View view, int i) {
                if (C0934b.m4334c()) {
                    TTAppOpenAdActivity.this.m6a("onAdClicked");
                } else if (TTAppOpenAdActivity.this.f5E != null) {
                    TTAppOpenAdActivity.this.f5E.onAdClicked();
                }
            }
        });
        C0236a a = this.f24r.mo597a();
        if (this.f3C.mo1414c() == 1) {
            this.f15i.setOnClickListener(a);
            this.f15i.setOnTouchListener(a);
        }
        this.f19m.setOnClickListener(a);
        this.f19m.setOnTouchListener(a);
    }

    /* renamed from: k */
    private void m24k() {
        this.f25s.mo1045a();
        this.f19m.setText(this.f3C.mo1343W());
        this.f20n.mo636b(C0558m.m2673h().mo1699i(this.f1A));
        if (this.f32z) {
            mo2a(0);
            mo8b(8);
            this.f20n.mo631a((float) this.f3C.mo1330J().mo62916f());
            this.f21o = this.f20n.mo635b();
            this.f20n.mo632a(0);
            m28m();
            return;
        }
        int j = C0558m.m2673h().mo1701j(this.f1A);
        mo2a(8);
        mo8b(0);
        this.f20n.mo631a((float) j);
        this.f21o = this.f20n.mo635b();
        this.f20n.mo632a(0);
        m25l();
    }

    /* renamed from: l */
    private void m25l() {
        m35s();
        C0463k kVar = this.f3C.mo1336P().get(0);
        C0977g.m4536a(new C0826a(kVar.mo1281a(), kVar.mo1292g()), kVar.mo1285b(), kVar.mo1288c(), new C0977g.C0979a() {
            /* renamed from: a */
            public void mo29a() {
            }

            /* renamed from: b */
            public void mo31b() {
            }

            /* renamed from: a */
            public void mo30a(C0831b bVar) {
                if (bVar.mo2643c()) {
                    TTAppOpenAdActivity.this.mo6a(bVar);
                    TTAppOpenAdActivity.this.m3a(bVar.mo2641a());
                }
            }
        }, C0260a.m1017b(TextUtils.isEmpty(kVar.mo1292g()) ? C10626e.m31201a(kVar.mo1281a()) : kVar.mo1292g(), this.f1A).getParent());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3a(Bitmap bitmap) {
        Bitmap a;
        if (bitmap != null) {
            try {
                if (Build.VERSION.SDK_INT >= 17 && (a = C10304a.m29746a(C0558m.m2663a(), bitmap, 25)) != null) {
                    this.f28v.setImageDrawable(new BitmapDrawable(C0558m.m2663a().getResources(), a));
                }
            } catch (Throwable unused) {
                C10638l.m31242e("TTAppOpenAdActivity", "bindBackGroundImage error");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6a(C0831b bVar) {
        if (bVar.mo2641a() != null) {
            this.f17k.setImageBitmap(bVar.mo2641a());
        } else if (this.f3C.mo1336P() != null && this.f3C.mo1336P().get(0) != null) {
            Drawable a = C0977g.m4535a(bVar.mo2642b(), this.f3C.mo1336P().get(0).mo1285b());
            this.f17k.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f17k.setImageDrawable(a);
        }
    }

    /* renamed from: m */
    private void m28m() {
        boolean z;
        m35s();
        C0262b bVar = new C0262b(this);
        this.f22p = bVar;
        bVar.mo654a(this.f16j, this.f3C);
        this.f22p.mo655a((C10192c.C10193a) new C10192c.C10193a() {
            /* renamed from: a */
            public void mo33a(long j, int i) {
                C10638l.m31235b("TTAppOpenAdActivity", "onComplete");
            }

            /* renamed from: b */
            public void mo35b(long j, int i) {
                C10638l.m31235b("TTAppOpenAdActivity", "onError");
                TTAppOpenAdActivity.this.m36t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo32a() {
                C10638l.m31235b("TTAppOpenAdActivity", "onTimeOut");
                TTAppOpenAdActivity.this.m36t();
                TTAppOpenAdActivity.this.finish();
            }

            /* renamed from: a */
            public void mo34a(long j, long j2) {
                long unused = TTAppOpenAdActivity.this.f23q = j;
                if (!TTAppOpenAdActivity.this.f11e && TTAppOpenAdActivity.this.f22p.mo657b()) {
                    TTAppOpenAdActivity.this.f22p.mo659d();
                }
                TTAppOpenAdActivity.this.m32p();
            }
        });
        try {
            z = this.f22p.mo656a();
        } catch (Throwable th) {
            C10638l.m31242e("TTAppOpenAdActivity", "ttAppOpenAd playVideo error: " + th.getMessage());
            z = false;
        }
        if (z) {
            m31o();
        } else {
            finish();
        }
        C0224a.m885a(this.f3C, (C0224a.C0235d) new C0224a.C0235d() {
            /* renamed from: a */
            public void mo36a() {
            }

            /* renamed from: a */
            public void mo37a(Bitmap bitmap) {
                TTAppOpenAdActivity.this.m3a(bitmap);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2a(int i) {
        C1002v.m4716a((View) this.f16j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8b(int i) {
        C1002v.m4716a((View) this.f17k, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a() {
        if (!isFinishing()) {
            if (this.f10d.get()) {
                m33q();
                return;
            }
            if (this.f7a == null) {
                m30n();
            }
            this.f7a.mo520a();
        }
    }

    /* renamed from: n */
    private void m30n() {
        if (this.f7a == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f3C);
            this.f7a = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.C0201a() {
                /* renamed from: c */
                public void mo41c(View view) {
                }

                /* renamed from: a */
                public void mo39a(View view) {
                    TTAppOpenAdActivity.this.f9c.set(true);
                    TTAppOpenAdActivity.this.mo9c();
                }

                /* renamed from: b */
                public void mo40b(View view) {
                    TTAppOpenAdActivity.this.f9c.set(false);
                    TTAppOpenAdActivity.this.mo7b();
                }

                /* renamed from: a */
                public void mo38a(int i, FilterWord filterWord) {
                    if (!TTAppOpenAdActivity.this.f10d.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTAppOpenAdActivity.this.f10d.set(true);
                        TTAppOpenAdActivity.this.m34r();
                    }
                }
            });
        }
        ((FrameLayout) findViewById(16908290)).addView(this.f7a);
        if (this.f8b == null) {
            this.f8b = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f8b);
        }
    }

    /* renamed from: o */
    private void m31o() {
        if (this.f32z) {
            this.f13g.sendEmptyMessageDelayed(100, 5000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m32p() {
        this.f13g.removeMessages(100);
    }

    /* renamed from: q */
    private void m33q() {
        this.f8b.mo528a(C0516f.f1880d);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m34r() {
        this.f8b.mo528a(C0516f.f1881e);
    }

    public void onBackPressed() {
        C0256b bVar;
        if (C0558m.m2673h().mo1695h(this.f1A) == 1) {
            if (((long) this.f20n.mo638d()) >= ((long) C0558m.m2673h().mo1699i(this.f1A)) * 1000 && (bVar = this.f20n) != null) {
                bVar.mo637c();
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z || !this.f31y.get()) {
            this.f29w = System.currentTimeMillis();
            return;
        }
        if (this.f29w > 0) {
            C0136e.m616a((System.currentTimeMillis() - this.f29w) + "", this.f3C, "open_ad", this.f30x);
        }
        this.f29w = 0;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11e = true;
        if (this.f12f.getAndSet(true)) {
            mo7b();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11e = false;
        mo9c();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f32z) {
            C0251a.m982a(this.f3C, this.f23q, this.f20n.mo639e(), true);
        } else {
            C0251a.m982a(this.f3C, -1, this.f20n.mo639e(), false);
        }
        if (this.f29w > 0 && this.f31y.get()) {
            C0136e.m616a((System.currentTimeMillis() - this.f29w) + "", this.f3C, "open_ad", this.f30x);
            this.f29w = 0;
        }
        ButtonFlash buttonFlash = this.f19m;
        if (buttonFlash != null) {
            buttonFlash.mo1040a();
        }
        C0262b bVar = this.f22p;
        if (bVar != null) {
            bVar.mo661f();
        }
        if (C0934b.m4334c()) {
            m6a("recycleRes");
        }
        ValueAnimator valueAnimator = this.f21o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f0F = null;
        this.f5E = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.f7a;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback((TTAdDislikeDialog.C0201a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7b() {
        if (this.f32z) {
            if (this.f22p.mo658c()) {
                this.f22p.mo660e();
            }
            m31o();
        }
        if (this.f21o != null && Build.VERSION.SDK_INT >= 19) {
            this.f21o.resume();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9c() {
        if (this.f32z) {
            if (this.f22p.mo657b()) {
                this.f22p.mo659d();
            }
            m32p();
        }
        if (this.f21o != null && Build.VERSION.SDK_INT >= 19) {
            this.f21o.pause();
        }
    }

    /* renamed from: s */
    private void m35s() {
        try {
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    C0146j unused = TTAppOpenAdActivity.this.f30x = new C0146j();
                    TTAppOpenAdActivity.this.f30x.mo421a(System.currentTimeMillis(), 1.0f);
                    long unused2 = TTAppOpenAdActivity.this.f29w = System.currentTimeMillis();
                    if (TTAppOpenAdActivity.this.f21o != null && !TTAppOpenAdActivity.this.f21o.isStarted()) {
                        TTAppOpenAdActivity.this.f21o.start();
                    }
                    if (C0934b.m4334c()) {
                        TTAppOpenAdActivity.this.m6a("onAdShow");
                    } else if (TTAppOpenAdActivity.this.f5E != null) {
                        TTAppOpenAdActivity.this.f5E.onAdShow();
                    }
                    View findViewById = TTAppOpenAdActivity.this.findViewById(16908290);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                        jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                        jSONObject.put("alpha", (double) findViewById.getAlpha());
                        HashMap hashMap = new HashMap();
                        hashMap.put("root_view", jSONObject.toString());
                        hashMap.put("ad_root", Integer.valueOf(TTAppOpenAdActivity.this.f6G));
                        hashMap.put("openad_creative_type", TTAppOpenAdActivity.this.f32z ? "video_normal_ad" : "image_normal_ad");
                        if (C0376a.m1606c() == null) {
                            hashMap.put("appicon_acquirefail", "1");
                        }
                        C0136e.m602a(C0558m.m2663a(), TTAppOpenAdActivity.this.f3C, "open_ad", (Map<String, Object>) hashMap, (Double) null);
                        TTAppOpenAdActivity.this.f31y.set(true);
                    } catch (JSONException unused3) {
                        TTAppOpenAdActivity.this.finish();
                    }
                }
            });
        } catch (Throwable unused) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m36t() {
        if (C0934b.m4334c()) {
            m6a("onAdSkip");
            return;
        }
        TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener = this.f5E;
        if (appOpenAdInteractionListener != null) {
            appOpenAdInteractionListener.onAdSkip();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6a(final String str) {
        C10615e.m31168c(new C10618g("AppOpenAd_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTAppOpenAdActivity.this.mo10d().executeAppOpenAdCallback(TTAppOpenAdActivity.this.f2B, str);
                } catch (Throwable th) {
                    C10638l.m31239c("TTAppOpenAdActivity", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public IListenerManager mo10d() {
        if (this.f4D == null) {
            this.f4D = C0903a.asInterface(C0898a.m4299a(C0558m.m2663a()).mo2767a(7));
        }
        return this.f4D;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1002v.m4711a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTAppOpenAdActivity.this.isFinishing()) {
                            TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    C1002v.m4711a((Activity) TTAppOpenAdActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m9b(Bundle bundle) {
        if (C0934b.m4334c()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f3C = C0402b.m1636a(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        C10638l.m31239c("TTAppOpenAdActivity", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.f2B = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.f3C = C0625t.m3022a().mo2031c();
            this.f5E = C0625t.m3022a().mo2034f();
            C0625t.m3022a().mo2036h();
        }
        mo3a(getIntent());
        mo4a(bundle);
        C0477n nVar = this.f3C;
        if (nVar == null) {
            C10638l.m31235b("TTAppOpenAdActivity", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.f1A = C0996u.m4657f(nVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3a(Intent intent) {
        if (intent != null) {
            this.f6G = intent.getIntExtra(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4a(Bundle bundle) {
        if (bundle != null) {
            if (this.f5E == null) {
                this.f5E = f0F;
                f0F = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.f2B = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f6G = bundle.getInt(FullscreenAdService.DATA_KEY_AD_SOURCE, 0);
                this.f3C = C0402b.m1636a(new JSONObject(string));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f3C != null ? this.f3C.mo1397ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f2B);
            bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, this.f6G);
        } catch (Throwable unused) {
        }
        f0F = this.f5E;
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 100) {
            C0262b bVar = this.f22p;
            if (bVar != null) {
                bVar.mo653a(1);
            }
            m36t();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo11e() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
