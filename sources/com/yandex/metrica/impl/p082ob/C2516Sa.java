package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.Sa */
public class C2516Sa {

    /* renamed from: a */
    public final BigDecimal f6629a;

    /* renamed from: b */
    public final String f6630b;

    public C2516Sa(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        return "AmountWrapper{amount=" + this.f6629a + ", unit='" + this.f6630b + '\'' + '}';
    }

    public C2516Sa(BigDecimal bigDecimal, String str) {
        this.f6629a = bigDecimal;
        this.f6630b = str;
    }
}
