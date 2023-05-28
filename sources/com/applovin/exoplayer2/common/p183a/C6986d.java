package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.p183a.C6931ab;
import com.applovin.exoplayer2.common.p183a.C7005f;
import i.a;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.d */
abstract class C6986d<K, V> extends C7005f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public transient Map<K, Collection<V>> f15423a;

    /* renamed from: b */
    private transient int f15424b;

    /* renamed from: com.applovin.exoplayer2.common.a.d$a */
    private class C6989a extends C6931ab.C6940e<K, Collection<V>> {

        /* renamed from: a */
        final transient Map<K, Collection<V>> f15427a;

        /* renamed from: com.applovin.exoplayer2.common.a.d$a$a */
        class C6990a extends C6931ab.C6937b<K, Collection<V>> {
            C6990a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public Map<K, Collection<V>> mo53171a() {
                return C6989a.this;
            }

            public boolean contains(Object obj) {
                return C7013k.m18719a(C6989a.this.f15427a.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C6991b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C6986d.this.m18638e(((Map.Entry) obj).getKey());
                return true;
            }
        }

        /* renamed from: com.applovin.exoplayer2.common.a.d$a$b */
        class C6991b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Map.Entry<K, Collection<V>>> f15430a = C6989a.this.f15427a.entrySet().iterator();
            @NullableDecl

            /* renamed from: b */
            Collection<V> f15431b;

            C6991b() {
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f15430a.next();
                this.f15431b = (Collection) next.getValue();
                return C6989a.this.mo53311a(next);
            }

            public boolean hasNext() {
                return this.f15430a.hasNext();
            }

            public void remove() {
                C7012j.m18717a(this.f15431b != null);
                this.f15430a.remove();
                C6986d.m18634b(C6986d.this, this.f15431b.size());
                this.f15431b.clear();
                this.f15431b = null;
            }
        }

        C6989a(Map<K, Collection<V>> map) {
            this.f15427a = map;
        }

        /* renamed from: a */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C6931ab.m18489a(this.f15427a, obj);
            if (collection == null) {
                return null;
            }
            return C6986d.this.mo53295a(obj, collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map.Entry<K, Collection<V>> mo53311a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C6931ab.m18492a(key, C6986d.this.mo53295a(key, entry.getValue()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo53195a() {
            return new C6990a();
        }

        /* renamed from: b */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f15427a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> c = C6986d.this.mo53215c();
            c.addAll(remove);
            C6986d.m18634b(C6986d.this, remove.size());
            remove.clear();
            return c;
        }

        public void clear() {
            if (this.f15427a == C6986d.this.f15423a) {
                C6986d.this.mo53207e();
            } else {
                C7049y.m18918d(new C6991b());
            }
        }

        public boolean containsKey(Object obj) {
            return C6931ab.m18495b(this.f15427a, obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f15427a.equals(obj);
        }

        public int hashCode() {
            return this.f15427a.hashCode();
        }

        public Set<K> keySet() {
            return C6986d.this.mo53440p();
        }

        public int size() {
            return this.f15427a.size();
        }

        public String toString() {
            return this.f15427a.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$b */
    private abstract class C6992b<T> implements Iterator<T> {

        /* renamed from: b */
        final Iterator<Map.Entry<K, Collection<V>>> f15433b;
        @NullableDecl

        /* renamed from: c */
        K f15434c = null;
        @MonotonicNonNullDecl

        /* renamed from: d */
        Collection<V> f15435d = null;

        /* renamed from: e */
        Iterator<V> f15436e = C7049y.m18917c();

        C6992b() {
            this.f15433b = C6986d.this.f15423a.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo53308a(K k, V v);

        public boolean hasNext() {
            return this.f15433b.hasNext() || this.f15436e.hasNext();
        }

        public T next() {
            if (!this.f15436e.hasNext()) {
                Map.Entry next = this.f15433b.next();
                this.f15434c = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f15435d = collection;
                this.f15436e = collection.iterator();
            }
            return mo53308a(this.f15434c, this.f15436e.next());
        }

        public void remove() {
            this.f15436e.remove();
            if (this.f15435d.isEmpty()) {
                this.f15433b.remove();
            }
            C6986d.m18633b(C6986d.this);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$c */
    private class C6993c extends C6931ab.C6938c<K, Collection<V>> {
        C6993c(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C7049y.m18918d(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return mo53179c().keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || mo53179c().keySet().equals(obj);
        }

        public int hashCode() {
            return mo53179c().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = mo53179c().entrySet().iterator();
            return new Iterator<K>() {
                @NullableDecl

                /* renamed from: a */
                Map.Entry<K, Collection<V>> f15439a;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f15439a = entry;
                    return entry.getKey();
                }

                public void remove() {
                    C7012j.m18717a(this.f15439a != null);
                    Collection value = this.f15439a.getValue();
                    it.remove();
                    C6986d.m18634b(C6986d.this, value.size());
                    value.clear();
                    this.f15439a = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) mo53179c().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C6986d.m18634b(C6986d.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$d */
    class C6995d extends C6986d<K, V>.g implements NavigableMap<K, Collection<V>> {
        C6995d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Map.Entry<K, Collection<V>> mo53335a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection c = C6986d.this.mo53215c();
            c.addAll((Collection) next.getValue());
            it.remove();
            return C6931ab.m18492a(next.getKey(), C6986d.this.mo53296a(c));
        }

        /* renamed from: a */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public NavigableMap<K, Collection<V>> mo53351g() {
            return (NavigableMap) super.mo53351g();
        }

        /* renamed from: c */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: c */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = mo53351g().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return mo53311a(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return mo53351g().ceilingKey(k);
        }

        /* renamed from: d */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public NavigableSet<K> mo53197h() {
            return new C6996e(mo53351g());
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C6995d(mo53351g().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = mo53351g().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return mo53311a(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = mo53351g().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return mo53311a(floorEntry);
        }

        public K floorKey(K k) {
            return mo53351g().floorKey(k);
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C6995d(mo53351g().headMap(k, z));
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = mo53351g().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return mo53311a(higherEntry);
        }

        public K higherKey(K k) {
            return mo53351g().higherKey(k);
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = mo53351g().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return mo53311a(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = mo53351g().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return mo53311a(lowerEntry);
        }

        public K lowerKey(K k) {
            return mo53351g().lowerKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return mo53335a(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return mo53335a(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C6995d(mo53351g().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C6995d(mo53351g().tailMap(k, z));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$e */
    class C6996e extends C6986d<K, V>.h implements NavigableSet<K> {
        C6996e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public NavigableMap<K, Collection<V>> mo53370b() {
            return (NavigableMap) super.mo53370b();
        }

        /* renamed from: a */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        /* renamed from: a */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: b */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public K ceiling(K k) {
            return mo53370b().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new C6996e(mo53370b().descendingMap());
        }

        public K floor(K k) {
            return mo53370b().floorKey(k);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new C6996e(mo53370b().headMap(k, z));
        }

        public K higher(K k) {
            return mo53370b().higherKey(k);
        }

        public K lower(K k) {
            return mo53370b().lowerKey(k);
        }

        public K pollFirst() {
            return C7049y.m18916c(iterator());
        }

        public K pollLast() {
            return C7049y.m18916c(descendingIterator());
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new C6996e(mo53370b().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new C6996e(mo53370b().tailMap(k, z));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$f */
    private class C6997f extends C6986d<K, V>.j implements RandomAccess {
        C6997f(@NullableDecl K k, List<V> list, @NullableDecl C6986d<K, V>.i iVar) {
            super(k, list, iVar);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$g */
    private class C6998g extends C6986d<K, V>.a implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: d */
        SortedSet<K> f15445d;

        C6998g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return mo53351g().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public SortedSet<K> mo53197h() {
            return new C6999h(mo53351g());
        }

        /* renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f15445d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> e = mo53197h();
            this.f15445d = e;
            return e;
        }

        public K firstKey() {
            return mo53351g().firstKey();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public SortedMap<K, Collection<V>> mo53351g() {
            return (SortedMap) this.f15427a;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new C6998g(mo53351g().headMap(k));
        }

        public K lastKey() {
            return mo53351g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C6998g(mo53351g().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new C6998g(mo53351g().tailMap(k));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$h */
    private class C6999h extends C6986d<K, V>.c implements SortedSet<K> {
        C6999h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SortedMap<K, Collection<V>> mo53370b() {
            return (SortedMap) super.mo53179c();
        }

        public Comparator<? super K> comparator() {
            return mo53370b().comparator();
        }

        public K first() {
            return mo53370b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new C6999h(mo53370b().headMap(k));
        }

        public K last() {
            return mo53370b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new C6999h(mo53370b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new C6999h(mo53370b().tailMap(k));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$i */
    class C7000i extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: b */
        final K f15448b;

        /* renamed from: c */
        Collection<V> f15449c;
        @NullableDecl

        /* renamed from: d */
        final C6986d<K, V>.i f15450d;
        @NullableDecl

        /* renamed from: e */
        final Collection<V> f15451e;

        /* renamed from: com.applovin.exoplayer2.common.a.d$i$a */
        class C7001a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f15453a;

            /* renamed from: b */
            final Collection<V> f15454b = C7000i.this.f15449c;

            C7001a() {
                this.f15453a = C6986d.m18637c(C7000i.this.f15449c);
            }

            C7001a(Iterator<V> it) {
                this.f15453a = it;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo53410a() {
                C7000i.this.mo53391a();
                if (C7000i.this.f15449c != this.f15454b) {
                    throw new ConcurrentModificationException();
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Iterator<V> mo53411b() {
                mo53410a();
                return this.f15453a;
            }

            public boolean hasNext() {
                mo53410a();
                return this.f15453a.hasNext();
            }

            public V next() {
                mo53410a();
                return this.f15453a.next();
            }

            public void remove() {
                this.f15453a.remove();
                C6986d.m18633b(C6986d.this);
                C7000i.this.mo53394b();
            }
        }

        C7000i(@NullableDecl K k, Collection<V> collection, @NullableDecl C6986d<K, V>.i iVar) {
            this.f15448b = k;
            this.f15449c = collection;
            this.f15450d = iVar;
            this.f15451e = iVar == null ? null : iVar.mo53400e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53391a() {
            Collection<V> collection;
            C6986d<K, V>.i iVar = this.f15450d;
            if (iVar != null) {
                iVar.mo53391a();
                if (this.f15450d.mo53400e() != this.f15451e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f15449c.isEmpty() && (collection = (Collection) C6986d.this.f15423a.get(this.f15448b)) != null) {
                this.f15449c = collection;
            }
        }

        public boolean add(V v) {
            mo53391a();
            boolean isEmpty = this.f15449c.isEmpty();
            boolean add = this.f15449c.add(v);
            if (add) {
                C6986d.m18636c(C6986d.this);
                if (isEmpty) {
                    mo53399d();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f15449c.addAll(collection);
            if (addAll) {
                C6986d.m18630a(C6986d.this, this.f15449c.size() - size);
                if (size == 0) {
                    mo53399d();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo53394b() {
            C6986d<K, V>.i iVar = this.f15450d;
            if (iVar != null) {
                iVar.mo53394b();
            } else if (this.f15449c.isEmpty()) {
                C6986d.this.f15423a.remove(this.f15448b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public K mo53395c() {
            return this.f15448b;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f15449c.clear();
                C6986d.m18634b(C6986d.this, size);
                mo53394b();
            }
        }

        public boolean contains(Object obj) {
            mo53391a();
            return this.f15449c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo53391a();
            return this.f15449c.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53399d() {
            C6986d<K, V>.i iVar = this.f15450d;
            if (iVar != null) {
                iVar.mo53399d();
            } else {
                C6986d.this.f15423a.put(this.f15448b, this.f15449c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Collection<V> mo53400e() {
            return this.f15449c;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            mo53391a();
            return this.f15449c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C6986d<K, V>.i mo53402f() {
            return this.f15450d;
        }

        public int hashCode() {
            mo53391a();
            return this.f15449c.hashCode();
        }

        public Iterator<V> iterator() {
            mo53391a();
            return new C7001a();
        }

        public boolean remove(Object obj) {
            mo53391a();
            boolean remove = this.f15449c.remove(obj);
            if (remove) {
                C6986d.m18633b(C6986d.this);
                mo53394b();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f15449c.removeAll(collection);
            if (removeAll) {
                C6986d.m18630a(C6986d.this, this.f15449c.size() - size);
                mo53394b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f15449c.retainAll(collection);
            if (retainAll) {
                C6986d.m18630a(C6986d.this, this.f15449c.size() - size);
                mo53394b();
            }
            return retainAll;
        }

        public int size() {
            mo53391a();
            return this.f15449c.size();
        }

        public String toString() {
            mo53391a();
            return this.f15449c.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$j */
    class C7002j extends C6986d<K, V>.i implements List<V> {

        /* renamed from: com.applovin.exoplayer2.common.a.d$j$a */
        private class C7003a extends C6986d<K, V>.a implements ListIterator<V> {
            C7003a() {
                super();
            }

            public C7003a(int i) {
                super(C7002j.this.mo53417g().listIterator(i));
            }

            /* renamed from: c */
            private ListIterator<V> m18698c() {
                return (ListIterator) b();
            }

            public void add(V v) {
                boolean isEmpty = C7002j.this.isEmpty();
                m18698c().add(v);
                C6986d.m18636c(C6986d.this);
                if (isEmpty) {
                    C7002j.this.mo53399d();
                }
            }

            public boolean hasPrevious() {
                return m18698c().hasPrevious();
            }

            public int nextIndex() {
                return m18698c().nextIndex();
            }

            public V previous() {
                return m18698c().previous();
            }

            public int previousIndex() {
                return m18698c().previousIndex();
            }

            public void set(V v) {
                m18698c().set(v);
            }
        }

        C7002j(@NullableDecl K k, List<V> list, @NullableDecl C6986d<K, V>.i iVar) {
            super(k, list, iVar);
        }

        public void add(int i, V v) {
            mo53391a();
            boolean isEmpty = mo53400e().isEmpty();
            mo53417g().add(i, v);
            C6986d.m18636c(C6986d.this);
            if (isEmpty) {
                mo53399d();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = mo53417g().addAll(i, collection);
            if (addAll) {
                C6986d.m18630a(C6986d.this, mo53400e().size() - size);
                if (size == 0) {
                    mo53399d();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public List<V> mo53417g() {
            return (List) mo53400e();
        }

        public V get(int i) {
            mo53391a();
            return mo53417g().get(i);
        }

        public int indexOf(Object obj) {
            mo53391a();
            return mo53417g().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo53391a();
            return mo53417g().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo53391a();
            return new C7003a();
        }

        public ListIterator<V> listIterator(int i) {
            mo53391a();
            return new C7003a(i);
        }

        public V remove(int i) {
            mo53391a();
            V remove = mo53417g().remove(i);
            C6986d.m18633b(C6986d.this);
            mo53394b();
            return remove;
        }

        public V set(int i, V v) {
            mo53391a();
            return mo53417g().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo53391a();
            return C6986d.this.mo53299a(mo53395c(), mo53417g().subList(i, i2), mo53402f() == null ? this : mo53402f());
        }
    }

    protected C6986d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f15423a = map;
    }

    /* renamed from: a */
    static /* synthetic */ int m18630a(C6986d dVar, int i) {
        int i2 = dVar.f15424b + i;
        dVar.f15424b = i2;
        return i2;
    }

    /* renamed from: b */
    static /* synthetic */ int m18633b(C6986d dVar) {
        int i = dVar.f15424b;
        dVar.f15424b = i - 1;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ int m18634b(C6986d dVar, int i) {
        int i2 = dVar.f15424b - i;
        dVar.f15424b = i2;
        return i2;
    }

    /* renamed from: c */
    static /* synthetic */ int m18636c(C6986d dVar) {
        int i = dVar.f15424b;
        dVar.f15424b = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <E> Iterator<E> m18637c(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m18638e(Object obj) {
        Collection collection = (Collection) C6931ab.m18496c(this.f15423a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f15424b -= size;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<V> mo53295a(@NullableDecl K k, Collection<V> collection) {
        return new C7000i(k, collection, (C6986d<K, V>.i) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <E> Collection<E> mo53296a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<V> mo53299a(@NullableDecl K k, List<V> list, @NullableDecl C6986d<K, V>.i iVar) {
        return list instanceof RandomAccess ? new C6997f(k, list, iVar) : new C7002j(k, list, iVar);
    }

    /* renamed from: a */
    public boolean mo53201a(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f15423a.get(k);
        if (collection == null) {
            Collection c = mo53300c(k);
            if (c.add(v)) {
                this.f15424b++;
                this.f15423a.put(k, c);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f15424b++;
            return true;
        }
    }

    /* renamed from: b */
    public Collection<V> mo53202b(@NullableDecl K k) {
        Collection collection = this.f15423a.get(k);
        if (collection == null) {
            collection = mo53300c(k);
        }
        return mo53295a(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Collection<V> mo53215c();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Collection<V> mo53300c(@NullableDecl K k) {
        return mo53215c();
    }

    /* renamed from: d */
    public int mo53206d() {
        return this.f15424b;
    }

    /* renamed from: e */
    public void mo53207e() {
        for (Collection<V> clear : this.f15423a.values()) {
            clear.clear();
        }
        this.f15423a.clear();
        this.f15424b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Set<K> mo53216f() {
        return new C6993c(this.f15423a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Set<K> mo53301g() {
        Map<K, Collection<V>> map = this.f15423a;
        return map instanceof NavigableMap ? new C6996e((NavigableMap) this.f15423a) : map instanceof SortedMap ? new C6999h((SortedMap) this.f15423a) : new C6993c(this.f15423a);
    }

    /* renamed from: h */
    public Collection<V> mo53208h() {
        return super.mo53208h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Collection<V> mo53302i() {
        return new C7005f.C7008c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Iterator<V> mo53303j() {
        return new C6986d<K, V>.b<V>() {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public V mo53308a(K k, V v) {
                return v;
            }
        };
    }

    /* renamed from: k */
    public Collection<Map.Entry<K, V>> mo53304k() {
        return super.mo53304k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Collection<Map.Entry<K, V>> mo53305l() {
        return this instanceof C6966ap ? new C7005f.C7007b() : new C7005f.C7006a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo53306m() {
        return new C6986d<K, V>.b<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> mo53308a(K k, V v) {
                return C6931ab.m18492a(k, v);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Map<K, Collection<V>> mo53217n() {
        return new C6989a(this.f15423a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Map<K, Collection<V>> mo53307o() {
        Map<K, Collection<V>> map = this.f15423a;
        return map instanceof NavigableMap ? new C6995d((NavigableMap) this.f15423a) : map instanceof SortedMap ? new C6998g((SortedMap) this.f15423a) : new C6989a(this.f15423a);
    }
}
