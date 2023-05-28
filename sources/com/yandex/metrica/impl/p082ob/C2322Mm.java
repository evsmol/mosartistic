package com.yandex.metrica.impl.p082ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.yandex.metrica.impl.ob.Mm */
public class C2322Mm implements ThreadFactory {

    /* renamed from: b */
    private static final AtomicInteger f6233b = new AtomicInteger(0);

    /* renamed from: a */
    private final String f6234a;

    public C2322Mm(String str) {
        this.f6234a = str;
    }

    /* renamed from: a */
    private String m7982a() {
        String str = this.f6234a;
        return str + "-" + f6233b.incrementAndGet();
    }

    /* renamed from: c */
    public static int m7983c() {
        return f6233b.incrementAndGet();
    }

    /* renamed from: b */
    public C2251Km mo16325b() {
        return new C2251Km(m7982a());
    }

    public Thread newThread(Runnable runnable) {
        return new C2288Lm(runnable, m7982a());
    }

    /* renamed from: a */
    public static C2288Lm m7981a(String str, Runnable runnable) {
        return new C2288Lm(runnable, new C2322Mm(str).m7982a());
    }
}
