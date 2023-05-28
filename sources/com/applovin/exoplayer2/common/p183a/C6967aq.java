package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.aq */
public final class C6967aq {

    /* renamed from: com.applovin.exoplayer2.common.a.aq$1 */
    class C69681 extends C6973b<E> {

        /* renamed from: a */
        final /* synthetic */ Set f15403a;

        /* renamed from: b */
        final /* synthetic */ Set f15404b;

        /* renamed from: a */
        public C6980ax<E> iterator() {
            return new C6982b<E>() {

                /* renamed from: a */
                final Iterator<? extends E> f15405a = C69681.this.f15403a.iterator();

                /* renamed from: b */
                final Iterator<? extends E> f15406b = C69681.this.f15404b.iterator();

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo53270a() {
                    if (this.f15405a.hasNext()) {
                        return this.f15405a.next();
                    }
                    while (this.f15406b.hasNext()) {
                        E next = this.f15406b.next();
                        if (!C69681.this.f15403a.contains(next)) {
                            return next;
                        }
                    }
                    return mo53292b();
                }
            };
        }

        public boolean contains(Object obj) {
            return this.f15403a.contains(obj) || this.f15404b.contains(obj);
        }

        public boolean isEmpty() {
            return this.f15403a.isEmpty() && this.f15404b.isEmpty();
        }

        public int size() {
            int size = this.f15403a.size();
            for (Object contains : this.f15404b) {
                if (!this.f15403a.contains(contains)) {
                    size++;
                }
            }
            return size;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.aq$a */
    static abstract class C6972a<E> extends AbstractSet<E> {
        C6972a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return C6967aq.m18597a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.aq$b */
    public static abstract class C6973b<E> extends AbstractSet<E> {
        private C6973b() {
        }

        /* synthetic */ C6973b(C69681 r1) {
            this();
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

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

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
    }

    /* renamed from: a */
    static int m18592a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* renamed from: a */
    public static <E> C6973b<E> m18593a(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new C6973b<E>() {
            /* renamed from: a */
            public C6980ax<E> iterator() {
                return new C6982b<E>() {

                    /* renamed from: a */
                    final Iterator<E> f15410a = set.iterator();

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public E mo53270a() {
                        while (this.f15410a.hasNext()) {
                            E next = this.f15410a.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return mo53292b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            public int size() {
                int i = 0;
                for (Object contains : set) {
                    if (set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    /* renamed from: a */
    public static <E> HashSet<E> m18594a() {
        return new HashSet<>();
    }

    /* renamed from: a */
    public static <E> HashSet<E> m18595a(int i) {
        return new HashSet<>(C6931ab.m18487a(i));
    }

    /* renamed from: a */
    static boolean m18596a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m18597a(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof C6952af) {
            collection = ((C6952af) collection).mo53223a();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m18598a(set, collection.iterator()) : C7049y.m18912a(set.iterator(), collection);
    }

    /* renamed from: a */
    static boolean m18598a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static <E> Set<E> m18599b() {
        return Collections.newSetFromMap(C6931ab.m18497c());
    }
}
