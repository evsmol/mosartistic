package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a */
    private int f11567a;

    /* renamed from: b */
    private String f11568b;

    /* renamed from: c */
    private boolean f11569c;

    /* renamed from: d */
    private C4656k f11570d;

    public InterstitialPlacement(int i, String str, boolean z, C4656k kVar) {
        this.f11567a = i;
        this.f11568b = str;
        this.f11569c = z;
        this.f11570d = kVar;
    }

    public C4656k getPlacementAvailabilitySettings() {
        return this.f11570d;
    }

    public int getPlacementId() {
        return this.f11567a;
    }

    public String getPlacementName() {
        return this.f11568b;
    }

    public boolean isDefault() {
        return this.f11569c;
    }

    public String toString() {
        return "placement name: " + this.f11568b;
    }
}
