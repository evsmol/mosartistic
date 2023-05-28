package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f25958a;

    /* renamed from: b */
    private RectF f25959b;

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25959b.right != ((float) getMeasuredWidth()) || this.f25959b.bottom != ((float) getMeasuredHeight())) {
            this.f25959b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f25959b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f25959b.bottom / 2.0f, this.f25958a);
        super.onDraw(canvas);
    }
}
