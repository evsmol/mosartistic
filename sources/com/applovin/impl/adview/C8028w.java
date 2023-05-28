package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.C7993i;

/* renamed from: com.applovin.impl.adview.w */
public final class C8028w extends C7993i {

    /* renamed from: c */
    private static final Paint f19386c = new Paint(1);

    /* renamed from: d */
    private static final Paint f19387d = new Paint(1);

    /* renamed from: e */
    private static final Paint f19388e = new Paint(1);

    public C8028w(Context context) {
        super(context);
        f19386c.setColor(-1);
        f19387d.setColor(-16777216);
        f19388e.setColor(-1);
        f19388e.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f19308a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f19308a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f19308a * 3.0f;
    }

    public C7993i.C7994a getStyle() {
        return C7993i.C7994a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f19386c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f19387d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f19388e.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f19388e);
        canvas2.drawLine(f, size, f2, crossOffset, f19388e);
    }
}
