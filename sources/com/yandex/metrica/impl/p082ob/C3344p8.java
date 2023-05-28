package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p082ob.C3084j8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.p8 */
public class C3344p8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(C3084j8.C3090d.f8129b);
        sQLiteDatabase.execSQL(C3084j8.C3091e.f8131b);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
