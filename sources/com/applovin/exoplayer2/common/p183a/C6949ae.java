package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.applovin.exoplayer2.common.a.ae */
public final class C6949ae {

    /* renamed from: com.applovin.exoplayer2.common.a.ae$a */
    private static class C6950a<K, V> extends C6985c<K, V> {

        /* renamed from: a */
        transient Supplier<? extends List<V>> f15376a;

        C6950a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.f15376a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<V> mo53215c() {
            return (List) this.f15376a.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Set<K> mo53216f() {
            return mo53301g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public Map<K, Collection<V>> mo53217n() {
            return mo53307o();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ae$b */
    static abstract class C6951b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        C6951b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C6941ac<K, V> mo53218a();

        public void clear() {
            mo53218a().mo53207e();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo53218a().mo53204b(entry.getKey(), entry.getValue());
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo53218a().mo53205c(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo53218a().mo53206d();
        }
    }

    /* renamed from: a */
    public static <K, V> C7053z<K, V> m18529a(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new C6950a(map, supplier);
    }

    /* renamed from: a */
    static boolean m18530a(C6941ac<?, ?> acVar, @NullableDecl Object obj) {
        if (obj == acVar) {
            return true;
        }
        if (obj instanceof C6941ac) {
            return acVar.mo53203b().equals(((C6941ac) obj).mo53203b());
        }
        return false;
    }
}
