package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkSettings {

    /* renamed from: a */
    private String f11571a;

    /* renamed from: b */
    private String f11572b;

    /* renamed from: c */
    private JSONObject f11573c;

    /* renamed from: d */
    private JSONObject f11574d;

    /* renamed from: e */
    private JSONObject f11575e;

    /* renamed from: f */
    private JSONObject f11576f;

    /* renamed from: g */
    private String f11577g;

    /* renamed from: h */
    private String f11578h;

    /* renamed from: i */
    private boolean f11579i;

    /* renamed from: j */
    private String f11580j;

    /* renamed from: k */
    private int f11581k;

    /* renamed from: l */
    private int f11582l;

    /* renamed from: m */
    private int f11583m;

    /* renamed from: n */
    private String f11584n;

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f11571a = networkSettings.getProviderName();
        this.f11580j = networkSettings.getProviderName();
        this.f11572b = networkSettings.getProviderTypeForReflection();
        this.f11574d = networkSettings.getRewardedVideoSettings();
        this.f11575e = networkSettings.getInterstitialSettings();
        this.f11576f = networkSettings.getBannerSettings();
        this.f11573c = networkSettings.getApplicationSettings();
        this.f11581k = networkSettings.getRewardedVideoPriority();
        this.f11582l = networkSettings.getInterstitialPriority();
        this.f11583m = networkSettings.getBannerPriority();
        this.f11584n = networkSettings.getProviderDefaultInstance();
    }

    public NetworkSettings(String str) {
        this.f11571a = str;
        this.f11580j = str;
        this.f11572b = str;
        this.f11584n = str;
        this.f11574d = new JSONObject();
        this.f11575e = new JSONObject();
        this.f11576f = new JSONObject();
        this.f11573c = new JSONObject();
        this.f11581k = -1;
        this.f11582l = -1;
        this.f11583m = -1;
    }

    public NetworkSettings(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f11571a = str;
        this.f11580j = str;
        this.f11572b = str2;
        this.f11584n = str3;
        this.f11574d = jSONObject2;
        this.f11575e = jSONObject3;
        this.f11576f = jSONObject4;
        this.f11573c = jSONObject;
        this.f11581k = -1;
        this.f11582l = -1;
        this.f11583m = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f11578h;
    }

    public JSONObject getApplicationSettings() {
        return this.f11573c;
    }

    public int getBannerPriority() {
        return this.f11583m;
    }

    public JSONObject getBannerSettings() {
        return this.f11576f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f11573c;
        if (jSONObject != null) {
            return jSONObject.optString(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD);
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.AD_UNIT ad_unit) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if ((ad_unit == null && (jSONObject2 = this.f11573c) != null) || ((ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) && (jSONObject2 = this.f11574d) != null) || (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL) && (jSONObject2 = this.f11575e) != null))) {
            return jSONObject2.optString("customNetworkAdapterName");
        }
        if (!ad_unit.equals(IronSource.AD_UNIT.BANNER) || (jSONObject = this.f11576f) == null) {
            return null;
        }
        return jSONObject.optString("customNetworkAdapterName");
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f11573c;
        return jSONObject != null ? jSONObject.optString("customNetworkPackage", "") : "";
    }

    public int getInstanceType(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 1;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("instanceType");
    }

    public int getInterstitialPriority() {
        return this.f11582l;
    }

    public JSONObject getInterstitialSettings() {
        return this.f11575e;
    }

    public int getMaxAdsPerSession(IronSource.AD_UNIT ad_unit) {
        JSONObject bannerSettings;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            bannerSettings = getInterstitialSettings();
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            bannerSettings = getRewardedVideoSettings();
        } else if (ad_unit != IronSource.AD_UNIT.BANNER) {
            return 99;
        } else {
            bannerSettings = getBannerSettings();
        }
        return bannerSettings.optInt("maxAdsPerSession", 99);
    }

    public String getProviderDefaultInstance() {
        return this.f11584n;
    }

    public String getProviderInstanceName() {
        return this.f11580j;
    }

    public String getProviderName() {
        return this.f11571a;
    }

    public String getProviderTypeForReflection() {
        return this.f11572b;
    }

    public int getRewardedVideoPriority() {
        return this.f11581k;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f11574d;
    }

    public String getSubProviderId() {
        return this.f11577g;
    }

    public boolean isBidder(IronSource.AD_UNIT ad_unit) {
        return !isCustomNetwork() && getInstanceType(ad_unit) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME);
    }

    public boolean isMultipleInstances() {
        return this.f11579i;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f11578h = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f11573c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f11583m = i;
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f11576f.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f11576f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f11582l = i;
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f11575e.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f11575e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f11579i = z;
    }

    public void setRewardedVideoPriority(int i) {
        this.f11581k = i;
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f11574d.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f11574d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f11577g = str;
    }
}
