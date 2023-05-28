package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a */
    private final List<String> f20454a;

    /* renamed from: b */
    private final C8490n f20455b;

    public SdkConfigurationImpl(List<String> list, C8490n nVar) {
        this.f20454a = list;
        this.f20455b = nVar;
    }

    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f20455b.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.CONSENT_DIALOG_STATE);
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f20455b.mo57342a(C8380b.f20978fs);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    public String getCountryCode() {
        return (String) this.f20455b.mo57342a(C8380b.f20979ft);
    }

    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f20454a;
    }

    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + '}';
    }
}
