package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ta */
public class C2558Ta extends ECommerceEvent {

    /* renamed from: b */
    public final int f6778b;

    /* renamed from: c */
    public final C2597Ua f6779c;

    /* renamed from: d */
    private final C2020Fa<C2558Ta> f6780d;

    public C2558Ta(int i, C2597Ua ua, C2020Fa<C2558Ta> fa) {
        this.f6778b = i;
        this.f6779c = ua;
        this.f6780d = fa;
    }

    public String getPublicDescription() {
        int i = this.f6778b;
        if (i != 4) {
            return i != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    public List<C2336Na<C3211mf, C2671Vm>> toProto() {
        return (List) this.f6780d.fromModel(this);
    }

    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.f6778b + ", cartItem=" + this.f6779c + ", converter=" + this.f6780d + '}';
    }
}
