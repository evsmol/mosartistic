package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.M8 */
public class C2302M8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C2004Em.NONE.mo15735a())}));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = %d where %s=%d", new Object[]{"reports", "encrypting_mode", Integer.valueOf(C2004Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.mo15735a()), "type", Integer.valueOf(C2788a1.EVENT_TYPE_IDENTITY.mo17139b())}));
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}
