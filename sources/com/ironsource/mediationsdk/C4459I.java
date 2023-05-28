package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C4377a;
import com.ironsource.environment.C4411j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C4470J;
import com.ironsource.mediationsdk.C4626i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4661o;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4714c;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.I */
final class C4459I extends C4663n implements C4411j, C4473K, C4598ae, C4613c, C4623g, C4741z {

    /* renamed from: A */
    private Boolean f10672A;

    /* renamed from: B */
    private C4738x f10673B;

    /* renamed from: c */
    C4474L f10674c;

    /* renamed from: d */
    C4626i f10675d;

    /* renamed from: e */
    C4624h f10676e;

    /* renamed from: f */
    long f10677f;

    /* renamed from: g */
    final ConcurrentHashMap<String, C4470J> f10678g;

    /* renamed from: h */
    C4729n f10679h;

    /* renamed from: i */
    int f10680i = 1;

    /* renamed from: j */
    C4462a f10681j;

    /* renamed from: k */
    final Object f10682k = new Object();

    /* renamed from: l */
    private ConcurrentHashMap<String, C4707b> f10683l;

    /* renamed from: m */
    private ConcurrentHashMap<String, C4626i.C4627a> f10684m;

    /* renamed from: n */
    private C4707b f10685n;

    /* renamed from: o */
    private JSONObject f10686o;

    /* renamed from: p */
    private C4555ad f10687p;

    /* renamed from: q */
    private boolean f10688q;

    /* renamed from: r */
    private String f10689r = "";

    /* renamed from: s */
    private int f10690s;

    /* renamed from: t */
    private NetworkStateReceiver f10691t;

    /* renamed from: u */
    private boolean f10692u = false;

    /* renamed from: v */
    private String f10693v;

    /* renamed from: w */
    private int f10694w;

    /* renamed from: x */
    private boolean f10695x;

    /* renamed from: y */
    private boolean f10696y;

    /* renamed from: z */
    private long f10697z;

    /* renamed from: com.ironsource.mediationsdk.I$a */
    enum C4462a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4459I(List<NetworkSettings> list, C4661o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C4661o oVar2 = oVar;
        long time = new Date().getTime();
        mo33382a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo33386a(C4462a.RV_STATE_INITIATING);
        this.f10672A = null;
        this.f10694w = oVar2.f11659c;
        this.f10695x = oVar2.f11660d;
        this.f10693v = "";
        this.f10686o = null;
        C4714c cVar = oVar2.f11668l;
        this.f10696y = false;
        this.f10674c = new C4474L(oVar2.f11668l.f11787o, oVar2.f11668l.f11779g);
        this.f10683l = new ConcurrentHashMap<>();
        this.f10684m = new ConcurrentHashMap<>();
        this.f10697z = new Date().getTime();
        boolean z = cVar.f11777e > 0;
        this.f10688q = z;
        if (z) {
            this.f10676e = new C4624h("rewardedVideo", cVar, this);
        }
        this.f10687p = new C4555ad(cVar, this);
        this.f10678g = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C4616d.m13502a().mo33892a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C4470J j = r0;
                C4470J j2 = new C4470J(str, str2, next, this, oVar2.f11661e, a, this.f10680i);
                String k = j.mo33612k();
                this.f10678g.put(k, j);
                arrayList.add(k);
            }
        }
        this.f10675d = new C4626i(arrayList, cVar.f11778f);
        this.f10679h = new C4729n(new ArrayList(this.f10678g.values()));
        mo33384a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.f10673B = new C4738x(oVar2.f11665i, this);
        m12772a(cVar.f11781i);
    }

    /* renamed from: a */
    private String m12770a(C4707b bVar) {
        C4470J j = this.f10678g.get(bVar.mo34157a());
        String num = j != null ? Integer.toString(j.mo33610i()) : TextUtils.isEmpty(bVar.mo34158b()) ? "1" : "2";
        return num + bVar.mo34157a();
    }

    /* renamed from: a */
    private void m12771a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f10674c.f10768b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10674c.f10768b);
        }
        JSONObject jSONObject = this.f10686o;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10686o);
        }
        if (z && !TextUtils.isEmpty(this.f10693v)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10693v);
        }
        if (m12778b(i)) {
            C4537h.m13193e();
            C4537h.m13131a((Map<String, Object>) hashMap, this.f10690s, this.f10689r);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f10680i));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m12772a(long j) {
        if (this.f10679h.mo34203a()) {
            m12774a("all smashes are capped");
            mo33393b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo33400e();
            return;
        }
        mo34044a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f10688q) {
            if (!this.f10684m.isEmpty()) {
                this.f10675d.mo33911a(this.f10684m);
                this.f10684m.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C4459I i = C4459I.this;
                    synchronized (i.f10682k) {
                        if (i.f10681j != C4462a.RV_STATE_AUCTION_IN_PROGRESS) {
                            i.mo33386a(C4462a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() {
                                public final void run() {
                                    StringBuilder sb;
                                    C4459I.m12774a("makeAuction()");
                                    C4459I.this.f10677f = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (C4470J next : C4459I.this.f10678g.values()) {
                                        if (!C4459I.this.f10679h.mo34204b(next) && C4459I.this.f10674c.mo33484b(next)) {
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
                                    if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                        C4459I.this.mo33393b((int) IronSourceConstants.RV_AUCTION_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                                        C4459I.m12774a("makeAuction() failed - No candidates available for auctioning");
                                        C4459I.this.mo33400e();
                                        return;
                                    }
                                    C4459I.m12774a("makeAuction() - request waterfall is: " + sb2);
                                    C4459I.this.mo33382a(1000);
                                    C4459I.this.mo33382a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                                    C4459I.this.mo33384a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    C4459I.this.f10676e.mo33907a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C4459I.this.f10675d, C4459I.this.f10680i, C4459I.this.f11673b);
                                }
                            });
                        }
                    }
                }
            }, j);
            return;
        }
        m12774a("auction fallback flow starting");
        m12782f();
        if (this.f10674c.mo33480a().isEmpty()) {
            m12774a("loadSmashes -  waterfall is empty");
            mo33393b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo33400e();
            return;
        }
        mo33382a(1000);
        m12785h();
    }

    /* renamed from: a */
    private static void m12773a(C4470J j, String str) {
        String str2 = j.mo33612k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: a */
    static void m12774a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m12775a(List<C4707b> list, String str, JSONObject jSONObject) {
        this.f10683l.clear();
        this.f10684m.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (C4707b next : list) {
            sb.append(m12770a(next) + ",");
            C4470J j = this.f10678g.get(next.mo34157a());
            if (j != null) {
                AbstractAdapter a = C4616d.m13502a().mo33891a(j.f11016d.f11591a);
                if (a != null) {
                    C4470J j2 = new C4470J(j, this, a, this.f10680i, str, jSONObject, this.f10690s, this.f10689r);
                    j2.f11017e = true;
                    copyOnWriteArrayList.add(j2);
                    this.f10683l.put(j2.mo33612k(), next);
                    this.f10684m.put(next.mo34157a(), C4626i.C4627a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m12774a("updateWaterfall() - could not find matching smash for auction response item " + next.mo34157a());
            }
        }
        this.f10674c.mo33482a(copyOnWriteArrayList, str);
        if (this.f10674c.mo33483b()) {
            mo33393b((int) IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f10674c.f10767a.size()}}));
        }
        m12774a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m12774a("Updated waterfall is empty");
        }
        mo33393b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m12776a(boolean z, Map<String, Object> map) {
        synchronized (this.f10682k) {
            if (this.f10672A == null || this.f10672A.booleanValue() != z) {
                this.f10672A = Boolean.valueOf(z);
                long time = new Date().getTime() - this.f10697z;
                this.f10697z = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
                mo33393b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                C4540aa.m13201a().mo33677a(z);
            }
        }
    }

    /* renamed from: b */
    private static void m12777b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private static boolean m12778b(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: c */
    private void m12779c(int i) {
        m12771a(i, (Map<String, Object>) null, true, true);
    }

    /* renamed from: c */
    private void m12780c(int i, Map<String, Object> map) {
        m12771a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m12781c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: f */
    private void m12782f() {
        List<C4707b> g = m12783g();
        m12775a(g, "fallback_" + System.currentTimeMillis(), this.f10686o);
    }

    /* renamed from: g */
    private List<C4707b> m12783g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C4470J next : this.f10678g.values()) {
            if (!next.mo33609h() && !this.f10679h.mo34204b(next) && this.f10674c.mo33484b(next)) {
                copyOnWriteArrayList.add(new C4707b(next.mo33612k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: g */
    private void m12784g(C4470J j) {
        String b = this.f10683l.get(j.mo33612k()).mo34158b();
        j.mo33608b(b);
        j.mo33459a(b);
    }

    /* renamed from: h */
    private void m12785h() {
        if (this.f10674c.mo33480a().isEmpty()) {
            m12774a("loadSmashes -  waterfall is empty");
            mo33393b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo33400e();
            return;
        }
        mo33386a(C4462a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f10674c.mo33480a().size() && i < this.f10694w; i2++) {
            C4470J j = this.f10674c.mo33480a().get(i2);
            if (j.f11017e) {
                if (!this.f10695x || !j.mo33609h()) {
                    m12784g(j);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + j.mo33612k() + ". No other instances will be loaded at the same time.";
                    m12774a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m12784g(j);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + j.mo33612k() + " as a non bidder is being loaded";
                    m12774a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33382a(int i) {
        m12771a(i, (Map<String, Object>) null, false, false);
    }

    /* renamed from: a */
    public final void mo33383a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m12774a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f10690s = i2;
        this.f10689r = str2;
        this.f10686o = null;
        m12782f();
        if (TextUtils.isEmpty(str)) {
            map = C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            map = C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        mo33393b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        m12785h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33384a(int i, Map<String, Object> map) {
        m12771a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo33385a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f10692u = z;
            if (z) {
                if (this.f10691t == null) {
                    this.f10691t = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f10691t, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f10691t != null) {
                context.getApplicationContext().unregisterReceiver(this.f10691t);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33386a(C4462a aVar) {
        m12774a("current state=" + this.f10681j + ", new state=" + aVar);
        this.f10681j = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x010f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33387a(com.ironsource.mediationsdk.C4470J r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f10682k
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r2 = r12.f10681j     // Catch:{ all -> 0x0161 }
            r1.append(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0161 }
            m12773a((com.ironsource.mediationsdk.C4470J) r13, (java.lang.String) r1)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = r13.f10744b     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.L r2 = r12.f10674c     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r2.f10768b     // Catch:{ all -> 0x0161 }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x0110
            com.ironsource.mediationsdk.I$a r1 = r12.f10681j     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0161 }
            if (r1 != r2) goto L_0x0029
            goto L_0x0110
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r12.f10684m     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r13.mo33612k()     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0161 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r1 = r12.f10681j     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0161 }
            if (r1 != r2) goto L_0x010e
            r1 = 0
            r12.m12776a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r1 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0161 }
            r12.mo33386a((com.ironsource.mediationsdk.C4459I.C4462a) r1)     // Catch:{ all -> 0x0161 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0161 }
            r1.<init>()     // Catch:{ all -> 0x0161 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0161 }
            long r6 = r12.f10677f     // Catch:{ all -> 0x0161 }
            long r1 = r1 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r5][]     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r9 = "duration"
            r8[r3] = r9     // Catch:{ all -> 0x0161 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0161 }
            r8[r5] = r1     // Catch:{ all -> 0x0161 }
            r7[r3] = r8     // Catch:{ all -> 0x0161 }
            java.util.Map r1 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0161 }
            r12.mo33393b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.x r1 = r12.f10673B     // Catch:{ all -> 0x0161 }
            r6 = 0
            r1.mo34227a(r6)     // Catch:{ all -> 0x0161 }
            boolean r1 = r12.f10688q     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x010e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r1 = r12.f10683l     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r13.mo33612k()     // Catch:{ all -> 0x0161 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0161 }
            r11 = r1
            com.ironsource.mediationsdk.server.b r11 = (com.ironsource.mediationsdk.server.C4707b) r11     // Catch:{ all -> 0x0161 }
            if (r11 == 0) goto L_0x00a2
            int r1 = r13.mo33610i()     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.server.b r2 = r12.f10685n     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.C4624h.m13547a(r11, r1, r2)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.h r6 = r12.f10676e     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.L r1 = r12.f10674c     // Catch:{ all -> 0x0161 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.mo33480a()     // Catch:{ all -> 0x0161 }
            r7 = r1
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ all -> 0x0161 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r12.f10683l     // Catch:{ all -> 0x0161 }
            int r9 = r13.mo33610i()     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.server.b r10 = r12.f10685n     // Catch:{ all -> 0x0161 }
            r6.mo33908a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C4514Y>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C4707b>) r8, (int) r9, (com.ironsource.mediationsdk.server.C4707b) r10, (com.ironsource.mediationsdk.server.C4707b) r11)     // Catch:{ all -> 0x0161 }
            goto L_0x010e
        L_0x00a2:
            java.lang.String r1 = r13.mo33612k()     // Catch:{ all -> 0x0161 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = "onLoadSuccess winner instance "
            r2.<init>(r6)     // Catch:{ all -> 0x0161 }
            r2.append(r1)     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = " missing from waterfall. auctionId: "
            r2.append(r6)     // Catch:{ all -> 0x0161 }
            java.lang.String r13 = r13.f10744b     // Catch:{ all -> 0x0161 }
            r2.append(r13)     // Catch:{ all -> 0x0161 }
            java.lang.String r13 = " and the current id is "
            r2.append(r13)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.L r13 = r12.f10674c     // Catch:{ all -> 0x0161 }
            java.lang.String r13 = r13.f10768b     // Catch:{ all -> 0x0161 }
            r2.append(r13)     // Catch:{ all -> 0x0161 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0161 }
            m12777b((java.lang.String) r13)     // Catch:{ all -> 0x0161 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0161 }
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0161 }
            r6[r5] = r7     // Catch:{ all -> 0x0161 }
            r2[r3] = r6     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r7 = "reason"
            r6[r3] = r7     // Catch:{ all -> 0x0161 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r8 = "Loaded missing "
            r7.<init>(r8)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r8 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0161 }
            r7.append(r8)     // Catch:{ all -> 0x0161 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0161 }
            r6[r5] = r7     // Catch:{ all -> 0x0161 }
            r2[r5] = r6     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r7 = "ext1"
            r6[r3] = r7     // Catch:{ all -> 0x0161 }
            r6[r5] = r1     // Catch:{ all -> 0x0161 }
            r2[r4] = r6     // Catch:{ all -> 0x0161 }
            java.util.Map r1 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x0161 }
            r12.mo33393b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0161 }
        L_0x010e:
            monitor-exit(r0)     // Catch:{ all -> 0x0161 }
            return
        L_0x0110:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r13.f10744b     // Catch:{ all -> 0x0161 }
            r1.append(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.L r2 = r12.f10674c     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = r2.f10768b     // Catch:{ all -> 0x0161 }
            r1.append(r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0161 }
            m12774a((java.lang.String) r1)     // Catch:{ all -> 0x0161 }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0161 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0161 }
            r6[r5] = r7     // Catch:{ all -> 0x0161 }
            r2[r3] = r6     // Catch:{ all -> 0x0161 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x0161 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x0161 }
            com.ironsource.mediationsdk.I$a r6 = r12.f10681j     // Catch:{ all -> 0x0161 }
            r3.append(r6)     // Catch:{ all -> 0x0161 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0161 }
            r4[r5] = r3     // Catch:{ all -> 0x0161 }
            r2[r5] = r4     // Catch:{ all -> 0x0161 }
            r13.mo33461b(r1, r2)     // Catch:{ all -> 0x0161 }
            monitor-exit(r0)     // Catch:{ all -> 0x0161 }
            return
        L_0x0161:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0161 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4459I.mo33387a(com.ironsource.mediationsdk.J):void");
    }

    /* renamed from: a */
    public final void mo33388a(C4470J j, Placement placement) {
        m12773a(j, "onRewardedVideoAdRewarded");
        C4540aa.m13201a().mo33676a(placement);
    }

    /* renamed from: a */
    public final void mo33389a(IronSourceError ironSourceError, C4470J j) {
        m12773a(j, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f10696y = false;
        m12780c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        C4540aa.m13201a().mo33675a(ironSourceError);
        this.f10684m.put(j.mo33612k(), C4626i.C4627a.ISAuctionPerformanceFailedToShow);
        if (this.f10681j != C4462a.RV_STATE_READY_TO_SHOW) {
            m12776a(false, (Map<String, Object>) null);
        }
        this.f10687p.mo33714c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d4, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d6, code lost:
        m12774a("showVideo()");
        r9.f10679h.mo34202a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e6, code lost:
        if (r9.f10679h.mo34204b(r6) == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e8, code lost:
        r6.mo33463b_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.mo33612k() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0203, code lost:
        com.ironsource.mediationsdk.utils.C4723k.m13842e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0222, code lost:
        if (com.ironsource.mediationsdk.utils.C4723k.m13840c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName()) == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0224, code lost:
        m12779c((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0229, code lost:
        r9.f10673B.mo34226a();
        r6.mo33458a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33390a(com.ironsource.mediationsdk.model.Placement r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f10682k
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r10 != 0) goto L_0x0040
            java.lang.String r10 = "showRewardedVideo error: empty default placement"
            m12781c((java.lang.String) r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0232 }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.aa r7 = com.ironsource.mediationsdk.C4540aa.m13201a()     // Catch:{ all -> 0x0232 }
            r7.mo33675a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0232 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0232 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0232 }
            r7[r3] = r6     // Catch:{ all -> 0x0232 }
            r5[r4] = r7     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0232 }
            r2[r3] = r10     // Catch:{ all -> 0x0232 }
            r5[r3] = r2     // Catch:{ all -> 0x0232 }
            java.util.Map r10 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0232 }
            r9.m12771a(r1, r10, r4, r3)     // Catch:{ all -> 0x0232 }
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            return
        L_0x0040:
            java.lang.String r5 = r10.getPlacementName()     // Catch:{ all -> 0x0232 }
            r9.f10693v = r5     // Catch:{ all -> 0x0232 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x0232 }
            r5.append(r10)     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0232 }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x0232 }
            r5 = 1100(0x44c, float:1.541E-42)
            r9.m12779c((int) r5)     // Catch:{ all -> 0x0232 }
            boolean r5 = r9.f10696y     // Catch:{ all -> 0x0232 }
            if (r5 == 0) goto L_0x00a1
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            m12781c((java.lang.String) r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0232 }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.aa r7 = com.ironsource.mediationsdk.C4540aa.m13201a()     // Catch:{ all -> 0x0232 }
            r7.mo33675a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0232 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0232 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0232 }
            r7[r3] = r6     // Catch:{ all -> 0x0232 }
            r5[r4] = r7     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0232 }
            r2[r3] = r10     // Catch:{ all -> 0x0232 }
            r5[r3] = r2     // Catch:{ all -> 0x0232 }
            java.util.Map r10 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0232 }
            r9.m12780c(r1, r10)     // Catch:{ all -> 0x0232 }
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            return
        L_0x00a1:
            com.ironsource.mediationsdk.I$a r5 = r9.f10681j     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.I$a r6 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0232 }
            if (r5 == r6) goto L_0x00dd
            java.lang.String r10 = "showRewardedVideo error: show called while no ads are available"
            m12781c((java.lang.String) r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0232 }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.aa r7 = com.ironsource.mediationsdk.C4540aa.m13201a()     // Catch:{ all -> 0x0232 }
            r7.mo33675a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0232 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0232 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0232 }
            r7[r3] = r6     // Catch:{ all -> 0x0232 }
            r5[r4] = r7     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0232 }
            r2[r3] = r10     // Catch:{ all -> 0x0232 }
            r5[r3] = r2     // Catch:{ all -> 0x0232 }
            java.util.Map r10 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0232 }
            r9.m12780c(r1, r10)     // Catch:{ all -> 0x0232 }
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            return
        L_0x00dd:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0232 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = r9.f10693v     // Catch:{ all -> 0x0232 }
            boolean r5 = com.ironsource.mediationsdk.utils.C4723k.m13840c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0232 }
            if (r5 == 0) goto L_0x0136
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r10.<init>(r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = r9.f10693v     // Catch:{ all -> 0x0232 }
            r10.append(r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = " is capped"
            r10.append(r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0232 }
            m12781c((java.lang.String) r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0232 }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.aa r7 = com.ironsource.mediationsdk.C4540aa.m13201a()     // Catch:{ all -> 0x0232 }
            r7.mo33675a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0232 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = "errorCode"
            r7[r4] = r8     // Catch:{ all -> 0x0232 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0232 }
            r7[r3] = r6     // Catch:{ all -> 0x0232 }
            r5[r4] = r7     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0232 }
            java.lang.String r6 = "reason"
            r2[r4] = r6     // Catch:{ all -> 0x0232 }
            r2[r3] = r10     // Catch:{ all -> 0x0232 }
            r5[r3] = r2     // Catch:{ all -> 0x0232 }
            java.util.Map r10 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0232 }
            r9.m12780c(r1, r10)     // Catch:{ all -> 0x0232 }
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            return
        L_0x0136:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x0232 }
            r2.<init>()     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.L r5 = r9.f10674c     // Catch:{ all -> 0x0232 }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.mo33480a()     // Catch:{ all -> 0x0232 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0232 }
        L_0x0145:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0232 }
            if (r6 == 0) goto L_0x0190
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.J r6 = (com.ironsource.mediationsdk.C4470J) r6     // Catch:{ all -> 0x0232 }
            boolean r7 = r6.mo33462b()     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x0162
            r9.f10696y = r3     // Catch:{ all -> 0x0232 }
            r6.mo33460a((boolean) r3)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.I$a r3 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0232 }
            r9.mo33386a((com.ironsource.mediationsdk.C4459I.C4462a) r3)     // Catch:{ all -> 0x0232 }
            goto L_0x0191
        L_0x0162:
            java.lang.Long r7 = r6.mo33616o()     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x018c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0232 }
            r7.<init>()     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = r6.mo33612k()     // Catch:{ all -> 0x0232 }
            r7.append(r8)     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x0232 }
            java.lang.Long r8 = r6.mo33616o()     // Catch:{ all -> 0x0232 }
            r7.append(r8)     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x0232 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0232 }
            r2.append(r7)     // Catch:{ all -> 0x0232 }
        L_0x018c:
            r6.mo33460a((boolean) r4)     // Catch:{ all -> 0x0232 }
            goto L_0x0145
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 != 0) goto L_0x01d3
            java.lang.String r10 = "showRewardedVideo(): No ads to show"
            m12774a((java.lang.String) r10)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.aa r3 = com.ironsource.mediationsdk.C4540aa.m13201a()     // Catch:{ all -> 0x0232 }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x0232 }
            r3.mo33675a((com.ironsource.mediationsdk.logger.IronSourceError) r4)     // Catch:{ all -> 0x0232 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0232 }
            r3.<init>()     // Catch:{ all -> 0x0232 }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0232 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r4 = "reason"
            r3.put(r4, r10)     // Catch:{ all -> 0x0232 }
            int r10 = r2.length()     // Catch:{ all -> 0x0232 }
            if (r10 == 0) goto L_0x01c9
            java.lang.String r10 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0232 }
            r3.put(r10, r2)     // Catch:{ all -> 0x0232 }
        L_0x01c9:
            r9.m12780c(r1, r3)     // Catch:{ all -> 0x0232 }
            com.ironsource.mediationsdk.ad r10 = r9.f10687p     // Catch:{ all -> 0x0232 }
            r10.mo33714c()     // Catch:{ all -> 0x0232 }
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            return
        L_0x01d3:
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            if (r6 == 0) goto L_0x0231
            java.lang.String r0 = "showVideo()"
            m12774a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.n r0 = r9.f10679h
            r0.mo34202a(r6)
            com.ironsource.mediationsdk.utils.n r0 = r9.f10679h
            boolean r0 = r0.mo34204b(r6)
            if (r0 == 0) goto L_0x0203
            r6.mo33463b_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.mo33612k()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x0203:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            com.ironsource.mediationsdk.utils.C4723k.m13842e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.C4723k.m13840c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0229
            r0 = 1400(0x578, float:1.962E-42)
            r9.m12779c((int) r0)
        L_0x0229:
            com.ironsource.mediationsdk.x r0 = r9.f10673B
            r0.mo34226a()
            r6.mo33458a((com.ironsource.mediationsdk.model.Placement) r10)
        L_0x0231:
            return
        L_0x0232:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0232 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4459I.mo33390a(com.ironsource.mediationsdk.model.Placement):void");
    }

    /* renamed from: a */
    public final void mo33391a(List<C4707b> list, String str, C4707b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m12774a("makeAuction(): success");
        this.f10685n = bVar;
        this.f10690s = i;
        this.f10686o = jSONObject;
        this.f10689r = "";
        if (!TextUtils.isEmpty(str2)) {
            mo33393b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo34048a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f11672a.mo34172a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo33393b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}));
            mo33400e();
            return;
        }
        m12775a(list, str, this.f10686o);
        mo33393b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        m12785h();
    }

    /* renamed from: a */
    public final void mo33217a(boolean z) {
        if (this.f10692u) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = false;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f10672A;
            if (bool != null && ((z && !bool.booleanValue() && mo33392a_()) || (!z && this.f10672A.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m12776a(z, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo33392a_() {
        if ((!this.f10692u || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f10681j == C4462a.RV_STATE_READY_TO_SHOW && !this.f10696y) {
            Iterator<C4470J> it = this.f10674c.mo33480a().iterator();
            while (it.hasNext()) {
                if (it.next().mo33462b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33393b(int i, Map<String, Object> map) {
        m12771a(i, map, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r11.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        m12784g((com.ironsource.mediationsdk.C4470J) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33394b(com.ironsource.mediationsdk.C4470J r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f10682k
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r3 = r10.f10681j     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            m12773a((com.ironsource.mediationsdk.C4470J) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f10744b     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.L r3 = r10.f10674c     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r3.f10768b     // Catch:{ all -> 0x0187 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0134
            com.ironsource.mediationsdk.I$a r2 = r10.f10681j     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r3 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0134
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r10.f10684m     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r11.mo33612k()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0187 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r2 = r10.f10681j     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r3 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            com.ironsource.mediationsdk.I$a r2 = r10.f10681j     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r3 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0046:
            com.ironsource.mediationsdk.L r2 = r10.f10674c     // Catch:{ all -> 0x0187 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.mo33480a()     // Catch:{ all -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0187 }
            r3 = 0
            r6 = 0
        L_0x0052:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.J r7 = (com.ironsource.mediationsdk.C4470J) r7     // Catch:{ all -> 0x0187 }
            boolean r8 = r7.f11017e     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00df
            boolean r8 = r10.f10695x     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r7.mo33609h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            if (r3 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo33612k()     // Catch:{ all -> 0x0187 }
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0187 }
            m12774a((java.lang.String) r8)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00b7
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0096
        L_0x0094:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0096:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.mo33612k()     // Catch:{ all -> 0x0187 }
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0187 }
            m12774a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0187 }
            goto L_0x00fd
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r10.f10683l     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo33612k()     // Catch:{ all -> 0x0187 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x0052
            r0.add(r7)     // Catch:{ all -> 0x0187 }
            boolean r8 = r10.f10695x     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r8 = r11.mo33609h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r7.mo33609h()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x00fd
            int r7 = r0.size()     // Catch:{ all -> 0x0187 }
            int r8 = r10.f10694w     // Catch:{ all -> 0x0187 }
            if (r7 >= r8) goto L_0x00fd
            goto L_0x00f1
        L_0x00df:
            com.ironsource.mediationsdk.J$a r8 = r7.f10743a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.J$a r9 = com.ironsource.mediationsdk.C4470J.C4472a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 == r9) goto L_0x00ee
            com.ironsource.mediationsdk.J$a r8 = r7.f10743a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.J$a r9 = com.ironsource.mediationsdk.C4470J.C4472a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r8 = 0
            goto L_0x00ef
        L_0x00ee:
            r8 = 1
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = 1
            goto L_0x0052
        L_0x00f4:
            boolean r7 = r7.mo33462b()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0052
            r6 = 1
            goto L_0x0052
        L_0x00fd:
            int r11 = r0.size()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x011e
            if (r6 != 0) goto L_0x011e
            if (r3 != 0) goto L_0x011e
            java.lang.String r11 = "onLoadError(): No other available smashes"
            m12774a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            boolean r11 = r10.f10696y     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0114
            r11 = 0
            r10.m12776a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r11)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            com.ironsource.mediationsdk.I$a r11 = com.ironsource.mediationsdk.C4459I.C4462a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0187 }
            r10.mo33386a((com.ironsource.mediationsdk.C4459I.C4462a) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.ad r11 = r10.f10687p     // Catch:{ all -> 0x0187 }
            r11.mo33715d()     // Catch:{ all -> 0x0187 }
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r11 = r0.iterator()
        L_0x0123:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.J r0 = (com.ironsource.mediationsdk.C4470J) r0
            r10.m12784g(r0)
            goto L_0x0123
        L_0x0133:
            return
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f10744b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.L r2 = r10.f10674c     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.f10768b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            m12774a((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0187 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0187 }
            r6[r4] = r7     // Catch:{ all -> 0x0187 }
            r3[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.I$a r6 = r10.f10681j     // Catch:{ all -> 0x0187 }
            r5.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0187 }
            r2[r4] = r5     // Catch:{ all -> 0x0187 }
            r3[r4] = r2     // Catch:{ all -> 0x0187 }
            r11.mo33461b(r0, r3)     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4459I.mo33394b(com.ironsource.mediationsdk.J):void");
    }

    /* renamed from: b */
    public final void mo33395b(C4470J j, Placement placement) {
        m12773a(j, "onRewardedVideoAdClicked");
        C4540aa.m13201a().mo33679b(placement);
    }

    /* renamed from: c */
    public final void mo33396c(C4470J j) {
        this.f10674c.mo33481a(j);
        this.f10680i++;
        m12773a(j, "onRewardedVideoAdOpened");
        C4540aa.m13201a().mo33678b();
        m12776a(false, (Map<String, Object>) null);
        if (this.f10688q) {
            C4707b bVar = this.f10683l.get(j.mo33612k());
            if (bVar != null) {
                C4624h.m13548a(bVar, j.mo33610i(), this.f10685n, this.f10693v);
                this.f10684m.put(j.mo33612k(), C4626i.C4627a.ISAuctionPerformanceShowedSuccessfully);
                mo34047a(bVar, this.f10693v);
            } else {
                String k = j.mo33612k();
                m12777b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                mo33393b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f10681j}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        this.f10687p.mo33712a();
    }

    /* renamed from: c_ */
    public final void mo33397c_() {
        mo33386a(C4462a.RV_STATE_NOT_LOADED);
        m12776a(false, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m12772a(0);
    }

    /* renamed from: d */
    public final void mo33398d() {
        m12774a("onLoadTriggered: RV load was triggered in " + this.f10681j + " state");
        m12772a(0);
    }

    /* renamed from: d */
    public final void mo33399d(C4470J j) {
        String str;
        m12773a(j, "onRewardedVideoAdClosed, mediation state: " + this.f10681j.name());
        C4540aa.m13201a().mo33680c();
        this.f10696y = false;
        boolean z = this.f10681j == C4462a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C4470J> it = this.f10674c.mo33480a().iterator();
            while (it.hasNext()) {
                C4470J next = it.next();
                if (next.f10743a == C4470J.C4472a.LOADED) {
                    sb.append(next.mo33612k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
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
        objArr[0] = objArr2;
        j.mo33457a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (j.equals(this.f10674c.f10769c)) {
            this.f10674c.mo33481a((C4470J) null);
            if (this.f10681j != C4462a.RV_STATE_READY_TO_SHOW) {
                m12776a(false, (Map<String, Object>) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo33400e() {
        mo33386a(C4462a.RV_STATE_NOT_LOADED);
        if (!this.f10696y) {
            m12776a(false, (Map<String, Object>) null);
        }
        this.f10687p.mo33715d();
    }

    /* renamed from: e */
    public final void mo33401e(C4470J j) {
        m12773a(j, "onRewardedVideoAdStarted");
        C4540aa.m13201a().mo33681d();
    }

    /* renamed from: f */
    public final void mo33402f(C4470J j) {
        m12773a(j, "onRewardedVideoAdEnded");
        C4540aa.m13201a().mo33682e();
    }
}
