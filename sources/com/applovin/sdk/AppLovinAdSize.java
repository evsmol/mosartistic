package com.applovin.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class AppLovinAdSize {
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(C5643c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MREC");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");
    public static final int SPAN = -1;

    /* renamed from: a */
    private final String f21922a;

    /* renamed from: b */
    private final int f21923b;

    /* renamed from: c */
    private final int f21924c;

    private AppLovinAdSize(int i, int i2, String str) {
        this.f21923b = i;
        this.f21924c = i2;
        this.f21922a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f21924c;
    }

    public String getLabel() {
        return this.f21922a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f21923b;
    }

    public String toString() {
        return getLabel();
    }
}
