package com.yandex.metrica.impl.p082ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.X7 */
public class C2707X7 {

    /* renamed from: a */
    private final C3120k8 f7144a;

    /* renamed from: b */
    private final C3120k8 f7145b;

    /* renamed from: c */
    private final SparseArray<C3120k8> f7146c;

    /* renamed from: d */
    private final C2736Y7 f7147d;

    /* renamed from: com.yandex.metrica.impl.ob.X7$b */
    public static class C2709b {
        /* renamed from: a */
        public C2707X7 mo17031a(String str, C3120k8 k8Var, C3120k8 k8Var2, SparseArray<C3120k8> sparseArray, C2736Y7 y7) {
            return new C2707X7(str, k8Var, k8Var2, sparseArray, y7);
        }
    }

    /* renamed from: a */
    public void mo17027a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f7144a.mo15449a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0011 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17029b(android.database.sqlite.SQLiteDatabase r2) {
        /*
            r1 = this;
            com.yandex.metrica.impl.ob.Y7 r0 = r1.f7147d     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            com.yandex.metrica.impl.ob.Z7 r0 = (com.yandex.metrica.impl.p082ob.C2763Z7) r0
            boolean r0 = r0.mo17104a(r2)     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            com.yandex.metrica.impl.ob.k8 r0 = r1.f7145b     // Catch:{ all -> 0x0016 }
            r0.mo15449a(r2)     // Catch:{ all -> 0x0011 }
        L_0x0011:
            com.yandex.metrica.impl.ob.k8 r0 = r1.f7144a     // Catch:{ all -> 0x0016 }
            r0.mo15449a(r2)     // Catch:{ all -> 0x0016 }
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2707X7.mo17029b(android.database.sqlite.SQLiteDatabase):void");
    }

    private C2707X7(String str, C3120k8 k8Var, C3120k8 k8Var2, SparseArray<C3120k8> sparseArray, C2736Y7 y7) {
        this.f7144a = k8Var;
        this.f7145b = k8Var2;
        this.f7146c = sparseArray;
        this.f7147d = y7;
    }

    /* renamed from: a */
    public void mo17028a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            try {
                this.f7145b.mo15449a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f7144a.mo15449a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17030b(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 <= r5) goto L_0x0017
            r1 = 0
            int r5 = r5 + r0
        L_0x0005:
            if (r5 > r6) goto L_0x0018
            android.util.SparseArray<com.yandex.metrica.impl.ob.k8> r2 = r3.f7146c     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0017 }
            com.yandex.metrica.impl.ob.k8 r2 = (com.yandex.metrica.impl.p082ob.C3120k8) r2     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0014
            r2.mo15449a(r4)     // Catch:{ all -> 0x0017 }
        L_0x0014:
            int r5 = r5 + 1
            goto L_0x0005
        L_0x0017:
            r1 = 1
        L_0x0018:
            com.yandex.metrica.impl.ob.Y7 r5 = r3.f7147d
            com.yandex.metrica.impl.ob.Z7 r5 = (com.yandex.metrica.impl.p082ob.C2763Z7) r5
            boolean r5 = r5.mo17104a(r4)
            r5 = r5 ^ r0
            r5 = r5 | r1
            if (r5 == 0) goto L_0x002e
            com.yandex.metrica.impl.ob.k8 r5 = r3.f7145b
            r5.mo15449a(r4)     // Catch:{ all -> 0x0029 }
        L_0x0029:
            com.yandex.metrica.impl.ob.k8 r5 = r3.f7144a
            r5.mo15449a(r4)     // Catch:{ all -> 0x002e }
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2707X7.mo17030b(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
