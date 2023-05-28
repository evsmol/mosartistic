package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.C7993i;

/* renamed from: com.applovin.impl.adview.q */
public final class C8021q extends C7993i {

    /* renamed from: c */
    private static final Paint f19367c = new Paint(1);

    /* renamed from: d */
    private static final Paint f19368d = new Paint(1);

    public C8021q(Context context) {
        super(context);
        f19367c.setARGB(80, 0, 0, 0);
        f19368d.setColor(-1);
        f19368d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo55738a(int i) {
        setViewScale(((float) i) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f19308a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f19308a * 2.0f;
    }

    public C7993i.C7994a getStyle() {
        return C7993i.C7994a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f19367c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f19368d.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f19368d);
        canvas2.drawLine(f, size, f2, crossOffset, f19368d);
    }
}
