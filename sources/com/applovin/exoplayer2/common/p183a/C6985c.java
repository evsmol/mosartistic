package com.applovin.exoplayer2.common.p183a;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.c */
abstract class C6985c<K, V> extends C6986d<K, V> implements C7053z<K, V> {
    protected C6985c(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Collection<V> mo53295a(K k, Collection<V> collection) {
        return mo53299a(k, (List) collection, (C6986d<K, V>.i) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <E> Collection<E> mo53296a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<V> mo53215c();

    /* renamed from: a */
    public List<V> mo53202b(@NullableDecl K k) {
        return (List) super.mo53202b(k);
    }

    /* renamed from: a */
    public boolean mo53201a(@NullableDecl K k, @NullableDecl V v) {
        return super.mo53201a(k, v);
    }

    /* renamed from: b */
    public Map<K, Collection<V>> mo53203b() {
        return super.mo53203b();
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
