package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eb */
public class C2919eb extends ECommerceEvent {

    /* renamed from: b */
    public final C2832bb f7738b;

    /* renamed from: c */
    private final C2020Fa<C2919eb> f7739c;

    public C2919eb(C2832bb bbVar, C2020Fa<C2919eb> fa) {
        this.f7738b = bbVar;
        this.f7739c = fa;
    }

    public String getPublicDescription() {
        return "shown screen info";
    }

    public List<C2336Na<C3211mf, C2671Vm>> toProto() {
        return (List) this.f7739c.fromModel(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f7738b + ", converter=" + this.f7739c + '}';
    }
}
