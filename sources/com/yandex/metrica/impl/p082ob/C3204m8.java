package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.m8 */
public class C3204m8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
    }
}
