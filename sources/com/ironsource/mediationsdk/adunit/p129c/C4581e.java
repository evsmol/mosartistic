package com.ironsource.mediationsdk.adunit.p129c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.C4411j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p124e.C4401c;
import com.ironsource.mediationsdk.C4439B;
import com.ironsource.mediationsdk.C4540aa;
import com.ironsource.mediationsdk.C4598ae;
import com.ironsource.mediationsdk.C4613c;
import com.ironsource.mediationsdk.C4616d;
import com.ironsource.mediationsdk.C4623g;
import com.ironsource.mediationsdk.C4624h;
import com.ironsource.mediationsdk.C4626i;
import com.ironsource.mediationsdk.C4665p;
import com.ironsource.mediationsdk.C4738x;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p128b.C4561b;
import com.ironsource.mediationsdk.adunit.p128b.C4562c;
import com.ironsource.mediationsdk.adunit.p128b.C4563d;
import com.ironsource.mediationsdk.adunit.p128b.C4570i;
import com.ironsource.mediationsdk.adunit.p129c.p130a.C4573b;
import com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a;
import com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c;
import com.ironsource.mediationsdk.adunit.p134e.C4595a;
import com.ironsource.mediationsdk.adunit.p134e.C4597b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4712a;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.C4728m;
import com.ironsource.mediationsdk.utils.C4729n;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.c.e */
public abstract class C4581e<Smash extends C4591c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements C4411j, C4562c, C4573b, C4597b, C4598ae, C4613c, C4623g {

    /* renamed from: a */
    protected C4595a<Smash> f11274a;

    /* renamed from: b */
    protected ConcurrentHashMap<String, C4707b> f11275b;

    /* renamed from: c */
    protected ConcurrentHashMap<String, C4626i.C4627a> f11276c;

    /* renamed from: d */
    protected C4624h f11277d;

    /* renamed from: e */
    protected C4626i f11278e;

    /* renamed from: f */
    protected int f11279f;

    /* renamed from: g */
    protected String f11280g = "";

    /* renamed from: h */
    protected JSONObject f11281h;

    /* renamed from: i */
    protected C4707b f11282i;

    /* renamed from: j */
    protected Placement f11283j;

    /* renamed from: k */
    protected boolean f11284k = false;

    /* renamed from: l */
    protected C4729n f11285l;

    /* renamed from: m */
    protected C4571a f11286m;

    /* renamed from: n */
    protected C4584a f11287n;

    /* renamed from: o */
    protected C4578c f11288o;

    /* renamed from: p */
    protected C4738x f11289p;

    /* renamed from: q */
    protected C4563d f11290q;

    /* renamed from: r */
    protected C4575b f11291r;

    /* renamed from: s */
    protected IronSourceSegment f11292s;

    /* renamed from: t */
    protected final Object f11293t = new Object();

    /* renamed from: u */
    private C4718f f11294u;

    /* renamed from: v */
    private C4718f f11295v;

    /* renamed from: w */
    private C4712a f11296w;

    /* renamed from: x */
    private long f11297x = 0;

    /* renamed from: y */
    private Boolean f11298y;

    /* renamed from: z */
    private Set<ImpressionDataListener> f11299z = new HashSet();

    /* renamed from: com.ironsource.mediationsdk.adunit.c.e$a */
    public enum C4584a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public C4581e(C4571a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.f11252a + ", loading mode = " + aVar.f11259h.f11262a);
        C4718f fVar = new C4718f();
        this.f11292s = ironSourceSegment;
        this.f11286m = aVar;
        this.f11290q = new C4563d(aVar.f11252a, C4563d.C4565b.MEDIATION, this);
        this.f11291r = new C4575b(this.f11286m.f11252a);
        this.f11288o = new C4578c(this.f11286m.f11259h, this);
        mo33820a(C4584a.NONE);
        this.f11299z = set;
        this.f11274a = new C4595a<>(this.f11286m.f11255d.f11787o, this.f11286m.f11255d.f11779g, this);
        this.f11290q.f11233a.mo33766a();
        this.f11275b = new ConcurrentHashMap<>();
        this.f11276c = new ConcurrentHashMap<>();
        this.f11283j = null;
        C4665p.m13650a().mo34054a(this.f11286m.f11252a, this.f11286m.f11257f);
        this.f11281h = new JSONObject();
        if (this.f11286m.mo33792a()) {
            this.f11277d = new C4624h(this.f11286m.f11252a.toString(), this.f11286m.f11255d, this);
        }
        m13364a(this.f11286m.f11254c, this.f11286m.f11255d.f11778f);
        m13373k();
        m13374l();
        this.f11294u = new C4718f();
        mo33820a(C4584a.READY_TO_LOAD);
        this.f11290q.f11233a.mo33767a(C4718f.m13801a(fVar));
        this.f11289p = new C4738x(aVar.f11260i, this);
        this.f11296w = new C4712a();
        if (this.f11286m.f11259h.mo33808b()) {
            IronLog.INTERNAL.verbose("first automatic load");
            mo33826e();
        }
    }

    /* renamed from: a */
    private static String m13359a(C4707b bVar, int i) {
        return String.format("%s%s", new Object[]{Integer.valueOf(i), bVar.mo34157a()});
    }

    /* renamed from: a */
    private String m13360a(List<C4707b> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4707b bVar = list.get(i);
            C4591c b = m13368b(bVar, str);
            if (b != null) {
                copyOnWriteArrayList.add(b);
                sb.append(m13359a(bVar, b.mo33845i()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.f11274a.mo33853a(this.f11286m.f11259h.f11262a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(mo33817a("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13361a(int i, String str, boolean z) {
        mo33820a(C4584a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a("errorCode = " + i + ", errorReason = " + str));
        if (this.f11286m.f11259h.mo33807a()) {
            if (z) {
                this.f11290q.f11234b.mo33769a(C4718f.m13801a(this.f11295v), i, str);
            }
            C4665p.m13650a().mo34055a(this.f11286m.f11252a, new IronSourceError(i, str));
        } else {
            if (z) {
                this.f11290q.f11237e.mo33774a(i, str);
            }
            mo33823a(false, false);
        }
        this.f11288o.mo33809a();
    }

    /* renamed from: a */
    private void m13364a(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f11278e = new C4626i(arrayList, i);
    }

    /* renamed from: a */
    private boolean m13365a(C4584a aVar, C4584a aVar2) {
        boolean z;
        synchronized (this.f11293t) {
            if (this.f11287n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(mo33817a("set state from '" + this.f11287n + "' to '" + aVar2 + "'"));
                z = true;
                this.f11287n = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m13367a(NetworkSettings networkSettings) {
        AdapterBaseInterface a = C4616d.m13502a().mo33893a(networkSettings, this.f11286m.f11252a);
        return (a instanceof AdapterSettingsInterface) && this.f11274a.mo33855a(this.f11286m.f11259h.f11262a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a).getLoadWhileShowSupportedState(networkSettings));
    }

    /* renamed from: b */
    private Smash m13368b(C4707b bVar, String str) {
        NetworkSettings a = this.f11286m.mo33791a(bVar.mo34157a());
        if (a != null) {
            C4616d.m13502a().mo33893a(a, this.f11286m.f11252a);
            BaseAdAdapter a2 = mo33815a(a, this.f11286m.f11252a);
            if (a2 != null) {
                Smash a3 = mo33816a(a, a2, C4731o.m13872a().mo34208b(this.f11286m.f11252a), str);
                this.f11275b.put(a3.mo33612k(), bVar);
                this.f11276c.put(bVar.mo34157a(), C4626i.C4627a.ISAuctionPerformanceDidntAttemptToLoad);
                return a3;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a.getProviderInstanceName();
            IronLog.INTERNAL.error(mo33817a(str2));
            this.f11290q.f11237e.mo33778b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + bVar.mo34157a();
            IronLog.INTERNAL.error(mo33817a(str3));
            this.f11290q.f11237e.mo33779c(str3);
        }
        return null;
    }

    /* renamed from: c */
    private void m13369c(Smash smash) {
        IronLog.INTERNAL.verbose(mo33817a(""));
        String b = this.f11275b.get(smash.mo33612k()).mo34158b();
        smash.mo33837b(b);
        smash.mo33836a(b);
    }

    /* renamed from: c */
    private boolean m13370c(boolean z) {
        boolean z2;
        synchronized (this.f11293t) {
            if (this.f11298y != null) {
                if (this.f11298y.booleanValue() == z) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    /* renamed from: i */
    private boolean m13371i() {
        boolean z;
        synchronized (this.f11293t) {
            z = this.f11287n == C4584a.LOADING;
        }
        return z;
    }

    /* renamed from: j */
    private boolean m13372j() {
        boolean z;
        synchronized (this.f11293t) {
            z = this.f11287n == C4584a.AUCTION;
        }
        return z;
    }

    /* renamed from: k */
    private void m13373k() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f11286m.f11254c) {
            arrayList.add(new C4728m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f11286m.f11252a)));
        }
        this.f11285l = new C4729n(arrayList);
    }

    /* renamed from: l */
    private void m13374l() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(mo33817a(""));
        for (NetworkSettings next : this.f11286m.f11254c) {
            if (next.isIronSource() || next.isBidder(this.f11286m.f11252a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f11286m.f11253b);
                if (this.f11286m.f11252a == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = next.getInterstitialSettings();
                } else if (this.f11286m.f11252a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = next.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.f11286m.f11252a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(C4615b.m13488a(jSONObject));
                AdData adData = new AdData((String) null, hashMap);
                AdapterBaseInterface a = C4616d.m13502a().mo33893a(next, this.f11286m.f11252a);
                if (a != null) {
                    try {
                        a.init(adData, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
                    } catch (Exception e) {
                        C4570i iVar = this.f11290q.f11237e;
                        iVar.mo33776a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.f11290q.f11237e.mo33776a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    /* renamed from: m */
    private void m13375m() {
        IronLog.INTERNAL.verbose(mo33817a(""));
        m13360a(m13376n(), m13382t());
    }

    /* renamed from: n */
    private List<C4707b> m13376n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f11286m.f11254c) {
            C4728m mVar = new C4728m(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f11286m.f11252a));
            if (!next.isBidder(this.f11286m.f11252a) && !this.f11285l.mo34204b(mVar) && m13367a(next)) {
                copyOnWriteArrayList.add(new C4707b(mVar.mo33612k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: o */
    private void m13377o() {
        Iterator it = m13378p().iterator();
        while (it.hasNext()) {
            m13369c((C4591c) it.next());
        }
    }

    /* renamed from: p */
    private ArrayList<Smash> m13378p() {
        StringBuilder sb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a("mWaterfall.size() = " + this.f11274a.mo33852a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.f11274a.mo33852a().size() || i2 >= this.f11286m.f11256e) {
                break;
            }
            C4591c cVar = (C4591c) this.f11274a.mo33852a().get(i);
            if (cVar.mo33841e()) {
                if (cVar.mo33839c() || cVar.mo33840d()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("smash = " + cVar.mo33846l());
                } else if (!cVar.mo33844h()) {
                    arrayList.add(cVar);
                } else if (i2 == 0) {
                    sb.append(cVar.mo33612k());
                    sb.append(". No other instances will be loaded at the same time.");
                    String sb2 = sb.toString();
                    IronLog.INTERNAL.verbose(mo33817a(sb2));
                    IronSourceUtils.sendAutomationLog(sb2);
                    arrayList.add(cVar);
                    i2++;
                } else {
                    sb = new StringBuilder("Advanced Loading: Won't start loading bidder ");
                    sb.append(cVar.mo33612k());
                    sb.append(" as a non bidder is being loaded");
                    String sb3 = sb.toString();
                    IronLog.INTERNAL.verbose(mo33817a(sb3));
                    IronSourceUtils.sendAutomationLog(sb3);
                }
                i2++;
            }
            i++;
        }
        if (i2 == 0) {
            m13361a(509, "Mediation No fill", true);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r2 <= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        new java.util.Timer().schedule(new com.ironsource.mediationsdk.adunit.p129c.C4581e.C45821(r5), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        m13380r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r2 = r5.f11286m.f11255d.f11781i - com.ironsource.mediationsdk.utils.C4718f.m13801a(r5.f11294u);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13379q() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo33817a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f11293t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f11287n     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.adunit.c.e$a r2 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.AUCTION     // Catch:{ all -> 0x0041 }
            if (r1 != r2) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x0016:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.AUCTION     // Catch:{ all -> 0x0041 }
            r5.mo33820a((com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a) r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.ironsource.mediationsdk.utils.f r0 = r5.f11294u
            long r0 = com.ironsource.mediationsdk.utils.C4718f.m13801a(r0)
            com.ironsource.mediationsdk.adunit.c.a r2 = r5.f11286m
            com.ironsource.mediationsdk.utils.c r2 = r2.f11255d
            long r2 = r2.f11781i
            long r2 = r2 - r0
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x003d
            java.util.Timer r0 = new java.util.Timer
            r0.<init>()
            com.ironsource.mediationsdk.adunit.c.e$1 r1 = new com.ironsource.mediationsdk.adunit.c.e$1
            r1.<init>()
            r0.schedule(r1, r2)
            return
        L_0x003d:
            r5.m13380r()
            return
        L_0x0041:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p129c.C4581e.m13379q():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m13380r() {
        IronLog.INTERNAL.verbose(mo33817a(""));
        AsyncTask.execute(new Runnable() {
            public final void run() {
                int i;
                C4570i iVar;
                String str;
                C4581e.this.f11281h = new JSONObject();
                C4581e.this.f11290q.f11235c.mo33757a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (NetworkSettings next : C4581e.this.f11286m.f11254c) {
                    if (!C4581e.this.f11285l.mo34204b(new C4728m(next.getProviderInstanceName(), next.getMaxAdsPerSession(C4581e.this.f11286m.f11252a))) && C4581e.this.m13367a(next)) {
                        if (next.isBidder(C4581e.this.f11286m.f11252a)) {
                            AdapterBaseInterface a = C4616d.m13502a().mo33893a(next, C4581e.this.f11286m.f11252a);
                            if (a instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(next.getProviderInstanceName(), biddingData);
                                        sb.append(next.getInstanceType(C4581e.this.f11286m.f11252a) + next.getProviderInstanceName() + ",");
                                    } else {
                                        C4581e.this.f11290q.f11237e.mo33780d("missing bidding data for " + next.getProviderInstanceName());
                                    }
                                } catch (Exception e) {
                                    iVar = C4581e.this.f11290q.f11237e;
                                    str = "exception while calling networkAdapter.getBiddingData - " + e;
                                }
                            } else {
                                str = a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface";
                                iVar = C4581e.this.f11290q.f11237e;
                                iVar.mo33776a(str);
                            }
                        } else {
                            arrayList.add(next.getProviderInstanceName());
                            sb.append(next.getInstanceType(C4581e.this.f11286m.f11252a) + next.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog.INTERNAL.verbose(C4581e.this.mo33817a("auction waterfallString = " + sb));
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    IronLog.INTERNAL.verbose(C4581e.this.mo33817a("auction failed - no candidates"));
                    C4581e.this.f11290q.f11235c.mo33759a(0, 1005, "No candidates available for auctioning");
                    C4581e eVar = C4581e.this;
                    IronSource.AD_UNIT ad_unit = eVar.f11286m.f11252a;
                    if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                        i = IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
                    } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                        i = 1024;
                    } else {
                        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                        i = 510;
                    }
                    eVar.m13361a(i, "Empty waterfall", true);
                    return;
                }
                C4581e.this.f11290q.f11235c.mo33760a(sb.toString());
                if (C4581e.this.f11277d != null) {
                    C4581e.this.f11277d.mo33907a(ContextProvider.getInstance().getApplicationContext(), hashMap, arrayList, C4581e.this.f11278e, C4731o.m13872a().mo34208b(C4581e.this.f11286m.f11252a), C4581e.this.f11292s);
                } else {
                    IronLog.INTERNAL.error(C4581e.this.mo33817a("mAuctionHandler is null"));
                }
            }
        });
    }

    /* renamed from: s */
    private void m13381s() {
        this.f11296w.mo34171a(this.f11286m.f11252a, false);
    }

    /* renamed from: t */
    private static String m13382t() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Adapter mo33815a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Smash mo33816a(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33817a(String str) {
        String name = this.f11286m.f11252a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    /* renamed from: a */
    public final Map<String, Object> mo33752a(C4561b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f11274a.f11342b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f11274a.f11342b);
        }
        JSONObject jSONObject = this.f11281h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f11281h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C4731o.m13872a().mo34208b(this.f11286m.f11252a)));
        if (!(bVar == C4561b.LOAD_AD_SUCCESS || bVar == C4561b.LOAD_AD_FAILED || bVar == C4561b.AUCTION_SUCCESS || bVar == C4561b.AUCTION_FAILED || bVar == C4561b.AD_UNIT_CAPPED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f11279f));
            if (!TextUtils.isEmpty(this.f11280g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f11280g);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo33818a(int i) {
        C4570i iVar = this.f11290q.f11237e;
        iVar.mo33790n("waterfalls hold too many with size = " + i);
    }

    /* renamed from: a */
    public final void mo33383a(int i, String str, int i2, String str2, long j) {
        String str3 = "";
        IronLog.INTERNAL.verbose(mo33817a(str3));
        if (m13372j()) {
            String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
            IronLog.INTERNAL.verbose(mo33817a(str4));
            StringBuilder sb = new StringBuilder();
            IronSource.AD_UNIT ad_unit = this.f11286m.f11252a;
            if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                str3 = "BN";
            }
            sb.append(str3);
            sb.append(": ");
            sb.append(str4);
            IronSourceUtils.sendAutomationLog(sb.toString());
            this.f11279f = i2;
            this.f11280g = str2;
            this.f11281h = new JSONObject();
            m13375m();
            this.f11290q.f11235c.mo33759a(j, i, str);
            mo33820a(C4584a.LOADING);
            m13377o();
            return;
        }
        this.f11290q.f11237e.mo33784h("unexpected auction fail - error = " + i + ", " + str);
    }

    /* renamed from: a */
    public final void mo33819a(IronSourceSegment ironSourceSegment) {
        this.f11292s = ironSourceSegment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33820a(C4584a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a("from " + this.f11287n + " to " + aVar));
        synchronized (this.f11293t) {
            this.f11287n = aVar;
        }
    }

    /* renamed from: a */
    public final void mo33800a(C4591c<?> cVar) {
        IronLog.INTERNAL.verbose(mo33817a(cVar.mo33846l()));
        if (cVar.mo33848n() != this.f11274a.f11342b) {
            String str = "onLoadSuccess was invoked with state = " + this.f11287n + " auctionId: " + cVar.mo33848n() + " and the current id is " + this.f11274a.f11342b;
            IronLog.INTERNAL.verbose(str);
            this.f11290q.f11237e.mo33785i(str);
            return;
        }
        this.f11276c.put(cVar.mo33612k(), C4626i.C4627a.ISAuctionPerformanceLoadedSuccessfully);
        if (m13365a(C4584a.LOADING, C4584a.READY_TO_SHOW)) {
            boolean z = false;
            if (this.f11286m.f11259h.mo33807a()) {
                C4575b bVar = this.f11291r;
                if (bVar.f11261a == IronSource.AD_UNIT.INTERSTITIAL) {
                    C4439B.m12623a().mo33284b();
                } else if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    C4540aa a = C4540aa.m13201a();
                    if (a.f11139a instanceof RewardedVideoManualListener) {
                        C4401c.f10496a.mo33210a(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.mediationsdk.aa.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.aa.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                } else {
                    IronLog.INTERNAL.warning("ad unit not supported - " + bVar.f11261a);
                }
            } else {
                mo33823a(true, false);
            }
            long a2 = C4718f.m13801a(this.f11295v);
            if (this.f11286m.f11252a == IronSource.AD_UNIT.REWARDED_VIDEO && this.f11286m.f11259h.f11262a == C4576a.C4577a.MANUAL) {
                z = true;
            }
            this.f11290q.f11234b.mo33770a(a2, z);
            if (this.f11286m.f11259h.mo33808b()) {
                this.f11289p.mo34227a(0);
            }
            if (this.f11286m.mo33792a()) {
                C4707b bVar2 = this.f11275b.get(cVar.mo33612k());
                if (bVar2 != null) {
                    C4624h.m13547a(bVar2, cVar.mo33845i(), this.f11282i);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.f11274a.mo33852a().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C4591c) it.next()).mo33612k());
                    }
                    C4624h.m13549a((ArrayList<String>) arrayList, this.f11275b, cVar.mo33845i(), this.f11282i, bVar2);
                    return;
                }
                String k = cVar.mo33612k();
                String str2 = "winner instance missing from waterfall - " + k;
                IronLog.INTERNAL.verbose(mo33817a(str2));
                this.f11290q.f11237e.mo33775a(1010, str2, k);
            }
        }
    }

    /* renamed from: a */
    public final void mo33821a(ImpressionDataListener impressionDataListener) {
        this.f11299z.add(impressionDataListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r6.hasNext() == false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
        m13369c((com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c) r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33801a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f11293t
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r3.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = r7.mo33846l()     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r5.mo33817a((java.lang.String) r3)     // Catch:{ all -> 0x00ce }
            r2.verbose(r3)     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = r7.mo33848n()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r3 = r5.f11274a     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r3.f11342b     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x0098
            com.ironsource.mediationsdk.adunit.c.e$a r2 = r5.f11287n     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.AUCTION     // Catch:{ all -> 0x00ce }
            if (r2 != r3) goto L_0x003a
            goto L_0x0098
        L_0x003a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f11276c     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = r7.mo33612k()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C4626i.C4627a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ all -> 0x00ce }
            boolean r2 = r5.m13371i()     // Catch:{ all -> 0x00ce }
            if (r2 != 0) goto L_0x007e
            boolean r2 = r5.mo33827f()     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0052
            goto L_0x007e
        L_0x0052:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f11290q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.f11237e     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.f11287n     // Catch:{ all -> 0x00ce }
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo33846l()     // Catch:{ all -> 0x00ce }
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch:{ all -> 0x00ce }
            r3.append(r6)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00ce }
            r2.mo33786j(r6)     // Catch:{ all -> 0x00ce }
            goto L_0x0082
        L_0x007e:
            java.util.ArrayList r0 = r5.m13378p()     // Catch:{ all -> 0x00ce }
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            java.util.Iterator r6 = r0.iterator()
        L_0x0087:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0097
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.p132d.p133a.C4591c) r7
            r5.m13369c(r7)
            goto L_0x0087
        L_0x0097:
            return
        L_0x0098:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.f11287n     // Catch:{ all -> 0x00ce }
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.mo33848n()     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.e.a<Smash> r7 = r5.f11274a     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = r7.f11342b     // Catch:{ all -> 0x00ce }
            r6.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.logger.IronLog r7 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00ce }
            r7.verbose(r6)     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.f11290q     // Catch:{ all -> 0x00ce }
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.f11237e     // Catch:{ all -> 0x00ce }
            r7.mo33786j(r6)     // Catch:{ all -> 0x00ce }
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ce }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p129c.C4581e.mo33801a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33822a(C4707b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo34156a(str);
            if (a != null) {
                for (ImpressionDataListener next : this.f11299z) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info(mo33817a("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a));
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(mo33817a("no auctionResponseItem or listener"));
    }

    /* renamed from: a */
    public final void mo33391a(List<C4707b> list, String str, C4707b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(mo33817a(""));
        if (m13372j()) {
            this.f11280g = "";
            this.f11279f = i;
            this.f11282i = bVar;
            this.f11281h = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f11290q.f11237e.mo33777b(i2, str2);
            }
            this.f11296w.mo34171a(this.f11286m.f11252a, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
            if (this.f11296w.mo34172a(this.f11286m.f11252a)) {
                this.f11290q.f11235c.mo33762c(str);
                m13361a(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
                return;
            }
            String a = m13360a(list, str);
            this.f11290q.f11235c.mo33758a(j);
            this.f11290q.f11235c.mo33761b(a);
            mo33820a(C4584a.LOADING);
            m13377o();
            return;
        }
        C4570i iVar = this.f11290q.f11237e;
        iVar.mo33783g("unexpected auction success for auctionId - " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (mo33814b() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3.f11298y.booleanValue() != false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33217a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f11284k
            if (r0 == 0) goto L_0x0048
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.f11286m
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f11259h
            boolean r0 = r0.mo33807a()
            if (r0 == 0) goto L_0x000f
            goto L_0x0048
        L_0x000f:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.f11298y
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x0043
        L_0x0029:
            r2 = 1
            if (r4 == 0) goto L_0x0039
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            boolean r0 = r3.mo33814b()
            if (r0 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            if (r4 != 0) goto L_0x0027
            java.lang.Boolean r0 = r3.f11298y
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0027
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r3.mo33823a((boolean) r4, (boolean) r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p129c.C4581e.mo33217a(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33823a(boolean z, boolean z2) {
        if (m13370c(z)) {
            this.f11298y = Boolean.valueOf(z);
            long j = 0;
            if (this.f11297x != 0) {
                j = new Date().getTime() - this.f11297x;
            }
            this.f11297x = new Date().getTime();
            this.f11290q.f11234b.mo33772a(z, j, z2);
            this.f11291r.mo33805a(z);
        }
    }

    /* renamed from: b */
    public final void mo33802b(C4591c<?> cVar) {
        IronLog.INTERNAL.verbose(mo33817a(cVar.mo33846l()));
        C4575b bVar = this.f11291r;
        Placement placement = this.f11283j;
        if (bVar.f11261a == IronSource.AD_UNIT.INTERSTITIAL) {
            C4439B.m12623a().mo33289f();
        } else if (bVar.f11261a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C4540aa.m13201a().mo33679b(placement);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f11261a);
        }
    }

    /* renamed from: b */
    public final void mo33824b(ImpressionDataListener impressionDataListener) {
        this.f11299z.remove(impressionDataListener);
    }

    /* renamed from: b */
    public final void mo33825b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo33817a("track = " + z));
        this.f11284k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo33814b();

    /* renamed from: c_ */
    public final void mo33397c_() {
        if (this.f11286m.f11259h.mo33808b()) {
            mo33820a(C4584a.READY_TO_LOAD);
            mo33823a(false, true);
            mo33826e();
        }
    }

    /* renamed from: d */
    public final void mo33398d() {
        IronLog.INTERNAL.verbose(mo33817a(""));
        mo33826e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fd, code lost:
        if (r5.f11286m.mo33792a() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        m13375m();
        m13377o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33826e() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo33817a((java.lang.String) r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f11293t
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f11259h     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.mo33808b()     // Catch:{ all -> 0x0106 }
            r2 = 1
            if (r1 == 0) goto L_0x0034
            com.ironsource.mediationsdk.utils.n r1 = r5.f11285l     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.mo34203a()     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = "all smashes are capped"
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0106 }
            java.lang.String r4 = r5.mo33817a((java.lang.String) r1)     // Catch:{ all -> 0x0106 }
            r3.verbose(r4)     // Catch:{ all -> 0x0106 }
            r3 = 80001(0x13881, float:1.12105E-40)
            r5.m13361a(r3, r1, r2)     // Catch:{ all -> 0x0106 }
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            return
        L_0x0034:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f11259h     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f11262a     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0106 }
            r4 = 0
            if (r1 == r3) goto L_0x0074
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f11287n     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.SHOWING     // Catch:{ all -> 0x0106 }
            if (r1 != r3) goto L_0x0074
            java.lang.String r1 = "load cannot be invoked while showing an ad"
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = r5.mo33817a((java.lang.String) r1)     // Catch:{ all -> 0x0106 }
            r2.error(r3)     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f11252a     // Catch:{ all -> 0x0106 }
            int r3 = com.ironsource.mediationsdk.adunit.p127a.C4559a.m13273b(r3)     // Catch:{ all -> 0x0106 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f11259h     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.mo33807a()     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x006d
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f11291r     // Catch:{ all -> 0x0106 }
            r1.mo33804a((com.ironsource.mediationsdk.logger.IronSourceError) r2)     // Catch:{ all -> 0x0106 }
            goto L_0x0072
        L_0x006d:
            com.ironsource.mediationsdk.adunit.c.b r1 = r5.f11291r     // Catch:{ all -> 0x0106 }
            r1.mo33805a((boolean) r4)     // Catch:{ all -> 0x0106 }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            return
        L_0x0074:
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f11259h     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f11262a     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0106 }
            if (r1 == r3) goto L_0x00a5
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f11287n     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.READY_TO_LOAD     // Catch:{ all -> 0x0106 }
            if (r1 == r3) goto L_0x008a
            com.ironsource.mediationsdk.adunit.c.e$a r1 = r5.f11287n     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.e$a r3 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.READY_TO_SHOW     // Catch:{ all -> 0x0106 }
            if (r1 != r3) goto L_0x0098
        L_0x008a:
            com.ironsource.mediationsdk.p r1 = com.ironsource.mediationsdk.C4665p.m13650a()     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r3 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = r3.f11252a     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.mo34056a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x00a5
        L_0x0098:
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x0106 }
            java.lang.String r2 = "load is already in progress"
            java.lang.String r2 = r5.mo33817a((java.lang.String) r2)     // Catch:{ all -> 0x0106 }
            r1.error(r2)     // Catch:{ all -> 0x0106 }
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            return
        L_0x00a5:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0106 }
            r1.<init>()     // Catch:{ all -> 0x0106 }
            r5.f11281h = r1     // Catch:{ all -> 0x0106 }
            r5.m13381s()     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = r1.f11252a     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0106 }
            if (r1 != r3) goto L_0x00c2
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a r1 = r1.f11259h     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r1 = r1.f11262a     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.b.a$a r3 = com.ironsource.mediationsdk.adunit.p129c.p131b.C4576a.C4577a.MANUAL     // Catch:{ all -> 0x0106 }
            if (r1 != r3) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f11290q     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.b.h r1 = r1.f11234b     // Catch:{ all -> 0x0106 }
            r1.mo33771a(r2)     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f     // Catch:{ all -> 0x0106 }
            r1.<init>()     // Catch:{ all -> 0x0106 }
            r5.f11295v = r1     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r1 = r5.f11286m     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.mo33792a()     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x00f1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r5.f11276c     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0106 }
            if (r1 != 0) goto L_0x00ed
            com.ironsource.mediationsdk.i r1 = r5.f11278e     // Catch:{ all -> 0x0106 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f11276c     // Catch:{ all -> 0x0106 }
            r1.mo33911a((java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.C4626i.C4627a>) r2)     // Catch:{ all -> 0x0106 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r1 = r5.f11276c     // Catch:{ all -> 0x0106 }
            r1.clear()     // Catch:{ all -> 0x0106 }
        L_0x00ed:
            r5.m13379q()     // Catch:{ all -> 0x0106 }
            goto L_0x00f6
        L_0x00f1:
            com.ironsource.mediationsdk.adunit.c.e$a r1 = com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a.LOADING     // Catch:{ all -> 0x0106 }
            r5.mo33820a((com.ironsource.mediationsdk.adunit.p129c.C4581e.C4584a) r1)     // Catch:{ all -> 0x0106 }
        L_0x00f6:
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            com.ironsource.mediationsdk.adunit.c.a r0 = r5.f11286m
            boolean r0 = r0.mo33792a()
            if (r0 != 0) goto L_0x0105
            r5.m13375m()
            r5.m13377o()
        L_0x0105:
            return
        L_0x0106:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0106 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p129c.C4581e.mo33826e():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo33827f() {
        boolean z;
        synchronized (this.f11293t) {
            z = this.f11287n == C4584a.READY_TO_SHOW;
        }
        return z;
    }

    /* renamed from: g */
    public final void mo33828g() {
        this.f11299z.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo33829h() {
        Placement placement = this.f11283j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
