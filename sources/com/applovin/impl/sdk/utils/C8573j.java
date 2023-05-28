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
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.j */
public class C8573j implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C8490n f21651a;

    /* renamed from: b */
    private final SensorManager f21652b;

    /* renamed from: c */
    private final Sensor f21653c;

    /* renamed from: d */
    private final C8574a f21654d;

    /* renamed from: e */
    private float f21655e;

    /* renamed from: com.applovin.impl.sdk.utils.j$a */
    public interface C8574a {
        /* renamed from: d */
        void mo55457d();

        /* renamed from: e */
        void mo55458e();
    }

    public C8573j(C8490n nVar, C8574a aVar) {
        this.f21651a = nVar;
        SensorManager sensorManager = (SensorManager) nVar.mo57332P().getSystemService("sensor");
        this.f21652b = sensorManager;
        this.f21653c = sensorManager.getDefaultSensor(1);
        this.f21654d = aVar;
    }

    /* renamed from: a */
    public void mo57702a() {
        this.f21652b.unregisterListener(this);
        this.f21652b.registerListener(this, this.f21653c, (int) TimeUnit.MILLISECONDS.toMicros(50));
        this.f21651a.mo57372am().unregisterReceiver(this);
        this.f21651a.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        this.f21651a.mo57372am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21652b.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            mo57702a();
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float max = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f = this.f21655e;
            float f2 = (f * 0.5f) + (max * 0.5f);
            this.f21655e = f2;
            if (f < 0.8f && f2 > 0.8f) {
                this.f21654d.mo55458e();
            } else if (f > -0.8f && this.f21655e < -0.8f) {
                this.f21654d.mo55457d();
            }
        }
    }
}
