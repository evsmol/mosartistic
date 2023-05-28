package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    Optional() {
    }

    public static <T> Optional<T> absent() {
        return C7123a.m18980a();
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t) {
        return t == null ? absent() : new C7128d(t);
    }

    /* renamed from: of */
    public static <T> Optional<T> m18948of(T t) {
        return new C7128d(Preconditions.checkNotNull(t));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() {
            public Iterator<T> iterator() {
                return new C7124b<T>() {

                    /* renamed from: b */
                    private final Iterator<? extends Optional<? extends T>> f15607b = ((Iterator) Preconditions.checkNotNull(iterable.iterator()));

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public T mo53689a() {
                        while (this.f15607b.hasNext()) {
                            Optional optional = (Optional) this.f15607b.next();
                            if (optional.isPresent()) {
                                return optional.get();
                            }
                        }
                        return mo53727b();
                    }
                };
            }
        };
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* renamed from: or */
    public abstract Optional<T> mo53682or(Optional<? extends T> optional);

    /* renamed from: or */
    public abstract T mo53683or(Supplier<? extends T> supplier);

    /* renamed from: or */
    public abstract T mo53684or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
