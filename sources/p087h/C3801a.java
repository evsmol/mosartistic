package p087h;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import p158a.C5785a;
import p163b.C6148a;

/* renamed from: h.a */
public class C3801a extends SQLiteOpenHelper {

    /* renamed from: h.a$a */
    public static final class C3802a {
        /* renamed from: a */
        public static List<C6148a> m11218a(SQLiteOpenHelper sQLiteOpenHelper, Integer num) {
            return m11219a(sQLiteOpenHelper, String.format("%s = ?", new Object[]{"is_reserved"}), new String[]{BuildConfig.ADAPTER_VERSION}, num != null ? String.valueOf(num) : null);
        }

        /* renamed from: a */
        public static List<C6148a> m11219a(SQLiteOpenHelper sQLiteOpenHelper, String str, String[] strArr, String str2) {
            SQLiteDatabase sQLiteDatabase;
            Cursor cursor;
            Cursor cursor2;
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getReadableDatabase();
                try {
                    cursor = sQLiteDatabase.query("tracker_event", new String[]{"id", "timestamp", "context", AppMeasurementSdk.ConditionalUserProperty.NAME, "dimensions", "metrics"}, str, strArr, (String) null, (String) null, String.format("%s DESC", new Object[]{"timestamp"}), str2);
                    while (cursor.moveToNext()) {
                        try {
                            arrayList.add(new C6148a(cursor.getString(0), cursor.getLong(1), cursor.getString(2), cursor.getString(3), new JSONObject(cursor.getString(4)), new JSONObject(cursor.getString(5))));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = null;
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    cursor = cursor2;
                    C5785a.m14752a((Closeable) cursor);
                    C5785a.m14752a((Closeable) sQLiteDatabase);
                    return arrayList;
                }
            } catch (Throwable unused3) {
                cursor2 = null;
                sQLiteDatabase = sQLiteDatabase2;
                cursor = cursor2;
                C5785a.m14752a((Closeable) cursor);
                C5785a.m14752a((Closeable) sQLiteDatabase);
                return arrayList;
            }
            C5785a.m14752a((Closeable) cursor);
            C5785a.m14752a((Closeable) sQLiteDatabase);
            return arrayList;
        }

        /* renamed from: a */
        public static void m11220a(SQLiteOpenHelper sQLiteOpenHelper) {
            m11222a(sQLiteOpenHelper, false, (List<C6148a>) null);
        }

        /* renamed from: a */
        public static void m11221a(SQLiteOpenHelper sQLiteOpenHelper, List<C6148a> list) {
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    sQLiteDatabase.execSQL(String.format(Locale.ENGLISH, "DELETE FROM %s WHERE %s IN (%s)", new Object[]{"tracker_event", "id", TextUtils.join(",", m11224a(list))}));
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            C5785a.m14752a((Closeable) sQLiteDatabase);
        }

        /* renamed from: a */
        public static void m11222a(SQLiteOpenHelper sQLiteOpenHelper, boolean z, List<C6148a> list) {
            SQLiteDatabase sQLiteDatabase;
            try {
                sQLiteDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    String format = String.format(Locale.ENGLISH, "UPDATE %s SET %s=%d", new Object[]{"tracker_event", "is_reserved", Integer.valueOf(z ? 1 : 0)});
                    if (list != null && list.size() > 0) {
                        format = format + String.format(" WHERE %s IN (%s)", new Object[]{"id", TextUtils.join(",", m11224a(list))});
                    }
                    sQLiteDatabase.execSQL(format);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = null;
            }
            C5785a.m14752a((Closeable) sQLiteDatabase);
        }

        /* renamed from: a */
        public static boolean m11223a(SQLiteOpenHelper sQLiteOpenHelper, C6148a aVar) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("id", aVar.mo50204c());
                    contentValues.put("timestamp", Long.valueOf(aVar.mo50207f()));
                    contentValues.put("context", aVar.mo50202a());
                    contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aVar.mo50206e());
                    contentValues.put("dimensions", aVar.mo50203b().toString());
                    contentValues.put("metrics", aVar.mo50205d().toString());
                    writableDatabase.insert("tracker_event", (String) null, contentValues);
                    C5785a.m14752a((Closeable) writableDatabase);
                    return true;
                } catch (Throwable unused) {
                    sQLiteDatabase = writableDatabase;
                    C5785a.m14752a((Closeable) sQLiteDatabase);
                    return false;
                }
            } catch (Throwable unused2) {
                C5785a.m14752a((Closeable) sQLiteDatabase);
                return false;
            }
        }

        /* renamed from: a */
        public static String[] m11224a(List<C6148a> list) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = '\'' + list.get(i).mo50204c() + '\'';
            }
            return strArr;
        }

        /* renamed from: b */
        public static void m11225b(SQLiteOpenHelper sQLiteOpenHelper, List<C6148a> list) {
            m11222a(sQLiteOpenHelper, false, list);
        }

        /* renamed from: c */
        public static void m11226c(SQLiteOpenHelper sQLiteOpenHelper, List<C6148a> list) {
            m11222a(sQLiteOpenHelper, true, list);
        }
    }

    public C3801a(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE tracker_event (id TEXT,timestamp INTEGER,context TEXT,name TEXT,dimensions TEXT,metrics TEXT,is_reserved INTEGER DEFAULT 0)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tracker_event");
        onCreate(sQLiteDatabase);
    }
}
