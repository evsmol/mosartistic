package com.yandex.metrica.impl.p082ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Zl */
public class C2780Zl<K, V> {

    /* renamed from: a */
    private final Map<K, V> f7288a;

    /* renamed from: b */
    private final V f7289b;

    public C2780Zl(V v) {
        this(new HashMap(), v);
    }

    /* renamed from: a */
    public void mo17128a(K k, V v) {
        this.f7288a.put(k, v);
    }

    public C2780Zl(Map<K, V> map, V v) {
        this.f7288a = map;
        this.f7289b = v;
    }

    /* renamed from: a */
    public V mo17126a(K k) {
        V v = this.f7288a.get(k);
        return v == null ? this.f7289b : v;
    }

    /* renamed from: a */
    public Set<K> mo17127a() {
        return this.f7288a.keySet();
    }
}
