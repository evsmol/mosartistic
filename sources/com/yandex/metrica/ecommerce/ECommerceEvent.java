package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p082ob.C2336Na;
import com.yandex.metrica.impl.p082ob.C2671Vm;
import com.yandex.metrica.impl.p082ob.C2766Za;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.List;

public abstract class ECommerceEvent implements C2766Za {

    /* renamed from: a */
    private static ECommerceEventProvider f4951a = new ECommerceEventProvider();

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f4951a.addCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return f4951a.beginCheckoutEvent(eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return f4951a.purchaseEvent(eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f4951a.removeCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return f4951a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return f4951a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return f4951a.showScreenEvent(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    public abstract /* synthetic */ List<C2336Na<C3211mf, C2671Vm>> toProto();
}
