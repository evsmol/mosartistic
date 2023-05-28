package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class RippleView extends View {

    /* renamed from: a */
    private float f25947a;

    /* renamed from: b */
    private float f25948b;

    /* renamed from: c */
    private ValueAnimator f25949c;

    /* renamed from: d */
    private ValueAnimator f25950d;

    /* renamed from: e */
    private Paint f25951e;

    /* renamed from: f */
    private long f25952f = 300;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f25953g = 0.0f;

    /* renamed from: h */
    private float f25954h;

    /* renamed from: i */
    private Animator.AnimatorListener f25955i;

    public RippleView(Context context) {
        super(context);
        mo63783a();
    }

    /* renamed from: a */
    public void mo63783a() {
        Paint paint = new Paint(1);
        this.f25951e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f25951e.setColor(Color.parseColor("#99000000"));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25947a = ((float) i) / 2.0f;
        this.f25948b = ((float) i2) / 2.0f;
        this.f25954h = (float) (Math.hypot((double) i, (double) i2) / 2.0d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f25947a, this.f25948b, this.f25953g, this.f25951e);
    }

    /* renamed from: b */
    public void mo63784b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f25954h});
        this.f25949c = ofFloat;
        ofFloat.setDuration(this.f25952f);
        this.f25949c.setInterpolator(new LinearInterpolator());
        this.f25949c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f25953g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f25949c.start();
    }

    /* renamed from: c */
    public void mo63785c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f25954h, 0.0f});
        this.f25950d = ofFloat;
        ofFloat.setDuration(this.f25952f);
        this.f25950d.setInterpolator(new LinearInterpolator());
        this.f25950d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f25953g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f25955i;
        if (animatorListener != null) {
            this.f25950d.addListener(animatorListener);
        }
        this.f25950d.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f25955i = animatorListener;
    }
}
