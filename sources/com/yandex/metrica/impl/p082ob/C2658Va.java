package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Va */
public class C2658Va extends ECommerceEvent {

    /* renamed from: b */
    public final int f7048b;

    /* renamed from: c */
    public final C2684Wa f7049c;

    /* renamed from: d */
    private final C2020Fa<C2658Va> f7050d;

    public C2658Va(int i, C2684Wa wa, C2020Fa<C2658Va> fa) {
        this.f7048b = i;
        this.f7049c = wa;
        this.f7050d = fa;
    }

    public String getPublicDescription() {
        return "order info";
    }

    public List<C2336Na<C3211mf, C2671Vm>> toProto() {
        return (List) this.f7050d.fromModel(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.f7048b + ", order=" + this.f7049c + ", converter=" + this.f7050d + '}';
    }
}
