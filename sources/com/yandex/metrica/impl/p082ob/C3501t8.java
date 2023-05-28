package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p082ob.C3084j8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.t8 */
public class C3501t8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL(C3084j8.C3085a.C3087b.f8124a);
        sQLiteDatabase.execSQL(C3084j8.C3085a.C3086a.f8122a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
