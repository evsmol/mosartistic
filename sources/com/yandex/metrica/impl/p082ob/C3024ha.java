package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.yandex.metrica.impl.ob.ha */
class C3024ha implements C2476R7 {

    /* renamed from: a */
    private final C2988g8 f7958a;

    public C3024ha(C2988g8 g8Var, String str) {
        this.f7958a = g8Var;
    }

    /* renamed from: a */
    public void mo16552a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f7958a.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, bArr);
                    sQLiteDatabase.insertWithOnConflict("binary_data", (String) null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            this.f7958a.mo17629a(sQLiteDatabase);
        }
        this.f7958a.mo17629a(sQLiteDatabase);
    }

    /* renamed from: b */
    public void mo16554b(String str) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f7958a.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabase.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f7958a.mo17629a(sQLiteDatabase);
    }

    /* renamed from: a */
    public byte[] mo16553a(String str) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f7958a.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    cursor = sQLiteDatabase.query("binary_data", (String[]) null, "data_key = ?", new String[]{str}, (String) null, (String) null, (String) null);
                    if (cursor != null) {
                        try {
                            if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                                byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                                C1848A2.m6805a(cursor);
                                this.f7958a.mo17629a(sQLiteDatabase);
                                return blob;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (cursor != null) {
                        cursor.getCount();
                    }
                } catch (Throwable unused2) {
                }
                C1848A2.m6805a(cursor);
                this.f7958a.mo17629a(sQLiteDatabase);
                return null;
            }
            cursor = null;
        } catch (Throwable unused3) {
            cursor = null;
            sQLiteDatabase = null;
        }
        C1848A2.m6805a(cursor);
        this.f7958a.mo17629a(sQLiteDatabase);
        return null;
    }
}
