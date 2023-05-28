package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Predicates {

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$a */
    private static class C7101a<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        private final List<? extends Predicate<? super T>> f15608a;

        private C7101a(List<? extends Predicate<? super T>> list) {
            this.f15608a = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f15608a.size(); i++) {
                if (!((Predicate) this.f15608a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7101a) {
                return this.f15608a.equals(((C7101a) obj).f15608a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15608a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f15608a);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$b */
    private static class C7102b<A, B> implements Predicate<A>, Serializable {

        /* renamed from: a */
        final Predicate<B> f15609a;

        /* renamed from: b */
        final Function<A, ? extends B> f15610b;

        private C7102b(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f15609a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f15610b = (Function) Preconditions.checkNotNull(function);
        }

        public boolean apply(@NullableDecl A a) {
            return this.f15609a.apply(this.f15610b.apply(a));
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof C7102b)) {
                return false;
            }
            C7102b bVar = (C7102b) obj;
            return this.f15610b.equals(bVar.f15610b) && this.f15609a.equals(bVar.f15609a);
        }

        public int hashCode() {
            return this.f15610b.hashCode() ^ this.f15609a.hashCode();
        }

        public String toString() {
            return this.f15609a + "(" + this.f15610b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$c */
    private static class C7103c<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        private final Collection<?> f15611a;

        private C7103c(Collection<?> collection) {
            this.f15611a = (Collection) Preconditions.checkNotNull(collection);
        }

        public boolean apply(@NullableDecl T t) {
            try {
                return this.f15611a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7103c) {
                return this.f15611a.equals(((C7103c) obj).f15611a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15611a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f15611a + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$d */
    private static class C7104d implements Predicate<Object>, Serializable {

        /* renamed from: a */
        private final Class<?> f15612a;

        private C7104d(Class<?> cls) {
            this.f15612a = (Class) Preconditions.checkNotNull(cls);
        }

        public boolean apply(@NullableDecl Object obj) {
            return this.f15612a.isInstance(obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof C7104d) && this.f15612a == ((C7104d) obj).f15612a;
        }

        public int hashCode() {
            return this.f15612a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f15612a.getName() + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$e */
    private static class C7105e<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        private final T f15613a;

        private C7105e(T t) {
            this.f15613a = t;
        }

        public boolean apply(T t) {
            return this.f15613a.equals(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7105e) {
                return this.f15613a.equals(((C7105e) obj).f15613a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15613a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f15613a + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$f */
    private static class C7106f<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        final Predicate<T> f15614a;

        C7106f(Predicate<T> predicate) {
            this.f15614a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean apply(@NullableDecl T t) {
            return !this.f15614a.apply(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7106f) {
                return this.f15614a.equals(((C7106f) obj).f15614a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f15614a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f15614a + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$g */
    enum C7107g implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> Predicate<T> mo53702a() {
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$h */
    private static class C7112h<T> implements Predicate<T>, Serializable {

        /* renamed from: a */
        private final List<? extends Predicate<? super T>> f15620a;

        private C7112h(List<? extends Predicate<? super T>> list) {
            this.f15620a = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f15620a.size(); i++) {
                if (((Predicate) this.f15620a.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C7112h) {
                return this.f15620a.equals(((C7112h) obj).f15620a);
            }
            return false;
        }

        public int hashCode() {
            return this.f15620a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f15620a);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Predicates$i */
    private static class C7113i implements Predicate<Class<?>>, Serializable {

        /* renamed from: a */
        private final Class<?> f15621a;

        private C7113i(Class<?> cls) {
            this.f15621a = (Class) Preconditions.checkNotNull(cls);
        }

        /* renamed from: a */
        public boolean apply(Class<?> cls) {
            return this.f15621a.isAssignableFrom(cls);
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof C7113i) && this.f15621a == ((C7113i) obj).f15621a;
        }

        public int hashCode() {
            return this.f15621a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f15621a.getName() + ")";
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return C7107g.ALWAYS_FALSE.mo53702a();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return C7107g.ALWAYS_TRUE.mo53702a();
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new C7101a(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new C7101a(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new C7101a(defensiveCopy((T[]) predicateArr));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new C7102b(predicate, function);
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T checkNotNull : iterable) {
            arrayList.add(Preconditions.checkNotNull(checkNotNull));
        }
        return arrayList;
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        return t == null ? isNull() : new C7105e(t);
    }

    /* renamed from: in */
    public static <T> Predicate<T> m18953in(Collection<? extends T> collection) {
        return new C7103c(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new C7104d(cls);
    }

    public static <T> Predicate<T> isNull() {
        return C7107g.IS_NULL.mo53702a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new C7106f(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return C7107g.NOT_NULL.mo53702a();
    }

    /* renamed from: or */
    public static <T> Predicate<T> m18954or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new C7112h(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    /* renamed from: or */
    public static <T> Predicate<T> m18955or(Iterable<? extends Predicate<? super T>> iterable) {
        return new C7112h(defensiveCopy(iterable));
    }

    @SafeVarargs
    /* renamed from: or */
    public static <T> Predicate<T> m18956or(Predicate<? super T>... predicateArr) {
        return new C7112h(defensiveCopy((T[]) predicateArr));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new C7113i(cls);
    }

    /* access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
