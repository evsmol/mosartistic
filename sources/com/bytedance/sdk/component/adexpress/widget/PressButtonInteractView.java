package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class PressButtonInteractView extends FrameLayout {

    /* renamed from: a */
    private Context f25924a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f25925b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f25926c;

    /* renamed from: d */
    private AnimatorSet f25927d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f25928e = true;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f25924a = context;
        this.f25927d = new AnimatorSet();
        m30382c();
        m30384d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.f25925b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) PressButtonInteractView.this.f25926c.getMeasuredHeight()) / 2.0f) - C10305b.m29747a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((((float) PressButtonInteractView.this.f25926c.getMeasuredWidth()) / 2.0f) - C10305b.m29747a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressButtonInteractView.this.f25926c.getMeasuredHeight())) / 2.0f) + C10305b.m29747a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressButtonInteractView.this.f25926c.getMeasuredWidth())) / 2.0f) + C10305b.m29747a(PressButtonInteractView.this.getContext(), 5.0f));
                PressButtonInteractView.this.f25925b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m30382c() {
        this.f25926c = new SplashDiffuseView(this.f25924a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25924a, 40.0f), (int) C10305b.m29747a(this.f25924a, 40.0f));
        layoutParams.gravity = 19;
        addView(this.f25926c, layoutParams);
        this.f25925b = new ImageView(this.f25924a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25924a, 62.0f), (int) C10305b.m29747a(this.f25924a, 62.0f));
        layoutParams2.gravity = 16;
        this.f25925b.setImageResource(C10647t.m31282d(this.f25924a, "tt_splash_hand"));
        addView(this.f25925b, layoutParams2);
    }

    /* renamed from: d */
    private void m30384d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25925b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(800);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressButtonInteractView.this.f25925b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
                PressButtonInteractView.this.f25925b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f25928e) {
                    PressButtonInteractView.this.f25926c.mo63823a();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                boolean unused = pressButtonInteractView.f25928e = !pressButtonInteractView.f25928e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25925b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(800);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f25927d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    /* renamed from: a */
    public void mo63759a() {
        this.f25927d.start();
    }

    /* renamed from: b */
    public void mo63760b() {
        AnimatorSet animatorSet = this.f25927d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
