package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.p183a.C7029q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.applovin.exoplayer2.common.a.s */
public abstract class C7033s<E> extends C7029q<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    private static final C6981ay<Object> f15503a = new C7035b(C6957ak.f15378a, 0);

    /* renamed from: com.applovin.exoplayer2.common.a.s$a */
    public static final class C7034a<E> extends C7029q.C7030a<E> {
        public C7034a() {
            this(4);
        }

        C7034a(int i) {
            super(i);
        }

        /* renamed from: a */
        public C7033s<E> mo53531a() {
            this.f15500c = true;
            return C7033s.m18801b(this.f15498a, this.f15499b);
        }

        /* renamed from: b */
        public C7034a<E> mo53515a(E e) {
            super.mo53515a(e);
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.s$b */
    static class C7035b<E> extends C6929a<E> {

        /* renamed from: a */
        private final C7033s<E> f15504a;

        C7035b(C7033s<E> sVar, int i) {
            super(sVar.size(), i);
            this.f15504a = sVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo53158a(int i) {
            return this.f15504a.get(i);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.s$c */
    class C7036c extends C7033s<E> {

        /* renamed from: a */
        final transient int f15505a;

        /* renamed from: b */
        final transient int f15506b;

        C7036c(int i, int i2) {
            this.f15505a = i;
            this.f15506b = i2;
        }

        /* renamed from: a */
        public C7033s<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.f15506b);
            C7033s sVar = C7033s.this;
            int i3 = this.f15505a;
            return sVar.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Object[] mo53232b() {
            return C7033s.this.mo53232b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo53233c() {
            return C7033s.this.mo53233c() + this.f15505a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo53234d() {
            return C7033s.this.mo53233c() + this.f15505a + this.f15506b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return true;
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, this.f15506b);
            return C7033s.this.get(i + this.f15505a);
        }

        public /* synthetic */ Iterator iterator() {
            return C7033s.super.iterator();
        }

        public /* synthetic */ ListIterator listIterator() {
            return C7033s.super.listIterator();
        }

        public /* synthetic */ ListIterator listIterator(int i) {
            return C7033s.super.listIterator(i);
        }

        public int size() {
            return this.f15506b;
        }
    }

    C7033s() {
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18793a(E e) {
        return m18802c(e);
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18794a(E e, E e2) {
        return m18802c(e, e2);
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18795a(E e, E e2, E e3, E e4, E e5) {
        return m18802c(e, e2, e3, e4, e5);
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18796a(E e, E e2, E e3, E e4, E e5, E e6) {
        return m18802c(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18797a(Collection<? extends E> collection) {
        if (!(collection instanceof C7029q)) {
            return m18802c(collection.toArray());
        }
        C7033s<E> e = ((C7029q) collection).mo53252e();
        return e.mo53235f() ? m18800b(e.toArray()) : e;
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18798a(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] b = C7048x.m18904b(iterable);
        C6954ah.m18540a(b);
        Arrays.sort(b, comparator);
        return m18800b(b);
    }

    /* renamed from: a */
    public static <E> C7033s<E> m18799a(E[] eArr) {
        return eArr.length == 0 ? m18803g() : m18802c((Object[]) eArr.clone());
    }

    /* renamed from: b */
    static <E> C7033s<E> m18800b(Object[] objArr) {
        return m18801b(objArr, objArr.length);
    }

    /* renamed from: b */
    static <E> C7033s<E> m18801b(Object[] objArr, int i) {
        return i == 0 ? m18803g() : new C6957ak(objArr, i);
    }

    /* renamed from: c */
    private static <E> C7033s<E> m18802c(Object... objArr) {
        return m18800b(C6954ah.m18540a(objArr));
    }

    /* renamed from: g */
    public static <E> C7033s<E> m18803g() {
        return C6957ak.f15378a;
    }

    /* renamed from: i */
    public static <E> C7034a<E> m18804i() {
        return new C7034a<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53231a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public C6980ax<E> iterator() {
        return listIterator();
    }

    /* renamed from: a */
    public C6981ay<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        return isEmpty() ? f15503a : new C7035b(this, i);
    }

    /* renamed from: a */
    public C7033s<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? m18803g() : mo53520b(i, i2);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7033s<E> mo53520b(int i, int i2) {
        return new C7036c(i, i2 - i);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: e */
    public final C7033s<E> mo53252e() {
        return this;
    }

    public boolean equals(Object obj) {
        return C6930aa.m18482a(this, obj);
    }

    /* renamed from: h */
    public C6981ay<E> listIterator() {
        return listIterator(0);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6930aa.m18483b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6930aa.m18484c(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }
}
