package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.p183a.C7029q;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.u */
public abstract class C7039u<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a */
    static final Map.Entry<?, ?>[] f15508a = new Map.Entry[0];
    @LazyInit

    /* renamed from: b */
    private transient C7047w<Map.Entry<K, V>> f15509b;
    @LazyInit

    /* renamed from: c */
    private transient C7047w<K> f15510c;
    @LazyInit

    /* renamed from: d */
    private transient C7029q<V> f15511d;

    /* renamed from: com.applovin.exoplayer2.common.a.u$a */
    public static class C7040a<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a */
        Comparator<? super V> f15512a;

        /* renamed from: b */
        Object[] f15513b;

        /* renamed from: c */
        int f15514c;

        /* renamed from: d */
        boolean f15515d;

        public C7040a() {
            this(4);
        }

        C7040a(int i) {
            this.f15513b = new Object[(i * 2)];
            this.f15514c = 0;
            this.f15515d = false;
        }

        /* renamed from: a */
        private void m18845a(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f15513b;
            if (i2 > objArr.length) {
                this.f15513b = Arrays.copyOf(objArr, C7029q.C7031b.m18792a(objArr.length, i2));
                this.f15515d = false;
            }
        }

        /* renamed from: a */
        public C7040a<K, V> mo53560a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m18845a(this.f15514c + ((Collection) iterable).size());
            }
            for (Map.Entry a : iterable) {
                mo53562a(a);
            }
            return this;
        }

        /* renamed from: a */
        public C7040a<K, V> mo53561a(K k, V v) {
            m18845a(this.f15514c + 1);
            C7012j.m18716a((Object) k, (Object) v);
            Object[] objArr = this.f15513b;
            int i = this.f15514c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f15514c = i + 1;
            return this;
        }

        /* renamed from: a */
        public C7040a<K, V> mo53562a(Map.Entry<? extends K, ? extends V> entry) {
            return mo53561a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public C7039u<K, V> mo53563a() {
            mo53564b();
            this.f15515d = true;
            return C6958al.m18558a(this.f15514c, this.f15513b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo53564b() {
            int i;
            if (this.f15512a != null) {
                if (this.f15515d) {
                    this.f15513b = Arrays.copyOf(this.f15513b, this.f15514c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f15514c];
                int i2 = 0;
                while (true) {
                    i = this.f15514c;
                    if (i2 >= i) {
                        break;
                    }
                    Object[] objArr = this.f15513b;
                    int i3 = i2 * 2;
                    entryArr[i2] = new AbstractMap.SimpleImmutableEntry(objArr[i3], objArr[i3 + 1]);
                    i2++;
                }
                Arrays.sort(entryArr, 0, i, C6955ai.m18543a(this.f15512a).mo53228a(C6931ab.m18493b()));
                for (int i4 = 0; i4 < this.f15514c; i4++) {
                    int i5 = i4 * 2;
                    this.f15513b[i5] = entryArr[i4].getKey();
                    this.f15513b[i5 + 1] = entryArr[i4].getValue();
                }
            }
        }
    }

    C7039u() {
    }

    /* renamed from: a */
    public static <K, V> C7039u<K, V> m18834a() {
        return C6958al.f15381b;
    }

    /* renamed from: a */
    public static <K, V> C7039u<K, V> m18835a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        C7040a aVar = new C7040a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo53560a(iterable);
        return aVar.mo53563a();
    }

    /* renamed from: a */
    public static <K, V> C7039u<K, V> m18836a(Map<? extends K, ? extends V> map) {
        if ((map instanceof C7039u) && !(map instanceof SortedMap)) {
            C7039u<K, V> uVar = (C7039u) map;
            if (!uVar.mo53242i()) {
                return uVar;
            }
        }
        return m18835a(map.entrySet());
    }

    /* renamed from: b */
    public static <K, V> C7040a<K, V> m18837b() {
        return new C7040a<>();
    }

    /* renamed from: c */
    public C7047w<Map.Entry<K, V>> entrySet() {
        C7047w<Map.Entry<K, V>> wVar = this.f15509b;
        if (wVar != null) {
            return wVar;
        }
        C7047w<Map.Entry<K, V>> d = mo53238d();
        this.f15509b = d;
        return d;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C7047w<Map.Entry<K, V>> mo53238d();

    /* renamed from: e */
    public C7047w<K> keySet() {
        C7047w<K> wVar = this.f15510c;
        if (wVar != null) {
            return wVar;
        }
        C7047w<K> f = mo53239f();
        this.f15510c = f;
        return f;
    }

    public boolean equals(@NullableDecl Object obj) {
        return C6931ab.m18498d(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C7047w<K> mo53239f();

    /* renamed from: g */
    public C7029q<V> values() {
        C7029q<V> qVar = this.f15511d;
        if (qVar != null) {
            return qVar;
        }
        C7029q<V> h = mo53241h();
        this.f15511d = h;
        return h;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract C7029q<V> mo53241h();

    public int hashCode() {
        return C6967aq.m18592a((Set<?>) entrySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract boolean mo53242i();

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C6931ab.m18490a((Map<?, ?>) this);
    }
}
