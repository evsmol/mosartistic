package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f2730a;

    /* renamed from: b */
    private RectF f2731b;

    public ShadowImageView(Context context) {
        super(context);
        m3707a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3707a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3707a();
    }

    /* renamed from: a */
    private void m3707a() {
        Paint paint = new Paint();
        this.f2730a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2730a.setColor(Color.parseColor("#99333333"));
        this.f2730a.setAntiAlias(true);
        this.f2730a.setStrokeWidth(0.0f);
        this.f2731b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2731b.right != ((float) getMeasuredWidth()) || this.f2731b.bottom != ((float) getMeasuredHeight())) {
            this.f2731b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f2731b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f2731b.bottom / 2.0f, this.f2730a);
        super.onDraw(canvas);
    }
}
