package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.L8 */
public class C2267L8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL("ALTER TABLE " + Constants.SESSIONS + " ADD COLUMN " + "obtained_before_first_sync" + " INTEGER DEFAULT 0");
    }
}
