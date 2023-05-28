package com.adcolony.sdk;

public class AdColonyReward {

    /* renamed from: a */
    private int f13222a;

    /* renamed from: b */
    private String f13223b;

    /* renamed from: c */
    private String f13224c;

    /* renamed from: d */
    private boolean f13225d;

    AdColonyReward(C6312h0 h0Var) {
        C6294f1 a = h0Var.mo50732a();
        this.f13222a = C6235c0.m15083d(a, "reward_amount");
        this.f13223b = C6235c0.m15087h(a, "reward_name");
        this.f13225d = C6235c0.m15076b(a, "success");
        this.f13224c = C6235c0.m15087h(a, "zone_id");
    }

    public int getRewardAmount() {
        return this.f13222a;
    }

    public String getRewardName() {
        return this.f13223b;
    }

    public String getZoneID() {
        return this.f13224c;
    }

    public boolean success() {
        return this.f13225d;
    }
}
