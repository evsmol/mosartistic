package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p082ob.C1848A2;
import java.math.BigDecimal;

public class ECommerceAmount {

    /* renamed from: a */
    private final BigDecimal f4945a;

    /* renamed from: b */
    private final String f4946b;

    public ECommerceAmount(long j, String str) {
        this(C1848A2.m6799a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f4945a;
    }

    public String getUnit() {
        return this.f4946b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f4945a + ", unit='" + this.f4946b + '\'' + '}';
    }

    public ECommerceAmount(double d, String str) {
        this(new BigDecimal(C1848A2.m6792a(d, 0.0d)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f4945a = bigDecimal;
        this.f4946b = str;
    }
}
