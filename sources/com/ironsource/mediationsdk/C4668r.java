package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C4736w;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C4646a;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.C4672b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r */
public final class C4668r extends C4736w implements BannerSmashListener {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4672b f11693i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f11694j;

    /* renamed from: k */
    private String f11695k;

    /* renamed from: l */
    private String f11696l;

    /* renamed from: m */
    private JSONObject f11697m;

    public C4668r(String str, String str2, NetworkSettings networkSettings, C4672b bVar, int i, AbstractAdapter abstractAdapter) {
        super(new C4646a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f11693i = bVar;
        this.f12003d = i;
        this.f11695k = str;
        this.f11696l = str2;
        this.f11697m = networkSettings.getBannerSettings();
        this.f12000a.initBannerForBidding(str, str2, this.f12002c, this);
    }

    /* renamed from: a */
    public final void mo34067a() {
        IronLog.INTERNAL.verbose("");
        if (this.f12000a == null) {
            IronLog.INTERNAL.error("destroyBanner() mAdapter == null");
        } else if (mo34218a(C4736w.C4737a.LOADED, C4736w.C4737a.NOT_LOADED) || mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
            mo34224h();
            this.f12000a.destroyBanner(this.f12001b.f11591a.getBannerSettings());
        } else {
            IronLog.INTERNAL.error("cannot destroy banner not loaded");
        }
    }

    /* renamed from: a */
    public final void mo34068a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + mo34223g());
        C4736w.C4737a a = mo34213a(new C4736w.C4737a[]{C4736w.C4737a.NOT_LOADED, C4736w.C4737a.LOADED}, C4736w.C4737a.LOAD_IN_PROGRESS);
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            IronLog.INTERNAL.error("loadBanner - bannerLayout is null or destroyed");
            this.f11693i.mo34060a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.f11694j);
        } else if (str == null) {
            IronLog.INTERNAL.error("loadBanner - serverData is null");
            this.f11693i.mo34060a(new IronSourceError(618, "serverData==null"), this, false, new Date().getTime() - this.f11694j);
        } else if (this.f12000a == null) {
            IronLog.INTERNAL.error("loadBanner - mAdapter is null");
            this.f11693i.mo34060a(new IronSourceError(611, "adapter==null"), this, false, new Date().getTime() - this.f11694j);
        } else if (a == C4736w.C4737a.NOT_LOADED) {
            this.f11694j = new Date().getTime();
            IronLog.INTERNAL.verbose("start timer");
            mo34216a((TimerTask) new TimerTask() {
                public final void run() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("load timed out state=" + C4668r.this.mo34223g());
                    if (C4668r.this.mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
                        C4668r.this.f11693i.mo34060a(new IronSourceError(608, "load timed out"), C4668r.this, false, new Date().getTime() - C4668r.this.f11694j);
                    }
                }
            });
            this.f12004e = str2;
            this.f12005f = jSONObject;
            this.f12006g = list;
            this.f12000a.initBannerForBidding(this.f11695k, this.f11696l, this.f11697m, this);
            this.f12000a.loadBannerForBidding(ironSourceBannerLayout, this.f11697m, this, str);
        } else {
            this.f11693i.mo34060a(a == C4736w.C4737a.LOAD_IN_PROGRESS ? new IronSourceError(619, "load already in progress") : new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show"), this, false, new Date().getTime() - this.f11694j);
        }
    }

    /* renamed from: b */
    public final String mo34069b() {
        return this.f12001b.f11591a.isMultipleInstances() ? this.f12001b.f11591a.getProviderTypeForReflection() : this.f12001b.f11591a.getProviderName();
    }

    /* renamed from: c */
    public final Map<String, Object> mo34070c() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f12000a != null ? this.f12000a.getVersion() : str);
            if (this.f12000a != null) {
                str = this.f12000a.getCoreSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
            hashMap.put("spId", this.f12001b.f11591a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f12001b.f11591a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.f12004e)) {
                hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f12004e);
            }
            if (this.f12005f != null && this.f12005f.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f12005f);
            }
            if (!TextUtils.isEmpty(this.f12007h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f12007h);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo34220d() + ")", e);
        }
        return hashMap;
    }

    public final void onBannerAdClicked() {
        C4672b bVar = this.f11693i;
        if (bVar != null) {
            bVar.mo34061a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        C4672b bVar = this.f11693i;
        if (bVar != null) {
            bVar.mo34065d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.NOT_LOADED)) {
            mo34224h();
            boolean z = ironSourceError.getErrorCode() == 606;
            if (this.f11693i != null) {
                this.f11693i.mo34060a(ironSourceError, this, z, new Date().getTime() - this.f11694j);
            }
            mo34214a(C4736w.C4737a.NOT_LOADED);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (mo34218a(C4736w.C4737a.LOAD_IN_PROGRESS, C4736w.C4737a.LOADED)) {
            C4672b bVar = this.f11693i;
            if (bVar != null) {
                bVar.mo34062a(this, view, layoutParams);
            }
            mo34224h();
        }
    }

    public final void onBannerAdScreenDismissed() {
        C4672b bVar = this.f11693i;
        if (bVar != null) {
            bVar.mo34063b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        C4672b bVar = this.f11693i;
        if (bVar != null) {
            bVar.mo34064c(this);
        }
    }

    public final void onBannerAdShown() {
        C4672b bVar = this.f11693i;
        if (bVar != null) {
            bVar.mo34066e(this);
            this.f11693i.mo34064c(this);
        }
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
