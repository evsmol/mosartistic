package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.db */
public class C2890db extends ECommerceEvent {

    /* renamed from: b */
    public final C2739Ya f7635b;

    /* renamed from: c */
    public final C2800ab f7636c;

    /* renamed from: d */
    private final C2020Fa<C2890db> f7637d;

    public C2890db(C2739Ya ya, C2800ab abVar, C2020Fa<C2890db> fa) {
        this.f7635b = ya;
        this.f7636c = abVar;
        this.f7637d = fa;
    }

    public String getPublicDescription() {
        return "shown product details info";
    }

    public List<C2336Na<C3211mf, C2671Vm>> toProto() {
        return (List) this.f7637d.fromModel(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f7635b + ", referrer=" + this.f7636c + ", converter=" + this.f7637d + '}';
    }
}
