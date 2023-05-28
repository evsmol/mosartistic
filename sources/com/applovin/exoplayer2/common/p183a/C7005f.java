package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.p183a.C6949ae;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.f */
abstract class C7005f<K, V> implements C6941ac<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a */
    private transient Collection<Map.Entry<K, V>> f15458a;
    @MonotonicNonNullDecl

    /* renamed from: b */
    private transient Set<K> f15459b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    private transient Collection<V> f15460c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    private transient Map<K, Collection<V>> f15461d;

    /* renamed from: com.applovin.exoplayer2.common.a.f$a */
    class C7006a extends C6949ae.C6951b<K, V> {
        C7006a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6941ac<K, V> mo53218a() {
            return C7005f.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C7005f.this.mo53306m();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.f$b */
    class C7007b extends C7005f<K, V>.a implements Set<Map.Entry<K, V>> {
        C7007b() {
            super();
        }

        public boolean equals(@NullableDecl Object obj) {
            return C6967aq.m18596a((Set<?>) this, obj);
        }

        public int hashCode() {
            return C6967aq.m18592a((Set<?>) this);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.f$c */
    class C7008c extends AbstractCollection<V> {
        C7008c() {
        }

        public void clear() {
            C7005f.this.mo53207e();
        }

        public boolean contains(@NullableDecl Object obj) {
            return C7005f.this.mo53438d(obj);
        }

        public Iterator<V> iterator() {
            return C7005f.this.mo53303j();
        }

        public int size() {
            return C7005f.this.mo53206d();
        }
    }

    C7005f() {
    }

    /* renamed from: a */
    public boolean mo53201a(@NullableDecl K k, @NullableDecl V v) {
        return mo53202b(k).add(v);
    }

    /* renamed from: b */
    public Map<K, Collection<V>> mo53203b() {
        Map<K, Collection<V>> map = this.f15461d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> n = mo53217n();
        this.f15461d = n;
        return n;
    }

    /* renamed from: b */
    public boolean mo53204b(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) mo53203b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: c */
    public boolean mo53205c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection collection = (Collection) mo53203b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    /* renamed from: d */
    public boolean mo53438d(@NullableDecl Object obj) {
        for (Collection contains : mo53203b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@NullableDecl Object obj) {
        return C6949ae.m18530a((C6941ac<?, ?>) this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Set<K> mo53216f();

    /* renamed from: h */
    public Collection<V> mo53208h() {
        Collection<V> collection = this.f15460c;
        if (collection != null) {
            return collection;
        }
        Collection<V> i = mo53302i();
        this.f15460c = i;
        return i;
    }

    public int hashCode() {
        return mo53203b().hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Collection<V> mo53302i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Iterator<V> mo53303j() {
        return C6931ab.m18494b(mo53304k().iterator());
    }

    /* renamed from: k */
    public Collection<Map.Entry<K, V>> mo53304k() {
        Collection<Map.Entry<K, V>> collection = this.f15458a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> l = mo53305l();
        this.f15458a = l;
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract Collection<Map.Entry<K, V>> mo53305l();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract Iterator<Map.Entry<K, V>> mo53306m();

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract Map<K, Collection<V>> mo53217n();

    /* renamed from: p */
    public Set<K> mo53440p() {
        Set<K> set = this.f15459b;
        if (set != null) {
            return set;
        }
        Set<K> f = mo53216f();
        this.f15459b = f;
        return f;
    }

    public String toString() {
        return mo53203b().toString();
    }
}
