package com.bytedance.sdk.openadsdk.p000b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.bytedance.sdk.openadsdk.b.q */
/* compiled from: StatsBatchEventRepertoryImpl */
public class C0160q extends C0162s {
    /* renamed from: c */
    public String mo456c() {
        return "logstatsbatch";
    }

    public C0160q(Context context) {
        super(context);
    }

    /* renamed from: b */
    public int mo409b() {
        return this.f614a.mo1178b("stats_serverbusy_retrycount", 0);
    }

    /* renamed from: a */
    public void mo402a(int i) {
        this.f614a.mo1174a("stats_serverbusy_retrycount", i);
    }

    /* renamed from: d */
    public static String m740d() {
        return "CREATE TABLE IF NOT EXISTS " + "logstatsbatch" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }
}
