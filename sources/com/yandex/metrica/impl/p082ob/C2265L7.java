package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.appnext.base.p264b.C8850d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C2233K7;
import com.yandex.metrica.impl.p082ob.C3084j8;
import com.yandex.metrica.impl.p082ob.C3328on;
import com.yandex.metrica.impl.p082ob.C3460s;
import com.yandex.metrica.impl.p082ob.C3552ui;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.yandex.metrica.impl.ob.L7 */
public class C2265L7 {

    /* renamed from: o */
    private static final HashSet<Integer> f6038o;

    /* renamed from: a */
    private final ReentrantReadWriteLock f6039a;

    /* renamed from: b */
    private final Lock f6040b;

    /* renamed from: c */
    private final Lock f6041c;

    /* renamed from: d */
    private final C2368O7 f6042d;

    /* renamed from: e */
    private final C2266a f6043e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f6044f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final List<ContentValues> f6045g = new ArrayList(3);

    /* renamed from: h */
    private final Context f6046h;

    /* renamed from: i */
    private final C2259L3 f6047i;

    /* renamed from: j */
    private final AtomicLong f6048j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List<C3257nb> f6049k;

    /* renamed from: l */
    private final C2233K7 f6050l;

    /* renamed from: m */
    private volatile C3423qn<C3552ui.C3554b, Object> f6051m;

    /* renamed from: n */
    private final C3459rn<C3552ui.C3554b, Object> f6052n;

    /* renamed from: com.yandex.metrica.impl.ob.L7$a */
    private class C2266a extends C2288Lm {

        /* renamed from: b */
        private final C2259L3 f6053b;

        C2266a(C2259L3 l3) {
            this.f6053b = l3;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r4 = this;
            L_0x0000:
                boolean r0 = r4.isRunning()
                if (r0 == 0) goto L_0x008b
                monitor-enter(r4)     // Catch:{ all -> 0x0017 }
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.p082ob.C2265L7.this     // Catch:{ all -> 0x0014 }
                boolean r0 = com.yandex.metrica.impl.p082ob.C2265L7.m7765a((com.yandex.metrica.impl.p082ob.C2265L7) r0)     // Catch:{ all -> 0x0014 }
                if (r0 == 0) goto L_0x0012
                r4.wait()     // Catch:{ all -> 0x0014 }
            L_0x0012:
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                goto L_0x001a
            L_0x0014:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0014 }
                throw r0     // Catch:{ all -> 0x0017 }
            L_0x0017:
                r4.stopRunning()
            L_0x001a:
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.p082ob.C2265L7.this
                java.lang.Object r0 = r0.f6044f
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r2 = com.yandex.metrica.impl.p082ob.C2265L7.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f6045g     // Catch:{ all -> 0x0088 }
                r1.<init>(r2)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r2 = com.yandex.metrica.impl.p082ob.C2265L7.this     // Catch:{ all -> 0x0088 }
                java.util.List r2 = r2.f6045g     // Catch:{ all -> 0x0088 }
                r2.clear()     // Catch:{ all -> 0x0088 }
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                com.yandex.metrica.impl.ob.L7 r0 = com.yandex.metrica.impl.p082ob.C2265L7.this
                r0.mo16158a((java.util.List<android.content.ContentValues>) r1)
                monitor-enter(r4)
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
                r0.<init>()     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0045:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x005f
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                android.content.ContentValues r2 = (android.content.ContentValues) r2     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.L7 r3 = com.yandex.metrica.impl.p082ob.C2265L7.this     // Catch:{ all -> 0x0085 }
                int r2 = r3.m7758a((android.content.ContentValues) r2)     // Catch:{ all -> 0x0085 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0085 }
                r0.add(r2)     // Catch:{ all -> 0x0085 }
                goto L_0x0045
            L_0x005f:
                com.yandex.metrica.impl.ob.L7 r1 = com.yandex.metrica.impl.p082ob.C2265L7.this     // Catch:{ all -> 0x0085 }
                java.util.List r1 = r1.f6049k     // Catch:{ all -> 0x0085 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0069:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r2 == 0) goto L_0x0079
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.nb r2 = (com.yandex.metrica.impl.p082ob.C3257nb) r2     // Catch:{ all -> 0x0085 }
                r2.mo17803a(r0)     // Catch:{ all -> 0x0085 }
                goto L_0x0069
            L_0x0079:
                com.yandex.metrica.impl.ob.L3 r0 = r4.f6053b     // Catch:{ all -> 0x0085 }
                com.yandex.metrica.impl.ob.ob r0 = r0.mo16134l()     // Catch:{ all -> 0x0085 }
                r0.mo17915c()     // Catch:{ all -> 0x0085 }
                monitor-exit(r4)
                goto L_0x0000
            L_0x0085:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x0088:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0088 }
                throw r1
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2265L7.C2266a.run():void");
        }
    }

    static {
        HashSet<Integer> hashSet = new HashSet<>();
        f6038o = hashSet;
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_INIT.mo17139b()));
        hashSet.add(Integer.valueOf(C2788a1.EVENT_TYPE_START.mo17139b()));
    }

    public C2265L7(C2259L3 l3, C2368O7 o7, C2233K7 k7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6039a = reentrantReadWriteLock;
        this.f6040b = reentrantReadWriteLock.readLock();
        this.f6041c = reentrantReadWriteLock.writeLock();
        AtomicLong atomicLong = new AtomicLong();
        this.f6048j = atomicLong;
        this.f6049k = new ArrayList();
        this.f6052n = new C3459rn<>();
        this.f6042d = o7;
        this.f6046h = l3.mo16129g();
        this.f6047i = l3;
        this.f6050l = k7;
        atomicLong.set(m7769d());
        C2266a aVar = new C2266a(l3);
        this.f6043e = aVar;
        aVar.setName(m7761a((C2416P3) l3));
        m7764a(l3.mo16144w());
    }

    /* renamed from: e */
    public void mo16163e() {
        this.f6043e.start();
    }

    /* renamed from: a */
    private void m7764a(C3356pi piVar) {
        Object obj;
        Object obj2;
        C3552ui.C3553a aVar = null;
        C3552ui.C3553a aVar2 = (!piVar.mo17974f().f6676o || piVar.mo17963Q() == null) ? null : piVar.mo17963Q().f9247b;
        if (piVar.mo17974f().f6676o && piVar.mo17963Q() != null) {
            aVar = piVar.mo17963Q().f9246a;
        }
        EnumMap enumMap = new EnumMap(C3552ui.C3554b.class);
        C3552ui.C3554b bVar = C3552ui.C3554b.WIFI;
        if (aVar2 == null) {
            obj = new C3488sn();
        } else {
            obj = new C3713yn(new C3675xn(new C1905Bn(), new C1934Cn()), new SystemTimeProvider(), aVar2.f9248a, aVar2.f9249b);
        }
        enumMap.put(bVar, obj);
        C3552ui.C3554b bVar2 = C3552ui.C3554b.CELL;
        if (aVar == null) {
            obj2 = new C3488sn();
        } else {
            obj2 = new C3713yn(new C3675xn(new C3328on.C3329a(), new C3363pn()), new SystemTimeProvider(), aVar.f9248a, aVar.f9249b);
        }
        enumMap.put(bVar2, obj2);
        this.f6051m = new C3423qn<>(enumMap);
    }

    /* renamed from: d */
    private long m7769d() {
        long j;
        this.f6040b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f6042d.getReadableDatabase();
            if (readableDatabase != null) {
                j = C2814b.m9058a(readableDatabase, "reports");
                this.f6040b.unlock();
                return j;
            }
        } catch (Throwable unused) {
        }
        j = 0;
        this.f6040b.unlock();
        return j;
    }

    /* renamed from: b */
    public Cursor mo16159b(long j, C2943f6 f6Var) throws SQLiteException {
        Cursor cursor;
        this.f6040b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f6042d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query("reports", (String[]) null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(f6Var.mo17574a())}, (String) null, (String) null, "number ASC", (String) null);
                this.f6040b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f6040b.unlock();
        return cursor;
    }

    /* renamed from: c */
    public long mo16162c() {
        this.f6040b.lock();
        try {
            return this.f6048j.get();
        } finally {
            this.f6040b.unlock();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r1);
        r4.f6040b.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.content.ContentValues> mo16160b() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.Lock r1 = r4.f6040b
            r1.lock()
            r1 = 0
            com.yandex.metrica.impl.ob.O7 r2 = r4.f6042d     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            java.lang.String r3 = com.yandex.metrica.impl.p082ob.C3084j8.C3091e.f8132c     // Catch:{ all -> 0x0034 }
            android.database.Cursor r1 = r2.rawQuery(r3, r1)     // Catch:{ all -> 0x0034 }
        L_0x0019:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002b
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            android.database.DatabaseUtils.cursorRowToContentValues(r1, r2)     // Catch:{ all -> 0x0034 }
            r0.add(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0019
        L_0x002b:
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f6040b
            r1.unlock()
            goto L_0x0041
        L_0x0034:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f6040b
            r1.unlock()
        L_0x0041:
            return r0
        L_0x0042:
            r0 = move-exception
            com.yandex.metrica.impl.p082ob.C1848A2.m6805a((android.database.Cursor) r1)
            java.util.concurrent.locks.Lock r1 = r4.f6040b
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2265L7.mo16160b():java.util.List");
    }

    /* renamed from: a */
    public long mo16150a(Set<Integer> set) {
        this.f6040b.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f6042d.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM reports");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                int i = 0;
                for (Integer next : set) {
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + next);
                    i++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), (String[]) null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        C1848A2.m6805a(cursor);
        this.f6040b.unlock();
        return j;
    }

    /* renamed from: b */
    public void mo16161b(C3356pi piVar) {
        m7764a(piVar);
    }

    /* renamed from: a */
    public void mo16157a(C3257nb nbVar) {
        this.f6049k.add(nbVar);
    }

    /* renamed from: a */
    private static String m7761a(C2416P3 p3) {
        return "DatabaseWorker [" + ((C2259L3) p3).mo16127e().mo15880c() + "]";
    }

    /* renamed from: a */
    public void mo16155a(long j, C2943f6 f6Var, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(j));
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("server_time_offset", Long.valueOf(C2974fm.m9584c().mo16498a()));
        contentValues.put("obtained_before_first_sync", Boolean.valueOf(C2974fm.m9584c().mo17617e()));
        contentValues.put("type", Integer.valueOf(f6Var.mo17574a()));
        new C3045i0(this.f6046h).mo17696a(this.f6047i.mo16135m()).mo17695a(contentValues).mo17697a();
        this.f6041c.lock();
        try {
            SQLiteDatabase writableDatabase = this.f6042d.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow(Constants.SESSIONS, (String) null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.f6041c.unlock();
    }

    /* renamed from: a */
    public void mo16156a(C1904Bm bm, int i, C2858c6 c6Var, C3460s.C3461a aVar, C2364O3 o3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("number", Long.valueOf(c6Var.mo17368a()));
        contentValues.put("global_number", Integer.valueOf(C3716z0.m11115d(i) ? o3.mo16377a() : 0));
        contentValues.put("number_of_type", Integer.valueOf(o3.mo16378a(i)));
        contentValues.put(C8850d.f22432fl, Long.valueOf(c6Var.mo17371b()));
        contentValues.put("session_id", Long.valueOf(c6Var.mo17373c()));
        contentValues.put("session_type", Integer.valueOf(c6Var.mo17375d().mo17574a()));
        new C3045i0(this.f6046h).mo17696a(this.f6047i.mo16135m()).mo17695a(contentValues).mo17698a(bm, aVar, f6038o.contains(Integer.valueOf(i)) ? this.f6052n : this.f6051m);
        synchronized (this.f6044f) {
            this.f6045g.add(contentValues);
        }
        synchronized (this.f6043e) {
            this.f6043e.notifyAll();
        }
    }

    /* renamed from: a */
    public int mo16149a(long j) {
        this.f6041c.lock();
        int i = 0;
        try {
            int i2 = C3084j8.f8117a;
            SQLiteDatabase writableDatabase = this.f6042d.getWritableDatabase();
            if (writableDatabase != null) {
                i = writableDatabase.delete(Constants.SESSIONS, C3084j8.C3091e.f8133d, new String[]{String.valueOf(j)});
            }
        } catch (Throwable unused) {
        }
        this.f6041c.unlock();
        return i;
    }

    /* renamed from: a */
    public void mo16153a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f6041c.lock();
            if (this.f6048j.get() > this.f6047i.mo16135m().mo16193J() && (writableDatabase = this.f6042d.getWritableDatabase()) != null) {
                this.f6048j.addAndGet((long) (-m7759a(writableDatabase)));
            }
        } catch (Throwable unused) {
        }
        this.f6041c.unlock();
    }

    /* renamed from: a */
    private int m7759a(SQLiteDatabase sQLiteDatabase) {
        try {
            String format = String.format("%1$s IN (SELECT %1$s FROM %2$s ORDER BY CASE WHEN %3$s IN (%4$s) THEN 2 WHEN %3$s IN (%5$s) THEN 1 ELSE 0 END, %6$s LIMIT (SELECT count() FROM %2$s) / %7$s)", new Object[]{"id", "reports", "type", TextUtils.join(", ", C3716z0.f9563i), TextUtils.join(", ", C3716z0.f9564j), "id", 10});
            return this.f6050l.mo16071a(sQLiteDatabase, "reports", format, C2233K7.C2235b.DB_OVERFLOW, this.f6047i.mo16127e().mo15878a(), true).f5962b;
        } catch (Throwable th) {
            ((C3264nh) C3322oh.m10248a()).reportError("deleteExcessiveReports exception", th);
            return 0;
        }
    }

    /* renamed from: a */
    public void mo16154a(long j, int i, int i2, boolean z) throws SQLiteException {
        List<ContentValues> list;
        if (i2 > 0) {
            this.f6041c.lock();
            try {
                Locale locale = Locale.US;
                String format = String.format(locale, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", new Object[]{"session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "reports", Integer.toString(i2 - 1)});
                SQLiteDatabase writableDatabase = this.f6042d.getWritableDatabase();
                if (writableDatabase != null) {
                    C2233K7.C2234a a = this.f6050l.mo16071a(writableDatabase, "reports", format, C2233K7.C2235b.BAD_REQUEST, this.f6047i.mo16127e().mo15878a(), z);
                    if (a.f5961a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (ContentValues a2 : a.f5961a) {
                            arrayList.add(Integer.valueOf(m7758a(a2)));
                        }
                        for (C3257nb b : this.f6049k) {
                            b.mo17805b(arrayList);
                        }
                    }
                    if (this.f6047i.mo16139q().isEnabled() && (list = a.f5961a) != null) {
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            m7763a(list.get(i3), "Event removed from db");
                        }
                    }
                    this.f6048j.addAndGet((long) (-a.f5962b));
                }
            } catch (Throwable unused) {
            }
            this.f6041c.unlock();
        }
    }

    /* renamed from: a */
    public Cursor mo16152a(Map<String, String> map) {
        Cursor cursor;
        this.f6040b.lock();
        try {
            SQLiteDatabase readableDatabase = this.f6042d.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.query(Constants.SESSIONS, (String[]) null, m7762a("id >= ?", map), m7766a(new String[]{Long.toString(0)}, map), (String) null, (String) null, "id ASC", (String) null);
                this.f6040b.unlock();
                return cursor;
            }
        } catch (Throwable unused) {
        }
        cursor = null;
        this.f6040b.unlock();
        return cursor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16158a(List<ContentValues> list) {
        SQLiteDatabase sQLiteDatabase;
        if (!list.isEmpty()) {
            this.f6041c.lock();
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = this.f6042d.getWritableDatabase();
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.beginTransaction();
                        for (ContentValues next : list) {
                            sQLiteDatabase.insertOrThrow("reports", (String) null, next);
                            this.f6048j.incrementAndGet();
                            m7763a(next, "Event saved to db");
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        this.f6048j.get();
                    } catch (Throwable unused) {
                        sQLiteDatabase2 = sQLiteDatabase;
                        sQLiteDatabase = sQLiteDatabase2;
                        C1848A2.m6806a(sQLiteDatabase);
                        this.f6041c.unlock();
                    }
                }
            } catch (Throwable unused2) {
                sQLiteDatabase = sQLiteDatabase2;
                C1848A2.m6806a(sQLiteDatabase);
                this.f6041c.unlock();
            }
            C1848A2.m6806a(sQLiteDatabase);
            this.f6041c.unlock();
        }
    }

    /* renamed from: a */
    public ContentValues mo16151a(long j, C2943f6 f6Var) {
        ContentValues contentValues = new ContentValues();
        this.f6040b.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f6042d.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery(String.format(locale, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", new Object[]{Long.valueOf(j), Integer.valueOf(f6Var.mo17574a())}), (String[]) null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
            C1848A2.m6805a(cursor);
            this.f6040b.unlock();
        } catch (Throwable unused) {
            C1848A2.m6805a((Cursor) null);
            this.f6040b.unlock();
        }
        return contentValues;
    }

    /* renamed from: a */
    private static String m7762a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        for (String next : map.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(next + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String[] m7766a(String[] strArr, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        for (Map.Entry<String, String> value : map.entrySet()) {
            arrayList.add(value.getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    private void m7763a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (C3716z0.m11114c(asInteger != null ? asInteger.intValue() : -1)) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(": ");
            String asString = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str2 = "";
            if (asString == null) {
                asString = str2;
            }
            sb.append(asString);
            String asString2 = contentValues.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (asString2 != null) {
                str2 = asString2;
            }
            if (C3716z0.m11116e(m7758a(contentValues)) && !TextUtils.isEmpty(str2)) {
                sb.append(" with value ");
                sb.append(str2);
            }
            this.f6047i.mo16139q().mo15273i(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m7758a(ContentValues contentValues) {
        return contentValues.getAsInteger("type").intValue();
    }

    /* renamed from: a */
    static boolean m7765a(C2265L7 l7) {
        boolean isEmpty;
        synchronized (l7.f6044f) {
            isEmpty = l7.f6045g.isEmpty();
        }
        return isEmpty;
    }
}
