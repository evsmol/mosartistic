package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class MaxNativeAdLoaderImpl extends C8105a implements C8073d.C8074a {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8103a f19716a = new C8103a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f19717b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f19718c;

    /* renamed from: d */
    private C8135d.C8137a f19719d = C8135d.C8137a.PUBLISHER_INITIATED;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MaxNativeAdListener f19720e;

    /* renamed from: f */
    private final Map<String, MaxNativeAdView> f19721f = CollectionUtils.map();

    /* renamed from: g */
    private final Object f19722g = new Object();

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    private class C8103a implements C8105a.C8106a {
        private C8103a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m24243a(MaxNativeAdView maxNativeAdView) {
            C8073d c;
            C8107b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker != null && (c = adViewTracker.mo56260c()) != null) {
                C8626v vVar = MaxNativeAdLoaderImpl.this.logger;
                if (C8626v.m26252a()) {
                    MaxNativeAdLoaderImpl.this.logger.mo57818b(MaxNativeAdLoaderImpl.this.tag, "Destroying previous ad");
                }
                MaxNativeAdLoaderImpl.this.destroy(c);
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            C8575k.m26140a(MaxNativeAdLoaderImpl.this.f19720e, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdView unused = MaxNativeAdLoaderImpl.this.m24233a(((MaxErrorImpl) maxError).getLoadTag());
            C8575k.m26142a(MaxNativeAdLoaderImpl.this.f19720e, str, maxError, true);
        }

        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C8626v vVar = MaxNativeAdLoaderImpl.this.logger;
                    if (C8626v.m26252a()) {
                        MaxNativeAdLoaderImpl.this.logger.mo57818b(MaxNativeAdLoaderImpl.this.tag, "Native ad loaded");
                    }
                    C8073d dVar = (C8073d) maxAd;
                    dVar.mo56185e(MaxNativeAdLoaderImpl.this.f19717b);
                    dVar.mo56186f(MaxNativeAdLoaderImpl.this.f19718c);
                    MaxNativeAdLoaderImpl.this.sdk.mo57373an().mo55453a((Object) dVar);
                    MaxNativeAdView a = MaxNativeAdLoaderImpl.this.m24233a(dVar.mo56060a());
                    if (a == null) {
                        C8626v vVar2 = MaxNativeAdLoaderImpl.this.logger;
                        if (C8626v.m26252a()) {
                            MaxNativeAdLoaderImpl.this.logger.mo57818b(MaxNativeAdLoaderImpl.this.tag, "No custom view provided, checking template");
                        }
                        String A = dVar.mo56130A();
                        if (StringUtils.isValidString(A)) {
                            C8626v vVar3 = MaxNativeAdLoaderImpl.this.logger;
                            if (C8626v.m26252a()) {
                                C8626v vVar4 = MaxNativeAdLoaderImpl.this.logger;
                                String str = MaxNativeAdLoaderImpl.this.tag;
                                vVar4.mo57818b(str, "Using template: " + A + APSSharedUtil.TRUNCATE_SEPARATOR);
                            }
                            a = new MaxNativeAdView(A, MaxNativeAdLoaderImpl.this.sdk.mo57332P());
                        }
                    }
                    if (a == null) {
                        C8626v vVar5 = MaxNativeAdLoaderImpl.this.logger;
                        if (C8626v.m26252a()) {
                            MaxNativeAdLoaderImpl.this.logger.mo57818b(MaxNativeAdLoaderImpl.this.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        }
                        C8575k.m26141a(MaxNativeAdLoaderImpl.this.f19720e, (MaxNativeAdView) null, maxAd, true);
                        dVar.mo56137a((C8073d.C8074a) MaxNativeAdLoaderImpl.this);
                        return;
                    }
                    C8103a.this.m24243a(a);
                    MaxNativeAdLoaderImpl.this.m24237a(a, dVar, dVar.getNativeAd());
                    C8575k.m26141a(MaxNativeAdLoaderImpl.this.f19720e, a, maxAd, true);
                    dVar.mo56137a((C8073d.C8074a) MaxNativeAdLoaderImpl.this);
                    MaxNativeAdLoaderImpl.this.m24236a(a);
                }
            });
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C8575k.m26137a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C8490n nVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", nVar);
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str2 = this.tag;
            vVar2.mo57818b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MaxNativeAdView m24233a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f19722g) {
            remove = this.f19721f.remove(str);
        }
        return remove;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24236a(MaxNativeAdView maxNativeAdView) {
        C8107b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (C8571h.m26085c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.mo56259b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24237a(final MaxNativeAdView maxNativeAdView, final C8073d dVar, final MaxNativeAd maxNativeAd) {
        dVar.mo56138a(maxNativeAdView);
        mo56251a(dVar);
        C81022 r0 = new Runnable() {
            public void run() {
                C8626v vVar = MaxNativeAdLoaderImpl.this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = MaxNativeAdLoaderImpl.this.logger;
                    String str = MaxNativeAdLoaderImpl.this.tag;
                    vVar2.mo57818b(str, "Rendering native ad view: " + maxNativeAdView);
                }
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f19716a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                if (!maxNativeAd.prepareForInteraction(maxNativeAdView.getClickableViews(), maxNativeAdView)) {
                    maxNativeAd.prepareViewForInteraction(maxNativeAdView);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(r0);
        } else {
            this.sdk.mo57337V().mo57228a((C8401a) new C8458z(this.sdk, r0), C8432o.C8434a.MEDIATION_MAIN);
        }
    }

    /* renamed from: a */
    private void m24238a(String str, MaxNativeAdView maxNativeAdView) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f19722g) {
                this.f19721f.put(str, maxNativeAdView);
            }
        }
    }

    public void destroy() {
        this.f19720e = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        C8107b adViewTracker;
        if (maxAd instanceof C8073d) {
            C8073d dVar = (C8073d) maxAd;
            if (dVar.mo56133D()) {
                C8626v vVar = this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = this.logger;
                    String str = this.tag;
                    vVar2.mo57818b(str, "Native ad (" + dVar + ") has already been destroyed");
                    return;
                }
                return;
            }
            MaxNativeAdView z = dVar.mo56113z();
            if (!(z == null || (adViewTracker = z.getAdViewTracker()) == null || !maxAd.equals(adViewTracker.mo56260c()))) {
                z.recycle();
            }
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (!(nativeAd == null || nativeAd.getAdViewTracker() == null)) {
                nativeAd.getAdViewTracker().mo56258a();
            }
            dVar.mo56136G();
            this.sdk.mo57324H().destroyAd(dVar);
            this.sdk.mo57329M().mo56295a(this.adUnitId, dVar.mo56060a());
            return;
        }
        C8626v vVar3 = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar4 = this.logger;
            String str2 = this.tag;
            vVar4.mo57818b(str2, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    public String getPlacement() {
        return this.f19717b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((C8073d) maxAd).getNativeAd();
        if (nativeAd == null) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57822e(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        C8107b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker == null) {
            C8626v vVar2 = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57822e(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
                return;
            }
            return;
        }
        adViewTracker.mo56259b();
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f19716a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m24238a(lowerCase, maxNativeAdView);
        this.sdk.mo57324H().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f19719d, this.localExtraParameters, this.extraParameters, this.sdk.mo57332P(), this.f19716a);
    }

    public void onAdExpired(C8073d dVar) {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Ad expired for ad unit id " + getAdUnitId());
        }
        C8575k.m26156b(this.f19720e, (MaxAd) dVar, true);
    }

    public void registerClickableViews(final List<View> list, final ViewGroup viewGroup, MaxAd maxAd) {
        C8073d dVar = (C8073d) maxAd;
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (nativeAd == null) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57822e(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        this.sdk.mo57373an().mo55453a((Object) dVar);
        mo56251a(dVar);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new C8107b(dVar, viewGroup, this.f19716a, this.sdk));
        C81011 r7 = new Runnable() {
            public void run() {
                if (!nativeAd.prepareForInteraction(list, viewGroup)) {
                    C8626v.m26258i(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
                }
            }
        };
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(r7);
        } else {
            this.sdk.mo57337V().mo57228a((C8401a) new C8458z(this.sdk, r7), C8432o.C8434a.MEDIATION_MAIN);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        String str;
        String str2;
        if (!(maxAd instanceof C8073d)) {
            str = this.tag;
            str2 = "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.";
        } else if (maxNativeAdView == null) {
            str = this.tag;
            str2 = "Failed to render native ad. `adView` to render cannot be null.";
        } else {
            C8073d dVar = (C8073d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                C8626v vVar = this.logger;
                if (C8626v.m26252a()) {
                    this.logger.mo57822e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                }
                return false;
            } else if (!nativeAd.isExpired() || ((Boolean) this.sdk.mo57342a(C8379a.f20650E)).booleanValue()) {
                m24237a(maxNativeAdView, dVar, nativeAd);
                m24236a(maxNativeAdView);
                return true;
            } else {
                str = this.tag;
                str2 = "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`";
            }
        }
        C8626v.m26258i(str, str2);
        return false;
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f19718c = str;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof C8135d.C8137a)) {
            this.f19719d = (C8135d.C8137a) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f19720e = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f19717b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + '\'' + ", nativeAdListener=" + this.f19720e + ", revenueListener=" + this.revenueListener + '}';
    }
}
