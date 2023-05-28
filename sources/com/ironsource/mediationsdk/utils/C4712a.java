package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.mediationsdk.utils.a */
public final class C4712a {

    /* renamed from: a */
    private boolean f11767a = false;

    /* renamed from: b */
    private boolean f11768b = false;

    /* renamed from: c */
    private boolean f11769c = false;

    /* renamed from: a */
    public final void mo34171a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f11767a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f11768b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f11769c = z;
        }
    }

    /* renamed from: a */
    public final boolean mo34172a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f11767a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f11768b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f11769c;
        }
        return false;
    }
}
