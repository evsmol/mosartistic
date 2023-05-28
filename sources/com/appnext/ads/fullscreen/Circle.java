package com.appnext.ads.fullscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.appnext.core.C8917f;

public class Circle extends View {

    /* renamed from: au */
    private static final int f22045au = 180;

    /* renamed from: av */
    private Paint f22046av;

    /* renamed from: aw */
    private RectF f22047aw;

    /* renamed from: ax */
    private float f22048ax;

    public Circle(Context context) {
        super(context);
        init(context);
    }

    public Circle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f22047aw, 180.0f, this.f22048ax, false, this.f22046av);
    }

    public float getAngle() {
        return this.f22048ax;
    }

    public void setAngle(float f) {
        this.f22048ax = f;
    }

    /* renamed from: a */
    private static int m26341a(Context context, float f) {
        return C8917f.m26915a(context, f);
    }

    private void init(Context context) {
        float a = (float) C8917f.m26915a(context, 5.0f);
        Paint paint = new Paint();
        this.f22046av = paint;
        paint.setAntiAlias(true);
        this.f22046av.setStyle(Paint.Style.STROKE);
        this.f22046av.setStrokeWidth(a);
        this.f22046av.setColor(-1);
        this.f22046av.setShadowLayer(2.0f, 2.0f, 2.0f, Color.argb(128, 0, 0, 0));
        setLayerType(1, this.f22046av);
        this.f22047aw = new RectF(a, a, ((float) C8917f.m26915a(context, 20.0f)) + a, ((float) C8917f.m26915a(context, 20.0f)) + a);
        this.f22048ax = 360.0f;
    }
}
