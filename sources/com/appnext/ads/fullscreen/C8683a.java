package com.appnext.ads.fullscreen;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/* renamed from: com.appnext.ads.fullscreen.a */
public final class C8683a extends Animation {

    /* renamed from: aA */
    private float f22075aA;

    /* renamed from: ay */
    private Circle f22076ay;

    /* renamed from: az */
    private float f22077az;

    public C8683a(Circle circle, float f) {
        setInterpolator(new LinearInterpolator());
        this.f22077az = circle.getAngle();
        this.f22075aA = f;
        this.f22076ay = circle;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f22077az;
        this.f22076ay.setAngle(f2 - ((f2 - this.f22075aA) * f));
        this.f22076ay.invalidate();
        this.f22076ay.requestLayout();
    }
}
