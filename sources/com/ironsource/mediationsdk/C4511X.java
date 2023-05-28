package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.C4605b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4537h;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.C4731o;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.X */
public final class C4511X extends C4514Y implements RewardedVideoSmashListener {

    /* renamed from: A */
    private String f10984A;

    /* renamed from: B */
    private String f10985B;

    /* renamed from: C */
    private final Object f10986C = new Object();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Object f10987D = new Object();
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C4513a f10988a = C4513a.NO_INIT;

    /* renamed from: b */
    boolean f10989b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4510W f10990j;

    /* renamed from: k */
    private Timer f10991k;

    /* renamed from: l */
    private int f10992l;

    /* renamed from: m */
    private String f10993m;

    /* renamed from: n */
    private String f10994n;

    /* renamed from: o */
    private String f10995o;

    /* renamed from: p */
    private boolean f10996p;

    /* renamed from: q */
    private boolean f10997q;

    /* renamed from: r */
    private Placement f10998r;

    /* renamed from: s */
    private long f10999s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f11000t;

    /* renamed from: u */
    private JSONObject f11001u;

    /* renamed from: v */
    private String f11002v;

    /* renamed from: w */
    private int f11003w;

    /* renamed from: x */
    private String f11004x;

    /* renamed from: y */
    private int f11005y;

    /* renamed from: z */
    private int f11006z;

    /* renamed from: com.ironsource.mediationsdk.X$a */
    public enum C4513a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C4511X(String str, String str2, NetworkSettings networkSettings, C4510W w, int i, AbstractAdapter abstractAdapter) {
        super(new C4646a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f10993m = str;
        this.f10994n = str2;
        this.f10990j = w;
        this.f10991k = null;
        this.f10992l = i;
        this.f11015c.addRewardedVideoListener(this);
        this.f10996p = false;
        this.f10997q = false;
        this.f10989b = false;
        this.f10998r = null;
        this.f11000t = "";
        this.f11001u = null;
        this.f11020h = 1;
        m13084g();
    }

    /* renamed from: a */
    private void m13071a(int i) {
        m13072a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m13072a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo33615n();
        if (!TextUtils.isEmpty(this.f11000t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f11000t);
        }
        JSONObject jSONObject = this.f11001u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f11001u);
        }
        if (z && (placement = this.f10998r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10998r.getPlacementName());
        }
        if (m13079b(i)) {
            C4537h.m13193e();
            C4537h.m13131a(n, this.f11003w, this.f11004x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11020h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo33612k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, new JSONObject(n)));
        if (i == 1203) {
            C4731o.m13872a().mo34205a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13073a(C4513a aVar) {
        m13076a("current state=" + this.f10988a + ", new state=" + aVar);
        synchronized (this.f10987D) {
            this.f10988a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13076a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo33612k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m13077a(String str, String str2, int i, String str3, int i2, String str4) {
        this.f11002v = str2;
        this.f10995o = str;
        this.f11005y = i;
        this.f10985B = str3;
        this.f11006z = i2;
        this.f10984A = str4;
    }

    /* renamed from: b */
    private static boolean m13079b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* renamed from: c */
    private void m13081c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + mo33612k() + " : " + str, 3);
    }

    /* renamed from: g */
    private void m13084g() {
        this.f11002v = "";
        this.f11005y = -1;
        this.f10985B = "";
        this.f10995o = "";
        this.f11006z = this.f11020h;
        this.f10984A = "";
    }

    /* renamed from: q */
    private boolean m13085q() {
        try {
            return this.f11015c.isRewardedVideoAvailable(this.f11018f);
        } catch (Exception e) {
            m13081c("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo33604b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: r */
    private void m13086r() {
        try {
            String str = C4455H.m12683a().f10654l;
            if (!TextUtils.isEmpty(str)) {
                this.f11015c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f11015c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Exception e) {
            m13076a("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: s */
    private void m13087s() {
        synchronized (this.f10986C) {
            if (this.f10991k != null) {
                this.f10991k.cancel();
                this.f10991k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public long m13088t() {
        return new Date().getTime() - this.f10999s;
    }

    /* renamed from: a */
    public final Map<String, Object> mo33456a() {
        try {
            if (mo33609h()) {
                return this.f11015c.getRewardedVideoBiddingData(this.f11018f);
            }
            return null;
        } catch (Throwable th) {
            m13081c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo33604b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo33599a(int i, Object[][] objArr) {
        m13072a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo33600a(Placement placement, int i) {
        m13087s();
        m13076a("showVideo()");
        this.f10998r = placement;
        this.f11020h = i;
        m13073a(C4513a.SHOW_IN_PROGRESS);
        mo33599a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f11015c.showRewardedVideo(this.f11018f, this);
        } catch (Throwable th) {
            m13081c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo33601a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        C4513a aVar;
        m13076a("loadVideo() auctionId: " + str2 + " state: " + this.f10988a);
        this.f11021i = null;
        this.f11017e = false;
        this.f10989b = true;
        synchronized (this.f10987D) {
            aVar = this.f10988a;
            if (!(this.f10988a == C4513a.LOAD_IN_PROGRESS || this.f10988a == C4513a.SHOW_IN_PROGRESS)) {
                m13073a(C4513a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C4513a.LOAD_IN_PROGRESS) {
            mo33604b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f10997q = true;
            m13077a(str, str2, i, str3, i2, str4);
            this.f10990j.mo33591b(this, str2);
        } else if (aVar == C4513a.SHOW_IN_PROGRESS) {
            mo33604b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f10996p = true;
            m13077a(str, str2, i, str3, i2, str4);
        } else {
            this.f11019g = str4;
            this.f11000t = str2;
            this.f11001u = jSONObject;
            this.f11003w = i;
            this.f11004x = str3;
            this.f11020h = i2;
            synchronized (this.f10986C) {
                m13087s();
                Timer timer = new Timer();
                this.f10991k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str;
                        int i2;
                        String str2 = "Rewarded Video - load instance time out";
                        synchronized (C4511X.this.f10987D) {
                            if (C4511X.this.f10988a != C4513a.LOAD_IN_PROGRESS) {
                                if (C4511X.this.f10988a != C4513a.INIT_IN_PROGRESS) {
                                    i = 0;
                                    z = false;
                                }
                            }
                            if (C4511X.this.f10988a == C4513a.LOAD_IN_PROGRESS) {
                                str = str2;
                                i2 = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                            } else {
                                i2 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str = "Rewarded Video - init instance time out";
                            }
                            C4511X.this.m13073a(C4513a.NOT_LOADED);
                            z = true;
                            String str3 = str;
                            i = i2;
                            str2 = str3;
                        }
                        C4511X.this.m13076a(str2);
                        if (z) {
                            C4511X.this.mo33604b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4511X.this.m13088t())}});
                            C4511X.this.mo33604b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4511X.this.m13088t())}});
                            C4510W e = C4511X.this.f10990j;
                            C4511X x = C4511X.this;
                            e.mo33591b(x, x.f11000t);
                            return;
                        }
                        C4511X.this.mo33604b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4511X.this.m13088t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C4511X.this.f10988a.name()}});
                    }
                }, (long) (this.f10992l * 1000));
            }
            this.f10999s = new Date().getTime();
            m13071a(1001);
            try {
                if (mo33609h()) {
                    this.f11015c.loadRewardedVideoForBidding(this.f11018f, this, str);
                } else if (aVar == C4513a.NO_INIT) {
                    m13086r();
                    this.f11015c.initRewardedVideo(this.f10993m, this.f10994n, this.f11018f, this);
                } else {
                    this.f11015c.fetchRewardedVideoForAutomaticLoad(this.f11018f, this);
                }
            } catch (Throwable th) {
                m13081c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, th.getLocalizedMessage()));
                mo33604b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo33602a(boolean z, int i) {
        this.f11020h = i;
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m13072a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo33603b() {
        m13076a("initForBidding()");
        m13073a(C4513a.INIT_IN_PROGRESS);
        m13086r();
        try {
            this.f11015c.initRewardedVideoForBidding(this.f10993m, this.f10994n, this.f11018f, this);
        } catch (Throwable th) {
            m13081c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: b */
    public final void mo33604b(int i, Object[][] objArr) {
        m13072a(i, objArr, false);
    }

    /* renamed from: c */
    public final boolean mo33605c() {
        return mo33609h() ? this.f10989b && this.f10988a == C4513a.LOADED && m13085q() : m13085q();
    }

    /* renamed from: f */
    public final void mo33606f() {
        this.f11015c.setMediationState(C4605b.C4606a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m13072a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    public final void onRewardedVideoAdClicked() {
        m13076a("onRewardedVideoAdClicked");
        this.f10990j.mo33590b(this, this.f10998r);
        mo33599a(1006, (Object[][]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        r12.f10990j.mo33589b(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r12.f10996p == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        m13076a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
        r12.f10996p = false;
        mo33601a(r12.f10995o, r12.f11002v, r12.f11001u, r12.f11005y, r12.f10985B, r12.f11006z, r12.f10984A);
        m13084g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRewardedVideoAdClosed() {
        /*
            r12 = this;
            java.lang.String r0 = "onRewardedVideoAdClosed"
            r12.m13076a((java.lang.String) r0)
            java.lang.Object r0 = r12.f10987D
            monitor-enter(r0)
            com.ironsource.mediationsdk.X$a r1 = r12.f10988a     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.X$a r2 = com.ironsource.mediationsdk.C4511X.C4513a.SHOW_IN_PROGRESS     // Catch:{ all -> 0x0077 }
            r3 = 0
            if (r1 == r2) goto L_0x004b
            r1 = 1203(0x4b3, float:1.686E-42)
            r2 = 0
            r12.mo33599a((int) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x0077 }
            r1 = 81316(0x13da4, float:1.13948E-40)
            r2 = 2
            java.lang.Object[][] r4 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "errorCode"
            r5[r3] = r6     // Catch:{ all -> 0x0077 }
            r6 = 5009(0x1391, float:7.019E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0077 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0077 }
            r4[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "reason"
            r2[r3] = r5     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "adClosed: "
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.X$a r5 = r12.f10988a     // Catch:{ all -> 0x0077 }
            r3.append(r5)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0077 }
            r2[r7] = r3     // Catch:{ all -> 0x0077 }
            r4[r7] = r2     // Catch:{ all -> 0x0077 }
            r12.mo33604b(r1, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            return
        L_0x004b:
            com.ironsource.mediationsdk.X$a r1 = com.ironsource.mediationsdk.C4511X.C4513a.NOT_LOADED     // Catch:{ all -> 0x0077 }
            r12.m13073a((com.ironsource.mediationsdk.C4511X.C4513a) r1)     // Catch:{ all -> 0x0077 }
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            com.ironsource.mediationsdk.W r0 = r12.f10990j
            r0.mo33589b(r12)
            boolean r0 = r12.f10996p
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding"
            r12.m13076a((java.lang.String) r0)
            r12.f10996p = r3
            java.lang.String r5 = r12.f10995o
            java.lang.String r6 = r12.f11002v
            org.json.JSONObject r7 = r12.f11001u
            int r8 = r12.f11005y
            java.lang.String r9 = r12.f10985B
            int r10 = r12.f11006z
            java.lang.String r11 = r12.f10984A
            r4 = r12
            r4.mo33601a(r5, r6, r7, r8, r9, r10, r11)
            r12.m13084g()
        L_0x0076:
            return
        L_0x0077:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0077 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4511X.onRewardedVideoAdClosed():void");
    }

    public final void onRewardedVideoAdEnded() {
        m13076a("onRewardedVideoAdEnded");
        this.f10990j.mo33593d(this);
        mo33599a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m13076a("onRewardedVideoAdOpened");
        this.f10990j.mo33584a(this);
        mo33599a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m13076a("onRewardedVideoAdRewarded");
        this.f10990j.mo33585a(this, this.f10998r);
        Map<String, Object> n = mo33615n();
        Placement placement = this.f10998r;
        if (placement != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f10998r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f10998r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C4455H.m12683a().f10655m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C4455H.m12683a().f10655m);
        }
        if (C4455H.m12683a().f10656n != null) {
            for (String next : C4455H.m12683a().f10656n.keySet()) {
                n.put("custom_" + next, C4455H.m12683a().f10656n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f11000t)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f11000t);
        }
        JSONObject jSONObject = this.f11001u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f11001u);
        }
        if (m13079b(1010)) {
            C4537h.m13193e();
            C4537h.m13131a(n, this.f11003w, this.f11004x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11020h));
        C4532c cVar = new C4532c(1010, new JSONObject(n));
        cVar.mo33670a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo33671b(), mo33612k()));
        C4537h.m13193e().mo33649b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m13076a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo33599a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f10987D) {
            if (this.f10988a != C4513a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo33604b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f10988a}});
                return;
            }
            m13073a(C4513a.NOT_LOADED);
            this.f10990j.mo33587a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m13076a("onRewardedVideoAdStarted");
        this.f10990j.mo33592c(this);
        mo33599a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m13076a("onRewardedVideoAdVisible");
        mo33599a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m13076a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f10988a.name());
        synchronized (this.f10987D) {
            if (this.f10988a == C4513a.LOAD_IN_PROGRESS) {
                m13073a(z ? C4513a.LOADED : C4513a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m13087s();
            mo33604b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}});
            if (this.f10997q) {
                this.f10997q = false;
                m13076a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
                mo33601a(this.f10995o, this.f11002v, this.f11001u, this.f11005y, this.f10985B, this.f11006z, this.f10984A);
                m13084g();
            } else if (z) {
                this.f10990j.mo33586a(this, this.f11000t);
            } else {
                this.f10990j.mo33591b(this, this.f11000t);
            }
        } else if (z) {
            mo33604b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10988a.name()}});
        } else {
            mo33604b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10988a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m13076a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m13087s();
        mo33604b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}});
        mo33604b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}});
        synchronized (this.f10987D) {
            if (this.f10988a != C4513a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo33604b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f10988a}});
                return;
            }
            m13073a(C4513a.NO_INIT);
            this.f10990j.mo33591b(this, this.f11000t);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m13076a("onRewardedVideoInitSuccess");
        synchronized (this.f10987D) {
            if (this.f10988a != C4513a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo33604b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f10988a}});
                return;
            }
            m13073a(C4513a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m13072a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f11021i = Long.valueOf(System.currentTimeMillis());
        }
        m13072a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m13088t())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
