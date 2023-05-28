package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.utils.C1002v;

public class BannerExpressView extends FrameLayout {

    /* renamed from: a */
    protected final Context f1408a;

    /* renamed from: b */
    protected NativeExpressView f1409b;

    /* renamed from: c */
    protected NativeExpressView f1410c;

    /* renamed from: d */
    protected C0477n f1411d;

    /* renamed from: e */
    protected AdSlot f1412e;

    /* renamed from: f */
    protected TTNativeExpressAd.ExpressAdInteractionListener f1413f;

    /* renamed from: g */
    protected TTNativeExpressAd.ExpressVideoAdListener f1414g;

    /* renamed from: h */
    protected int f1415h;

    /* renamed from: i */
    protected boolean f1416i;

    /* renamed from: j */
    protected String f1417j = "banner_ad";

    public BannerExpressView(Context context, C0477n nVar, AdSlot adSlot) {
        super(context);
        this.f1408a = context;
        this.f1411d = nVar;
        this.f1412e = adSlot;
        mo1132a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1132a() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f1408a, this.f1411d, this.f1412e, this.f1417j);
        this.f1409b = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo1133a(C0477n nVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.f1408a, nVar, adSlot, this.f1417j);
        this.f1410c = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressView.this.f1413f != null) {
                    BannerExpressView.this.f1413f.onAdClicked(BannerExpressView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressView.this.mo1135a(f, f2);
                if (BannerExpressView.this.f1410c != null) {
                    BannerExpressView.this.f1410c.setSoundMute(true);
                }
                BannerExpressView.this.mo1139e();
            }
        });
        C1002v.m4716a((View) this.f1410c, 8);
        addView(this.f1410c, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        this.f1414g = expressVideoAdListener;
    }

    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        this.f1413f = expressAdInteractionListener;
        NativeExpressView nativeExpressView = this.f1409b;
        if (nativeExpressView != null) {
            nativeExpressView.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
                public void onAdShow(View view, int i) {
                }

                public void onAdClicked(View view, int i) {
                    if (BannerExpressView.this.f1413f != null) {
                        BannerExpressView.this.f1413f.onAdClicked(BannerExpressView.this, i);
                    }
                }

                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.f1413f != null) {
                        BannerExpressView.this.f1413f.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                public void onRenderSuccess(View view, float f, float f2) {
                    if (BannerExpressView.this.f1409b != null) {
                        BannerExpressView.this.f1409b.setSoundMute(true);
                    }
                    BannerExpressView.this.mo1135a(f, f2);
                    if (BannerExpressView.this.f1413f != null) {
                        BannerExpressView.this.f1413f.onRenderSuccess(BannerExpressView.this, f, f2);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1135a(float f, float f2) {
        int b = (int) C1002v.m4731b(this.f1408a, f);
        int b2 = (int) C1002v.m4731b(this.f1408a, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(b, b2);
        }
        layoutParams.width = b;
        layoutParams.height = b2;
        setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo1136b() {
        NativeExpressView nativeExpressView = this.f1409b;
        if (nativeExpressView != null) {
            nativeExpressView.mo1895j();
        }
    }

    /* renamed from: c */
    public void mo1137c() {
        if (this.f1409b != null) {
            C0503h.m2281d().mo1605f(this.f1409b.getClosedListenerKey());
            removeView(this.f1409b);
            this.f1409b.mo1897l();
            this.f1409b = null;
        }
        if (this.f1410c != null) {
            C0503h.m2281d().mo1605f(this.f1410c.getClosedListenerKey());
            removeView(this.f1410c);
            this.f1410c.mo1897l();
            this.f1410c = null;
        }
        C0503h.m2281d().mo1622w();
    }

    public NativeExpressView getCurView() {
        return this.f1409b;
    }

    public NativeExpressView getNextView() {
        return this.f1410c;
    }

    public void setDuration(int i) {
        this.f1415h = i;
    }

    /* renamed from: a */
    private ObjectAnimator m1730a(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{0.0f, (float) (-getWidth())});
    }

    /* renamed from: b */
    private ObjectAnimator m1732b(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", new float[]{(float) getWidth(), 0.0f});
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.f1416i = false;
                BannerExpressView.this.m1733g();
            }
        });
        return ofFloat;
    }

    /* renamed from: d */
    public void mo1138d() {
        NativeExpressView nativeExpressView = this.f1410c;
        if (nativeExpressView != null) {
            nativeExpressView.mo1895j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1139e() {
        try {
            if (!this.f1416i && this.f1410c != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(m1730a(this.f1409b)).with(m1732b(this.f1410c));
                animatorSet.setDuration((long) this.f1415h).start();
                C1002v.m4716a((View) this.f1410c, 0);
                this.f1416i = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: f */
    public boolean mo1140f() {
        return this.f1410c != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m1733g() {
        NativeExpressView nativeExpressView = this.f1409b;
        this.f1409b = this.f1410c;
        this.f1410c = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.f1410c.mo1897l();
            this.f1410c = null;
        }
    }
}
