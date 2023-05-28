package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;

public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a */
    private Path f2724a;

    /* renamed from: b */
    private Paint f2725b;

    /* renamed from: c */
    private RectF f2726c;

    /* renamed from: d */
    private float[] f2727d;

    public RoundFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2724a = new Path();
        this.f2726c = new RectF();
        Paint paint = new Paint();
        this.f2725b = paint;
        paint.setAntiAlias(true);
        this.f2725b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f2727d = new float[8];
    }

    /* renamed from: a */
    public void mo2417a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f2727d;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f4;
        fArr[5] = f4;
        fArr[6] = f3;
        fArr[7] = f3;
        postInvalidate();
    }

    public void setRadius(float f) {
        Arrays.fill(this.f2727d, f);
        postInvalidate();
    }

    public void setTopLeftRadius(float f) {
        float[] fArr = this.f2727d;
        fArr[0] = f;
        fArr[1] = f;
        postInvalidate();
    }

    public void setTopRightRadius(float f) {
        float[] fArr = this.f2727d;
        fArr[2] = f;
        fArr[3] = f;
        postInvalidate();
    }

    public void setBottomRightRadius(float f) {
        float[] fArr = this.f2727d;
        fArr[5] = f;
        fArr[6] = f;
        postInvalidate();
    }

    public void setBottomLeftRadius(float f) {
        float[] fArr = this.f2727d;
        fArr[6] = f;
        fArr[7] = f;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2726c.set(0.0f, 0.0f, (float) i, (float) i2);
    }

    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(m3704a());
            super.draw(canvas);
        } else {
            canvas.saveLayer(this.f2726c, (Paint) null, 31);
            super.draw(canvas);
            canvas.drawPath(m3704a(), this.f2725b);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(m3704a());
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(this.f2726c, (Paint) null, 31);
            super.dispatchDraw(canvas);
            canvas.drawPath(m3704a(), this.f2725b);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private Path m3704a() {
        this.f2724a.reset();
        this.f2724a.addRoundRect(this.f2726c, this.f2727d, Path.Direction.CW);
        return this.f2724a;
    }
}
