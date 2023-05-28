package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class ISBannerSize {
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", C5643c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    /* renamed from: a */
    protected static final ISBannerSize f10706a = new ISBannerSize("LEADERBOARD", 728, 90);

    /* renamed from: b */
    private int f10707b;

    /* renamed from: c */
    private int f10708c;

    /* renamed from: d */
    private String f10709d;

    /* renamed from: e */
    private boolean f10710e;

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f10709d = str;
        this.f10707b = i;
        this.f10708c = i2;
    }

    public String getDescription() {
        return this.f10709d;
    }

    public int getHeight() {
        return this.f10708c;
    }

    public int getWidth() {
        return this.f10707b;
    }

    public boolean isAdaptive() {
        return this.f10710e;
    }

    public boolean isSmart() {
        return this.f10709d.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.f10710e = z;
    }
}
