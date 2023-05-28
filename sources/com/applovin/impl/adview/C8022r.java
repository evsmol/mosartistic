package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.C7993i;

/* renamed from: com.applovin.impl.adview.r */
public final class C8022r extends C7993i {

    /* renamed from: c */
    private static final Paint f19369c = new Paint(1);

    /* renamed from: d */
    private static final Paint f19370d = new Paint(1);

    /* renamed from: e */
    private final float[] f19371e = {30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};

    /* renamed from: f */
    private Path f19372f;

    public C8022r(Context context) {
        super(context);
        f19369c.setARGB(80, 0, 0, 0);
        f19370d.setColor(-1);
        f19370d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m23808a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f19371e;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f19308a;
                i++;
            } else {
                Path path = new Path();
                this.f19372f = path;
                float[] fArr2 = this.f19371e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f19372f;
                float[] fArr3 = this.f19371e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f19372f;
                float[] fArr4 = this.f19371e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f19372f;
                float[] fArr5 = this.f19371e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f19372f;
                float[] fArr6 = this.f19371e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f19372f;
                float[] fArr7 = this.f19371e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo55738a(int i) {
        setViewScale(((float) i) / 30.0f);
        m23808a();
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f19308a * 2.0f;
    }

    public C7993i.C7994a getStyle() {
        return C7993i.C7994a.TRANSPARENT_SKIP;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f19369c);
        f19370d.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f19372f, f19370d);
    }
}
