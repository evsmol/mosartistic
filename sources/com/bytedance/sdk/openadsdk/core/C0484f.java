package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.p000b.C0140g;
import com.bytedance.sdk.openadsdk.p000b.C0149m;
import com.bytedance.sdk.openadsdk.p000b.C0160q;
import com.bytedance.sdk.openadsdk.p000b.C0162s;
import com.bytedance.sdk.openadsdk.p049k.C0893h;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.core.f */
/* compiled from: DBHelper */
class C0484f {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f1760c = new Object();

    /* renamed from: a */
    private C0488c f1761a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f1762b;

    C0484f(Context context) {
        Context context2;
        if (context == null) {
            try {
                context2 = C0558m.m2663a();
            } catch (Throwable unused) {
                return;
            }
        } else {
            context2 = context.getApplicationContext();
        }
        this.f1762b = context2;
        if (this.f1761a == null) {
            this.f1761a = new C0488c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Context m2233c() {
        Context context = this.f1762b;
        return context == null ? C0558m.m2663a() : context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$c */
    /* compiled from: DBHelper */
    public class C0488c {

        /* renamed from: b */
        private SQLiteDatabase f1767b = null;

        public C0488c() {
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: d */
        private synchronized void m2238d() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.lang.Object r0 = com.bytedance.sdk.openadsdk.core.C0484f.f1760c     // Catch:{ all -> 0x002e }
                monitor-enter(r0)     // Catch:{ all -> 0x002e }
                android.database.sqlite.SQLiteDatabase r1 = r4.f1767b     // Catch:{ all -> 0x002b }
                if (r1 == 0) goto L_0x0012
                android.database.sqlite.SQLiteDatabase r1 = r4.f1767b     // Catch:{ all -> 0x002b }
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x002b }
                if (r1 != 0) goto L_0x0029
            L_0x0012:
                com.bytedance.sdk.openadsdk.core.f$a r1 = new com.bytedance.sdk.openadsdk.core.f$a     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r2 = com.bytedance.sdk.openadsdk.core.C0484f.this     // Catch:{ all -> 0x002b }
                com.bytedance.sdk.openadsdk.core.f r3 = com.bytedance.sdk.openadsdk.core.C0484f.this     // Catch:{ all -> 0x002b }
                android.content.Context r3 = r3.m2233c()     // Catch:{ all -> 0x002b }
                r1.<init>(r3)     // Catch:{ all -> 0x002b }
                android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch:{ all -> 0x002b }
                r4.f1767b = r1     // Catch:{ all -> 0x002b }
                r2 = 0
                r1.setLockingEnabled(r2)     // Catch:{ all -> 0x002b }
            L_0x0029:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                goto L_0x0038
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1     // Catch:{ all -> 0x002e }
            L_0x002e:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ all -> 0x003b }
                boolean r1 = r4.m2239e()     // Catch:{ all -> 0x003b }
                if (r1 != 0) goto L_0x003a
            L_0x0038:
                monitor-exit(r4)
                return
            L_0x003a:
                throw r0     // Catch:{ all -> 0x003b }
            L_0x003b:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C0484f.C0488c.m2238d():void");
        }

        /* renamed from: a */
        public synchronized void mo1541a(String str) throws SQLException {
            try {
                m2238d();
                this.f1767b.execSQL(str);
            } catch (Throwable th) {
                if (m2239e()) {
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public synchronized Cursor mo1539a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                m2238d();
                cursor = this.f1767b.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.printStackTrace();
                C0487b bVar = new C0487b();
                if (!m2239e()) {
                    cursor = bVar;
                } else {
                    throw th;
                }
            }
            return cursor;
        }

        /* renamed from: a */
        public synchronized int mo1536a(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                m2238d();
                i = this.f1767b.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m2239e()) {
                    i = 0;
                } else {
                    throw e;
                }
            }
            return i;
        }

        /* renamed from: a */
        public synchronized long mo1538a(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                m2238d();
                j = this.f1767b.replace(str, str2, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m2239e()) {
                    j = -1;
                } else {
                    throw e;
                }
            }
            return j;
        }

        /* renamed from: a */
        public synchronized int mo1537a(String str, String str2, String[] strArr) {
            int i;
            try {
                m2238d();
                i = this.f1767b.delete(str, str2, strArr);
            } catch (Exception e) {
                e.printStackTrace();
                if (!m2239e()) {
                    i = 0;
                } else {
                    throw e;
                }
            }
            return i;
        }

        /* renamed from: a */
        public synchronized void mo1540a() {
            m2238d();
            if (this.f1767b != null) {
                this.f1767b.beginTransaction();
            }
        }

        /* renamed from: b */
        public synchronized void mo1542b() {
            m2238d();
            if (this.f1767b != null) {
                this.f1767b.setTransactionSuccessful();
            }
        }

        /* renamed from: c */
        public synchronized void mo1543c() {
            m2238d();
            if (this.f1767b != null) {
                this.f1767b.endTransaction();
            }
        }

        /* renamed from: e */
        private synchronized boolean m2239e() {
            SQLiteDatabase sQLiteDatabase;
            sQLiteDatabase = this.f1767b;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$a */
    /* compiled from: DBHelper */
    private class C0486a extends SQLiteOpenHelper {

        /* renamed from: a */
        final Context f1763a;

        public C0486a(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 6);
            this.f1763a = context;
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                m2236a(sQLiteDatabase, this.f1763a);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private void m2236a(SQLiteDatabase sQLiteDatabase, Context context) {
            C10638l.m31235b("DBHelper", "initDB........");
            sQLiteDatabase.execSQL(C0140g.m644e());
            sQLiteDatabase.execSQL(C0149m.m701f());
            sQLiteDatabase.execSQL(C0162s.m752f());
            sQLiteDatabase.execSQL(C0160q.m740d());
            sQLiteDatabase.execSQL(C0893h.m4269b());
            sQLiteDatabase.execSQL(C10266a.m29498c());
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                C10638l.m31235b("DBHelper", "onUpgrade....Database version upgrade.....old:" + i + ",new:" + i2);
                if (i > i2) {
                    m2235a(sQLiteDatabase);
                    m2236a(sQLiteDatabase, C0484f.this.f1762b);
                    C10638l.m31235b("DBHelper", "onUpgrade...Reverse installation. Database reset and create table.....");
                } else {
                    m2236a(sQLiteDatabase, C0484f.this.f1762b);
                }
                if (i == 1) {
                    C10638l.m31235b("DBHelper", "onUpgrade.....perform table creation.....");
                } else if (i == 2) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                } else if (i == 3) {
                    sQLiteDatabase.execSQL(C0162s.m752f());
                } else if (i == 4) {
                    sQLiteDatabase.execSQL(C10266a.m29498c());
                } else if (i == 5) {
                    sQLiteDatabase.execSQL(C0160q.m740d());
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        private void m2235a(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> b = m2237b(sQLiteDatabase);
            if (b != null && b.size() > 0) {
                Iterator<String> it = b.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", new Object[]{it.next()}));
                }
            }
        }

        /* renamed from: b */
        private ArrayList<String> m2237b(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", (String[]) null);
                if (rawQuery != null) {
                    while (rawQuery.moveToNext()) {
                        String string = rawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                    rawQuery.close();
                }
            } catch (Exception unused) {
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public C0488c mo1193a() {
        return this.f1761a;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.f$b */
    /* compiled from: DBHelper */
    private class C0487b extends AbstractCursor {
        public String[] getColumnNames() {
            return new String[0];
        }

        public int getCount() {
            return 0;
        }

        public double getDouble(int i) {
            return 0.0d;
        }

        public float getFloat(int i) {
            return 0.0f;
        }

        public int getInt(int i) {
            return 0;
        }

        public long getLong(int i) {
            return 0;
        }

        public short getShort(int i) {
            return 0;
        }

        public String getString(int i) {
            return null;
        }

        public boolean isNull(int i) {
            return true;
        }

        private C0487b() {
        }
    }
}
