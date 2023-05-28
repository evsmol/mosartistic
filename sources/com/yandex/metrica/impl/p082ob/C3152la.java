package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.la */
class C3152la implements C2511S7, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, Object> f8230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Object> f8231b;

    /* renamed from: c */
    private final String f8232c;

    /* renamed from: d */
    private final C3153a f8233d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile boolean f8234e;

    /* renamed from: f */
    private final C2988g8 f8235f;

    /* renamed from: com.yandex.metrica.impl.ob.la$a */
    private class C3153a extends C2288Lm {
        public C3153a(String str) {
            super(str);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|(2:11|12)|13|14|15) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x001c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.yandex.metrica.impl.ob.la r0 = com.yandex.metrica.impl.p082ob.C3152la.this
                java.util.Map r0 = r0.f8230a
                monitor-enter(r0)
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.p082ob.C3152la.m9952b((com.yandex.metrica.impl.p082ob.C3152la) r1)     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x005a }
                r2 = 1
                boolean unused = r1.f8234e = r2     // Catch:{ all -> 0x005a }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x005a }
                java.util.Map r1 = r1.f8230a     // Catch:{ all -> 0x005a }
                r1.notifyAll()     // Catch:{ all -> 0x005a }
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
            L_0x001c:
                boolean r0 = r3.isRunning()
                if (r0 == 0) goto L_0x0059
                monitor-enter(r3)
                com.yandex.metrica.impl.ob.la r0 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r0 = r0.f8231b     // Catch:{ all -> 0x0056 }
                int r0 = r0.size()     // Catch:{ all -> 0x0056 }
                if (r0 != 0) goto L_0x0032
                r3.wait()     // Catch:{ InterruptedException -> 0x0032 }
            L_0x0032:
                java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f8231b     // Catch:{ all -> 0x0056 }
                r0.<init>(r1)     // Catch:{ all -> 0x0056 }
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this     // Catch:{ all -> 0x0056 }
                java.util.Map r1 = r1.f8231b     // Catch:{ all -> 0x0056 }
                r1.clear()     // Catch:{ all -> 0x0056 }
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                int r1 = r0.size()
                if (r1 <= 0) goto L_0x001c
                com.yandex.metrica.impl.ob.la r1 = com.yandex.metrica.impl.p082ob.C3152la.this
                com.yandex.metrica.impl.p082ob.C3152la.m9950a((com.yandex.metrica.impl.p082ob.C3152la) r1, (java.util.Map) r0)
                r0.clear()
                goto L_0x001c
            L_0x0056:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0056 }
                throw r0
            L_0x0059:
                return
            L_0x005a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3152la.C3153a.run():void");
        }
    }

    public C3152la(C2368O7 o7, String str) {
        this(str, (C2988g8) new C3053i8(o7));
    }

    /* renamed from: a */
    static void m9950a(C3152la laVar, Map map) {
        SQLiteDatabase sQLiteDatabase;
        laVar.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            Object value = entry.getValue();
            contentValues.put("key", (String) entry.getKey());
            if (value == laVar) {
                contentValues.putNull(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else if (value instanceof String) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) value);
                contentValues.put("type", 4);
            } else if (value instanceof Long) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) value);
                contentValues.put("type", 3);
            } else if (value instanceof Integer) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) value);
                contentValues.put("type", 2);
            } else if (value instanceof Boolean) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", 1);
            } else if (value instanceof Float) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Float) value);
                contentValues.put("type", 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = laVar.f8235f.mo17628a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE) == null) {
                            String asString = contentValues2.getAsString("key");
                            sQLiteDatabase.delete(laVar.f8232c, "key = ?", new String[]{asString});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(laVar.f8232c, (String) null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    C1848A2.m6806a(sQLiteDatabase);
                    laVar.f8235f.mo17629a(sQLiteDatabase);
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = sQLiteDatabase2;
            C1848A2.m6806a(sQLiteDatabase);
            laVar.f8235f.mo17629a(sQLiteDatabase);
        }
        C1848A2.m6806a(sQLiteDatabase);
        laVar.f8235f.mo17629a(sQLiteDatabase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0022 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9952b(com.yandex.metrica.impl.p082ob.C3152la r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            com.yandex.metrica.impl.ob.g8 r4 = r13.f8235f     // Catch:{ all -> 0x0092 }
            android.database.sqlite.SQLiteDatabase r4 = r4.mo17628a()     // Catch:{ all -> 0x0092 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r6 = r13.f8232c     // Catch:{ all -> 0x0093 }
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ all -> 0x0093 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0093 }
        L_0x0022:
            boolean r6 = r5.moveToNext()     // Catch:{ all -> 0x0090 }
            if (r6 == 0) goto L_0x0090
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0090 }
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0090 }
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0090 }
            int r8 = r5.getInt(r8)     // Catch:{ all -> 0x0090 }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0090 }
            if (r9 != 0) goto L_0x0022
            r9 = 1
            if (r8 == r9) goto L_0x0071
            r9 = 2
            if (r8 == r9) goto L_0x0068
            r9 = 3
            if (r8 == r9) goto L_0x005f
            r9 = 4
            if (r8 == r9) goto L_0x0088
            r9 = 5
            if (r8 == r9) goto L_0x0056
            goto L_0x0087
        L_0x0056:
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x005f:
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0068:
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0087 }
            goto L_0x0088
        L_0x0071:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x007c
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x007c:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0087
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0090 }
            goto L_0x0088
        L_0x0087:
            r7 = r3
        L_0x0088:
            if (r7 == 0) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.Object> r8 = r13.f8230a     // Catch:{ all -> 0x0090 }
            r8.put(r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x0022
        L_0x0090:
            r3 = r5
            goto L_0x0093
        L_0x0092:
            r4 = r3
        L_0x0093:
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r3)
            com.yandex.metrica.impl.ob.g8 r13 = r13.f8235f
            r13.mo17629a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3152la.m9952b(com.yandex.metrica.impl.ob.la):void");
    }

    public void close() {
        if (this.f8233d.isRunning()) {
            this.f8233d.stopRunning();
        }
    }

    protected C3152la(String str, C2988g8 g8Var) {
        this.f8230a = new HashMap();
        this.f8231b = new HashMap();
        this.f8235f = g8Var;
        this.f8232c = str;
        C3153a aVar = new C3153a(String.format(Locale.US, "YMM-DW-%s", new Object[]{Integer.valueOf(C2322Mm.m7983c())}));
        this.f8233d = aVar;
        aVar.start();
    }

    /* renamed from: c */
    private Object m9953c(String str) {
        Object obj;
        synchronized (this.f8230a) {
            m9955c();
            obj = this.f8230a.get(str);
        }
        return obj;
    }

    /* renamed from: c */
    private void m9955c() {
        if (!this.f8234e) {
            try {
                this.f8230a.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo16602b() {
        synchronized (this.f8233d) {
            this.f8233d.notifyAll();
        }
    }

    /* renamed from: b */
    public String mo16601b(String str, String str2) {
        Object c = m9953c(str);
        return c instanceof String ? (String) c : str2;
    }

    /* renamed from: b */
    public boolean mo16603b(String str, boolean z) {
        Object c = m9953c(str);
        return c instanceof Boolean ? ((Boolean) c).booleanValue() : z;
    }

    /* renamed from: b */
    public C2511S7 mo16598b(String str) {
        synchronized (this.f8230a) {
            m9955c();
            this.f8230a.remove(str);
        }
        synchronized (this.f8233d) {
            this.f8231b.put(str, this);
            this.f8233d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public C2511S7 mo16600b(String str, long j) {
        mo17800a(str, (Object) Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public synchronized C2511S7 mo16599b(String str, int i) {
        mo17800a(str, (Object) Integer.valueOf(i));
        return this;
    }

    /* renamed from: a */
    public int mo16592a(String str, int i) {
        Object c = m9953c(str);
        return c instanceof Integer ? ((Integer) c).intValue() : i;
    }

    /* renamed from: a */
    public long mo16593a(String str, long j) {
        Object c = m9953c(str);
        return c instanceof Long ? ((Long) c).longValue() : j;
    }

    /* renamed from: a */
    public synchronized C2511S7 mo16594a(String str, String str2) {
        mo17800a(str, (Object) str2);
        return this;
    }

    /* renamed from: a */
    public C2511S7 mo16595a(String str, boolean z) {
        mo17800a(str, (Object) Boolean.valueOf(z));
        return this;
    }

    /* renamed from: a */
    public boolean mo16597a(String str) {
        boolean containsKey;
        synchronized (this.f8230a) {
            m9955c();
            containsKey = this.f8230a.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: a */
    public Set<String> mo16596a() {
        HashSet hashSet;
        synchronized (this.f8230a) {
            hashSet = new HashSet(this.f8230a.keySet());
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17800a(String str, Object obj) {
        synchronized (this.f8230a) {
            m9955c();
            this.f8230a.put(str, obj);
        }
        synchronized (this.f8233d) {
            this.f8231b.put(str, obj);
            this.f8233d.notifyAll();
        }
    }
}
