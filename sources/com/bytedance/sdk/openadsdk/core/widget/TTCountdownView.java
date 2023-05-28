package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0558m;

public class TTCountdownView extends View {

    /* renamed from: a */
    public static final String f2742a = C10647t.m31276a(C0558m.m2663a(), "tt_count_down_view");

    /* renamed from: b */
    private float f2743b;

    /* renamed from: c */
    private float f2744c;

    /* renamed from: d */
    private int f2745d;

    /* renamed from: e */
    private boolean f2746e;

    /* renamed from: f */
    private float f2747f;

    /* renamed from: g */
    private float f2748g;

    /* renamed from: h */
    private String f2749h;

    /* renamed from: i */
    private boolean f2750i;

    /* renamed from: j */
    private Paint f2751j;

    /* renamed from: k */
    private Paint f2752k;

    /* renamed from: l */
    private Paint f2753l;

    /* renamed from: m */
    private Paint f2754m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f2755n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f2756o;

    /* renamed from: p */
    private RectF f2757p;

    /* renamed from: q */
    private C0722a f2758q;

    /* renamed from: r */
    private AnimatorSet f2759r;

    /* renamed from: s */
    private ValueAnimator f2760s;

    /* renamed from: t */
    private ValueAnimator f2761t;

    /* renamed from: u */
    private ValueAnimator f2762u;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView$a */
    public interface C0722a {
    }

    /* renamed from: a */
    public float mo2434a(float f, float f2) {
        return f * f2;
    }

    /* renamed from: a */
    public float mo2435a(float f, int i) {
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = m3715b();
        }
        if (mode2 != 1073741824) {
            size2 = m3715b();
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: b */
    private int m3715b() {
        return (int) ((((this.f2743b / 2.0f) + this.f2744c) * 2.0f) + m3711a(4.0f));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        m3716b(canvas);
        m3713a(canvas);
    }

    /* renamed from: a */
    private void m3713a(Canvas canvas) {
        String str;
        canvas.save();
        Paint.FontMetrics fontMetrics = this.f2754m.getFontMetrics();
        if (this.f2750i) {
            str = "" + ((int) Math.ceil((double) mo2434a(this.f2756o, this.f2748g)));
        } else {
            str = this.f2749h;
        }
        if (TextUtils.isEmpty(str)) {
            str = f2742a;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.f2754m);
        canvas.restore();
    }

    /* renamed from: b */
    private void m3716b(Canvas canvas) {
        float f;
        canvas.save();
        float a = mo2435a(this.f2755n, 360);
        if (this.f2746e) {
            f = ((float) this.f2745d) - a;
        } else {
            f = (float) this.f2745d;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f2744c, this.f2752k);
        canvas.drawCircle(0.0f, 0.0f, this.f2744c, this.f2753l);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f2757p, f, a, false, this.f2751j);
        canvas.restore();
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.f2760s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2760s = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f2756o, 0.0f});
        this.f2760s = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f2760s.setDuration((long) (mo2434a(this.f2756o, this.f2748g) * 1000.0f));
        this.f2760s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f2756o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f2760s;
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.f2761t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2761t = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f2755n, 0.0f});
        this.f2761t = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f2761t.setDuration((long) (mo2434a(this.f2755n, this.f2747f) * 1000.0f));
        this.f2761t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f2755n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f2761t;
    }

    /* renamed from: a */
    public void mo2436a() {
        AnimatorSet animatorSet = this.f2759r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f2759r = null;
        }
        ValueAnimator valueAnimator = this.f2762u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2762u = null;
        }
        ValueAnimator valueAnimator2 = this.f2760s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f2760s = null;
        }
        ValueAnimator valueAnimator3 = this.f2761t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f2761t = null;
        }
        this.f2755n = 1.0f;
        this.f2756o = 1.0f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo2436a();
        super.onDetachedFromWindow();
    }

    public void setCountDownTime(int i) {
        float f = (float) i;
        this.f2748g = f;
        this.f2747f = f;
        mo2436a();
    }

    /* renamed from: a */
    private float m3711a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public C0722a getCountdownListener() {
        return this.f2758q;
    }

    public void setCountdownListener(C0722a aVar) {
        this.f2758q = aVar;
    }
}
