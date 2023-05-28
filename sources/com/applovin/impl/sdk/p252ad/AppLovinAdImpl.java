package com.applovin.impl.sdk.p252ad;

import android.os.Bundle;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.AppLovinAdImpl */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd {

    /* renamed from: a */
    private final Bundle f20541a = new Bundle();

    /* renamed from: b */
    private C8349d f20542b;

    /* renamed from: c */
    private C8356f f20543c;
    protected final C8346b source;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C8346b bVar, C8490n nVar) {
        super(jSONObject, jSONObject2, nVar);
        this.source = bVar;
    }

    public boolean equals(Object obj) {
        AppLovinAd b;
        if ((obj instanceof C8356f) && (b = ((C8356f) obj).mo57030b()) != null) {
            obj = b;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public String getAdValue(String str, String str2) {
        return JsonUtils.getString(getJsonObjectFromAdObject(Utils.KEY_AD_VALUES, new JSONObject()), str, str2);
    }

    public C8349d getAdZone() {
        C8349d dVar = this.f20542b;
        if (dVar != null) {
            if (dVar.mo56938c() != null && this.f20542b.mo56939d() != null) {
                return this.f20542b;
            }
            if (getSize() == null && getType() == null) {
                return this.f20542b;
            }
        }
        C8349d a = C8349d.m25016a(getSize(), getType(), getStringFromFullResponse("zone_id", (String) null));
        this.f20542b = a;
        return a;
    }

    public C8356f getDummyAd() {
        return this.f20543c;
    }

    public Bundle getMAXAdValues() {
        return this.f20541a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", (String) null));
    }

    public C8346b getSource() {
        return this.source;
    }

    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", (String) null));
    }

    public String getZoneId() {
        if (getAdZone().mo56940e()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", (String) null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", false);
    }

    public boolean hasVideoUrl() {
        this.sdk.mo57320D();
        if (!C8626v.m26252a()) {
            return false;
        }
        this.sdk.mo57320D().mo57822e("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", false) : hasVideoUrl();
    }

    public void setDummyAd(C8356f fVar) {
        this.f20543c = fVar;
    }

    public void setHasShown(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f20541a);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", false);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", source=" + getSource() + ", zoneId=\"" + getZoneId() + "\"" + '}';
    }
}
