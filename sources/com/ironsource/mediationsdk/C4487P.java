package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C4626i;
import com.ironsource.mediationsdk.C4643m;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C4651f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p135b.C4609b;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.server.C4707b;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.P */
public final class C4487P extends C4663n implements C4494Q, C4609b.C4610a, C4623g {

    /* renamed from: c */
    C4615b f10839c;

    /* renamed from: d */
    C4609b f10840d;

    /* renamed from: e */
    IronSourceBannerLayout f10841e;

    /* renamed from: f */
    C4651f f10842f;

    /* renamed from: g */
    C4495R f10843g;

    /* renamed from: h */
    int f10844h;

    /* renamed from: i */
    final ConcurrentHashMap<String, C4495R> f10845i;

    /* renamed from: j */
    C4624h f10846j;

    /* renamed from: k */
    C4626i f10847k;

    /* renamed from: l */
    ConcurrentHashMap<String, C4626i.C4627a> f10848l;

    /* renamed from: m */
    long f10849m;

    /* renamed from: n */
    private C4493a f10850n = C4493a.NONE;

    /* renamed from: o */
    private int f10851o;

    /* renamed from: p */
    private CopyOnWriteArrayList<C4495R> f10852p;

    /* renamed from: q */
    private String f10853q;

    /* renamed from: r */
    private JSONObject f10854r;

    /* renamed from: s */
    private String f10855s = "";

    /* renamed from: t */
    private int f10856t;

    /* renamed from: u */
    private C4707b f10857u;

    /* renamed from: v */
    private ConcurrentHashMap<String, C4707b> f10858v;

    /* renamed from: w */
    private final Object f10859w = new Object();

    /* renamed from: x */
    private C4718f f10860x;

    /* renamed from: com.ironsource.mediationsdk.P$a */
    enum C4493a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C4487P(List<NetworkSettings> list, C4615b bVar, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.mo33881c());
        this.f10839c = bVar;
        this.f10840d = new C4609b(bVar.mo33885g());
        this.f10845i = new ConcurrentHashMap<>();
        this.f10852p = new CopyOnWriteArrayList<>();
        this.f10858v = new ConcurrentHashMap<>();
        this.f10848l = new ConcurrentHashMap<>();
        this.f10844h = C4731o.m13872a().mo34207b(3);
        C4631j.m13569a().f11502a = this.f10839c.mo33883e();
        if (this.f10839c.mo33881c()) {
            this.f10846j = new C4624h("banner", this.f10839c.mo33886h(), this);
        }
        m12890a(list);
        m12893b(list);
        this.f10849m = new Date().getTime();
        mo33526a(C4493a.READY_TO_LOAD);
    }

    /* renamed from: a */
    static /* synthetic */ ISBannerSize m12885a(C4487P p) {
        IronSourceBannerLayout ironSourceBannerLayout = p.f10841e;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return p.f10841e.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.f10706a : ISBannerSize.BANNER : p.f10841e.getSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12886a(int i, Object[][] objArr) {
        mo33524a(i, objArr, this.f10844h);
    }

    /* renamed from: a */
    private void m12889a(C4495R r, C4707b bVar) {
        C4624h.m13548a(bVar, r.mo33610i(), this.f10857u, mo33535e());
        mo34047a(this.f10858v.get(r.mo33612k()), mo33535e());
    }

    /* renamed from: a */
    private void m12890a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f10847k = new C4626i(arrayList, this.f10839c.mo33886h().f11778f);
    }

    /* renamed from: a */
    private static void m12891a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
            if (iSBannerSize.isAdaptive()) {
                String str = "Adaptive=true";
                if (jSONObject.has(IronSourceConstants.EVENTS_EXT1)) {
                    str = jSONObject.optString(IronSourceConstants.EVENTS_EXT1) + " , Adaptive=true";
                }
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12892a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f10850n);
        if (mo33530a(C4493a.STARTED_LOADING, this.f10839c.mo33881c() ? z ? C4493a.AUCTION : C4493a.FIRST_AUCTION : z ? C4493a.RELOADING : C4493a.LOADING)) {
            this.f10860x = new C4718f();
            this.f10853q = "";
            this.f10854r = null;
            this.f10851o = 0;
            this.f10844h = C4731o.m13872a().mo34207b(3);
            m12886a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f10839c.mo33881c()) {
                mo33533d();
                return;
            }
            m12898g();
            m12896f();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.error("wrong state - " + this.f10850n);
    }

    /* renamed from: b */
    private void m12893b(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a = C4616d.m13502a().mo33892a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a != null) {
                C4495R r = new C4495R(this.f10839c, this, networkSettings, a, this.f10844h, m12905n());
                this.f10845i.put(r.mo33612k(), r);
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    /* renamed from: b */
    private static boolean m12894b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502 || i == 3506;
    }

    /* renamed from: c */
    private String m12895c(List<C4707b> list) {
        int i;
        int i2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("waterfall.size() = " + list.size());
        this.f10852p.clear();
        this.f10858v.clear();
        this.f10848l.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            C4707b bVar = list.get(i3);
            C4495R r = this.f10845i.get(bVar.mo34157a());
            if (r != null) {
                AbstractAdapter a = C4616d.m13502a().mo33891a(r.f11016d.f11591a);
                if (a != null) {
                    C4615b bVar2 = this.f10839c;
                    NetworkSettings networkSettings = r.f11016d.f11591a;
                    int i4 = this.f10844h;
                    String str = this.f10853q;
                    JSONObject jSONObject = this.f10854r;
                    int i5 = this.f10856t;
                    C4495R r2 = r0;
                    String str2 = this.f10855s;
                    i = i3;
                    i2 = 1;
                    C4495R r3 = new C4495R(bVar2, this, networkSettings, a, i4, str, jSONObject, i5, str2, m12905n());
                    r2.f11017e = true;
                    this.f10852p.add(r2);
                    this.f10858v.put(r2.mo33612k(), bVar);
                    this.f10848l.put(bVar.mo34157a(), C4626i.C4627a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("could not find matching smash for auction response item - item = " + bVar.mo34157a());
            }
            C4495R r4 = this.f10845i.get(bVar.mo34157a());
            String str3 = "1";
            if (r4 == null ? !TextUtils.isEmpty(bVar.mo34158b()) : r4.mo33609h()) {
                str3 = "2";
            }
            sb.append(str3 + bVar.mo34157a());
            int i6 = i;
            if (i6 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i6 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* renamed from: f */
    private void m12896f() {
        int i = this.f10851o;
        while (true) {
            String str = null;
            if (i < this.f10852p.size()) {
                C4495R r = this.f10852p.get(i);
                if (r.f11017e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + r.mo33617p());
                    this.f10851o = i + 1;
                    IronSourceBannerLayout ironSourceBannerLayout = this.f10841e;
                    if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                        if (r.mo33609h()) {
                            str = this.f10858v.get(r.mo33612k()).mo34158b();
                            r.mo33608b(str);
                        }
                        r.mo33543a(this.f10841e.mo33415a(), this.f10842f, str);
                        return;
                    }
                    return;
                }
                i++;
            } else {
                String str2 = this.f10852p.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                m12897f((C4495R) null);
                if (mo33530a(C4493a.LOADING, C4493a.READY_TO_LOAD)) {
                    m12886a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10860x))}});
                    C4631j.m13569a().mo33932a(this.f10841e, new IronSourceError(606, str2));
                    return;
                } else if (mo33530a(C4493a.RELOADING, C4493a.LOADED)) {
                    m12886a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10860x))}});
                    this.f10840d.mo33875a(this);
                    return;
                } else {
                    mo33526a(C4493a.READY_TO_LOAD);
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("wrong state = " + this.f10850n);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m12897f(C4495R r) {
        Iterator<C4495R> it = this.f10852p.iterator();
        while (it.hasNext()) {
            C4495R next = it.next();
            if (!next.equals(r)) {
                next.mo33546d();
            }
        }
    }

    /* renamed from: g */
    private void m12898g() {
        List<C4707b> h = m12899h();
        this.f10853q = m13642c();
        m12895c(h);
    }

    /* renamed from: h */
    private List<C4707b> m12899h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C4495R next : this.f10845i.values()) {
            if (!next.mo33609h() && !C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), mo33535e())) {
                copyOnWriteArrayList.add(new C4707b(next.mo33612k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private boolean m12900i() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10841e;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: j */
    private ISBannerSize m12901j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10841e;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m12902k() {
        boolean z;
        synchronized (this.f10859w) {
            if (this.f10850n != C4493a.LOADING) {
                if (this.f10850n != C4493a.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: l */
    private boolean m12903l() {
        boolean z;
        synchronized (this.f10859w) {
            if (this.f10850n != C4493a.FIRST_AUCTION) {
                if (this.f10850n != C4493a.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    private boolean m12904m() {
        boolean z;
        synchronized (this.f10859w) {
            z = this.f10850n == C4493a.LOADED;
        }
        return z;
    }

    /* renamed from: n */
    private boolean m12905n() {
        return this.f10850n == C4493a.RELOADING || this.f10850n == C4493a.AUCTION;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33522a() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.d r0 = com.ironsource.lifecycle.C4421d.m12604a()
            boolean r0 = r0.mo33235b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f10841e
            if (r0 != 0) goto L_0x0020
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L_0x001b:
            r0.verbose(r3)
            r0 = 0
            goto L_0x0056
        L_0x0020:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x002b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x001b
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f10841e
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L_0x001b
        L_0x0038:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f10841e
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L_0x0056:
            if (r0 == 0) goto L_0x0085
            com.ironsource.mediationsdk.P$a r0 = com.ironsource.mediationsdk.C4487P.C4493a.LOADED
            com.ironsource.mediationsdk.P$a r3 = com.ironsource.mediationsdk.C4487P.C4493a.STARTED_LOADING
            boolean r0 = r6.mo33530a((com.ironsource.mediationsdk.C4487P.C4493a) r0, (com.ironsource.mediationsdk.C4487P.C4493a) r3)
            if (r0 == 0) goto L_0x006d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.m12892a((boolean) r1)
            goto L_0x0082
        L_0x006d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.P$a r4 = r6.f10850n
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L_0x0082:
            r0 = 0
            r3 = 0
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x008a:
            r3 = 1
        L_0x008b:
            if (r3 == 0) goto L_0x00af
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.m12886a((int) r0, (java.lang.Object[][]) r3)
            com.ironsource.mediationsdk.b.b r0 = r6.f10840d
            r0.mo33875a(r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4487P.mo33522a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33523a(int i) {
        m12886a(i, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo33383a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m12903l()) {
            this.f10855s = str2;
            this.f10856t = i2;
            this.f10854r = null;
            m12898g();
            m12886a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            mo33526a(this.f10850n == C4493a.FIRST_AUCTION ? C4493a.LOADING : C4493a.RELOADING);
            m12896f();
            return;
        }
        IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.f10850n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33524a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize j = m12901j();
            if (j != null) {
                m12891a(mediationAdditionalData, j);
            }
            if (this.f10842f != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, mo33535e());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.f10853q)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10853q);
            }
            if (this.f10854r != null && this.f10854r.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10854r);
            }
            if (m12894b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f10856t);
                if (!TextUtils.isEmpty(this.f10855s)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f10855s);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        C4533d.m13173e().mo33649b(new C4532c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void mo33525a(final IronSourceBannerLayout ironSourceBannerLayout, final C4651f fVar) {
        IronLog.INTERNAL.verbose("");
        mo34044a(IronSource.AD_UNIT.BANNER);
        if (!mo33530a(C4493a.READY_TO_LOAD, C4493a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C4631j.m13569a().mo33934b()) {
            C44881 r0 = new C4643m.C4645b() {
                /* renamed from: a */
                public final void mo33537a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + fVar.getPlacementName());
                    C4487P.this.f10841e = ironSourceBannerLayout;
                    C4487P.this.f10842f = fVar;
                    if (C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                        IronLog.INTERNAL.verbose("placement is capped");
                        C4631j a = C4631j.m13569a();
                        IronSourceBannerLayout ironSourceBannerLayout = ironSourceBannerLayout;
                        a.mo33932a(ironSourceBannerLayout, new IronSourceError(604, "placement " + fVar.getPlacementName() + " is capped"));
                        C4487P.this.m12886a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                        C4487P.this.mo33526a(C4493a.READY_TO_LOAD);
                        return;
                    }
                    C4487P.this.m12892a(false);
                }

                /* renamed from: a */
                public final void mo33538a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            };
            String str = null;
            if (!C4643m.m13621a(ironSourceBannerLayout)) {
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                str = String.format("can't load banner - %s", objArr);
            }
            if (fVar == null || TextUtils.isEmpty(fVar.getPlacementName())) {
                Object[] objArr2 = new Object[1];
                objArr2[0] = fVar == null ? "placement is null" : "placement name is empty";
                str = String.format("can't load banner - %s", objArr2);
            }
            if (!TextUtils.isEmpty(str)) {
                IronLog.INTERNAL.error(str);
                r0.mo33538a(str);
                return;
            }
            r0.mo33537a();
        } else {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33526a(C4493a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f10850n + "' to '" + aVar + "'");
        synchronized (this.f10859w) {
            this.f10850n = aVar;
        }
    }

    /* renamed from: a */
    public final void mo33527a(C4495R r) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(r.mo33617p());
        if (m12900i()) {
            this.f10841e.mo33420c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo33524a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, r.mo33614m());
    }

    /* renamed from: a */
    public final void mo33528a(C4495R r, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        C4495R r2 = r;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + r.mo33617p());
        if (r2.f10878a != this.f10853q) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + r2.f10878a + " and the current id is " + this.f10853q);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            r2.mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + r2.f10878a + " State - " + this.f10850n}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.mo33612k()}});
        } else if (m12902k()) {
            C4495R r3 = this.f10843g;
            if (r3 != null) {
                r3.mo33546d();
            }
            m12897f(r);
            this.f10843g = r2;
            IronSourceBannerLayout ironSourceBannerLayout = this.f10841e;
            if (ironSourceBannerLayout != null) {
                ironSourceBannerLayout.mo33416a(view, layoutParams);
            }
            this.f10848l.put(r.mo33612k(), C4626i.C4627a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f10839c.mo33881c()) {
                C4707b bVar = this.f10858v.get(r.mo33612k());
                if (bVar != null) {
                    C4624h.m13547a(bVar, r.mo33610i(), this.f10857u);
                    this.f10846j.mo33908a((CopyOnWriteArrayList<C4514Y>) this.f10852p, this.f10858v, r.mo33610i(), this.f10857u, bVar);
                    if (!this.f10839c.mo33886h().f11791s) {
                        m12889a(r2, bVar);
                    }
                } else {
                    String k = r.mo33612k();
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.f10853q);
                    m12886a((int) IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.f10850n == C4493a.LOADING) {
                if (m12900i()) {
                    this.f10841e.mo33418a(r.mo33612k());
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10860x))}};
                } else {
                    objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10860x))}};
                }
                m12886a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                m12886a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10860x))}});
            }
            String e = mo33535e();
            C4723k.m13843f(ContextProvider.getInstance().getCurrentActiveActivity(), e);
            if (C4723k.m13837b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), e)) {
                m12886a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            C4731o.m13872a().mo34205a(3);
            mo33526a(C4493a.LOADED);
            this.f10840d.mo33875a(this);
        } else {
            IronLog ironLog4 = IronLog.INTERNAL;
            ironLog4.warning("wrong state - mCurrentState = " + this.f10850n);
        }
    }

    /* renamed from: a */
    public final void mo33529a(IronSourceError ironSourceError, C4495R r) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (r.f10878a != this.f10853q) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + r.f10878a + " and the current id is " + this.f10853q);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            r.mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + r.f10878a + " State - " + this.f10850n}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.mo33612k()}});
        } else if (m12902k()) {
            this.f10848l.put(r.mo33612k(), C4626i.C4627a.ISAuctionPerformanceFailedToLoad);
            m12896f();
        } else {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.f10850n);
        }
    }

    /* renamed from: a */
    public final void mo33391a(List<C4707b> list, String str, C4707b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m12903l()) {
            this.f10855s = "";
            this.f10853q = str;
            this.f10856t = i;
            this.f10857u = bVar;
            this.f10854r = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                m12886a((int) IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
            }
            mo34048a(jSONObject2, IronSource.AD_UNIT.BANNER);
            if (this.f11672a.mo34172a(IronSource.AD_UNIT.BANNER)) {
                m12886a((int) IronSourceConstants.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_AUCTION_ID, str}});
                mo33526a(C4493a.READY_TO_LOAD);
                C4631j.m13569a().mo33932a(this.f10841e, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
                return;
            }
            m12886a((int) IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
            mo33526a(this.f10850n == C4493a.FIRST_AUCTION ? C4493a.LOADING : C4493a.RELOADING);
            m12886a((int) IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m12895c(list)}});
            m12896f();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mCurrentState = " + this.f10850n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo33530a(C4493a aVar, C4493a aVar2) {
        boolean z;
        synchronized (this.f10859w) {
            if (this.f10850n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f10850n + "' to '" + aVar2 + "'");
                z = true;
                this.f10850n = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo33531b(C4495R r) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(r.mo33617p());
        if (m12900i()) {
            this.f10841e.mo33422e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo33524a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, r.mo33614m());
    }

    /* renamed from: c */
    public final void mo33532c(C4495R r) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(r.mo33617p());
        if (m12900i()) {
            this.f10841e.mo33421d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo33524a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, r.mo33614m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo33533d() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() {
            public final void run() {
                boolean z;
                C4487P p = C4487P.this;
                if (!p.f10848l.isEmpty()) {
                    p.f10847k.mo33911a(p.f10848l);
                    p.f10848l.clear();
                }
                C4487P p2 = C4487P.this;
                long d = p2.f10839c.mo33882d() - (new Date().getTime() - p2.f10849m);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            C4487P.this.mo33533d();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C4487P.this.mo33523a((int) IronSourceConstants.BN_AUCTION_REQUEST);
                    C4643m.m13620a(C4487P.this.mo33535e(), C4487P.this.f10845i, new C4643m.C4644a() {
                        /* renamed from: a */
                        public final void mo33540a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("auction waterfallString = " + sb);
                            if (map.size() == 0 && list.size() == 0) {
                                C4487P.this.m12886a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{IronSourceConstants.EVENTS_DURATION, 0}});
                                if (C4487P.this.mo33530a(C4493a.AUCTION, C4493a.LOADED)) {
                                    C4487P.this.f10840d.mo33875a(C4487P.this);
                                    return;
                                }
                                C4631j.m13569a().mo33932a(C4487P.this.f10841e, new IronSourceError(1005, "No candidates available for auctioning"));
                                C4487P.this.m12886a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                                C4487P.this.mo33526a(C4493a.READY_TO_LOAD);
                                return;
                            }
                            C4487P.this.m12886a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                            if (C4487P.this.f10846j != null) {
                                C4624h hVar = C4487P.this.f10846j;
                                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                C4626i iVar = C4487P.this.f10847k;
                                int i = C4487P.this.f10844h;
                                IronSourceSegment ironSourceSegment = C4487P.this.f11673b;
                                hVar.f11429a = C4487P.m12885a(C4487P.this);
                                hVar.mo33907a(applicationContext, map, list, iVar, i, ironSourceSegment);
                                return;
                            }
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo33534d(C4495R r) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(r.mo33617p());
        if (m12900i()) {
            this.f10841e.mo33423f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo33524a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, r.mo33614m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo33535e() {
        C4651f fVar = this.f10842f;
        return fVar != null ? fVar.getPlacementName() : "";
    }

    /* renamed from: e */
    public final void mo33536e(C4495R r) {
        C4707b bVar;
        IronLog.INTERNAL.verbose(r.mo33617p());
        if (m12904m()) {
            if (this.f10839c.mo33881c() && this.f10839c.mo33886h().f11791s && (bVar = this.f10858v.get(r.mo33612k())) != null) {
                m12889a(r, bVar);
            }
            m12886a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.f10850n);
        String k = r.mo33612k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        m12886a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f10850n}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }
}
