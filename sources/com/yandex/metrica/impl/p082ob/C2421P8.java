package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import java.sql.SQLException;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.P8 */
public class C2421P8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2)});
        sQLiteDatabase.delete(Constants.SESSIONS, "id = ?", new String[]{String.valueOf(-2)});
    }
}
