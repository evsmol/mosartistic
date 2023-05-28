package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.adview.C7981d;
import com.applovin.impl.adview.C7987e;
import com.applovin.impl.p233b.C8029a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.C8536i;
import com.applovin.impl.sdk.p251a.C8325e;
import com.applovin.impl.sdk.p255d.C8388a;
import com.applovin.impl.sdk.utils.C8571h;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private final C8325e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    /* access modifiers changed from: private */
    public final Uri clickDestinationBackupUri;
    /* access modifiers changed from: private */
    public final Uri clickDestinationUri;
    private final C8499a clickHandler;
    /* access modifiers changed from: private */
    public final List<String> clickTrackingUrls;
    /* access modifiers changed from: private */
    public AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<C8536i> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final String jsTracker;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final C8501b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    /* access modifiers changed from: private */
    public final String tag;
    private final String title;
    private final C8029a vastAd;
    private final List<C8536i> viewableMRC100Requests;
    private final List<C8536i> viewableMRC50Requests;
    private final List<C8536i> viewableVideo50Requests;

    public static class Builder {
        /* access modifiers changed from: private */
        public final JSONObject adObject;
        /* access modifiers changed from: private */
        public String advertiser;
        /* access modifiers changed from: private */
        public String body;
        /* access modifiers changed from: private */
        public String callToAction;
        /* access modifiers changed from: private */
        public Uri clickDestinationBackupUri;
        /* access modifiers changed from: private */
        public Uri clickDestinationUri;
        /* access modifiers changed from: private */
        public List<String> clickTrackingUrls;
        /* access modifiers changed from: private */
        public final JSONObject fullResponse;
        /* access modifiers changed from: private */
        public Uri iconUri;
        /* access modifiers changed from: private */
        public List<C8536i> impressionRequests;
        /* access modifiers changed from: private */
        public String jsTracker;
        /* access modifiers changed from: private */
        public Uri mainImageUri;
        /* access modifiers changed from: private */
        public Uri privacyDestinationUri;
        /* access modifiers changed from: private */
        public Uri privacyIconUri;
        /* access modifiers changed from: private */
        public final C8490n sdk;
        /* access modifiers changed from: private */
        public String title;
        /* access modifiers changed from: private */
        public C8029a vastAd;
        /* access modifiers changed from: private */
        public List<C8536i> viewableMRC100Requests;
        /* access modifiers changed from: private */
        public List<C8536i> viewableMRC50Requests;
        /* access modifiers changed from: private */
        public List<C8536i> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = nVar;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<C8536i> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTracker(String str) {
            this.jsTracker = str;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(C8029a aVar) {
            this.vastAd = aVar;
            return this;
        }

        public Builder setViewableMRC100Requests(List<C8536i> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<C8536i> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<C8536i> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$a */
    private static class C8499a implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final AppLovinNativeAdImpl f21399a;

        public C8499a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f21399a = appLovinNativeAdImpl;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m25704a(AppLovinNativeAdImpl appLovinNativeAdImpl, Context context) {
            C8626v D;
            String access$2200;
            StringBuilder sb;
            Uri access$3600;
            if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationUri, appLovinNativeAdImpl.sdk)) {
                appLovinNativeAdImpl.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    D = appLovinNativeAdImpl.sdk.mo57320D();
                    access$2200 = appLovinNativeAdImpl.tag;
                    sb = new StringBuilder();
                    sb.append("Opening URL: ");
                    access$3600 = appLovinNativeAdImpl.clickDestinationUri;
                } else {
                    return;
                }
            } else if (Utils.openUri(context, appLovinNativeAdImpl.clickDestinationBackupUri, appLovinNativeAdImpl.sdk)) {
                appLovinNativeAdImpl.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    D = appLovinNativeAdImpl.sdk.mo57320D();
                    access$2200 = appLovinNativeAdImpl.tag;
                    sb = new StringBuilder();
                    sb.append("Opening backup URL: ");
                    access$3600 = appLovinNativeAdImpl.clickDestinationBackupUri;
                } else {
                    return;
                }
            } else {
                return;
            }
            sb.append(access$3600);
            D.mo57818b(access$2200, sb.toString());
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl mo57471a() {
            return this.f21399a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo57472a(Object obj) {
            return obj instanceof C8499a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C8499a)) {
                return false;
            }
            C8499a aVar = (C8499a) obj;
            if (!aVar.mo57472a((Object) this)) {
                return false;
            }
            AppLovinNativeAdImpl a = mo57471a();
            AppLovinNativeAdImpl a2 = aVar.mo57471a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = mo57471a();
            return 59 + (a == null ? 43 : a.hashCode());
        }

        public void onClick(final View view) {
            this.f21399a.sdk.mo57320D();
            if (C8626v.m26252a()) {
                this.f21399a.sdk.mo57320D().mo57818b(this.f21399a.tag, "Handle view clicked");
            }
            this.f21399a.sdk.mo57406v().maybeSubmitPersistentPostbacks(this.f21399a.getDirectClickTrackingPostbacks());
            for (String dispatchPostbackAsync : this.f21399a.clickTrackingUrls) {
                this.f21399a.sdk.mo57360aa().dispatchPostbackAsync(dispatchPostbackAsync, (AppLovinPostbackListener) null);
            }
            C8575k.m26124a(this.f21399a.eventListener, (AppLovinNativeAd) this.f21399a);
            if (this.f21399a.isDirectDownloadEnabled()) {
                this.f21399a.sdk.mo57376aq().startDirectDownloadActivity(this.f21399a, new ArrayService.DirectDownloadListener() {
                    public void onAppDetailsDismissed() {
                    }

                    public void onAppDetailsDisplayed() {
                    }

                    public void onFailure() {
                        C8499a aVar = C8499a.this;
                        aVar.m25704a(aVar.f21399a, view.getContext());
                    }
                });
            } else {
                m25704a(this.f21399a, view.getContext());
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + mo57471a() + ")";
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$b */
    private static class C8501b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f21402a;

        public C8501b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f21402a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl mo57477a() {
            return this.f21402a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo57478a(Object obj) {
            return obj instanceof C8501b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C8501b)) {
                return false;
            }
            C8501b bVar = (C8501b) obj;
            if (!bVar.mo57478a(this)) {
                return false;
            }
            AppLovinNativeAdImpl a = mo57477a();
            AppLovinNativeAdImpl a2 = bVar.mo57477a();
            return a != null ? a.equals(a2) : a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl a = mo57477a();
            return 59 + (a == null ? 43 : a.hashCode());
        }

        public void onViewAttachedToWindow(View view) {
            this.f21402a.maybeHandleOnAttachedToWindow(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + mo57477a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        Uri parse;
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new C8499a(this);
        this.onAttachStateChangeHandler = new C8501b(this);
        this.adEventTracker = new C8325e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        this.vastAd = builder.vastAd;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTracker = builder.jsTracker;
        this.impressionRequests = builder.impressionRequests;
        if (builder.privacyDestinationUri != null) {
            parse = builder.privacyDestinationUri;
        } else {
            parse = (!isDspAd() || getSdk().mo57330N().mo56529a()) ? Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL) : parse;
            this.viewableMRC50Requests = builder.viewableMRC50Requests;
            this.viewableMRC100Requests = builder.viewableMRC100Requests;
            this.viewableVideo50Requests = builder.viewableVideo50Requests;
            this.tag = "AppLovinNativeAd:" + getAdIdNumber();
        }
        this.privacyDestinationUri = parse;
        this.viewableMRC50Requests = builder.viewableMRC50Requests;
        this.viewableMRC100Requests = builder.viewableMRC100Requests;
        this.viewableVideo50Requests = builder.viewableVideo50Requests;
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    /* access modifiers changed from: private */
    public List<C8388a> getDirectClickTrackingPostbacks() {
        List<C8388a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", (String) null), this.sdk);
        }
        return postbacks;
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    /* access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            if (StringUtils.isValidString(this.jsTracker)) {
                final C7981d dVar = new C7981d((C7987e) null, this.sdk, view.getContext());
                dVar.loadData(this.jsTracker, "text/html", "UTF-8");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                    public void run() {
                        dVar.stopLoading();
                    }
                }, TimeUnit.SECONDS.toMillis(5));
            }
            for (C8536i dispatchPostbackRequest : this.impressionRequests) {
                this.sdk.mo57360aa().dispatchPostbackRequest(dispatchPostbackRequest, (AppLovinPostbackListener) null);
            }
            this.adEventTracker.mo56847a(view);
            this.adEventTracker.mo56855d();
        }
    }

    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.mo56856e();
    }

    public C8325e getAdEventTracker() {
        return this.adEventTracker;
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdvertiser() {
        return this.advertiser;
    }

    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public C8499a getClickHandler() {
        return this.clickHandler;
    }

    public Bundle getDirectDownloadParameters() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("ah_parameters", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return JsonUtils.toBundle(jsonObjectFromAdObject);
        }
        return null;
    }

    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", (String) null);
    }

    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", (String) null);
    }

    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", (JSONArray) null);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                    try {
                        URL url = new URL(JsonUtils.getString(jSONObject, "url", (String) null));
                        String string = JsonUtils.getString(jSONObject, "vendor_key", (String) null);
                        String string2 = JsonUtils.getString(jSONObject, "parameters", (String) null);
                        arrayList.add((!StringUtils.isValidString(string) || !StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                    } catch (Throwable th) {
                        this.sdk.mo57320D();
                        if (C8626v.m26252a()) {
                            this.sdk.mo57320D().mo57819b(this.tag, "Failed to parse OMID verification script resource", th);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public C8029a getVastAd() {
        return this.vastAd;
    }

    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(IabUtils.KEY_OM_SDK_ENABLED, false);
    }

    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        String str;
        StringBuilder sb;
        String str2;
        C8626v vVar;
        this.nativeAdView = viewGroup;
        if ((!C8571h.m26085c() || !this.nativeAdView.isAttachedToWindow()) && (C8571h.m26085c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        this.sdk.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.sdk.mo57320D();
            String str3 = this.tag;
            D.mo57818b(str3, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.mo57320D();
            if (C8626v.m26252a()) {
                this.sdk.mo57320D().mo57818b(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View next : list) {
            if (next.hasOnClickListeners()) {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D2 = this.sdk.mo57320D();
                    String str4 = this.tag;
                    D2.mo57822e(str4, "View has an onClickListener already - " + next);
                }
            }
            if (!next.isClickable()) {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D3 = this.sdk.mo57320D();
                    String str5 = this.tag;
                    D3.mo57822e(str5, "View is not clickable - " + next);
                }
            }
            if (!next.isEnabled()) {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D4 = this.sdk.mo57320D();
                    String str6 = this.tag;
                    D4.mo57822e(str6, "View is not enabled - " + next);
                }
            }
            if (next instanceof Button) {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    vVar = this.sdk.mo57320D();
                    str2 = this.tag;
                    sb = new StringBuilder();
                    str = "Registering click for button: ";
                } else {
                    next.setOnClickListener(this.clickHandler);
                    this.registeredViews.add(next);
                }
            } else {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    vVar = this.sdk.mo57320D();
                    str2 = this.tag;
                    sb = new StringBuilder();
                    str = "Registering click for view: ";
                } else {
                    next.setOnClickListener(this.clickHandler);
                    this.registeredViews.add(next);
                }
            }
            sb.append(str);
            sb.append(next);
            vVar.mo57818b(str2, sb.toString());
            next.setOnClickListener(this.clickHandler);
            this.registeredViews.add(next);
        }
        this.sdk.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D5 = this.sdk.mo57320D();
            String str7 = this.tag;
            D5.mo57818b(str7, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        this.mediaView = new AppLovinMediaView(this, this.sdk, this.sdk.mo57332P());
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, this.sdk.mo57332P());
        }
    }

    public boolean shouldInjectOpenMeasurementScriptDuringCaching() {
        return false;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    public void unregisterViewsForInteraction() {
        for (View onClickListener : this.registeredViews) {
            onClickListener.setOnClickListener((View.OnClickListener) null);
        }
        this.sdk.mo57320D();
        if (C8626v.m26252a()) {
            C8626v D = this.sdk.mo57320D();
            String str = this.tag;
            D.mo57818b(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
