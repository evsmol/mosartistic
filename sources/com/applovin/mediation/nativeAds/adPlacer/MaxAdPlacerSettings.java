package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.C8626v;
import java.util.Set;
import java.util.TreeSet;

public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a */
    private final String f21904a;

    /* renamed from: b */
    private final Set<Integer> f21905b = new TreeSet();

    /* renamed from: c */
    private int f21906c = 0;

    /* renamed from: d */
    private int f21907d = 256;

    /* renamed from: e */
    private int f21908e = 4;

    public MaxAdPlacerSettings(String str) {
        this.f21904a = str;
    }

    public void addFixedPosition(int i) {
        this.f21905b.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f21904a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f21905b;
    }

    public int getMaxAdCount() {
        return this.f21907d;
    }

    public int getMaxPreloadedAdCount() {
        return this.f21908e;
    }

    public int getRepeatingInterval() {
        return this.f21906c;
    }

    public boolean hasValidPositioning() {
        return !this.f21905b.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f21906c >= 2;
    }

    public void resetFixedPositions() {
        this.f21905b.clear();
    }

    public void setMaxAdCount(int i) {
        this.f21907d = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f21908e = i;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f21906c = i;
            C8626v.m26255f("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f21906c = 0;
        C8626v.m26257h("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of " + 2);
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f21904a + '\'' + ", fixedPositions=" + this.f21905b + ", repeatingInterval=" + this.f21906c + ", maxAdCount=" + this.f21907d + ", maxPreloadedAdCount=" + this.f21908e + '}';
    }
}
