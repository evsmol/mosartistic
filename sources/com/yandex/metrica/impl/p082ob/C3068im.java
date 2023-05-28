package com.yandex.metrica.impl.p082ob;

import com.applovin.sdk.AppLovinEventTypes;

/* renamed from: com.yandex.metrica.impl.ob.im */
public enum C3068im {
    LOGIN(AppLovinEventTypes.USER_LOGGED_IN),
    LOGOUT("logout"),
    SWITCH("switch"),
    UPDATE("update");
    

    /* renamed from: a */
    private String f8069a;

    private C3068im(String str) {
        this.f8069a = str;
    }

    public String toString() {
        return this.f8069a;
    }
}
