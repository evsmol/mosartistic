package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.bytedance.sdk.component.adexpress.widget.a */
/* compiled from: CubicBezierInterpolator */
public class C10443a implements Interpolator {

    /* renamed from: a */
    private int f26040a = 0;

    /* renamed from: b */
    private final PointF f26041b = new PointF();

    /* renamed from: c */
    private final PointF f26042c = new PointF();

    /* renamed from: d */
    private float f26043d = 0.0f;

    /* renamed from: a */
    public static double m30440a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        return (d4 * d4 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d);
    }

    public C10443a(float f, float f2, float f3, float f4) {
        this.f26041b.x = f;
        this.f26041b.y = f2;
        this.f26042c.x = f3;
        this.f26042c.y = f4;
    }

    public float getInterpolation(float f) {
        if (f < ((float) this.f26040a)) {
            this.f26040a = 0;
        }
        int i = this.f26040a;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = ((float) i) * 2.4414062E-4f;
            if (m30440a((double) f2, (double) this.f26041b.x, (double) this.f26042c.x) >= ((double) f)) {
                this.f26040a = i;
                break;
            }
            i++;
        }
        return (float) m30440a((double) f2, (double) this.f26041b.y, (double) this.f26042c.y);
    }
}
