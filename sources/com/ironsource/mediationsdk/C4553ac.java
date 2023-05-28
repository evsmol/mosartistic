package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.sdk.C4704l;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ac */
public final class C4553ac extends C4605b implements RewardedVideoSmashListener {

    /* renamed from: r */
    JSONObject f11169r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C4704l f11170s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public AtomicBoolean f11171t;
    /* access modifiers changed from: package-private */

    /* renamed from: u */
    public long f11172u;

    /* renamed from: v */
    String f11173v;

    /* renamed from: w */
    public int f11174w;

    /* renamed from: x */
    private int f11175x;

    /* renamed from: y */
    private final String f11176y = IronSourceConstants.REQUEST_URL;

    C4553ac(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f11169r = rewardedVideoSettings;
        this.f11367k = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f11368l = this.f11169r.optInt("maxAdsPerSession", 99);
        this.f11369m = this.f11169r.optInt("maxAdsPerDay", 99);
        this.f11173v = this.f11169r.optString(IronSourceConstants.REQUEST_URL);
        this.f11171t = new AtomicBoolean(false);
        this.f11175x = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13253a(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C4605b) this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f11373q.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, providerAdditionalData));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo33321g() {
        this.f11364h = 0;
        mo33859a(mo33710o() ? C4605b.C4606a.AVAILABLE : C4605b.C4606a.NOT_AVAILABLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo33322h() {
        try {
            mo33865e();
            this.f11365i = new Timer();
            this.f11365i.schedule(new TimerTask() {
                public final void run() {
                    synchronized (C4553ac.this) {
                        cancel();
                        if (C4553ac.this.f11170s != null) {
                            String str = "Timeout for " + C4553ac.this.f11360d;
                            C4553ac.this.f11373q.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                            C4553ac.this.mo33859a(C4605b.C4606a.NOT_AVAILABLE);
                            long time = new Date().getTime() - C4553ac.this.f11172u;
                            if (C4553ac.this.f11171t.compareAndSet(true, false)) {
                                C4553ac.this.m13253a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                                C4553ac.this.m13253a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                            } else {
                                C4553ac.this.m13253a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
                            }
                            C4553ac.this.f11170s.mo33698a(false, C4553ac.this);
                        }
                    }
                }
            }, (long) (this.f11175x * 1000));
        } catch (Exception e) {
            mo33860a("startInitTimer", e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo33323i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo33324k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    /* renamed from: n */
    public final void mo33709n() {
        this.f11372p = null;
        if (this.f11358b != null) {
            if (!(this.f11357a == C4605b.C4606a.CAPPED_PER_DAY || this.f11357a == C4605b.C4606a.CAPPED_PER_SESSION)) {
                this.f11171t.set(true);
                this.f11172u = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f11373q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f11360d + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.f11358b.fetchRewardedVideoForAutomaticLoad(this.f11169r, this);
        }
    }

    /* renamed from: o */
    public final boolean mo33710o() {
        if (this.f11358b == null) {
            return false;
        }
        IronSourceLoggerManager ironSourceLoggerManager = this.f11373q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f11360d + ":isRewardedVideoAvailable()", 1);
        return this.f11358b.isRewardedVideoAvailable(this.f11169r);
    }

    public final void onRewardedVideoAdClicked() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33706f(this);
        }
    }

    public final void onRewardedVideoAdClosed() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33699b(this);
        }
        mo33709n();
    }

    public final void onRewardedVideoAdEnded() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33703d(this);
        }
    }

    public final void onRewardedVideoAdOpened() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33693a(this);
        }
    }

    public final void onRewardedVideoAdRewarded() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33705e(this);
        }
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33694a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33700c(this);
        }
    }

    public final void onRewardedVideoAdVisible() {
        C4704l lVar = this.f11170s;
        if (lVar != null) {
            lVar.mo33707g(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.mo33865e()     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f11171t     // Catch:{ all -> 0x00b4 }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0036
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            long r3 = r0.getTime()     // Catch:{ all -> 0x00b4 }
            long r5 = r8.f11172u     // Catch:{ all -> 0x00b4 }
            long r3 = r3 - r5
            if (r9 == 0) goto L_0x001f
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0021
        L_0x001f:
            r0 = 1200(0x4b0, float:1.682E-42)
        L_0x0021:
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x00b4 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = "duration"
            r6[r1] = r7     // Catch:{ all -> 0x00b4 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b4 }
            r6[r2] = r3     // Catch:{ all -> 0x00b4 }
            r5[r1] = r6     // Catch:{ all -> 0x00b4 }
            r8.m13253a(r0, r5)     // Catch:{ all -> 0x00b4 }
            goto L_0x0041
        L_0x0036:
            if (r9 == 0) goto L_0x003b
            r0 = 1207(0x4b7, float:1.691E-42)
            goto L_0x003d
        L_0x003b:
            r0 = 1208(0x4b8, float:1.693E-42)
        L_0x003d:
            r1 = 0
            r8.m13253a(r0, r1)     // Catch:{ all -> 0x00b4 }
        L_0x0041:
            boolean r0 = r8.mo33863c()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009a
            if (r9 == 0) goto L_0x004f
            com.ironsource.mediationsdk.b$a r0 = r8.f11357a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 != r1) goto L_0x0057
        L_0x004f:
            if (r9 != 0) goto L_0x0078
            com.ironsource.mediationsdk.b$a r0 = r8.f11357a     // Catch:{ all -> 0x00b4 }
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
            if (r0 == r1) goto L_0x0078
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x00b4 }
            goto L_0x005e
        L_0x005c:
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x00b4 }
        L_0x005e:
            r8.mo33859a(r0)     // Catch:{ all -> 0x00b4 }
            if (r9 == 0) goto L_0x006d
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b4 }
            r8.f11371o = r0     // Catch:{ all -> 0x00b4 }
        L_0x006d:
            com.ironsource.mediationsdk.sdk.l r0 = r8.f11170s     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
            com.ironsource.mediationsdk.sdk.l r0 = r8.f11170s     // Catch:{ all -> 0x00b4 }
            r0.mo33698a((boolean) r9, (com.ironsource.mediationsdk.C4553ac) r8)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x0078:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r1.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = r8.f11360d     // Catch:{ all -> 0x00b4 }
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.String r2 = ": state remains "
            r1.append(r2)     // Catch:{ all -> 0x00b4 }
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = " in smash, mediation remains unchanged"
            r1.append(r9)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x00b4 }
            r0.info(r9)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r8)
            return
        L_0x009a:
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r0.<init>()     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = r8.f11360d     // Catch:{ all -> 0x00b4 }
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = ": is capped or exhausted"
            r0.append(r1)     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b4 }
            r9.info(r0)     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r8)
            return
        L_0x00b4:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4553ac.onRewardedVideoAvailabilityChanged(boolean):void");
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    public final void onRewardedVideoInitSuccess() {
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.f11172u;
        if (ironSourceError.getErrorCode() == 1058) {
            m13253a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f11372p = Long.valueOf(System.currentTimeMillis());
        }
        m13253a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
