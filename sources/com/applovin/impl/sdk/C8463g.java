package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* renamed from: com.applovin.impl.sdk.g */
class C8463g implements AppLovinUserSegment {

    /* renamed from: a */
    private String f21254a;

    C8463g() {
    }

    public String getName() {
        return this.f21254a;
    }

    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                C8626v.m26258i("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                C8626v.m26258i("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f21254a = str;
    }

    public String toString() {
        return "AppLovinUserSegment{name=" + getName() + '}';
    }
}
