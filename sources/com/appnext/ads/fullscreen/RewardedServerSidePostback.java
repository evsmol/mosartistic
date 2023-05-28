package com.appnext.ads.fullscreen;

import java.io.Serializable;
import java.util.HashMap;

public class RewardedServerSidePostback implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: bo */
    private String f22063bo = "";

    /* renamed from: bp */
    private String f22064bp = "";

    /* renamed from: bq */
    private String f22065bq = "";

    /* renamed from: br */
    private String f22066br = "";

    /* renamed from: bs */
    private String f22067bs = "";

    public RewardedServerSidePostback() {
    }

    public RewardedServerSidePostback(String str, String str2, String str3, String str4, String str5) {
        this.f22063bo = str;
        this.f22064bp = str2;
        this.f22065bq = str3;
        this.f22066br = str4;
        this.f22067bs = str5;
    }

    public String getRewardsTransactionId() {
        return this.f22063bo;
    }

    public void setRewardsTransactionId(String str) {
        this.f22063bo = str;
    }

    public String getRewardsUserId() {
        return this.f22064bp;
    }

    public void setRewardsUserId(String str) {
        this.f22064bp = str;
    }

    public String getRewardsRewardTypeCurrency() {
        return this.f22065bq;
    }

    public void setRewardsRewardTypeCurrency(String str) {
        this.f22065bq = str;
    }

    public String getRewardsAmountRewarded() {
        return this.f22066br;
    }

    public void setRewardsAmountRewarded(String str) {
        this.f22066br = str;
    }

    public String getRewardsCustomParameter() {
        return this.f22067bs;
    }

    public void setRewardsCustomParameter(String str) {
        this.f22067bs = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final HashMap<String, String> mo58292p() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("rewardsTransactionId", this.f22063bo);
        hashMap.put("rewardsUserId", this.f22064bp);
        hashMap.put("rewardsRewardTypeCurrency", this.f22065bq);
        hashMap.put("rewardsAmountRewarded", this.f22066br);
        hashMap.put("rewardsCustomParameter", this.f22067bs);
        return hashMap;
    }
}
