package com.bytedance.sdk.openadsdk.p000b;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.bytedance.sdk.openadsdk.b.m */
/* compiled from: HighPriorityEventRepertoryImpl */
public class C0149m extends C0140g {
    /* renamed from: d */
    public String mo412d() {
        return "loghighpriority";
    }

    public C0149m(Context context) {
        super(context);
    }

    /* renamed from: f */
    public static String m701f() {
        return "CREATE TABLE IF NOT EXISTS " + "loghighpriority" + " (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id" + " TEXT UNIQUE," + AppMeasurementSdk.ConditionalUserProperty.VALUE + " TEXT ," + "gen_time" + " TEXT , " + "retry" + " INTEGER default 0" + ")";
    }
}
