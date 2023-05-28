package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p082ob.C1848A2;
import java.math.BigDecimal;

public class ECommerceCartItem {

    /* renamed from: a */
    private final ECommerceProduct f4947a;

    /* renamed from: b */
    private final BigDecimal f4948b;

    /* renamed from: c */
    private final ECommercePrice f4949c;

    /* renamed from: d */
    private ECommerceReferrer f4950d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, C1848A2.m6799a(j));
    }

    public ECommerceProduct getProduct() {
        return this.f4947a;
    }

    public BigDecimal getQuantity() {
        return this.f4948b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f4950d;
    }

    public ECommercePrice getRevenue() {
        return this.f4949c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f4950d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f4947a + ", quantity=" + this.f4948b + ", revenue=" + this.f4949c + ", referrer=" + this.f4950d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(C1848A2.m6792a(d, 0.0d)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f4947a = eCommerceProduct;
        this.f4948b = bigDecimal;
        this.f4949c = eCommercePrice;
    }
}
