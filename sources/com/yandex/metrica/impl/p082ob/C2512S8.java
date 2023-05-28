package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.impl.p082ob.C1967E;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: com.yandex.metrica.impl.ob.S8 */
public class C2512S8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", new Object[]{"reports", "battery_charge_type", Integer.valueOf(C1967E.C1969b.C1970a.UNKNOWN.mo15643a())}));
        sQLiteDatabase.execSQL(String.format(locale, "ALTER TABLE %s ADD COLUMN %s TEXT", new Object[]{"reports", "collection_mode"}));
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", new Object[]{"reports", AppMeasurementSdk.ConditionalUserProperty.VALUE, "type", Integer.valueOf(C2788a1.EVENT_TYPE_START.mo17139b())}));
    }
}
