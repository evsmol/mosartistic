package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* renamed from: com.bytedance.sdk.component.utils.v */
/* compiled from: ShakeUtils */
public class C10649v implements SensorEventListener {

    /* renamed from: a */
    private long f26536a = 2000;

    /* renamed from: b */
    private volatile long f26537b;

    /* renamed from: c */
    private float f26538c;

    /* renamed from: d */
    private float f26539d;

    /* renamed from: e */
    private float f26540e;

    /* renamed from: f */
    private boolean f26541f = false;

    /* renamed from: g */
    private volatile long f26542g;

    /* renamed from: h */
    private float f26543h = 20.0f;

    /* renamed from: i */
    private float f26544i = 50.0f;

    /* renamed from: j */
    private boolean f26545j;

    /* renamed from: k */
    private SensorManager f26546k = null;

    /* renamed from: l */
    private C10650a f26547l = null;

    /* renamed from: com.bytedance.sdk.component.utils.v$a */
    /* compiled from: ShakeUtils */
    public interface C10650a {
        /* renamed from: a */
        void mo63805a(int i);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C10649v(Context context) {
        this.f26546k = (SensorManager) context.getSystemService("sensor");
    }

    /* renamed from: a */
    public void mo64288a(C10650a aVar) {
        this.f26547l = aVar;
    }

    /* renamed from: a */
    public void mo64286a() {
        SensorManager sensorManager = this.f26546k;
        if (sensorManager != null && !this.f26545j) {
            try {
                this.f26541f = false;
                sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
                if (Build.VERSION.SDK_INT > 18) {
                    this.f26546k.registerListener(this, this.f26546k.getDefaultSensor(15), 1);
                }
                this.f26545j = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo64289b() {
        SensorManager sensorManager = this.f26546k;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f26545j = false;
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[1]);
        float abs3 = Math.abs(fArr[2]);
        if (type == 1) {
            float f = this.f26543h;
            if ((abs > f || abs2 > f || abs3 > f) && this.f26547l != null && System.currentTimeMillis() - this.f26537b > this.f26536a) {
                this.f26547l.mo63805a(1);
                this.f26537b = System.currentTimeMillis();
            }
        } else if (type == 15) {
            float abs4 = Math.abs(fArr[0]);
            float abs5 = Math.abs(fArr[1]);
            float abs6 = Math.abs(fArr[2]);
            if (abs4 != 0.0f || abs5 != 0.0f || abs6 != 0.0f) {
                if (!this.f26541f) {
                    this.f26541f = true;
                    this.f26538c = abs4;
                    this.f26539d = abs5;
                    this.f26540e = abs6;
                    return;
                }
                float abs7 = Math.abs(abs5 - this.f26539d) * 180.0f;
                float abs8 = Math.abs(abs6 - this.f26540e) * 180.0f;
                float f2 = this.f26544i;
                if ((Math.abs(abs4 - this.f26538c) * 180.0f > f2 || abs7 > f2 || abs8 > f2) && this.f26547l != null && System.currentTimeMillis() - this.f26542g > this.f26536a) {
                    this.f26547l.mo63805a(2);
                    this.f26542g = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo64287a(float f) {
        this.f26543h = f;
    }

    /* renamed from: b */
    public void mo64290b(float f) {
        this.f26544i = f;
    }
}
