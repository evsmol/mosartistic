package com.bytedance.sdk.component.p328f;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.sdk.component.f.f */
/* compiled from: TTFutureTask */
public class C10617f<V> extends FutureTask<V> implements Comparable<C10617f<V>> {

    /* renamed from: a */
    private int f26499a;

    /* renamed from: b */
    private int f26500b;

    public C10617f(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f26499a = i == -1 ? 5 : i;
        this.f26500b = i2;
    }

    public C10617f(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.f26499a = i == -1 ? 5 : i;
        this.f26500b = i2;
    }

    /* renamed from: a */
    public int compareTo(C10617f fVar) {
        if (mo64250a() < fVar.mo64250a()) {
            return 1;
        }
        return mo64250a() > fVar.mo64250a() ? -1 : 0;
    }

    /* renamed from: a */
    public int mo64250a() {
        return this.f26499a;
    }
}
