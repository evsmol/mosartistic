package com.yandex.metrica.impl.p082ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.V7 */
public class C2655V7 {

    /* renamed from: a */
    private final C2988g8 f7047a;

    public C2655V7(C2368O7 o7, String str) {
        this((C2988g8) new C3053i8(o7), str);
    }

    /* renamed from: a */
    public void mo16967a() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f7047a.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f7047a.mo17629a(sQLiteDatabase);
    }

    /* renamed from: b */
    public List<C1892Bd> mo16968b() {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f7047a.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("permissions", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C1892Bd(cursor.getString(cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)), cursor.getLong(cursor.getColumnIndex("granted")) == 1));
                                } while (cursor.moveToNext());
                                this.f7047a.mo17629a(sQLiteDatabase);
                                C1848A2.m6805a(cursor);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
                this.f7047a.mo17629a(sQLiteDatabase);
                C1848A2.m6805a(cursor);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
            cursor = null;
        }
        this.f7047a.mo17629a(sQLiteDatabase);
        C1848A2.m6805a(cursor);
        return null;
    }

    C2655V7(C2988g8 g8Var, String str) {
        this.f7047a = g8Var;
    }
}
