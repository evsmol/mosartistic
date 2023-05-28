package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b */
public abstract class C4605b {

    /* renamed from: a */
    C4606a f11357a;

    /* renamed from: b */
    public AbstractAdapter f11358b;

    /* renamed from: c */
    NetworkSettings f11359c;

    /* renamed from: d */
    String f11360d;

    /* renamed from: e */
    boolean f11361e;

    /* renamed from: f */
    public String f11362f;

    /* renamed from: g */
    public String f11363g;

    /* renamed from: h */
    int f11364h;

    /* renamed from: i */
    Timer f11365i;

    /* renamed from: j */
    Timer f11366j;

    /* renamed from: k */
    int f11367k;

    /* renamed from: l */
    int f11368l;

    /* renamed from: m */
    public int f11369m;

    /* renamed from: n */
    public int f11370n;

    /* renamed from: o */
    protected Long f11371o;

    /* renamed from: p */
    protected Long f11372p;

    /* renamed from: q */
    IronSourceLoggerManager f11373q;

    /* renamed from: r */
    private String f11374r;

    /* renamed from: s */
    private int f11375s;

    /* renamed from: t */
    private String f11376t = "maxAdsPerSession";

    /* renamed from: u */
    private String f11377u = "maxAdsPerIteration";

    /* renamed from: v */
    private String f11378v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum C4606a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l */
        public int f11391l;

        private C4606a(int i) {
            this.f11391l = i;
        }
    }

    C4605b(NetworkSettings networkSettings) {
        this.f11374r = networkSettings.getProviderTypeForReflection();
        this.f11360d = networkSettings.getProviderInstanceName();
        this.f11361e = networkSettings.isMultipleInstances();
        this.f11359c = networkSettings;
        this.f11362f = networkSettings.getSubProviderId();
        this.f11363g = networkSettings.getAdSourceNameForEvents();
        this.f11364h = 0;
        this.f11375s = 0;
        this.f11357a = C4606a.NOT_INITIATED;
        this.f11373q = IronSourceLoggerManager.getLogger();
        this.f11371o = null;
        this.f11372p = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33859a(com.ironsource.mediationsdk.C4605b.C4606a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f11357a     // Catch:{ all -> 0x0044 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f11357a = r5     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f11373q     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r4.f11360d     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f11358b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0044 }
            if (r5 == r0) goto L_0x0039
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_DAY     // Catch:{ all -> 0x0044 }
            if (r5 != r0) goto L_0x0042
        L_0x0039:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f11358b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.mo33324k()     // Catch:{ all -> 0x0044 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4605b.mo33859a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33860a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11373q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f11360d + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo33861a() {
        return this.f11364h >= this.f11367k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo33862b() {
        return this.f11375s >= this.f11368l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo33863c() {
        if (!mo33861a() && !mo33862b()) {
            if (!(this.f11357a == C4606a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo33864d() {
        this.f11364h++;
        this.f11375s++;
        if (mo33862b()) {
            mo33859a(C4606a.CAPPED_PER_SESSION);
        } else if (mo33861a()) {
            mo33859a(C4606a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo33865e() {
        try {
            if (this.f11365i != null) {
                this.f11365i.cancel();
            }
        } catch (Exception e) {
            mo33860a("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.f11365i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo33866f() {
        try {
            if (this.f11366j != null) {
                this.f11366j.cancel();
            }
        } catch (Exception e) {
            mo33860a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f11366j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo33321g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo33322h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo33323i();

    /* renamed from: j */
    public final String mo33867j() {
        return this.f11361e ? this.f11374r : this.f11360d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo33324k();

    /* renamed from: l */
    public final Long mo33868l() {
        return this.f11371o;
    }

    /* renamed from: m */
    public final Long mo33869m() {
        return this.f11372p;
    }
}
