package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.F8 */
public class C2018F8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "environment" + " TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "user_info" + " TEXT ");
        StringBuilder sb = new StringBuilder();
        sb.append("ALTER TABLE ");
        sb.append("reports");
        sb.append(" ADD COLUMN ");
        sb.append("session_type");
        sb.append(" INTEGER DEFAULT ");
        C2943f6 f6Var = C2943f6.FOREGROUND;
        sb.append(f6Var.mo17574a());
        sQLiteDatabase.execSQL(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append("reports");
        sb2.append(" SET ");
        sb2.append("session_type");
        sb2.append(" = ");
        C2943f6 f6Var2 = C2943f6.BACKGROUND;
        sb2.append(f6Var2.mo17574a());
        sb2.append(" WHERE ");
        sb2.append("session_id");
        sb2.append(" = ");
        sb2.append(-2);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "server_time_offset" + " INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "type" + " INTEGER DEFAULT " + f6Var.mo17574a());
        sQLiteDatabase.execSQL("UPDATE " + Constants.SESSIONS + " SET " + "type" + " = " + f6Var2.mo17574a() + " WHERE " + "id" + " = " + -2);
    }
}
