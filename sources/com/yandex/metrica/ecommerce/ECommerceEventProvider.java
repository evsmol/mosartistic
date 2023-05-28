package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.p082ob.C1888Ba;
import com.yandex.metrica.impl.p082ob.C2056Ga;
import com.yandex.metrica.impl.p082ob.C2423Pa;
import com.yandex.metrica.impl.p082ob.C2454Qa;
import com.yandex.metrica.impl.p082ob.C2481Ra;
import com.yandex.metrica.impl.p082ob.C2558Ta;
import com.yandex.metrica.impl.p082ob.C2597Ua;
import com.yandex.metrica.impl.p082ob.C2658Va;
import com.yandex.metrica.impl.p082ob.C2684Wa;
import com.yandex.metrica.impl.p082ob.C2739Ya;
import com.yandex.metrica.impl.p082ob.C2800ab;
import com.yandex.metrica.impl.p082ob.C2832bb;
import com.yandex.metrica.impl.p082ob.C2863cb;
import com.yandex.metrica.impl.p082ob.C2890db;
import com.yandex.metrica.impl.p082ob.C2919eb;

public class ECommerceEventProvider {
    public ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C2558Ta(4, new C2597Ua(eCommerceCartItem), new C1888Ba());
    }

    public ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C2658Va(6, new C2684Wa(eCommerceOrder), new C2056Ga());
    }

    public ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C2658Va(7, new C2684Wa(eCommerceOrder), new C2056Ga());
    }

    public ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C2558Ta(5, new C2597Ua(eCommerceCartItem), new C1888Ba());
    }

    public ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C2863cb(new C2739Ya(eCommerceProduct), new C2832bb(eCommerceScreen), new C2423Pa());
    }

    public ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        C2800ab abVar;
        C2739Ya ya = new C2739Ya(eCommerceProduct);
        if (eCommerceReferrer == null) {
            abVar = null;
        } else {
            abVar = new C2800ab(eCommerceReferrer);
        }
        return new C2890db(ya, abVar, new C2454Qa());
    }

    public ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C2919eb(new C2832bb(eCommerceScreen), new C2481Ra());
    }
}
