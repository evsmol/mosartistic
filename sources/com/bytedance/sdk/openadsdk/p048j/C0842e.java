package com.bytedance.sdk.openadsdk.p048j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.j.e */
/* compiled from: PlayableJsBridge */
public class C0842e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f3065a;

    /* renamed from: b */
    private WeakReference<C0871g> f3066b;

    /* renamed from: c */
    private Map<String, C0868a> f3067c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SensorEventListener f3068d = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C0871g a;
            if (sensorEvent.sensor.getType() == 1 && (a = C0842e.this.m4123d()) != null) {
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) f);
                    jSONObject.put("y", (double) f2);
                    jSONObject.put("z", (double) f3);
                    a.mo2689a("accelerometer_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SensorEventListener f3069e = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C0871g a;
            if (sensorEvent.sensor.getType() == 4 && (a = C0842e.this.m4123d()) != null) {
                float degrees = (float) Math.toDegrees((double) sensorEvent.values[0]);
                float degrees2 = (float) Math.toDegrees((double) sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees((double) sensorEvent.values[2]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) degrees);
                    jSONObject.put("y", (double) degrees2);
                    jSONObject.put("z", (double) degrees3);
                    a.mo2689a("gyro_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.j.e$a */
    /* compiled from: PlayableJsBridge */
    interface C0868a {
        /* renamed from: a */
        JSONObject mo2678a(JSONObject jSONObject) throws Throwable;
    }

    public C0842e(C0871g gVar) {
        this.f3065a = gVar.mo2681a();
        this.f3066b = new WeakReference<>(gVar);
        m4121c();
    }

    /* renamed from: a */
    public Set<String> mo2673a() {
        return this.f3067c.keySet();
    }

    /* renamed from: c */
    private void m4121c() {
        this.f3067c.put("adInfo", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) {
                C0871g a = C0842e.this.m4123d();
                if (a != null) {
                    return a.mo2719n();
                }
                return null;
            }
        });
        this.f3067c.put("appInfo", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                JSONArray jSONArray = new JSONArray();
                for (String put : C0842e.this.mo2673a()) {
                    jSONArray.put(put);
                }
                jSONObject2.put("supportList", jSONArray);
                C0871g a = C0842e.this.m4123d();
                if (a != null) {
                    jSONObject2.put("deviceId", a.mo2709g());
                    jSONObject2.put("netType", a.mo2716k());
                    jSONObject2.put("innerAppName", a.mo2702d());
                    jSONObject2.put("appName", a.mo2705e());
                    jSONObject2.put("appVersion", a.mo2708f());
                    Map<String, String> b = a.mo2693b();
                    for (String next : b.keySet()) {
                        jSONObject2.put(next, b.get(next));
                    }
                }
                return jSONObject2;
            }
        });
        this.f3067c.put("playableSDKInfo", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.f3067c.put("subscribe_app_ad", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) {
                C0836a b = C0842e.this.m4125e();
                if (b == null) {
                    return null;
                }
                b.mo211a(jSONObject);
                return null;
            }
        });
        this.f3067c.put("download_app_ad", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) {
                C0836a b = C0842e.this.m4125e();
                if (b == null) {
                    return null;
                }
                b.mo213b(jSONObject);
                return null;
            }
        });
        this.f3067c.put("isViewable", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewStatus", a.mo2714i());
                return jSONObject2;
            }
        });
        this.f3067c.put("getVolume", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endcard_mute", a.mo2712h());
                return jSONObject2;
            }
        });
        this.f3067c.put("getScreenSize", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return new JSONObject();
                }
                return a.mo2718m();
            }
        });
        this.f3067c.put("start_accelerometer_observer", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C0869f.m4155a("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C0882i.m4233a(C0842e.this.f3065a, C0842e.this.f3068d, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f3067c.put("close_accelerometer_observer", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C0882i.m4232a(C0842e.this.f3065a, C0842e.this.f3068d);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C0869f.m4155a("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f3067c.put("start_gyro_observer", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C0869f.m4155a("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C0882i.m4235b(C0842e.this.f3065a, C0842e.this.f3069e, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f3067c.put("close_gyro_observer", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C0882i.m4232a(C0842e.this.f3065a, C0842e.this.f3069e);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C0869f.m4155a("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f3067c.put("device_shake", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C0882i.m4231a(C0842e.this.f3065a);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C0869f.m4155a("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f3067c.put("playable_style", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a != null) {
                    return a.mo2698c();
                }
                return null;
            }
        });
        this.f3067c.put("sendReward", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2721p();
                return null;
            }
        });
        this.f3067c.put("webview_time_track", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                return null;
            }
        });
        this.f3067c.put("playable_event", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null || jSONObject == null) {
                    return null;
                }
                a.mo2694b(jSONObject.optString("event", (String) null), jSONObject.optJSONObject("params"));
                return null;
            }
        });
        this.f3067c.put("reportAd", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2700c(jSONObject);
                return null;
            }
        });
        this.f3067c.put("close", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2703d(jSONObject);
                return null;
            }
        });
        this.f3067c.put("openAdLandPageLinks", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2706e(jSONObject);
                return null;
            }
        });
        this.f3067c.put("get_viewport", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                return a.mo2720o();
            }
        });
        this.f3067c.put("jssdk_load_finish", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2724s();
                return null;
            }
        });
        this.f3067c.put("material_render_result", new C0868a() {
            /* renamed from: a */
            public JSONObject mo2678a(JSONObject jSONObject) throws Throwable {
                C0871g a = C0842e.this.m4123d();
                if (a == null) {
                    return null;
                }
                a.mo2695b(jSONObject);
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0871g m4123d() {
        WeakReference<C0871g> weakReference = this.f3066b;
        if (weakReference == null) {
            return null;
        }
        return (C0871g) weakReference.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C0836a m4125e() {
        C0871g d = m4123d();
        if (d == null) {
            return null;
        }
        return d.mo2717l();
    }

    /* renamed from: a */
    public JSONObject mo2674a(String str, JSONObject jSONObject) {
        try {
            C0868a aVar = this.f3067c.get(str);
            if (aVar == null) {
                return null;
            }
            return aVar.mo2678a(jSONObject);
        } catch (Throwable th) {
            C0869f.m4155a("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    /* renamed from: b */
    public void mo2675b() {
        C0882i.m4232a(this.f3065a, this.f3068d);
        C0882i.m4232a(this.f3065a, this.f3069e);
    }
}
