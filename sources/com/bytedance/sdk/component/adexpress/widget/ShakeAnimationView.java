package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10649v;

public class ShakeAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f25960a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f25961b;

    /* renamed from: c */
    private C10649v f25962c;

    /* renamed from: d */
    private TextView f25963d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10424a f25964e;

    /* renamed from: f */
    private LinearLayout f25965f;

    /* renamed from: g */
    private int f25966g;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$a */
    public interface C10424a {
        /* renamed from: a */
        void mo63703a();
    }

    public ShakeAnimationView(Context context, int i, int i2) {
        super(context);
        this.f25966g = i2;
        m30405a(context, i);
    }

    /* renamed from: a */
    private void m30405a(Context context, int i) {
        inflate(context, i, this);
        this.f25965f = (LinearLayout) findViewById(C10647t.m31283e(context, "tt_hand_container"));
        this.f25961b = (ImageView) findViewById(C10647t.m31283e(context, "tt_splash_rock_img"));
        this.f25960a = (TextView) findViewById(C10647t.m31283e(context, "tt_splash_rock_top_text"));
        this.f25963d = (TextView) findViewById(C10647t.m31283e(context, "tt_splash_rock_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f25965f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f25963d.setText(str);
    }

    public LinearLayout getShakeLayout() {
        return this.f25965f;
    }

    public void setOnShakeViewListener(C10424a aVar) {
        this.f25964e = aVar;
    }

    /* renamed from: a */
    public void mo63793a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
        postDelayed(new Runnable() {
            public void run() {
                if (ShakeAnimationView.this.f25961b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                    rotateAnimation.setInterpolator(new C10425b());
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            ShakeAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    ShakeAnimationView.this.f25961b.startAnimation(rotateAnimation);
                                }
                            }, 250);
                        }
                    });
                    ShakeAnimationView.this.f25961b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$b */
    private static class C10425b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * -2.0f) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * -4.0f) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private C10425b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f25962c == null) {
                this.f25962c = new C10649v(getContext().getApplicationContext());
            }
            this.f25962c.mo64288a((C10649v.C10650a) new C10649v.C10650a() {
                /* renamed from: a */
                public void mo63805a(int i) {
                    if (i == 1 && ShakeAnimationView.this.isShown() && ShakeAnimationView.this.f25964e != null) {
                        ShakeAnimationView.this.f25964e.mo63703a();
                    }
                }
            });
            this.f25962c.mo64287a((float) this.f25966g);
            this.f25962c.mo64286a();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C10649v vVar = this.f25962c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo64286a();
        } else {
            vVar.mo64289b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10649v vVar = this.f25962c;
        if (vVar != null) {
            vVar.mo64289b();
        }
    }
}
