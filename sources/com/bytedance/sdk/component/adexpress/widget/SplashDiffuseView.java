package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class SplashDiffuseView extends View {

    /* renamed from: c */
    private static int f25997c = 50;

    /* renamed from: a */
    private Paint f25998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f25999b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ObjectAnimator f26000d;

    public SplashDiffuseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25999b = 10;
        m30425b();
    }

    /* renamed from: b */
    private void m30425b() {
        Paint paint = new Paint();
        this.f25998a = paint;
        paint.setAntiAlias(true);
        this.f25998a.setColor(Color.parseColor("#FFFFFFFF"));
        this.f25998a.setStyle(Paint.Style.STROKE);
        this.f25998a.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f26000d = ofFloat;
        ofFloat.setDuration(200);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        this.f25998a.setShader(new LinearGradient((float) (getMeasuredWidth() / 2), 0.0f, (float) (getMeasuredWidth() / 2), (float) getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f, (float) this.f25999b, this.f25998a);
    }

    /* renamed from: a */
    public void mo63823a() {
        int min = (int) Math.min(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        f25997c = min;
        int i = min - 18;
        f25997c = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{10, i});
        ofInt.setInterpolator(new C10443a(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int unused = SplashDiffuseView.this.f25999b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.requestLayout();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.f26000d.start();
            }
        });
        ofInt.start();
    }
}
