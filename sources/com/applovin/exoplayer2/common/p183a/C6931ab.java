package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.p183a.C6967aq;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.ab */
public final class C6931ab {

    /* renamed from: com.applovin.exoplayer2.common.a.ab$a */
    private enum C6934a implements Function<Map.Entry<?, ?>, Object> {
        KEY {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            @NullableDecl
            /* renamed from: a */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ab$b */
    static abstract class C6937b<K, V> extends C6967aq.C6972a<Map.Entry<K, V>> {
        C6937b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Map<K, V> mo53171a();

        public void clear() {
            mo53171a().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object a = C6931ab.m18489a(mo53171a(), key);
            if (Objects.equal(a, entry.getValue())) {
                return a != null || mo53171a().containsKey(key);
            }
            return false;
        }

        public boolean isEmpty() {
            return mo53171a().isEmpty();
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return mo53171a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return C6967aq.m18598a((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C6967aq.m18595a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a.add(((Map.Entry) next).getKey());
                    }
                }
                return mo53171a().keySet().retainAll(a);
            }
        }

        public int size() {
            return mo53171a().size();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ab$c */
    static class C6938c<K, V> extends C6967aq.C6972a<K> {

        /* renamed from: d */
        final Map<K, V> f15366d;

        C6938c(Map<K, V> map) {
            this.f15366d = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map<K, V> mo53179c() {
            return this.f15366d;
        }

        public void clear() {
            mo53179c().clear();
        }

        public boolean contains(Object obj) {
            return mo53179c().containsKey(obj);
        }

        public boolean isEmpty() {
            return mo53179c().isEmpty();
        }

        public Iterator<K> iterator() {
            return C6931ab.m18491a(mo53179c().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            mo53179c().remove(obj);
            return true;
        }

        public int size() {
            return mo53179c().size();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ab$d */
    static class C6939d<K, V> extends AbstractCollection<V> {

        /* renamed from: a */
        final Map<K, V> f15367a;

        C6939d(Map<K, V> map) {
            this.f15367a = (Map) Preconditions.checkNotNull(map);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Map<K, V> mo53186a() {
            return this.f15367a;
        }

        public void clear() {
            mo53186a().clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            return mo53186a().containsValue(obj);
        }

        public boolean isEmpty() {
            return mo53186a().isEmpty();
        }

        public Iterator<V> iterator() {
            return C6931ab.m18494b(mo53186a().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : mo53186a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        mo53186a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C6967aq.m18594a();
                for (Map.Entry entry : mo53186a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return mo53186a().keySet().removeAll(a);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = C6967aq.m18594a();
                for (Map.Entry entry : mo53186a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return mo53186a().keySet().retainAll(a);
            }
        }

        public int size() {
            return mo53186a().size();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ab$e */
    static abstract class C6940e<K, V> extends AbstractMap<K, V> {
        @MonotonicNonNullDecl

        /* renamed from: a */
        private transient Set<Map.Entry<K, V>> f15368a;
        @MonotonicNonNullDecl

        /* renamed from: b */
        private transient Set<K> f15369b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        private transient Collection<V> f15370c;

        C6940e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo53195a();

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f15368a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a = mo53195a();
            this.f15368a = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Set<K> mo53197h() {
            return new C6938c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Collection<V> mo53198i() {
            return new C6939d(this);
        }

        public Set<K> keySet() {
            Set<K> set = this.f15369b;
            if (set != null) {
                return set;
            }
            Set<K> h = mo53197h();
            this.f15369b = h;
            return h;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f15370c;
            if (collection != null) {
                return collection;
            }
            Collection<V> i = mo53198i();
            this.f15370c = i;
            return i;
        }
    }

    /* renamed from: a */
    static int m18487a(int i) {
        if (i < 3) {
            C7012j.m18715a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: a */
    static <K> Function<Map.Entry<K, ?>, K> m18488a() {
        return C6934a.KEY;
    }

    /* renamed from: a */
    static <V> V m18489a(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m18490a(Map<?, ?> map) {
        StringBuilder a = C7013k.m18718a(map.size());
        a.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            a.append(next.getKey());
            a.append('=');
            a.append(next.getValue());
        }
        a.append('}');
        return a.toString();
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m18491a(Iterator<Map.Entry<K, V>> it) {
        return new C6979aw<Map.Entry<K, V>, K>(it) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public K mo53165a(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        };
    }

    /* renamed from: a */
    public static <K, V> Map.Entry<K, V> m18492a(@NullableDecl K k, @NullableDecl V v) {
        return new C7032r(k, v);
    }

    /* renamed from: b */
    static <V> Function<Map.Entry<?, V>, V> m18493b() {
        return C6934a.VALUE;
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m18494b(Iterator<Map.Entry<K, V>> it) {
        return new C6979aw<Map.Entry<K, V>, V>(it) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public V mo53165a(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: b */
    static boolean m18495b(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: c */
    static <V> V m18496c(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static <K, V> IdentityHashMap<K, V> m18497c() {
        return new IdentityHashMap<>();
    }

    /* renamed from: d */
    static boolean m18498d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
