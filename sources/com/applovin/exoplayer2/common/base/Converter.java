package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @MonotonicNonNullDecl
    @LazyInit
    private transient Converter<B, A> reverse;

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$a */
    private static final class C7088a<A, B, C> extends Converter<A, C> implements Serializable {

        /* renamed from: a */
        final Converter<A, B> f15592a;

        /* renamed from: b */
        final Converter<B, C> f15593b;

        C7088a(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f15592a = converter;
            this.f15593b = converter2;
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c) {
            return this.f15592a.correctedDoBackward(this.f15593b.correctedDoBackward(c));
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public C correctedDoForward(@NullableDecl A a) {
            return this.f15593b.correctedDoForward(this.f15592a.correctedDoForward(a));
        }

        /* access modifiers changed from: protected */
        public A doBackward(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public C doForward(A a) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C7088a)) {
                return false;
            }
            C7088a aVar = (C7088a) obj;
            return this.f15592a.equals(aVar.f15592a) && this.f15593b.equals(aVar.f15593b);
        }

        public int hashCode() {
            return (this.f15592a.hashCode() * 31) + this.f15593b.hashCode();
        }

        public String toString() {
            return this.f15592a + ".andThen(" + this.f15593b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$b */
    private static final class C7089b<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: a */
        private final Function<? super A, ? extends B> f15594a;

        /* renamed from: b */
        private final Function<? super B, ? extends A> f15595b;

        private C7089b(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f15594a = (Function) Preconditions.checkNotNull(function);
            this.f15595b = (Function) Preconditions.checkNotNull(function2);
        }

        /* access modifiers changed from: protected */
        public A doBackward(B b) {
            return this.f15595b.apply(b);
        }

        /* access modifiers changed from: protected */
        public B doForward(A a) {
            return this.f15594a.apply(a);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C7089b)) {
                return false;
            }
            C7089b bVar = (C7089b) obj;
            return this.f15594a.equals(bVar.f15594a) && this.f15595b.equals(bVar.f15595b);
        }

        public int hashCode() {
            return (this.f15594a.hashCode() * 31) + this.f15595b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f15594a + ", " + this.f15595b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$c */
    private static final class C7090c<T> extends Converter<T, T> implements Serializable {

        /* renamed from: a */
        static final C7090c f15596a = new C7090c();

        private C7090c() {
        }

        /* renamed from: a */
        public C7090c<T> reverse() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        /* access modifiers changed from: protected */
        public T doBackward(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        public T doForward(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Converter$d */
    private static final class C7091d<A, B> extends Converter<B, A> implements Serializable {

        /* renamed from: a */
        final Converter<A, B> f15597a;

        C7091d(Converter<A, B> converter) {
            this.f15597a = converter;
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a) {
            return this.f15597a.correctedDoForward(a);
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public A correctedDoForward(@NullableDecl B b) {
            return this.f15597a.correctedDoBackward(b);
        }

        /* access modifiers changed from: protected */
        public B doBackward(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public A doForward(B b) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7091d) {
                return this.f15597a.equals(((C7091d) obj).f15597a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f15597a.hashCode();
        }

        public Converter<A, B> reverse() {
            return this.f15597a;
        }

        public String toString() {
            return this.f15597a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new C7089b(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return C7090c.f15596a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a) {
        return convert(a);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a) {
        return correctedDoForward(a);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() {
            public Iterator<B> iterator() {
                return new Iterator<B>() {

                    /* renamed from: b */
                    private final Iterator<? extends A> f15591b = iterable.iterator();

                    public boolean hasNext() {
                        return this.f15591b.hasNext();
                    }

                    public B next() {
                        return Converter.this.convert(this.f15591b.next());
                    }

                    public void remove() {
                        this.f15591b.remove();
                    }
                };
            }
        };
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b) {
        if (!this.handleNullAutomatically) {
            return doBackward(b);
        }
        if (b == null) {
            return null;
        }
        return Preconditions.checkNotNull(doBackward(b));
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public B correctedDoForward(@NullableDecl A a) {
        if (!this.handleNullAutomatically) {
            return doForward(a);
        }
        if (a == null) {
            return null;
        }
        return Preconditions.checkNotNull(doForward(a));
    }

    /* access modifiers changed from: package-private */
    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new C7088a(this, (Converter) Preconditions.checkNotNull(converter));
    }

    /* access modifiers changed from: protected */
    public abstract A doBackward(B b);

    /* access modifiers changed from: protected */
    public abstract B doForward(A a);

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        C7091d dVar = new C7091d(this);
        this.reverse = dVar;
        return dVar;
    }
}
