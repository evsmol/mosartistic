package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

public class MaxRewardImpl implements MaxReward {

    /* renamed from: a */
    private final String f19550a;

    /* renamed from: b */
    private final int f19551b;

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.f19550a = str;
            this.f19551b = i;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public final int getAmount() {
        return this.f19551b;
    }

    public final String getLabel() {
        return this.f19550a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f19551b + ", label=" + this.f19550a + "}";
    }
}
