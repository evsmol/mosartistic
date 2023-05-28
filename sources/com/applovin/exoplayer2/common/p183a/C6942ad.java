package com.applovin.exoplayer2.common.p183a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.applovin.exoplayer2.common.a.ad */
public abstract class C6942ad<K0, V0> {

    /* renamed from: com.applovin.exoplayer2.common.a.ad$1 */
    class C69431 extends C6947c<Object> {

        /* renamed from: a */
        final /* synthetic */ int f15371a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <K, V> Map<K, Collection<V>> mo53209a() {
            return C6956aj.m18550a(this.f15371a);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ad$a */
    private static final class C6945a<V> implements Supplier<List<V>>, Serializable {

        /* renamed from: a */
        private final int f15373a;

        C6945a(int i) {
            this.f15373a = C7012j.m18715a(i, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f15373a);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ad$b */
    public static abstract class C6946b<K0, V0> extends C6942ad<K0, V0> {
        C6946b() {
            super((C69431) null);
        }

        /* renamed from: b */
        public abstract <K extends K0, V extends V0> C7053z<K, V> mo53211b();
    }

    /* renamed from: com.applovin.exoplayer2.common.a.ad$c */
    public static abstract class C6947c<K0> {
        C6947c() {
        }

        /* renamed from: a */
        public C6946b<K0, Object> mo53212a(final int i) {
            C7012j.m18715a(i, "expectedValuesPerKey");
            return new C6946b<K0, Object>() {
                /* renamed from: b */
                public <K extends K0, V> C7053z<K, V> mo53211b() {
                    return C6949ae.m18529a(C6947c.this.mo53209a(), new C6945a(i));
                }
            };
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo53209a();

        /* renamed from: b */
        public C6946b<K0, Object> mo53213b() {
            return mo53212a(2);
        }
    }

    private C6942ad() {
    }

    /* synthetic */ C6942ad(C69431 r1) {
        this();
    }

    /* renamed from: a */
    public static C6947c<Comparable> m18519a() {
        return m18520a(C6955ai.m18544b());
    }

    /* renamed from: a */
    public static <K0> C6947c<K0> m18520a(final Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new C6947c<K0>() {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public <K extends K0, V> Map<K, Collection<V>> mo53209a() {
                return new TreeMap(comparator);
            }
        };
    }
}
