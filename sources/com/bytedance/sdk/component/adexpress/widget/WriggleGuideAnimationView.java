package com.bytedance.sdk.component.adexpress.widget;

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

public class WriggleGuideAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f26014a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f26015b;

    /* renamed from: c */
    private C10649v f26016c;

    /* renamed from: d */
    private TextView f26017d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10439a f26018e;

    /* renamed from: f */
    private LinearLayout f26019f;

    /* renamed from: g */
    private WriggleGuideView f26020g;

    /* renamed from: h */
    private int f26021h;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$a */
    public interface C10439a {
        /* renamed from: a */
        void mo63706a();
    }

    public WriggleGuideAnimationView(Context context, int i, int i2) {
        super(context);
        this.f26021h = i2;
        m30430a(context, i);
    }

    /* renamed from: a */
    private void m30430a(Context context, int i) {
        inflate(context, i, this);
        this.f26019f = (LinearLayout) findViewById(C10647t.m31283e(context, "tt_interact_splash_wriggle_layout"));
        this.f26015b = (ImageView) findViewById(C10647t.m31283e(context, "tt_interact_splash_top_img"));
        this.f26020g = (WriggleGuideView) findViewById(C10647t.m31283e(context, "tt_interact_splash_progress_img"));
        this.f26014a = (TextView) findViewById(C10647t.m31283e(context, "tt_interact_splash_top_text"));
        this.f26017d = (TextView) findViewById(C10647t.m31283e(context, "tt_interact_splash_click_bar_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f26019f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f26017d.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.f26019f;
    }

    public WriggleGuideView getWriggleProgressIv() {
        return this.f26020g;
    }

    public TextView getTopTextView() {
        return this.f26014a;
    }

    public void setOnShakeViewListener(C10439a aVar) {
        this.f26018e = aVar;
    }

    /* renamed from: a */
    public void mo63838a() {
        postDelayed(new Runnable() {
            public void run() {
                if (WriggleGuideAnimationView.this.f26015b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -35.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new C10440b());
                    rotateAnimation.setDuration(1500);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            WriggleGuideAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    WriggleGuideAnimationView.this.f26015b.startAnimation(rotateAnimation);
                                }
                            }, 300);
                        }
                    });
                    WriggleGuideAnimationView.this.f26015b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$b */
    private static class C10440b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.4f ? f * 2.5f : f <= 0.8f ? (f * -2.2f) + 1.86f : (f * -0.7f) + 0.7f;
        }

        private C10440b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f26016c == null) {
                this.f26016c = new C10649v(getContext().getApplicationContext());
            }
            this.f26016c.mo64288a((C10649v.C10650a) new C10649v.C10650a() {
                /* renamed from: a */
                public void mo63805a(int i) {
                    if (i == 2 && WriggleGuideAnimationView.this.isShown() && WriggleGuideAnimationView.this.f26018e != null) {
                        WriggleGuideAnimationView.this.f26018e.mo63706a();
                    }
                }
            });
            this.f26016c.mo64290b((float) this.f26021h);
            this.f26016c.mo64286a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10649v vVar = this.f26016c;
        if (vVar != null) {
            vVar.mo64289b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C10649v vVar = this.f26016c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo64286a();
        } else {
            vVar.mo64289b();
        }
    }
}
