package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.base.d */
final class C7128d<T> extends Optional<T> {

    /* renamed from: a */
    private final T f15643a;

    C7128d(T t) {
        this.f15643a = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.f15643a);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C7128d) {
            return this.f15643a.equals(((C7128d) obj).f15643a);
        }
        return false;
    }

    public T get() {
        return this.f15643a;
    }

    public int hashCode() {
        return this.f15643a.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    /* renamed from: or */
    public Optional<T> mo53682or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    /* renamed from: or */
    public T mo53683or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f15643a;
    }

    /* renamed from: or */
    public T mo53684or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f15643a;
    }

    public T orNull() {
        return this.f15643a;
    }

    public String toString() {
        return "Optional.of(" + this.f15643a + ")";
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new C7128d(Preconditions.checkNotNull(function.apply(this.f15643a), "the Function passed to Optional.transform() must not return null."));
    }
}
