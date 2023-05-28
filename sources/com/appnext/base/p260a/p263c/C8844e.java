package com.appnext.base.p260a.p263c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.appnext.base.p260a.p261a.C8832a;
import com.appnext.base.p260a.p262b.C8839d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.appnext.base.a.c.e */
public abstract class C8844e<MODEL extends C8839d> {

    /* renamed from: eh */
    private static final int f22406eh = -1;

    /* renamed from: ei */
    private static final String f22407ei = " DESC";

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public abstract String[] mo58714at();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract MODEL mo58715b(Cursor cursor);

    /* renamed from: com.appnext.base.a.c.e$a */
    protected enum C8845a {
        Equals(" = ? "),
        GreaterThan(" >= ? "),
        LessThan(" <= ? ");
        
        private String mOperator;

        private C8845a(String str) {
            this.mOperator = str;
        }

        /* renamed from: au */
        public final String mo58744au() {
            return this.mOperator;
        }
    }

    /* renamed from: a */
    protected static long m26642a(String str, ContentValues contentValues) {
        try {
            long insert = C8832a.m26582ac().mo58687ad().insert(str, (String) null, contentValues);
            C8832a.m26582ac().mo58688ae();
            return insert;
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    protected static long m26645b(String str, ContentValues contentValues) {
        try {
            long insertWithOnConflict = C8832a.m26582ac().mo58687ad().insertWithOnConflict(str, (String) null, contentValues, 5);
            C8832a.m26582ac().mo58688ae();
            return insertWithOnConflict;
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: a */
    protected static long m26641a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insertWithOnConflict(str, (String) null, contentValues, 5);
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    protected static long m26644b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insert(str, (String) null, contentValues);
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, th);
            return -1;
        }
    }

    /* renamed from: b */
    private static ContentValues m26646b(JSONObject jSONObject) {
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                contentValues.put(next, jSONObject.getString(next));
            }
            return contentValues;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo58739a(String str, JSONObject jSONObject) {
        try {
            long insertWithOnConflict = C8832a.m26582ac().mo58687ad().insertWithOnConflict(str, (String) null, m26646b(jSONObject), 5);
            C8832a.m26582ac().mo58688ae();
            return insertWithOnConflict;
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return -1;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, th);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (0 == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r2.endTransaction();
        com.appnext.base.p260a.p261a.C8832a.m26582ac().mo58688ae();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo58738a(java.lang.String r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            r0 = -1
            if (r8 == 0) goto L_0x003a
            r2 = 0
            int r3 = r8.length()     // Catch:{ all -> 0x0036 }
            com.appnext.base.a.a.a r4 = com.appnext.base.p260a.p261a.C8832a.m26582ac()     // Catch:{ all -> 0x0036 }
            android.database.sqlite.SQLiteDatabase r2 = r4.mo58687ad()     // Catch:{ all -> 0x0036 }
            r2.beginTransaction()     // Catch:{ all -> 0x0036 }
            r4 = 0
        L_0x0015:
            if (r4 >= r3) goto L_0x0026
            org.json.JSONObject r5 = r8.getJSONObject(r4)     // Catch:{ all -> 0x0036 }
            android.content.ContentValues r5 = m26646b((org.json.JSONObject) r5)     // Catch:{ all -> 0x0036 }
            long r0 = m26641a(r2, r7, r5)     // Catch:{ all -> 0x0036 }
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0026:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x003a
        L_0x002b:
            r2.endTransaction()
            com.appnext.base.a.a.a r7 = com.appnext.base.p260a.p261a.C8832a.m26582ac()
            r7.mo58688ae()
            goto L_0x003a
        L_0x0036:
            if (r2 == 0) goto L_0x003a
            goto L_0x002b
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p260a.p263c.C8844e.mo58738a(java.lang.String, org.json.JSONArray):long");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (0 == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r2.endTransaction();
        com.appnext.base.p260a.p261a.C8832a.m26582ac().mo58688ae();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo58741b(java.lang.String r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            r0 = -1
            if (r8 == 0) goto L_0x003a
            r2 = 0
            int r3 = r8.length()     // Catch:{ all -> 0x0036 }
            com.appnext.base.a.a.a r4 = com.appnext.base.p260a.p261a.C8832a.m26582ac()     // Catch:{ all -> 0x0036 }
            android.database.sqlite.SQLiteDatabase r2 = r4.mo58687ad()     // Catch:{ all -> 0x0036 }
            r2.beginTransaction()     // Catch:{ all -> 0x0036 }
            r4 = 0
        L_0x0015:
            if (r4 >= r3) goto L_0x0026
            org.json.JSONObject r5 = r8.getJSONObject(r4)     // Catch:{ all -> 0x0036 }
            android.content.ContentValues r5 = m26646b((org.json.JSONObject) r5)     // Catch:{ all -> 0x0036 }
            long r0 = m26644b(r2, r7, r5)     // Catch:{ all -> 0x0036 }
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0026:
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x003a
        L_0x002b:
            r2.endTransaction()
            com.appnext.base.a.a.a r7 = com.appnext.base.p260a.p261a.C8832a.m26582ac()
            r7.mo58688ae()
            goto L_0x003a
        L_0x0036:
            if (r2 == 0) goto L_0x003a
            goto L_0x002b
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p260a.p263c.C8844e.mo58741b(java.lang.String, org.json.JSONArray):long");
    }

    /* access modifiers changed from: protected */
    public final void delete(String str) {
        mo58737a(str, (String[]) null, (String[]) null, (List<C8845a>) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo58737a(String str, String[] strArr, String[] strArr2, List<C8845a> list) {
        try {
            SQLiteDatabase ad = C8832a.m26582ac().mo58687ad();
            String str2 = null;
            if (strArr != null) {
                str2 = m26643a(strArr, list);
            }
            int delete = ad.delete(str, str2, strArr2);
            C8832a.m26582ac().mo58688ae();
            return delete;
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
            return 0;
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, new Exception(th.getMessage()));
            return 0;
        }
    }

    /* renamed from: e */
    protected static void m26648e(String str, String str2) {
        try {
            C8832a.m26582ac().mo58687ad().delete(str, str2, (String[]) null);
            C8832a.m26582ac().mo58688ae();
        } catch (SQLiteFullException e) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.DatabaseOrDiskFull$53629b42, new Exception(e.getMessage()));
        } catch (Throwable th) {
            C8832a.m26582ac();
            C8832a.m26581a(C8832a.C8834a.Global$53629b42, new Exception(th.getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final List<MODEL> mo58743y(String str) {
        try {
            List<MODEL> e = m26647e(C8832a.m26582ac().mo58687ad().query(str, mo58714at(), (String) null, (String[]) null, (String) null, (String) null, (String) null));
            C8832a.m26582ac().mo58688ae();
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<MODEL> mo58740a(String str, String[] strArr, String[] strArr2, String str2, List<C8845a> list) {
        try {
            List<MODEL> e = m26647e(C8832a.m26582ac().mo58687ad().query(str, mo58714at(), m26643a(strArr, list), strArr2, (String) null, (String) null, str2));
            C8832a.m26582ac().mo58688ae();
            return e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: z */
    protected static String m26649z(String str) {
        return str + f22407ei;
    }

    /* renamed from: e */
    private List<MODEL> m26647e(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        try {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                arrayList.add(mo58715b(cursor));
                cursor.moveToNext();
            }
            cursor.close();
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m26643a(String[] strArr, List<C8845a> list) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(" AND ");
                }
                sb.append(strArr[i]);
                sb.append(list.get(i).mo58744au());
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }
}
