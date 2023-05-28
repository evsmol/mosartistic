package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceScreen {

    /* renamed from: a */
    private String f4967a;

    /* renamed from: b */
    private List<String> f4968b;

    /* renamed from: c */
    private String f4969c;

    /* renamed from: d */
    private Map<String, String> f4970d;

    public List<String> getCategoriesPath() {
        return this.f4968b;
    }

    public String getName() {
        return this.f4967a;
    }

    public Map<String, String> getPayload() {
        return this.f4970d;
    }

    public String getSearchQuery() {
        return this.f4969c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f4968b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f4967a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f4970d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f4969c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f4967a + '\'' + ", categoriesPath=" + this.f4968b + ", searchQuery='" + this.f4969c + '\'' + ", payload=" + this.f4970d + '}';
    }
}
