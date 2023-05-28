package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C6288e0;

/* renamed from: com.adcolony.sdk.p */
class C6400p {
    /* renamed from: a */
    static void m15604a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            sQLiteDatabase.insertOrThrow(str, (String) null, contentValues);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                C6288e0.C6289a aVar = new C6288e0.C6289a();
                C6288e0.C6289a a = aVar.mo50644a("Exception on insert to " + str + ", db version:").mo50642a(sQLiteDatabase.getVersion());
                a.mo50644a(". Values: " + contentValues.toString() + " caused: ").mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
            } catch (Throwable th) {
                C6288e0.C6289a aVar2 = new C6288e0.C6289a();
                C6288e0.C6289a a2 = aVar2.mo50644a("Error on insert to " + str + ", db version:").mo50642a(sQLiteDatabase.getVersion());
                a2.mo50644a(". Values: " + contentValues.toString() + " caused: ").mo50644a(th.toString()).mo50645a(C6288e0.f13498i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }

    /* renamed from: a */
    static void m15603a(int i, long j, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            if (str == null) {
                str = "rowid";
                j = -1;
            }
            if (i >= 0) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, (String[]) null);
                if (rawQuery.moveToFirst()) {
                    j = Math.max(j, rawQuery.getLong(0));
                }
                rawQuery.close();
            }
            if (j >= 0) {
                sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } catch (SQLException e) {
            try {
                new C6288e0.C6289a().mo50644a("Exception on deleting excessive rows:").mo50644a(e.toString()).mo50645a(C6288e0.f13496g);
            } catch (Throwable th) {
                new C6288e0.C6289a().mo50644a("Error on deleting excessive rows:").mo50644a(th.toString()).mo50645a(C6288e0.f13498i);
                return;
            }
        }
        sQLiteDatabase.endTransaction();
    }
}
