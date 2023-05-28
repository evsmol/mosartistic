package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vm */
public class C3596vm {

    /* renamed from: a */
    private final Context f9354a;

    public C3596vm(Context context) {
        this.f9354a = context;
    }

    /* renamed from: a */
    public byte[] mo18343a() {
        try {
            return C2572Tl.m8535b(new StringBuilder(this.f9354a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public byte[] mo18344b() {
        try {
            return C2572Tl.m8535b(this.f9354a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
