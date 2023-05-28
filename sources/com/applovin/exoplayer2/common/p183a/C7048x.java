package com.applovin.exoplayer2.common.p183a;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.x */
public final class C7048x {
    @NullableDecl
    /* renamed from: a */
    public static <T> T m18901a(Iterable<? extends T> iterable, @NullableDecl T t) {
        return C7049y.m18909a(iterable.iterator(), t);
    }

    /* renamed from: a */
    private static <T> T m18902a(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public static String m18903a(Iterable<?> iterable) {
        return C7049y.m18910a(iterable.iterator());
    }

    /* renamed from: b */
    static Object[] m18904b(Iterable<?> iterable) {
        return m18906d(iterable).toArray();
    }

    /* renamed from: c */
    public static <T> T m18905c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C7049y.m18915b(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m18902a(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    private static <E> Collection<E> m18906d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C6930aa.m18481a(iterable.iterator());
    }
}
