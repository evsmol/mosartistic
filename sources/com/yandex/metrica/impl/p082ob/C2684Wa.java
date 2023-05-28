package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.Wa */
public class C2684Wa {

    /* renamed from: a */
    public final String f7081a;

    /* renamed from: b */
    public final String f7082b;

    /* renamed from: c */
    public final List<C2597Ua> f7083c;

    /* renamed from: d */
    public final Map<String, String> f7084d;

    public C2684Wa(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), m8808a(eCommerceOrder.getCartItems()), C1848A2.m6817c(eCommerceOrder.getPayload()));
    }

    /* renamed from: a */
    private static List<C2597Ua> m8808a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ECommerceCartItem ua : list) {
            arrayList.add(new C2597Ua(ua));
        }
        return arrayList;
    }

    public String toString() {
        return "OrderWrapper{uuid='" + this.f7081a + '\'' + ", identifier='" + this.f7082b + '\'' + ", cartItems=" + this.f7083c + ", payload=" + this.f7084d + '}';
    }

    public C2684Wa(String str, String str2, List<C2597Ua> list, Map<String, String> map) {
        this.f7081a = str;
        this.f7082b = str2;
        this.f7083c = list;
        this.f7084d = map;
    }
}
