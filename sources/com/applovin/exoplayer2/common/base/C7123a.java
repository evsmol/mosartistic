package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.base.a */
final class C7123a<T> extends Optional<T> {

    /* renamed from: a */
    static final C7123a<Object> f15634a = new C7123a<>();

    private C7123a() {
    }

    /* renamed from: a */
    static <T> Optional<T> m18980a() {
        return f15634a;
    }

    public Set<T> asSet() {
        return Collections.emptySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    /* renamed from: or */
    public Optional<T> mo53682or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    /* renamed from: or */
    public T mo53683or(Supplier<? extends T> supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    /* renamed from: or */
    public T mo53684or(T t) {
        return Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @NullableDecl
    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }
}
