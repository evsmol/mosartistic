package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4476M;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4652g;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.sdk.C4678h;
import com.ironsource.mediationsdk.sdk.C4679i;
import com.ironsource.mediationsdk.utils.C4715d;
import com.ironsource.mediationsdk.utils.C4716e;
import com.ironsource.mediationsdk.utils.C4721i;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.E */
final class C4450E extends C4523a implements C4678h, C4715d, C4721i {

    /* renamed from: m */
    C4679i f10581m;

    /* renamed from: n */
    C4665p f10582n = C4665p.m13650a();

    /* renamed from: o */
    private final String f10583o = getClass().getName();

    /* renamed from: p */
    private boolean f10584p = false;

    /* renamed from: q */
    private boolean f10585q = false;

    /* renamed from: r */
    private boolean f10586r;

    /* renamed from: s */
    private InterstitialPlacement f10587s;

    /* renamed from: t */
    private boolean f10588t = false;

    /* renamed from: u */
    private Map<String, C4451F> f10589u = new ConcurrentHashMap();

    /* renamed from: v */
    private CopyOnWriteArraySet<String> f10590v = new CopyOnWriteArraySet<>();

    /* renamed from: w */
    private long f10591w;

    /* renamed from: x */
    private boolean f10592x;

    C4450E() {
        this.f11040a = new C4716e("interstitial", this);
        this.f10592x = false;
    }

    /* renamed from: a */
    private int m12638a(C4605b.C4606a... aVarArr) {
        Iterator it = this.f11042c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            for (C4605b.C4606a aVar : aVarArr) {
                if (bVar.f11357a == aVar) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private void m12639a(int i, C4605b bVar, Object[][] objArr) {
        m12640a(i, bVar, objArr, false);
    }

    /* renamed from: a */
    private void m12640a(int i, C4605b bVar, Object[][] objArr, boolean z) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(bVar);
        if (z) {
            try {
                if (this.f10587s != null && !TextUtils.isEmpty(this.f10587s.getPlacementName())) {
                    providerAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10587s.getPlacementName());
                }
            } catch (Exception e) {
                this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m12641a(int i, Object[][] objArr) {
        m12642a(i, objArr, false);
    }

    /* renamed from: a */
    private void m12642a(int i, Object[][] objArr, boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z) {
            try {
                if (this.f10587s != null && !TextUtils.isEmpty(this.f10587s.getPlacementName())) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10587s.getPlacementName());
                }
            } catch (Exception e) {
                this.f11047h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, mediationAdditionalData));
    }

    /* renamed from: b */
    private void m12643b(int i, C4605b bVar, Object[][] objArr) {
        m12640a(i, bVar, objArr, true);
    }

    /* renamed from: c */
    private void m12644c(C4605b bVar) {
        if (!bVar.mo33863c()) {
            m12648i();
            m12646h();
            return;
        }
        bVar.mo33859a(C4605b.C4606a.INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.ironsource.mediationsdk.AbstractAdapter m12645g(com.ironsource.mediationsdk.C4451F r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r9.f10583o     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ":startAdapter("
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = r10.mo33867j()     // Catch:{ all -> 0x00c4 }
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.d r0 = com.ironsource.mediationsdk.C4616d.m13502a()     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r10.f11359c     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r10.f11359c     // Catch:{ all -> 0x00c4 }
            org.json.JSONObject r2 = r2.getInterstitialSettings()     // Catch:{ all -> 0x00c4 }
            r4 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r0.mo33892a(r1, r2, r4, r4)     // Catch:{ all -> 0x00c4 }
            r1 = 0
            if (r0 != 0) goto L_0x0059
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f11047h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r10.f11360d     // Catch:{ all -> 0x00c4 }
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = " is configured in IronSource's platform, but the adapter is not integrated"
            r3.append(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00c4 }
            r3 = 2
            r0.log(r2, r10, r3)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x0059:
            r10.f11358b = r0     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_PENDING     // Catch:{ all -> 0x00c4 }
            r10.mo33859a(r2)     // Catch:{ all -> 0x00c4 }
            r9.mo33630b(r10)     // Catch:{ all -> 0x00c4 }
            java.lang.String r2 = r9.f11046g     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = r9.f11045f     // Catch:{ all -> 0x0096 }
            r10.mo33322h()     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f11358b     // Catch:{ all -> 0x0096 }
            if (r5 == 0) goto L_0x0094
            com.ironsource.mediationsdk.AbstractAdapter r5 = r10.f11358b     // Catch:{ all -> 0x0096 }
            r5.addInterstitialListener(r10)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r10.f11373q     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = r10.f11360d     // Catch:{ all -> 0x0096 }
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r8 = ":initInterstitial()"
            r7.append(r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0096 }
            r5.log(r6, r7, r3)     // Catch:{ all -> 0x0096 }
            com.ironsource.mediationsdk.AbstractAdapter r3 = r10.f11358b     // Catch:{ all -> 0x0096 }
            org.json.JSONObject r5 = r10.f10593r     // Catch:{ all -> 0x0096 }
            r3.initInterstitial(r2, r4, r5, r10)     // Catch:{ all -> 0x0096 }
        L_0x0094:
            monitor-exit(r9)
            return r0
        L_0x0096:
            r0 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r9.f11047h     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r4.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r9.f10583o     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "failed to init adapter: "
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = r10.mo33867j()     // Catch:{ all -> 0x00c4 }
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "v"
            r4.append(r5)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r2.logException(r3, r4, r0)     // Catch:{ all -> 0x00c4 }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_FAILED     // Catch:{ all -> 0x00c4 }
            r10.mo33859a(r0)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r9)
            return r1
        L_0x00c4:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4450E.m12645g(com.ironsource.mediationsdk.F):com.ironsource.mediationsdk.AbstractAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12646h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f11042c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C4605b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f11357a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f11357a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f11357a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.INITIATED
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r3 = r1.f11357a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.LOAD_PENDING
            if (r3 == r4) goto L_0x0031
            com.ironsource.mediationsdk.b$a r1 = r1.f11357a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE
            if (r1 != r3) goto L_0x0006
        L_0x0031:
            r0 = 0
            goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            if (r0 == 0) goto L_0x0064
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f11047h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.f11042c
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.C4605b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f11357a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.C4605b.C4606a.EXHAUSTED
            if (r3 != r4) goto L_0x0045
            r1.mo33321g()
            goto L_0x0045
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f11047h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4450E.m12646h():void");
    }

    /* renamed from: h */
    private synchronized void m12647h(C4451F f) {
        m12639a(2002, (C4605b) f, (Object[][]) null);
        f.mo33323i();
        if (f.f11358b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = f.f11373q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":loadInterstitial()", 1);
            f.f10595t = new Date().getTime();
            f.f11358b.loadInterstitial(f.f10593r, f);
        }
    }

    /* renamed from: i */
    private AbstractAdapter m12648i() {
        AbstractAdapter abstractAdapter = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f11042c.size() && abstractAdapter == null; i2++) {
            if (((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.AVAILABLE || ((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.INITIATED || ((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.INIT_PENDING || ((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.LOAD_PENDING) {
                i++;
                if (i >= this.f11041b) {
                    break;
                }
            } else if (((C4605b) this.f11042c.get(i2)).f11357a == C4605b.C4606a.NOT_INITIATED && (abstractAdapter = m12645g((C4451F) this.f11042c.get(i2))) == null) {
                ((C4605b) this.f11042c.get(i2)).mo33859a(C4605b.C4606a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    /* renamed from: j */
    private synchronized void m12649j() {
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.AVAILABLE || bVar.f11357a == C4605b.C4606a.LOAD_PENDING || bVar.f11357a == C4605b.C4606a.NOT_AVAILABLE) {
                bVar.mo33859a(C4605b.C4606a.INITIATED);
            }
        }
    }

    /* renamed from: k */
    private void m12650k() {
        for (int i = 0; i < this.f11042c.size(); i++) {
            String providerTypeForReflection = ((C4605b) this.f11042c.get(i)).f11359c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C4616d.m13502a().mo33892a(((C4605b) this.f11042c.get(i)).f11359c, ((C4605b) this.f11042c.get(i)).f11359c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33301a(Context context, boolean z) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f10583o + " Should Track Network State: " + z, 0);
        this.f11048i = z;
    }

    /* renamed from: a */
    public final synchronized void mo33302a(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + " :onInterstitialInitSuccess()", 1);
        m12639a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, (C4605b) f, (Object[][]) null);
        this.f10586r = true;
        if (this.f10584p) {
            if (m12638a(C4605b.C4606a.AVAILABLE, C4605b.C4606a.LOAD_PENDING) < this.f11041b) {
                f.mo33859a(C4605b.C4606a.LOAD_PENDING);
                m12647h(f);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo33303a(C4451F f, long j) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdReady()", 1);
        m12639a(2003, (C4605b) f, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        long time = new Date().getTime() - this.f10591w;
        f.mo33859a(C4605b.C4606a.AVAILABLE);
        this.f10585q = false;
        if (this.f10588t) {
            this.f10588t = false;
            this.f10581m.onInterstitialAdReady();
            m12641a(2004, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(time)}});
        }
    }

    /* renamed from: a */
    public final synchronized void mo33304a(IronSourceError ironSourceError, C4451F f) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            m12639a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, (C4605b) f, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            if (m12638a(C4605b.C4606a.INIT_FAILED) >= this.f11042c.size()) {
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f11047h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NATIVE;
                ironSourceLoggerManager2.log(ironSourceTag2, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
                if (this.f10584p) {
                    this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
                    m12641a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 510}});
                    this.f10588t = false;
                }
                this.f10586r = true;
            } else {
                if (m12648i() == null && this.f10584p) {
                    if (m12638a(C4605b.C4606a.INIT_FAILED, C4605b.C4606a.NOT_AVAILABLE, C4605b.C4606a.CAPPED_PER_SESSION, C4605b.C4606a.CAPPED_PER_DAY, C4605b.C4606a.EXHAUSTED) >= this.f11042c.size()) {
                        this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(509, "No ads to show"));
                        m12641a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 509}});
                        this.f10588t = false;
                    }
                }
                m12646h();
                return;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager3 = this.f11047h;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager3.logException(ironSourceTag3, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + f.mo33867j() + ")", e);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33305a(com.ironsource.mediationsdk.logger.IronSourceError r8, com.ironsource.mediationsdk.C4451F r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r7.f11047h     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r2.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r3 = r9.f11360d     // Catch:{ all -> 0x012c }
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ":onInterstitialAdLoadFailed("
            r2.append(r3)     // Catch:{ all -> 0x012c }
            r2.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x012c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x012c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x012c }
            r0.<init>()     // Catch:{ all -> 0x012c }
            java.lang.String r1 = r9.f11360d     // Catch:{ all -> 0x012c }
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ":onInterstitialAdLoadFailed("
            r0.append(r1)     // Catch:{ all -> 0x012c }
            r0.append(r8)     // Catch:{ all -> 0x012c }
            java.lang.String r1 = ")"
            r0.append(r1)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x012c }
            int r0 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            r1 = 1158(0x486, float:1.623E-42)
            r2 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0074
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r8 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r3] = r8     // Catch:{ all -> 0x012c }
            r7.m12639a((int) r0, (com.ironsource.mediationsdk.C4605b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
            goto L_0x00aa
        L_0x0074:
            r0 = 2200(0x898, float:3.083E-42)
            r1 = 3
            java.lang.Object[][] r1 = new java.lang.Object[r1][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            int r6 = r8.getErrorCode()     // Catch:{ all -> 0x012c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x012c }
            r5[r3] = r6     // Catch:{ all -> 0x012c }
            r1[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "reason"
            r5[r4] = r6     // Catch:{ all -> 0x012c }
            java.lang.String r8 = r8.getErrorMessage()     // Catch:{ all -> 0x012c }
            r5[r3] = r8     // Catch:{ all -> 0x012c }
            r1[r3] = r5     // Catch:{ all -> 0x012c }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r5 = "duration"
            r8[r4] = r5     // Catch:{ all -> 0x012c }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x012c }
            r8[r3] = r10     // Catch:{ all -> 0x012c }
            r1[r2] = r8     // Catch:{ all -> 0x012c }
            r7.m12639a((int) r0, (com.ironsource.mediationsdk.C4605b) r9, (java.lang.Object[][]) r1)     // Catch:{ all -> 0x012c }
        L_0x00aa:
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C4605b.C4606a.NOT_AVAILABLE     // Catch:{ all -> 0x012c }
            r9.mo33859a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a[] r8 = new com.ironsource.mediationsdk.C4605b.C4606a[r2]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C4605b.C4606a.AVAILABLE     // Catch:{ all -> 0x012c }
            r8[r4] = r9     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r9 = com.ironsource.mediationsdk.C4605b.C4606a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r8[r3] = r9     // Catch:{ all -> 0x012c }
            int r8 = r7.m12638a((com.ironsource.mediationsdk.C4605b.C4606a[]) r8)     // Catch:{ all -> 0x012c }
            int r9 = r7.f11041b     // Catch:{ all -> 0x012c }
            if (r8 < r9) goto L_0x00c3
            monitor-exit(r7)
            return
        L_0x00c3:
            java.util.concurrent.CopyOnWriteArrayList r9 = r7.f11042c     // Catch:{ all -> 0x012c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x012c }
        L_0x00c9:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x012c }
            if (r10 == 0) goto L_0x00e7
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b r10 = (com.ironsource.mediationsdk.C4605b) r10     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r11 = r10.f11357a     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C4605b.C4606a.INITIATED     // Catch:{ all -> 0x012c }
            if (r11 != r0) goto L_0x00c9
            com.ironsource.mediationsdk.b$a r8 = com.ironsource.mediationsdk.C4605b.C4606a.LOAD_PENDING     // Catch:{ all -> 0x012c }
            r10.mo33859a(r8)     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.F r10 = (com.ironsource.mediationsdk.C4451F) r10     // Catch:{ all -> 0x012c }
            r7.m12647h(r10)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            return
        L_0x00e7:
            com.ironsource.mediationsdk.AbstractAdapter r9 = r7.m12648i()     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x00ef
            monitor-exit(r7)
            return
        L_0x00ef:
            boolean r9 = r7.f10584p     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x012a
            com.ironsource.mediationsdk.b$a[] r9 = new com.ironsource.mediationsdk.C4605b.C4606a[r3]     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.b$a r10 = com.ironsource.mediationsdk.C4605b.C4606a.INIT_PENDING     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            int r9 = r7.m12638a((com.ironsource.mediationsdk.C4605b.C4606a[]) r9)     // Catch:{ all -> 0x012c }
            int r8 = r8 + r9
            if (r8 != 0) goto L_0x012a
            r7.m12646h()     // Catch:{ all -> 0x012c }
            r7.f10585q = r4     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.p r8 = r7.f10582n     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r9 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x012c }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "No ads to show"
            r0 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r0, r11)     // Catch:{ all -> 0x012c }
            r8.mo34055a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r9, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x012c }
            r8 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r9 = new java.lang.Object[r3][]     // Catch:{ all -> 0x012c }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r11 = "errorCode"
            r10[r4] = r11     // Catch:{ all -> 0x012c }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012c }
            r10[r3] = r11     // Catch:{ all -> 0x012c }
            r9[r4] = r10     // Catch:{ all -> 0x012c }
            r7.m12641a((int) r8, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x012c }
        L_0x012a:
            monitor-exit(r7)
            return
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4450E.mo33305a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.F, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33306a(InterstitialPlacement interstitialPlacement) {
        this.f10587s = interstitialPlacement;
        this.f10581m.f11707e = interstitialPlacement;
    }

    /* renamed from: a */
    public final void mo33307a(String str) {
        if (this.f10584p) {
            this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            this.f10584p = false;
            this.f10585q = false;
        }
    }

    /* renamed from: a */
    public final synchronized void mo33308a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f10583o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        m12641a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f11046g = str;
        this.f11045f = str2;
        Iterator it = this.f11042c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (this.f11040a.mo34179b(bVar)) {
                m12639a((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f11040a.mo34180c(bVar)) {
                bVar.mo33859a(C4605b.C4606a.CAPPED_PER_DAY);
                i++;
            }
        }
        if (i == this.f11042c.size()) {
            this.f10586r = true;
        }
        m12650k();
        for (int i2 = 0; i2 < this.f11041b && m12648i() != null; i2++) {
        }
        m12641a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    public final void mo33309a(List<IronSource.AD_UNIT> list, boolean z, C4652g gVar) {
    }

    /* renamed from: b */
    public final void mo33310b(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdOpened()", 1);
        m12643b(IronSourceConstants.IS_INSTANCE_OPENED, f, (Object[][]) null);
        this.f10581m.onInterstitialAdOpened();
    }

    /* renamed from: b */
    public final void mo33311b(IronSourceError ironSourceError, C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        m12643b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, f, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f10592x = false;
        m12644c((C4605b) f);
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            if (((C4605b) it.next()).f11357a == C4605b.C4606a.AVAILABLE) {
                this.f10584p = true;
                InterstitialPlacement interstitialPlacement = this.f10587s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                mo33314d();
                return;
            }
        }
        this.f10581m.onInterstitialAdShowFailed(ironSourceError);
    }

    /* renamed from: c */
    public final synchronized void mo33312c() {
        try {
            if (this.f10592x) {
                this.f11047h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                C4439B.m12623a().mo33282a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f10587s = null;
            this.f10581m.f11707e = null;
            if (!this.f10585q) {
                if (!this.f10582n.mo34056a(IronSource.AD_UNIT.INTERSTITIAL)) {
                    C4476M.C4481a b = C4476M.m12866a().mo33491b();
                    if (b == C4476M.C4481a.NOT_INIT) {
                        this.f11047h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b == C4476M.C4481a.INIT_IN_PROGRESS) {
                        if (C4476M.m12866a().mo33493c()) {
                            this.f11047h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                            return;
                        }
                        this.f10591w = new Date().getTime();
                        m12641a(2001, (Object[][]) null);
                        this.f10584p = true;
                        this.f10588t = true;
                        return;
                    } else if (b == C4476M.C4481a.INIT_FAILED) {
                        this.f11047h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                        return;
                    } else if (this.f11042c.size() == 0) {
                        this.f11047h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                        return;
                    } else {
                        this.f10591w = new Date().getTime();
                        m12641a(2001, (Object[][]) null);
                        this.f10588t = true;
                        m12649j();
                        if (m12638a(C4605b.C4606a.INITIATED) != 0) {
                            this.f10584p = true;
                            this.f10585q = true;
                            Iterator it = this.f11042c.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                C4605b bVar = (C4605b) it.next();
                                if (bVar.f11357a == C4605b.C4606a.INITIATED) {
                                    bVar.mo33859a(C4605b.C4606a.LOAD_PENDING);
                                    m12647h((C4451F) bVar);
                                    i++;
                                    if (i >= this.f11041b) {
                                        return;
                                    }
                                }
                            }
                            return;
                        } else if (!this.f10586r) {
                            this.f10584p = true;
                            return;
                        } else {
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f11047h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, buildGenericError);
                            m12641a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f10588t = false;
                            return;
                        }
                    }
                }
            }
            this.f11047h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e) {
            e.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e.getMessage());
            this.f11047h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f10588t) {
                this.f10588t = false;
                m12641a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
            }
        }
    }

    /* renamed from: c */
    public final void mo33313c(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdClosed()", 1);
        this.f10592x = false;
        m12643b(IronSourceConstants.IS_INSTANCE_CLOSED, f, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C4731o.m13872a().mo34207b(2))}});
        C4731o.m13872a().mo34205a(2);
        this.f10581m.onInterstitialAdClosed();
    }

    /* renamed from: d */
    public final void mo33314d() {
        if (this.f10592x) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f10581m.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f10584p) {
            this.f11047h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f10581m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (!this.f11048i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            for (int i = 0; i < this.f11042c.size(); i++) {
                C4605b bVar = (C4605b) this.f11042c.get(i);
                if (bVar.f11357a == C4605b.C4606a.AVAILABLE) {
                    C4723k.m13838c((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f10587s);
                    if (C4723k.m13833b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), this.f10587s) != C4723k.C4725a.f11848d) {
                        m12642a((int) IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    m12643b(IronSourceConstants.IS_INSTANCE_SHOW, bVar, (Object[][]) null);
                    this.f10592x = true;
                    C4451F f = (C4451F) bVar;
                    if (f.f11358b != null) {
                        IronSourceLoggerManager ironSourceLoggerManager = f.f11373q;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":showInterstitial()", 1);
                        f.mo33864d();
                        f.f11358b.showInterstitial(f.f10593r, f);
                    }
                    if (bVar.mo33862b()) {
                        m12639a((int) IronSourceConstants.IS_CAP_SESSION, bVar, (Object[][]) null);
                    }
                    this.f11040a.mo34177a(bVar);
                    if (this.f11040a.mo34180c(bVar)) {
                        bVar.mo33859a(C4605b.C4606a.CAPPED_PER_DAY);
                        m12639a((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "true"}});
                    }
                    this.f10584p = false;
                    if (!bVar.mo33863c()) {
                        m12648i();
                        return;
                    }
                    return;
                }
            }
            this.f10581m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial failed - No adapters ready to show"));
        } else {
            this.f11047h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f10581m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError("Interstitial"));
        }
    }

    /* renamed from: d */
    public final void mo33315d(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdShowSucceeded()", 1);
        m12643b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, f, (Object[][]) null);
        Iterator it = this.f11042c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.AVAILABLE) {
                m12644c(bVar);
                z = true;
            }
        }
        if (!z && (f.f11357a == C4605b.C4606a.CAPPED_PER_SESSION || f.f11357a == C4605b.C4606a.EXHAUSTED || f.f11357a == C4605b.C4606a.CAPPED_PER_DAY)) {
            m12646h();
        }
        m12649j();
        this.f10581m.onInterstitialAdShowSucceeded();
    }

    /* renamed from: e */
    public final void mo33316e(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdClicked()", 1);
        m12643b(2006, f, (Object[][]) null);
        this.f10581m.onInterstitialAdClicked();
    }

    /* renamed from: e */
    public final synchronized boolean mo33317e() {
        boolean z;
        if (this.f11048i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            return false;
        }
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.AVAILABLE) {
                C4451F f = (C4451F) bVar;
                if (f.f11358b != null) {
                    IronSourceLoggerManager ironSourceLoggerManager = f.f11373q;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                    ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":isInterstitialReady()", 1);
                    z = f.f11358b.isInterstitialReady(f.f10593r);
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo33318f() {
        if (this.f10584p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial");
            this.f10582n.mo34055a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.f10584p = false;
            this.f10585q = false;
            if (this.f10588t) {
                m12642a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f10588t = false;
            }
        }
    }

    /* renamed from: f */
    public final void mo33319f(C4451F f) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f11047h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, f.f11360d + ":onInterstitialAdVisible()", 1);
    }

    /* renamed from: g */
    public final void mo33320g() {
        Iterator it = this.f11042c.iterator();
        while (it.hasNext()) {
            C4605b bVar = (C4605b) it.next();
            if (bVar.f11357a == C4605b.C4606a.CAPPED_PER_DAY) {
                m12639a((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, bVar, new Object[][]{new Object[]{"status", "false"}});
                bVar.mo33859a(bVar.mo33862b() ? C4605b.C4606a.CAPPED_PER_SESSION : bVar.mo33861a() ? C4605b.C4606a.EXHAUSTED : C4605b.C4606a.INITIATED);
            }
        }
    }
}
