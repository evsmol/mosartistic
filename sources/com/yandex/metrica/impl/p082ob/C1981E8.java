package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.appodeal.ads.modules.common.internal.Constants;
import com.yandex.metrica.impl.p082ob.C3084j8;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.E8 */
public class C1981E8 extends C3120k8 {
    /* renamed from: a */
    public void mo15449a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS " + "sessions_BACKUP" + " (" + "id" + " INTEGER" + "," + "start_time" + " INTEGER" + "," + "connection_type" + " INTEGER" + "," + "network_type" + " TEXT" + "," + "country_code" + " INTEGER" + "," + "operator_id" + " INTEGER" + "," + "lac" + " INTEGER" + "," + "report_request_parameters" + " TEXT" + " );");
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(",");
        sb.append("start_time");
        sb.append(",");
        sb.append("connection_type");
        sb.append(",");
        sb.append("network_type");
        sb.append(",");
        sb.append("country_code");
        sb.append(",");
        sb.append("operator_id");
        sb.append(",");
        sb.append("lac");
        sb.append(",");
        sb.append("report_request_parameters");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO ");
        sb2.append("sessions_BACKUP");
        sb2.append(" SELECT ");
        sb2.append(sb);
        sb2.append(" FROM ");
        sb2.append(Constants.SESSIONS);
        sb2.append(";");
        sQLiteDatabase2.execSQL(sb2.toString());
        sQLiteDatabase2.execSQL("DROP TABLE sessions;");
        sQLiteDatabase2.execSQL(C3084j8.C3091e.f8131b);
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase2.rawQuery("SELECT * FROM sessions_BACKUP", (String[]) null);
            while (rawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(rawQuery, contentValues);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("id");
                    arrayList.add("start_time");
                    arrayList.add("report_request_parameters");
                    ContentValues contentValues2 = new ContentValues(contentValues);
                    for (Map.Entry next : contentValues.valueSet()) {
                        if (!arrayList.contains(next.getKey())) {
                            contentValues2.remove((String) next.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        contentValues.remove((String) it.next());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("conn_type", contentValues.getAsInteger("connection_type"));
                    jSONObject.putOpt("net_type", contentValues.get("network_type"));
                    jSONObject.putOpt("operator_id", contentValues.get("operator_id"));
                    jSONObject.putOpt("lac", contentValues.get("lac"));
                    jSONObject.putOpt("country_code", contentValues.get("country_code"));
                    contentValues2.put("network_info", jSONObject.toString());
                    sQLiteDatabase2.insertOrThrow(Constants.SESSIONS, (String) null, contentValues2);
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                }
            }
            C1848A2.m6805a(rawQuery);
            sQLiteDatabase2.execSQL("DROP TABLE sessions_BACKUP;");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "wifi_network_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "cell_info" + " TEXT DEFAULT ''");
            sQLiteDatabase2.execSQL("ALTER TABLE " + "reports" + " ADD COLUMN " + "location_info" + " TEXT DEFAULT ''");
        } catch (Throwable th2) {
            th = th2;
            C1848A2.m6805a(cursor);
            throw th;
        }
    }
}
