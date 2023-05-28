package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.p267a.C8894b;
import com.appodeal.ads.modules.common.internal.Constants;
import com.ironsource.mediationsdk.C4447C;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4652g;
import com.ironsource.mediationsdk.model.C4656k;
import com.ironsource.mediationsdk.model.C4658l;
import com.ironsource.mediationsdk.model.C4659m;
import com.ironsource.mediationsdk.model.C4660n;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.ironsource.mediationsdk.utils.l */
public final class C4726l {

    /* renamed from: A */
    private final String f11850A = "configurations";

    /* renamed from: B */
    private final String f11851B = IronSourceConstants.EVENTS_GENERIC_PARAMS;

    /* renamed from: C */
    private final String f11852C = "adUnits";

    /* renamed from: D */
    private final String f11853D = "providerLoadName";

    /* renamed from: E */
    private final String f11854E = "application";

    /* renamed from: F */
    private final String f11855F = "rewardedVideo";

    /* renamed from: G */
    private final String f11856G = "interstitial";

    /* renamed from: H */
    private final String f11857H = "offerwall";

    /* renamed from: I */
    private final String f11858I = "banner";

    /* renamed from: J */
    private final String f11859J = "integration";

    /* renamed from: K */
    private final String f11860K = "loggers";

    /* renamed from: L */
    private final String f11861L = "segment";

    /* renamed from: M */
    private final String f11862M = "events";

    /* renamed from: N */
    private final String f11863N = "crashReporter";

    /* renamed from: O */
    private final String f11864O = "token";

    /* renamed from: P */
    private final String f11865P = "external";

    /* renamed from: Q */
    private final String f11866Q = "mediationTypes";

    /* renamed from: R */
    private final String f11867R = "providerDefaultInstance";

    /* renamed from: S */
    private final String f11868S = C8894b.f22527hW;

    /* renamed from: T */
    private final String f11869T = "maxNumOfAdaptersToLoadOnStart";

    /* renamed from: U */
    private final String f11870U = "advancedLoading";

    /* renamed from: V */
    private final String f11871V = "adapterTimeOutInSeconds";

    /* renamed from: W */
    private final String f11872W = "atim";

    /* renamed from: X */
    private final String f11873X = "bannerInterval";

    /* renamed from: Y */
    private final String f11874Y = "loadRVInterval";

    /* renamed from: Z */
    private final String f11875Z = "expiredDurationInMinutes";

    /* renamed from: a */
    public C4659m f11876a;

    /* renamed from: aA */
    private final String f11877aA = "maxImpressions";

    /* renamed from: aB */
    private final String f11878aB = "numOfSeconds";

    /* renamed from: aC */
    private final String f11879aC = "unit";

    /* renamed from: aD */
    private final String f11880aD = "virtualItemName";

    /* renamed from: aE */
    private final String f11881aE = "virtualItemCount";

    /* renamed from: aF */
    private final String f11882aF = "backFill";

    /* renamed from: aG */
    private final String f11883aG = "premium";

    /* renamed from: aH */
    private final String f11884aH = "uuidEnabled";

    /* renamed from: aI */
    private final String f11885aI = "abt";

    /* renamed from: aJ */
    private final String f11886aJ = "delayLoadFailure";

    /* renamed from: aK */
    private final String f11887aK = "keysToInclude";

    /* renamed from: aL */
    private final String f11888aL = "reporterURL";

    /* renamed from: aM */
    private final String f11889aM = "reporterKeyword";

    /* renamed from: aN */
    private final String f11890aN = "includeANR";

    /* renamed from: aO */
    private final String f11891aO = "timeout";

    /* renamed from: aP */
    private final String f11892aP = "setIgnoreDebugger";

    /* renamed from: aQ */
    private final String f11893aQ = "adSourceName";

    /* renamed from: aR */
    private final String f11894aR = "spId";

    /* renamed from: aS */
    private final String f11895aS = "mpis";

    /* renamed from: aT */
    private final String f11896aT = "auction";

    /* renamed from: aU */
    private final String f11897aU = "auctionData";

    /* renamed from: aV */
    private final String f11898aV = "auctioneerURL";

    /* renamed from: aW */
    private final String f11899aW = IronSourceConstants.EVENTS_PROGRAMMATIC;

    /* renamed from: aX */
    private final String f11900aX = "objectPerWaterfall";

    /* renamed from: aY */
    private final String f11901aY = "minTimeBeforeFirstAuction";

    /* renamed from: aZ */
    private final String f11902aZ = "timeToWaitBeforeAuction";

    /* renamed from: aa */
    private final String f11903aa = "server";

    /* renamed from: ab */
    private final String f11904ab = "publisher";

    /* renamed from: ac */
    private final String f11905ac = "console";

    /* renamed from: ad */
    private final String f11906ad = "sendUltraEvents";

    /* renamed from: ae */
    private final String f11907ae = "sendEventsToggle";

    /* renamed from: af */
    private final String f11908af = "eventsCompression";

    /* renamed from: ag */
    private final String f11909ag = "serverEventsURL";

    /* renamed from: ah */
    private final String f11910ah = "serverEventsType";

    /* renamed from: ai */
    private final String f11911ai = "backupThreshold";

    /* renamed from: aj */
    private final String f11912aj = "maxNumberOfEvents";

    /* renamed from: ak */
    private final String f11913ak = "maxEventsPerBatch";

    /* renamed from: al */
    private final String f11914al = "optOut";

    /* renamed from: am */
    private final String f11915am = "optIn";

    /* renamed from: an */
    private final String f11916an = "triggerEvents";

    /* renamed from: ao */
    private final String f11917ao = "nonConnectivityEvents";

    /* renamed from: ap */
    private final String f11918ap = "pixel";

    /* renamed from: aq */
    private final String f11919aq = "pixelEventsUrl";

    /* renamed from: ar */
    private final String f11920ar = "pixelEventsEnabled";

    /* renamed from: as */
    private final String f11921as = "placements";

    /* renamed from: at */
    private final String f11922at = "placementId";

    /* renamed from: au */
    private final String f11923au = "placementName";

    /* renamed from: av */
    private final String f11924av = "delivery";

    /* renamed from: aw */
    private final String f11925aw = "isDefault";

    /* renamed from: ax */
    private final String f11926ax = "capping";

    /* renamed from: ay */
    private final String f11927ay = "pacing";

    /* renamed from: az */
    private final String f11928az = "enabled";

    /* renamed from: b */
    public C4660n f11929b;

    /* renamed from: ba */
    private final String f11930ba = "timeToWaitBeforeLoad";

    /* renamed from: bb */
    private final String f11931bb = "auctionRetryInterval";

    /* renamed from: bc */
    private final String f11932bc = "isAuctionOnShowStart";

    /* renamed from: bd */
    private final String f11933bd = "isLoadWhileShow";

    /* renamed from: be */
    private final String f11934be = IronSourceConstants.AUCTION_TRIALS;

    /* renamed from: bf */
    private final String f11935bf = "auctionTimeout";

    /* renamed from: bg */
    private final String f11936bg = "auctionSavedHistory";

    /* renamed from: bh */
    private final String f11937bh = "disableLoadWhileShowSupportFor";

    /* renamed from: bi */
    private final String f11938bi = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: bj */
    private final String f11939bj = "compressAuctionRequest";

    /* renamed from: bk */
    private final String f11940bk = "compressAuctionResponse";

    /* renamed from: bl */
    private final String f11941bl = "encryptionVersion";

    /* renamed from: bm */
    private final String f11942bm = "shouldSendBannerBURLFromImpression";

    /* renamed from: bn */
    private final String f11943bn = "optInKeys";

    /* renamed from: bo */
    private final String f11944bo = "tokenGenericParams";

    /* renamed from: bp */
    private final String f11945bp = "oneToken";

    /* renamed from: bq */
    private final String f11946bq = "compressToken";

    /* renamed from: br */
    private final String f11947br = "isExternalArmEventsEnabled";

    /* renamed from: bs */
    private final String f11948bs = "externalArmEventsUrl";

    /* renamed from: bt */
    private final String f11949bt = "compressExternalToken";

    /* renamed from: bu */
    private String f11950bu;

    /* renamed from: bv */
    private String f11951bv;

    /* renamed from: bw */
    private Context f11952bw;

    /* renamed from: c */
    public C4652g f11953c;

    /* renamed from: d */
    public JSONObject f11954d;

    /* renamed from: e */
    public int f11955e = C4727a.f11977a;

    /* renamed from: f */
    private final String f11956f = "error";

    /* renamed from: g */
    private final int f11957g = 3;

    /* renamed from: h */
    private final int f11958h = 2;

    /* renamed from: i */
    private final int f11959i = 60;

    /* renamed from: j */
    private final int f11960j = 10000;

    /* renamed from: k */
    private final int f11961k = 5000;

    /* renamed from: l */
    private final int f11962l = C5643c.COLLECT_MODE_FINANCE;

    /* renamed from: m */
    private final int f11963m = 3;

    /* renamed from: n */
    private final int f11964n = 3;

    /* renamed from: o */
    private final int f11965o = 3;

    /* renamed from: p */
    private final int f11966p = 2;

    /* renamed from: q */
    private final int f11967q = 15;

    /* renamed from: r */
    private final long f11968r = 10000;

    /* renamed from: s */
    private final int f11969s = 0;

    /* renamed from: t */
    private final boolean f11970t = false;

    /* renamed from: u */
    private final int f11971u = Constants.FAILED_REQUEST_PRECACHE_MS;

    /* renamed from: v */
    private final int f11972v = -1;

    /* renamed from: w */
    private final int f11973w = 5000;

    /* renamed from: x */
    private final int f11974x = 1;

    /* renamed from: y */
    private final String f11975y = "providerOrder";

    /* renamed from: z */
    private final String f11976z = "providerSettings";

    /* renamed from: com.ironsource.mediationsdk.utils.l$a */
    public enum C4727a {
        ;
        

        /* renamed from: a */
        public static final int f11977a = 1;

        /* renamed from: b */
        public static final int f11978b = 2;

        /* renamed from: c */
        public static final int f11979c = 3;

        static {
            f11980d = new int[]{1, 2, 3};
        }
    }

    public C4726l(Context context, String str, String str2, String str3) {
        this.f11952bw = context;
        try {
            this.f11954d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            m13858h();
            m13859i();
            m13857g();
            this.f11950bu = TextUtils.isEmpty(str) ? "" : str;
            this.f11951bv = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            m13855e();
        }
    }

    public C4726l(C4726l lVar) {
        try {
            this.f11952bw = lVar.f11952bw;
            this.f11954d = new JSONObject(lVar.f11954d.toString());
            this.f11950bu = lVar.f11950bu;
            this.f11951bv = lVar.f11951bv;
            this.f11876a = lVar.f11876a;
            this.f11929b = lVar.f11929b;
            this.f11953c = lVar.f11953c;
            this.f11955e = lVar.f11955e;
        } catch (Exception unused) {
            m13855e();
        }
    }

    /* renamed from: a */
    private static int m13851a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    /* renamed from: a */
    private static C4656k m13852a(JSONObject jSONObject) {
        C4658l lVar = null;
        if (jSONObject == null) {
            return null;
        }
        C4656k.C4657a aVar = new C4656k.C4657a();
        boolean z = true;
        aVar.f11638a = jSONObject.optBoolean("delivery", true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (C4658l.PER_DAY.toString().equals(optString)) {
                    lVar = C4658l.PER_DAY;
                } else if (C4658l.PER_HOUR.toString().equals(optString)) {
                    lVar = C4658l.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.mo34036a(optJSONObject.optBoolean("enabled", false) && optInt > 0, lVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean("enabled", false) || optInt2 <= 0) {
                z = false;
            }
            aVar.mo34035a(z, optInt2);
        }
        return aVar.mo34037a();
    }

    /* renamed from: a */
    private static int[] m13853a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        int[] iArr = new int[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            iArr[i] = optJSONArray.optInt(i);
        }
        return iArr;
    }

    /* renamed from: b */
    private static JSONObject m13854b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: e */
    private void m13855e() {
        this.f11954d = new JSONObject();
        this.f11950bu = "";
        this.f11951bv = "";
        this.f11876a = new C4659m();
        this.f11929b = C4660n.m13636a();
        this.f11953c = new C4652g();
    }

    /* renamed from: f */
    private boolean m13856f() {
        JSONArray names = m13854b(this.f11954d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject b = m13854b(m13854b(this.f11954d, "configurations"), "adUnits");
        for (int i = 0; i < names.length(); i++) {
            JSONArray optJSONArray = m13854b(b, names.optString(i)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    private void m13857g() {
        try {
            JSONObject b = m13854b(this.f11954d, "providerOrder");
            JSONArray optJSONArray = b.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b.optJSONArray("interstitial");
            JSONArray optJSONArray3 = b.optJSONArray("banner");
            this.f11876a = new C4659m();
            if (!(optJSONArray == null || this.f11953c == null || this.f11953c.f11610a == null)) {
                String str = this.f11953c.f11610a.f11662f;
                String str2 = this.f11953c.f11610a.f11663g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.f11876a.f11649b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.f11876a.f11650c = str2;
                        }
                        C4659m mVar = this.f11876a;
                        if (!TextUtils.isEmpty(optString)) {
                            mVar.f11648a.add(optString);
                        }
                        NetworkSettings a = C4660n.m13636a().mo34039a(optString);
                        if (a != null) {
                            a.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (!(optJSONArray2 == null || this.f11953c == null || this.f11953c.f11611b == null)) {
                String str3 = this.f11953c.f11611b.f11621g;
                String str4 = this.f11953c.f11611b.f11622h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.f11876a.f11653f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.f11876a.f11654g = str4;
                        }
                        C4659m mVar2 = this.f11876a;
                        if (!TextUtils.isEmpty(optString2)) {
                            mVar2.f11651d.add(optString2);
                        }
                        NetworkSettings a2 = C4660n.m13636a().mo34039a(optString2);
                        if (a2 != null) {
                            a2.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    C4659m mVar3 = this.f11876a;
                    if (!TextUtils.isEmpty(optString3)) {
                        mVar3.f11652e.add(optString3);
                    }
                    NetworkSettings a3 = C4660n.m13636a().mo34039a(optString3);
                    if (a3 != null) {
                        a3.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00e2 A[Catch:{ Exception -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0132 A[Catch:{ Exception -> 0x015c }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13858h() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "Mediation"
            com.ironsource.mediationsdk.model.n r2 = com.ironsource.mediationsdk.model.C4660n.m13636a()     // Catch:{ Exception -> 0x015c }
            r1.f11929b = r2     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r1.f11954d     // Catch:{ Exception -> 0x015c }
            java.lang.String r3 = "providerSettings"
            org.json.JSONObject r2 = m13854b(r2, r3)     // Catch:{ Exception -> 0x015c }
            java.util.Iterator r3 = r2.keys()     // Catch:{ Exception -> 0x015c }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x015c }
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r4 = r2.optJSONObject(r6)     // Catch:{ Exception -> 0x015c }
            if (r4 == 0) goto L_0x014c
            java.lang.String r5 = "mpis"
            r7 = 0
            boolean r13 = r4.optBoolean(r5, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "spId"
            java.lang.String r8 = "0"
            java.lang.String r14 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adSourceName"
            r8 = 0
            java.lang.String r15 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerLoadName"
            java.lang.String r8 = r4.optString(r5, r6)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "providerDefaultInstance"
            java.lang.String r9 = r4.optString(r5, r8)     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = "adUnits"
            org.json.JSONObject r5 = m13854b(r4, r5)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "application"
            org.json.JSONObject r4 = m13854b(r4, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r10 = "rewardedVideo"
            org.json.JSONObject r10 = m13854b(r5, r10)     // Catch:{ Exception -> 0x015c }
            java.lang.String r11 = "interstitial"
            org.json.JSONObject r11 = m13854b(r5, r11)     // Catch:{ Exception -> 0x015c }
            java.lang.String r12 = "banner"
            org.json.JSONObject r5 = m13854b(r5, r12)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r11, r4)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r4)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r5 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            boolean r5 = r5.mo34042b(r6)     // Catch:{ Exception -> 0x015c }
            if (r5 == 0) goto L_0x00af
            com.ironsource.mediationsdk.model.n r4 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r4 = r4.mo34039a((java.lang.String) r6)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r4.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r6 = r4.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r4.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r10)     // Catch:{ Exception -> 0x015c }
            r4.setRewardedVideoSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r6, r11)     // Catch:{ Exception -> 0x015c }
            r4.setInterstitialSettings(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            r4.setBannerSettings(r5)     // Catch:{ Exception -> 0x015c }
            r4.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r4.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r4.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            goto L_0x0016
        L_0x00af:
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r8.toLowerCase(r5)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r7 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            boolean r7 = r7.mo34042b(r0)     // Catch:{ Exception -> 0x015c }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "SupersonicAds"
            r17 = r2
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r7.toLowerCase(r2)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x00db
            java.lang.String r2 = "IronSource"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toLowerCase(r7)     // Catch:{ Exception -> 0x015c }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x00df
        L_0x00db:
            r7 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r2
        L_0x00df:
            r7 = 0
        L_0x00e0:
            if (r7 == 0) goto L_0x0132
            com.ironsource.mediationsdk.model.n r2 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r2.mo34039a((java.lang.String) r0)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = r2.getRewardedVideoSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = r2.getInterstitialSettings()     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r2 = r2.getBannerSettings()     // Catch:{ Exception -> 0x015c }
            r16 = r0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015c }
            r0.<init>(r5)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015c }
            r5.<init>(r7)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x015c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015c }
            r7.<init>(r2)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r0, r10)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r5, r11)     // Catch:{ Exception -> 0x015c }
            org.json.JSONObject r12 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r12)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            goto L_0x0148
        L_0x0132:
            r16 = r0
            com.ironsource.mediationsdk.model.NetworkSettings r0 = new com.ironsource.mediationsdk.model.NetworkSettings     // Catch:{ Exception -> 0x015c }
            r5 = r0
            r7 = r8
            r8 = r9
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x015c }
            r0.setIsMultipleInstances(r13)     // Catch:{ Exception -> 0x015c }
            r0.setSubProviderId(r14)     // Catch:{ Exception -> 0x015c }
            r0.setAdSourceNameForEvents(r15)     // Catch:{ Exception -> 0x015c }
            com.ironsource.mediationsdk.model.n r2 = r1.f11929b     // Catch:{ Exception -> 0x015c }
        L_0x0148:
            r2.mo34040a((com.ironsource.mediationsdk.model.NetworkSettings) r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0150
        L_0x014c:
            r16 = r0
            r17 = r2
        L_0x0150:
            r0 = r16
            r2 = r17
            goto L_0x0016
        L_0x0156:
            com.ironsource.mediationsdk.model.n r0 = r1.f11929b     // Catch:{ Exception -> 0x015c }
            r0.mo34041b()     // Catch:{ Exception -> 0x015c }
            return
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4726l.m13858h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0557 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x079d A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x08d9 A[Catch:{ Exception -> 0x058a }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0325 A[Catch:{ Exception -> 0x058a }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13859i() {
        /*
            r82 = this;
            r1 = r82
            java.lang.String r2 = "events"
            org.json.JSONObject r3 = r1.f11954d     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "configurations"
            org.json.JSONObject r3 = m13854b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r4 = "adUnits"
            org.json.JSONObject r4 = m13854b(r3, r4)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "application"
            org.json.JSONObject r3 = m13854b(r3, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r5 = "rewardedVideo"
            org.json.JSONObject r5 = m13854b(r4, r5)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r6 = "interstitial"
            org.json.JSONObject r6 = m13854b(r4, r6)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r7 = "offerwall"
            org.json.JSONObject r7 = m13854b(r4, r7)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r8 = "banner"
            org.json.JSONObject r4 = m13854b(r4, r8)     // Catch:{ Exception -> 0x0ac4 }
            org.json.JSONObject r8 = m13854b(r3, r2)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r9 = "loggers"
            org.json.JSONObject r9 = m13854b(r3, r9)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r10 = "token"
            org.json.JSONObject r10 = m13854b(r3, r10)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r11 = "segment"
            org.json.JSONObject r11 = m13854b(r3, r11)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r12 = "auction"
            org.json.JSONObject r12 = m13854b(r3, r12)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r13 = "crashReporter"
            org.json.JSONObject r13 = m13854b(r3, r13)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r14 = "settings"
            org.json.JSONObject r14 = m13854b(r3, r14)     // Catch:{ Exception -> 0x0ac4 }
            java.lang.String r15 = "external"
            org.json.JSONObject r15 = m13854b(r3, r15)     // Catch:{ Exception -> 0x0ac4 }
            r16 = r15
            java.lang.String r15 = "pixel"
            org.json.JSONObject r15 = m13854b(r8, r15)     // Catch:{ Exception -> 0x0ac4 }
            r17 = r14
            r14 = 1
            if (r3 == 0) goto L_0x007d
            r18 = r11
            java.lang.String r11 = "uuidEnabled"
            boolean r11 = r3.optBoolean(r11, r14)     // Catch:{ Exception -> 0x0ac4 }
            android.content.Context r14 = r1.f11952bw     // Catch:{ Exception -> 0x0ac4 }
            r19 = r13
            java.lang.String r13 = "uuidEnabled"
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveBooleanToSharedPrefs(r14, r13, r11)     // Catch:{ Exception -> 0x0ac4 }
            goto L_0x0081
        L_0x007d:
            r18 = r11
            r19 = r13
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            java.lang.String r11 = "abt"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ Exception -> 0x0ac4 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x0ac4 }
            if (r13 != 0) goto L_0x009b
            com.ironsource.mediationsdk.a.d r13 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ Exception -> 0x0ac4 }
            r13.f11094p = r11     // Catch:{ Exception -> 0x0ac4 }
            com.ironsource.mediationsdk.a.h r13 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ Exception -> 0x0ac4 }
            r13.f11094p = r11     // Catch:{ Exception -> 0x0ac4 }
        L_0x009b:
            java.lang.String r11 = "triggerEvents"
            java.lang.String r13 = "maxEventsPerBatch"
            java.lang.String r14 = "maxNumberOfEvents"
            r20 = r9
            java.lang.String r9 = "backupThreshold"
            r21 = r6
            r22 = r7
            java.lang.String r6 = "serverEventsType"
            java.lang.String r7 = "serverEventsURL"
            r24 = r15
            java.lang.String r15 = "sendEventsToggle"
            r25 = r10
            java.lang.String r10 = "placements"
            r26 = r4
            java.lang.String r4 = "optIn"
            java.lang.String r1 = "optOut"
            r27 = r12
            java.lang.String r12 = "eventsCompression"
            r28 = r11
            java.lang.String r11 = ""
            r29 = 0
            r30 = r4
            if (r5 == 0) goto L_0x0357
            org.json.JSONArray r4 = r5.optJSONArray(r10)     // Catch:{ Exception -> 0x0352 }
            r31 = r10
            org.json.JSONObject r10 = m13854b(r5, r2)     // Catch:{ Exception -> 0x0352 }
            r32 = r2
            java.lang.String r2 = "maxNumOfAdaptersToLoadOnStart"
            r33 = r4
            r4 = 2
            int r2 = m13851a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "advancedLoading"
            r34 = r2
            r2 = 0
            int r4 = m13851a(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0352 }
            if (r4 <= 0) goto L_0x00ee
            r36 = r4
            r37 = 1
            goto L_0x00f2
        L_0x00ee:
            r36 = r34
            r37 = 0
        L_0x00f2:
            java.lang.String r2 = "adapterTimeOutInSeconds"
            r4 = 60
            int r38 = m13851a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "loadRVInterval"
            r4 = 300(0x12c, float:4.2E-43)
            int r39 = m13851a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "expiredDurationInMinutes"
            r4 = -1
            int r40 = m13851a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "delayLoadFailure"
            r4 = 3
            int r43 = m13851a(r5, r3, r2, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r10, r8)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "sendUltraEvents"
            r10 = 0
            boolean r45 = r2.optBoolean(r4, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r46 = r2.optBoolean(r15, r10)     // Catch:{ Exception -> 0x0352 }
            boolean r47 = r2.optBoolean(r12, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r48 = r2.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r49 = r2.optString(r6, r11)     // Catch:{ Exception -> 0x0352 }
            r4 = -1
            int r50 = r2.optInt(r9, r4)     // Catch:{ Exception -> 0x0352 }
            int r51 = r2.optInt(r14, r4)     // Catch:{ Exception -> 0x0352 }
            r4 = 5000(0x1388, float:7.006E-42)
            int r52 = r2.optInt(r13, r4)     // Catch:{ Exception -> 0x0352 }
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x015d
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r34 = r1
            r57 = r13
            r1 = 0
        L_0x014b:
            int r13 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r1 >= r13) goto L_0x015a
            int r13 = r4.optInt(r1)     // Catch:{ Exception -> 0x0352 }
            r10[r1] = r13     // Catch:{ Exception -> 0x0352 }
            int r1 = r1 + 1
            goto L_0x014b
        L_0x015a:
            r53 = r10
            goto L_0x0163
        L_0x015d:
            r34 = r1
            r57 = r13
            r53 = r29
        L_0x0163:
            r1 = r30
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x0186
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r30 = r1
            r13 = 0
        L_0x0174:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x0183
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0183:
            r54 = r10
            goto L_0x018a
        L_0x0186:
            r30 = r1
            r54 = r29
        L_0x018a:
            r1 = r28
            org.json.JSONArray r4 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r4 == 0) goto L_0x01ad
            int r10 = r4.length()     // Catch:{ Exception -> 0x0352 }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x0352 }
            r28 = r1
            r13 = 0
        L_0x019b:
            int r1 = r4.length()     // Catch:{ Exception -> 0x0352 }
            if (r13 >= r1) goto L_0x01aa
            int r1 = r4.optInt(r13)     // Catch:{ Exception -> 0x0352 }
            r10[r13] = r1     // Catch:{ Exception -> 0x0352 }
            int r13 = r13 + 1
            goto L_0x019b
        L_0x01aa:
            r55 = r10
            goto L_0x01b1
        L_0x01ad:
            r28 = r1
            r55 = r29
        L_0x01b1:
            java.lang.String r1 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r2.optJSONArray(r1)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x01d2
            int r2 = r1.length()     // Catch:{ Exception -> 0x0352 }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x0352 }
            r4 = 0
        L_0x01c0:
            int r10 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r4 >= r10) goto L_0x01cf
            int r10 = r1.optInt(r4)     // Catch:{ Exception -> 0x0352 }
            r2[r4] = r10     // Catch:{ Exception -> 0x0352 }
            int r4 = r4 + 1
            goto L_0x01c0
        L_0x01cf:
            r56 = r2
            goto L_0x01d4
        L_0x01d2:
            r56 = r29
        L_0x01d4:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x0352 }
            r44 = r41
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)     // Catch:{ Exception -> 0x0352 }
            if (r27 == 0) goto L_0x02a0
            java.lang.String r1 = "rewardedVideo"
            r2 = r27
            org.json.JSONObject r1 = m13854b(r2, r1)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionData"
            java.lang.String r59 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r4, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTrials"
            r10 = 2
            int r61 = r2.optInt(r4, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionTimeout"
            r10 = r14
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r4, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "programmatic"
            boolean r65 = r1.optBoolean(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r4 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r4 = r1.optInt(r4, r13)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r13 = "auctionRetryInterval"
            r14 = 30000(0x7530, float:4.2039E-41)
            int r13 = r1.optInt(r13, r14)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r14 = "timeToWaitBeforeAuction"
            r27 = r2
            r2 = 5000(0x1388, float:7.006E-42)
            int r14 = r1.optInt(r14, r2)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "timeToWaitBeforeLoad"
            r44 = r10
            r10 = 50
            int r2 = r1.optInt(r2, r10)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isAuctionOnShowStart"
            r45 = r9
            r9 = 0
            boolean r74 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r10 = "isLoadWhileShow"
            boolean r75 = r1.optBoolean(r10, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r9 = "timeToDeleteOldWaterfallAfterAuction"
            r10 = 30000(0x7530, float:4.2039E-41)
            int r76 = r1.optInt(r9, r10)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.utils.c r9 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r10 = r6
            r46 = r7
            long r6 = (long) r4     // Catch:{ Exception -> 0x0352 }
            r66 = r6
            long r6 = (long) r13     // Catch:{ Exception -> 0x0352 }
            r68 = r6
            long r6 = (long) r14     // Catch:{ Exception -> 0x0352 }
            r70 = r6
            long r6 = (long) r2     // Catch:{ Exception -> 0x0352 }
            r72 = r6
            r81 = 0
            r58 = r9
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r2 = "disableLoadWhileShowSupportFor"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x0352 }
            if (r1 == 0) goto L_0x029d
            r2 = 0
        L_0x0285:
            int r4 = r1.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x029d
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0352 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0352 }
            if (r6 != 0) goto L_0x029a
            java.util.ArrayList<java.lang.String> r6 = r9.f11787o     // Catch:{ Exception -> 0x0352 }
            r6.add(r4)     // Catch:{ Exception -> 0x0352 }
        L_0x029a:
            int r2 = r2 + 1
            goto L_0x0285
        L_0x029d:
            r42 = r9
            goto L_0x02ae
        L_0x02a0:
            r10 = r6
            r46 = r7
            r45 = r9
            r44 = r14
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x0352 }
            r1.<init>()     // Catch:{ Exception -> 0x0352 }
            r42 = r1
        L_0x02ae:
            com.ironsource.mediationsdk.model.o r1 = new com.ironsource.mediationsdk.model.o     // Catch:{ Exception -> 0x0352 }
            r35 = r1
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0352 }
            if (r33 == 0) goto L_0x0331
            r2 = 0
        L_0x02b8:
            int r4 = r33.length()     // Catch:{ Exception -> 0x0352 }
            if (r2 >= r4) goto L_0x0331
            r4 = r33
            org.json.JSONObject r6 = r4.optJSONObject(r2)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x0311
            java.lang.String r7 = "placementId"
            r9 = -1
            int r36 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "placementName"
            java.lang.String r37 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "isDefault"
            r9 = 0
            boolean r38 = r6.optBoolean(r7, r9)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemName"
            java.lang.String r39 = r6.optString(r7, r11)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r7 = "virtualItemCount"
            r9 = -1
            int r40 = r6.optInt(r7, r9)     // Catch:{ Exception -> 0x0352 }
            com.ironsource.mediationsdk.model.k r6 = m13852a((org.json.JSONObject) r6)     // Catch:{ Exception -> 0x0352 }
            if (r36 < 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r37)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            boolean r7 = android.text.TextUtils.isEmpty(r39)     // Catch:{ Exception -> 0x0352 }
            if (r7 != 0) goto L_0x0311
            if (r40 <= 0) goto L_0x0311
            com.ironsource.mediationsdk.model.Placement r7 = new com.ironsource.mediationsdk.model.Placement     // Catch:{ Exception -> 0x0352 }
            r35 = r7
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0352 }
            if (r6 == 0) goto L_0x030e
            r6 = r82
            android.content.Context r9 = r6.f11952bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C4723k.m13828a((android.content.Context) r9, (com.ironsource.mediationsdk.model.Placement) r7)     // Catch:{ Exception -> 0x058a }
            goto L_0x0315
        L_0x030e:
            r6 = r82
            goto L_0x0315
        L_0x0311:
            r6 = r82
            r7 = r29
        L_0x0315:
            if (r7 == 0) goto L_0x032c
            if (r7 == 0) goto L_0x032c
            java.util.ArrayList<com.ironsource.mediationsdk.model.Placement> r9 = r1.f11657a     // Catch:{ Exception -> 0x058a }
            r9.add(r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.Placement r9 = r1.f11667k     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0325
        L_0x0322:
            r1.f11667k = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x032c
        L_0x0325:
            int r9 = r7.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x032c
            goto L_0x0322
        L_0x032c:
            int r2 = r2 + 1
            r33 = r4
            goto L_0x02b8
        L_0x0331:
            r6 = r82
            java.lang.String r2 = "backFill"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0341
            r1.f11662f = r2     // Catch:{ Exception -> 0x058a }
        L_0x0341:
            java.lang.String r2 = "premium"
            java.lang.String r2 = r5.optString(r2)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x034f
            r1.f11663g = r2     // Catch:{ Exception -> 0x058a }
        L_0x034f:
            r36 = r1
            goto L_0x036a
        L_0x0352:
            r0 = move-exception
            r6 = r82
            goto L_0x0ac6
        L_0x0357:
            r34 = r1
            r32 = r2
            r46 = r7
            r45 = r9
            r31 = r10
            r57 = r13
            r44 = r14
            r10 = r6
            r6 = r82
            r36 = r29
        L_0x036a:
            if (r21 == 0) goto L_0x058d
            r1 = r21
            r2 = r31
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            r5 = r32
            org.json.JSONObject r7 = m13854b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r13 = 2
            int r9 = m13851a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "advancedLoading"
            r14 = 0
            int r13 = m13851a(r1, r3, r13, r14)     // Catch:{ Exception -> 0x058a }
            if (r13 <= 0) goto L_0x038f
            r38 = r13
            r39 = 1
            goto L_0x0393
        L_0x038f:
            r38 = r9
            r39 = 0
        L_0x0393:
            java.lang.String r9 = "adapterTimeOutInSeconds"
            r13 = 60
            int r40 = m13851a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "delayLoadFailure"
            r13 = 3
            int r43 = m13851a(r1, r3, r9, r13)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r9 = 0
            boolean r60 = r7.optBoolean(r15, r9)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r7.optBoolean(r12, r9)     // Catch:{ Exception -> 0x058a }
            r9 = r46
            java.lang.String r62 = r7.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r7.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            r13 = r45
            r14 = -1
            int r64 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r45 = r13
            r13 = r44
            int r65 = r7.optInt(r13, r14)     // Catch:{ Exception -> 0x058a }
            r44 = r13
            r14 = r57
            r13 = 5000(0x1388, float:7.006E-42)
            int r66 = r7.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r57 = r14
            r13 = r34
            org.json.JSONArray r14 = r7.optJSONArray(r13)     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x03fb
            r34 = r13
            int r13 = r14.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r46 = r9
            r21 = r10
            r10 = 0
        L_0x03e9:
            int r9 = r14.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r9) goto L_0x03f8
            int r9 = r14.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r13[r10] = r9     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x03e9
        L_0x03f8:
            r67 = r13
            goto L_0x0403
        L_0x03fb:
            r46 = r9
            r21 = r10
            r34 = r13
            r67 = r29
        L_0x0403:
            r9 = r30
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x0426
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r9
            r14 = 0
        L_0x0414:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x0423
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0414
        L_0x0423:
            r68 = r13
            goto L_0x042a
        L_0x0426:
            r30 = r9
            r68 = r29
        L_0x042a:
            r9 = r28
            org.json.JSONArray r10 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x044d
            int r13 = r10.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r9
            r14 = 0
        L_0x043b:
            int r9 = r10.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r9) goto L_0x044a
            int r9 = r10.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r9     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x043b
        L_0x044a:
            r69 = r13
            goto L_0x0451
        L_0x044d:
            r28 = r9
            r69 = r29
        L_0x0451:
            java.lang.String r9 = "nonConnectivityEvents"
            org.json.JSONArray r7 = r7.optJSONArray(r9)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0472
            int r9 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r9 = new int[r9]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0460:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x046f
            int r13 = r7.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r9[r10] = r13     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0460
        L_0x046f:
            r70 = r9
            goto L_0x0474
        L_0x0472:
            r70 = r29
        L_0x0474:
            com.ironsource.sdk.g.d r41 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r41
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x04ed
            java.lang.String r7 = "interstitial"
            r9 = r27
            org.json.JSONObject r7 = m13854b(r9, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionData"
            java.lang.String r59 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctioneerURL"
            java.lang.String r60 = r9.optString(r10, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTrials"
            r13 = 2
            int r61 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionSavedHistory"
            r13 = 15
            int r62 = r9.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r9.optLong(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "compressAuctionResponse"
            boolean r78 = r9.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "encryptionVersion"
            r14 = 1
            int r80 = r9.optInt(r10, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "programmatic"
            boolean r65 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "objectPerWaterfall"
            boolean r79 = r7.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r7 = r7.optInt(r10, r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r10 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r7     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r81 = 0
            r58 = r10
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            r42 = r10
            goto L_0x04f6
        L_0x04ed:
            r9 = r27
            com.ironsource.mediationsdk.utils.c r7 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r7.<init>()     // Catch:{ Exception -> 0x058a }
            r42 = r7
        L_0x04f6:
            com.ironsource.mediationsdk.model.h r7 = new com.ironsource.mediationsdk.model.h     // Catch:{ Exception -> 0x058a }
            r37 = r7
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0567
            r10 = 0
        L_0x0500:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r13) goto L_0x0567
            org.json.JSONObject r13 = r4.optJSONObject(r10)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x053f
            java.lang.String r14 = "placementId"
            r27 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r11)     // Catch:{ Exception -> 0x058a }
            r31 = r9
            java.lang.String r9 = "isDefault"
            r32 = r11
            r11 = 0
            boolean r9 = r13.optBoolean(r9, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = m13852a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x0545
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0545
            com.ironsource.mediationsdk.model.InterstitialPlacement r13 = new com.ironsource.mediationsdk.model.InterstitialPlacement     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r9, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x0547
            android.content.Context r4 = r6.f11952bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C4723k.m13827a((android.content.Context) r4, (com.ironsource.mediationsdk.model.InterstitialPlacement) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x0547
        L_0x053f:
            r27 = r4
            r31 = r9
            r32 = r11
        L_0x0545:
            r13 = r29
        L_0x0547:
            if (r13 == 0) goto L_0x055e
            if (r13 == 0) goto L_0x055e
            java.util.ArrayList<com.ironsource.mediationsdk.model.InterstitialPlacement> r4 = r7.f11615a     // Catch:{ Exception -> 0x058a }
            r4.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.InterstitialPlacement r4 = r7.f11624j     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0557
        L_0x0554:
            r7.f11624j = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x055e
        L_0x0557:
            int r4 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x055e
            goto L_0x0554
        L_0x055e:
            int r10 = r10 + 1
            r4 = r27
            r9 = r31
            r11 = r32
            goto L_0x0500
        L_0x0567:
            r31 = r9
            r32 = r11
            java.lang.String r4 = "backFill"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r9 != 0) goto L_0x0579
            r7.f11621g = r4     // Catch:{ Exception -> 0x058a }
        L_0x0579:
            java.lang.String r4 = "premium"
            java.lang.String r1 = r1.optString(r4)     // Catch:{ Exception -> 0x058a }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x058a }
            if (r4 != 0) goto L_0x0587
            r7.f11622h = r1     // Catch:{ Exception -> 0x058a }
        L_0x0587:
            r37 = r7
            goto L_0x0599
        L_0x058a:
            r0 = move-exception
            goto L_0x0ac6
        L_0x058d:
            r21 = r10
            r2 = r31
            r5 = r32
            r32 = r11
            r31 = r27
            r37 = r29
        L_0x0599:
            if (r26 == 0) goto L_0x07b4
            r1 = r26
            org.json.JSONArray r4 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r7 = m13854b(r1, r5)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "maxNumOfAdaptersToLoadOnStart"
            r10 = 1
            int r48 = m13851a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "atim"
            boolean r10 = r1.has(r9)     // Catch:{ Exception -> 0x058a }
            r13 = 0
            if (r10 == 0) goto L_0x05bb
            long r9 = r1.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05bb:
            boolean r10 = r3.has(r9)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x05c6
            long r9 = r3.optLong(r9, r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x05c7
        L_0x05c6:
            r9 = r13
        L_0x05c7:
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x05ce
            r49 = 10000(0x2710, double:4.9407E-320)
            goto L_0x05d0
        L_0x05ce:
            r49 = r9
        L_0x05d0:
            java.lang.String r9 = "delayLoadFailure"
            r10 = 3
            int r54 = m13851a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "bannerInterval"
            r10 = 60
            int r52 = m13851a(r1, r3, r9, r10)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r7, r8)     // Catch:{ Exception -> 0x058a }
            r7 = 0
            boolean r60 = r1.optBoolean(r15, r7)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r1.optBoolean(r12, r7)     // Catch:{ Exception -> 0x058a }
            r9 = r32
            r7 = r46
            java.lang.String r62 = r1.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            r10 = r21
            java.lang.String r63 = r1.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r11 = r45
            r13 = -1
            int r64 = r1.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            r14 = r44
            int r65 = r1.optInt(r14, r13)     // Catch:{ Exception -> 0x058a }
            r21 = r3
            r13 = r57
            r3 = 5000(0x1388, float:7.006E-42)
            int r66 = r1.optInt(r13, r3)     // Catch:{ Exception -> 0x058a }
            r26 = r2
            r3 = r34
            org.json.JSONArray r2 = r1.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x063a
            r34 = r3
            int r3 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x058a }
            r57 = r13
            r44 = r14
            r13 = 0
        L_0x0628:
            int r14 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r13 >= r14) goto L_0x0637
            int r14 = r2.optInt(r13)     // Catch:{ Exception -> 0x058a }
            r3[r13] = r14     // Catch:{ Exception -> 0x058a }
            int r13 = r13 + 1
            goto L_0x0628
        L_0x0637:
            r67 = r3
            goto L_0x0642
        L_0x063a:
            r34 = r3
            r57 = r13
            r44 = r14
            r67 = r29
        L_0x0642:
            r2 = r30
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x0665
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r30 = r2
            r14 = 0
        L_0x0653:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0662
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x0653
        L_0x0662:
            r68 = r13
            goto L_0x0669
        L_0x0665:
            r30 = r2
            r68 = r29
        L_0x0669:
            r2 = r28
            org.json.JSONArray r3 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r3 == 0) goto L_0x068c
            int r13 = r3.length()     // Catch:{ Exception -> 0x058a }
            int[] r13 = new int[r13]     // Catch:{ Exception -> 0x058a }
            r28 = r2
            r14 = 0
        L_0x067a:
            int r2 = r3.length()     // Catch:{ Exception -> 0x058a }
            if (r14 >= r2) goto L_0x0689
            int r2 = r3.optInt(r14)     // Catch:{ Exception -> 0x058a }
            r13[r14] = r2     // Catch:{ Exception -> 0x058a }
            int r14 = r14 + 1
            goto L_0x067a
        L_0x0689:
            r69 = r13
            goto L_0x0690
        L_0x068c:
            r28 = r2
            r69 = r29
        L_0x0690:
            java.lang.String r2 = "nonConnectivityEvents"
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x06b1
            int r2 = r1.length()     // Catch:{ Exception -> 0x058a }
            int[] r2 = new int[r2]     // Catch:{ Exception -> 0x058a }
            r3 = 0
        L_0x069f:
            int r13 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x06ae
            int r13 = r1.optInt(r3)     // Catch:{ Exception -> 0x058a }
            r2[r3] = r13     // Catch:{ Exception -> 0x058a }
            int r3 = r3 + 1
            goto L_0x069f
        L_0x06ae:
            r70 = r2
            goto L_0x06b3
        L_0x06b1:
            r70 = r29
        L_0x06b3:
            com.ironsource.sdk.g.d r51 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r51
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            if (r31 == 0) goto L_0x0733
            java.lang.String r1 = "banner"
            r2 = r31
            org.json.JSONObject r1 = m13854b(r2, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x072d
            java.lang.String r3 = "auctionData"
            java.lang.String r59 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctioneerURL"
            java.lang.String r60 = r2.optString(r3, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTrials"
            r13 = 2
            int r61 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionSavedHistory"
            r13 = 15
            int r62 = r2.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "auctionTimeout"
            r13 = 10000(0x2710, double:4.9407E-320)
            long r63 = r2.optLong(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionRequest"
            r13 = 0
            boolean r77 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "compressAuctionResponse"
            boolean r78 = r2.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "encryptionVersion"
            r14 = 1
            int r80 = r2.optInt(r3, r14)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "programmatic"
            boolean r65 = r1.optBoolean(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r3 = "minTimeBeforeFirstAuction"
            r13 = 2000(0x7d0, float:2.803E-42)
            int r3 = r1.optInt(r3, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r13 = "shouldSendBannerBURLFromImpression"
            r14 = 1
            boolean r81 = r1.optBoolean(r13, r14)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            long r13 = (long) r3     // Catch:{ Exception -> 0x058a }
            r66 = r13
            r68 = 0
            r70 = 0
            r72 = 0
            r74 = 1
            r75 = 1
            r76 = 0
            r79 = 0
            r58 = r1
            r58.<init>(r59, r60, r61, r62, r63, r65, r66, r68, r70, r72, r74, r75, r76, r77, r78, r79, r80, r81)     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x072d:
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            goto L_0x073a
        L_0x0733:
            r2 = r31
            com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
        L_0x073a:
            r53 = r1
            com.ironsource.mediationsdk.model.e r1 = new com.ironsource.mediationsdk.model.e     // Catch:{ Exception -> 0x058a }
            r47 = r1
            r47.<init>(r48, r49, r51, r52, r53, r54)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x07ad
            r3 = 0
        L_0x0746:
            int r13 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r3 >= r13) goto L_0x07ad
            org.json.JSONObject r13 = r4.optJSONObject(r3)     // Catch:{ Exception -> 0x058a }
            if (r13 == 0) goto L_0x0785
            java.lang.String r14 = "placementId"
            r23 = r4
            r4 = -1
            int r14 = r13.optInt(r14, r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "placementName"
            java.lang.String r4 = r13.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r27 = r2
            java.lang.String r2 = "isDefault"
            r45 = r11
            r11 = 0
            boolean r2 = r13.optBoolean(r2, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.k r11 = m13852a((org.json.JSONObject) r13)     // Catch:{ Exception -> 0x058a }
            if (r14 < 0) goto L_0x078b
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x078b
            com.ironsource.mediationsdk.model.f r13 = new com.ironsource.mediationsdk.model.f     // Catch:{ Exception -> 0x058a }
            r13.<init>(r14, r4, r2, r11)     // Catch:{ Exception -> 0x058a }
            if (r11 == 0) goto L_0x078d
            android.content.Context r2 = r6.f11952bw     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.C4723k.m13829a((android.content.Context) r2, (com.ironsource.mediationsdk.model.C4651f) r13)     // Catch:{ Exception -> 0x058a }
            goto L_0x078d
        L_0x0785:
            r27 = r2
            r23 = r4
            r45 = r11
        L_0x078b:
            r13 = r29
        L_0x078d:
            if (r13 == 0) goto L_0x07a4
            if (r13 == 0) goto L_0x07a4
            java.util.ArrayList<com.ironsource.mediationsdk.model.f> r2 = r1.f11604c     // Catch:{ Exception -> 0x058a }
            r2.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.f r2 = r1.f11605d     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x079d
        L_0x079a:
            r1.f11605d = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x07a4
        L_0x079d:
            int r2 = r13.getPlacementId()     // Catch:{ Exception -> 0x058a }
            if (r2 != 0) goto L_0x07a4
            goto L_0x079a
        L_0x07a4:
            int r3 = r3 + 1
            r4 = r23
            r2 = r27
            r11 = r45
            goto L_0x0746
        L_0x07ad:
            r27 = r2
            r45 = r11
            r39 = r1
            goto L_0x07c2
        L_0x07b4:
            r26 = r2
            r10 = r21
            r27 = r31
            r9 = r32
            r7 = r46
            r21 = r3
            r39 = r29
        L_0x07c2:
            if (r22 == 0) goto L_0x08e4
            r1 = r22
            org.json.JSONObject r2 = m13854b(r1, r5)     // Catch:{ Exception -> 0x058a }
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.mergeJsons(r2, r8)     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r60 = r2.optBoolean(r15, r3)     // Catch:{ Exception -> 0x058a }
            boolean r61 = r2.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            java.lang.String r62 = r2.optString(r7, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r63 = r2.optString(r10, r9)     // Catch:{ Exception -> 0x058a }
            r3 = r45
            r4 = -1
            int r64 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r44
            int r65 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r57
            r4 = 5000(0x1388, float:7.006E-42)
            int r66 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x058a }
            r3 = r34
            org.json.JSONArray r4 = r2.optJSONArray(r3)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0815
            int r7 = r4.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x0803:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0812
            int r11 = r4.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x0803
        L_0x0812:
            r67 = r7
            goto L_0x0817
        L_0x0815:
            r67 = r29
        L_0x0817:
            r4 = r30
            org.json.JSONArray r7 = r2.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x0838
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0826:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0835
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0826
        L_0x0835:
            r68 = r10
            goto L_0x083a
        L_0x0838:
            r68 = r29
        L_0x083a:
            r7 = r28
            org.json.JSONArray r7 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r7 == 0) goto L_0x085b
            int r10 = r7.length()     // Catch:{ Exception -> 0x058a }
            int[] r10 = new int[r10]     // Catch:{ Exception -> 0x058a }
            r11 = 0
        L_0x0849:
            int r13 = r7.length()     // Catch:{ Exception -> 0x058a }
            if (r11 >= r13) goto L_0x0858
            int r13 = r7.optInt(r11)     // Catch:{ Exception -> 0x058a }
            r10[r11] = r13     // Catch:{ Exception -> 0x058a }
            int r11 = r11 + 1
            goto L_0x0849
        L_0x0858:
            r69 = r10
            goto L_0x085d
        L_0x085b:
            r69 = r29
        L_0x085d:
            java.lang.String r7 = "nonConnectivityEvents"
            org.json.JSONArray r2 = r2.optJSONArray(r7)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x087e
            int r7 = r2.length()     // Catch:{ Exception -> 0x058a }
            int[] r7 = new int[r7]     // Catch:{ Exception -> 0x058a }
            r10 = 0
        L_0x086c:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x087b
            int r11 = r2.optInt(r10)     // Catch:{ Exception -> 0x058a }
            r7[r10] = r11     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x086c
        L_0x087b:
            r70 = r7
            goto L_0x0880
        L_0x087e:
            r70 = r29
        L_0x0880:
            com.ironsource.sdk.g.d r2 = new com.ironsource.sdk.g.d     // Catch:{ Exception -> 0x058a }
            r59 = 0
            r58 = r2
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.i r7 = new com.ironsource.mediationsdk.model.i     // Catch:{ Exception -> 0x058a }
            r7.<init>(r2)     // Catch:{ Exception -> 0x058a }
            r7.f11628d = r1     // Catch:{ Exception -> 0x058a }
            r2 = r26
            org.json.JSONArray r1 = r1.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x08e1
            r2 = 0
        L_0x0899:
            int r10 = r1.length()     // Catch:{ Exception -> 0x058a }
            if (r2 >= r10) goto L_0x08e1
            org.json.JSONObject r10 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r10 == 0) goto L_0x08c7
            java.lang.String r11 = "placementId"
            r13 = -1
            int r11 = r10.optInt(r11, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r14 = "placementName"
            java.lang.String r14 = r10.optString(r14, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r15 = "isDefault"
            r13 = 0
            boolean r10 = r10.optBoolean(r15, r13)     // Catch:{ Exception -> 0x058a }
            if (r11 < 0) goto L_0x08c7
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x08c7
            com.ironsource.mediationsdk.model.j r13 = new com.ironsource.mediationsdk.model.j     // Catch:{ Exception -> 0x058a }
            r13.<init>(r11, r14, r10)     // Catch:{ Exception -> 0x058a }
            goto L_0x08c9
        L_0x08c7:
            r13 = r29
        L_0x08c9:
            if (r13 == 0) goto L_0x08de
            if (r13 == 0) goto L_0x08de
            java.util.ArrayList<com.ironsource.mediationsdk.model.j> r10 = r7.f11625a     // Catch:{ Exception -> 0x058a }
            r10.add(r13)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.j r10 = r7.f11626b     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08d9
        L_0x08d6:
            r7.f11626b = r13     // Catch:{ Exception -> 0x058a }
            goto L_0x08de
        L_0x08d9:
            int r10 = r13.f11629a     // Catch:{ Exception -> 0x058a }
            if (r10 != 0) goto L_0x08de
            goto L_0x08d6
        L_0x08de:
            int r2 = r2 + 1
            goto L_0x0899
        L_0x08e1:
            r38 = r7
            goto L_0x08ea
        L_0x08e4:
            r4 = r30
            r3 = r34
            r38 = r29
        L_0x08ea:
            com.ironsource.mediationsdk.utils.p r1 = new com.ironsource.mediationsdk.utils.p     // Catch:{ Exception -> 0x058a }
            r1.<init>()     // Catch:{ Exception -> 0x058a }
            if (r25 == 0) goto L_0x0930
            java.lang.String r2 = "optInKeys"
            r7 = r25
            org.json.JSONArray r2 = r7.optJSONArray(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0914
            r10 = 0
        L_0x08fc:
            int r11 = r2.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x0914
            java.lang.String r11 = r2.optString(r10)     // Catch:{ Exception -> 0x058a }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x058a }
            if (r13 != 0) goto L_0x0911
            java.util.ArrayList<java.lang.String> r13 = r1.f11992a     // Catch:{ Exception -> 0x058a }
            r13.add(r11)     // Catch:{ Exception -> 0x058a }
        L_0x0911:
            int r10 = r10 + 1
            goto L_0x08fc
        L_0x0914:
            java.lang.String r2 = "tokenGenericParams"
            org.json.JSONObject r2 = r7.optJSONObject(r2)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x091e
            r1.f11994c = r2     // Catch:{ Exception -> 0x058a }
        L_0x091e:
            java.lang.String r2 = "oneToken"
            r10 = 0
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f11995d = r2     // Catch:{ Exception -> 0x058a }
            java.lang.String r2 = "compressToken"
            r10 = 1
            boolean r2 = r7.optBoolean(r2, r10)     // Catch:{ Exception -> 0x058a }
            r1.f11996e = r2     // Catch:{ Exception -> 0x058a }
        L_0x0930:
            com.ironsource.mediationsdk.utils.j r2 = new com.ironsource.mediationsdk.utils.j     // Catch:{ Exception -> 0x058a }
            r2.<init>()     // Catch:{ Exception -> 0x058a }
            if (r24 == 0) goto L_0x0950
            java.lang.String r7 = "pixelEventsUrl"
            java.lang.String r10 = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3"
            r11 = r24
            java.lang.String r7 = r11.optString(r7, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "pixelEventsEnabled"
            r13 = 1
            boolean r14 = r11.optBoolean(r10, r13)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)     // Catch:{ Exception -> 0x058a }
            r2.f11837b = r7     // Catch:{ Exception -> 0x058a }
            goto L_0x0951
        L_0x0950:
            r14 = 1
        L_0x0951:
            r2.f11836a = r14     // Catch:{ Exception -> 0x058a }
            if (r14 == 0) goto L_0x0968
            int[] r3 = m13853a(r8, r3)     // Catch:{ Exception -> 0x058a }
            r2.f11839d = r3     // Catch:{ Exception -> 0x058a }
            int[] r3 = m13853a(r8, r4)     // Catch:{ Exception -> 0x058a }
            r2.f11840e = r3     // Catch:{ Exception -> 0x058a }
            r3 = 0
            boolean r4 = r8.optBoolean(r12, r3)     // Catch:{ Exception -> 0x058a }
            r2.f11838c = r4     // Catch:{ Exception -> 0x058a }
        L_0x0968:
            java.lang.String r3 = "server"
            r4 = r20
            r7 = 3
            int r3 = r4.optInt(r3, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r10 = "publisher"
            int r10 = r4.optInt(r10, r7)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "console"
            int r4 = r4.optInt(r11, r7)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.d r7 = new com.ironsource.mediationsdk.model.d     // Catch:{ Exception -> 0x058a }
            r7.<init>(r3, r10, r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.controller.u r3 = new com.ironsource.sdk.controller.u     // Catch:{ Exception -> 0x058a }
            r3.<init>()     // Catch:{ Exception -> 0x058a }
            if (r19 == 0) goto L_0x09df
            java.lang.String r4 = "enabled"
            r10 = r19
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo34418a((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterURL"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.mo34419b((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "reporterKeyword"
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            r3.mo34423c((java.lang.String) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "includeANR"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo34420b((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "timeout"
            r11 = 5000(0x1388, float:7.006E-42)
            int r4 = r10.optInt(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo34416a((int) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "setIgnoreDebugger"
            r11 = 0
            boolean r4 = r10.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            r3.mo34424c((boolean) r4)     // Catch:{ Exception -> 0x058a }
            java.lang.String r4 = "keysToInclude"
            org.json.JSONArray r4 = r10.optJSONArray(r4)     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x09df
            r10 = 0
        L_0x09cf:
            int r11 = r4.length()     // Catch:{ Exception -> 0x058a }
            if (r10 >= r11) goto L_0x09df
            java.lang.String r11 = r4.optString(r10)     // Catch:{ Exception -> 0x058a }
            r3.mo34417a((java.lang.String) r11)     // Catch:{ Exception -> 0x058a }
            int r10 = r10 + 1
            goto L_0x09cf
        L_0x09df:
            if (r18 == 0) goto L_0x09ff
            java.lang.String r4 = "name"
            r10 = r18
            java.lang.String r4 = r10.optString(r4, r9)     // Catch:{ Exception -> 0x058a }
            java.lang.String r9 = "id"
            java.lang.String r11 = "-1"
            java.lang.String r9 = r10.optString(r9, r11)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "custom"
            org.json.JSONObject r10 = r10.optJSONObject(r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.p r11 = new com.ironsource.mediationsdk.model.p     // Catch:{ Exception -> 0x058a }
            r11.<init>(r4, r9, r10)     // Catch:{ Exception -> 0x058a }
            r42 = r11
            goto L_0x0a01
        L_0x09ff:
            r42 = r29
        L_0x0a01:
            com.ironsource.mediationsdk.utils.b r4 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r17 == 0) goto L_0x0a27
            java.lang.String r4 = "isExternalArmEventsEnabled"
            r9 = r17
            r10 = 1
            boolean r4 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            java.lang.String r11 = "externalArmEventsUrl"
            java.lang.String r12 = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"
            java.lang.String r11 = r9.optString(r11, r12)     // Catch:{ Exception -> 0x058a }
            java.lang.String r12 = "sid"
            boolean r9 = r9.optBoolean(r12, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.utils.b r10 = new com.ironsource.mediationsdk.utils.b     // Catch:{ Exception -> 0x058a }
            r10.<init>(r4, r11, r9)     // Catch:{ Exception -> 0x058a }
            r46 = r10
            goto L_0x0a29
        L_0x0a27:
            r46 = r4
        L_0x0a29:
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r16 == 0) goto L_0x0a4e
            java.lang.String r4 = "mediationTypes"
            r9 = r16
            org.json.JSONObject r4 = r9.optJSONObject(r4)     // Catch:{ Exception -> 0x058a }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x058a }
            r10.<init>()     // Catch:{ Exception -> 0x058a }
            if (r4 == 0) goto L_0x0a43
            java.util.Map r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r4)     // Catch:{ Exception -> 0x058a }
        L_0x0a43:
            java.lang.String r4 = "compressExternalToken"
            r11 = 0
            r9.optBoolean(r4, r11)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.c r4 = new com.ironsource.mediationsdk.model.c     // Catch:{ Exception -> 0x058a }
            r4.<init>(r10)     // Catch:{ Exception -> 0x058a }
        L_0x0a4e:
            r47 = r4
            com.ironsource.mediationsdk.model.b r4 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r4.<init>()     // Catch:{ Exception -> 0x058a }
            if (r27 == 0) goto L_0x0a67
            java.lang.String r4 = "auctionData"
            r9 = r27
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.b r9 = new com.ironsource.mediationsdk.model.b     // Catch:{ Exception -> 0x058a }
            r9.<init>(r4)     // Catch:{ Exception -> 0x058a }
            r49 = r9
            goto L_0x0a69
        L_0x0a67:
            r49 = r4
        L_0x0a69:
            java.lang.String r4 = "integration"
            r9 = r21
            r10 = 0
            boolean r44 = r9.optBoolean(r4, r10)     // Catch:{ Exception -> 0x058a }
            com.ironsource.sdk.f.a r4 = new com.ironsource.sdk.f.a     // Catch:{ Exception -> 0x058a }
            r40 = r4
            r41 = r7
            r43 = r1
            r45 = r3
            r48 = r2
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.model.g r1 = new com.ironsource.mediationsdk.model.g     // Catch:{ Exception -> 0x058a }
            r35 = r1
            r40 = r4
            r35.<init>(r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x058a }
            r6.f11953c = r1     // Catch:{ Exception -> 0x058a }
            java.lang.String r1 = "genericParams"
            org.json.JSONObject r1 = m13854b(r8, r1)     // Catch:{ Exception -> 0x058a }
            if (r1 == 0) goto L_0x0aaf
            org.json.JSONObject r2 = m13854b(r1, r5)     // Catch:{ Exception -> 0x058a }
            if (r2 == 0) goto L_0x0aaf
            r1.remove(r5)     // Catch:{ Exception -> 0x058a }
            java.util.Map r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r3 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ Exception -> 0x058a }
            r3.mo33651b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ Exception -> 0x058a }
            r3.mo33651b((java.util.Map<java.lang.String, java.lang.String>) r2)     // Catch:{ Exception -> 0x058a }
        L_0x0aaf:
            if (r1 == 0) goto L_0x0ac3
            java.util.Map r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.parseJsonToStringMap(r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.h r2 = com.ironsource.mediationsdk.p126a.C4537h.m13193e()     // Catch:{ Exception -> 0x058a }
            r2.mo33643a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
            com.ironsource.mediationsdk.a.d r2 = com.ironsource.mediationsdk.p126a.C4533d.m13173e()     // Catch:{ Exception -> 0x058a }
            r2.mo33643a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x058a }
        L_0x0ac3:
            return
        L_0x0ac4:
            r0 = move-exception
            r6 = r1
        L_0x0ac6:
            r1 = r0
            r1.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4726l.m13859i():void");
    }

    /* renamed from: a */
    public final C4447C mo34196a() {
        return new C4447C(this.f11950bu, this.f11951bv);
    }

    /* renamed from: a */
    public final void mo34197a(int i) {
        this.f11955e = i;
    }

    /* renamed from: b */
    public final boolean mo34198b() {
        return (((((this.f11954d != null) && !this.f11954d.has("error")) && this.f11876a != null) && this.f11929b != null) && this.f11953c != null) && m13856f();
    }

    /* renamed from: c */
    public final String mo34199c() {
        try {
            return this.f11876a.f11649b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo34200d() {
        try {
            return this.f11876a.f11650c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.APP_KEY, this.f11950bu);
            jSONObject.put(DataKeys.USER_ID, this.f11951bv);
            jSONObject.put("response", this.f11954d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
