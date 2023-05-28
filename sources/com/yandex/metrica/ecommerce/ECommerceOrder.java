package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceOrder {

    /* renamed from: a */
    private final String f4952a;

    /* renamed from: b */
    private final List<ECommerceCartItem> f4953b;

    /* renamed from: c */
    private Map<String, String> f4954c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f4952a = str;
        this.f4953b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f4953b;
    }

    public String getIdentifier() {
        return this.f4952a;
    }

    public Map<String, String> getPayload() {
        return this.f4954c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f4954c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f4952a + '\'' + ", cartItems=" + this.f4953b + ", payload=" + this.f4954c + '}';
    }
}
