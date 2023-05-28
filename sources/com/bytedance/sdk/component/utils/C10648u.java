package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.utils.u */
/* compiled from: SPUtils */
public class C10648u {

    /* renamed from: a */
    private static Map<String, C10648u> f26534a = new HashMap();

    /* renamed from: b */
    private SharedPreferences f26535b;

    /* renamed from: a */
    public static C10648u m31293a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        C10648u uVar = f26534a.get(str);
        if (uVar != null) {
            return uVar;
        }
        C10648u uVar2 = new C10648u(str, context);
        f26534a.put(str, uVar2);
        return uVar2;
    }

    private C10648u(String str, Context context) {
        if (context != null) {
            this.f26535b = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public void mo64275a(String str, String str2) {
        try {
            this.f26535b.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String mo64271a(String str) {
        try {
            return mo64282b(str, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo64282b(String str, String str2) {
        try {
            return this.f26535b.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public void mo64273a(String str, int i) {
        try {
            this.f26535b.edit().putInt(str, i).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public int mo64279b(String str) {
        return mo64280b(str, -1);
    }

    /* renamed from: b */
    public int mo64280b(String str, int i) {
        try {
            return this.f26535b.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo64274a(String str, long j) {
        try {
            this.f26535b.edit().putLong(str, j).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long mo64281b(String str, long j) {
        try {
            return this.f26535b.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: a */
    public void mo64272a(String str, float f) {
        try {
            this.f26535b.edit().putFloat(str, f).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public float mo64278b(String str, float f) {
        try {
            return this.f26535b.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    /* renamed from: a */
    public void mo64277a(String str, boolean z) {
        try {
            this.f26535b.edit().putBoolean(str, z).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo64284b(String str, boolean z) {
        try {
            return this.f26535b.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public void mo64276a(String str, Set<String> set) {
        try {
            this.f26535b.edit().putStringSet(str, set).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public Set<String> mo64283b(String str, Set<String> set) {
        try {
            return this.f26535b.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    /* renamed from: c */
    public void mo64285c(String str) {
        try {
            this.f26535b.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
