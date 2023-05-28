package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.p254c.C8380b;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.o */
public class C8615o implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final int f21749a;

    /* renamed from: b */
    private final float f21750b;

    /* renamed from: c */
    private final SensorManager f21751c;

    /* renamed from: d */
    private final Sensor f21752d;

    /* renamed from: e */
    private final Sensor f21753e = this.f21751c.getDefaultSensor(4);

    /* renamed from: f */
    private final C8490n f21754f;

    /* renamed from: g */
    private float[] f21755g;

    /* renamed from: h */
    private float f21756h;

    public C8615o(C8490n nVar) {
        this.f21754f = nVar;
        SensorManager sensorManager = (SensorManager) nVar.mo57332P().getSystemService("sensor");
        this.f21751c = sensorManager;
        this.f21752d = sensorManager.getDefaultSensor(9);
        this.f21749a = ((Integer) nVar.mo57342a(C8380b.f20934ea)).intValue();
        this.f21750b = ((Float) nVar.mo57342a(C8380b.f20881dZ)).floatValue();
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* renamed from: a */
    public void mo57774a() {
        this.f21751c.unregisterListener(this);
        if (((Boolean) this.f21754f.mo57331O().mo57089a(C8380b.f20879dX)).booleanValue()) {
            this.f21751c.registerListener(this, this.f21752d, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f21749a));
        }
        if (((Boolean) this.f21754f.mo57331O().mo57089a(C8380b.f20880dY)).booleanValue()) {
            this.f21751c.registerListener(this, this.f21753e, (int) TimeUnit.MILLISECONDS.toMicros((long) this.f21749a));
        }
    }

    /* renamed from: b */
    public float mo57775b() {
        return this.f21756h;
    }

    /* renamed from: c */
    public float mo57776c() {
        float[] fArr = this.f21755g;
        if (fArr == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos((double) (fArr[2] / 9.81f)));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21751c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            mo57774a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f21755g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.f21756h * this.f21750b;
            this.f21756h = f;
            this.f21756h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
