package com.appnext.base.p260a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appnext.base.p260a.p263c.C8841b;

/* renamed from: com.appnext.base.a.b */
public class C8835b extends SQLiteOpenHelper {

    /* renamed from: dx */
    private static final String f22371dx = "appnext_dbs472";

    /* renamed from: dy */
    private static final int f22372dy = 12;

    /* renamed from: dz */
    private static volatile C8835b f22373dz;

    /* renamed from: c */
    public static C8835b m26586c(Context context) {
        if (f22373dz == null) {
            synchronized (C8835b.class) {
                if (f22373dz == null) {
                    f22373dz = new C8835b(context.getApplicationContext());
                }
            }
        }
        return f22373dz;
    }

    private C8835b(Context context) {
        super(context, f22371dx, (SQLiteDatabase.CursorFactory) null, 12);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("create table ct ( p text, c integer)");
            sQLiteDatabase.execSQL(C8841b.m26614ar());
            sQLiteDatabase.execSQL("create table config_table ( key text primary key, status text not null default 'off', sample text not null default '1', sample_type text not null default '',cycle text not null default '1', cycle_type text not null default 'once', service_key text not null default '', data text not null default '')");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo58689a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ct");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collected_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config_table");
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ct");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collected_data_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS config_table");
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }
}
