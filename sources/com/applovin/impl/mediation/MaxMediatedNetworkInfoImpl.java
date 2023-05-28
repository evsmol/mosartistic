package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a */
    private final JSONObject f19543a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f19543a = jSONObject;
    }

    public String getAdapterClassName() {
        return JsonUtils.getString(this.f19543a, "class", "");
    }

    public String getAdapterVersion() {
        return JsonUtils.getString(this.f19543a, "version", "");
    }

    public String getName() {
        return JsonUtils.getString(this.f19543a, AppMeasurementSdk.ConditionalUserProperty.NAME, "");
    }

    public String getSdkVersion() {
        return JsonUtils.getString(this.f19543a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + '}';
    }
}
