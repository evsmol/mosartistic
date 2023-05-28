package com.ironsource.mediationsdk;

import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.p */
public final class C4665p {

    /* renamed from: c */
    private static final C4665p f11678c = new C4665p();

    /* renamed from: a */
    InterstitialListener f11679a = null;

    /* renamed from: b */
    RewardedVideoManualListener f11680b = null;

    /* renamed from: d */
    private Map<String, Long> f11681d = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, Boolean> f11682e = new HashMap();

    /* renamed from: f */
    private int f11683f;

    /* renamed from: g */
    private int f11684g;

    private C4665p() {
    }

    /* renamed from: a */
    public static synchronized C4665p m13650a() {
        C4665p pVar;
        synchronized (C4665p.class) {
            pVar = f11678c;
        }
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13653b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f11681d.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            if (this.f11679a != null) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onInterstitialAdLoadFailed - error = " + ironSourceError.toString());
                this.f11679a.onInterstitialAdLoadFailed(ironSourceError);
                return;
            }
            IronLog.INTERNAL.error("mInterstitialListener is null");
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("ad unit not supported - " + ad_unit);
        } else if (this.f11680b != null) {
            IronLog ironLog3 = IronLog.CALLBACK;
            ironLog3.info("onRewardedVideoAdLoadFailed - error = " + ironSourceError.toString());
            this.f11680b.onRewardedVideoAdLoadFailed(ironSourceError);
        } else {
            IronLog.INTERNAL.warning("mRewardedVideoListener is null");
        }
    }

    /* renamed from: a */
    public final void mo34054a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f11683f = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f11684g = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final synchronized void mo34055a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (!mo34056a(ad_unit)) {
            final String ad_unit2 = ad_unit.toString();
            if (!this.f11681d.containsKey(ad_unit2)) {
                m13653b(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.f11683f;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.f11684g;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.f11681d.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                m13653b(ad_unit, ironSourceError);
                return;
            }
            this.f11682e.put(ad_unit2, Boolean.TRUE);
            long j2 = j - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j2);
            C4401c cVar = C4401c.f10496a;
            C4401c.m12515a(new Runnable() {
                public final void run() {
                    C4665p.this.m13653b(ad_unit, ironSourceError);
                    C4665p.this.f11682e.put(ad_unit2, Boolean.FALSE);
                }
            }, j2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo34056a(IronSource.AD_UNIT ad_unit) {
        if (!this.f11682e.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f11682e.get(ad_unit.toString()).booleanValue();
    }
}
