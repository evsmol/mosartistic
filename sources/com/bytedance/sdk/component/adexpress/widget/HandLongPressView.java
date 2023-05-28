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

public class HandLongPressView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f25916a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f25917b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CircleRippleView f25918c;

    /* renamed from: d */
    private AnimatorSet f25919d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f25920e = true;

    /* renamed from: f */
    private TextView f25921f;

    public HandLongPressView(Context context) {
        super(context);
        this.f25916a = context;
        this.f25919d = new AnimatorSet();
        m30374c();
        m30375d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.f25917b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) HandLongPressView.this.f25918c.getMeasuredHeight()) / 2.0f) - C10305b.m29747a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C10305b.m29747a(HandLongPressView.this.f25916a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) HandLongPressView.this.f25918c.getMeasuredWidth()) / 2.0f) - C10305b.m29747a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C10305b.m29747a(HandLongPressView.this.f25916a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-HandLongPressView.this.f25918c.getMeasuredHeight())) / 2.0f) + C10305b.m29747a(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-HandLongPressView.this.f25918c.getMeasuredWidth())) / 2.0f) + C10305b.m29747a(HandLongPressView.this.getContext(), 5.0f));
                HandLongPressView.this.f25917b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m30374c() {
        this.f25918c = new CircleRippleView(this.f25916a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25916a, 80.0f), (int) C10305b.m29747a(this.f25916a, 80.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C10305b.m29747a(this.f25916a, 20.0f);
        layoutParams.leftMargin = (int) C10305b.m29747a(this.f25916a, 20.0f);
        addView(this.f25918c, layoutParams);
        this.f25918c.mo63729a();
        this.f25917b = new ImageView(this.f25916a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C10305b.m29747a(this.f25916a, 80.0f), (int) C10305b.m29747a(this.f25916a, 80.0f));
        this.f25917b.setImageResource(C10647t.m31282d(this.f25916a, "tt_splash_hand"));
        addView(this.f25917b, layoutParams2);
        TextView textView = new TextView(this.f25916a);
        this.f25921f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C10305b.m29747a(this.f25916a, 10.0f);
        addView(this.f25921f, layoutParams3);
    }

    /* renamed from: d */
    private void m30375d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25917b, "scaleX", new float[]{1.0f, 0.8f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(HandLongPressView.this.f25917b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                HandLongPressView.this.f25917b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.f25920e) {
                    HandLongPressView.this.f25918c.mo63729a();
                    HandLongPressView.this.f25918c.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.f25918c.mo63730b();
                    HandLongPressView.this.f25918c.setAlpha(0.0f);
                }
                HandLongPressView handLongPressView = HandLongPressView.this;
                boolean unused = handLongPressView.f25920e = !handLongPressView.f25920e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25917b, "scaleY", new float[]{1.0f, 0.8f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f25919d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f25921f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f25921f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo63750a() {
        this.f25919d.start();
    }

    /* renamed from: b */
    public void mo63751b() {
        AnimatorSet animatorSet = this.f25919d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.f25918c;
        if (circleRippleView != null) {
            circleRippleView.mo63730b();
        }
    }
}
