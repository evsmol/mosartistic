package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.m */
public class C8613m<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a */
    private final ArrayList<T> f21747a = new ArrayList<>();

    /* renamed from: b */
    private final HashSet<T> f21748b = new HashSet<>();

    /* renamed from: a */
    public T mo57753a() {
        return (Comparable) this.f21747a.get(size() - 1);
    }

    /* renamed from: a */
    public T mo57754a(int i) {
        return (Comparable) this.f21747a.get(i);
    }

    /* renamed from: a */
    public void mo57755a(int i, T t) {
        this.f21748b.remove((Comparable) this.f21747a.get(i));
        this.f21747a.set(i, t);
        this.f21748b.add(t);
    }

    /* renamed from: a */
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }
        if (isEmpty() || t.compareTo(mo57753a()) > 0) {
            this.f21747a.add(t);
        } else {
            this.f21747a.add(mo57761c(t), t);
        }
        return this.f21748b.add(t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo57759b(T t) {
        if (t == null || !contains(t)) {
            return -1;
        }
        return mo57761c(t);
    }

    /* renamed from: b */
    public T mo57760b(int i) {
        T t = (Comparable) this.f21747a.remove(i);
        this.f21748b.remove(t);
        return t;
    }

    /* renamed from: c */
    public int mo57761c(T t) {
        int binarySearch = Collections.binarySearch(this.f21747a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo57754a(binarySearch);
        while (binarySearch >= 0 && a == mo57754a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public void clear() {
        this.f21747a.clear();
        this.f21748b.clear();
    }

    public boolean contains(Object obj) {
        return this.f21748b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f21748b.containsAll(collection);
    }

    /* renamed from: d */
    public int mo57765d(T t) {
        int binarySearch = Collections.binarySearch(this.f21747a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo57754a(binarySearch);
        while (binarySearch < size() && a == mo57754a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public boolean isEmpty() {
        return this.f21747a.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f21747a.iterator();
    }

    public boolean remove(Object obj) {
        int b = mo57759b((Comparable) obj);
        if (b == -1) {
            return false;
        }
        this.f21747a.remove(b);
        return this.f21748b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it.next();
                if (z || remove(next)) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f21747a.get(size);
            if (!collection.contains(comparable)) {
                this.f21747a.remove(size);
                this.f21748b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f21747a.size();
    }

    public Object[] toArray() {
        return this.f21747a.toArray();
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f21747a.toArray(t1Arr);
    }
}
