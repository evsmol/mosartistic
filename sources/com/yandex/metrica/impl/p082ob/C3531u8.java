package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.p082ob.C3084j8;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.u8 */
public class C3531u8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C3084j8.C3085a.C3087b.f8125b);
        sQLiteDatabase.execSQL(C3084j8.C3085a.C3086a.f8123b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}
