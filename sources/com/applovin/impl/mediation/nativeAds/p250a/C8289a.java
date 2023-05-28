package com.applovin.impl.mediation.nativeAds.p250a;

import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.C8613m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.mediation.nativeAds.a.a */
public class C8289a {

    /* renamed from: a */
    private final C8613m<Integer> f20372a = new C8613m<>();

    /* renamed from: b */
    private final TreeSet<Integer> f20373b = new TreeSet<>();

    /* renamed from: c */
    private final Map<Integer, MaxAd> f20374c = CollectionUtils.map();

    /* renamed from: d */
    private int f20375d;

    /* renamed from: e */
    private int f20376e;

    public C8289a(MaxAdPlacerSettings maxAdPlacerSettings) {
        m24847a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    private int m24846a(int i, boolean z) {
        int d = this.f20372a.mo57765d(Integer.valueOf(i));
        if (!z) {
            int i2 = i + d;
            while (d < this.f20372a.size() && i2 >= this.f20372a.mo57754a(d).intValue()) {
                i2++;
                d++;
            }
        }
        return d;
    }

    /* renamed from: a */
    private void m24847a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C8626v.m26258i("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f20372a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (maxAdPlacerSettings.isRepeatingEnabled()) {
            int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
            if (this.f20372a.isEmpty()) {
                this.f20372a.add(Integer.valueOf(repeatingInterval - 1));
            }
            int intValue = this.f20372a.mo57753a().intValue();
            while (true) {
                intValue += repeatingInterval;
                if (this.f20372a.size() < maxAdPlacerSettings.getMaxAdCount()) {
                    this.f20372a.add(Integer.valueOf(intValue));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m24848c(int i, int i2) {
        if (this.f20374c.containsKey(Integer.valueOf(i))) {
            this.f20374c.put(Integer.valueOf(i2), this.f20374c.get(Integer.valueOf(i)));
            this.f20373b.add(Integer.valueOf(i2));
            this.f20374c.remove(Integer.valueOf(i));
            this.f20373b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public int mo56681a() {
        int i = this.f20375d;
        if (!(i == -1 || this.f20376e == -1)) {
            while (i <= this.f20376e) {
                if (mo56685a(i) && !mo56688b(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo56682a(int i, int i2) {
        this.f20375d = i;
        this.f20376e = i2;
    }

    /* renamed from: a */
    public void mo56683a(MaxAd maxAd, int i) {
        this.f20374c.put(Integer.valueOf(i), maxAd);
        this.f20373b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo56684a(Collection<Integer> collection) {
        for (Integer next : collection) {
            this.f20374c.remove(next);
            this.f20373b.remove(next);
        }
    }

    /* renamed from: a */
    public boolean mo56685a(int i) {
        return this.f20372a.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public Collection<Integer> mo56686b() {
        return new TreeSet(this.f20373b);
    }

    /* renamed from: b */
    public void mo56687b(int i, int i2) {
        mo56696i(i);
        mo56695h(i2);
    }

    /* renamed from: b */
    public boolean mo56688b(int i) {
        return this.f20373b.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public MaxAd mo56689c(int i) {
        return this.f20374c.get(Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo56690c() {
        this.f20374c.clear();
        this.f20373b.clear();
    }

    /* renamed from: d */
    public Collection<Integer> mo56691d(int i) {
        return new TreeSet(this.f20373b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: e */
    public int mo56692e(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m24846a(i - 1, false);
    }

    /* renamed from: f */
    public int mo56693f(int i) {
        return i + m24846a(i, false);
    }

    /* renamed from: g */
    public int mo56694g(int i) {
        if (mo56685a(i)) {
            return -1;
        }
        return i - m24846a(i, true);
    }

    /* renamed from: h */
    public void mo56695h(int i) {
        int c = this.f20372a.mo57761c(Integer.valueOf(i));
        for (int size = this.f20372a.size() - 1; size >= c; size--) {
            Integer a = this.f20372a.mo57754a(size);
            int intValue = a.intValue() + 1;
            m24848c(a.intValue(), intValue);
            this.f20372a.mo57755a(size, Integer.valueOf(intValue));
        }
    }

    /* renamed from: i */
    public void mo56696i(int i) {
        int c = this.f20372a.mo57761c(Integer.valueOf(i));
        if (mo56685a(i)) {
            this.f20374c.remove(Integer.valueOf(i));
            this.f20373b.remove(Integer.valueOf(i));
            this.f20372a.mo57760b(c);
        }
        while (c < this.f20372a.size()) {
            Integer a = this.f20372a.mo57754a(c);
            int intValue = a.intValue() - 1;
            m24848c(a.intValue(), intValue);
            this.f20372a.mo57755a(c, Integer.valueOf(intValue));
            c++;
        }
    }
}
