package com.yandex.metrica.impl.p082ob;

import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.C1798a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.f */
public final class C2935f implements C3137l {

    /* renamed from: a */
    private boolean f7779a;

    /* renamed from: b */
    private final Map<String, C1798a> f7780b;

    /* renamed from: c */
    private final C3242n f7781c;

    public C2935f(C3242n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "storage");
        this.f7781c = nVar;
        C2855c3 c3Var = (C2855c3) nVar;
        this.f7779a = c3Var.mo17365b();
        List<C1798a> a = c3Var.mo17363a();
        Intrinsics.checkNotNullExpressionValue(a, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : a) {
            linkedHashMap.put(((C1798a) next).f4910b, next);
        }
        this.f7780b = linkedHashMap;
    }

    /* renamed from: a */
    public void mo17317a(Map<String, ? extends C1798a> map) {
        Intrinsics.checkNotNullParameter(map, "history");
        for (C1798a aVar : map.values()) {
            Map<String, C1798a> map2 = this.f7780b;
            String str = aVar.f4910b;
            Intrinsics.checkNotNullExpressionValue(str, "billingInfo.sku");
            map2.put(str, aVar);
        }
        ((C2855c3) this.f7781c).mo17364a(CollectionsKt.toList(this.f7780b.values()), this.f7779a);
    }

    /* renamed from: b */
    public void mo17319b() {
        if (!this.f7779a) {
            this.f7779a = true;
            ((C2855c3) this.f7781c).mo17364a(CollectionsKt.toList(this.f7780b.values()), this.f7779a);
        }
    }

    /* renamed from: a */
    public C1798a mo17316a(String str) {
        Intrinsics.checkNotNullParameter(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return this.f7780b.get(str);
    }

    /* renamed from: a */
    public boolean mo17318a() {
        return this.f7779a;
    }
}
