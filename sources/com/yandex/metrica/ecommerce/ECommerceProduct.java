package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceProduct {

    /* renamed from: a */
    private final String f4957a;

    /* renamed from: b */
    private String f4958b;

    /* renamed from: c */
    private List<String> f4959c;

    /* renamed from: d */
    private Map<String, String> f4960d;

    /* renamed from: e */
    private ECommercePrice f4961e;

    /* renamed from: f */
    private ECommercePrice f4962f;

    /* renamed from: g */
    private List<String> f4963g;

    public ECommerceProduct(String str) {
        this.f4957a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f4961e;
    }

    public List<String> getCategoriesPath() {
        return this.f4959c;
    }

    public String getName() {
        return this.f4958b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f4962f;
    }

    public Map<String, String> getPayload() {
        return this.f4960d;
    }

    public List<String> getPromocodes() {
        return this.f4963g;
    }

    public String getSku() {
        return this.f4957a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f4961e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f4959c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f4958b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f4962f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f4960d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f4963g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f4957a + '\'' + ", name='" + this.f4958b + '\'' + ", categoriesPath=" + this.f4959c + ", payload=" + this.f4960d + ", actualPrice=" + this.f4961e + ", originalPrice=" + this.f4962f + ", promocodes=" + this.f4963g + '}';
    }
}
