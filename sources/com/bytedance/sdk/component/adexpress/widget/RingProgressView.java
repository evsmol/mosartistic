package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class RingProgressView extends View {

    /* renamed from: a */
    private Context f25939a;

    /* renamed from: b */
    private Paint f25940b;

    /* renamed from: c */
    private RectF f25941c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f25942d;

    /* renamed from: e */
    private ValueAnimator f25943e;

    /* renamed from: f */
    private int f25944f = 1500;

    /* renamed from: g */
    private boolean f25945g;

    public RingProgressView(Context context) {
        super(context);
        this.f25939a = context;
        Paint paint = new Paint();
        this.f25940b = paint;
        paint.setAntiAlias(true);
        this.f25940b.setStyle(Paint.Style.STROKE);
        this.f25940b.setStrokeWidth(10.0f);
        this.f25940b.setColor(Color.parseColor("#80FFFFFF"));
        this.f25941c = new RectF();
    }

    /* renamed from: a */
    public void mo63775a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.f25943e = ofFloat;
        ofFloat.setDuration((long) this.f25944f);
        this.f25943e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RingProgressView.this.f25942d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f25943e.start();
    }

    /* renamed from: b */
    public void mo63776b() {
        ValueAnimator valueAnimator = this.f25943e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo63777c() {
        this.f25945g = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.f25944f = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f25945g) {
            canvas.drawArc(this.f25941c, 270.0f, this.f25942d, false, this.f25940b);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25941c.set(5.0f, 5.0f, (float) (i - 5), (float) (i2 - 5));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
