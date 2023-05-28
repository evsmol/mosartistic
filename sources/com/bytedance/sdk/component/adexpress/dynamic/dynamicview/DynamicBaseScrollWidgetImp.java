package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p303b.C10351h;

public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements C10388c {

    /* renamed from: a */
    ObjectAnimator f25736a;

    /* renamed from: b */
    ObjectAnimator f25737b;

    /* renamed from: s */
    private int f25738s = 0;

    /* renamed from: t */
    private Runnable f25739t = new Runnable() {
        public void run() {
            DynamicBaseScrollWidgetImp.this.m30217a();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30217a() {
        final View childAt = getChildAt(this.f25738s);
        final View childAt2 = getChildAt((this.f25738s + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", new float[]{0.0f, (float) ((-(this.f25752h + getChildAt(this.f25738s).getHeight())) / 2)});
        this.f25736a = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f25736a.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", new float[]{(float) ((this.f25752h + childAt2.getHeight()) / 2), 0.0f});
        this.f25737b = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.f25737b.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.f25736a.setDuration(500);
        this.f25737b.setDuration(500);
        this.f25736a.start();
        this.f25737b.start();
        int i = this.f25738s + 1;
        this.f25738s = i;
        this.f25738s = i % getChildCount();
        postDelayed(this.f25739t, 2000);
    }

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, C10351h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f25752h - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f25739t, 2500);
    }

    /* renamed from: b */
    public void mo63284b() {
        removeCallbacks(this.f25739t);
        ObjectAnimator objectAnimator = this.f25736a;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f25736a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f25737b;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f25737b.cancel();
        }
        super.mo63284b();
    }
}
