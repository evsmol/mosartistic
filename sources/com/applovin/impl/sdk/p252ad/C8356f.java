package com.applovin.impl.sdk.p252ad;

import android.os.Bundle;
import com.applovin.impl.sdk.C8490n;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.f */
public final class C8356f extends AppLovinAdImpl {

    /* renamed from: a */
    private AppLovinAd f20598a;

    /* renamed from: b */
    private final C8349d f20599b;

    public C8356f(C8349d dVar, C8490n nVar) {
        super(new JSONObject(), new JSONObject(), C8346b.UNKNOWN, nVar);
        this.f20599b = dVar;
    }

    /* renamed from: c */
    private AppLovinAd m25135c() {
        return (AppLovinAd) this.sdk.mo57362ac().mo57083c(this.f20599b);
    }

    /* renamed from: d */
    private String m25136d() {
        C8349d adZone = getAdZone();
        if (adZone == null || adZone.mo56940e()) {
            return null;
        }
        return adZone.mo56936a();
    }

    /* renamed from: a */
    public AppLovinAd mo57028a() {
        return this.f20598a;
    }

    /* renamed from: a */
    public void mo57029a(AppLovinAd appLovinAd) {
        this.f20598a = appLovinAd;
    }

    /* renamed from: b */
    public AppLovinAd mo57030b() {
        AppLovinAd appLovinAd = this.f20598a;
        return appLovinAd != null ? appLovinAd : m25135c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppLovinAd b = mo57030b();
        return b != null ? b.equals(obj) : super.equals(obj);
    }

    public long getAdIdNumber() {
        AppLovinAd b = mo57030b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0;
    }

    public C8349d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo57030b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f20599b;
    }

    public long getCreatedAtMillis() {
        AppLovinAd b = mo57030b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getCreatedAtMillis();
        }
        return 0;
    }

    public Bundle getDirectDownloadParameters() {
        return null;
    }

    public String getDirectDownloadToken() {
        return null;
    }

    public String getOpenMeasurementContentUrl() {
        return null;
    }

    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    public JSONObject getOriginalFullResponse() {
        AppLovinAd b = mo57030b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getOriginalFullResponse();
        }
        return null;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().mo56938c();
    }

    public C8346b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) mo57030b();
        return appLovinAdImpl != null ? appLovinAdImpl.getSource() : C8346b.UNKNOWN;
    }

    public AppLovinAdType getType() {
        return getAdZone().mo56939d();
    }

    public String getZoneId() {
        if (this.f20599b.mo56940e()) {
            return null;
        }
        return this.f20599b.mo56936a();
    }

    public int hashCode() {
        AppLovinAd b = mo57030b();
        return b != null ? b.hashCode() : super.hashCode();
    }

    public boolean isDirectDownloadEnabled() {
        return false;
    }

    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public boolean isVideoAd() {
        AppLovinAd b = mo57030b();
        return b != null && b.isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + m25136d() + '\'' + '}';
    }
}
