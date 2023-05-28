package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.C4651f;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p126a.C4532c;
import com.ironsource.mediationsdk.p126a.C4533d;
import com.ironsource.mediationsdk.p135b.C4611c;
import com.ironsource.mediationsdk.p136c.C4615b;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.C4718f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.R */
public final class C4495R extends C4514Y implements C4611c.C4612a, BannerSmashListener {

    /* renamed from: a */
    String f10878a;

    /* renamed from: b */
    private C4615b f10879b;

    /* renamed from: j */
    private C4611c f10880j;

    /* renamed from: k */
    private C4496a f10881k;

    /* renamed from: l */
    private C4494Q f10882l;

    /* renamed from: m */
    private IronSourceBannerLayout f10883m;

    /* renamed from: n */
    private JSONObject f10884n;

    /* renamed from: o */
    private int f10885o;

    /* renamed from: p */
    private String f10886p;

    /* renamed from: q */
    private C4651f f10887q;

    /* renamed from: r */
    private final Object f10888r;

    /* renamed from: s */
    private C4718f f10889s;

    /* renamed from: t */
    private boolean f10890t;

    /* renamed from: com.ironsource.mediationsdk.R$a */
    public enum C4496a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C4495R(C4615b bVar, C4494Q q, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C4646a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f10888r = new Object();
        this.f10881k = C4495R.C4496a.NONE;
        this.f10879b = bVar;
        this.f10880j = new C4611c(bVar.mo33884f());
        this.f10882l = q;
        this.f11020h = i;
        this.f10878a = str;
        this.f10885o = i2;
        this.f10886p = str2;
        this.f10884n = jSONObject;
        this.f10890t = z;
        this.f11015c.addBannerListener(this);
        if (mo33609h()) {
            m12942f();
        }
    }

    C4495R(C4615b bVar, C4494Q q, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, q, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    /* renamed from: a */
    private void m12935a(C4496a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m12945r() + "state = " + aVar.name());
        synchronized (this.f10888r) {
            this.f10881k = aVar;
        }
    }

    /* renamed from: a */
    private void m12936a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            mo33542a(this.f10890t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10889s))}});
        } else {
            mo33542a(this.f10890t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10889s))}});
        }
        C4494Q q = this.f10882l;
        if (q != null) {
            q.mo33529a(ironSourceError, this);
        }
    }

    /* renamed from: a */
    private void m12937a(String str) {
        IronLog.INTERNAL.verbose(mo33617p());
        if (m12940a(C4495R.C4496a.READY_TO_LOAD, C4495R.C4496a.LOADING)) {
            this.f10889s = new C4718f();
            mo33542a(this.f10890t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002, (Object[][]) null);
            if (this.f11015c != null) {
                try {
                    if (mo33609h()) {
                        this.f11015c.loadBannerForBidding(this.f10883m, this.f11018f, this, str);
                    } else {
                        this.f11015c.loadBanner(this.f10883m, this.f11018f, this);
                    }
                } catch (Exception e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("Exception while trying to load banner from " + this.f11015c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                    e.printStackTrace();
                    onBannerAdLoadFailed(new IronSourceError(605, e.getLocalizedMessage()));
                    mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
                }
            }
        } else {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("wrong state - state = " + this.f10881k);
        }
    }

    /* renamed from: a */
    private static void m12938a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
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
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    private static boolean m12939a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    /* renamed from: a */
    private boolean m12940a(C4496a aVar, C4496a aVar2) {
        boolean z;
        synchronized (this.f10888r) {
            if (this.f10881k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m12945r() + "set state from '" + this.f10881k + "' to '" + aVar2 + "'");
                z = true;
                this.f10881k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m12941b(int i) {
        mo33542a(i, (Object[][]) null);
    }

    /* renamed from: f */
    private void m12942f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m12945r() + "isBidder = " + mo33609h());
        m12935a(C4495R.C4496a.INIT_IN_PROGRESS);
        m12943g();
        try {
            if (this.f11015c == null) {
                return;
            }
            if (mo33609h()) {
                this.f11015c.initBannerForBidding(this.f10879b.mo33879a(), this.f10879b.mo33880b(), this.f11018f, this);
            } else {
                this.f11015c.initBanners(this.f10879b.mo33879a(), this.f10879b.mo33880b(), this.f11018f, this);
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.f11015c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(612, th.getLocalizedMessage()));
            mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    /* renamed from: g */
    private void m12943g() {
        if (this.f11015c != null) {
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
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("Exception while trying to set custom params from " + this.f11015c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                e.printStackTrace();
                mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
            }
        }
    }

    /* renamed from: q */
    private boolean m12944q() {
        boolean z;
        synchronized (this.f10888r) {
            z = this.f10881k == C4495R.C4496a.LOADED;
        }
        return z;
    }

    /* renamed from: r */
    private String m12945r() {
        return String.format("%s - ", new Object[]{mo33617p()});
    }

    /* renamed from: s */
    private boolean m12946s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f10883m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public final void mo33456a() {
        IronLog.INTERNAL.verbose(mo33617p());
        m12935a(C4495R.C4496a.DESTROYED);
        if (this.f11015c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.f11015c.destroyBanner(this.f11016d.f11591a.getBannerSettings());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to destroy banner from " + this.f11015c.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getLocalizedMessage()}});
        }
        m12941b(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    /* renamed from: a */
    public final void mo33542a(int i, Object[][] objArr) {
        Map<String, Object> n = mo33615n();
        if (m12946s()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            m12938a(n, this.f10883m.getSize());
        }
        if (!TextUtils.isEmpty(this.f10878a)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f10878a);
        }
        JSONObject jSONObject = this.f10884n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f10884n);
        }
        C4651f fVar = this.f10887q;
        if (fVar != null) {
            n.put(IronSourceConstants.EVENTS_PLACEMENT_NAME, fVar.getPlacementName());
        }
        if (m12939a(i)) {
            C4533d.m13173e();
            C4533d.m13131a(n, this.f10885o, this.f10886p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f11020h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(mo33612k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C4533d.m13173e().mo33649b(new C4532c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    public final void mo33543a(IronSourceBannerLayout ironSourceBannerLayout, C4651f fVar, String str) {
        C4494Q q;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo33617p());
        this.f10887q = fVar;
        if (!C4643m.m13621a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            q = this.f10882l;
            ironSourceError = new IronSourceError(610, str2);
        } else if (this.f11015c == null) {
            IronLog.INTERNAL.verbose("mAdapter is null");
            q = this.f10882l;
            ironSourceError = new IronSourceError(611, "mAdapter is null");
        } else {
            this.f10883m = ironSourceBannerLayout;
            this.f10880j.mo33877a(this);
            try {
                if (mo33609h()) {
                    m12937a(str);
                    return;
                } else {
                    m12942f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(605, th.getLocalizedMessage()));
                return;
            }
        }
        q.mo33529a(ironSourceError, this);
    }

    /* renamed from: b */
    public final void mo33544b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo33617p());
        if (m12940a(C4495R.C4496a.INIT_IN_PROGRESS, C4495R.C4496a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (m12940a(C4495R.C4496a.LOADING, C4495R.C4496a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.f10881k);
            return;
        }
        m12936a(ironSourceError);
    }

    /* renamed from: c */
    public final Map<String, Object> mo33545c() {
        try {
            if (!mo33609h() || this.f11015c == null) {
                return null;
            }
            return this.f11015c.getBannerBiddingData(this.f11018f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.f11015c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    /* renamed from: d */
    public final void mo33546d() {
        this.f10880j.mo33873c();
        super.mo33546d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(mo33617p());
        mo33542a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        C4494Q q = this.f10882l;
        if (q != null) {
            q.mo33527a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(mo33617p());
        mo33542a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        C4494Q q = this.f10882l;
        if (q != null) {
            q.mo33534d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m12945r() + "error = " + ironSourceError);
        this.f10880j.mo33878d();
        if (m12940a(C4495R.C4496a.LOADING, C4495R.C4496a.LOAD_FAILED)) {
            m12936a(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(mo33617p());
        this.f10880j.mo33878d();
        if (m12940a(C4495R.C4496a.LOADING, C4495R.C4496a.LOADED)) {
            mo33542a(this.f10890t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4718f.m13801a(this.f10889s))}});
            C4494Q q = this.f10882l;
            if (q != null) {
                q.mo33528a(this, view, layoutParams);
                return;
            }
            return;
        }
        mo33542a(this.f10890t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(mo33617p());
        mo33542a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        C4494Q q = this.f10882l;
        if (q != null) {
            q.mo33531b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(mo33617p());
        mo33542a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        C4494Q q = this.f10882l;
        if (q != null) {
            q.mo33532c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(mo33617p());
        if (m12944q()) {
            mo33542a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            C4494Q q = this.f10882l;
            if (q != null) {
                q.mo33536e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.f10881k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        mo33542a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f10881k}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo33612k()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m12945r() + "error = " + ironSourceError);
        this.f10880j.mo33878d();
        if (m12940a(C4495R.C4496a.INIT_IN_PROGRESS, C4495R.C4496a.NONE)) {
            C4494Q q = this.f10882l;
            if (q != null) {
                q.mo33529a(new IronSourceError(612, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.f10881k);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(mo33617p());
        if (m12940a(C4495R.C4496a.INIT_IN_PROGRESS, C4495R.C4496a.READY_TO_LOAD) && !mo33609h()) {
            if (!C4643m.m13621a(this.f10883m)) {
                this.f10882l.mo33529a(new IronSourceError(605, this.f10883m == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                m12937a((String) null);
            }
        }
    }
}
