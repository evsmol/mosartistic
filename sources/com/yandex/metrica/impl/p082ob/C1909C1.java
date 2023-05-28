package com.yandex.metrica.impl.p082ob;

import java.lang.Thread;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.C1 */
class C1909C1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private static final AtomicBoolean f5145f = new AtomicBoolean();

    /* renamed from: a */
    private final List<C1854A6> f5146a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f5147b;

    /* renamed from: c */
    private final C3112k3 f5148c;

    /* renamed from: d */
    private final C2848bm f5149d;

    /* renamed from: e */
    private final C3048i3 f5150e;

    C1909C1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<C1854A6> list, C2848bm bmVar, C3048i3 i3Var, C3112k3 k3Var) {
        this.f5146a = list;
        this.f5147b = uncaughtExceptionHandler;
        this.f5149d = bmVar;
        this.f5150e = i3Var;
        this.f5148c = k3Var;
    }

    /* renamed from: a */
    public static boolean m6957a() {
        return f5145f.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f5145f.set(true);
            C3607w6 w6Var = new C3607w6(this.f5150e.mo15448a(thread), this.f5148c.mo17775a(thread), ((C2726Xl) this.f5149d).mo17070b());
            for (C1854A6 a : this.f5146a) {
                a.mo15440a(th, w6Var);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5147b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
