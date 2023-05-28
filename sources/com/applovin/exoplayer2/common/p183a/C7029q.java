package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.q */
public abstract class C7029q<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f15497a = new Object[0];

    /* renamed from: com.applovin.exoplayer2.common.a.q$a */
    static abstract class C7030a<E> extends C7031b<E> {

        /* renamed from: a */
        Object[] f15498a;

        /* renamed from: b */
        int f15499b = 0;

        /* renamed from: c */
        boolean f15500c;

        C7030a(int i) {
            C7012j.m18715a(i, "initialCapacity");
            this.f15498a = new Object[i];
        }

        /* renamed from: a */
        private void m18790a(int i) {
            Object[] objArr = this.f15498a;
            if (objArr.length < i) {
                this.f15498a = Arrays.copyOf(objArr, m18792a(objArr.length, i));
            } else if (this.f15500c) {
                this.f15498a = (Object[]) objArr.clone();
            } else {
                return;
            }
            this.f15500c = false;
        }

        /* renamed from: a */
        public C7030a<E> mo53515a(E e) {
            Preconditions.checkNotNull(e);
            m18790a(this.f15499b + 1);
            Object[] objArr = this.f15498a;
            int i = this.f15499b;
            this.f15499b = i + 1;
            objArr[i] = e;
            return this;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.q$b */
    public static abstract class C7031b<E> {
        C7031b() {
        }

        /* renamed from: a */
        static int m18792a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    C7029q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo53231a(Object[] objArr, int i) {
        C6980ax a = iterator();
        while (a.hasNext()) {
            objArr[i] = a.next();
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public abstract C6980ax<E> iterator();

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object[] mo53232b() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo53233c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo53234d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C7033s<E> mo53252e() {
        return isEmpty() ? C7033s.m18803g() : C7033s.m18800b(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo53235f();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f15497a);
    }

    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b = mo53232b();
            if (b != null) {
                return C6956aj.m18552a(b, mo53233c(), mo53234d(), tArr);
            }
            tArr = C6954ah.m18541a(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo53231a(tArr, 0);
        return tArr;
    }
}
