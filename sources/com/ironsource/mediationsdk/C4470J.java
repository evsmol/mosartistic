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

/* renamed from: com.ironsource.mediationsdk.J */
public final class C4470J extends C4514Y implements RewardedVideoSmashListener {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public C4472a f10743a;

    /* renamed from: b */
    String f10744b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4473K f10745j;

    /* renamed from: k */
    private Timer f10746k;

    /* renamed from: l */
    private int f10747l;

    /* renamed from: m */
    private String f10748m;

    /* renamed from: n */
    private String f10749n;

    /* renamed from: o */
    private Placement f10750o;

    /* renamed from: p */
    private long f10751p;

    /* renamed from: q */
    private JSONObject f10752q;

    /* renamed from: r */
    private int f10753r;

    /* renamed from: s */
    private String f10754s;

    /* renamed from: t */
    private final Object f10755t;

    /* renamed from: u */
    private final Object f10756u;

    /* renamed from: v */
    private long f10757v;

    /* renamed from: com.ironsource.mediationsdk.J$a */
    public enum C4472a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4470J(com.ironsource.mediationsdk.C4470J r10, com.ironsource.mediationsdk.C4473K r11, com.ironsource.mediationsdk.AbstractAdapter r12, int r13, java.lang.String r14, org.json.JSONObject r15, int r16, java.lang.String r17) {
        /*
            r9 = this;
            r8 = r9
            r0 = r10
            java.lang.String r1 = r0.f10748m
            java.lang.String r2 = r0.f10749n
            com.ironsource.mediationsdk.model.a r3 = r0.f11016d
            com.ironsource.mediationsdk.model.NetworkSettings r3 = r3.f11591a
            int r5 = r0.f10747l
            r0 = r9
            r4 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r8.f10744b = r0
            r0 = r15
            r8.f10752q = r0
            r0 = r16
            r8.f10753r = r0
            r0 = r17
            r8.f10754s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C4470J.<init>(com.ironsource.mediationsdk.J, com.ironsource.mediationsdk.K, com.ironsource.mediationsdk.AbstractAdapter, int, java.lang.String, org.json.JSONObject, int, java.lang.String):void");
    }

    public C4470J(String str, String str2, NetworkSettings networkSettings, C4473K k, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new C4646a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f10755t = new Object();
        this.f10756u = new Object();
        this.f10748m = str;
        this.f10749n = str2;
        this.f10745j = k;
        this.f10746k = null;
        this.f10747l = i;
        this.f11015c.updateRewardedVideoListener(this);
        this.f11020h = i2;
        this.f10743a = C4472a.NO_INIT;
        this.f10757v = 0;
        if (this.f11016d.f11593c) {
            m12834c("initForBidding()");
            m12828a(C4472a.INIT_IN_PROGRESS);
            m12837g();
            try {
                this.f11015c.initRewardedVideoForBidding(this.f10748m, this.f10749n, this.f11018f, this);
            } catch (Throwable th) {
                m12835d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* renamed from: a */
    private void m12826a(int i) {
        m12827a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m12827a(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = mo33615n();
        if (!TextUtils.isEmpty(this.f10744b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10744b);
        }
        JSONObject jSONObject = this.f10752q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10752q);
        }
        if (z && (placement = this.f10750o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, this.f10750o.getPlacementName());
        }
        if (m12832b(i)) {
            C4537h.m13193e();
            C4537h.m13131a(n, this.f10753r, this.f10754s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11020h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, mo33612k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C4537h.m13193e().mo33649b(new C4532c(i, new JSONObject(n)));
        if (i == 1203) {
            C4731o.m13872a().mo34205a(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12828a(C4472a aVar) {
        m12834c("current state=" + this.f10743a + ", new state=" + aVar);
        synchronized (this.f10755t) {
            this.f10743a = aVar;
        }
    }

    /* renamed from: b */
    private static boolean m12832b(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12834c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo33612k() + " " + hashCode() + "  : " + str, 0);
    }

    /* renamed from: d */
    private void m12835d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + mo33612k() + " " + hashCode() + " : " + str, 3);
    }

    /* renamed from: f */
    private boolean m12836f() {
        try {
            return this.f11015c.isRewardedVideoAvailable(this.f11018f);
        } catch (Exception e) {
            m12835d("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            mo33461b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            return false;
        }
    }

    /* renamed from: g */
    private void m12837g() {
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
            m12834c("setCustomParams() " + e.getMessage());
        }
    }

    /* renamed from: q */
    private void m12838q() {
        synchronized (this.f10756u) {
            if (this.f10746k != null) {
                this.f10746k.cancel();
                this.f10746k = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public long m12839r() {
        return new Date().getTime() - this.f10751p;
    }

    /* renamed from: a */
    public final Map<String, Object> mo33456a() {
        try {
            if (mo33609h()) {
                return this.f11015c.getRewardedVideoBiddingData(this.f11018f);
            }
            return null;
        } catch (Throwable th) {
            m12835d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            mo33461b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: a */
    public final void mo33457a(int i, Object[][] objArr) {
        m12827a(i, objArr, true);
    }

    /* renamed from: a */
    public final void mo33458a(Placement placement) {
        m12838q();
        m12834c("showVideo()");
        this.f10750o = placement;
        m12828a(C4472a.SHOW_IN_PROGRESS);
        mo33457a((int) IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f11015c.showRewardedVideo(this.f11018f, this);
        } catch (Throwable th) {
            m12835d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* renamed from: a */
    public final void mo33459a(String str) {
        C4472a aVar;
        m12834c("loadVideo() auctionId: " + this.f10744b + " state: " + this.f10743a);
        this.f11021i = null;
        this.f11017e = false;
        synchronized (this.f10755t) {
            aVar = this.f10743a;
            if (!(this.f10743a == C4472a.LOAD_IN_PROGRESS || this.f10743a == C4472a.SHOW_IN_PROGRESS)) {
                m12828a(C4472a.LOAD_IN_PROGRESS);
            }
        }
        if (aVar == C4472a.LOAD_IN_PROGRESS) {
            mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == C4472a.SHOW_IN_PROGRESS) {
            mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f10756u) {
                Timer timer = new Timer();
                this.f10746k = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        boolean z;
                        int i;
                        String str = "Rewarded Video - load instance time out";
                        if (C4470J.this.f10743a == C4472a.LOAD_IN_PROGRESS || C4470J.this.f10743a == C4472a.INIT_IN_PROGRESS) {
                            if (C4470J.this.f10743a == C4472a.LOAD_IN_PROGRESS) {
                                i = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                            } else {
                                i = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str = "Rewarded Video - init instance time out";
                            }
                            C4470J.this.m12828a(C4472a.NOT_LOADED);
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        C4470J.this.m12834c(str);
                        if (z) {
                            C4470J.this.mo33461b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4470J.this.m12839r())}});
                            C4470J.this.mo33461b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4470J.this.m12839r())}});
                            C4470J.this.f10745j.mo33394b(C4470J.this);
                            return;
                        }
                        C4470J.this.mo33461b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4470J.this.m12839r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, C4470J.this.f10743a.name()}});
                    }
                }, (long) (this.f10747l * 1000));
            }
            this.f10751p = new Date().getTime();
            m12826a(1001);
            try {
                if (mo33609h()) {
                    this.f11015c.loadRewardedVideoForBidding(this.f11018f, this, str);
                    return;
                }
                m12837g();
                this.f11015c.initRewardedVideo(this.f10748m, this.f10749n, this.f11018f, this);
            } catch (Throwable th) {
                m12835d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                mo33461b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(mo33609h() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: a */
    public final void mo33460a(boolean z) {
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        m12827a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    /* renamed from: b */
    public final void mo33461b(int i, Object[][] objArr) {
        m12827a(i, objArr, false);
    }

    /* renamed from: b */
    public final boolean mo33462b() {
        return mo33609h() ? this.f10743a == C4472a.LOADED && m12836f() : m12836f();
    }

    /* renamed from: b_ */
    public final void mo33463b_() {
        this.f11015c.setMediationState(C4605b.C4606a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        m12827a(IronSourceConstants.RV_CAP_SESSION, (Object[][]) null, false);
    }

    /* renamed from: c */
    public final LoadWhileShowSupportState mo33464c() {
        try {
            return this.f11015c.getLoadWhileShowSupportState(this.f11018f);
        } catch (Exception e) {
            m12835d("Exception while calling adapter.getLoadWhileShowSupportState() - " + e.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    /* renamed from: e */
    public final int mo33465e() {
        return 2;
    }

    public final void onRewardedVideoAdClicked() {
        m12834c("onRewardedVideoAdClicked");
        this.f10745j.mo33395b(this, this.f10750o);
        mo33457a(1006, (Object[][]) null);
    }

    public final void onRewardedVideoAdClosed() {
        m12834c("onRewardedVideoAdClosed");
        synchronized (this.f10755t) {
            if (this.f10743a != C4472a.SHOW_IN_PROGRESS) {
                mo33457a((int) IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_adClosed)};
                mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f10743a}});
                return;
            }
            m12828a(C4472a.ENDED);
            this.f10757v = new Date().getTime();
            this.f10745j.mo33399d(this);
        }
    }

    public final void onRewardedVideoAdEnded() {
        m12834c("onRewardedVideoAdEnded");
        this.f10745j.mo33402f(this);
        mo33457a((int) IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    public final void onRewardedVideoAdOpened() {
        m12834c("onRewardedVideoAdOpened");
        this.f10745j.mo33396c(this);
        mo33457a(1005, (Object[][]) null);
    }

    public final void onRewardedVideoAdRewarded() {
        m12834c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f10745j.mo33388a(this, this.f10750o);
        Map<String, Object> n = mo33615n();
        Placement placement = this.f10750o;
        if (placement != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f10750o.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f10750o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(C4455H.m12683a().f10655m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, C4455H.m12683a().f10655m);
        }
        if (C4455H.m12683a().f10656n != null) {
            for (String next : C4455H.m12683a().f10656n.keySet()) {
                n.put("custom_" + next, C4455H.m12683a().f10656n.get(next));
            }
        }
        if (!TextUtils.isEmpty(this.f10744b)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10744b);
        }
        JSONObject jSONObject = this.f10752q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10752q);
        }
        if (m12832b(1010)) {
            C4537h.m13193e();
            C4537h.m13131a(n, this.f10753r, this.f10754s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11020h));
        C4532c cVar = new C4532c(1010, new JSONObject(n));
        cVar.mo33670a(IronSourceConstants.EVENTS_TRANS_ID, (Object) IronSourceUtils.getTransId(cVar.mo33671b(), mo33612k()));
        long j = this.f10757v;
        if (j != 0) {
            long j2 = time - j;
            m12834c("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            cVar.mo33670a(IronSourceConstants.EVENTS_DURATION, (Object) Long.valueOf(j2));
        }
        C4537h.m13193e().mo33649b(cVar);
    }

    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        m12834c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        mo33457a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f10755t) {
            if (this.f10743a != C4472a.SHOW_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_showFailed)};
                mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f10743a}});
                return;
            }
            m12828a(C4472a.ENDED);
            this.f10745j.mo33389a(ironSourceError, this);
        }
    }

    public final void onRewardedVideoAdStarted() {
        m12834c("onRewardedVideoAdStarted");
        this.f10745j.mo33401e(this);
        mo33457a((int) IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    public final void onRewardedVideoAdVisible() {
        m12834c("onRewardedVideoAdVisible");
        mo33457a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        m12834c("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.f10743a.name());
        synchronized (this.f10755t) {
            if (this.f10743a == C4472a.LOAD_IN_PROGRESS) {
                m12828a(z ? C4472a.LOADED : C4472a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (!z2) {
            m12838q();
            mo33461b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}});
            if (z) {
                this.f10745j.mo33387a(this);
            } else {
                this.f10745j.mo33394b(this);
            }
        } else if (z) {
            mo33461b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10743a.name()}});
        } else {
            mo33461b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f10743a.name()}});
        }
    }

    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        m12834c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        m12838q();
        mo33461b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}});
        mo33461b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}});
        synchronized (this.f10755t) {
            if (this.f10743a != C4472a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)};
                mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f10743a}});
                return;
            }
            m12828a(C4472a.NO_INIT);
            this.f10745j.mo33394b(this);
        }
    }

    public final void onRewardedVideoInitSuccess() {
        m12834c("onRewardedVideoInitSuccess");
        synchronized (this.f10755t) {
            if (this.f10743a != C4472a.INIT_IN_PROGRESS) {
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initSuccess)};
                mo33461b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f10743a}});
                return;
            }
            m12828a(C4472a.NOT_LOADED);
        }
    }

    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            m12827a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f11021i = Long.valueOf(System.currentTimeMillis());
        }
        m12827a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(m12839r())}}, false);
    }

    public final void onRewardedVideoLoadSuccess() {
    }
}
