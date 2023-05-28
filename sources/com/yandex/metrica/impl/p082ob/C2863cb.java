package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.cb */
public class C2863cb extends ECommerceEvent {

    /* renamed from: b */
    public final C2739Ya f7578b;

    /* renamed from: c */
    public final C2832bb f7579c;

    /* renamed from: d */
    private final C2020Fa<C2863cb> f7580d;

    public C2863cb(C2739Ya ya, C2832bb bbVar, C2020Fa<C2863cb> fa) {
        this.f7578b = ya;
        this.f7579c = bbVar;
        this.f7580d = fa;
    }

    public String getPublicDescription() {
        return "shown product card info";
    }

    public List<C2336Na<C3211mf, C2671Vm>> toProto() {
        return (List) this.f7580d.fromModel(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f7578b + ", screen=" + this.f7579c + ", converter=" + this.f7580d + '}';
    }
}
