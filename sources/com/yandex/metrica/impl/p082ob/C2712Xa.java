package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Xa */
public class C2712Xa {

    /* renamed from: a */
    public final C2516Sa f7169a;

    /* renamed from: b */
    public final List<C2516Sa> f7170b;

    public C2712Xa(ECommercePrice eCommercePrice) {
        this(new C2516Sa(eCommercePrice.getFiat()), m8862a(eCommercePrice.getInternalComponents()));
    }

    /* renamed from: a */
    public static List<C2516Sa> m8862a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount next : list) {
            linkedList.add(new C2516Sa(next.getAmount(), next.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        return "PriceWrapper{fiat=" + this.f7169a + ", internalComponents=" + this.f7170b + '}';
    }

    public C2712Xa(C2516Sa sa, List<C2516Sa> list) {
        this.f7169a = sa;
        this.f7170b = list;
    }
}
