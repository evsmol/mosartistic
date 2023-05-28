package com.criteo.publisher.p074n0;

import android.content.SharedPreferences;

/* renamed from: com.criteo.publisher.n0.q */
/* compiled from: SafeSharedPreferences */
public class C1313q {

    /* renamed from: a */
    private final SharedPreferences f4029a;

    public C1313q(SharedPreferences sharedPreferences) {
        this.f4029a = sharedPreferences;
    }

    /* renamed from: a */
    public String mo3662a(String str, String str2) {
        try {
            return this.f4029a.getString(str, str2);
        } catch (ClassCastException e) {
            C1311o.m5779a((Throwable) new IllegalStateException("Expected a String type when reading: " + str, e));
            return str2;
        }
    }

    /* renamed from: a */
    public int mo3661a(String str, int i) {
        try {
            return this.f4029a.getInt(str, i);
        } catch (ClassCastException e) {
            C1311o.m5779a((Throwable) new IllegalStateException("Expect an int type when reading " + str, e));
            return i;
        }
    }
}
