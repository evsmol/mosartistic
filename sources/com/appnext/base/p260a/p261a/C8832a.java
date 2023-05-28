package com.appnext.base.p260a.p261a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.appnext.base.p260a.C8835b;
import com.appnext.base.p264b.C8852e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appnext.base.a.a.a */
public class C8832a {

    /* renamed from: dB */
    private static C8832a f22366dB;

    /* renamed from: dC */
    private static C8835b f22367dC;

    /* renamed from: dA */
    private AtomicInteger f22368dA = new AtomicInteger(0);

    /* renamed from: dD */
    private SQLiteDatabase f22369dD;

    /* renamed from: com.appnext.base.a.a.a$a */
    public enum C8834a {
        ;
        
        public static final int DatabaseOrDiskFull$53629b42 = 2;
        public static final int Global$53629b42 = 1;

        static {
            $VALUES$40a167d9 = new int[]{1, 2};
        }

        /* renamed from: af */
        public static int[] m26585af() {
            return (int[]) $VALUES$40a167d9.clone();
        }
    }

    private C8832a(Context context) {
        f22367dC = C8835b.m26586c(context);
    }

    /* renamed from: ac */
    public static C8832a m26582ac() {
        if (f22366dB == null) {
            synchronized (C8832a.class) {
                if (f22366dB == null) {
                    f22366dB = new C8832a(C8852e.getContext().getApplicationContext());
                }
            }
        }
        return f22366dB;
    }

    /* renamed from: ad */
    public final SQLiteDatabase mo58687ad() {
        if (this.f22368dA.incrementAndGet() == 1) {
            this.f22369dD = f22367dC.getWritableDatabase();
        }
        return this.f22369dD;
    }

    /* renamed from: ae */
    public final void mo58688ae() {
        if (this.f22368dA.decrementAndGet() == 0) {
            this.f22369dD.close();
        }
    }

    /* renamed from: com.appnext.base.a.a.a$1 */
    static /* synthetic */ class C88331 {

        /* renamed from: dE */
        static final /* synthetic */ int[] f22370dE;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        static {
            /*
                int[] r0 = com.appnext.base.p260a.p261a.C8832a.C8834a.m26585af()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22370dE = r0
                r1 = 1
                int r2 = com.appnext.base.p260a.p261a.C8832a.C8834a.DatabaseOrDiskFull$53629b42     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f22370dE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.appnext.base.p260a.p261a.C8832a.C8834a.Global$53629b42     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r1 = 2
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p260a.p261a.C8832a.C88331.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m26581a(int i, Throwable th) {
        int[] iArr = C88331.f22370dE;
    }
}
