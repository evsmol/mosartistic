package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class SlideRightView extends FrameLayout {

    /* renamed from: a */
    private Context f25972a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f25973b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f25974c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f25975d;

    /* renamed from: e */
    private TextView f25976e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f25977f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f25978g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f25979h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f25980i = new AnimatorSet();

    public SlideRightView(Context context) {
        super(context);
        this.f25972a = context;
        m30412b();
    }

    /* renamed from: b */
    private void m30412b() {
        ImageView imageView = new ImageView(this.f25972a);
        this.f25975d = imageView;
        imageView.setBackgroundResource(C10647t.m31282d(this.f25972a, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        addView(this.f25975d, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f25972a);
        this.f25974c = imageView2;
        imageView2.setImageResource(C10647t.m31282d(this.f25972a, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25972a, 50.0f), (int) C10305b.m29747a(this.f25972a, 50.0f));
        layoutParams2.gravity = 48;
        addView(this.f25974c, layoutParams2);
        ImageView imageView3 = new ImageView(this.f25972a);
        this.f25973b = imageView3;
        imageView3.setImageResource(C10647t.m31282d(this.f25972a, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25972a, 80.0f), (int) C10305b.m29747a(this.f25972a, 80.0f));
        layoutParams3.gravity = 48;
        addView(this.f25973b, layoutParams3);
        TextView textView = new TextView(this.f25972a);
        this.f25976e = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f25976e, layoutParams4);
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f25973b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) SlideRightView.this.f25974c.getMeasuredHeight()) / 2.0f) - C10305b.m29747a(SlideRightView.this.getContext(), 7.0f));
                layoutParams.leftMargin = -SlideRightView.this.f25974c.getMeasuredWidth();
                SlideRightView.this.f25973b.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) SlideRightView.this.f25975d.getLayoutParams();
                layoutParams2.topMargin = (int) ((((float) SlideRightView.this.f25974c.getMeasuredHeight()) / 2.0f) - C10305b.m29747a(SlideRightView.this.getContext(), 5.0f));
                layoutParams2.leftMargin = (int) (((float) SlideRightView.this.f25974c.getMeasuredWidth()) / 2.0f);
                SlideRightView.this.f25975d.setLayoutParams(layoutParams2);
            }
        });
    }

    /* renamed from: c */
    private void m30414c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25973b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25974c, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f25974c, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f25975d, "alpha", new float[]{0.0f, 1.0f});
        this.f25979h.setDuration(300);
        this.f25979h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f25973b, "translationX", new float[]{0.0f, C10305b.m29747a(getContext(), 80.0f)});
        ofFloat5.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C10305b.m29747a(getContext(), 80.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f25975d.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideRightView.this.f25975d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f25974c, "translationX", new float[]{0.0f, C10305b.m29747a(getContext(), 80.0f)});
        ofFloat6.setInterpolator(new C10443a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f25980i.setDuration(1500);
        this.f25980i.playTogether(new Animator[]{ofFloat5, ofInt, ofFloat6});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f25973b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f25975d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f25974c, "alpha", new float[]{1.0f, 0.0f});
        this.f25978g.setDuration(50);
        this.f25978g.playTogether(new Animator[]{ofFloat7, ofFloat8, ofFloat9});
        this.f25977f.playSequentially(new Animator[]{this.f25979h, this.f25980i, this.f25978g});
    }

    /* renamed from: a */
    public void mo63807a() {
        m30414c();
        this.f25977f.start();
        this.f25977f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideRightView.this.f25977f.start();
                    }
                }, 200);
            }
        });
    }

    public void setGuideText(String str) {
        this.f25976e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
