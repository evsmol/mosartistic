package com.applovin.exoplayer2.p222m.p223a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: com.applovin.exoplayer2.m.a.d */
final class C7780d implements SensorEventListener {

    /* renamed from: a */
    private final float[] f18370a;

    /* renamed from: b */
    private final float[] f18371b;

    /* renamed from: c */
    private final float[] f18372c;

    /* renamed from: d */
    private final float[] f18373d;

    /* renamed from: e */
    private final Display f18374e;

    /* renamed from: f */
    private final C7781a[] f18375f;

    /* renamed from: g */
    private boolean f18376g;

    /* renamed from: com.applovin.exoplayer2.m.a.d$a */
    public interface C7781a {
        /* renamed from: a */
        void mo55135a(float[] fArr, float f);
    }

    /* renamed from: a */
    private void m22516a(float[] fArr) {
        if (!this.f18376g) {
            C7779c.m22513a(this.f18372c, fArr);
            this.f18376g = true;
        }
        float[] fArr2 = this.f18371b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f18371b, 0, this.f18372c, 0);
    }

    /* renamed from: a */
    private void m22517a(float[] fArr, float f) {
        for (C7781a a : this.f18375f) {
            a.mo55135a(fArr, f);
        }
    }

    /* renamed from: a */
    private void m22518a(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 130;
            int i3 = 129;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 129;
                i3 = 130;
            } else if (i == 3) {
                i3 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f18371b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f18371b, i2, i3, fArr);
        }
    }

    /* renamed from: b */
    private float m22519b(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f18371b);
        SensorManager.getOrientation(this.f18371b, this.f18373d);
        return this.f18373d[2];
    }

    /* renamed from: c */
    private static void m22520c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f18370a, sensorEvent.values);
        m22518a(this.f18370a, this.f18374e.getRotation());
        float b = m22519b(this.f18370a);
        m22520c(this.f18370a);
        m22516a(this.f18370a);
        m22517a(this.f18370a, b);
    }
}
