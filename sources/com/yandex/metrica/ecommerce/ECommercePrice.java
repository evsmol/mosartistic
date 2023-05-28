package com.yandex.metrica.ecommerce;

import java.util.List;

public class ECommercePrice {

    /* renamed from: a */
    private final ECommerceAmount f4955a;

    /* renamed from: b */
    private List<ECommerceAmount> f4956b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f4955a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f4955a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f4956b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f4956b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f4955a + ", internalComponents=" + this.f4956b + '}';
    }
}
