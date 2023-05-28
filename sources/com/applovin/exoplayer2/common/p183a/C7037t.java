package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.p183a.C7039u;
import com.applovin.exoplayer2.common.p183a.C7041v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.t */
public class C7037t<K, V> extends C7041v<K, V> implements C7053z<K, V> {

    /* renamed from: com.applovin.exoplayer2.common.a.t$a */
    public static final class C7038a<K, V> extends C7041v.C7044a<K, V> {
        /* renamed from: a */
        public C7038a<K, V> mo53540b(K k, Iterable<? extends V> iterable) {
            super.mo53540b(k, iterable);
            return this;
        }

        /* renamed from: a */
        public C7038a<K, V> mo53541b(K k, V... vArr) {
            super.mo53541b(k, vArr);
            return this;
        }

        /* renamed from: a */
        public C7037t<K, V> mo53542b() {
            return (C7037t) super.mo53542b();
        }
    }

    C7037t(C7039u<K, C7033s<V>> uVar, int i) {
        super(uVar, i);
    }

    /* renamed from: a */
    public static <K, V> C7037t<K, V> m18821a() {
        return C7027o.f15496a;
    }

    /* renamed from: a */
    static <K, V> C7037t<K, V> m18822a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return m18821a();
        }
        C7039u.C7040a aVar = new C7039u.C7040a(collection.size());
        int i = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            C7033s<E> a = comparator == null ? C7033s.m18797a(collection2) : C7033s.m18798a(comparator, collection2);
            if (!a.isEmpty()) {
                aVar.mo53561a(key, a);
                i += a.size();
            }
        }
        return new C7037t<>(aVar.mo53563a(), i);
    }

    /* renamed from: c */
    public static <K, V> C7038a<K, V> m18823c() {
        return new C7038a<>();
    }

    /* renamed from: c */
    public C7033s<V> mo53536e(@NullableDecl K k) {
        C7033s<V> sVar = (C7033s) this.f15516b.get(k);
        return sVar == null ? C7033s.m18803g() : sVar;
    }
}
