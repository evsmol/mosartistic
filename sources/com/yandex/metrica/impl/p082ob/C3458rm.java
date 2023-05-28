package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.rm */
public class C3458rm<K, V> {

    /* renamed from: a */
    private final HashMap<K, Collection<V>> f9077a;

    /* renamed from: b */
    private final boolean f9078b;

    public C3458rm() {
        this(false);
    }

    /* renamed from: a */
    public Collection<V> mo18180a(K k) {
        return this.f9077a.get(k);
    }

    /* renamed from: b */
    public boolean mo18185b() {
        return this.f9077a.isEmpty();
    }

    /* renamed from: c */
    public int mo18186c() {
        int i = 0;
        for (Collection<V> size : this.f9077a.values()) {
            i += size.size();
        }
        return i;
    }

    public String toString() {
        return this.f9077a.toString();
    }

    public C3458rm(boolean z) {
        this.f9077a = new HashMap<>();
        this.f9078b = z;
    }

    /* renamed from: a */
    public Collection<V> mo18181a(K k, V v) {
        ArrayList arrayList;
        Collection collection = this.f9077a.get(k);
        if (collection == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(collection);
        }
        arrayList.add(v);
        return this.f9077a.put(k, arrayList);
    }

    /* renamed from: b */
    public Collection<V> mo18183b(K k) {
        return this.f9077a.remove(k);
    }

    /* renamed from: b */
    public Collection<V> mo18184b(K k, V v) {
        Collection collection = this.f9077a.get(k);
        if (collection == null || !collection.remove(v)) {
            return null;
        }
        if (collection.isEmpty() && this.f9078b) {
            this.f9077a.remove(k);
        }
        return new ArrayList(collection);
    }

    /* renamed from: a */
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> mo18182a() {
        return this.f9077a.entrySet();
    }
}
