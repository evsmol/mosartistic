package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appnext.base.p264b.C8849c;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.J7 */
public abstract class C2180J7 {

    /* renamed from: a */
    private final C2368O7 f5835a;

    /* renamed from: b */
    private final C2796a8 f5836b;

    /* renamed from: c */
    private final AtomicLong f5837c;

    /* renamed from: d */
    private final AtomicLong f5838d;

    /* renamed from: e */
    private final AtomicLong f5839e;

    /* renamed from: f */
    private final ContentValues f5840f = new ContentValues();

    C2180J7(C2368O7 o7, C2796a8 a8Var) {
        this.f5835a = o7;
        this.f5836b = a8Var;
        this.f5837c = new AtomicLong(m7497d());
        this.f5838d = new AtomicLong(mo15981a(Long.MAX_VALUE));
        this.f5839e = new AtomicLong(mo15980a());
    }

    /* renamed from: d */
    private long m7497d() {
        try {
            SQLiteDatabase readableDatabase = this.f5835a.getReadableDatabase();
            if (readableDatabase != null) {
                return C2814b.m9058a(readableDatabase, mo15989e());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo15980a();

    /* renamed from: a */
    public synchronized void mo15983a(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f5835a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f5840f.clear();
                this.f5840f.put("incremental_id", Long.valueOf(this.f5839e.get() + 1));
                this.f5840f.put("timestamp", Long.valueOf(j));
                this.f5840f.put(C8849c.DATA, str);
                if (writableDatabase.insert(mo15989e(), (String) null, this.f5840f) != -1) {
                    this.f5837c.incrementAndGet();
                    this.f5839e.incrementAndGet();
                    mo15986b(this.f5839e.get());
                    if (this.f5838d.get() > j) {
                        this.f5838d.set(j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long mo15985b() {
        return this.f5838d.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15986b(long j);

    /* renamed from: c */
    public long mo15988c() {
        return this.f5837c.get();
    }

    /* renamed from: e */
    public abstract String mo15989e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2796a8 mo15990f() {
        return this.f5836b;
    }

    /* renamed from: b */
    public synchronized int mo15984b(int i) {
        int i2;
        i2 = 0;
        if (i < 1) {
            return 0;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", new Object[]{"incremental_id", mo15989e()});
        try {
            SQLiteDatabase writableDatabase = this.f5835a.getWritableDatabase();
            if (writableDatabase != null && (i2 = writableDatabase.delete(mo15989e(), format, new String[]{String.valueOf(i)})) > 0) {
                this.f5837c.getAndAdd((long) (-i2));
                this.f5838d.set(mo15981a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* renamed from: c */
    public synchronized int mo15987c(long j) {
        int i;
        i = 0;
        String format = String.format(Locale.US, "%s <= ?", new Object[]{"incremental_id"});
        try {
            SQLiteDatabase writableDatabase = this.f5835a.getWritableDatabase();
            if (writableDatabase != null && (i = writableDatabase.delete(mo15989e(), format, new String[]{String.valueOf(j)})) > 0) {
                this.f5837c.getAndAdd((long) (-i));
                this.f5838d.set(mo15981a(Long.MAX_VALUE));
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: a */
    public long mo15981a(long j) {
        String format = String.format(Locale.US, "Select min(%s) from %s", new Object[]{"timestamp", mo15989e()});
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f5835a.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(format, (String[]) null);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        C1848A2.m6805a(cursor);
        return j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:13|14|15|16|17|(2:20|31)|28|11) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(5:7|8|9|10|(8:13|14|15|16|17|(2:20|31)|28|11))(0)|21|22|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0051 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.Long, java.lang.String> mo15982a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0056 }
            r0.<init>()     // Catch:{ all -> 0x0056 }
            r1 = 0
            com.yandex.metrica.impl.ob.O7 r2 = r12.f5835a     // Catch:{ all -> 0x0051 }
            android.database.sqlite.SQLiteDatabase r3 = r2.getReadableDatabase()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0051
            java.lang.String r4 = r12.mo15989e()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.String r5 = "data"
            java.lang.String[] r5 = new java.lang.String[]{r2, r5}     // Catch:{ all -> 0x0051 }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "incremental_id ASC"
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0051 }
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0051 }
        L_0x0029:
            boolean r13 = r1.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0051
            android.content.ContentValues r13 = r12.f5840f     // Catch:{ all -> 0x0051 }
            r13.clear()     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r13 = r12.f5840f     // Catch:{ all -> 0x0051 }
            com.yandex.metrica.impl.p082ob.C2814b.m9066a((android.database.Cursor) r1, (android.content.ContentValues) r13)     // Catch:{ all -> 0x0039 }
        L_0x0039:
            android.content.ContentValues r13 = r12.f5840f     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "incremental_id"
            java.lang.Long r13 = r13.getAsLong(r2)     // Catch:{ all -> 0x0051 }
            android.content.ContentValues r2 = r12.f5840f     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "data"
            java.lang.String r2 = r2.getAsString(r3)     // Catch:{ all -> 0x0051 }
            if (r13 == 0) goto L_0x0029
            if (r2 == 0) goto L_0x0029
            r0.put(r13, r2)     // Catch:{ all -> 0x0051 }
            goto L_0x0029
        L_0x0051:
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r1)     // Catch:{ all -> 0x0056 }
            monitor-exit(r12)
            return r0
        L_0x0056:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2180J7.mo15982a(int):java.util.Map");
    }
}
