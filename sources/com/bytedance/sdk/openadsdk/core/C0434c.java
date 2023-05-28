package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;

/* renamed from: com.bytedance.sdk.openadsdk.core.c */
/* compiled from: AdPreference */
public class C0434c {

    /* renamed from: a */
    private static volatile C0434c f1456a;

    /* renamed from: b */
    private final SharedPreferences f1457b;

    private C0434c(Context context) {
        this.f1457b = context.getSharedPreferences("ttopenadsdk", 0);
    }

    /* renamed from: a */
    public static C0434c m1779a(Context context) {
        Class<C0434c> cls = C0434c.class;
        if (f1456a == null) {
            synchronized (cls) {
                if (f1456a == null) {
                    f1456a = new C0434c(context);
                }
            }
        }
        return f1456a;
    }

    /* renamed from: a */
    public void mo1174a(String str, int i) {
        if (C0934b.m4334c()) {
            C0947a.m4402a("ttopenadsdk", str, Integer.valueOf(i));
        } else {
            this.f1457b.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: a */
    public void mo1175a(String str, long j) {
        if (C0934b.m4334c()) {
            C0947a.m4403a("ttopenadsdk", str, Long.valueOf(j));
        } else {
            this.f1457b.edit().putLong(str, j).apply();
        }
    }

    /* renamed from: a */
    public void mo1176a(String str, String str2) {
        if (C0934b.m4334c()) {
            C0947a.m4404a("ttopenadsdk", str, str2);
        } else {
            this.f1457b.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public void mo1177a(String str, boolean z) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("ttopenadsdk", str, Boolean.valueOf(z));
        } else {
            this.f1457b.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: b */
    public int mo1178b(String str, int i) {
        return C0934b.m4334c() ? C0947a.m4395a("ttopenadsdk", str, i) : this.f1457b.getInt(str, i);
    }

    /* renamed from: b */
    public Long mo1179b(String str, long j) {
        return Long.valueOf(C0934b.m4334c() ? C0947a.m4396a("ttopenadsdk", str, j) : this.f1457b.getLong(str, j));
    }

    /* renamed from: b */
    public String mo1180b(String str, String str2) {
        return C0934b.m4334c() ? C0947a.m4410b("ttopenadsdk", str, str2) : this.f1457b.getString(str, str2);
    }

    /* renamed from: b */
    public boolean mo1181b(String str, boolean z) {
        return C0934b.m4334c() ? C0947a.m4407a("ttopenadsdk", str, z) : this.f1457b.getBoolean(str, z);
    }
}
