package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;

/* renamed from: com.yandex.metrica.impl.ob.R8 */
public class C2477R8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "report_request_parameters" + " TEXT DEFAULT ''");
    }
}
