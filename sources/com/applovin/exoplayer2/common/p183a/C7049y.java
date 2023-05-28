package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.y */
public final class C7049y {

    /* renamed from: com.applovin.exoplayer2.common.a.y$a */
    private static final class C7051a<T> extends C6929a<T> {

        /* renamed from: a */
        static final C6981ay<Object> f15533a = new C7051a(new Object[0], 0, 0, 0);

        /* renamed from: b */
        private final T[] f15534b;

        /* renamed from: c */
        private final int f15535c;

        C7051a(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f15534b = tArr;
            this.f15535c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo53158a(int i) {
            return this.f15534b[this.f15535c + i];
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.y$b */
    private enum C7052b implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C7012j.m18717a(false);
        }
    }

    /* renamed from: a */
    static <T> C6980ax<T> m18907a() {
        return m18914b();
    }

    /* renamed from: a */
    public static <T> C6980ax<T> m18908a(@NullableDecl final T t) {
        return new C6980ax<T>() {

            /* renamed from: a */
            boolean f15531a;

            public boolean hasNext() {
                return !this.f15531a;
            }

            public T next() {
                if (!this.f15531a) {
                    this.f15531a = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    @NullableDecl
    /* renamed from: a */
    public static <T> T m18909a(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: a */
    public static String m18910a(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> boolean m18911a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m18912a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18913a(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.applovin.exoplayer2.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.p183a.C7049y.m18913a(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: b */
    static <T> C6981ay<T> m18914b() {
        return C7051a.f15533a;
    }

    /* renamed from: b */
    public static <T> T m18915b(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    /* renamed from: c */
    static <T> T m18916c(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: c */
    static <T> Iterator<T> m18917c() {
        return C7052b.INSTANCE;
    }

    /* renamed from: d */
    static void m18918d(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
