package com.bytedance.sdk.openadsdk.p048j;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;

/* renamed from: com.bytedance.sdk.openadsdk.j.i */
/* compiled from: SensorHub */
public class C0882i {

    /* renamed from: a */
    private static SensorManager f3167a;

    /* renamed from: a */
    private static int m4230a(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 2;
    }

    /* renamed from: b */
    private static SensorManager m4234b(Context context) {
        if (f3167a == null) {
            synchronized (C0882i.class) {
                if (f3167a == null) {
                    f3167a = (SensorManager) context.getSystemService("sensor");
                }
            }
        }
        return f3167a;
    }

    /* renamed from: a */
    public static void m4233a(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m4234b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(1), m4230a(i));
            } catch (Throwable th) {
                C0869f.m4155a("SensorHub", "startListenAccelerometer error", th);
            }
        }
    }

    /* renamed from: b */
    public static void m4235b(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener != null && context != null) {
            try {
                SensorManager b = m4234b(context);
                b.registerListener(sensorEventListener, b.getDefaultSensor(4), m4230a(i));
            } catch (Throwable th) {
                C0869f.m4155a("SensorHub", "startListenGyroscope error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m4232a(Context context, SensorEventListener sensorEventListener) {
        if (sensorEventListener != null && context != null) {
            try {
                m4234b(context).unregisterListener(sensorEventListener);
            } catch (Throwable th) {
                C0869f.m4155a("SensorHub", "stopListen error", th);
            }
        }
    }

    /* renamed from: a */
    public static void m4231a(Context context) {
        if (context != null) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(300);
        }
    }
}
