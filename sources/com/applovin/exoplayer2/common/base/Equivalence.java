package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence2, @NullableDecl T t) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence2);
            this.reference = t;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$a */
    static final class C7093a extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C7093a f15598a = new C7093a();

        C7093a() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$b */
    private static final class C7094b<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        private final Equivalence<T> f15599a;
        @NullableDecl

        /* renamed from: b */
        private final T f15600b;

        C7094b(Equivalence<T> equivalence, @NullableDecl T t) {
            this.f15599a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f15600b = t;
        }

        public boolean apply(@NullableDecl T t) {
            return this.f15599a.equivalent(t, this.f15600b);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7094b)) {
                return false;
            }
            C7094b bVar = (C7094b) obj;
            return this.f15599a.equals(bVar.f15599a) && Objects.equal(this.f15600b, bVar.f15600b);
        }

        public int hashCode() {
            return Objects.hashCode(this.f15599a, this.f15600b);
        }

        public String toString() {
            return this.f15599a + ".equivalentTo(" + this.f15600b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Equivalence$c */
    static final class C7095c extends Equivalence<Object> implements Serializable {

        /* renamed from: a */
        static final C7095c f15601a = new C7095c();

        C7095c() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return C7093a.f15598a;
    }

    public static Equivalence<Object> identity() {
        return C7095c.f15601a;
    }

    /* access modifiers changed from: protected */
    public abstract boolean doEquivalent(T t, T t2);

    /* access modifiers changed from: protected */
    public abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
        return new C7094b(this, t);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(s);
    }
}
