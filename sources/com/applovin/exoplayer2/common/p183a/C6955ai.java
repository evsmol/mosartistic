package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.ai */
public abstract class C6955ai<T> implements Comparator<T> {
    protected C6955ai() {
    }

    /* renamed from: a */
    public static <T> C6955ai<T> m18543a(Comparator<T> comparator) {
        return comparator instanceof C6955ai ? (C6955ai) comparator : new C7023m(comparator);
    }

    /* renamed from: b */
    public static <C extends Comparable> C6955ai<C> m18544b() {
        return C6953ag.f15377a;
    }

    /* renamed from: a */
    public <S extends T> C6955ai<S> mo53225a() {
        return new C6965ao(this);
    }

    /* renamed from: a */
    public <F> C6955ai<F> mo53228a(Function<F, ? extends T> function) {
        return new C7011i(function, this);
    }

    /* renamed from: a */
    public <E extends T> C7033s<E> mo53229a(Iterable<E> iterable) {
        return C7033s.m18798a(this, iterable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T2 extends T> C6955ai<Map.Entry<T2, ?>> mo53230c() {
        return mo53228a(C6931ab.m18488a());
    }

    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);
}
