package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.environment.C4407h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p125f.C4405b;
import com.ironsource.mediationsdk.C4476M;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p129c.C4586g;
import com.ironsource.mediationsdk.adunit.p129c.C4587h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.impressionData.C4628a;
import com.ironsource.mediationsdk.logger.C4640b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.C4650e;
import com.ironsource.mediationsdk.model.C4651f;
import com.ironsource.mediationsdk.model.C4652g;
import com.ironsource.mediationsdk.model.C4653h;
import com.ironsource.mediationsdk.model.C4655j;
import com.ironsource.mediationsdk.model.C4661o;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.sdk.C4679i;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.C4719g;
import com.ironsource.mediationsdk.utils.C4721i;
import com.ironsource.mediationsdk.utils.C4723k;
import com.ironsource.mediationsdk.utils.C4726l;
import com.ironsource.mediationsdk.utils.C4733p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p118c.C4367a;
import com.ironsource.p119d.C4370a;
import com.ironsource.p119d.C4371b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.H */
public final class C4455H implements C4721i {

    /* renamed from: ap */
    private static boolean f10601ap = false;

    /* renamed from: A */
    C4497S f10602A;

    /* renamed from: B */
    C4487P f10603B;

    /* renamed from: C */
    C4586g f10604C;

    /* renamed from: D */
    C4587h f10605D;

    /* renamed from: E */
    boolean f10606E;

    /* renamed from: F */
    boolean f10607F;

    /* renamed from: G */
    boolean f10608G;

    /* renamed from: H */
    boolean f10609H;

    /* renamed from: I */
    boolean f10610I;

    /* renamed from: J */
    boolean f10611J;

    /* renamed from: K */
    boolean f10612K;

    /* renamed from: L */
    int f10613L;

    /* renamed from: M */
    C4670s f10614M;

    /* renamed from: N */
    C4667q f10615N;

    /* renamed from: O */
    C4628a f10616O;

    /* renamed from: P */
    private final String f10617P;

    /* renamed from: Q */
    private final String f10618Q;

    /* renamed from: R */
    private AbstractAdapter f10619R;

    /* renamed from: S */
    private AtomicBoolean f10620S;

    /* renamed from: T */
    private final Object f10621T;

    /* renamed from: U */
    private AtomicBoolean f10622U;

    /* renamed from: V */
    private boolean f10623V;

    /* renamed from: W */
    private List<IronSource.AD_UNIT> f10624W;

    /* renamed from: X */
    private Set<IronSource.AD_UNIT> f10625X;

    /* renamed from: Y */
    private Set<IronSource.AD_UNIT> f10626Y;

    /* renamed from: Z */
    private boolean f10627Z;

    /* renamed from: a */
    final String f10628a;

    /* renamed from: aa */
    private final String f10629aa;

    /* renamed from: ab */
    private boolean f10630ab;

    /* renamed from: ac */
    private boolean f10631ac;

    /* renamed from: ad */
    private Boolean f10632ad;

    /* renamed from: ae */
    private IronSourceBannerLayout f10633ae;

    /* renamed from: af */
    private String f10634af;

    /* renamed from: ag */
    private InitializationListener f10635ag;

    /* renamed from: ah */
    private AtomicBoolean f10636ah;

    /* renamed from: ai */
    private boolean f10637ai;

    /* renamed from: aj */
    private CopyOnWriteArraySet<String> f10638aj;

    /* renamed from: ak */
    private CopyOnWriteArraySet<String> f10639ak;

    /* renamed from: al */
    private CopyOnWriteArraySet<String> f10640al;

    /* renamed from: am */
    private C4711u f10641am;

    /* renamed from: an */
    private C4371b f10642an;

    /* renamed from: ao */
    private C4604ai f10643ao;

    /* renamed from: b */
    C4551ab f10644b;

    /* renamed from: c */
    C4450E f10645c;

    /* renamed from: d */
    C4486O f10646d;

    /* renamed from: e */
    C4633k f10647e;

    /* renamed from: f */
    IronSourceLoggerManager f10648f;

    /* renamed from: g */
    C4679i f10649g;

    /* renamed from: h */
    C4640b f10650h;

    /* renamed from: i */
    C4726l f10651i;

    /* renamed from: j */
    public String f10652j;

    /* renamed from: k */
    public String f10653k;

    /* renamed from: l */
    String f10654l;

    /* renamed from: m */
    public String f10655m;

    /* renamed from: n */
    public Map<String, String> f10656n;

    /* renamed from: o */
    public String f10657o;

    /* renamed from: p */
    public String f10658p;

    /* renamed from: q */
    Context f10659q;

    /* renamed from: r */
    Boolean f10660r;

    /* renamed from: s */
    IronSourceSegment f10661s;

    /* renamed from: t */
    int f10662t;

    /* renamed from: u */
    boolean f10663u;

    /* renamed from: v */
    boolean f10664v;

    /* renamed from: w */
    boolean f10665w;

    /* renamed from: x */
    boolean f10666x;

    /* renamed from: y */
    Boolean f10667y;

    /* renamed from: z */
    C4741z f10668z;

    /* renamed from: com.ironsource.mediationsdk.H$1 */
    static /* synthetic */ class C44561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f10669a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10670b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.C4723k.C4725a.m13850a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10670b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.C4723k.C4725a.f11845a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f10670b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.C4723k.C4725a.f11846b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = f10670b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.C4723k.C4725a.f11847c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = f10670b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.C4723k.C4725a.f11848d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10669a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f10669a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = f10669a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10669a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.C44561.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.H$a */
    public interface C4457a {
        /* renamed from: a */
        void mo33381a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.H$b */
    static class C4458b {

        /* renamed from: a */
        static volatile C4455H f10671a = new C4455H((byte) 0);
    }

    private C4455H() {
        this.f10628a = getClass().getName();
        this.f10617P = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.2.1.1";
        this.f10618Q = "Activity=";
        this.f10621T = new Object();
        this.f10651i = null;
        this.f10652j = null;
        this.f10653k = null;
        this.f10654l = null;
        this.f10655m = null;
        this.f10656n = null;
        this.f10657o = null;
        this.f10623V = false;
        this.f10658p = null;
        this.f10660r = null;
        this.f10627Z = true;
        this.f10629aa = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f10667y = null;
        this.f10648f = IronSourceLoggerManager.getLogger(0);
        C4640b bVar = new C4640b((LogListener) null, 1);
        this.f10650h = bVar;
        this.f10648f.addLogger(bVar);
        this.f10649g = new C4679i();
        C4551ab abVar = new C4551ab();
        this.f10644b = abVar;
        abVar.f11155m = this.f10649g;
        C4450E e = new C4450E();
        this.f10645c = e;
        C4679i iVar = this.f10649g;
        e.f10581m = iVar;
        e.f10582n.f11679a = iVar;
        C4486O o = new C4486O();
        this.f10646d = o;
        o.f10831b = this.f10649g;
        this.f10620S = new AtomicBoolean();
        this.f10625X = new HashSet();
        this.f10626Y = new HashSet();
        this.f10664v = false;
        this.f10663u = false;
        this.f10630ab = false;
        this.f10622U = new AtomicBoolean(true);
        this.f10636ah = new AtomicBoolean(false);
        this.f10662t = 0;
        this.f10665w = false;
        this.f10666x = false;
        this.f10631ac = false;
        this.f10658p = UUID.randomUUID().toString();
        this.f10632ad = Boolean.FALSE;
        this.f10611J = false;
        this.f10634af = null;
        this.f10668z = null;
        this.f10602A = null;
        this.f10635ag = null;
        this.f10603B = null;
        this.f10606E = false;
        this.f10607F = false;
        this.f10609H = false;
        this.f10612K = false;
        this.f10638aj = new CopyOnWriteArraySet<>();
        this.f10639ak = new CopyOnWriteArraySet<>();
        this.f10640al = new CopyOnWriteArraySet<>();
        this.f10614M = null;
        this.f10641am = null;
        this.f10615N = null;
        this.f10647e = null;
        this.f10613L = 1;
        this.f10616O = new C4628a();
        this.f10642an = new C4371b();
        this.f10643ao = new C4604ai();
    }

    /* synthetic */ C4455H(byte b) {
        this();
    }

    /* renamed from: A */
    private void m12677A() {
        this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10651i.f11876a.f11652e.size(); i++) {
            String str = this.f10651i.f11876a.f11652e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10651i.f11929b.mo34039a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f10640al) {
                this.f10615N = new C4667q(arrayList, this.f10651i.f11953c.f11613d, this.f10652j, this.f10653k);
            }
            this.f10640al.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12701b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.BANNER, false);
    }

    /* renamed from: B */
    private void m12678B() {
        if (this.f10632ad.booleanValue()) {
            this.f10632ad = Boolean.FALSE;
            mo33346a(this.f10633ae, this.f10634af);
            this.f10633ae = null;
            this.f10634af = null;
        }
    }

    /* renamed from: C */
    private boolean m12679C() {
        C4726l lVar = this.f10651i;
        return (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11613d == null) ? false : true;
    }

    /* renamed from: D */
    private static boolean m12680D() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    /* renamed from: E */
    private void m12681E() {
        if (this.f10635ag != null && this.f10636ah.compareAndSet(false, true)) {
            IronLog.CALLBACK.verbose("onInitializationCompleted()");
            C4537h.m13193e().mo33649b(new C4532c(IronSourceConstants.TROUBLESHOOTING_INIT_COMPLETED, IronSourceUtils.getMediationAdditionalData(false)));
            this.f10635ag.onInitializationComplete();
        }
    }

    /* renamed from: a */
    private int m12682a(C4661o oVar) {
        return !this.f10637ai && !this.f10607F && oVar.f11668l.f11786n ? 2 : 1;
    }

    /* renamed from: a */
    public static C4455H m12683a() {
        return C4458b.f10671a;
    }

    /* renamed from: a */
    private C4726l m12684a(Context context, String str) {
        if (IronSourceUtils.isInitResponseCached(context)) {
            String cachedValueByKeyOfCachedInitResponse = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, Constants.APP_KEY);
            String cachedValueByKeyOfCachedInitResponse2 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, DataKeys.USER_ID);
            String cachedValueByKeyOfCachedInitResponse3 = IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(context, "response");
            String str2 = this.f10652j;
            if (str2 != null && cachedValueByKeyOfCachedInitResponse.equals(str2) && cachedValueByKeyOfCachedInitResponse2.equals(str)) {
                C4726l lVar = new C4726l(context, cachedValueByKeyOfCachedInitResponse, cachedValueByKeyOfCachedInitResponse2, cachedValueByKeyOfCachedInitResponse3);
                lVar.f11955e = C4726l.C4727a.f11978b;
                return lVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m12685a(Context context) {
        String[] C = C4407h.m12535C(context);
        return (C == null || C.length != 2) ? "" : C[0];
    }

    /* renamed from: a */
    private static String m12686a(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = C44561.f10670b[i - 1];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    /* renamed from: a */
    static void m12687a(int i, JSONObject jSONObject) {
        C4537h.m13193e().mo33649b(new C4532c(i, jSONObject));
    }

    /* renamed from: a */
    private void m12688a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: a */
    private void m12689a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = C44561.f10669a[ad_unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        synchronized (this.f10632ad) {
                            if (this.f10632ad.booleanValue()) {
                                this.f10632ad = Boolean.FALSE;
                                C4631j.m13569a().mo33932a(this.f10633ae, new IronSourceError(602, "Init had failed"));
                                this.f10633ae = null;
                                this.f10634af = null;
                            }
                        }
                    }
                } else if (z || mo33369i() || this.f10626Y.contains(ad_unit)) {
                    this.f10649g.onOfferwallAvailable(false);
                }
            } else if (this.f10664v) {
                Iterator<String> it = this.f10638aj.iterator();
                while (it.hasNext()) {
                    C4432A.m12618a().mo33251a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
                }
                this.f10638aj.clear();
            } else if (this.f10611J) {
                this.f10611J = false;
                C4665p.m13650a().mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
        } else if (this.f10663u) {
            Iterator<String> it2 = this.f10639ak.iterator();
            while (it2.hasNext()) {
                C4515Z.m13111a().mo33618a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f10639ak.clear();
        } else if (this.f10607F) {
            if (this.f10608G) {
                this.f10608G = false;
                C4665p.m13650a().mo34055a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
        } else if (z || mo33361d() || this.f10626Y.contains(ad_unit)) {
            this.f10649g.onRewardedVideoAvailabilityChanged(false);
        }
    }

    /* renamed from: a */
    public static void m12690a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C4432A.m12618a().f10552a = iSDemandOnlyInterstitialListener;
    }

    /* renamed from: a */
    static void m12691a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C4515Z.m13111a().f11023a = iSDemandOnlyRewardedVideoListener;
    }

    /* renamed from: a */
    static void m12692a(String str, C4370a aVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    aVar.mo33152a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                aVar.mo33152a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    /* renamed from: a */
    public static void m12693a(String str, JSONObject jSONObject) {
        String str2 = "networkKey = " + str;
        if (jSONObject != null) {
            str2 = str2 + " networkData = " + jSONObject;
        }
        IronLog.API.verbose(str2);
        C4616d.m13502a().mo33895a(str, jSONObject);
    }

    /* renamed from: a */
    private void m12694a(ArrayList<NetworkSettings> arrayList) {
        this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.f10603B = new C4487P(arrayList, new C4615b(this.f10652j, IronSourceUtils.getUserIdForNetworks(), this.f10651i.f11953c.f11613d), C4723k.m13824a().mo34192b(), this.f10661s);
        m12678B();
    }

    /* renamed from: a */
    static void m12695a(JSONObject jSONObject, Object[][] objArr) {
        int i = 0;
        while (i <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i++;
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m12696a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C4616d.m13502a().mo33898b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m12697a(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r1 = 0
            r2 = 0
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x0014
            r9.f10666x = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x001f
            r9.f10631ac = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01da }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0029
            r9.f10665w = r3     // Catch:{ all -> 0x01da }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.M$a r0 = r0.mo33491b()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ all -> 0x01da }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.i r10 = r9.f10649g     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.f10625X     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.m12689a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01da }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.f10623V     // Catch:{ all -> 0x01da }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = 0
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.f10625X     // Catch:{ all -> 0x01da }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01da }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f10625X     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f10626Y     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0085:
            r4 = 1
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f10648f     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r8.<init>()     // Catch:{ all -> 0x01da }
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01da }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01da }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = m12680D()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.C4377a.C43781.m12466d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.C4377a.C43781.m12463c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.mo33377m()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f10662t     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.f10662t = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0108:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x01da }
            r10.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r11)     // Catch:{ all -> 0x01da }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.M r0 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x01da }
            r0.mo33492b(r10)     // Catch:{ all -> 0x01da }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f10624W     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = 0
            r5 = 0
        L_0x012a:
            if (r4 >= r0) goto L_0x0167
            r6 = r11[r4]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.f10625X     // Catch:{ all -> 0x01da }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01da }
            if (r7 != 0) goto L_0x0161
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f10625X     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f10626Y     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f10624W     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f10624W     // Catch:{ all -> 0x01da }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            r9.m12702b((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
            goto L_0x015f
        L_0x015c:
            r9.m12689a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (boolean) r1)     // Catch:{ all -> 0x01da }
        L_0x015f:
            r5 = 1
            goto L_0x0164
        L_0x0161:
            r9.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0167:
            if (r5 == 0) goto L_0x01d8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            r11.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c8 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = m12680D()     // Catch:{ Exception -> 0x01c8 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = com.ironsource.environment.C4377a.C43781.m12466d()     // Catch:{ Exception -> 0x01c8 }
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = com.ironsource.environment.C4377a.C43781.m12463c()     // Catch:{ Exception -> 0x01c8 }
        L_0x01a1:
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01a8
        L_0x01a5:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x01a1
        L_0x01a8:
            r11.append(r0)     // Catch:{ Exception -> 0x01c8 }
            boolean r0 = r9.mo33377m()     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x01b4
            r11.append(r1)     // Catch:{ Exception -> 0x01c8 }
        L_0x01b4:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f10662t     // Catch:{ Exception -> 0x01c8 }
            int r0 = r0 + r3
            r9.f10662t = r0     // Catch:{ Exception -> 0x01c8 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x01cc:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.h r10 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x01da }
            r10.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r11)     // Catch:{ all -> 0x01da }
        L_0x01d8:
            monitor-exit(r9)
            return
        L_0x01da:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.m12697a(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* renamed from: a */
    private static boolean m12698a(C4605b bVar) {
        return bVar.f11367k > 0 && bVar.f11368l > 0;
    }

    /* renamed from: a */
    private static boolean m12699a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* renamed from: b */
    private C4726l m12700b(Context context, String str, C4457a aVar) {
        C4726l lVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a = m12685a(context);
            if (TextUtils.isEmpty(a)) {
                a = C4407h.m12587x(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f10652j, str, a, this.f10657o, this.f10607F, this.f10661s != null ? this.f10661s.mo33440a() : null), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog.INTERNAL.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString("response", (String) null);
                if (TextUtils.isEmpty(optString)) {
                    IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(C4719g.m13802a().mo34183b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    IronLog.INTERNAL.warning("encoded response invalid - return null");
                    if (!f10601ap) {
                        f10601ap = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C4537h.m13193e().mo33649b(new C4532c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            C4726l lVar2 = new C4726l(context, this.f10652j, str, stringFromURL);
            try {
                lVar2.f11955e = C4726l.C4727a.f11979c;
                if (lVar2.mo34198b()) {
                    return lVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                lVar = lVar2;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("exception = " + e);
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e3) {
            e = e3;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.warning("exception = " + e);
            e.printStackTrace();
            return lVar;
        }
    }

    /* renamed from: b */
    private static void m12701b(int i, JSONObject jSONObject) {
        C4533d.m13173e().mo33649b(new C4532c(i, jSONObject));
    }

    /* renamed from: b */
    private void m12702b(IronSource.AD_UNIT ad_unit) {
        int i = C44561.f10669a[ad_unit.ordinal()];
        if (i == 1) {
            m12707q();
        } else if (i == 2) {
            m12723y();
        } else if (i == 3) {
            this.f10646d.mo33513a(this.f10652j, this.f10653k);
        } else if (i == 4) {
            m12724z();
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.ironsource.mediationsdk.z] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.V] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.I] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12703n() {
        /*
            r11 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r11.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.List r5 = r11.m12712s()
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x007a
            com.ironsource.mediationsdk.utils.l r0 = r11.f10651i
            com.ironsource.mediationsdk.model.g r0 = r0.f11953c
            com.ironsource.mediationsdk.model.o r0 = r0.f11610a
            com.ironsource.mediationsdk.utils.c r0 = r0.f11668l
            boolean r0 = r0.f11786n
            if (r0 == 0) goto L_0x003d
            com.ironsource.mediationsdk.I r0 = new com.ironsource.mediationsdk.I
            com.ironsource.mediationsdk.utils.l r1 = r11.f10651i
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c
            com.ironsource.mediationsdk.model.o r6 = r1.f11610a
            java.lang.String r7 = r11.f10652j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.k r1 = com.ironsource.mediationsdk.utils.C4723k.m13824a()
            java.util.HashSet r9 = r1.mo34192b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f10661s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0059
        L_0x003d:
            com.ironsource.mediationsdk.V r0 = new com.ironsource.mediationsdk.V
            com.ironsource.mediationsdk.utils.l r1 = r11.f10651i
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c
            com.ironsource.mediationsdk.model.o r6 = r1.f11610a
            java.lang.String r7 = r11.f10652j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.k r1 = com.ironsource.mediationsdk.utils.C4723k.m13824a()
            java.util.HashSet r9 = r1.mo34192b()
            com.ironsource.mediationsdk.IronSourceSegment r10 = r11.f10661s
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L_0x0059:
            r11.f10668z = r0
            java.lang.Boolean r0 = r11.f10660r
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.z r1 = r11.f10668z
            android.content.Context r2 = r11.f10659q
            boolean r0 = r0.booleanValue()
            r1.mo33385a(r2, r0)
            java.lang.Boolean r0 = r11.f10660r
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a2
            com.ironsource.mediationsdk.ab r0 = r11.f10644b
            android.content.Context r1 = r11.f10659q
            r0.mo33301a((android.content.Context) r1, (boolean) r3)
            return
        L_0x007a:
            int r0 = r11.f10613L
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            m12695a((org.json.JSONObject) r0, (java.lang.Object[][]) r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            m12687a((int) r1, (org.json.JSONObject) r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r11.m12689a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.m12703n():void");
    }

    /* renamed from: o */
    private void m12704o() {
        this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10651i.f11876a.f11648a.size(); i++) {
            String str = this.f10651i.f11876a.f11648a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10651i.f11929b.mo34039a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f10639ak) {
                this.f10641am = new C4711u(arrayList, this.f10651i.f11953c.f11610a, this.f10652j, this.f10653k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                m12689a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.f10639ak.iterator();
            while (it.hasNext()) {
                this.f10641am.mo34170a(it.next(), (String) null, false);
            }
            this.f10639ak.clear();
            return;
        }
        m12689a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: p */
    private Placement m12705p(String str) {
        C4661o oVar = this.f10651i.f11953c.f11610a;
        if (oVar != null) {
            Iterator<Placement> it = oVar.f11657a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m12706p() {
        NetworkSettings a;
        NetworkSettings a2;
        NetworkSettings a3;
        C4661o oVar = this.f10651i.f11953c.f11610a;
        int i = oVar.f11661e;
        for (int i2 = 0; i2 < this.f10651i.f11876a.f11648a.size(); i2++) {
            String str = this.f10651i.f11876a.f11648a.get(i2);
            if (!TextUtils.isEmpty(str) && (a3 = this.f10651i.f11929b.mo34039a(str)) != null) {
                C4553ac acVar = new C4553ac(a3, i);
                if (m12698a((C4605b) acVar)) {
                    acVar.f11170s = this.f10644b;
                    acVar.f11370n = i2 + 1;
                    this.f10644b.mo33627a(acVar);
                }
            }
        }
        if (this.f10644b.f11042c.size() > 0) {
            this.f10644b.f11156n = oVar.f11658b.mo34666a();
            this.f10644b.f11041b = oVar.f11659c;
            this.f10644b.f11157o = oVar.f11664h;
            String c = this.f10651i.mo34199c();
            if (!TextUtils.isEmpty(c) && (a2 = this.f10651i.f11929b.mo34039a(c)) != null) {
                C4553ac acVar2 = new C4553ac(a2, i);
                if (m12698a((C4605b) acVar2)) {
                    acVar2.f11170s = this.f10644b;
                    C4551ab abVar = this.f10644b;
                    IronSourceLoggerManager ironSourceLoggerManager = abVar.f11047h;
                    IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                    ironSourceLoggerManager.log(ironSourceTag, acVar2.f11360d + " is set as backfill", 0);
                    abVar.f11043d = acVar2;
                }
            }
            String d = this.f10651i.mo34200d();
            if (!TextUtils.isEmpty(d) && (a = this.f10651i.f11929b.mo34039a(d)) != null) {
                C4553ac acVar3 = new C4553ac(a, i);
                if (m12698a((C4605b) acVar3)) {
                    acVar3.f11170s = this.f10644b;
                    C4551ab abVar2 = this.f10644b;
                    IronSourceLoggerManager ironSourceLoggerManager2 = abVar2.f11047h;
                    IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
                    ironSourceLoggerManager2.log(ironSourceTag2, acVar3.f11360d + " is set as premium", 0);
                    abVar2.f11044e = acVar3;
                }
            }
            C4551ab abVar3 = this.f10644b;
            abVar3.f11158p = new C4738x(oVar.f11665i, abVar3);
            this.f10644b.mo33697a(this.f10652j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.f10613L);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12687a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: q */
    private void m12707q() {
        if (this.f10663u) {
            m12704o();
            return;
        }
        C4661o oVar = this.f10651i.f11953c.f11610a;
        this.f10606E = oVar.f11668l.f11773a || this.f10607F;
        this.f10637ai = oVar.f11668l.f11774b;
        int a = m12682a(oVar);
        this.f10613L = a;
        m12687a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f10606E, a));
        if (this.f10607F || this.f10637ai) {
            m12710r();
        } else if (this.f10606E) {
            m12703n();
        } else {
            m12706p();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12708q(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 3
            com.ironsource.mediationsdk.model.Placement r6 = r5.m12705p(r6)     // Catch:{ Exception -> 0x0026 }
            if (r6 != 0) goto L_0x000e
            com.ironsource.mediationsdk.model.Placement r6 = r5.mo33352b()     // Catch:{ Exception -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r1 = move-exception
            goto L_0x0028
        L_0x000e:
            if (r6 != 0) goto L_0x0031
            java.lang.String r1 = "showProgrammaticRewardedVideo error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r5.f10648f     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000c }
            r2.log(r3, r1, r0)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000c }
            r3 = 1021(0x3fd, float:1.431E-42)
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x000c }
            com.ironsource.mediationsdk.sdk.i r1 = r5.f10649g     // Catch:{ Exception -> 0x000c }
            r1.onRewardedVideoAdShowFailed(r2)     // Catch:{ Exception -> 0x000c }
            return
        L_0x0026:
            r1 = move-exception
            r6 = 0
        L_0x0028:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r5.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "showProgrammaticRewardedVideo()"
            r2.logException(r3, r4, r1)
        L_0x0031:
            com.ironsource.mediationsdk.adunit.c.h r1 = r5.f10605D
            if (r1 == 0) goto L_0x0043
            boolean r1 = r5.f10607F
            if (r1 != 0) goto L_0x003d
            boolean r1 = r5.f10637ai
            if (r1 == 0) goto L_0x0043
        L_0x003d:
            com.ironsource.mediationsdk.adunit.c.h r0 = r5.f10605D
            r0.mo33813a((com.ironsource.mediationsdk.model.Placement) r6)
            return
        L_0x0043:
            com.ironsource.mediationsdk.z r1 = r5.f10668z
            if (r1 == 0) goto L_0x004b
            r1.mo33390a(r6)
            return
        L_0x004b:
            java.lang.String r6 = "showProgrammaticRewardedVideo - show called before init completed, managers not initiated yet"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r5.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r6, r0)
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 1023(0x3ff, float:1.434E-42)
            r0.<init>(r1, r6)
            com.ironsource.mediationsdk.sdk.i r6 = r5.f10649g
            r6.onRewardedVideoAdShowFailed(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.m12708q(java.lang.String):void");
    }

    /* renamed from: r */
    private Placement m12709r(String str) {
        Placement p = m12705p(str);
        if (p == null) {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p = mo33352b();
            if (p == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m12686a(p.getPlacementName(), C4723k.m13834b(ContextProvider.getInstance().getApplicationContext(), p));
        if (TextUtils.isEmpty(a)) {
            return p;
        }
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f10649g.onRewardedVideoAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a));
        return null;
    }

    /* renamed from: r */
    private void m12710r() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> s = m12712s();
        if (s.size() > 0) {
            C4587h hVar = new C4587h(s, this.f10651i.f11953c.f11610a, IronSourceUtils.getUserIdForNetworks(), this.f10607F, C4723k.m13824a().mo34192b(), this.f10661s);
            this.f10605D = hVar;
            Boolean bool = this.f10660r;
            if (bool != null) {
                hVar.mo33825b(bool.booleanValue());
            }
            if (this.f10608G && this.f10607F) {
                this.f10608G = false;
                this.f10605D.mo33826e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, this.f10613L);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12687a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: s */
    private InterstitialPlacement m12711s(String str) {
        C4653h hVar = this.f10651i.f11953c.f11611b;
        if (hVar != null) {
            Iterator<InterstitialPlacement> it = hVar.f11615a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    private List<NetworkSettings> m12712s() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10651i.f11876a.f11648a.size(); i++) {
            String str = this.f10651i.f11876a.f11648a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10651i.f11929b.mo34039a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<NetworkSettings> m12713t() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10651i.f11876a.f11651d.size(); i++) {
            String str = this.f10651i.f11876a.f11651d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10651i.f11929b.mo34039a(str));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12714t(java.lang.String r5) {
        /*
            r4 = this;
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.m12711s(r5)     // Catch:{ Exception -> 0x0026 }
            if (r5 != 0) goto L_0x000d
            com.ironsource.mediationsdk.model.InterstitialPlacement r5 = r4.mo33362e()     // Catch:{ Exception -> 0x000b }
            goto L_0x000d
        L_0x000b:
            r0 = move-exception
            goto L_0x0028
        L_0x000d:
            if (r5 != 0) goto L_0x0031
            java.lang.String r0 = "showProgrammaticInterstitial error: empty default placement in response"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f10648f     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ Exception -> 0x000b }
            r3 = 3
            r1.log(r2, r0, r3)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x000b }
            r2 = 1020(0x3fc, float:1.43E-42)
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x000b }
            com.ironsource.mediationsdk.sdk.i r0 = r4.f10649g     // Catch:{ Exception -> 0x000b }
            r0.onInterstitialAdShowFailed(r1)     // Catch:{ Exception -> 0x000b }
            return
        L_0x0026:
            r0 = move-exception
            r5 = 0
        L_0x0028:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r4.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r3 = "showProgrammaticInterstitial()"
            r1.logException(r2, r3, r0)
        L_0x0031:
            boolean r0 = r4.f10610I
            if (r0 == 0) goto L_0x0040
            com.ironsource.mediationsdk.adunit.c.g r0 = r4.f10604C
            com.ironsource.mediationsdk.model.Placement r1 = new com.ironsource.mediationsdk.model.Placement
            r1.<init>(r5)
            r0.mo33813a((com.ironsource.mediationsdk.model.Placement) r1)
            return
        L_0x0040:
            com.ironsource.mediationsdk.S r0 = r4.f10602A
            java.lang.String r5 = r5.getPlacementName()
            r0.mo33562a((java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.m12714t(java.lang.String):void");
    }

    /* renamed from: u */
    private InterstitialPlacement m12715u(String str) {
        InterstitialPlacement s = m12711s(str);
        if (s == null) {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s = mo33362e();
            if (s == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m12686a(s.getPlacementName(), m12719w(s.getPlacementName()));
        if (TextUtils.isEmpty(a)) {
            return s;
        }
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f10649g.f11707e = s;
        this.f10649g.onInterstitialAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a));
        return null;
    }

    /* renamed from: u */
    private void m12716u() {
        IronLog.INTERNAL.verbose("");
        List<NetworkSettings> t = m12713t();
        if (t.size() > 0) {
            C4586g gVar = new C4586g(t, this.f10651i.f11953c.f11611b, IronSourceUtils.getUserIdForNetworks(), C4723k.m13824a().mo34192b(), this.f10661s);
            this.f10604C = gVar;
            Boolean bool = this.f10660r;
            if (bool != null) {
                gVar.mo33825b(bool.booleanValue());
            }
            if (this.f10611J) {
                this.f10611J = false;
                this.f10604C.mo33826e();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12701b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: v */
    private void m12717v() {
        this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> t = m12713t();
        if (t.size() > 0) {
            C4497S s = new C4497S(t, this.f10651i.f11953c.f11611b, this.f10652j, IronSourceUtils.getUserIdForNetworks(), this.f10651i.f11953c.f11611b.f11620f, C4723k.m13824a().mo34192b(), this.f10661s);
            this.f10602A = s;
            Boolean bool = this.f10660r;
            if (bool != null) {
                s.mo33563a(bool.booleanValue());
                if (this.f10660r.booleanValue()) {
                    this.f10645c.mo33301a(this.f10659q, false);
                }
            }
            if (this.f10611J) {
                this.f10611J = false;
                this.f10602A.mo33567d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12701b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: v */
    private static boolean m12718v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: w */
    private int m12719w(String str) {
        C4726l lVar = this.f10651i;
        if (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11611b == null) {
            return C4723k.C4725a.f11848d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m12711s(str);
            if (interstitialPlacement == null && (interstitialPlacement = mo33362e()) == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? C4723k.C4725a.f11848d : C4723k.m13833b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    /* renamed from: w */
    private void m12720w() {
        NetworkSettings a;
        C4653h hVar = this.f10651i.f11953c.f11611b;
        int i = hVar.f11619e;
        this.f10645c.f10582n.mo34054a(IronSource.AD_UNIT.INTERSTITIAL, hVar.f11620f);
        for (int i2 = 0; i2 < this.f10651i.f11876a.f11651d.size(); i2++) {
            String str = this.f10651i.f11876a.f11651d.get(i2);
            if (!TextUtils.isEmpty(str) && (a = this.f10651i.f11929b.mo34039a(str)) != null) {
                C4451F f = new C4451F(a, i);
                if (m12698a((C4605b) f)) {
                    f.f10594s = this.f10645c;
                    f.f11370n = i2 + 1;
                    this.f10645c.mo33627a(f);
                }
            }
        }
        if (this.f10645c.f11042c.size() > 0) {
            this.f10645c.f11041b = hVar.f11617c;
            this.f10645c.mo33308a(this.f10652j, IronSourceUtils.getUserIdForNetworks());
            if (this.f10611J) {
                this.f10611J = false;
                this.f10645c.mo33312c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12701b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: x */
    private C4651f m12721x(String str) {
        C4650e eVar = this.f10651i.f11953c.f11613d;
        if (eVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return eVar.mo34027a();
        }
        C4651f a = eVar.mo34028a(str);
        return a != null ? a : eVar.mo34027a();
    }

    /* renamed from: x */
    private void m12722x() {
        this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f10651i.f11876a.f11651d.size(); i++) {
            String str = this.f10651i.f11876a.f11651d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f10651i.f11929b.mo34039a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f10638aj) {
                this.f10614M = new C4670s(arrayList, this.f10651i.f11953c.f11611b, this.f10652j, this.f10653k);
            }
            Iterator<String> it = this.f10638aj.iterator();
            while (it.hasNext()) {
                this.f10614M.mo34077a(it.next(), (String) null, false);
            }
            this.f10638aj.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m12695a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m12701b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m12689a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: y */
    private void m12723y() {
        if (this.f10664v) {
            m12722x();
            return;
        }
        C4653h hVar = this.f10651i.f11953c.f11611b;
        this.f10609H = hVar.f11623i.f11773a;
        this.f10610I = hVar.f11623i.f11774b;
        m12701b(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f10609H, 1));
        if (!this.f10609H) {
            m12720w();
        } else if (this.f10610I) {
            m12716u();
        } else {
            m12717v();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        return;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12724z() {
        /*
            r13 = this;
            boolean r0 = r13.f10630ab
            if (r0 == 0) goto L_0x0008
            r13.m12677A()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.f10632ad
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f11613d     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.c r1 = r1.f11608g     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.f11773a     // Catch:{ all -> 0x00e5 }
            r13.f10612K = r1     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            boolean r3 = r13.f10612K     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r3 = r13.f10632ad     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.f10612K     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00e5 }
            m12701b(r1, r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = 0
        L_0x0055:
            com.ironsource.mediationsdk.utils.l r2 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.m r2 = r2.f11876a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f11652e     // Catch:{ all -> 0x00e5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r2) goto L_0x0083
            com.ironsource.mediationsdk.utils.l r2 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.m r2 = r2.f11876a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f11652e     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e5 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0080
            com.ironsource.mediationsdk.utils.l r5 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.n r5 = r5.f11929b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.mo34039a((java.lang.String) r2)     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0080
            r6.add(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0083:
            int r1 = r6.size()     // Catch:{ all -> 0x00e5 }
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r13.f10612K     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0092
            r13.m12694a((java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings>) r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0092:
            com.ironsource.mediationsdk.utils.l r1 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f11613d     // Catch:{ all -> 0x00e5 }
            long r9 = r1.f11603b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f11613d     // Catch:{ all -> 0x00e5 }
            int r11 = r1.f11606e     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.l r1 = r13.f10651i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f11953c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.e r1 = r1.f11613d     // Catch:{ all -> 0x00e5 }
            int r12 = r1.f11607f     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.k r1 = new com.ironsource.mediationsdk.k     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r13.f10652j     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00e5 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00e5 }
            r13.f10647e = r1     // Catch:{ all -> 0x00e5 }
            r13.m12678B()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r13.f10612K     // Catch:{ all -> 0x00e5 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00e5 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00e5 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r5[r3] = r6     // Catch:{ all -> 0x00e5 }
            r2[r4] = r5     // Catch:{ all -> 0x00e5 }
            m12695a((org.json.JSONObject) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x00e5 }
            r2 = 83314(0x14572, float:1.16748E-40)
            m12701b(r2, r1)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00e5 }
            r13.m12689a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r1, (boolean) r4)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.m12724z():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x033b, code lost:
        return r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x030f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.C4726l mo33340a(android.content.Context r11, java.lang.String r12, com.ironsource.mediationsdk.C4455H.C4457a r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f10621T
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.l r1 = r10.f10651i     // Catch:{ all -> 0x033c }
            if (r1 == 0) goto L_0x0010
            com.ironsource.mediationsdk.utils.l r11 = new com.ironsource.mediationsdk.utils.l     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r12 = r10.f10651i     // Catch:{ all -> 0x033c }
            r11.<init>(r12)     // Catch:{ all -> 0x033c }
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            return r11
        L_0x0010:
            com.ironsource.mediationsdk.utils.l r13 = r10.m12700b((android.content.Context) r11, (java.lang.String) r12, (com.ironsource.mediationsdk.C4455H.C4457a) r13)     // Catch:{ all -> 0x033c }
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x001e
            boolean r3 = r13.mo34198b()     // Catch:{ all -> 0x033c }
            if (r3 != 0) goto L_0x006a
        L_0x001e:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r13 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x033c }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r13.log(r3, r4, r2)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r13 = r10.m12684a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x033c }
            if (r13 == 0) goto L_0x006a
            java.lang.String r3 = r10.f10652j     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceError r12 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r3, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f10648f     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x033c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x033c }
            r5.<init>()     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x033c }
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = ": "
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x033c }
            r5.append(r12)     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r5.toString()     // Catch:{ all -> 0x033c }
            r3.log(r4, r12, r1)     // Catch:{ all -> 0x033c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x033c }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r12 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            r12.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r3)     // Catch:{ all -> 0x033c }
        L_0x006a:
            if (r13 == 0) goto L_0x033a
            r10.f10651i = r13     // Catch:{ all -> 0x033c }
            java.lang.String r12 = r13.toString()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r11, r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.l r12 = r10.f10651i     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.b r3 = r10.f10650h     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r4 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r4 = r4.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.d r4 = r4.mo34649a()     // Catch:{ all -> 0x033c }
            int r4 = r4.f11599a     // Catch:{ all -> 0x033c }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r10.f10648f     // Catch:{ all -> 0x033c }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.g r5 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r5 = r5.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.d r5 = r5.mo34649a()     // Catch:{ all -> 0x033c }
            int r5 = r5.f11600b     // Catch:{ all -> 0x033c }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x033c }
            boolean r3 = r10.mo33361d()     // Catch:{ all -> 0x033c }
            if (r3 == 0) goto L_0x00a8
            com.ironsource.mediationsdk.model.g r3 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.o r3 = r3.f11610a     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f11658b     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo34667b()     // Catch:{ all -> 0x033c }
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            boolean r4 = r10.mo33368h()     // Catch:{ all -> 0x033c }
            if (r4 == 0) goto L_0x00ba
            com.ironsource.mediationsdk.model.g r4 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.h r4 = r4.f11611b     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r4 = r4.f11616b     // Catch:{ all -> 0x033c }
            boolean r4 = r4.mo34667b()     // Catch:{ all -> 0x033c }
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            boolean r5 = r10.m12679C()     // Catch:{ all -> 0x033c }
            if (r5 == 0) goto L_0x00cc
            com.ironsource.mediationsdk.model.g r5 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.e r5 = r5.f11613d     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r5 = r5.f11602a     // Catch:{ all -> 0x033c }
            boolean r5 = r5.mo34667b()     // Catch:{ all -> 0x033c }
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            boolean r6 = r10.mo33369i()     // Catch:{ all -> 0x033c }
            if (r6 == 0) goto L_0x00de
            com.ironsource.mediationsdk.model.g r6 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.i r6 = r6.f11612c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r6 = r6.f11627c     // Catch:{ all -> 0x033c }
            boolean r6 = r6.mo34667b()     // Catch:{ all -> 0x033c }
            goto L_0x00df
        L_0x00de:
            r6 = 0
        L_0x00df:
            com.ironsource.mediationsdk.model.g r7 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r7 = r7.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.utils.j r7 = r7.mo34656h()     // Catch:{ all -> 0x033c }
            boolean r8 = r7.f11836a     // Catch:{ all -> 0x033c }
            if (r3 == 0) goto L_0x016f
            com.ironsource.mediationsdk.model.g r3 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.o r3 = r3.f11610a     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f11658b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo34670e()     // Catch:{ all -> 0x033c }
            r6.mo33650b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo34669d()     // Catch:{ all -> 0x033c }
            r6.mo33641a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34672g()     // Catch:{ all -> 0x033c }
            r6.mo33648b((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34673h()     // Catch:{ all -> 0x033c }
            r6.mo33654c((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34671f()     // Catch:{ all -> 0x033c }
            r6.mo33638a((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34674i()     // Catch:{ all -> 0x033c }
            r6.mo33644a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34675j()     // Catch:{ all -> 0x033c }
            r6.mo33652b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34676k()     // Catch:{ all -> 0x033c }
            r6.mo33655c(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34677l()     // Catch:{ all -> 0x033c }
            r6.mo33659d(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r9 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r9 = r9.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r9 = r9.mo34650b()     // Catch:{ all -> 0x033c }
            r6.mo33640a((com.ironsource.mediationsdk.model.C4662p) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo34668c()     // Catch:{ all -> 0x033c }
        L_0x016b:
            r6.f11081c = r3     // Catch:{ all -> 0x033c }
            goto L_0x01f9
        L_0x016f:
            if (r6 == 0) goto L_0x01f3
            com.ironsource.mediationsdk.model.g r3 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.i r3 = r3.f11612c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r3 = r3.f11627c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo34670e()     // Catch:{ all -> 0x033c }
            r6.mo33650b((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            java.lang.String r9 = r3.mo34669d()     // Catch:{ all -> 0x033c }
            r6.mo33641a((java.lang.String) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34672g()     // Catch:{ all -> 0x033c }
            r6.mo33648b((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34673h()     // Catch:{ all -> 0x033c }
            r6.mo33654c((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int r9 = r3.mo34671f()     // Catch:{ all -> 0x033c }
            r6.mo33638a((int) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34674i()     // Catch:{ all -> 0x033c }
            r6.mo33644a((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34675j()     // Catch:{ all -> 0x033c }
            r6.mo33652b((int[]) r9, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34676k()     // Catch:{ all -> 0x033c }
            r6.mo33655c(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            int[] r9 = r3.mo34677l()     // Catch:{ all -> 0x033c }
            r6.mo33659d(r9, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r9 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r9 = r9.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r9 = r9.mo34650b()     // Catch:{ all -> 0x033c }
            r6.mo33640a((com.ironsource.mediationsdk.model.C4662p) r9)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r6 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            boolean r3 = r3.mo34668c()     // Catch:{ all -> 0x033c }
            goto L_0x016b
        L_0x01f3:
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            r3.f11084f = r2     // Catch:{ all -> 0x033c }
        L_0x01f9:
            if (r4 == 0) goto L_0x027f
            com.ironsource.mediationsdk.model.g r2 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.h r2 = r2.f11611b     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r2 = r2.f11616b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo34670e()     // Catch:{ all -> 0x033c }
            r3.mo33650b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo34669d()     // Catch:{ all -> 0x033c }
            r3.mo33641a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34672g()     // Catch:{ all -> 0x033c }
            r3.mo33648b((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34673h()     // Catch:{ all -> 0x033c }
            r3.mo33654c((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34671f()     // Catch:{ all -> 0x033c }
            r3.mo33638a((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34674i()     // Catch:{ all -> 0x033c }
            r3.mo33644a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34675j()     // Catch:{ all -> 0x033c }
            r3.mo33652b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34676k()     // Catch:{ all -> 0x033c }
            r3.mo33655c(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34677l()     // Catch:{ all -> 0x033c }
            r3.mo33659d(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r12 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r12 = r12.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r12 = r12.mo34650b()     // Catch:{ all -> 0x033c }
            r3.mo33640a((com.ironsource.mediationsdk.model.C4662p) r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            boolean r2 = r2.mo34668c()     // Catch:{ all -> 0x033c }
        L_0x027b:
            r12.f11081c = r2     // Catch:{ all -> 0x033c }
            goto L_0x0309
        L_0x027f:
            if (r5 == 0) goto L_0x0303
            com.ironsource.mediationsdk.model.g r2 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.e r2 = r2.f11613d     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.g.d r2 = r2.f11602a     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo34670e()     // Catch:{ all -> 0x033c }
            r3.mo33650b((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            java.lang.String r4 = r2.mo34669d()     // Catch:{ all -> 0x033c }
            r3.mo33641a((java.lang.String) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34672g()     // Catch:{ all -> 0x033c }
            r3.mo33648b((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34673h()     // Catch:{ all -> 0x033c }
            r3.mo33654c((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int r4 = r2.mo34671f()     // Catch:{ all -> 0x033c }
            r3.mo33638a((int) r4)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34674i()     // Catch:{ all -> 0x033c }
            r3.mo33644a((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34675j()     // Catch:{ all -> 0x033c }
            r3.mo33652b((int[]) r4, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34676k()     // Catch:{ all -> 0x033c }
            r3.mo33655c(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            int[] r4 = r2.mo34677l()     // Catch:{ all -> 0x033c }
            r3.mo33659d(r4, r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.g r12 = r12.f11953c     // Catch:{ all -> 0x033c }
            com.ironsource.sdk.f.a r12 = r12.f11614e     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.model.p r12 = r12.mo34650b()     // Catch:{ all -> 0x033c }
            r3.mo33640a((com.ironsource.mediationsdk.model.C4662p) r12)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            boolean r2 = r2.mo34668c()     // Catch:{ all -> 0x033c }
            goto L_0x027b
        L_0x0303:
            com.ironsource.mediationsdk.a.d r12 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            r12.f11084f = r2     // Catch:{ all -> 0x033c }
        L_0x0309:
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            r12.f11084f = r8     // Catch:{ all -> 0x033c }
            if (r8 == 0) goto L_0x032a
            java.lang.String r12 = r7.f11837b     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            r2.mo33641a((java.lang.String) r12, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            int[] r2 = r7.f11839d     // Catch:{ all -> 0x033c }
            r12.mo33644a((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r12 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            int[] r2 = r7.f11840e     // Catch:{ all -> 0x033c }
            r12.mo33652b((int[]) r2, (android.content.Context) r11)     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            boolean r12 = r7.f11838c     // Catch:{ all -> 0x033c }
            r11.f11081c = r12     // Catch:{ all -> 0x033c }
        L_0x032a:
            com.ironsource.mediationsdk.a.d r11 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x033c }
            r11.f11079a = r1     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x033c }
            r11.f11079a = r1     // Catch:{ all -> 0x033c }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x033c }
            r11.f11079a = r1     // Catch:{ all -> 0x033c }
        L_0x033a:
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            return r13
        L_0x033c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x033c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33340a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.H$a):com.ironsource.mediationsdk.utils.l");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo33341a(android.app.Activity r9, com.ironsource.mediationsdk.IronSourceBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 3
            if (r12 != 0) goto L_0x0012
            java.lang.String r9 = "adm cannot be null"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r8.f10648f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            r10.log(r11, r9, r0)     // Catch:{ all -> 0x000f }
            monitor-exit(r8)
            return
        L_0x000f:
            r9 = move-exception
            goto L_0x0258
        L_0x0012:
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r8.f10631ac     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x002b
            java.lang.String r9 = "initISDemandOnly() must be called before loadISDemandOnlyBannerWithAdm()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x002b:
            boolean r2 = r8.f10630ab     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0042
            java.lang.String r9 = "Banner was initialized in mediation mode. Use loadBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0042:
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x004e
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            r4.updateActivity(r9)     // Catch:{ all -> 0x0240 }
            goto L_0x007b
        L_0x004e:
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            android.app.Activity r9 = r9.getCurrentActiveActivity()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x007b
            if (r12 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r2, r3)     // Catch:{ all -> 0x0240 }
            r11 = 83321(0x14579, float:1.16758E-40)
            m12701b(r11, r9)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r12 = 1062(0x426, float:1.488E-42)
            r11.<init>(r12, r9)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x007b:
            com.ironsource.mediationsdk.M r9 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.M$a r9 = r9.mo33491b()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.M$a r4 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ all -> 0x0240 }
            if (r9 != r4) goto L_0x009d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x009d:
            com.ironsource.mediationsdk.M$a r4 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0240 }
            r5 = 83004(0x1443c, float:1.16313E-40)
            if (r9 != r4) goto L_0x00db
            com.ironsource.mediationsdk.M r9 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0240 }
            boolean r9 = r9.mo33493c()     // Catch:{ all -> 0x0240 }
            if (r9 == 0) goto L_0x00c4
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x00c4:
            java.lang.Boolean r9 = r8.f10632ad     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f10640al     // Catch:{ all -> 0x00d8 }
            r0.add(r11)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00d6
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0240 }
            m12701b(r5, r9)     // Catch:{ all -> 0x0240 }
        L_0x00d6:
            monitor-exit(r8)
            return
        L_0x00d8:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x00db:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r9 = r8.f10640al     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.q r4 = r8.f10615N     // Catch:{ all -> 0x023d }
            if (r4 != 0) goto L_0x00f3
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f10640al     // Catch:{ all -> 0x023d }
            r0.add(r11)     // Catch:{ all -> 0x023d }
            if (r12 == 0) goto L_0x00f0
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x023d }
            m12701b(r5, r11)     // Catch:{ all -> 0x023d }
        L_0x00f0:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            monitor-exit(r8)
            return
        L_0x00f3:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            boolean r9 = r8.m12679C()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x0110
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "No Banner configurations found"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "the server response does not contain Banner data"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0110:
            if (r12 == 0) goto L_0x0227
            com.ironsource.mediationsdk.q r9 = r8.f10615N     // Catch:{ all -> 0x0240 }
            r9.f11690b = r10     // Catch:{ all -> 0x0240 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.r> r0 = r9.f11691c     // Catch:{ all -> 0x0240 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0134
            r12 = 3503(0xdaf, float:4.909E-42)
            com.ironsource.mediationsdk.C4667q.m13658a((int) r12, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f11690b     // Catch:{ all -> 0x0240 }
        L_0x012f:
            r9.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x0134:
            r0 = 3504(0xdb0, float:4.91E-42)
            if (r10 != 0) goto L_0x013c
        L_0x0138:
            com.ironsource.mediationsdk.C4667q.m13658a((int) r0, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0144
        L_0x013c:
            boolean r4 = r10.isDestroyed()     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0143
            goto L_0x0138
        L_0x0143:
            r2 = 1
        L_0x0144:
            if (r2 != 0) goto L_0x0153
            java.lang.String r11 = "validateBannerLayout fail"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildGenericError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f11690b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0153:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.r> r0 = r9.f11691c     // Catch:{ all -> 0x0240 }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ all -> 0x0240 }
            r2 = r11
            com.ironsource.mediationsdk.r r2 = (com.ironsource.mediationsdk.C4668r) r2     // Catch:{ all -> 0x0240 }
            r9.f11689a = r2     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0176
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm smash is no exist"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f11690b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0176:
            boolean r11 = r2.mo34225i()     // Catch:{ all -> 0x0240 }
            r0 = 3300(0xce4, float:4.624E-42)
            if (r11 != 0) goto L_0x0198
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm in IAB flow must be called by bidder instances"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r12 = 0
            com.ironsource.mediationsdk.C4667q.m13657a((int) r0, (com.ironsource.mediationsdk.C4668r) r2, (java.lang.Object[][]) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f11690b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0198:
            com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.C4619f.m13529a((java.lang.String) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.f$a r12 = new com.ironsource.mediationsdk.f$a     // Catch:{ all -> 0x0240 }
            r12.<init>()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ Exception -> 0x01ac }
            com.ironsource.mediationsdk.f$a r12 = com.ironsource.mediationsdk.C4619f.m13525a((org.json.JSONObject) r11)     // Catch:{ Exception -> 0x01ac }
            goto L_0x01d5
        L_0x01ac:
            r11 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "loadISDemandOnlyBannerWithAdm: unable to get auction data from response. Exception="
            r3.<init>(r4)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x0240 }
            r3.append(r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r3.error(r4)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r3 == 0) goto L_0x01d5
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r9.f11690b     // Catch:{ all -> 0x0240 }
            r3.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
        L_0x01d5:
            com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r2.mo34220d()     // Catch:{ all -> 0x0240 }
            java.util.List<com.ironsource.mediationsdk.server.b> r3 = r12.f11417b     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.server.b r11 = com.ironsource.mediationsdk.C4619f.m13527a((java.lang.String) r11, (java.util.List<com.ironsource.mediationsdk.server.C4707b>) r3)     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x020b
            java.lang.String r0 = r11.mo34158b()     // Catch:{ all -> 0x0240 }
            r2.mo34215a((java.lang.String) r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r12.f11416a     // Catch:{ all -> 0x0240 }
            r2.mo34219b(r0)     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r0 = r12.f11419d     // Catch:{ all -> 0x0240 }
            r2.mo34217a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0240 }
            r0 = 3002(0xbba, float:4.207E-42)
            r9.mo34058a((int) r0, (com.ironsource.mediationsdk.C4668r) r2)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.mo34158b()     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = r12.f11416a     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r6 = r12.f11419d     // Catch:{ all -> 0x0240 }
            java.util.List r7 = r11.mo34160d()     // Catch:{ all -> 0x0240 }
            r3 = r10
            r2.mo34068a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x020b:
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm invalid enriched adm"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r9.mo34058a((int) r0, (com.ironsource.mediationsdk.C4668r) r2)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f11690b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0256
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f11690b     // Catch:{ all -> 0x0240 }
            r9.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0256
        L_0x0227:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f10648f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "Banner support bidding mode only"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner support bidding mode only"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
        L_0x023b:
            monitor-exit(r8)
            return
        L_0x023d:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r9 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f10648f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            java.lang.String r0 = "loadDemandOnlyBanner"
            r11.logException(r12, r0, r9)     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x000f }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x000f }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x000f }
            r10.mo33417a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x000f }
        L_0x0256:
            monitor-exit(r8)
            return
        L_0x0258:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33341a(android.app.Activity, com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo33342a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C4515Z.m13111a().mo33618a(str, new IronSourceError(510, "adm cannot be null"));
            return;
        }
        mo33354b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33343a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.InitializationListener r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f10648f     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.f10666x     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.f10664v = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.f10665w     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.f10663u = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.f10631ac     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.f10630ab = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.f10665w     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.f10663u = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.f10666x     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.f10664v = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.f10631ac     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.m12688a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.f10630ab = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo33344a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33343a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3 A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3 A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137 A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0156 A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ad A[Catch:{ Exception -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01eb A[SYNTHETIC, Splitter:B:78:0x01eb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo33344a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.InitializationListener r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02ea }
            java.lang.String r1 = ""
            r0.verbose(r1)     // Catch:{ all -> 0x02ea }
            if (r12 == 0) goto L_0x000c
            r8.f10635ag = r12     // Catch:{ all -> 0x02ea }
        L_0x000c:
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f10622U     // Catch:{ all -> 0x02ea }
            if (r12 == 0) goto L_0x02c6
            java.util.concurrent.atomic.AtomicBoolean r12 = r8.f10622U     // Catch:{ all -> 0x02ea }
            r0 = 0
            r1 = 1
            boolean r12 = r12.compareAndSet(r1, r0)     // Catch:{ all -> 0x02ea }
            if (r12 == 0) goto L_0x02c6
            if (r13 == 0) goto L_0x0051
            int r12 = r13.length     // Catch:{ all -> 0x02ea }
            if (r12 != 0) goto L_0x0020
            goto L_0x0051
        L_0x0020:
            int r12 = r13.length     // Catch:{ all -> 0x02ea }
            r2 = 0
        L_0x0022:
            if (r2 >= r12) goto L_0x0069
            r3 = r13[r2]     // Catch:{ all -> 0x02ea }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f10625X     // Catch:{ all -> 0x02ea }
            r4.add(r3)     // Catch:{ all -> 0x02ea }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f10626Y     // Catch:{ all -> 0x02ea }
            r4.add(r3)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02ea }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02ea }
            if (r4 == 0) goto L_0x003a
            r8.f10666x = r1     // Catch:{ all -> 0x02ea }
        L_0x003a:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x02ea }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x02ea }
            if (r4 == 0) goto L_0x0044
            r8.f10631ac = r1     // Catch:{ all -> 0x02ea }
        L_0x0044:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02ea }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02ea }
            if (r3 == 0) goto L_0x004e
            r8.f10665w = r1     // Catch:{ all -> 0x02ea }
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x02ea }
            int r2 = r12.length     // Catch:{ all -> 0x02ea }
            r3 = 0
        L_0x0057:
            if (r3 >= r2) goto L_0x0063
            r4 = r12[r3]     // Catch:{ all -> 0x02ea }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r8.f10625X     // Catch:{ all -> 0x02ea }
            r5.add(r4)     // Catch:{ all -> 0x02ea }
            int r3 = r3 + 1
            goto L_0x0057
        L_0x0063:
            r8.f10665w = r1     // Catch:{ all -> 0x02ea }
            r8.f10666x = r1     // Catch:{ all -> 0x02ea }
            r8.f10631ac = r1     // Catch:{ all -> 0x02ea }
        L_0x0069:
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.API     // Catch:{ all -> 0x02ea }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = "init(appKey:"
            r2.<init>(r3)     // Catch:{ all -> 0x02ea }
            r2.append(r10)     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02ea }
            r12.info(r2)     // Catch:{ all -> 0x02ea }
            boolean r12 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x02ea }
            if (r12 == 0) goto L_0x008f
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02ea }
            r2 = r9
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x02ea }
            r12.updateActivity(r2)     // Catch:{ all -> 0x02ea }
        L_0x008f:
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02ea }
            android.content.Context r2 = r9.getApplicationContext()     // Catch:{ all -> 0x02ea }
            r12.updateAppContext(r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.environment.C4407h.m12577q()     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x02ea }
            r12.mo33163b((java.lang.String) r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            com.ironsource.c.b r2 = com.ironsource.p118c.C4367a.m12413a()     // Catch:{ all -> 0x02ea }
            r12.mo33158a((com.ironsource.p118c.C4369b) r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            boolean r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.isGooglePlayInstalled(r9)     // Catch:{ all -> 0x02ea }
            r12.mo33165b((boolean) r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.a r12 = new com.ironsource.d.a     // Catch:{ all -> 0x02ea }
            r12.<init>()     // Catch:{ all -> 0x02ea }
            if (r10 == 0) goto L_0x00e3
            r2 = 5
            r3 = 10
            boolean r2 = m12699a((java.lang.String) r10, (int) r2, (int) r3)     // Catch:{ all -> 0x02ea }
            if (r2 == 0) goto L_0x00da
            boolean r2 = m12718v(r10)     // Catch:{ all -> 0x02ea }
            if (r2 != 0) goto L_0x00ed
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02ea }
        L_0x00d6:
            r12.mo33152a((com.ironsource.mediationsdk.logger.IronSourceError) r2)     // Catch:{ all -> 0x02ea }
            goto L_0x00ed
        L_0x00da:
            java.lang.String r2 = "appKey"
            java.lang.String r3 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r2, r10, r3)     // Catch:{ all -> 0x02ea }
            goto L_0x00d6
        L_0x00e3:
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x02ea }
            r3 = 506(0x1fa, float:7.09E-43)
            java.lang.String r4 = "Init Fail - appKey is missing"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02ea }
            goto L_0x00d6
        L_0x00ed:
            boolean r2 = r12.mo33153a()     // Catch:{ all -> 0x02ea }
            if (r2 == 0) goto L_0x00f5
            r8.f10652j = r10     // Catch:{ all -> 0x02ea }
        L_0x00f5:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02ea }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02ea }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r2)     // Catch:{ all -> 0x02ea }
            long r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r2)     // Catch:{ all -> 0x02ea }
            if (r3 != 0) goto L_0x0127
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0127
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x02ea }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ea }
            java.lang.String r7 = "get first session timestamp = "
            r6.<init>(r7)     // Catch:{ all -> 0x02ea }
            r6.append(r3)     // Catch:{ all -> 0x02ea }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02ea }
            r5.verbose(r6)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r2, r3)     // Catch:{ all -> 0x02ea }
        L_0x0127:
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x02ea }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = r8.f10653k     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.utils.l r2 = r8.m12684a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ all -> 0x02ea }
            if (r2 == 0) goto L_0x0146
            com.ironsource.environment.g r3 = com.ironsource.environment.C4406g.f10503a     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.model.g r2 = r2.f11953c     // Catch:{ all -> 0x02ea }
            com.ironsource.sdk.f.a r2 = r2.f11614e     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.utils.b r2 = r2.mo34654f()     // Catch:{ all -> 0x02ea }
            boolean r2 = r2.f11772c     // Catch:{ all -> 0x02ea }
            com.ironsource.environment.C4406g.m12529a(r2)     // Catch:{ all -> 0x02ea }
        L_0x0146:
            com.ironsource.mediationsdk.utils.k r2 = com.ironsource.mediationsdk.utils.C4723k.m13824a()     // Catch:{ all -> 0x02ea }
            java.util.concurrent.ConcurrentHashMap r2 = r2.mo34195d()     // Catch:{ all -> 0x02ea }
            java.lang.String r3 = "is_deviceid_optout"
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x02ea }
            if (r3 == 0) goto L_0x0178
            java.lang.String r3 = "is_deviceid_optout"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x02ea }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x02ea }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02ea }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02ea }
            if (r3 != 0) goto L_0x0178
            boolean r2 = com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r2)     // Catch:{ all -> 0x02ea }
            if (r2 != 0) goto L_0x0172
            r2 = 1
            goto L_0x0173
        L_0x0172:
            r2 = 0
        L_0x0173:
            com.ironsource.environment.g r3 = com.ironsource.environment.C4406g.f10503a     // Catch:{ all -> 0x02ea }
            com.ironsource.environment.C4406g.m12531b(r2)     // Catch:{ all -> 0x02ea }
        L_0x0178:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f10620S     // Catch:{ all -> 0x02ea }
            if (r2 == 0) goto L_0x01a9
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f10620S     // Catch:{ all -> 0x02ea }
            boolean r2 = r2.compareAndSet(r0, r1)     // Catch:{ all -> 0x02ea }
            if (r2 == 0) goto L_0x01a9
            com.ironsource.mediationsdk.a.i r2 = com.ironsource.mediationsdk.p126a.C4538i.m13199a()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.utils.h r3 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x02ea }
            r3.<init>(r9)     // Catch:{ all -> 0x02ea }
            r2.mo33674a(r3)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f10661s     // Catch:{ all -> 0x02ea }
            r2.mo33639a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f10661s     // Catch:{ all -> 0x02ea }
            r2.mo33639a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.a.g r2 = com.ironsource.mediationsdk.p126a.C4536g.f11131w     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f10661s     // Catch:{ all -> 0x02ea }
            r2.mo33639a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x02ea }
        L_0x01a9:
            java.lang.String r2 = r8.f10652j     // Catch:{ all -> 0x02ea }
            if (r2 != 0) goto L_0x01eb
            com.ironsource.mediationsdk.M r9 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M$a r10 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ all -> 0x02ea }
            r9.mo33488a((com.ironsource.mediationsdk.C4476M.C4481a) r10)     // Catch:{ all -> 0x02ea }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f10625X     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x02ea }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02ea }
            if (r9 == 0) goto L_0x01c5
            com.ironsource.mediationsdk.sdk.i r9 = r8.f10649g     // Catch:{ all -> 0x02ea }
            r9.onRewardedVideoAvailabilityChanged(r0)     // Catch:{ all -> 0x02ea }
        L_0x01c5:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f10625X     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x02ea }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x02ea }
            if (r9 == 0) goto L_0x01d8
            com.ironsource.mediationsdk.sdk.i r9 = r8.f10649g     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = r12.mo33154b()     // Catch:{ all -> 0x02ea }
            r9.mo33514a((boolean) r0, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x02ea }
        L_0x01d8:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r12.mo33154b()     // Catch:{ all -> 0x02ea }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02ea }
            r9.log(r10, r11, r1)     // Catch:{ all -> 0x02ea }
            monitor-exit(r8)
            return
        L_0x01eb:
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            r12.mo33157a((android.content.Context) r9)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = r8.f10652j     // Catch:{ all -> 0x02ea }
            r12.mo33160a((java.lang.String) r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = r8.f10658p     // Catch:{ all -> 0x02ea }
            r12.mo33166c(r2)     // Catch:{ all -> 0x02ea }
            com.ironsource.d.b r12 = r8.f10642an     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.config.ConfigFile r2 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x02ea }
            java.lang.String r2 = r2.getPluginType()     // Catch:{ all -> 0x02ea }
            r12.mo33167d(r2)     // Catch:{ all -> 0x02ea }
            boolean r12 = r8.f10627Z     // Catch:{ all -> 0x02ea }
            if (r12 == 0) goto L_0x0298
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x02ea }
            r12.<init>()     // Catch:{ all -> 0x02ea }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x02ea }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0284 }
            java.lang.String r3 = ",androidx="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0284 }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0284 }
            r2.append(r3)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0284 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0284 }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x0284 }
            boolean r4 = m12680D()     // Catch:{ Exception -> 0x0284 }
            r3.append(r4)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0284 }
            boolean r4 = com.ironsource.environment.C4377a.C43781.m12466d()     // Catch:{ Exception -> 0x0284 }
            if (r4 == 0) goto L_0x024f
            java.lang.String r4 = "appLanguage=Kotlin"
            r12.append(r4)     // Catch:{ Exception -> 0x0284 }
            java.lang.String r4 = com.ironsource.environment.C4377a.C43781.m12463c()     // Catch:{ Exception -> 0x0284 }
        L_0x024b:
            r12.append(r4)     // Catch:{ Exception -> 0x0284 }
            goto L_0x0252
        L_0x024f:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x024b
        L_0x0252:
            r12.append(r2)     // Catch:{ Exception -> 0x0284 }
            boolean r2 = r8.mo33377m()     // Catch:{ Exception -> 0x0284 }
            if (r2 == 0) goto L_0x025e
            r12.append(r3)     // Catch:{ Exception -> 0x0284 }
        L_0x025e:
            java.lang.String r2 = "ext1"
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0284 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0284 }
            if (r13 == 0) goto L_0x0279
            int r12 = r13.length     // Catch:{ Exception -> 0x0284 }
            r2 = 0
        L_0x026b:
            if (r2 >= r12) goto L_0x0279
            r3 = r13[r2]     // Catch:{ Exception -> 0x0284 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0284 }
            r11.put(r3, r1)     // Catch:{ Exception -> 0x0284 }
            int r2 = r2 + 1
            goto L_0x026b
        L_0x0279:
            java.lang.String r12 = "sessionDepth"
            int r13 = r8.f10662t     // Catch:{ Exception -> 0x0284 }
            int r13 = r13 + r1
            r8.f10662t = r13     // Catch:{ Exception -> 0x0284 }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x0284 }
            goto L_0x0288
        L_0x0284:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x02ea }
        L_0x0288:
            com.ironsource.mediationsdk.a.c r12 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02ea }
            r13 = 14
            r12.<init>(r13, r11)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.a.h r11 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x02ea }
            r11.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r12)     // Catch:{ all -> 0x02ea }
            r8.f10627Z = r0     // Catch:{ all -> 0x02ea }
        L_0x0298:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r11 = r8.f10625X     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x02ea }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x02ea }
            if (r11 == 0) goto L_0x02ab
            com.ironsource.mediationsdk.M r11 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.E r12 = r8.f10645c     // Catch:{ all -> 0x02ea }
            r11.mo33489a((com.ironsource.mediationsdk.utils.C4721i) r12)     // Catch:{ all -> 0x02ea }
        L_0x02ab:
            com.ironsource.mediationsdk.M r11 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            r11.mo33489a((com.ironsource.mediationsdk.utils.C4721i) r8)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M r11 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.impressionData.a r12 = r8.f10616O     // Catch:{ all -> 0x02ea }
            r11.mo33489a((com.ironsource.mediationsdk.utils.C4721i) r12)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M r11 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            java.lang.String r12 = r8.f10653k     // Catch:{ all -> 0x02ea }
            r11.mo33487a(r9, r10, r12)     // Catch:{ all -> 0x02ea }
            monitor-exit(r8)
            return
        L_0x02c6:
            if (r13 == 0) goto L_0x02de
            r8.m12697a((boolean) r11, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r13)     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M r9 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M$a r9 = r9.mo33491b()     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.M$a r10 = com.ironsource.mediationsdk.C4476M.C4481a.INITIATED     // Catch:{ all -> 0x02ea }
            if (r9 != r10) goto L_0x02e8
            if (r11 != 0) goto L_0x02e8
            r8.m12681E()     // Catch:{ all -> 0x02ea }
            monitor-exit(r8)
            return
        L_0x02de:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f10648f     // Catch:{ all -> 0x02ea }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x02ea }
            java.lang.String r11 = "Multiple calls to init without ad units are not allowed"
            r12 = 3
            r9.log(r10, r11, r12)     // Catch:{ all -> 0x02ea }
        L_0x02e8:
            monitor-exit(r8)
            return
        L_0x02ea:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33344a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.InitializationListener, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33345a(AbstractAdapter abstractAdapter) {
        this.f10619R = abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (m12679C() != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r3.f10648f.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
        com.ironsource.mediationsdk.C4631j.m13569a().mo33932a(r4, new com.ironsource.mediationsdk.logger.IronSourceError(615, "No banner configurations found"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r3.f10612K != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0103, code lost:
        r3.f10647e.mo33937a(r4, m12721x(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010d, code lost:
        r3.f10603B.mo33525a(r4, m12721x(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33346a(com.ironsource.mediationsdk.IronSourceBannerLayout r4, java.lang.String r5) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            r0 = 3
            if (r4 == 0) goto L_0x011a
            boolean r1 = r4.isDestroyed()
            if (r1 == 0) goto L_0x001e
            goto L_0x011a
        L_0x001e:
            boolean r1 = r3.f10631ac
            if (r1 != 0) goto L_0x0037
            java.lang.String r5 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.j r0 = com.ironsource.mediationsdk.C4631j.m13569a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo33932a(r4, r5)
            return
        L_0x0037:
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            java.lang.String r1 = r1.getDescription()
            java.lang.String r2 = "CUSTOM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0072
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getWidth()
            if (r1 <= 0) goto L_0x005b
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getHeight()
            if (r1 > 0) goto L_0x0072
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C4631j.m13569a()
            java.lang.String r0 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r0)
            r5.mo33932a(r4, r0)
            return
        L_0x0072:
            com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.m12866a()
            com.ironsource.mediationsdk.M$a r1 = r1.mo33491b()
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED
            if (r1 != r2) goto L_0x0098
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C4631j.m13569a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 600(0x258, float:8.41E-43)
            java.lang.String r2 = "Init() had failed"
            r0.<init>(r1, r2)
            r5.mo33932a(r4, r0)
            return
        L_0x0098:
            com.ironsource.mediationsdk.M$a r2 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_IN_PROGRESS
            if (r1 != r2) goto L_0x00c9
            com.ironsource.mediationsdk.M r1 = com.ironsource.mediationsdk.C4476M.m12866a()
            boolean r1 = r1.mo33493c()
            if (r1 == 0) goto L_0x00c0
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C4631j.m13569a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 601(0x259, float:8.42E-43)
            java.lang.String r2 = "Init had failed"
            r0.<init>(r1, r2)
            r5.mo33932a(r4, r0)
            return
        L_0x00c0:
            r3.f10633ae = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f10632ad = r4
            r3.f10634af = r5
            return
        L_0x00c9:
            java.lang.Boolean r1 = r3.f10632ad
            monitor-enter(r1)
            com.ironsource.mediationsdk.k r2 = r3.f10647e     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x00de
            com.ironsource.mediationsdk.P r2 = r3.f10603B     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x00de
            r3.f10633ae = r4     // Catch:{ all -> 0x0117 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0117 }
            r3.f10632ad = r4     // Catch:{ all -> 0x0117 }
            r3.f10634af = r5     // Catch:{ all -> 0x0117 }
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            return
        L_0x00de:
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            boolean r1 = r3.m12679C()
            if (r1 != 0) goto L_0x00ff
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "No banner configurations found"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.j r5 = com.ironsource.mediationsdk.C4631j.m13569a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 615(0x267, float:8.62E-43)
            java.lang.String r2 = "No banner configurations found"
            r0.<init>(r1, r2)
            r5.mo33932a(r4, r0)
            return
        L_0x00ff:
            boolean r0 = r3.f10612K
            if (r0 != 0) goto L_0x010d
            com.ironsource.mediationsdk.k r0 = r3.f10647e
            com.ironsource.mediationsdk.model.f r5 = r3.m12721x(r5)
            r0.mo33937a((com.ironsource.mediationsdk.IronSourceBannerLayout) r4, (com.ironsource.mediationsdk.model.C4651f) r5)
            return
        L_0x010d:
            com.ironsource.mediationsdk.P r0 = r3.f10603B
            com.ironsource.mediationsdk.model.f r5 = r3.m12721x(r5)
            r0.mo33525a((com.ironsource.mediationsdk.IronSourceBannerLayout) r4, (com.ironsource.mediationsdk.model.C4651f) r5)
            return
        L_0x0117:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0117 }
            throw r4
        L_0x011a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "loadBanner can't be called - "
            r5.<init>(r1)
            if (r4 != 0) goto L_0x0126
            java.lang.String r1 = "banner layout is null "
            goto L_0x0128
        L_0x0126:
            java.lang.String r1 = "banner layout is destroyed"
        L_0x0128:
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.j r0 = com.ironsource.mediationsdk.C4631j.m13569a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo33932a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33346a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo33347a(RewardedVideoListener rewardedVideoListener) {
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        this.f10649g.f11703a = rewardedVideoListener;
        C4540aa.m13201a().f11139a = rewardedVideoListener;
    }

    /* renamed from: a */
    public final synchronized void mo33348a(RewardedVideoManualListener rewardedVideoManualListener) {
        if (this.f10665w) {
            IronLog.API.error("setManualLoadRewardedVideo - this method needs to be called before init");
        } else if (rewardedVideoManualListener == null) {
            IronLog.API.error("setManualLoadRewardedVideo - listener can not be null");
            this.f10607F = false;
        } else {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "setting RewardedVideo to manual mode", 1);
            this.f10607F = true;
            C4665p.m13650a().f11680b = rewardedVideoManualListener;
            mo33347a((RewardedVideoListener) rewardedVideoManualListener);
        }
    }

    /* renamed from: a */
    public final void mo33307a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f10649g != null) {
                for (IronSource.AD_UNIT a : this.f10625X) {
                    m12689a(a, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo33349a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (!MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C4616d.m13502a().mo33894a(metaDataKey, metaDataValue);
            } else if (C4476M.m12866a().mo33491b() != C4476M.C4481a.INITIATED || !MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                C4723k.m13824a().mo34191a(metaDataKey, metaDataValue);
            } else {
                IronLog ironLog2 = IronLog.API;
                ironLog2.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C4616d.m13502a().f11403c;
                concurrentHashMap.putAll(C4723k.m13824a().mo34195d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.f10642an.mo33161a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog3 = IronLog.INTERNAL;
                ironLog3.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            C4537h.m13193e().mo33649b(new C4532c(C4476M.m12866a().mo33491b() == C4476M.C4481a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33350a(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.f10653k = str;
        if (z) {
            C4537h.m13193e().mo33649b(new C4532c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    /* renamed from: a */
    public final void mo33309a(List<IronSource.AD_UNIT> list, boolean z, C4652g gVar) {
        IronLog.INTERNAL.verbose("");
        try {
            this.f10624W = list;
            this.f10623V = true;
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C4537h.m13193e().mo33649b(new C4532c(114, mediationAdditionalData));
            }
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity != null) {
                String screenSizeParams = AdapterUtils.getScreenSizeParams(currentActiveActivity);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, screenSizeParams);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                C4533d.m13173e().mo33649b(new C4532c(IronSourceConstants.TROUBLESHOOTING_SCREEN_SIZE, jSONObject));
            }
            C4533d.m13173e().mo33658d();
            C4537h.m13193e().mo33658d();
            C4616d a = C4616d.m13502a();
            String str = this.f10652j;
            String str2 = this.f10653k;
            a.f11401a = str;
            a.f11402b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f10625X.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m12702b(ad_unit);
                    } else {
                        m12689a(ad_unit, false);
                    }
                }
            }
            m12681E();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized AbstractAdapter mo33351b(String str) {
        try {
            if (this.f10619R != null && this.f10619R.getProviderName().equals(str)) {
                return this.f10619R;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Placement mo33352b() {
        C4661o oVar = this.f10651i.f11953c.f11610a;
        if (oVar != null) {
            return oVar.mo34043a();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo33353b(Context context) {
        String str;
        C4733p pVar;
        JSONObject jSONObject;
        m12687a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED, (JSONObject) null);
        if (context == null) {
            IronLog.API.error("bidding data cannot be retrieved, context required");
            return null;
        }
        C4476M.C4481a b = C4476M.m12866a().mo33491b();
        if (b == C4476M.C4481a.NOT_INIT) {
            IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            m12687a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else if (b == C4476M.C4481a.INIT_FAILED) {
            IronLog.API.error("bidding data cannot be retrieved, SDK failed to initialize");
            m12687a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            return null;
        } else {
            try {
                C4726l a = this.f10651i != null ? this.f10651i : C4448D.m12634a(context);
                if (b == C4476M.C4481a.NOT_INIT) {
                    this.f10642an.mo33157a(context);
                    this.f10642an.mo33163b(IronSourceUtils.getSDKVersion());
                    this.f10642an.mo33166c(this.f10658p);
                    this.f10642an.mo33167d(ConfigFile.getConfigFile().getPluginType());
                    this.f10642an.mo33158a(C4367a.m12413a());
                    this.f10642an.mo33165b(IronSourceUtils.isGooglePlayInstalled(context));
                }
                if (b != C4476M.C4481a.INITIATED) {
                    C4476M.m12866a().mo33490a(a);
                    if (a != null) {
                        C4476M.m12866a().mo33486a(context, a);
                    }
                }
                if (a == null || !a.mo34198b()) {
                    pVar = new C4733p();
                } else {
                    pVar = a.f11953c.f11614e.mo34651c();
                    if (!pVar.f11995d) {
                        pVar.f11993b = a.f11929b.mo34039a(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
                    }
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pVar, "tokenSettings");
                if (pVar.f11995d) {
                    C4405b bVar = new C4405b();
                    Intrinsics.checkNotNullParameter(context, "context");
                    JSONObject a2 = C4643m.m13618a(context, bVar.f10501a);
                    Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
                    jSONObject = C4405b.m12527a(a2);
                } else {
                    NetworkSettings networkSettings = pVar.f11993b;
                    if (networkSettings != null) {
                        C4616d a3 = C4616d.m13502a();
                        Intrinsics.checkNotNullExpressionValue(networkSettings, "it");
                        AbstractAdapter a4 = a3.mo33892a(networkSettings, networkSettings.getApplicationSettings(), true, false);
                        if (a4 != null) {
                            jSONObject = C4619f.m13526a().mo33904a(a4.getPlayerBiddingData(), pVar.f11994c, (List<String>) pVar.f11992a);
                        }
                    }
                    jSONObject = null;
                }
                C4619f.m13526a().mo33905a(jSONObject, true);
                str = pVar.f11996e ? IronSourceAES.compressAndEncrypt(jSONObject.toString()) : IronSourceAES.encrypt(jSONObject.toString());
            } catch (Throwable th) {
                m12687a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, (JSONObject) null);
                IronLog.API.error("got error during token creation: " + th.getMessage());
                str = null;
            }
            if (str == null) {
                m12687a((int) IronSourceConstants.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, (JSONObject) null);
            }
            return str;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo33354b(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f10648f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0162 }
            r2.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0162 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0162 }
            boolean r0 = r5.f10665w     // Catch:{ all -> 0x0144 }
            r1 = 508(0x1fc, float:7.12E-43)
            r2 = 3
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r8 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0035:
            boolean r0 = r5.f10663u     // Catch:{ all -> 0x0144 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r6 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r8 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0050:
            r0 = 0
            if (r6 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            r1.updateActivity(r6)     // Catch:{ all -> 0x0144 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0144 }
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x008c
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0144 }
            r8 = 81321(0x13da9, float:1.13955E-40)
            m12687a((int) r8, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r8 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0144 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0144 }
            r8.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x008c:
            com.ironsource.mediationsdk.M r6 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.M$a r6 = r6.mo33491b()     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ all -> 0x0144 }
            if (r6 != r1) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r6 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.M$a r1 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0144 }
            r4 = 83002(0x1443a, float:1.1631E-40)
            if (r6 != r1) goto L_0x00f6
            com.ironsource.mediationsdk.M r6 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0144 }
            boolean r6 = r6.mo33493c()     // Catch:{ all -> 0x0144 }
            if (r6 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r6 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f10639ak     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f10639ak     // Catch:{ all -> 0x00f3 }
            r0.add(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00f1
            int r6 = r5.f10613L     // Catch:{ all -> 0x0144 }
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r6)     // Catch:{ all -> 0x0144 }
            m12687a((int) r4, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            monitor-exit(r5)
            return
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x00f6:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f10639ak     // Catch:{ all -> 0x0144 }
            monitor-enter(r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.u r1 = r5.f10641am     // Catch:{ all -> 0x0141 }
            if (r1 != 0) goto L_0x0110
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f10639ak     // Catch:{ all -> 0x0141 }
            r0.add(r7)     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x010d
            int r8 = r5.f10613L     // Catch:{ all -> 0x0141 }
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r8)     // Catch:{ all -> 0x0141 }
            m12687a((int) r4, (org.json.JSONObject) r8)     // Catch:{ all -> 0x0141 }
        L_0x010d:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            monitor-exit(r5)
            return
        L_0x0110:
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            boolean r6 = r5.mo33361d()     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x0131
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f10648f     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "No rewarded video configurations found"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0144 }
            com.ironsource.mediationsdk.Z r6 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0144 }
            r6.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0131:
            if (r8 != 0) goto L_0x013a
            com.ironsource.mediationsdk.u r6 = r5.f10641am     // Catch:{ all -> 0x0144 }
            r8 = 0
            r6.mo34170a((java.lang.String) r7, (java.lang.String) r8, (boolean) r0)     // Catch:{ all -> 0x0144 }
            goto L_0x0160
        L_0x013a:
            com.ironsource.mediationsdk.u r6 = r5.f10641am     // Catch:{ all -> 0x0144 }
            r6.mo34170a((java.lang.String) r7, (java.lang.String) r8, (boolean) r3)     // Catch:{ all -> 0x0144 }
            monitor-exit(r5)
            return
        L_0x0141:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0141 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r6 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f10648f     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r8.logException(r0, r1, r6)     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.Z r8 = com.ironsource.mediationsdk.C4515Z.m13111a()     // Catch:{ all -> 0x0162 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0162 }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0162 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0162 }
            r8.mo33618a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0162 }
        L_0x0160:
            monitor-exit(r5)
            return
        L_0x0162:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33354b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo33355b(boolean z) {
        this.f10667y = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C4616d.m13502a().mo33896a(z);
        if (this.f10619R != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f10619R.setConsent(z);
        }
        int i = 40;
        if (!z) {
            i = 41;
        }
        this.f10642an.mo33162a(z);
        C4537h.m13193e().mo33649b(new C4532c(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: c */
    public final synchronized void mo33356c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C4432A.m12618a().mo33251a(str, new IronSourceError(510, "adm cannot be null"));
            return;
        }
        mo33359d(activity, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r9.f10668z.mo33392a_() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r9.f10605D.mo33814b() != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ all -> 0x008a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33357c() {
        /*
            r9 = this;
            java.lang.String r0 = "isRewardedVideoAvailable():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f10663u     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f10648f     // Catch:{ all -> 0x008f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x008f }
            return r2
        L_0x0013:
            boolean r3 = r9.f10607F     // Catch:{ all -> 0x008f }
            if (r3 != 0) goto L_0x0037
            boolean r3 = r9.f10637ai     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            boolean r3 = r9.f10606E     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0030
            com.ironsource.mediationsdk.z r3 = r9.f10668z     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.z r3 = r9.f10668z     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo33392a_()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
        L_0x002c:
            r3 = 1
            goto L_0x0044
        L_0x002e:
            r3 = 0
            goto L_0x0044
        L_0x0030:
            com.ironsource.mediationsdk.ab r3 = r9.f10644b     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo33701c()     // Catch:{ all -> 0x008f }
            goto L_0x0044
        L_0x0037:
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f10605D     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            com.ironsource.mediationsdk.adunit.c.h r3 = r9.f10605D     // Catch:{ all -> 0x008f }
            boolean r3 = r3.mo33814b()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            goto L_0x002c
        L_0x0044:
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x008a }
            boolean r5 = r9.f10606E     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x0062
            java.lang.Object[][] r5 = new java.lang.Object[r1][]     // Catch:{ all -> 0x008a }
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x008a }
            java.lang.String r7 = "programmatic"
            r6[r2] = r7     // Catch:{ all -> 0x008a }
            int r7 = r9.f10613L     // Catch:{ all -> 0x008a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x008a }
            r6[r1] = r7     // Catch:{ all -> 0x008a }
            r5[r2] = r6     // Catch:{ all -> 0x008a }
            m12695a((org.json.JSONObject) r4, (java.lang.Object[][]) r5)     // Catch:{ all -> 0x008a }
        L_0x0062:
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r6 = 1101(0x44d, float:1.543E-42)
            goto L_0x006b
        L_0x0069:
            r6 = 1102(0x44e, float:1.544E-42)
        L_0x006b:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.a.h r4 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ all -> 0x008a }
            r4.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r5)     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f10648f     // Catch:{ all -> 0x008a }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r6.<init>(r0)     // Catch:{ all -> 0x008a }
            r6.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008a }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x008a }
            r2 = r3
            goto L_0x00ad
        L_0x008a:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0091
        L_0x008f:
            r3 = move-exception
            r4 = 0
        L_0x0091:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isRewardedVideoAvailable()"
            r0.logException(r1, r4, r3)
        L_0x00ad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33357c():boolean");
    }

    /* renamed from: c */
    public final boolean mo33358c(String str) {
        try {
            this.f10648f.log(IronSourceLogger.IronSourceTag.API, this.f10628a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            C4370a aVar = new C4370a();
            if (!m12699a(str, 1, 128)) {
                aVar.mo33152a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (aVar.mo33153a()) {
                this.f10655m = str;
                C4537h.m13193e().mo33649b(new C4532c(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo33154b().toString(), 2);
            return false;
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f10628a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo33359d(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f10648f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x015c }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x015c }
            r2.append(r8)     // Catch:{ all -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015c }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x015c }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r1 = r6.f10666x     // Catch:{ all -> 0x0140 }
            r2 = 3
            if (r1 != 0) goto L_0x0035
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0035:
            boolean r1 = r6.f10664v     // Catch:{ all -> 0x0140 }
            if (r1 != 0) goto L_0x0050
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0140 }
            r9.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x0050:
            r1 = 0
            if (r7 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            r4.updateActivity(r7)     // Catch:{ all -> 0x0140 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0140 }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x008c
            if (r9 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r3)     // Catch:{ all -> 0x0140 }
            r9 = 82321(0x14191, float:1.15356E-40)
            m12701b(r9, r7)     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0140 }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r7)     // Catch:{ all -> 0x0140 }
            r9.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x008c:
            com.ironsource.mediationsdk.M r7 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.M$a r7 = r7.mo33491b()     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.M$a r4 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_FAILED     // Catch:{ all -> 0x0140 }
            if (r7 != r4) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r7 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.M$a r4 = com.ironsource.mediationsdk.C4476M.C4481a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0140 }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00f4
            com.ironsource.mediationsdk.M r7 = com.ironsource.mediationsdk.C4476M.m12866a()     // Catch:{ all -> 0x0140 }
            boolean r7 = r7.mo33493c()     // Catch:{ all -> 0x0140 }
            if (r7 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r7 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f10638aj     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f10638aj     // Catch:{ all -> 0x00f1 }
            r1.add(r8)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00ef
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0140 }
            m12701b(r5, r7)     // Catch:{ all -> 0x0140 }
        L_0x00ef:
            monitor-exit(r6)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x00f4:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f10638aj     // Catch:{ all -> 0x0140 }
            monitor-enter(r7)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.s r4 = r6.f10614M     // Catch:{ all -> 0x013d }
            if (r4 != 0) goto L_0x010c
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f10638aj     // Catch:{ all -> 0x013d }
            r1.add(r8)     // Catch:{ all -> 0x013d }
            if (r9 == 0) goto L_0x0109
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x013d }
            m12701b(r5, r9)     // Catch:{ all -> 0x013d }
        L_0x0109:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            monitor-exit(r6)
            return
        L_0x010c:
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            boolean r7 = r6.mo33368h()     // Catch:{ all -> 0x0140 }
            if (r7 != 0) goto L_0x012d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f10648f     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "No interstitial configurations found"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x0140 }
            com.ironsource.mediationsdk.A r7 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x0140 }
            java.lang.String r9 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x0140 }
            r7.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x012d:
            if (r9 != 0) goto L_0x0136
            com.ironsource.mediationsdk.s r7 = r6.f10614M     // Catch:{ all -> 0x0140 }
            r9 = 0
            r7.mo34077a((java.lang.String) r8, (java.lang.String) r9, (boolean) r1)     // Catch:{ all -> 0x0140 }
            goto L_0x015a
        L_0x0136:
            com.ironsource.mediationsdk.s r7 = r6.f10614M     // Catch:{ all -> 0x0140 }
            r7.mo34077a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x0140 }
            monitor-exit(r6)
            return
        L_0x013d:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            throw r9     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f10648f     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x015c }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r9.logException(r1, r2, r7)     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C4432A.m12618a()     // Catch:{ all -> 0x015c }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x015c }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x015c }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x015c }
            r9.mo33251a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x015c }
        L_0x015a:
            monitor-exit(r6)
            return
        L_0x015c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33359d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo33360d(String str) {
        try {
            this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f10628a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!m12699a(str, 1, 64) || !m12718v(str)) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f10657o = str;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f10628a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33361d() {
        C4726l lVar = this.f10651i;
        return (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11610a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public InterstitialPlacement mo33362e() {
        C4653h hVar = this.f10651i.f11953c.f11611b;
        if (hVar != null) {
            return hVar.mo34030a();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo33363e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.f10663u) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                this.f10649g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!mo33361d()) {
                this.f10649g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (this.f10606E) {
                m12708q(str);
            } else {
                Placement r = m12709r(str);
                if (r != null) {
                    this.f10644b.mo33695a(r);
                    this.f10644b.mo33696a(r.getPlacementName());
                }
            }
        } catch (Exception e) {
            this.f10648f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f10649g.onRewardedVideoAdShowFailed(new IronSourceError(510, e.getMessage()));
        }
    }

    /* renamed from: f */
    public final void mo33318f() {
        synchronized (this.f10632ad) {
            if (this.f10632ad.booleanValue()) {
                this.f10632ad = Boolean.FALSE;
                C4631j.m13569a().mo33932a(this.f10633ae, new IronSourceError(603, "init had failed"));
                this.f10633ae = null;
                this.f10634af = null;
            }
        }
        if (this.f10611J) {
            this.f10611J = false;
            C4665p.m13650a().mo34055a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.f10608G) {
            this.f10608G = false;
            C4665p.m13650a().mo34055a(IronSource.AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.f10638aj) {
            Iterator<String> it = this.f10638aj.iterator();
            while (it.hasNext()) {
                C4432A.m12618a().mo33251a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.f10638aj.clear();
        }
        synchronized (this.f10639ak) {
            Iterator<String> it2 = this.f10639ak.iterator();
            while (it2.hasNext()) {
                C4515Z.m13111a().mo33618a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f10639ak.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo33364f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.f10663u) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                C4515Z.m13111a().mo33619b(str, new IronSourceError(508, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            } else if (this.f10641am == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
                C4515Z.m13111a().mo33619b(str, new IronSourceError(508, "Rewarded video was not initiated"));
                return;
            } else {
                C4711u uVar = this.f10641am;
                if (!uVar.f11764a.containsKey(str)) {
                    C4711u.m13770a(1500, str);
                    C4515Z.m13111a().mo33619b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    C4734v vVar = uVar.f11764a.get(str);
                    uVar.mo34169a((int) IronSourceConstants.RV_INSTANCE_SHOW, vVar);
                    vVar.mo34209a();
                    return;
                }
            }
        } catch (Exception e) {
            this.f10648f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            C4515Z.m13111a().mo33619b(str, new IronSourceError(510, e.getMessage()));
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r9.f10604C.mo33814b() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r9.f10645c.mo33317e() != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ all -> 0x0073 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33365g() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f10664v     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f10648f     // Catch:{ all -> 0x0078 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0013:
            boolean r3 = r9.f10609H     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r9.f10610I     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002b
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f10604C     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.c.g r3 = r9.f10604C     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo33814b()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x0045
        L_0x0029:
            r3 = 0
            goto L_0x0045
        L_0x002b:
            com.ironsource.mediationsdk.S r3 = r9.f10602A     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.S r3 = r9.f10602A     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo33570e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0038:
            com.ironsource.mediationsdk.E r3 = r9.f10645c     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.E r3 = r9.f10645c     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo33317e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0045:
            boolean r4 = r9.f10609H     // Catch:{ all -> 0x0073 }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0052
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x0054
        L_0x0052:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x0054:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ all -> 0x0073 }
            r4.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r5)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f10648f     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r6.<init>(r0)     // Catch:{ all -> 0x0073 }
            r6.append(r3)     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0073 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0073 }
            r2 = r3
            goto L_0x0096
        L_0x0073:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x007a
        L_0x0078:
            r3 = move-exception
            r4 = 0
        L_0x007a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33365g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33366g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.u r0 = r4.f10641am     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.u r0 = r4.f10641am     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r2 = r0.f11764a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C4711u.m13770a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = 0
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.v> r0 = r0.f11764a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.v r5 = (com.ironsource.mediationsdk.C4734v) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo34211b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C4711u.m13769a((int) r0, (com.ironsource.mediationsdk.C4734v) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = 1
            goto L_0x0034
        L_0x002e:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C4711u.m13769a((int) r0, (com.ironsource.mediationsdk.C4734v) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33366g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0063;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33367h(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r6.f10664v     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x0036
            java.lang.String r7 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f10648f     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0090 }
            r4 = 3
            r2.log(r3, r7, r4)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.sdk.i r2 = r6.f10649g     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x0090 }
            r3.<init>(r1, r7)     // Catch:{ Exception -> 0x0090 }
            r2.onInterstitialAdShowFailed(r3)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x0036:
            boolean r2 = r6.mo33368h()     // Catch:{ Exception -> 0x0090 }
            if (r2 != 0) goto L_0x004a
            com.ironsource.mediationsdk.sdk.i r7 = r6.f10649g     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r3 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r3)     // Catch:{ Exception -> 0x0090 }
            r7.onInterstitialAdShowFailed(r2)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x004a:
            boolean r2 = r6.f10609H     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x0052
            r6.m12714t(r7)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x0052:
            com.ironsource.mediationsdk.model.InterstitialPlacement r2 = r6.m12715u(r7)     // Catch:{ Exception -> 0x0090 }
            r3 = 0
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r4 = "placement"
            if (r2 == 0) goto L_0x0067
            java.lang.String r7 = r2.getPlacementName()     // Catch:{ JSONException -> 0x006e }
        L_0x0063:
            r3.put(r4, r7)     // Catch:{ JSONException -> 0x006e }
            goto L_0x0072
        L_0x0067:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x006e }
            if (r5 != 0) goto L_0x0072
            goto L_0x0063
        L_0x006e:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ Exception -> 0x0090 }
        L_0x0072:
            com.ironsource.mediationsdk.a.c r7 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0090 }
            r4 = 2100(0x834, float:2.943E-42)
            r7.<init>(r4, r3)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ Exception -> 0x0090 }
            r3.mo33649b((com.ironsource.mediationsdk.p126a.C4532c) r7)     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x008f
            com.ironsource.mediationsdk.E r7 = r6.f10645c     // Catch:{ Exception -> 0x0090 }
            r7.mo33306a((com.ironsource.mediationsdk.model.InterstitialPlacement) r2)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.E r7 = r6.f10645c     // Catch:{ Exception -> 0x0090 }
            r2.getPlacementName()     // Catch:{ Exception -> 0x0090 }
            r7.mo33314d()     // Catch:{ Exception -> 0x0090 }
        L_0x008f:
            return
        L_0x0090:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f10648f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.logException(r3, r0, r7)
            com.ironsource.mediationsdk.sdk.i r0 = r6.f10649g
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r7 = r7.getMessage()
            r2.<init>(r1, r7)
            r0.onInterstitialAdShowFailed(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33367h(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo33368h() {
        C4726l lVar = this.f10651i;
        return (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11611b == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo33369i() {
        C4726l lVar = this.f10651i;
        return (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11612c == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo33370i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.s r0 = r4.f10614M     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.s r0 = r4.f10614M     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r2 = r0.f11699a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C4670s.m13675a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = 0
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r0 = r0.f11699a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.t r5 = (com.ironsource.mediationsdk.C4709t) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo34167b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C4670s.m13674a((int) r0, (com.ironsource.mediationsdk.C4709t) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = 1
            goto L_0x0034
        L_0x002e:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C4670s.m13674a((int) r0, (com.ironsource.mediationsdk.C4709t) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33370i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final void mo33371j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f10648f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!mo33369i()) {
                this.f10649g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C4655j a = this.f10651i.f11953c.f11612c.mo34032a(str);
            if (a == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f10651i.f11953c.f11612c.mo34031a();
                if (a == null) {
                    this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f10646d.mo33512a(a.f11630b);
        } catch (Exception e) {
            this.f10648f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f10649g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* renamed from: j */
    public final boolean mo33372j() {
        try {
            if (this.f10646d != null) {
                return this.f10646d.mo33515a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final InterstitialPlacement mo33373k(String str) {
        try {
            InterstitialPlacement s = m12711s(str);
            if (s == null) {
                try {
                    this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s = mo33362e();
                } catch (Exception unused) {
                    return s;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s, 1);
            return s;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: k */
    public final String mo33374k() {
        return this.f10652j;
    }

    /* renamed from: l */
    public final Placement mo33375l(String str) {
        try {
            Placement p = m12705p(str);
            if (p == null) {
                try {
                    this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p = mo33352b();
                } catch (Exception unused) {
                    return p;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f10648f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p, 1);
            return p;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f1  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo33376l() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            m12687a((int) r0, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = ""
            r0.info(r2)
            com.ironsource.mediationsdk.utils.l r0 = r8.f10651i
            if (r0 != 0) goto L_0x001b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00ee
        L_0x001b:
            com.ironsource.mediationsdk.model.n r0 = r0.f11929b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.mo34039a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00ee
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.d r3 = com.ironsource.mediationsdk.C4616d.m13502a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 0
            r6 = 1
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.mo33892a(r0, r4, r6, r5)
            if (r0 == 0) goto L_0x003e
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00cd }
        L_0x003e:
            com.ironsource.mediationsdk.utils.l r0 = r8.f10651i     // Catch:{ Exception -> 0x00cd }
            com.ironsource.mediationsdk.model.g r0 = r0.f11953c     // Catch:{ Exception -> 0x00cd }
            com.ironsource.sdk.f.a r0 = r0.f11614e     // Catch:{ Exception -> 0x00cd }
            com.ironsource.mediationsdk.utils.p r0 = r0.mo34651c()     // Catch:{ Exception -> 0x00cd }
            boolean r3 = r0.f11995d     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x005d
            com.ironsource.environment.f.b r2 = new com.ironsource.environment.f.b     // Catch:{ Exception -> 0x00cd }
            r2.<init>()     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r2 = r2.mo33214a()     // Catch:{ Exception -> 0x00cd }
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ Exception -> 0x00cd }
            r3.mo33905a((org.json.JSONObject) r2, (boolean) r6)     // Catch:{ Exception -> 0x00cd }
            goto L_0x0069
        L_0x005d:
            com.ironsource.mediationsdk.f r3 = com.ironsource.mediationsdk.C4619f.m13526a()     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r4 = r0.f11994c     // Catch:{ Exception -> 0x00cd }
            java.util.ArrayList<java.lang.String> r5 = r0.f11992a     // Catch:{ Exception -> 0x00cd }
            org.json.JSONObject r2 = r3.mo33904a((org.json.JSONObject) r2, (org.json.JSONObject) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x00cd }
        L_0x0069:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cd }
            r4.append(r2)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cd }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cd }
            if (r2 == 0) goto L_0x00ee
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00cd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00cd }
            r4.append(r5)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cd }
            r3.verbose(r4)     // Catch:{ Exception -> 0x00cd }
            boolean r0 = r0.f11996e     // Catch:{ Exception -> 0x00cd }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00ae
        L_0x00a6:
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encrypt(r0)     // Catch:{ Exception -> 0x00cd }
        L_0x00ae:
            if (r0 == 0) goto L_0x00ef
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c8 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00c8 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c8 }
            r2.verbose(r3)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00ef
        L_0x00c8:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00cf
        L_0x00cd:
            r0 = move-exception
            r2 = r1
        L_0x00cf:
            r3 = 83007(0x1443f, float:1.16318E-40)
            m12687a((int) r3, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00ef
        L_0x00ee:
            r0 = r1
        L_0x00ef:
            if (r0 != 0) goto L_0x00f7
            r2 = 83006(0x1443e, float:1.16316E-40)
            m12687a((int) r2, (org.json.JSONObject) r1)
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4455H.mo33376l():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo33377m() {
        return this.f10663u || this.f10664v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo33378m(String str) {
        boolean z = false;
        if (this.f10664v) {
            return false;
        }
        if (m12719w(str) != C4723k.C4725a.f11848d) {
            z = true;
        }
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f10664v, this.f10609H, 1);
            try {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, str);
                if (this.f10609H) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            C4533d.m13173e().mo33649b(new C4532c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo33379n(String str) {
        if (!m12679C()) {
            return false;
        }
        C4651f fVar = null;
        try {
            fVar = this.f10651i.f11953c.f11613d.mo34028a(str);
            if (fVar == null && (fVar = this.f10651i.f11953c.f11613d.mo34027a()) == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fVar == null) {
            return false;
        }
        return C4723k.m13837b(ContextProvider.getInstance().getApplicationContext(), fVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo33380o(String str) {
        C4726l lVar = this.f10651i;
        if (lVar == null || lVar.f11953c == null || this.f10651i.f11953c.f11610a == null) {
            return C4723k.C4725a.f11848d;
        }
        Placement placement = null;
        try {
            placement = m12705p(str);
            if (placement == null && (placement = mo33352b()) == null) {
                this.f10648f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? C4723k.C4725a.f11848d : C4723k.m13834b(ContextProvider.getInstance().getApplicationContext(), placement);
    }
}
