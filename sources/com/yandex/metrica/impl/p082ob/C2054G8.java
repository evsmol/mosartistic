package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.G8 */
public class C2054G8 extends C3120k8 {

    /* renamed from: a */
    private static final String f5448a = ("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT " + C2943f6.FOREGROUND.mo17574a() + "," + "app_environment" + " TEXT DEFAULT '" + JsonUtils.EMPTY_JSON + "'," + "app_environment_revision" + " INTEGER DEFAULT " + 0 + " )");

    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment" + " TEXT DEFAULT '{}'");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "app_environment_revision" + " INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
        sQLiteDatabase.execSQL(f5448a);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    String asString = contentValues.getAsString("environment");
                    contentValues.remove("environment");
                    contentValues.put("error_environment", asString);
                    sQLiteDatabase.insert("reports", (String) null, contentValues);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    C1848A2.m6805a(cursor);
                    throw th;
                }
            }
            C1848A2.m6805a(rawQuery);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
        } catch (Throwable th2) {
            th = th2;
            C1848A2.m6805a(cursor);
            throw th;
        }
    }
}
