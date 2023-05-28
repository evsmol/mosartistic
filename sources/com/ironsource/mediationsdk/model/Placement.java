package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a */
    private int f11585a;

    /* renamed from: b */
    private String f11586b;

    /* renamed from: c */
    private boolean f11587c;

    /* renamed from: d */
    private String f11588d;

    /* renamed from: e */
    private int f11589e;

    /* renamed from: f */
    private C4656k f11590f;

    public Placement(int i, String str, boolean z, String str2, int i2, C4656k kVar) {
        this.f11585a = i;
        this.f11586b = str;
        this.f11587c = z;
        this.f11588d = str2;
        this.f11589e = i2;
        this.f11590f = kVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f11585a = interstitialPlacement.getPlacementId();
        this.f11586b = interstitialPlacement.getPlacementName();
        this.f11587c = interstitialPlacement.isDefault();
        this.f11590f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public C4656k getPlacementAvailabilitySettings() {
        return this.f11590f;
    }

    public int getPlacementId() {
        return this.f11585a;
    }

    public String getPlacementName() {
        return this.f11586b;
    }

    public int getRewardAmount() {
        return this.f11589e;
    }

    public String getRewardName() {
        return this.f11588d;
    }

    public boolean isDefault() {
        return this.f11587c;
    }

    public String toString() {
        return "placement name: " + this.f11586b + ", reward name: " + this.f11588d + " , amount: " + this.f11589e;
    }
}
