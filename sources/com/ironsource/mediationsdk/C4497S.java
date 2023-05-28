package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.C4626i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4653h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.S */
final class C4497S extends C4663n implements C4501T, C4623g, C4740y {

    /* renamed from: c */
    C4729n f10899c;

    /* renamed from: d */
    final ConcurrentHashMap<String, C4502U> f10900d;

    /* renamed from: e */
    String f10901e;

    /* renamed from: f */
    JSONObject f10902f;

    /* renamed from: g */
    C4624h f10903g;

    /* renamed from: h */
    C4626i f10904h;

    /* renamed from: i */
    long f10905i;

    /* renamed from: j */
    long f10906j;

    /* renamed from: k */
    private C4500a f10907k;

    /* renamed from: l */
    private CopyOnWriteArrayList<C4502U> f10908l;

    /* renamed from: m */
    private ConcurrentHashMap<String, C4707b> f10909m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C4626i.C4627a> f10910n;

    /* renamed from: o */
    private C4707b f10911o;

    /* renamed from: p */
    private String f10912p;

    /* renamed from: q */
    private int f10913q;

    /* renamed from: r */
    private boolean f10914r;

    /* renamed from: s */
    private boolean f10915s;

    /* renamed from: t */
    private long f10916t;

    /* renamed from: u */
    private int f10917u;

    /* renamed from: v */
    private String f10918v = "";

    /* renamed from: w */
    private boolean f10919w = false;

    /* renamed from: com.ironsource.mediationsdk.S$a */
    enum C4500a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4497S(List<NetworkSettings> list, C4653h hVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C4653h hVar2 = hVar;
        long time = new Date().getTime();
        m12954a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        mo33557a(C4500a.STATE_NOT_INITIALIZED);
        this.f10900d = new ConcurrentHashMap<>();
        this.f10908l = new CopyOnWriteArrayList<>();
        this.f10909m = new ConcurrentHashMap<>();
        this.f10910n = new ConcurrentHashMap<>();
        this.f10912p = "";
        this.f10901e = "";
        this.f10902f = null;
        this.f10913q = hVar2.f11617c;
        this.f10914r = hVar2.f11618d;
        C4665p.m13650a().mo34054a(IronSource.AD_UNIT.INTERSTITIAL, i);
        C4714c cVar = hVar2.f11623i;
        this.f10906j = cVar.f11781i;
        boolean z = cVar.f11777e > 0;
        this.f10915s = z;
        if (z) {
            this.f10903g = new C4624h("interstitial", cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C4616d.m13502a().mo33892a(next, next.getInterstitialSettings(), false, false);
            if (a != null) {
                C4618e a2 = C4618e.m13521a();
                if (a2.mo33900a(a, a2.f11412a, "interstitial")) {
                    C4502U u = r0;
                    C4502U u2 = new C4502U(str, str2, next, this, hVar2.f11619e, a);
                    String k = u.mo33612k();
                    this.f10900d.put(k, u);
                    arrayList.add(k);
                }
            }
        }
        this.f10904h = new C4626i(arrayList, cVar.f11778f);
        this.f10899c = new C4729n(new ArrayList(this.f10900d.values()));
        for (C4502U next2 : this.f10900d.values()) {
            if (next2.mo33609h()) {
                next2.mo33576b();
            }
        }
        this.f10905i = new Date().getTime();
        mo33557a(C4500a.STATE_READY_TO_LOAD);
        m12958a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    private String m12953a(C4707b bVar) {
        C4502U u = this.f10900d.get(bVar.mo34157a());
        String num = u != null ? Integer.toString(u.mo33610i()) : TextUtils.isEmpty(bVar.mo34158b()) ? "1" : "2";
        return num + bVar.mo34157a();
    }

    /* renamed from: a */
    private void m12954a(int i) {
        m12959a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m12955a(int i, C4502U u) {
        m12957a(i, u, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m12956a(int i, C4502U u, Object[][] objArr) {
        m12957a(i, u, objArr, false);
    }

    /* renamed from: a */
    private void m12957a(int i, C4502U u, Object[][] objArr, boolean z) {
        Map<String, Object> n = u.mo33615n();
        if (!TextUtils.isEmpty(this.f10901e)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10901e);
        }
        JSONObject jSONObject = this.f10902f;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10902f);
        }
        if (z && !TextUtils.isEmpty(this.f10912p)) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10912p);
        }
        if (m12969c(i)) {
            C4533d.m13173e();
            C4533d.m13131a(n, this.f10917u, this.f10918v);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    private void m12958a(int i, Object[][] objArr) {
        m12959a(i, objArr, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12959a(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f10901e)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10901e);
        }
        JSONObject jSONObject = this.f10902f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10902f);
        }
        if (z && !TextUtils.isEmpty(this.f10912p)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10912p);
        }
        if (m12969c(i)) {
            C4533d.m13173e();
            C4533d.m13131a((Map<String, Object>) hashMap, this.f10917u, this.f10918v);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                m12967b("sendMediationEvent " + e.getMessage());
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private static void m12961a(C4502U u, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + u.mo33612k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m12962a(List<C4707b> list) {
        this.f10908l.clear();
        this.f10909m.clear();
        this.f10910n.clear();
        StringBuilder sb = new StringBuilder();
        for (C4707b next : list) {
            sb.append(m12953a(next) + ",");
            C4502U u = this.f10900d.get(next.mo34157a());
            if (u != null) {
                u.f11017e = true;
                this.f10908l.add(u);
                this.f10909m.put(u.mo33612k(), next);
                this.f10910n.put(next.mo34157a(), C4626i.C4627a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m12967b("updateWaterfall() - could not find matching smash for auction response item " + next.mo34157a());
            }
        }
        m12967b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m12967b("Updated waterfall is empty");
        }
        m12958a((int) IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    /* renamed from: b */
    private void m12963b(int i) {
        m12959a(i, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m12964b(int i, C4502U u) {
        m12957a(i, u, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m12965b(int i, C4502U u, Object[][] objArr) {
        m12957a(i, u, objArr, true);
    }

    /* renamed from: b */
    private void m12966b(int i, Object[][] objArr) {
        m12959a((int) IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    /* renamed from: b */
    static void m12967b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    /* renamed from: c */
    private static void m12968c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m12969c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300 || i == 2303;
    }

    /* renamed from: f */
    private void m12970f() {
        List<C4707b> g = m12971g();
        this.f10901e = m13642c();
        m12962a(g);
    }

    /* renamed from: g */
    private List<C4707b> m12971g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C4502U next : this.f10900d.values()) {
            if (!next.mo33609h() && !this.f10899c.mo34204b(next)) {
                copyOnWriteArrayList.add(new C4707b(next.mo33612k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: g */
    private void m12972g(C4502U u) {
        String b = this.f10909m.get(u.mo33612k()).mo34158b();
        u.mo33608b(b);
        m12955a(2002, u);
        u.mo33575a(b);
    }

    /* renamed from: h */
    private void m12973h() {
        if (this.f10908l.isEmpty()) {
            mo33557a(C4500a.STATE_READY_TO_LOAD);
            m12959a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C4665p.m13650a().mo34055a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        mo33557a(C4500a.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f10908l.size() && i < this.f10913q; i2++) {
            C4502U u = this.f10908l.get(i2);
            if (u.f11017e) {
                if (!this.f10914r || !u.mo33609h()) {
                    m12972g(u);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + u.mo33612k() + ". No other instances will be loaded at the same time.";
                    m12967b(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m12972g(u);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + u.mo33612k() + " as a non bidder is being loaded";
                    m12967b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33556a() {
        mo33557a(C4500a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() {
            public final void run() {
                StringBuilder sb;
                C4497S.this.f10901e = "";
                C4497S.this.f10902f = null;
                StringBuilder sb2 = new StringBuilder();
                long time = C4497S.this.f10906j - (new Date().getTime() - C4497S.this.f10905i);
                if (time > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("delaying auction by " + time);
                    C4401c cVar = C4401c.f10496a;
                    C4401c.m12518b(new Runnable() {
                        public final void run() {
                            C4497S.this.mo33556a();
                        }
                    }, time);
                    return;
                }
                C4497S.this.m12959a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (C4502U next : C4497S.this.f10900d.values()) {
                    if (!C4497S.this.f10899c.mo34204b(next)) {
                        if (next.mo33609h()) {
                            Map<String, Object> a = next.mo33456a();
                            if (a != null) {
                                hashMap.put(next.mo33612k(), a);
                                sb = new StringBuilder();
                            }
                        } else {
                            arrayList.add(next.mo33612k());
                            sb = new StringBuilder();
                        }
                        sb.append(next.mo33610i());
                        sb.append(next.mo33612k());
                        sb.append(",");
                        sb2.append(sb.toString());
                    }
                }
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    C4497S.this.m12959a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}, false);
                    C4497S.m12967b("makeAuction() failed - No candidates available for auctioning");
                    C4665p.m13650a().mo34055a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    C4497S.this.m12959a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    C4497S.this.mo33557a(C4500a.STATE_READY_TO_LOAD);
                    return;
                }
                C4497S.this.m12959a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = C4731o.m13872a().mo34207b(2);
                if (C4497S.this.f10903g != null) {
                    C4497S.this.f10903g.mo33907a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C4497S.this.f10904h, b, C4497S.this.f11673b);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo33383a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m12967b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f10917u = i2;
        this.f10918v = str2;
        this.f10902f = null;
        m12970f();
        if (TextUtils.isEmpty(str)) {
            m12958a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            m12958a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        m12973h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33557a(C4500a aVar) {
        this.f10907k = aVar;
        m12967b("state=" + aVar);
    }

    /* renamed from: a */
    public final void mo33558a(C4502U u) {
        synchronized (this) {
            m12961a(u, "onInterstitialAdOpened");
            C4439B.m12623a().mo33286c();
            m12964b((int) IronSourceConstants.IS_INSTANCE_OPENED, u);
            if (this.f10915s) {
                C4707b bVar = this.f10909m.get(u.mo33612k());
                if (bVar != null) {
                    C4624h.m13548a(bVar, u.mo33610i(), this.f10911o, this.f10912p);
                    this.f10910n.put(u.mo33612k(), C4626i.C4627a.ISAuctionPerformanceShowedSuccessfully);
                    mo34047a(bVar, this.f10912p);
                } else {
                    String k = u.mo33612k();
                    m12967b("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)};
                    m12958a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f10907k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo33559a(C4502U u, long j) {
        C4502U u2 = u;
        synchronized (this) {
            m12961a(u2, "onInterstitialAdReady");
            m12956a(2003, u2, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            if (this.f10910n.containsKey(u.mo33612k())) {
                this.f10910n.put(u.mo33612k(), C4626i.C4627a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f10907k == C4500a.STATE_LOADING_SMASHES) {
                mo33557a(C4500a.STATE_READY_TO_SHOW);
                C4439B.m12623a().mo33284b();
                m12958a(2004, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - this.f10916t)}});
                if (this.f10915s) {
                    C4707b bVar = this.f10909m.get(u.mo33612k());
                    if (bVar != null) {
                        C4624h.m13547a(bVar, u.mo33610i(), this.f10911o);
                        this.f10903g.mo33908a((CopyOnWriteArrayList<C4514Y>) this.f10908l, this.f10909m, u.mo33610i(), this.f10911o, bVar);
                    } else {
                        String k = u.mo33612k();
                        m12967b("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        m12958a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo33560a(IronSourceError ironSourceError, C4502U u) {
        synchronized (this) {
            m12961a(u, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C4439B.m12623a().mo33285b(ironSourceError);
            m12965b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f10910n.put(u.mo33612k(), C4626i.C4627a.ISAuctionPerformanceFailedToShow);
            mo33557a(C4500a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.mo33612k() + " as " + r9;
        m12967b(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33561a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.C4502U r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.S$a r2 = r8.f10907k     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b9 }
            r1.append(r2)     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b9 }
            m12961a((com.ironsource.mediationsdk.C4502U) r10, (java.lang.String) r1)     // Catch:{ all -> 0x01b9 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r5] = r9     // Catch:{ all -> 0x01b9 }
            r8.m12956a((int) r1, (com.ironsource.mediationsdk.C4502U) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b9 }
            r6[r5] = r7     // Catch:{ all -> 0x01b9 }
            r2[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b9 }
            r6[r5] = r9     // Catch:{ all -> 0x01b9 }
            r2[r5] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b9 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b9 }
            r9[r5] = r11     // Catch:{ all -> 0x01b9 }
            r2[r3] = r9     // Catch:{ all -> 0x01b9 }
            r8.m12956a((int) r1, (com.ironsource.mediationsdk.C4502U) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b9 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f10910n     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo33612k()     // Catch:{ all -> 0x01b9 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r9 = r8.f10910n     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = r10.mo33612k()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.i$a r12 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b9 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b9 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r9 = r8.f10908l     // Catch:{ all -> 0x01b9 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b9 }
            r11 = 0
            r12 = 0
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U r1 = (com.ironsource.mediationsdk.C4502U) r1     // Catch:{ all -> 0x01b9 }
            boolean r2 = r1.f11017e     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f10914r     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.mo33609h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = r1.mo33612k()     // Catch:{ all -> 0x01b9 }
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b9 }
            m12967b((java.lang.String) r2)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = r1.mo33612k()     // Catch:{ all -> 0x01b9 }
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b9 }
            r10.append(r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b9 }
            m12967b((java.lang.String) r9)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b9 }
            goto L_0x0152
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b9 }
            boolean r2 = r8.f10914r     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r10.mo33609h()     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x0152
            boolean r1 = r1.mo33609h()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x0152
            int r1 = r0.size()     // Catch:{ all -> 0x01b9 }
            int r2 = r8.f10913q     // Catch:{ all -> 0x01b9 }
            if (r1 >= r2) goto L_0x0152
            goto L_0x0146
        L_0x0134:
            com.ironsource.mediationsdk.U$a r2 = r1.f10929a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U$a r6 = com.ironsource.mediationsdk.C4502U.C4504a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 == r6) goto L_0x0143
            com.ironsource.mediationsdk.U$a r2 = r1.f10929a     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.U$a r6 = com.ironsource.mediationsdk.C4502U.C4504a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b9 }
            if (r2 != r6) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r2 = 0
            goto L_0x0144
        L_0x0143:
            r2 = 1
        L_0x0144:
            if (r2 == 0) goto L_0x0149
        L_0x0146:
            r11 = 1
            goto L_0x00b3
        L_0x0149:
            boolean r1 = r1.mo33579g()     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x00b3
            r12 = 1
            goto L_0x00b3
        L_0x0152:
            int r9 = r0.size()     // Catch:{ all -> 0x01b9 }
            if (r9 != 0) goto L_0x018c
            com.ironsource.mediationsdk.S$a r9 = r8.f10907k     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.S$a r10 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b9 }
            if (r9 != r10) goto L_0x018c
            if (r11 != 0) goto L_0x018c
            com.ironsource.mediationsdk.p r9 = com.ironsource.mediationsdk.C4665p.m13650a()     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "No ads to show"
            r1 = 509(0x1fd, float:7.13E-43)
            r11.<init>(r1, r12)     // Catch:{ all -> 0x01b9 }
            r9.mo34055a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r10, (com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x01b9 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = "errorCode"
            r11[r4] = r12     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01b9 }
            r11[r5] = r12     // Catch:{ all -> 0x01b9 }
            r10[r4] = r11     // Catch:{ all -> 0x01b9 }
            r8.m12958a((int) r9, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.S$a r9 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b9 }
            r8.mo33557a((com.ironsource.mediationsdk.C4497S.C4500a) r9)     // Catch:{ all -> 0x01b9 }
        L_0x018c:
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.U r10 = (com.ironsource.mediationsdk.C4502U) r10
            r8.m12972g(r10)
            goto L_0x01a8
        L_0x01b8:
            return
        L_0x01b9:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b9 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4497S.mo33561a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.U, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33562a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.S$a r0 = r8.f10907k     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.S$a r1 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_SHOWING     // Catch:{ all -> 0x01db }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x003e
            java.lang.String r9 = "showInterstitial error: can't show ad while an ad is already showing"
            m12968c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.B r6 = com.ironsource.mediationsdk.C4439B.m12623a()     // Catch:{ all -> 0x01db }
            r6.mo33285b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m12959a((int) r2, (java.lang.Object[][]) r0, (boolean) r5)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x003e:
            com.ironsource.mediationsdk.S$a r0 = r8.f10907k     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.S$a r1 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01db }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x008d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "showInterstitial() error state="
            r9.<init>(r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.S$a r0 = r8.f10907k     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01db }
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01db }
            m12967b((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = "showInterstitial error: show called while no ads are available"
            m12968c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r0.<init>(r6, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.B r1 = com.ironsource.mediationsdk.C4439B.m12623a()     // Catch:{ all -> 0x01db }
            r1.mo33285b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01db }
            r1[r3] = r6     // Catch:{ all -> 0x01db }
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m12958a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x008d:
            if (r9 != 0) goto L_0x00c1
            java.lang.String r9 = "showInterstitial error: empty default placement"
            m12968c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.B r6 = com.ironsource.mediationsdk.C4439B.m12623a()     // Catch:{ all -> 0x01db }
            r6.mo33285b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m12958a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x00c1:
            r8.f10912p = r9     // Catch:{ all -> 0x01db }
            r9 = 2100(0x834, float:2.943E-42)
            r8.m12963b((int) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r8.f10912p     // Catch:{ all -> 0x01db }
            boolean r9 = com.ironsource.mediationsdk.utils.C4723k.m13831a((android.content.Context) r9, (java.lang.String) r0)     // Catch:{ all -> 0x01db }
            if (r9 == 0) goto L_0x011d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "placement "
            r9.<init>(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r8.f10912p     // Catch:{ all -> 0x01db }
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " is capped"
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01db }
            m12968c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.B r6 = com.ironsource.mediationsdk.C4439B.m12623a()     // Catch:{ all -> 0x01db }
            r6.mo33285b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m12966b((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x011d:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r9 = r8.f10908l     // Catch:{ all -> 0x01db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01db }
        L_0x0123:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.U r0 = (com.ironsource.mediationsdk.C4502U) r0     // Catch:{ all -> 0x01db }
            boolean r1 = r0.mo33579g()     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x0191
            java.lang.String r9 = r8.f10912p     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.S$a r1 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_SHOWING     // Catch:{ all -> 0x01db }
            r8.mo33557a((com.ironsource.mediationsdk.C4497S.C4500a) r1)     // Catch:{ all -> 0x01db }
            r0.mo33577c()     // Catch:{ all -> 0x01db }
            r1 = 2201(0x899, float:3.084E-42)
            r8.m12964b((int) r1, (com.ironsource.mediationsdk.C4502U) r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.n r1 = r8.f10899c     // Catch:{ all -> 0x01db }
            r1.mo34202a(r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.n r1 = r8.f10899c     // Catch:{ all -> 0x01db }
            boolean r1 = r1.mo34204b(r0)     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x0171
            r0.mo33578f()     // Catch:{ all -> 0x01db }
            r1 = 2401(0x961, float:3.365E-42)
            r8.m12955a((int) r1, (com.ironsource.mediationsdk.C4502U) r0)     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            r1.<init>()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.mo33612k()     // Catch:{ all -> 0x01db }
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " was session capped"
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01db }
        L_0x0171:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.C4723k.m13841d(r0, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01db }
            boolean r9 = com.ironsource.mediationsdk.utils.C4723k.m13831a((android.content.Context) r0, (java.lang.String) r9)     // Catch:{ all -> 0x01db }
            if (r9 == 0) goto L_0x018f
            r9 = 2400(0x960, float:3.363E-42)
            r8.m12963b((int) r9)     // Catch:{ all -> 0x01db }
        L_0x018f:
            monitor-exit(r8)
            return
        L_0x0191:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "showInterstitial "
            r1.<init>(r7)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.mo33612k()     // Catch:{ all -> 0x01db }
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " isReadyToShow() == false"
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01db }
            m12967b((java.lang.String) r0)     // Catch:{ all -> 0x01db }
            goto L_0x0123
        L_0x01ad:
            com.ironsource.mediationsdk.B r9 = com.ironsource.mediationsdk.C4439B.m12623a()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01db }
            r9.mo33285b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r9 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r9[r5] = r0     // Catch:{ all -> 0x01db }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r9[r3] = r0     // Catch:{ all -> 0x01db }
            r8.m12966b((int) r2, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x01db:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4497S.mo33562a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo33391a(List<C4707b> list, String str, C4707b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        this.f10901e = str;
        this.f10911o = bVar;
        this.f10902f = jSONObject;
        this.f10917u = i;
        this.f10918v = "";
        if (!TextUtils.isEmpty(str2)) {
            m12959a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        mo34048a(jSONObject2, IronSource.AD_UNIT.INTERSTITIAL);
        if (this.f11672a.mo34172a(IronSource.AD_UNIT.INTERSTITIAL)) {
            m12959a((int) IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}, false);
            mo33557a(C4500a.STATE_READY_TO_LOAD);
            C4665p.m13650a().mo34055a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        m12959a((int) IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}, false);
        m12962a(list);
        m12973h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33563a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.f10919w = z;
    }

    /* renamed from: b */
    public final void mo33564b(C4502U u) {
        synchronized (this) {
            m12961a(u, "onInterstitialAdClosed");
            m12965b(IronSourceConstants.IS_INSTANCE_CLOSED, u, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C4731o.m13872a().mo34207b(2))}});
            C4731o.m13872a().mo34205a(2);
            C4439B.m12623a().mo33287d();
            mo33557a(C4500a.STATE_READY_TO_LOAD);
        }
    }

    /* renamed from: b */
    public final void mo33565b(IronSourceError ironSourceError, C4502U u) {
        m12956a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, u, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    /* renamed from: c */
    public final void mo33566c(C4502U u) {
        m12961a(u, "onInterstitialAdShowSucceeded");
        C4439B.m12623a().mo33288e();
        m12964b((int) IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, u);
    }

    /* renamed from: d */
    public final synchronized void mo33567d() {
        if (this.f10907k == C4500a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C4439B.m12623a().mo33282a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.f10907k == C4500a.STATE_READY_TO_LOAD || this.f10907k == C4500a.STATE_READY_TO_SHOW) && !C4665p.m13650a().mo34056a(IronSource.AD_UNIT.INTERSTITIAL)) {
            this.f10901e = "";
            this.f10912p = "";
            this.f10902f = null;
            mo34044a(IronSource.AD_UNIT.INTERSTITIAL);
            m12959a(2001, (Object[][]) null, false);
            this.f10916t = new Date().getTime();
            if (this.f10915s) {
                if (!this.f10910n.isEmpty()) {
                    this.f10904h.mo33911a(this.f10910n);
                    this.f10910n.clear();
                }
                mo33556a();
                return;
            }
            m12970f();
            m12973h();
        } else {
            m12967b("loadInterstitial: load is already in progress");
        }
    }

    /* renamed from: d */
    public final void mo33568d(C4502U u) {
        m12961a(u, "onInterstitialAdClicked");
        C4439B.m12623a().mo33289f();
        m12964b(2006, u);
    }

    /* renamed from: e */
    public final void mo33569e(C4502U u) {
        m12961a(u, "onInterstitialAdVisible");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33570e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10919w     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.S$a r0 = r3.f10907k     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.S$a r2 = com.ironsource.mediationsdk.C4497S.C4500a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.U> r0 = r3.f10908l     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.U r2 = (com.ironsource.mediationsdk.C4502U) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.mo33579g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4497S.mo33570e():boolean");
    }

    /* renamed from: f */
    public final void mo33571f(C4502U u) {
        m12955a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, u);
    }
}
