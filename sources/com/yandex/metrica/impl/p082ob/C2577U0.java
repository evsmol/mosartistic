package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.U0 */
public enum C2577U0 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    private final String f6843a;

    private C2577U0(String str) {
        this.f6843a = str;
    }

    /* renamed from: a */
    public String mo16730a() {
        return this.f6843a;
    }

    /* renamed from: a */
    public static C2577U0 m8555a(String str) {
        C2577U0[] values = values();
        for (int i = 0; i < 6; i++) {
            C2577U0 u0 = values[i];
            if (u0.f6843a.equals(str)) {
                return u0;
            }
        }
        return UNKNOWN;
    }
}
