package com.applovin.exoplayer2.p222m.p223a;

import android.opengl.Matrix;
import com.applovin.exoplayer2.p221l.C7725af;

/* renamed from: com.applovin.exoplayer2.m.a.c */
final class C7779c {

    /* renamed from: a */
    private final C7725af<float[]> f18368a;

    /* renamed from: b */
    private boolean f18369b;

    /* renamed from: a */
    public static void m22513a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    /* renamed from: a */
    public void mo55131a() {
        this.f18368a.mo54982a();
        this.f18369b = false;
    }

    /* renamed from: a */
    public void mo55132a(long j, float[] fArr) {
        this.f18368a.mo54983a(j, fArr);
    }
}
