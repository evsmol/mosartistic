package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p299c.C10305b;
import com.bytedance.sdk.component.utils.C10647t;

public class PressInteractView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f25931a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f25932b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f25933c;

    /* renamed from: d */
    private AnimatorSet f25934d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f25935e = true;

    /* renamed from: f */
    private TextView f25936f;

    public PressInteractView(Context context) {
        super(context);
        this.f25931a = context;
        this.f25934d = new AnimatorSet();
        m30391c();
        m30392d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.f25932b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) PressInteractView.this.f25933c.getMeasuredHeight()) / 2.0f) - C10305b.m29747a(PressInteractView.this.getContext(), 5.0f))) + ((int) C10305b.m29747a(PressInteractView.this.f25931a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) PressInteractView.this.f25933c.getMeasuredWidth()) / 2.0f) - C10305b.m29747a(PressInteractView.this.getContext(), 5.0f))) + ((int) C10305b.m29747a(PressInteractView.this.f25931a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressInteractView.this.f25933c.getMeasuredHeight())) / 2.0f) + C10305b.m29747a(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressInteractView.this.f25933c.getMeasuredWidth())) / 2.0f) + C10305b.m29747a(PressInteractView.this.getContext(), 5.0f));
                PressInteractView.this.f25932b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m30391c() {
        this.f25933c = new SplashDiffuseView(this.f25931a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25931a, 50.0f), (int) C10305b.m29747a(this.f25931a, 50.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C10305b.m29747a(this.f25931a, 20.0f);
        layoutParams.leftMargin = (int) C10305b.m29747a(this.f25931a, 20.0f);
        addView(this.f25933c, layoutParams);
        this.f25932b = new ImageView(this.f25931a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25931a, 78.0f), (int) C10305b.m29747a(this.f25931a, 78.0f));
        this.f25932b.setImageResource(C10647t.m31282d(this.f25931a, "tt_splash_hand"));
        addView(this.f25932b, layoutParams2);
        TextView textView = new TextView(this.f25931a);
        this.f25936f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C10305b.m29747a(this.f25931a, 10.0f);
        addView(this.f25936f, layoutParams3);
        this.f25936f.setVisibility(8);
    }

    /* renamed from: d */
    private void m30392d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25932b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressInteractView.this.f25932b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                PressInteractView.this.f25932b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f25935e) {
                    PressInteractView.this.f25933c.mo63823a();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                boolean unused = pressInteractView.f25935e = !pressInteractView.f25935e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25932b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f25934d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f25936f.setVisibility(0);
        this.f25936f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f25936f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo63766a() {
        this.f25934d.start();
    }

    /* renamed from: b */
    public void mo63767b() {
        AnimatorSet animatorSet = this.f25934d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
