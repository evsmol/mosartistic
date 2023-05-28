package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

public class ButtonFlash extends TextView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f1256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f1257b;

    /* renamed from: c */
    private Paint f1258c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearGradient f1259d;

    /* renamed from: e */
    private RectF f1260e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Matrix f1261f;

    /* renamed from: g */
    private ValueAnimator f1262g;

    /* renamed from: h */
    private boolean f1263h = true;

    public ButtonFlash(Context context) {
        super(context);
        m1601b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1601b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1601b();
    }

    /* renamed from: b */
    private void m1601b() {
        this.f1260e = new RectF();
        this.f1258c = new Paint();
        m1603c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1256a = i;
        this.f1257b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f1256a) / 2.0f, (float) this.f1257b, new int[]{16777215, 1358954495, 16777215}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f1259d = linearGradient;
        this.f1258c.setShader(linearGradient);
        this.f1258c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f1261f = matrix;
        matrix.setTranslate((float) (-this.f1256a), (float) this.f1257b);
        this.f1259d.setLocalMatrix(this.f1261f);
        this.f1260e.set(0.0f, 0.0f, (float) this.f1256a, (float) this.f1257b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1261f != null) {
            canvas.drawRoundRect(this.f1260e, 100.0f, 100.0f, this.f1258c);
        }
    }

    /* renamed from: c */
    private void m1603c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1262g = ofFloat;
        ofFloat.setDuration(3000);
        this.f1262g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float a = (((float) (ButtonFlash.this.f1256a * 2)) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ((float) ButtonFlash.this.f1256a);
                if (ButtonFlash.this.f1261f != null) {
                    ButtonFlash.this.f1261f.setTranslate(a, (float) ButtonFlash.this.f1257b);
                }
                if (ButtonFlash.this.f1259d != null) {
                    ButtonFlash.this.f1259d.setLocalMatrix(ButtonFlash.this.f1261f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f1263h) {
            this.f1262g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f1262g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.f1263h = z;
    }

    /* renamed from: a */
    public void mo1040a() {
        ValueAnimator valueAnimator = this.f1262g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            invalidate();
        }
    }
}
