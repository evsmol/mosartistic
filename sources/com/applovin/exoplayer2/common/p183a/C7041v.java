package com.applovin.exoplayer2.common.p183a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.v */
public abstract class C7041v<K, V> extends C7009g<K, V> implements Serializable {

    /* renamed from: b */
    final transient C7039u<K, ? extends C7029q<V>> f15516b;

    /* renamed from: c */
    final transient int f15517c;

    /* renamed from: com.applovin.exoplayer2.common.a.v$a */
    public static class C7044a<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f15525a = C6956aj.m18549a();
        @MonotonicNonNullDecl

        /* renamed from: b */
        Comparator<? super K> f15526b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        Comparator<? super V> f15527c;

        /* renamed from: b */
        public C7044a<K, V> mo53540b(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection collection = this.f15525a.get(k);
                Iterator<? extends V> it = iterable.iterator();
                if (collection != null) {
                    while (it.hasNext()) {
                        Object next = it.next();
                        C7012j.m18716a((Object) k, (Object) next);
                        collection.add(next);
                    }
                    return this;
                } else if (!it.hasNext()) {
                    return this;
                } else {
                    Collection c = mo53579c();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        C7012j.m18716a((Object) k, (Object) next2);
                        c.add(next2);
                    }
                    this.f15525a.put(k, c);
                    return this;
                }
            } else {
                throw new NullPointerException("null key in entry: null=" + C7048x.m18903a((Iterable<?>) iterable));
            }
        }

        /* renamed from: b */
        public C7044a<K, V> mo53541b(K k, V... vArr) {
            return mo53540b(k, Arrays.asList(vArr));
        }

        /* renamed from: b */
        public C7041v<K, V> mo53542b() {
            Collection entrySet = this.f15525a.entrySet();
            Comparator comparator = this.f15526b;
            if (comparator != null) {
                entrySet = C6955ai.m18543a(comparator).mo53230c().mo53229a(entrySet);
            }
            return C7037t.m18822a(entrySet, this.f15527c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Collection<V> mo53579c() {
            return new ArrayList();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.v$b */
    private static class C7045b<K, V> extends C7029q<Map.Entry<K, V>> {

        /* renamed from: a */
        final C7041v<K, V> f15528a;

        C7045b(C7041v<K, V> vVar) {
            this.f15528a = vVar;
        }

        /* renamed from: a */
        public C6980ax<Map.Entry<K, V>> iterator() {
            return this.f15528a.mo53306m();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f15528a.mo53204b(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return this.f15528a.mo53565g();
        }

        public int size() {
            return this.f15528a.mo53206d();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.v$c */
    private static final class C7046c<K, V> extends C7029q<V> {

        /* renamed from: a */
        private final transient C7041v<K, V> f15529a;

        C7046c(C7041v<K, V> vVar) {
            this.f15529a = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo53231a(Object[] objArr, int i) {
            C6980ax<? extends C7029q<V>> a = this.f15529a.f15516b.values().iterator();
            while (a.hasNext()) {
                i = ((C7029q) a.next()).mo53231a(objArr, i);
            }
            return i;
        }

        /* renamed from: a */
        public C6980ax<V> iterator() {
            return this.f15529a.mo53303j();
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f15529a.mo53438d(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo53235f() {
            return true;
        }

        public int size() {
            return this.f15529a.mo53206d();
        }
    }

    C7041v(C7039u<K, ? extends C7029q<V>> uVar, int i) {
        this.f15516b = uVar;
        this.f15517c = i;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo53201a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo53204b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.mo53204b(obj, obj2);
    }

    @Deprecated
    /* renamed from: c */
    public boolean mo53205c(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public int mo53206d() {
        return this.f15517c;
    }

    /* renamed from: d */
    public boolean mo53438d(@NullableDecl Object obj) {
        return obj != null && super.mo53438d(obj);
    }

    /* renamed from: e */
    public abstract C7029q<V> mo53202b(K k);

    @Deprecated
    /* renamed from: e */
    public void mo53207e() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Set<K> mo53216f() {
        throw new AssertionError("unreachable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo53565g() {
        return this.f15516b.mo53242i();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Map<K, Collection<V>> mo53217n() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: o */
    public C7047w<K> mo53440p() {
        return this.f15516b.keySet();
    }

    /* renamed from: q */
    public C7039u<K, Collection<V>> mo53203b() {
        return this.f15516b;
    }

    /* renamed from: r */
    public C7029q<Map.Entry<K, V>> mo53304k() {
        return (C7029q) super.mo53304k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C7029q<Map.Entry<K, V>> mo53305l() {
        return new C7045b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C6980ax<Map.Entry<K, V>> mo53306m() {
        return new C6980ax<Map.Entry<K, V>>() {

            /* renamed from: a */
            final Iterator<? extends Map.Entry<K, ? extends C7029q<V>>> f15518a = C7041v.this.f15516b.entrySet().iterator();

            /* renamed from: b */
            K f15519b = null;

            /* renamed from: c */
            Iterator<V> f15520c = C7049y.m18907a();

            /* renamed from: a */
            public Map.Entry<K, V> next() {
                if (!this.f15520c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f15518a.next();
                    this.f15519b = entry.getKey();
                    this.f15520c = ((C7029q) entry.getValue()).iterator();
                }
                return C6931ab.m18492a(this.f15519b, this.f15520c.next());
            }

            public boolean hasNext() {
                return this.f15520c.hasNext() || this.f15518a.hasNext();
            }
        };
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: u */
    public C7029q<V> mo53208h() {
        return (C7029q) super.mo53208h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C7029q<V> mo53302i() {
        return new C7046c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C6980ax<V> mo53303j() {
        return new C6980ax<V>() {

            /* renamed from: a */
            Iterator<? extends C7029q<V>> f15522a = C7041v.this.f15516b.values().iterator();

            /* renamed from: b */
            Iterator<V> f15523b = C7049y.m18907a();

            public boolean hasNext() {
                return this.f15523b.hasNext() || this.f15522a.hasNext();
            }

            public V next() {
                if (!this.f15523b.hasNext()) {
                    this.f15523b = ((C7029q) this.f15522a.next()).iterator();
                }
                return this.f15523b.next();
            }
        };
    }
}
