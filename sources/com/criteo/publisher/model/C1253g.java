package com.criteo.publisher.model;

import com.criteo.publisher.C1080f;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.p067i0.C1147a;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p074n0.C1288a;
import com.criteo.publisher.p074n0.C1307k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.criteo.publisher.model.g */
/* compiled from: AdUnitMapper */
public class C1253g {

    /* renamed from: d */
    private static final AdSize f3908d = new AdSize(2, 2);

    /* renamed from: e */
    private static final Collection<C1147a> f3909e = Arrays.asList(new C1147a[]{C1147a.GAM_APP_BIDDING, C1147a.MOPUB_APP_BIDDING});

    /* renamed from: a */
    private final C1195g f3910a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1307k f3911b;

    /* renamed from: c */
    private final C1150c f3912c;

    public C1253g(C1307k kVar, C1150c cVar) {
        this.f3911b = kVar;
        this.f3912c = cVar;
    }

    /* renamed from: a */
    public List<List<C1267n>> mo3532a(List<AdUnit> list) {
        HashSet hashSet = new HashSet();
        for (AdUnit next : list) {
            if (next != null) {
                hashSet.add(new C1267n(m5589a(next), next.getAdUnitId(), next.getAdUnitType()));
            }
        }
        return m5591a(m5590a((Collection<C1267n>) hashSet), 8);
    }

    /* renamed from: com.criteo.publisher.model.g$a */
    /* compiled from: AdUnitMapper */
    static /* synthetic */ class C1254a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3913a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.criteo.publisher.n0.a[] r0 = com.criteo.publisher.p074n0.C1288a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3913a = r0
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3913a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.criteo.publisher.n0.a r1 = com.criteo.publisher.p074n0.C1288a.CRITEO_CUSTOM_NATIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.C1253g.C1254a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private AdSize m5589a(AdUnit adUnit) {
        int i = C1254a.f3913a[adUnit.getAdUnitType().ordinal()];
        if (i == 1) {
            return ((BannerAdUnit) adUnit).getSize();
        }
        if (i == 2 || i == 3) {
            return this.f3911b.mo3656a();
        }
        if (i == 4) {
            return f3908d;
        }
        throw new IllegalArgumentException("Found an invalid AdUnit");
    }

    /* renamed from: b */
    public C1267n mo3533b(AdUnit adUnit) {
        List<List<C1267n>> a = mo3532a((List<AdUnit>) Collections.singletonList(adUnit));
        if (a.isEmpty() || a.get(0).isEmpty()) {
            return null;
        }
        return (C1267n) a.get(0).get(0);
    }

    /* renamed from: a */
    private List<C1267n> m5590a(Collection<C1267n> collection) {
        ArrayList arrayList = new ArrayList();
        C1147a c = this.f3912c.mo3248c();
        for (C1267n next : collection) {
            if (next.mo3553b().isEmpty() || next.mo3554c().getWidth() <= 0 || next.mo3554c().getHeight() <= 0) {
                this.f3910a.mo3337a(C1080f.m5023a(next));
            } else if (next.mo3552a() != C1288a.CRITEO_REWARDED || f3909e.contains(c)) {
                arrayList.add(next);
            } else {
                this.f3910a.mo3337a(C1080f.m5024a(next, c));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static <T> List<List<T>> m5591a(List<T> list, int i) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = i2 + i;
            arrayList.add(list.subList(i2, Math.min(i3, list.size())));
            i2 = i3;
        }
        return arrayList;
    }
}
