package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.i8 */
public class C3053i8 implements C2988g8 {

    /* renamed from: a */
    private final C2368O7 f8042a;

    public C3053i8(C2368O7 o7) {
        this.f8042a = o7;
    }

    /* renamed from: a */
    public SQLiteDatabase mo17628a() {
        try {
            return this.f8042a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo17629a(SQLiteDatabase sQLiteDatabase) {
    }
}
