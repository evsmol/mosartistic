package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: com.yandex.metrica.impl.ob.Ua */
public class C2597Ua {

    /* renamed from: a */
    public final C2739Ya f6873a;

    /* renamed from: b */
    public final BigDecimal f6874b;

    /* renamed from: c */
    public final C2712Xa f6875c;

    /* renamed from: d */
    public final C2800ab f6876d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2597Ua(ECommerceCartItem eCommerceCartItem) {
        this(new C2739Ya(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C2712Xa(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C2800ab(eCommerceCartItem.getReferrer()));
    }

    public String toString() {
        return "CartItemWrapper{product=" + this.f6873a + ", quantity=" + this.f6874b + ", revenue=" + this.f6875c + ", referrer=" + this.f6876d + '}';
    }

    public C2597Ua(C2739Ya ya, BigDecimal bigDecimal, C2712Xa xa, C2800ab abVar) {
        this.f6873a = ya;
        this.f6874b = bigDecimal;
        this.f6875c = xa;
        this.f6876d = abVar;
    }
}
