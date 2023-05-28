package com.yandex.metrica.identifiers.impl;

/* renamed from: com.yandex.metrica.identifiers.impl.l */
public enum C1827l {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    private final String f5002a;

    static {
        OK = new C1827l("OK", 0, "OK");
        IDENTIFIER_PROVIDER_UNAVAILABLE = new C1827l("IDENTIFIER_PROVIDER_UNAVAILABLE", 1, "IDENTIFIER_PROVIDER_UNAVAILABLE");
        UNKNOWN = new C1827l("UNKNOWN", 5, "UNKNOWN");
    }

    private C1827l(String str) {
        this.f5002a = str;
    }

    /* renamed from: a */
    public final String mo15401a() {
        return this.f5002a;
    }
}
