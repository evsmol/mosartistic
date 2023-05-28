package com.adcolony.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class AdColonyAdSize {
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(320, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(C5643c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, 600);

    /* renamed from: a */
    int f13151a;

    /* renamed from: b */
    int f13152b;

    public AdColonyAdSize(int i, int i2) {
        this.f13151a = i;
        this.f13152b = i2;
    }

    public int getHeight() {
        return this.f13152b;
    }

    public int getWidth() {
        return this.f13151a;
    }
}
