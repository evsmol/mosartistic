package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import com.yandex.metrica.CounterConfiguration;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.K7 */
public class C2233K7 {

    /* renamed from: a */
    private final CounterConfiguration.C10685b f5959a;

    /* renamed from: b */
    private final C3077j2 f5960b;

    /* renamed from: com.yandex.metrica.impl.ob.K7$a */
    static class C2234a {

        /* renamed from: a */
        public final List<ContentValues> f5961a;

        /* renamed from: b */
        public final int f5962b;

        C2234a(List<ContentValues> list, int i) {
            this.f5961a = list;
            this.f5962b = i;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.K7$b */
    public enum C2235b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");
        
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f5966a;

        private C2235b(String str) {
            this.f5966a = str;
        }
    }

    public C2233K7(CounterConfiguration.C10685b bVar) {
        this(bVar, C2007F0.m7154g().mo15753p());
    }

    C2233K7(CounterConfiguration.C10685b bVar, C3077j2 j2Var) {
        this.f5959a = bVar;
        this.f5960b = j2Var;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[SYNTHETIC, Splitter:B:24:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.impl.p082ob.C2233K7.C2234a mo16071a(android.database.sqlite.SQLiteDatabase r18, java.lang.String r19, java.lang.String r20, com.yandex.metrica.impl.p082ob.C2233K7.C2235b r21, java.lang.String r22, boolean r23) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r22
            java.lang.String r6 = "type"
            java.lang.String r7 = "number_of_type"
            java.lang.String r8 = "global_number"
            java.lang.String r0 = "SELECT %s, %s, %s FROM %s WHERE %s"
            r9 = 5
            r10 = 0
            r11 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0059 }
            r9[r10] = r8     // Catch:{ all -> 0x0059 }
            r12 = 1
            r9[r12] = r6     // Catch:{ all -> 0x0059 }
            r12 = 2
            r9[r12] = r7     // Catch:{ all -> 0x0059 }
            r12 = 3
            java.lang.String r13 = "reports"
            r9[r12] = r13     // Catch:{ all -> 0x0059 }
            r12 = 4
            r9[r12] = r4     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.format(r0, r9)     // Catch:{ all -> 0x0059 }
            android.database.Cursor r9 = r2.rawQuery(r0, r11)     // Catch:{ all -> 0x0059 }
            if (r9 == 0) goto L_0x0054
            int r0 = r9.getCount()     // Catch:{ all -> 0x0052 }
            if (r0 <= 0) goto L_0x0054
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            int r12 = r9.getCount()     // Catch:{ all -> 0x0052 }
            r0.<init>(r12)     // Catch:{ all -> 0x0052 }
        L_0x0040:
            boolean r12 = r9.moveToNext()     // Catch:{ all -> 0x0052 }
            if (r12 == 0) goto L_0x0055
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0052 }
            r12.<init>()     // Catch:{ all -> 0x0052 }
            android.database.DatabaseUtils.cursorRowToContentValues(r9, r12)     // Catch:{ all -> 0x0052 }
            r0.add(r12)     // Catch:{ all -> 0x0052 }
            goto L_0x0040
        L_0x0052:
            r0 = move-exception
            goto L_0x005b
        L_0x0054:
            r0 = r11
        L_0x0055:
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r9)
            goto L_0x006a
        L_0x0059:
            r0 = move-exception
            r9 = r11
        L_0x005b:
            com.yandex.metrica.impl.ob.M0 r12 = com.yandex.metrica.impl.p082ob.C3322oh.m10248a()     // Catch:{ all -> 0x0158 }
            java.lang.String r13 = "select_rows_to_delete_exception"
            com.yandex.metrica.impl.ob.nh r12 = (com.yandex.metrica.impl.p082ob.C3264nh) r12
            r12.reportError((java.lang.String) r13, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0158 }
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r9)
            r0 = r11
        L_0x006a:
            boolean r9 = com.yandex.metrica.impl.p082ob.C1848A2.m6814b((java.util.Collection) r0)
            if (r9 != 0) goto L_0x0134
            int r2 = r2.delete(r3, r4, r11)     // Catch:{ all -> 0x0076 }
            r10 = r2
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            if (r23 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0130
            com.yandex.metrica.impl.ob.j2 r2 = r1.f5960b
            if (r2 == 0) goto L_0x0130
            com.yandex.metrica.CounterConfiguration$b r3 = r1.f5959a
            com.yandex.metrica.impl.ob.i2 r2 = r2.mo17727a(r5, r3)
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r3.<init>()     // Catch:{ all -> 0x012a }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x012a }
            r4.<init>()     // Catch:{ all -> 0x012a }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x012a }
            r9.<init>()     // Catch:{ all -> 0x012a }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x012a }
            r12.<init>()     // Catch:{ all -> 0x012a }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x012a }
        L_0x009d:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x012a }
            if (r14 == 0) goto L_0x00d1
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x012a }
            android.content.ContentValues r14 = (android.content.ContentValues) r14     // Catch:{ all -> 0x012a }
            java.lang.Integer r15 = r14.getAsInteger(r8)     // Catch:{ all -> 0x012a }
            java.lang.Integer r16 = r14.getAsInteger(r6)     // Catch:{ all -> 0x012a }
            java.lang.Integer r14 = r14.getAsInteger(r7)     // Catch:{ all -> 0x012a }
            if (r15 == 0) goto L_0x009d
            if (r16 == 0) goto L_0x009d
            if (r14 == 0) goto L_0x009d
            r4.put(r15)     // Catch:{ all -> 0x012a }
            int r15 = r16.intValue()     // Catch:{ all -> 0x012a }
            com.yandex.metrica.impl.ob.a1 r15 = com.yandex.metrica.impl.p082ob.C2788a1.m8989a(r15)     // Catch:{ all -> 0x012a }
            java.lang.Integer r15 = com.yandex.metrica.impl.p082ob.C2171J1.m7481b((com.yandex.metrica.impl.p082ob.C2788a1) r15)     // Catch:{ all -> 0x012a }
            r9.put(r15)     // Catch:{ all -> 0x012a }
            r12.put(r14)     // Catch:{ all -> 0x012a }
            goto L_0x009d
        L_0x00d1:
            org.json.JSONObject r4 = r3.put(r8, r4)     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "event_type"
            org.json.JSONObject r4 = r4.put(r6, r9)     // Catch:{ all -> 0x012a }
            r4.put(r7, r12)     // Catch:{ all -> 0x012a }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r4.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "reason"
            java.lang.String r7 = r21.f5966a     // Catch:{ all -> 0x012a }
            org.json.JSONObject r4 = r4.put(r6, r7)     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "cleared"
            org.json.JSONObject r3 = r4.put(r6, r3)     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "actual_deleted_number"
            org.json.JSONObject r3 = r3.put(r4, r10)     // Catch:{ all -> 0x012a }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x012a }
            r4.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r6 = "details"
            org.json.JSONObject r3 = r4.put(r6, r3)     // Catch:{ all -> 0x012a }
            com.yandex.metrica.impl.ob.cm r4 = com.yandex.metrica.impl.p082ob.C2642Ul.m8746b(r22)     // Catch:{ all -> 0x012a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012a }
            java.util.List<java.lang.Integer> r5 = com.yandex.metrica.impl.p082ob.C3716z0.f9563i     // Catch:{ all -> 0x012a }
            com.yandex.metrica.impl.ob.J r5 = new com.yandex.metrica.impl.ob.J     // Catch:{ all -> 0x012a }
            java.lang.String r6 = ""
            com.yandex.metrica.impl.ob.a1 r7 = com.yandex.metrica.impl.p082ob.C2788a1.EVENT_TYPE_CLEANUP     // Catch:{ all -> 0x012a }
            int r7 = r7.mo17139b()     // Catch:{ all -> 0x012a }
            r8 = 0
            r18 = r5
            r19 = r3
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x012a }
            r11 = r5
            goto L_0x012b
        L_0x012a:
        L_0x012b:
            if (r11 == 0) goto L_0x0130
            r2.mo17700a(r11)
        L_0x0130:
            r0.size()
            goto L_0x0152
        L_0x0134:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r4 = "table_name"
            r2.put(r4, r3)
            java.lang.String r3 = java.lang.String.valueOf(r22)
            java.lang.String r4 = "api_key"
            r2.put(r4, r3)
            com.yandex.metrica.impl.ob.M0 r3 = com.yandex.metrica.impl.p082ob.C3322oh.m10248a()
            com.yandex.metrica.impl.ob.nh r3 = (com.yandex.metrica.impl.p082ob.C3264nh) r3
            java.lang.String r4 = "select_rows_to_delete_failed"
            r3.reportEvent((java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.Object>) r2)
        L_0x0152:
            com.yandex.metrica.impl.ob.K7$a r2 = new com.yandex.metrica.impl.ob.K7$a
            r2.<init>(r0, r10)
            return r2
        L_0x0158:
            r0 = move-exception
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2233K7.mo16071a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, com.yandex.metrica.impl.ob.K7$b, java.lang.String, boolean):com.yandex.metrica.impl.ob.K7$a");
    }
}
