package com.yandex.metrica.impl.p082ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.dm */
public abstract class C2904dm<T> implements Callable<T> {
    /* renamed from: a */
    public abstract T mo16571a() throws Exception;

    public T call() {
        try {
            return mo16571a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
