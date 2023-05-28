package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class SlideUpView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f25985a;

    /* renamed from: b */
    private ImageView f25986b;

    /* renamed from: c */
    private ImageView f25987c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f25988d;

    /* renamed from: e */
    private TextView f25989e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f25990f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f25991g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f25992h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f25993i = new AnimatorSet();

    public SlideUpView(Context context) {
        super(context);
        m30418a(context);
    }

    /* renamed from: a */
    private void m30418a(Context context) {
        if (context == null) {
            context = C10303c.m29743a();
        }
        inflate(context, C10647t.m31284f(context, "tt_dynamic_splash_slide_up"), this);
        this.f25987c = (ImageView) findViewById(C10647t.m31283e(context, "tt_splash_slide_up_guide_bar"));
        this.f25985a = (ImageView) findViewById(C10647t.m31283e(context, "tt_splash_slide_up_finger"));
        this.f25986b = (ImageView) findViewById(C10647t.m31283e(context, "tt_splash_slide_up_circle"));
        this.f25989e = (TextView) findViewById(C10647t.m31283e(context, "slide_guide_text"));
        this.f25988d = (ImageView) findViewById(C10647t.m31283e(context, "tt_splash_slide_up_bg"));
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f25990f;
    }

    /* renamed from: a */
    public void mo63814a() {
        mo63815b();
        this.f25990f.start();
        this.f25990f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideUpView.this.f25990f.start();
                    }
                }, 200);
            }
        });
    }

    /* renamed from: b */
    public void mo63815b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25985a, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25985a, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25985a, "translationY", new float[]{0.0f, C10305b.m29747a(getContext(), -100.0f)});
        ofFloat3.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C10305b.m29747a(getContext(), 100.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f25988d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideUpView.this.f25988d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f25988d, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f25988d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f25986b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f25986b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f25986b, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f25986b, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f25986b, "translationY", new float[]{0.0f, C10305b.m29747a(getContext(), -100.0f)});
        ValueAnimator valueAnimator = ofInt;
        ofFloat10.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f25991g.setDuration(50);
        this.f25993i.setDuration(1500);
        this.f25992h.setDuration(50);
        this.f25991g.playTogether(new Animator[]{ofFloat2, ofFloat7, ofFloat5});
        this.f25992h.playTogether(new Animator[]{ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4});
        this.f25993i.playTogether(new Animator[]{ofFloat3, valueAnimator, ofFloat10});
        this.f25990f.playSequentially(new Animator[]{this.f25992h, this.f25993i, this.f25991g});
    }

    /* renamed from: c */
    public void mo63816c() {
        AnimatorSet animatorSet = this.f25990f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f25992h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f25991g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f25993i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public void setGuideText(String str) {
        this.f25989e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo63816c();
    }
}
