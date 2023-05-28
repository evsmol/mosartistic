package com.apm.insight.p169e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apm.insight.p169e.p171b.C6593b;

/* renamed from: com.apm.insight.e.b */
public class C6591b extends SQLiteOpenHelper {
    public C6591b(Context context) {
        super(context, "npth_log.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        new C6593b().mo52032a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
