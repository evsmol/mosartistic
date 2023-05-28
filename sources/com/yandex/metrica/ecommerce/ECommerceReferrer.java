package com.yandex.metrica.ecommerce;

public class ECommerceReferrer {

    /* renamed from: a */
    private String f4964a;

    /* renamed from: b */
    private String f4965b;

    /* renamed from: c */
    private ECommerceScreen f4966c;

    public String getIdentifier() {
        return this.f4965b;
    }

    public ECommerceScreen getScreen() {
        return this.f4966c;
    }

    public String getType() {
        return this.f4964a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f4965b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f4966c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f4964a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f4964a + '\'' + ", identifier='" + this.f4965b + '\'' + ", screen=" + this.f4966c + '}';
    }
}
