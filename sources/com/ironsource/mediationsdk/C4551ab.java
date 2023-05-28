package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4411j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.logger.C4642c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.sdk.C4679i;
import com.ironsource.mediationsdk.sdk.C4704l;
import com.ironsource.mediationsdk.utils.C4715d;
import com.ironsource.mediationsdk.utils.C4716e;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ab */
final class C4551ab extends C4523a implements C4411j, C4613c, C4704l, C4715d {

    /* renamed from: m */
    C4679i f11155m;

    /* renamed from: n */
    boolean f11156n = false;

    /* renamed from: o */
    int f11157o;

    /* renamed from: p */
    C4738x f11158p;

    /* renamed from: q */
    private final String f11159q = getClass().getSimpleName();

    /* renamed from: r */
    private boolean f11160r = false;

    /* renamed from: s */
    private NetworkStateReceiver f11161s;

    /* renamed from: t */
    private Placement f11162t;

    /* renamed from: u */
    private Timer f11163u = null;

    /* renamed from: v */
    private List<C4605b.C4606a> f11164v = Arrays.asList(new C4605b.C4606a[]{C4605b.C4606a.INIT_FAILED, C4605b.C4606a.CAPPED_PER_SESSION, C4605b.C4606a.EXHAUSTED, C4605b.C4606a.CAPPED_PER_DAY});

    /* renamed from: w */
    private boolean f11165w = false;

    /* renamed from: x */
    private long f11166x = new Date().getTime();

    /* renamed from: y */
    private boolean f11167y = false;

    C4551ab() {
        this.f11040a = new C4716e("rewarded_video", this);
    }

    /* renamed from: a */
    private void m13212a(int i) {
        m13214a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m13213a(int i, C4605b bVar, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m13214a(int i, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private synchronized void m13215a(C4605b bVar, int i) {
        Object[][] objArr;
        C4723k.m13839c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f11162t);
        if (C4723k.m13840c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), m13230p())) {
            m13214a((int) IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}});
        }
        this.f11040a.mo34177a(bVar);
        if (this.f11162t != null) {
            if (this.f11156n) {
                m13216a(((C4553ac) bVar).f11173v, true, this.f11162t.getPlacementId());
                int placementId = this.f11162t.getPlacementId();
                int i2 = 0;
                while (i2 < i && i2 < this.f11042c.size()) {
                    if (!this.f11164v.contains(((C4605b) this.f11042c.get(i2)).f11357a)) {
                        m13216a(((C4553ac) this.f11042c.get(i2)).f11173v, false, placementId);
                    }
                    i2++;
                }
            }
            String p = m13230p();
            m13213a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, p}, new Object[]{"status", "true"}});
            int i3 = 0;
            while (i3 < this.f11042c.size() && i3 < i) {
                C4605b bVar2 = (C4605b) this.f11042c.get(i3);
                if (bVar2.f11357a == C4605b.C4606a.NOT_AVAILABLE || bVar2.f11357a == C4605b.C4606a.NEEDS_RELOAD) {
                    m13213a((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, bVar2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, p}, new Object[]{"status", "false"}});
                }
                i3++;
            }
        } else {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        if (this.f11162t != null) {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}};
        } else {
            objArr = null;
        }
        m13213a((int) IronSourceConstants.RV_INSTANCE_SHOW, bVar, objArr);
        this.f11167y = true;
        this.f11158p.mo34226a();
        ((C4553ac) bVar).f11174w = C4731o.m13872a().mo34207b(1);
        C4553ac acVar = (C4553ac) bVar;
        if (acVar.f11358b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = acVar.f11373q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":showRewardedVideo()", 1);
            acVar.mo33864d();
            acVar.f11358b.showRewardedVideo(acVar.f11169r, acVar);
        }
    }

    /* renamed from: a */
    private synchronized void m13216a(String str, boolean z, int i) {
        String str2 = "";
        try {
            str2 = (str2 + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable(str2, z, i) {

                /* renamed from: a */
                private /* synthetic */ String f11758a;

                /* renamed from: b */
                private /* synthetic */ boolean f11759b;

                /* renamed from: c */
                private /* synthetic */ int f11760c;

                {
                    this.f11758a = r1;
                    this.f11759b = r2;
                    this.f11760c = r3;
                }

                public final void run() {
                    String str = this.f11758a;
                    boolean z = this.f11759b;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, this.f11760c)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("callRequestURL(reqUrl:");
                        if (str == null) {
                            sb.append("null");
                        } else {
                            sb.append(str);
                        }
                        sb.append(", hit:");
                        sb.append(z);
                        sb.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new C4642c());
            thread.start();
        } catch (Throwable th) {
            this.f11047h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z + ")", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m13217a(java.util.Map<java.lang.String, java.lang.Object> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.b r0 = r2.f11043d     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.f11050k     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0023
            r2.f11050k = r1     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.b r3 = r2.f11043d     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.ac r3 = (com.ironsource.mediationsdk.C4553ac) r3     // Catch:{ all -> 0x004a }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r2.m13221h(r3)     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0021
            com.ironsource.mediationsdk.sdk.i r3 = r2.f11155m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f11049j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            boolean r0 = r2.m13225k()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003d
            r3 = 0
            boolean r3 = r2.m13218a((boolean) r1, (boolean) r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            com.ironsource.mediationsdk.sdk.i r3 = r2.f11155m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r0 = r2.f11049j     // Catch:{ all -> 0x004a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004a }
            r3.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x004a }
            monitor-exit(r2)
            return
        L_0x003d:
            com.ironsource.mediationsdk.sdk.i r0 = r2.f11155m     // Catch:{ all -> 0x004a }
            java.lang.Boolean r1 = r2.f11049j     // Catch:{ all -> 0x004a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x004a }
            r0.mo34132a((boolean) r1, (java.util.Map<java.lang.String, java.lang.Object>) r3)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r2)
            return
        L_0x004a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.m13217a(java.util.Map):void");
    }

    /* renamed from: a */
    private synchronized boolean m13218a(boolean z, boolean z2) {
        boolean z3;
        Boolean bool;
        z3 = false;
        if (this.f11049j == null) {
            mo33702d();
            if (z) {
                bool = Boolean.TRUE;
            } else if (!m13225k() && m13222h()) {
                bool = Boolean.FALSE;
            }
        } else if (z && !this.f11049j.booleanValue()) {
            bool = Boolean.TRUE;
        } else if (!z && this.f11049j.booleanValue() && ((!m13224j() || z2) && !m13225k())) {
            bool = Boolean.FALSE;
        }
        this.f11049j = bool;
        z3 = true;
        return z3;
    }

    /* renamed from: b */
    private void m13219b(boolean z) {
        if (!z && mo33701c()) {
            m13214a(1000, (Object[][]) null);
            m13214a(1003, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
            this.f11165w = false;
        } else if (m13223i()) {
            m13214a(1000, (Object[][]) null);
            this.f11165w = true;
            this.f11166x = new Date().getTime();
        }
    }

    /* renamed from: f */
    private AbstractAdapter m13220f() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f11042c.size() && abstractAdapter == null; i2++) {
            if (((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.AVAILABLE || ((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.INITIATED) {
                i++;
                if (i >= this.f11041b) {
                    break;
                }
            } else if (((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.NOT_INITIATED && (abstractAdapter = m13221h((C4553ac) this.f11042c.get(i2))) == null) {
                ((C4605b) this.f11042c.get(i2)).mo33859a(C4605b.C4606a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m13221h(com.ironsource.mediationsdk.C4553ac r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r2.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r9.f11159q     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = r10.f11360d     // Catch:{ all -> 0x00d7 }
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C4616d.m13502a()     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f11359c     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f11359c     // Catch:{ all -> 0x00d7 }
            org.json.JSONObject r2 = r2.getRewardedVideoSettings()     // Catch:{ all -> 0x00d7 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo33892a(r1, r2, r4, r4)     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r3.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r10.f11360d     // Catch:{ all -> 0x00d7 }
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00d7 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00d7 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x0057:
            r10.f11358b = r0     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.INITIATED     // Catch:{ all -> 0x00d7 }
            r10.mo33859a(r2)     // Catch:{ all -> 0x00d7 }
            r9.mo33630b(r10)     // Catch:{ all -> 0x00d7 }
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.m13213a((int) r2, (com.ironsource.mediationsdk.C4605b) r10, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x00d7 }
            java.lang.String r2 = r9.f11046g     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r9.f11045f     // Catch:{ all -> 0x00a9 }
            r10.mo33322h()     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f11358b     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x00a7
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f11171t     // Catch:{ all -> 0x00a9 }
            r5.set(r3)     // Catch:{ all -> 0x00a9 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00a9 }
            r5.<init>()     // Catch:{ all -> 0x00a9 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00a9 }
            r10.f11172u = r5     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f11358b     // Catch:{ all -> 0x00a9 }
            r5.addRewardedVideoListener(r10)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f11373q     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r10.f11360d     // Catch:{ all -> 0x00a9 }
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = ":initRewardedVideo()"
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x00a9 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f11358b     // Catch:{ all -> 0x00a9 }
            org.json.JSONObject r5 = r10.f11169r     // Catch:{ all -> 0x00a9 }
            r3.initRewardedVideo(r2, r4, r5, r10)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r9)
            return r0
        L_0x00a9:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f11047h     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00d7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d7 }
            r4.<init>()     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r9.f11159q     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = r10.mo33867j()     // Catch:{ all -> 0x00d7 }
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00d7 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00d7 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_FAILED     // Catch:{ all -> 0x00d7 }
            r10.mo33859a(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r9)
            return r1
        L_0x00d7:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.m13221h(com.ironsource.mediationsdk.ac):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* renamed from: h */
    private synchronized boolean m13222h() {
        int i;
        Iterator it = this.f11042c.iterator();
        i = 0;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.INIT_FAILED || bVar.f11357a == C4605b.C4606a.CAPPED_PER_DAY || bVar.f11357a == C4605b.C4606a.CAPPED_PER_SESSION || bVar.f11357a == C4605b.C4606a.NOT_AVAILABLE || bVar.f11357a == C4605b.C4606a.NEEDS_RELOAD || bVar.f11357a == C4605b.C4606a.EXHAUSTED) {
                i++;
            }
        }
        return this.f11042c.size() == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m13223i() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f11042c     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C4605b) r1     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.NEEDS_RELOAD     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.INITIATED     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_PENDING     // Catch:{ all -> 0x003c }
            if (r2 == r3) goto L_0x0037
            com.ironsource.mediationsdk.b$a r1 = r1.f11357a     // Catch:{ all -> 0x003c }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.LOAD_PENDING     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0007
        L_0x0037:
            r0 = 1
        L_0x0038:
            monitor-exit(r4)
            return r0
        L_0x003a:
            r0 = 0
            goto L_0x0038
        L_0x003c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.m13223i():boolean");
    }

    /* renamed from: j */
    private synchronized boolean m13224j() {
        boolean z;
        z = false;
        Iterator it = this.f11042c.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C4605b) it.next()).f11357a == C4605b.C4606a.AVAILABLE) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: k */
    private synchronized boolean m13225k() {
        if (this.f11043d == null) {
            return false;
        }
        return ((C4553ac) this.f11043d).mo33710o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m13226l() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.AbstractAdapter r0 = r9.m13220f()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r9)
            return
        L_0x0009:
            r0 = 4
            com.ironsource.mediationsdk.b$a[] r1 = new com.ironsource.mediationsdk.C4605b.C4606a[r0]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x005a }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.NEEDS_RELOAD     // Catch:{ all -> 0x005a }
            r4 = 1
            r1[r4] = r2     // Catch:{ all -> 0x005a }
            r2 = 2
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_SESSION     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            r2 = 3
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_DAY     // Catch:{ all -> 0x005a }
            r1[r2] = r4     // Catch:{ all -> 0x005a }
            java.util.concurrent.CopyOnWriteArrayList r2 = r9.f11042c     // Catch:{ all -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005a }
            r4 = 0
        L_0x0027:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b r5 = (com.ironsource.mediationsdk.C4605b) r5     // Catch:{ all -> 0x005a }
            r6 = 0
        L_0x0034:
            if (r6 >= r0) goto L_0x0027
            r7 = r1[r6]     // Catch:{ all -> 0x005a }
            com.ironsource.mediationsdk.b$a r8 = r5.f11357a     // Catch:{ all -> 0x005a }
            if (r8 != r7) goto L_0x003e
            int r4 = r4 + 1
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0034
        L_0x0041:
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f11042c     // Catch:{ all -> 0x005a }
            int r0 = r0.size()     // Catch:{ all -> 0x005a }
            if (r4 >= r0) goto L_0x004e
            r9.m13227m()     // Catch:{ all -> 0x005a }
            monitor-exit(r9)
            return
        L_0x004e:
            boolean r0 = r9.m13218a((boolean) r3, (boolean) r3)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r9.m13217a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r9)
            return
        L_0x005a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.m13226l():void");
    }

    /* renamed from: m */
    private synchronized void m13227m() {
        if (m13228n()) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator it = this.f11042c.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C4605b bVar = (C4605b) it.next();
                if (bVar.f11357a == C4605b.C4606a.EXHAUSTED) {
                    bVar.mo33321g();
                }
                if (bVar.f11357a == C4605b.C4606a.AVAILABLE) {
                    z = true;
                }
            }
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (m13218a(z, false)) {
                this.f11155m.onRewardedVideoAvailabilityChanged(this.f11049j.booleanValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000d  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m13228n() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f11042c     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
        L_0x0007:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C4605b) r1     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r2 = r1.f11357a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.INITIATED     // Catch:{ all -> 0x002a }
            if (r2 == r3) goto L_0x0025
            com.ironsource.mediationsdk.b$a r1 = r1.f11357a     // Catch:{ all -> 0x002a }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x002a }
            if (r1 != r2) goto L_0x0007
        L_0x0025:
            r0 = 0
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = 1
            goto L_0x0026
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.m13228n():boolean");
    }

    /* renamed from: o */
    private void m13229o() {
        for (int i = 0; i < this.f11042c.size(); i++) {
            String providerTypeForReflection = ((C4605b) this.f11042c.get(i)).f11359c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C4616d.m13502a().mo33892a(((C4605b) this.f11042c.get(i)).f11359c, ((C4605b) this.f11042c.get(i)).f11359c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    /* renamed from: p */
    private String m13230p() {
        Placement placement = this.f11162t;
        return placement == null ? "" : placement.getPlacementName();
    }

    /* renamed from: q */
    private void m13231q() {
        Iterator it = this.f11042c.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.AVAILABLE && bVar.mo33868l() != null && bVar.mo33868l().longValue() < j) {
                j = bVar.mo33868l().longValue();
            }
        }
        if (j != Long.MAX_VALUE) {
            this.f11158p.mo34227a(System.currentTimeMillis() - j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33301a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f11159q + " Should Track Network State: " + z, 0);
        try {
            this.f11048i = z;
            if (this.f11048i) {
                if (this.f11161s == null) {
                    this.f11161s = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f11161s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f11161s != null) {
                context.getApplicationContext().unregisterReceiver(this.f11161s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo33693a(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdOpened()", 1);
        m13213a(1005, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)}});
        this.f11155m.onRewardedVideoAdOpened();
    }

    /* renamed from: a */
    public final void mo33694a(IronSourceError ironSourceError, C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f11167y = false;
        int i = acVar.f11174w;
        m13213a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(i)}});
        m13219b(false);
        this.f11155m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33695a(Placement placement) {
        this.f11162t = placement;
        this.f11155m.f11708f = placement.getPlacementName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33696a(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r2.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = r9.f11159q     // Catch:{ all -> 0x01a1 }
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ":showRewardedVideo(placementName: "
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            r2.append(r10)     // Catch:{ all -> 0x01a1 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a1 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r0 = r9.f11155m     // Catch:{ all -> 0x01a1 }
            r0.f11708f = r10     // Catch:{ all -> 0x01a1 }
            r0 = 1100(0x44c, float:1.541E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "placement"
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x01a1 }
            r4[r3] = r10     // Catch:{ all -> 0x01a1 }
            r1[r6] = r4     // Catch:{ all -> 0x01a1 }
            r9.m13214a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f11167y     // Catch:{ all -> 0x01a1 }
            r0 = 3
            if (r10 == 0) goto L_0x0057
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f11047h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01a1 }
            r1 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f11155m     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r10 = r9.f11048i     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x007f
            com.ironsource.environment.ContextProvider r10 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01a1 }
            android.app.Activity r10 = r10.getCurrentActiveActivity()     // Catch:{ all -> 0x01a1 }
            boolean r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x007f
            java.lang.String r10 = "showRewardedVideo error: can't show ad when there's no internet connection"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r9.f11047h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01a1 }
            r1.log(r2, r10, r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f11155m     // Catch:{ all -> 0x01a1 }
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoInternetConnectionShowFailError(r0)     // Catch:{ all -> 0x01a1 }
            r10.onRewardedVideoAdShowFailed(r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x007f:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ all -> 0x01a1 }
            r10.<init>()     // Catch:{ all -> 0x01a1 }
            r0 = 0
        L_0x0085:
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f11042c     // Catch:{ all -> 0x01a1 }
            int r1 = r1.size()     // Catch:{ all -> 0x01a1 }
            if (r0 >= r1) goto L_0x0173
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.f11042c     // Catch:{ all -> 0x01a1 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C4605b) r1     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f11047h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = "showRewardedVideo, iterating on: "
            r7.<init>(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = r1.f11360d     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r8 = ", Status: "
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r8 = r1.f11357a     // Catch:{ all -> 0x01a1 }
            r7.append(r8)     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01a1 }
            r4.log(r5, r7, r6)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r4 = r1.f11357a     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x01a1 }
            if (r4 != r5) goto L_0x016f
            r4 = r1
            com.ironsource.mediationsdk.ac r4 = (com.ironsource.mediationsdk.C4553ac) r4     // Catch:{ all -> 0x01a1 }
            boolean r4 = r4.mo33710o()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0120
            r9.m13215a((com.ironsource.mediationsdk.C4605b) r1, (int) r0)     // Catch:{ all -> 0x01a1 }
            boolean r10 = r9.f11051l     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00d7
            com.ironsource.mediationsdk.b r10 = r9.f11044e     // Catch:{ all -> 0x01a1 }
            boolean r10 = r1.equals(r10)     // Catch:{ all -> 0x01a1 }
            if (r10 != 0) goto L_0x00d7
            r9.mo33629b()     // Catch:{ all -> 0x01a1 }
        L_0x00d7:
            boolean r10 = r1.mo33862b()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x00ed
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_SESSION     // Catch:{ all -> 0x01a1 }
            r1.mo33859a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 1401(0x579, float:1.963E-42)
            r0 = 0
            r9.m13213a((int) r10, (com.ironsource.mediationsdk.C4605b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m13226l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x00ed:
            com.ironsource.mediationsdk.utils.e r10 = r9.f11040a     // Catch:{ all -> 0x01a1 }
            boolean r10 = r10.mo34180c((com.ironsource.mediationsdk.C4605b) r1)     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x0112
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_DAY     // Catch:{ all -> 0x01a1 }
            r1.mo33859a(r10)     // Catch:{ all -> 0x01a1 }
            r10 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01a1 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "status"
            r2[r6] = r4     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = "true"
            r2[r3] = r4     // Catch:{ all -> 0x01a1 }
            r0[r6] = r2     // Catch:{ all -> 0x01a1 }
            r9.m13213a((int) r10, (com.ironsource.mediationsdk.C4605b) r1, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01a1 }
            r9.m13226l()     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0112:
            boolean r10 = r1.mo33861a()     // Catch:{ all -> 0x01a1 }
            if (r10 == 0) goto L_0x011e
            r9.m13220f()     // Catch:{ all -> 0x01a1 }
            r9.m13227m()     // Catch:{ all -> 0x01a1 }
        L_0x011e:
            monitor-exit(r9)
            return
        L_0x0120:
            java.lang.Long r4 = r1.mo33869m()     // Catch:{ all -> 0x01a1 }
            if (r4 == 0) goto L_0x0148
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r4.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = r1.f11360d     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.Long r5 = r1.mo33869m()     // Catch:{ all -> 0x01a1 }
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = ","
            r4.append(r5)     // Catch:{ all -> 0x01a1 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01a1 }
            r10.append(r4)     // Catch:{ all -> 0x01a1 }
        L_0x0148:
            r4 = r1
            com.ironsource.mediationsdk.ac r4 = (com.ironsource.mediationsdk.C4553ac) r4     // Catch:{ all -> 0x01a1 }
            r9.mo33698a((boolean) r6, (com.ironsource.mediationsdk.C4553ac) r4)     // Catch:{ all -> 0x01a1 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x01a1 }
            java.lang.String r5 = "FailedToShowVideoException"
            r4.<init>(r5)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f11047h     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x01a1 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a1 }
            r8.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r1.f11360d     // Catch:{ all -> 0x01a1 }
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = " Failed to show video"
            r8.append(r1)     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x01a1 }
            r5.logException(r7, r1, r4)     // Catch:{ all -> 0x01a1 }
        L_0x016f:
            int r0 = r0 + 1
            goto L_0x0085
        L_0x0173:
            boolean r0 = r9.m13225k()     // Catch:{ all -> 0x01a1 }
            if (r0 == 0) goto L_0x0186
            com.ironsource.mediationsdk.b r10 = r9.f11043d     // Catch:{ all -> 0x01a1 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f11042c     // Catch:{ all -> 0x01a1 }
            int r0 = r0.size()     // Catch:{ all -> 0x01a1 }
            r9.m13215a((com.ironsource.mediationsdk.C4605b) r10, (int) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x0186:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x01a1 }
            r0.<init>()     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "ext1"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01a1 }
            r0.put(r1, r10)     // Catch:{ all -> 0x01a1 }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f11155m     // Catch:{ all -> 0x01a1 }
            java.lang.String r1 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r1 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r1)     // Catch:{ all -> 0x01a1 }
            r10.mo34131a((com.ironsource.mediationsdk.logger.IronSourceError) r1, (java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x01a1 }
            monitor-exit(r9)
            return
        L_0x01a1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.mo33696a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00de, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33697a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r2.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r9.f11159q     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ":initRewardedVideo(appKey: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r10)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ", userId: "
            r2.append(r3)     // Catch:{ all -> 0x00df }
            r2.append(r11)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00df }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x00df }
            r0.<init>()     // Catch:{ all -> 0x00df }
            long r0 = r0.getTime()     // Catch:{ all -> 0x00df }
            r2 = 81312(0x13da0, float:1.13942E-40)
            r9.m13212a((int) r2)     // Catch:{ all -> 0x00df }
            r9.f11046g = r10     // Catch:{ all -> 0x00df }
            r9.f11045f = r11     // Catch:{ all -> 0x00df }
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f11042c     // Catch:{ all -> 0x00df }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00df }
            r11 = 0
            r2 = 0
        L_0x0047:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x00df }
            r5 = 2
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r10.next()     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.b r4 = (com.ironsource.mediationsdk.C4605b) r4     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.utils.e r6 = r9.f11040a     // Catch:{ all -> 0x00df }
            boolean r6 = r6.mo34179b((com.ironsource.mediationsdk.C4605b) r4)     // Catch:{ all -> 0x00df }
            if (r6 == 0) goto L_0x006f
            r6 = 150(0x96, float:2.1E-43)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "status"
            r5[r11] = r8     // Catch:{ all -> 0x00df }
            java.lang.String r8 = "false"
            r5[r3] = r8     // Catch:{ all -> 0x00df }
            r7[r11] = r5     // Catch:{ all -> 0x00df }
            r9.m13213a((int) r6, (com.ironsource.mediationsdk.C4605b) r4, (java.lang.Object[][]) r7)     // Catch:{ all -> 0x00df }
        L_0x006f:
            com.ironsource.mediationsdk.utils.e r5 = r9.f11040a     // Catch:{ all -> 0x00df }
            boolean r5 = r5.mo34180c((com.ironsource.mediationsdk.C4605b) r4)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0047
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_DAY     // Catch:{ all -> 0x00df }
            r4.mo33859a(r5)     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            goto L_0x0047
        L_0x007f:
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f11042c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r2 != r10) goto L_0x008e
            com.ironsource.mediationsdk.sdk.i r10 = r9.f11155m     // Catch:{ all -> 0x00df }
            r10.onRewardedVideoAvailabilityChanged(r11)     // Catch:{ all -> 0x00df }
            monitor-exit(r9)
            return
        L_0x008e:
            r10 = 1000(0x3e8, float:1.401E-42)
            r9.m13212a((int) r10)     // Catch:{ all -> 0x00df }
            com.ironsource.mediationsdk.sdk.i r10 = r9.f11155m     // Catch:{ all -> 0x00df }
            r2 = 0
            r10.f11708f = r2     // Catch:{ all -> 0x00df }
            r9.f11165w = r3     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            r9.f11166x = r6     // Catch:{ all -> 0x00df }
            java.util.Date r10 = new java.util.Date     // Catch:{ all -> 0x00df }
            r10.<init>()     // Catch:{ all -> 0x00df }
            long r6 = r10.getTime()     // Catch:{ all -> 0x00df }
            long r6 = r6 - r0
            r10 = 81313(0x13da1, float:1.13944E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00df }
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "duration"
            r1[r11] = r2     // Catch:{ all -> 0x00df }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00df }
            r1[r3] = r2     // Catch:{ all -> 0x00df }
            r0[r11] = r1     // Catch:{ all -> 0x00df }
            r9.m13214a((int) r10, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x00df }
            r9.m13229o()     // Catch:{ all -> 0x00df }
        L_0x00c8:
            int r10 = r9.f11041b     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            java.util.concurrent.CopyOnWriteArrayList r10 = r9.f11042c     // Catch:{ all -> 0x00df }
            int r10 = r10.size()     // Catch:{ all -> 0x00df }
            if (r11 >= r10) goto L_0x00dd
            com.ironsource.mediationsdk.AbstractAdapter r10 = r9.m13220f()     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00dd
            int r11 = r11 + 1
            goto L_0x00c8
        L_0x00dd:
            monitor-exit(r9)
            return
        L_0x00df:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.mo33697a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo33217a(boolean z) {
        Boolean bool;
        if (this.f11048i) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = false;
            ironSourceLoggerManager.log(ironSourceTag, "Network Availability Changed To: " + z, 0);
            if (this.f11049j != null) {
                if (z && !this.f11049j.booleanValue() && m13224j()) {
                    bool = Boolean.TRUE;
                } else if (!z && this.f11049j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f11049j = bool;
                z2 = true;
            }
            if (z2) {
                this.f11160r = !z;
                this.f11155m.onRewardedVideoAvailabilityChanged(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33698a(boolean r9, com.ironsource.mediationsdk.C4553ac r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r8.f11047h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            r2.<init>()     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = r10.f11360d     // Catch:{ all -> 0x0117 }
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ": onRewardedVideoAvailabilityChanged(available:"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            r2.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0117 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0117 }
            boolean r0 = r8.f11160r     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r8)
            return
        L_0x002a:
            r0 = 0
            if (r9 == 0) goto L_0x0058
            boolean r1 = r8.f11165w     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0058
            r8.f11165w = r0     // Catch:{ all -> 0x0117 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0117 }
            r1.<init>()     // Catch:{ all -> 0x0117 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0117 }
            long r4 = r8.f11166x     // Catch:{ all -> 0x0117 }
            long r1 = r1 - r4
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r5 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0117 }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0117 }
            java.lang.String r7 = "duration"
            r6[r0] = r7     // Catch:{ all -> 0x0117 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0117 }
            r6[r3] = r1     // Catch:{ all -> 0x0117 }
            r5[r0] = r6     // Catch:{ all -> 0x0117 }
            r8.m13214a((int) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x0117 }
            r8.m13231q()     // Catch:{ all -> 0x0117 }
        L_0x0058:
            com.ironsource.mediationsdk.b r1 = r8.f11043d     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x0073
            boolean r0 = r8.m13218a((boolean) r9, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0071
            com.ironsource.mediationsdk.sdk.i r0 = r8.f11155m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f11049j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x0071:
            monitor-exit(r8)
            return
        L_0x0073:
            com.ironsource.mediationsdk.b r1 = r8.f11044e     // Catch:{ all -> 0x00ee }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f11047h     // Catch:{ all -> 0x00ee }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r4.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = r10.f11360d     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r5 = " is a premium adapter, canShowPremium: "
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            boolean r5 = r8.mo33628a()     // Catch:{ all -> 0x00ee }
            r4.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00ee }
            r1.log(r2, r4, r3)     // Catch:{ all -> 0x00ee }
            boolean r1 = r8.mo33628a()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ba
            com.ironsource.mediationsdk.b$a r1 = com.ironsource.mediationsdk.C4605b.C4606a.CAPPED_PER_SESSION     // Catch:{ all -> 0x00ee }
            r10.mo33859a(r1)     // Catch:{ all -> 0x00ee }
            boolean r0 = r8.m13218a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00b8
            com.ironsource.mediationsdk.sdk.i r0 = r8.f11155m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f11049j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
        L_0x00b8:
            monitor-exit(r8)
            return
        L_0x00ba:
            com.ironsource.mediationsdk.utils.e r1 = r8.f11040a     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo34180c((com.ironsource.mediationsdk.C4605b) r10)     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00dc
            boolean r1 = r10.mo33863c()     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00dc
            boolean r0 = r8.m13218a((boolean) r3, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00ec
            com.ironsource.mediationsdk.sdk.i r0 = r8.f11155m     // Catch:{ all -> 0x00ee }
            java.lang.Boolean r1 = r8.f11049j     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ee }
            r0.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x0115
        L_0x00dc:
            boolean r0 = r8.m13218a((boolean) r0, (boolean) r0)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            r8.m13217a((java.util.Map<java.lang.String, java.lang.Object>) r0)     // Catch:{ all -> 0x00ee }
        L_0x00e6:
            r8.m13220f()     // Catch:{ all -> 0x00ee }
            r8.m13227m()     // Catch:{ all -> 0x00ee }
        L_0x00ec:
            monitor-exit(r8)
            return
        L_0x00ee:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r8.f11047h     // Catch:{ all -> 0x0117 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0117 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0117 }
            java.lang.String r4 = "onRewardedVideoAvailabilityChanged(available:"
            r3.<init>(r4)     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ", provider:"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r10.mo33867j()     // Catch:{ all -> 0x0117 }
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = ")"
            r3.append(r9)     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0117 }
            r1.logException(r2, r9, r0)     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r8)
            return
        L_0x0117:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.mo33698a(boolean, com.ironsource.mediationsdk.ac):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo33629b() {
        super.mo33629b();
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.equals(this.f11044e)) {
                bVar.mo33859a(C4605b.C4606a.CAPPED_PER_SESSION);
                m13220f();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo33699b(C4553ac acVar) {
        String str;
        this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, acVar.f11360d + ":onRewardedVideoAdClosed()", 1);
        this.f11167y = false;
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = this.f11042c.iterator();
            while (it.hasNext()) {
                C4605b bVar = (C4605b) it.next();
                if (((C4553ac) bVar).mo33710o()) {
                    sb.append(bVar.f11360d + ";");
                }
            }
        } catch (Throwable unused) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3][];
        objArr[0] = new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()};
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[1] = objArr2;
        objArr[2] = new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)};
        m13213a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (C4605b) acVar, objArr);
        C4731o.m13872a().mo34205a(1);
        if (!acVar.mo33862b() && !this.f11040a.mo34180c((C4605b) acVar)) {
            m13213a(1001, (C4605b) acVar, (Object[][]) null);
        }
        m13219b(false);
        this.f11155m.onRewardedVideoAdClosed();
        m13231q();
        Iterator it2 = this.f11042c.iterator();
        while (it2.hasNext()) {
            C4605b bVar2 = (C4605b) it2.next();
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Fetch on ad closed, iterating on: " + bVar2.f11360d + ", Status: " + bVar2.f11357a, 0);
            if (bVar2.f11357a == C4605b.C4606a.NOT_AVAILABLE || bVar2.f11357a == C4605b.C4606a.NEEDS_RELOAD) {
                try {
                    if (!bVar2.f11360d.equals(acVar.f11360d)) {
                        this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, bVar2.f11360d + ":reload smash", 1);
                        ((C4553ac) bVar2).mo33709n();
                        m13213a(1001, bVar2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f11047h.log(IronSourceLogger.IronSourceTag.NATIVE, bVar2.f11360d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo33700c(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdStarted()", 1);
        m13213a((int) IronSourceConstants.RV_INSTANCE_STARTED, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)}});
        this.f11155m.onRewardedVideoAdStarted();
    }

    /* renamed from: c */
    public final synchronized boolean mo33701c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f11159q + ":isRewardedVideoAvailable()", 1);
        if (this.f11048i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.mo33863c() && ((C4553ac) bVar).mo33710o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c_ */
    public final void mo33397c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f11049j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            m13214a((int) IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (m13218a(false, true)) {
            m13217a(C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        m13219b(true);
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.AVAILABLE || bVar.f11357a == C4605b.C4606a.NOT_AVAILABLE) {
                bVar.mo33859a(C4605b.C4606a.NEEDS_RELOAD);
            }
        }
        Iterator it2 = this.f11042c.iterator();
        while (it2.hasNext()) {
            C4605b bVar2 = (C4605b) it2.next();
            if (bVar2.f11357a == C4605b.C4606a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(bVar2.f11360d + ":reload smash");
                    m13213a(1001, bVar2, (Object[][]) null);
                    ((C4553ac) bVar2).mo33709n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(bVar2.f11360d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo33702d() {
        if (this.f11157o <= 0) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f11163u;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f11163u = timer2;
        timer2.schedule(new TimerTask() {
            public final void run() {
                cancel();
                C4551ab.this.mo33704e();
                C4551ab.this.mo33702d();
            }
        }, (long) (this.f11157o * 1000));
    }

    /* renamed from: d */
    public final void mo33703d(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdEnded()", 1);
        m13213a((int) IronSourceConstants.RV_INSTANCE_ENDED, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)}});
        this.f11155m.onRewardedVideoAdEnded();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo33704e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0092 }
            android.app.Activity r0 = r0.getCurrentActiveActivity()     // Catch:{ all -> 0x0092 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            java.lang.Boolean r0 = r8.f11049j     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0015
            goto L_0x0090
        L_0x0015:
            java.lang.Boolean r0 = r8.f11049j     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x008e
            r0 = 102(0x66, float:1.43E-43)
            r1 = 0
            r8.m13214a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r8.m13214a((int) r0, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r8.f11165w = r0     // Catch:{ all -> 0x0092 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r8.f11042c     // Catch:{ all -> 0x0092 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0031:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b r3 = (com.ironsource.mediationsdk.C4605b) r3     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r4 = r3.f11357a     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.b$a r5 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x0092 }
            if (r4 != r5) goto L_0x0031
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r8.f11047h     // Catch:{ all -> 0x006b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            java.lang.String r7 = "Fetch from timer: "
            r6.<init>(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = r3.f11360d     // Catch:{ all -> 0x006b }
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r7 = ":reload smash"
            r6.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006b }
            r4.log(r5, r6, r0)     // Catch:{ all -> 0x006b }
            r4 = 1001(0x3e9, float:1.403E-42)
            r8.m13213a((int) r4, (com.ironsource.mediationsdk.C4605b) r3, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x006b }
            r4 = r3
            com.ironsource.mediationsdk.ac r4 = (com.ironsource.mediationsdk.C4553ac) r4     // Catch:{ all -> 0x006b }
            r4.mo33709n()     // Catch:{ all -> 0x006b }
            goto L_0x0031
        L_0x006b:
            r4 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r8.f11047h     // Catch:{ all -> 0x0092 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r7.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r3.f11360d     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = " Failed to call fetchVideo(), "
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r4.getLocalizedMessage()     // Catch:{ all -> 0x0092 }
            r7.append(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0092 }
            r5.log(r6, r3, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0031
        L_0x008e:
            monitor-exit(r8)
            return
        L_0x0090:
            monitor-exit(r8)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4551ab.mo33704e():void");
    }

    /* renamed from: e */
    public final void mo33705e(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdRewarded()", 1);
        if (this.f11162t == null) {
            this.f11162t = C4455H.m12683a().f10651i.f11953c.f11610a.mo34043a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData((C4605b) acVar);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, acVar.f11174w);
            if (this.f11162t != null) {
                providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f11162t.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f11162t.getRewardAmount());
            } else {
                this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4532c cVar = new C4532c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f11046g)) {
            cVar.mo33670a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo33671b(), acVar.mo33867j()));
            if (!TextUtils.isEmpty(C4455H.m12683a().f10655m)) {
                cVar.mo33670a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, (Object) C4455H.m12683a().f10655m);
            }
            Map<String, String> map = C4455H.m12683a().f10656n;
            if (map != null) {
                for (String next : map.keySet()) {
                    cVar.mo33670a("custom_" + next, (Object) map.get(next));
                }
            }
        }
        C4537h.m13193e().mo33649b(cVar);
        Placement placement = this.f11162t;
        if (placement != null) {
            this.f11155m.onRewardedVideoAdRewarded(placement);
        } else {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    /* renamed from: f */
    public final void mo33706f(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdClicked()", 1);
        if (this.f11162t == null) {
            this.f11162t = C4455H.m12683a().f10651i.f11953c.f11610a.mo34043a();
        }
        if (this.f11162t == null) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
            return;
        }
        m13213a(1006, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)}});
        this.f11155m.onRewardedVideoAdClicked(this.f11162t);
    }

    /* renamed from: g */
    public final void mo33320g() {
        Iterator it = this.f11042c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.CAPPED_PER_DAY) {
                m13213a((int) IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo33859a(C4605b.C4606a.NOT_AVAILABLE);
                if (((C4553ac) bVar).mo33710o() && bVar.mo33863c()) {
                    bVar.mo33859a(C4605b.C4606a.AVAILABLE);
                    z = true;
                }
            }
        }
        if (z && m13218a(true, false)) {
            this.f11155m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    /* renamed from: g */
    public final void mo33707g(C4553ac acVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, acVar.f11360d + ":onRewardedVideoAdVisible()", 1);
        if (this.f11162t != null) {
            m13213a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (C4605b) acVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PLACEMENT_NAME, m13230p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(acVar.f11174w)}});
            return;
        }
        this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
    }
}
