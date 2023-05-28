package com.bytedance.sdk.openadsdk.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.C0207d;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C0676b;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0729c;
import com.bytedance.sdk.openadsdk.core.widget.p036a.C0730d;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p038e.C0773d;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import org.json.JSONObject;

public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements C0773d {

    /* renamed from: R */
    AnimatorSet f341R;

    /* renamed from: S */
    private LinearLayout f342S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public View f343T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public View f344U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public View f345V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f346W;

    /* renamed from: X */
    private TextView f347X;

    /* renamed from: Y */
    private TextView f348Y;

    /* renamed from: Z */
    private TextView f349Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public TextView f350aa;

    /* renamed from: ab */
    private TTRoundRectImageView f351ab;

    /* renamed from: ac */
    private TextView f352ac;

    /* renamed from: ad */
    private TextView f353ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public long f354ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f355af = false;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f356ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public C0207d f357ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public LinearLayout f358ai;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo231a() {
        return "tt_activity_videolandingpage_link2";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo233c() {
        return "tt_top_back";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f356ag = C0558m.m2673h().mo1693g();
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess() || this.f317p == null || this.f302a == null) {
            finish();
            return;
        }
        this.f302a.setWebViewClient(new C0730d(this.f306e, this.f310i, this.f308g, this.f294M, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f343T != null && !TTVideoLandingPageLink2Activity.this.f346W) {
                        TTVideoLandingPageLink2Activity.this.f343T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f358ai != null) {
                        TTVideoLandingPageLink2Activity.this.f358ai.setVisibility(0);
                    }
                    boolean unused = TTVideoLandingPageLink2Activity.this.f355af = true;
                    TTVideoLandingPageLink2Activity.this.m401n();
                    C0136e.m595a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f317p, TTVideoLandingPageLink2Activity.this.f287F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f354ae, true);
                } catch (Throwable unused2) {
                }
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                long unused = TTVideoLandingPageLink2Activity.this.f354ae = System.currentTimeMillis();
            }
        });
        this.f302a.setWebChromeClient(new C0729c(this.f310i, this.f294M) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTVideoLandingPageLink2Activity.this.f356ag && TTVideoLandingPageLink2Activity.this.f357ah != null && i == 100) {
                    TTVideoLandingPageLink2Activity.this.f357ah.mo540a(webView);
                }
                if (TTVideoLandingPageLink2Activity.this.f284C != null && !TTVideoLandingPageLink2Activity.this.isFinishing() && i == 100 && TTVideoLandingPageLink2Activity.this.f284C.isShown() && !TTVideoLandingPageLink2Activity.this.f346W) {
                    if (TTVideoLandingPageLink2Activity.this.f343T != null) {
                        TTVideoLandingPageLink2Activity.this.f343T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f358ai != null) {
                        TTVideoLandingPageLink2Activity.this.f358ai.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.m401n();
                }
            }
        });
        TextView textView = (TextView) findViewById(C10647t.m31283e(this, "tt_loading_tip"));
        this.f352ac = textView;
        if (!(textView == null || this.f317p.mo1347a() == null)) {
            this.f352ac.setText(this.f317p.mo1347a().mo1317c());
        }
        long j = 10000;
        if (!(this.f317p == null || this.f317p.mo1347a() == null)) {
            j = this.f317p.mo1347a().mo1312a() * 1000;
        }
        C0547k.m2622d().postDelayed(new Runnable() {
            public void run() {
                try {
                    boolean unused = TTVideoLandingPageLink2Activity.this.f346W = true;
                    TTVideoLandingPageLink2Activity.this.f344U.setVisibility(8);
                    TTVideoLandingPageLink2Activity.this.f345V.setVisibility(0);
                    if (!TTVideoLandingPageLink2Activity.this.f355af) {
                        C0136e.m595a((Context) TTVideoLandingPageLink2Activity.this, TTVideoLandingPageLink2Activity.this.f317p, TTVideoLandingPageLink2Activity.this.f287F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f354ae, false);
                    }
                } catch (Exception unused2) {
                }
            }
        }, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo234d() {
        super.mo234d();
        TextView textView = (TextView) findViewById(C10647t.m31283e(this, "tt_top_dislike"));
        this.f349Z = textView;
        if (textView != null) {
            textView.setText(C10647t.m31276a(C0558m.m2663a(), "tt_reward_feedback"));
            this.f349Z.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTDelegateActivity.m183a(TTVideoLandingPageLink2Activity.this.f317p, "");
                }
            });
        }
        this.f350aa = (TextView) findViewById(C10647t.m31283e(this, "tt_top_skip"));
        this.f342S = (LinearLayout) findViewById(C10647t.m31283e(this.f306e, "wave_container"));
        this.f343T = findViewById(C10647t.m31283e(this.f306e, "tt_browser_webview_loading"));
        this.f345V = findViewById(C10647t.m31283e(this.f306e, "tt_back_container"));
        this.f344U = findViewById(C10647t.m31283e(this.f306e, "tt_loading_container"));
        this.f347X = (TextView) findViewById(C10647t.m31283e(this.f306e, "tt_back_container_title"));
        this.f348Y = (TextView) findViewById(C10647t.m31283e(this.f306e, "tt_back_container_des"));
        this.f351ab = (TTRoundRectImageView) findViewById(C10647t.m31283e(this.f306e, "tt_back_container_icon"));
        this.f353ad = (TextView) findViewById(C10647t.m31283e(this.f306e, "tt_back_container_download"));
        if (this.f317p.mo1333M() != null && !TextUtils.isEmpty(this.f317p.mo1333M().mo1281a())) {
            C0835d.m4093a().mo2659a(this.f317p.mo1333M().mo1281a(), (ImageView) this.f351ab);
        }
        this.f347X.setText(this.f317p.mo1331K());
        this.f348Y.setText(this.f317p.mo1342V());
        ((TextView) findViewById(C10647t.m31283e(this, "tt_ad_loading_logo"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.m414a(TTVideoLandingPageLink2Activity.this.f306e, TTVideoLandingPageLink2Activity.this.f317p, TTVideoLandingPageLink2Activity.this.f287F);
            }
        });
        if (this.f356ag) {
            ((ViewStub) findViewById(C10647t.m31283e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C10647t.m31283e(this, "tt_bottom_bar"));
            this.f358ai = linearLayout;
            linearLayout.setVisibility(8);
            this.f357ah = new C0207d(this, this.f358ai, this.f302a, this.f317p, "landingpage_split_screen");
            if (this.f302a.getWebView() != null) {
                this.f302a.getWebView().setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a */
                    float f364a = 0.0f;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.f364a = motionEvent.getY();
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.f364a;
                            if (y - f > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.f357ah != null) {
                                    TTVideoLandingPageLink2Activity.this.f357ah.mo539a();
                                }
                                return false;
                            } else if (y - f < -8.0f && TTVideoLandingPageLink2Activity.this.f357ah != null) {
                                TTVideoLandingPageLink2Activity.this.f357ah.mo541b();
                            }
                        }
                        return false;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m387a(String str) {
        C0136e.m600a(this.f306e, this.f317p, "landingpage_split_screen", str, (JSONObject) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m400m();
    }

    /* renamed from: m */
    private void m400m() {
        this.f341R = new AnimatorSet();
        LinearLayout linearLayout = this.f342S;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", new float[]{-9.0f, 9.0f}).setDuration(300);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f341R.play(duration);
            for (int i = 1; i < this.f342S.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f342S.getChildAt(i), "translationY", new float[]{-f, f}).setDuration(300);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f341R.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo235e() {
        if (mo236f()) {
            super.mo235e();
            if (this.f315n.getNativeVideoController() != null) {
                this.f315n.getNativeVideoController().mo2098a(false);
                ((C0676b) this.f315n.getNativeVideoController()).mo2244g(false);
                this.f315n.setIsNeedShowDetail(false);
                this.f313l.setClickable(true);
                this.f313l.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.m387a("click_video");
                        return false;
                    }
                });
            }
            ((C0676b) this.f315n.getNativeVideoController()).mo2148a((C10192c.C10193a) new C10192c.C10193a() {
                /* renamed from: a */
                public void mo32a() {
                }

                /* renamed from: a */
                public void mo33a(long j, int i) {
                }

                /* renamed from: b */
                public void mo35b(long j, int i) {
                }

                /* renamed from: a */
                public void mo34a(long j, long j2) {
                    if (TTVideoLandingPageLink2Activity.this.f350aa != null) {
                        int max = (int) Math.max(0, (j2 - j) / 1000);
                        TextView k = TTVideoLandingPageLink2Activity.this.f350aa;
                        k.setText(max + "");
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.f350aa.setVisibility(8);
                        }
                    }
                }
            });
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            C0835d.m4093a().mo2658a(this.f317p.mo1336P().get(0), imageView);
            this.f313l.setVisibility(0);
            this.f313l.removeAllViews();
            this.f313l.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C0136e.m617b(C0558m.m2663a(), TTVideoLandingPageLink2Activity.this.f317p, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo236f() {
        return this.f314m == 5 || this.f314m == 15 || this.f314m == 50;
    }

    /* renamed from: j */
    public void mo240j() {
        super.mo240j();
        if (this.f317p != null) {
            this.f317p.mo1369a(true);
        }
        TextView textView = this.f353ad;
        if (textView != null) {
            textView.setText(mo232b());
            this.f353ad.setClickable(true);
            this.f353ad.setOnClickListener(this.f298Q);
            this.f353ad.setOnTouchListener(this.f298Q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m401n() {
        AnimatorSet animatorSet = this.f341R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f341R.removeAllListeners();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m401n();
        if (!this.f346W && this.f294M != null && this.f302a != null && this.f344U.getVisibility() == 8) {
            this.f294M.mo436a(this.f302a);
        }
        super.onDestroy();
    }
}
