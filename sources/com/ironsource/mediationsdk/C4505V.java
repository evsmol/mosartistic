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
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
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

/* renamed from: com.ironsource.mediationsdk.V */
final class C4505V extends C4663n implements C4411j, C4510W, C4598ae, C4613c, C4623g, C4741z {

    /* renamed from: A */
    private C4509a f10945A;

    /* renamed from: B */
    private int f10946B;

    /* renamed from: C */
    private String f10947C = "";

    /* renamed from: D */
    private boolean f10948D = false;

    /* renamed from: E */
    private NetworkStateReceiver f10949E;

    /* renamed from: F */
    private C4738x f10950F;

    /* renamed from: c */
    final ConcurrentHashMap<String, C4511X> f10951c;

    /* renamed from: d */
    C4729n f10952d;

    /* renamed from: e */
    C4624h f10953e;

    /* renamed from: f */
    C4626i f10954f;

    /* renamed from: g */
    String f10955g;

    /* renamed from: h */
    JSONObject f10956h;

    /* renamed from: i */
    int f10957i = 1;

    /* renamed from: j */
    long f10958j;

    /* renamed from: k */
    private CopyOnWriteArrayList<C4511X> f10959k;

    /* renamed from: l */
    private List<C4707b> f10960l;

    /* renamed from: m */
    private ConcurrentHashMap<String, C4707b> f10961m;

    /* renamed from: n */
    private ConcurrentHashMap<String, C4626i.C4627a> f10962n;

    /* renamed from: o */
    private C4707b f10963o;

    /* renamed from: p */
    private C4555ad f10964p;

    /* renamed from: q */
    private boolean f10965q;

    /* renamed from: r */
    private boolean f10966r;

    /* renamed from: s */
    private boolean f10967s;

    /* renamed from: t */
    private String f10968t;

    /* renamed from: u */
    private long f10969u;

    /* renamed from: v */
    private long f10970v;

    /* renamed from: w */
    private int f10971w;

    /* renamed from: x */
    private boolean f10972x;

    /* renamed from: y */
    private boolean f10973y;

    /* renamed from: z */
    private Boolean f10974z;

    /* renamed from: com.ironsource.mediationsdk.V$a */
    enum C4509a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4505V(List<NetworkSettings> list, C4661o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        C4661o oVar2 = oVar;
        long time = new Date().getTime();
        mo33581a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo33583a(C4509a.RV_STATE_INITIATING);
        this.f10974z = null;
        this.f10971w = oVar2.f11659c;
        this.f10972x = oVar2.f11660d;
        this.f10968t = "";
        C4714c cVar = oVar2.f11668l;
        this.f10973y = false;
        this.f10959k = new CopyOnWriteArrayList<>();
        this.f10960l = new ArrayList();
        this.f10961m = new ConcurrentHashMap<>();
        this.f10962n = new ConcurrentHashMap<>();
        this.f10970v = new Date().getTime();
        this.f10965q = cVar.f11777e > 0;
        this.f10966r = cVar.f11785m;
        this.f10967s = !cVar.f11786n;
        this.f10969u = cVar.f11784l;
        if (this.f10965q) {
            this.f10953e = new C4624h("rewardedVideo", cVar, this);
        }
        this.f10964p = new C4555ad(cVar, this);
        this.f10951c = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C4616d.m13502a().mo33892a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C4618e a2 = C4618e.m13521a();
                if (a2.mo33900a(a, a2.f11413b, "rewarded video")) {
                    C4511X x = r0;
                    C4511X x2 = new C4511X(str, str2, next, this, oVar2.f11661e, a);
                    String k = x.mo33612k();
                    this.f10951c.put(k, x);
                    arrayList.add(k);
                }
            }
        }
        this.f10954f = new C4626i(arrayList, cVar.f11778f);
        this.f10952d = new C4729n(new ArrayList(this.f10951c.values()));
        for (C4511X next2 : this.f10951c.values()) {
            if (next2.mo33609h()) {
                next2.mo33603b();
            }
        }
        mo33582a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(new Date().getTime() - time)}}));
        this.f10950F = new C4738x(oVar2.f11665i, this);
        m13022a(cVar.f11781i);
    }

    /* renamed from: a */
    private String m13020a(C4707b bVar) {
        C4511X x = this.f10951c.get(bVar.mo34157a());
        String num = x != null ? Integer.toString(x.mo33610i()) : TextUtils.isEmpty(bVar.mo34158b()) ? "1" : "2";
        return num + bVar.mo34157a();
    }

    /* renamed from: a */
    private void m13021a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.f10955g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10955g);
        }
        JSONObject jSONObject = this.f10956h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10956h);
        }
        if (z && !TextUtils.isEmpty(this.f10968t)) {
            hashMap.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10968t);
        }
        if (m13033c(i)) {
            C4537h.m13193e();
            C4537h.m13131a((Map<String, Object>) hashMap, this.f10946B, this.f10947C);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f10957i));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m13022a(long j) {
        if (this.f10952d.mo34203a()) {
            mo33588b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo33595f();
        } else if (this.f10965q) {
            if (!this.f10962n.isEmpty()) {
                this.f10954f.mo33911a(this.f10962n);
                this.f10962n.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C4505V v = C4505V.this;
                    v.mo33583a(C4509a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() {
                        public final void run() {
                            StringBuilder sb;
                            C4505V.m13023a("makeAuction()");
                            C4505V.this.f10955g = "";
                            C4505V.this.f10956h = null;
                            C4505V.this.mo34044a(IronSource.AD_UNIT.REWARDED_VIDEO);
                            C4505V.this.f10958j = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (C4511X next : C4505V.this.f10951c.values()) {
                                if (next.mo33609h()) {
                                    next.f10989b = false;
                                }
                                if (!C4505V.this.f10952d.mo34204b(next)) {
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
                                C4505V.this.mo33588b((int) IronSourceConstants.RV_AUCTION_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}}));
                                C4505V.m13023a("makeAuction() failed - No candidates available for auctioning");
                                C4505V.this.mo33595f();
                                return;
                            }
                            C4505V.m13023a("makeAuction() - request waterfall is: " + sb2);
                            C4505V.this.mo33581a(1000);
                            C4505V.this.mo33581a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                            C4505V.this.mo33582a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            C4505V.this.f10953e.mo33907a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C4505V.this.f10954f, C4505V.this.f10957i, C4505V.this.f11673b);
                        }
                    });
                }
            }, j);
        } else {
            IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
            m13035g();
            if (this.f10960l.isEmpty()) {
                mo33588b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                mo33595f();
                return;
            }
            mo33581a(1000);
            if (!this.f10967s || !this.f10973y) {
                mo33594e();
            }
        }
    }

    /* renamed from: a */
    static void m13023a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m13024a(List<C4707b> list) {
        this.f10960l = list;
        StringBuilder sb = new StringBuilder();
        for (C4707b a : list) {
            sb.append(m13020a(a) + ",");
        }
        m13023a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m13023a("Updated waterfall is empty");
        }
        mo33588b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m13025a(boolean z, Map<String, Object> map) {
        Boolean bool = this.f10974z;
        if (bool == null || bool.booleanValue() != z) {
            this.f10974z = Boolean.valueOf(z);
            long time = new Date().getTime() - this.f10970v;
            this.f10970v = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(time));
            mo33588b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            C4540aa.m13201a().mo33677a(z);
        }
    }

    /* renamed from: b */
    private void m13026b(int i) {
        m13021a(i, new HashMap(), true, true);
    }

    /* renamed from: b */
    private static void m13027b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private void m13028b(List<C4707b> list) {
        this.f10959k.clear();
        this.f10961m.clear();
        this.f10962n.clear();
        for (C4707b next : list) {
            C4511X x = this.f10951c.get(next.mo34157a());
            if (x != null) {
                x.f11017e = true;
                this.f10959k.add(x);
                this.f10961m.put(x.mo33612k(), next);
                this.f10962n.put(next.mo34157a(), C4626i.C4627a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m13023a("updateWaterfall() - could not find matching smash for auction response item " + next.mo34157a());
            }
        }
        this.f10960l.clear();
    }

    /* renamed from: b */
    private void m13029b(boolean z) {
        m13025a(z, (Map<String, Object>) new HashMap());
    }

    /* renamed from: c */
    private void m13030c(int i, Map<String, Object> map) {
        m13021a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m13031c(C4511X x, String str) {
        String str2 = x.mo33612k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    /* renamed from: c */
    private static void m13032c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m13033c(int i) {
        return i == 1003 || i == 1302 || i == 1301 || i == 1303;
    }

    /* renamed from: e */
    private void m13034e(C4511X x) {
        String b = this.f10961m.get(x.mo33612k()).mo34158b();
        C4619f.m13526a();
        C4511X x2 = x;
        x2.mo33601a(b, this.f10955g, this.f10956h, this.f10946B, this.f10947C, this.f10957i, C4619f.m13537d(b));
    }

    /* renamed from: g */
    private void m13035g() {
        this.f10955g = m13642c();
        m13024a(m13036h());
    }

    /* renamed from: h */
    private List<C4707b> m13036h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C4511X next : this.f10951c.values()) {
            if (!next.mo33609h() && !this.f10952d.mo34204b(next)) {
                copyOnWriteArrayList.add(new C4707b(next.mo33612k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m13037i() {
        if (this.f10959k.isEmpty()) {
            mo33588b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo33595f();
            return;
        }
        mo33583a(C4509a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f10959k.size() && i < this.f10971w; i2++) {
            C4511X x = this.f10959k.get(i2);
            if (x.f11017e) {
                if (!this.f10972x || !x.mo33609h()) {
                    m13034e(x);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + x.mo33612k() + ". No other instances will be loaded at the same time.";
                    m13023a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m13034e(x);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + x.mo33612k() + " as a non bidder is being loaded";
                    m13023a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33581a(int i) {
        m13021a(i, new HashMap(), false, false);
    }

    /* renamed from: a */
    public final void mo33383a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m13023a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f10946B = i2;
        this.f10947C = str2;
        this.f10956h = null;
        m13035g();
        if (TextUtils.isEmpty(str)) {
            map = C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        } else {
            map = C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        }
        mo33588b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.f10967s || !this.f10973y) {
            mo33594e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33582a(int i, Map<String, Object> map) {
        m13021a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo33385a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f10948D = z;
            if (z) {
                if (this.f10949E == null) {
                    this.f10949E = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f10949E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f10949E != null) {
                context.getApplicationContext().unregisterReceiver(this.f10949E);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33583a(C4509a aVar) {
        m13023a("current state=" + this.f10945A + ", new state=" + aVar);
        this.f10945A = aVar;
    }

    /* renamed from: a */
    public final void mo33584a(C4511X x) {
        synchronized (this) {
            this.f10957i++;
            m13031c(x, "onRewardedVideoAdOpened");
            C4540aa.m13201a().mo33678b();
            if (this.f10965q) {
                C4707b bVar = this.f10961m.get(x.mo33612k());
                if (bVar != null) {
                    C4624h.m13548a(bVar, x.mo33610i(), this.f10963o, this.f10968t);
                    this.f10962n.put(x.mo33612k(), C4626i.C4627a.ISAuctionPerformanceShowedSuccessfully);
                    mo34047a(bVar, this.f10968t);
                } else {
                    String k = x.mo33612k();
                    m13027b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    mo33588b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f10945A}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            this.f10964p.mo33712a();
        }
    }

    /* renamed from: a */
    public final void mo33585a(C4511X x, Placement placement) {
        m13031c(x, "onRewardedVideoAdRewarded");
        C4540aa.m13201a().mo33676a(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0140, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33586a(com.ironsource.mediationsdk.C4511X r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            m13031c((com.ironsource.mediationsdk.C4511X) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r11.f10955g     // Catch:{ all -> 0x0141 }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r11.f10955g     // Catch:{ all -> 0x0141 }
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x0141 }
            r0.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = r11.f10955g     // Catch:{ all -> 0x0141 }
            r0.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0141 }
            m13023a((java.lang.String) r13)     // Catch:{ all -> 0x0141 }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x0141 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r4[r3] = r5     // Catch:{ all -> 0x0141 }
            r0[r1] = r4     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.V$a r4 = r11.f10945A     // Catch:{ all -> 0x0141 }
            r1.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0141 }
            r2[r3] = r1     // Catch:{ all -> 0x0141 }
            r0[r3] = r2     // Catch:{ all -> 0x0141 }
            r12.mo33604b(r13, r0)     // Catch:{ all -> 0x0141 }
            monitor-exit(r11)
            return
        L_0x0062:
            com.ironsource.mediationsdk.V$a r0 = r11.f10945A     // Catch:{ all -> 0x0141 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r4 = r11.f10962n     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = r12.mo33612k()     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.i$a r6 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0141 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.V$a r4 = r11.f10945A     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.V$a r5 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0141 }
            if (r4 != r5) goto L_0x013f
            r11.m13029b((boolean) r3)     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.V$a r4 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0141 }
            r11.mo33583a((com.ironsource.mediationsdk.C4505V.C4509a) r4)     // Catch:{ all -> 0x0141 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0141 }
            r4.<init>()     // Catch:{ all -> 0x0141 }
            long r4 = r4.getTime()     // Catch:{ all -> 0x0141 }
            long r6 = r11.f10958j     // Catch:{ all -> 0x0141 }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x0141 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r8[r3] = r4     // Catch:{ all -> 0x0141 }
            r7[r1] = r8     // Catch:{ all -> 0x0141 }
            java.util.Map r4 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0141 }
            r11.mo33588b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.x r4 = r11.f10950F     // Catch:{ all -> 0x0141 }
            r5 = 0
            r4.mo34227a(r5)     // Catch:{ all -> 0x0141 }
            boolean r4 = r11.f10965q     // Catch:{ all -> 0x0141 }
            if (r4 == 0) goto L_0x013f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r4 = r11.f10961m     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = r12.mo33612k()     // Catch:{ all -> 0x0141 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0141 }
            r10 = r4
            com.ironsource.mediationsdk.server.b r10 = (com.ironsource.mediationsdk.server.C4707b) r10     // Catch:{ all -> 0x0141 }
            if (r10 == 0) goto L_0x00d9
            int r13 = r12.mo33610i()     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.server.b r0 = r11.f10963o     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.C4624h.m13547a(r10, r13, r0)     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.h r5 = r11.f10953e     // Catch:{ all -> 0x0141 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.X> r13 = r11.f10959k     // Catch:{ all -> 0x0141 }
            r6 = r13
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x0141 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r7 = r11.f10961m     // Catch:{ all -> 0x0141 }
            int r8 = r12.mo33610i()     // Catch:{ all -> 0x0141 }
            com.ironsource.mediationsdk.server.b r9 = r11.f10963o     // Catch:{ all -> 0x0141 }
            r5.mo33908a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C4514Y>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C4707b>) r7, (int) r8, (com.ironsource.mediationsdk.server.C4707b) r9, (com.ironsource.mediationsdk.server.C4707b) r10)     // Catch:{ all -> 0x0141 }
            monitor-exit(r11)
            return
        L_0x00d9:
            java.lang.String r12 = r12.mo33612k()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x0141 }
            r4.append(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x0141 }
            r4.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = r11.f10955g     // Catch:{ all -> 0x0141 }
            r4.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0141 }
            m13027b((java.lang.String) r13)     // Catch:{ all -> 0x0141 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x0141 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0141 }
            r5[r3] = r6     // Catch:{ all -> 0x0141 }
            r4[r1] = r5     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x0141 }
            r6.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0141 }
            r5[r3] = r0     // Catch:{ all -> 0x0141 }
            r4[r3] = r5     // Catch:{ all -> 0x0141 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x0141 }
            r0[r3] = r12     // Catch:{ all -> 0x0141 }
            r4[r2] = r0     // Catch:{ all -> 0x0141 }
            java.util.Map r12 = com.ironsource.environment.C4377a.C43781.m12455a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x0141 }
            r11.mo33588b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r12)     // Catch:{ all -> 0x0141 }
        L_0x013f:
            monitor-exit(r11)
            return
        L_0x0141:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4505V.mo33586a(com.ironsource.mediationsdk.X, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo33587a(IronSourceError ironSourceError, C4511X x) {
        synchronized (this) {
            m13031c(x, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            m13030c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            C4540aa.m13201a().mo33675a(ironSourceError);
            this.f10973y = false;
            this.f10962n.put(x.mo33612k(), C4626i.C4627a.ISAuctionPerformanceFailedToShow);
            if (this.f10945A != C4509a.RV_STATE_READY_TO_SHOW) {
                m13029b(false);
            }
            this.f10964p.mo33714c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo33390a(Placement placement) {
        if (placement == null) {
            m13032c("showRewardedVideo error: empty default placement");
            C4540aa.m13201a().mo33675a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement"));
            m13021a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f10968t = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
        m13026b((int) IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f10973y) {
            m13032c("showRewardedVideo error: can't show ad while an ad is already showing");
            C4540aa.m13201a().mo33675a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"));
            m13030c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.f10945A != C4509a.RV_STATE_READY_TO_SHOW) {
            m13032c("showRewardedVideo error: show called while no ads are available");
            C4540aa.m13201a().mo33675a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available"));
            m13030c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (C4723k.m13840c(ContextProvider.getInstance().getApplicationContext(), this.f10968t)) {
            String str = "showRewardedVideo error: placement " + this.f10968t + " is capped";
            m13032c(str);
            C4540aa.m13201a().mo33675a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str));
            m13030c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C4511X> it = this.f10959k.iterator();
            while (it.hasNext()) {
                C4511X next = it.next();
                if (next.mo33605c()) {
                    this.f10973y = true;
                    next.mo33602a(true, this.f10957i);
                    m13023a("showVideo()");
                    this.f10952d.mo34202a(next);
                    if (this.f10952d.mo34204b(next)) {
                        next.mo33606f();
                        IronSourceUtils.sendAutomationLog(next.mo33612k() + " rewarded video is now session capped");
                    }
                    C4723k.m13842e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (C4723k.m13840c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        m13026b((int) IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.f10950F.mo34226a();
                    next.mo33600a(placement, this.f10957i);
                    mo33583a(C4509a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.mo33616o() != null) {
                    stringBuffer.append(next.mo33612k() + ":" + next.mo33616o() + ",");
                }
                next.mo33602a(false, this.f10957i);
            }
            m13023a("showRewardedVideo(): No ads to show");
            C4540aa.m13201a().mo33675a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, 509);
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            m13030c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, (Map<String, Object>) hashMap);
            this.f10964p.mo33714c();
        }
    }

    /* renamed from: a */
    public final void mo33391a(List<C4707b> list, String str, C4707b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        m13023a("makeAuction(): success");
        this.f10955g = str;
        this.f10963o = bVar;
        this.f10956h = jSONObject;
        this.f10946B = i;
        this.f10947C = "";
        if (!TextUtils.isEmpty(str2)) {
            mo33588b((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        mo34048a(jSONObject2, IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f11672a.mo34172a(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            mo33588b((int) IronSourceConstants.RV_AD_UNIT_CAPPED, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}}));
            mo33595f();
            return;
        }
        mo33588b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}}));
        m13024a(list);
        if (!this.f10967s || !this.f10973y) {
            mo33594e();
        }
    }

    /* renamed from: a */
    public final void mo33217a(boolean z) {
        if (this.f10948D) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = false;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 0);
            Boolean bool = this.f10974z;
            if (bool != null && ((z && !bool.booleanValue() && mo33392a_()) || (!z && this.f10974z.booleanValue()))) {
                z2 = true;
            }
            if (z2) {
                m13029b(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33392a_() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f10948D     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.V$a r0 = r3.f10945A     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.V$a r2 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.f10973y     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.X> r0 = r3.f10959k     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.X r2 = (com.ironsource.mediationsdk.C4511X) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.mo33605c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4505V.mo33392a_():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33588b(int i, Map<String, Object> map) {
        m13021a(i, map, false, true);
    }

    /* renamed from: b */
    public final void mo33589b(C4511X x) {
        synchronized (this) {
            x.mo33599a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            m13031c(x, "onRewardedVideoAdClosed, mediation state: " + this.f10945A.name());
            C4540aa.m13201a().mo33680c();
            this.f10973y = false;
            if (this.f10945A != C4509a.RV_STATE_READY_TO_SHOW) {
                m13029b(false);
            }
            if (!this.f10966r) {
                this.f10964p.mo33713b();
            } else if (this.f10960l != null && this.f10960l.size() > 0) {
                new Timer().schedule(new TimerTask() {
                    public final void run() {
                        C4505V.this.mo33594e();
                    }
                }, this.f10969u);
            }
        }
    }

    /* renamed from: b */
    public final void mo33590b(C4511X x, Placement placement) {
        m13031c(x, "onRewardedVideoAdClicked");
        C4540aa.m13201a().mo33679b(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r9.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        m13034e((com.ironsource.mediationsdk.C4511X) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33591b(com.ironsource.mediationsdk.C4511X r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r2 = r8.f10945A     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m13031c((com.ironsource.mediationsdk.C4511X) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r8.f10955g     // Catch:{ all -> 0x0170 }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r8.f10955g     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0170 }
            m13023a((java.lang.String) r10)     // Catch:{ all -> 0x0170 }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x0170 }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0170 }
            r4[r2] = r5     // Catch:{ all -> 0x0170 }
            r1[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r4 = r8.f10945A     // Catch:{ all -> 0x0170 }
            r3.append(r4)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0[r2] = r3     // Catch:{ all -> 0x0170 }
            r1[r2] = r0     // Catch:{ all -> 0x0170 }
            r9.mo33604b(r10, r1)     // Catch:{ all -> 0x0170 }
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r10 = r8.f10962n     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r9.mo33612k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0170 }
            r10.put(r1, r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r10 = r8.f10945A     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r1 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            com.ironsource.mediationsdk.V$a r10 = r8.f10945A     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r1 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.X> r10 = r8.f10959k     // Catch:{ all -> 0x0170 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0170 }
            r1 = 0
            r4 = 0
        L_0x0093:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X r5 = (com.ironsource.mediationsdk.C4511X) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = r5.f11017e     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0120
            boolean r6 = r8.f10972x     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r5.mo33609h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo33612k()     // Catch:{ all -> 0x0170 }
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0170 }
            m13023a((java.lang.String) r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00f8
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r5.mo33612k()     // Catch:{ all -> 0x0170 }
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            r10.append(r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0170 }
            m13023a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0170 }
            goto L_0x013e
        L_0x00f8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r6 = r8.f10961m     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo33612k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0093
            r0.add(r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r8.f10972x     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r6 = r9.mo33609h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r5 = r5.mo33609h()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x013e
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            int r6 = r8.f10971w     // Catch:{ all -> 0x0170 }
            if (r5 >= r6) goto L_0x013e
            goto L_0x0132
        L_0x0120:
            com.ironsource.mediationsdk.X$a r6 = r5.f10988a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r7 = com.ironsource.mediationsdk.C4511X.C4513a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 == r7) goto L_0x012f
            com.ironsource.mediationsdk.X$a r6 = r5.f10988a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.X$a r7 = com.ironsource.mediationsdk.C4511X.C4513a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 != r7) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = 0
            goto L_0x0130
        L_0x012f:
            r6 = 1
        L_0x0130:
            if (r6 == 0) goto L_0x0135
        L_0x0132:
            r1 = 1
            goto L_0x0093
        L_0x0135:
            boolean r5 = r5.mo33605c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0093
            r4 = 1
            goto L_0x0093
        L_0x013e:
            int r9 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r9 != 0) goto L_0x015a
            if (r4 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            java.lang.String r9 = "onLoadError(): No other available smashes"
            m13023a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            r8.m13029b((boolean) r3)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.V$a r9 = com.ironsource.mediationsdk.C4505V.C4509a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0170 }
            r8.mo33583a((com.ironsource.mediationsdk.C4505V.C4509a) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.ad r9 = r8.f10964p     // Catch:{ all -> 0x0170 }
            r9.mo33715d()     // Catch:{ all -> 0x0170 }
        L_0x015a:
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r9 = r0.iterator()
        L_0x015f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.X r10 = (com.ironsource.mediationsdk.C4511X) r10
            r8.m13034e(r10)
            goto L_0x015f
        L_0x016f:
            return
        L_0x0170:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4505V.mo33591b(com.ironsource.mediationsdk.X, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo33592c(C4511X x) {
        m13031c(x, "onRewardedVideoAdStarted");
        C4540aa.m13201a().mo33681d();
    }

    /* renamed from: c_ */
    public final void mo33397c_() {
        mo33583a(C4509a.RV_STATE_NOT_LOADED);
        m13025a(false, C4377a.C43781.m12455a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m13022a(0);
    }

    /* renamed from: d */
    public final synchronized void mo33398d() {
        m13023a("onLoadTriggered: RV load was triggered in " + this.f10945A + " state");
        m13022a(0);
    }

    /* renamed from: d */
    public final void mo33593d(C4511X x) {
        m13031c(x, "onRewardedVideoAdEnded");
        C4540aa.m13201a().mo33682e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo33594e() {
        m13028b(this.f10960l);
        m13037i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo33595f() {
        mo33583a(C4509a.RV_STATE_NOT_LOADED);
        m13029b(false);
        this.f10964p.mo33715d();
    }
}
