package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* renamed from: com.yandex.metrica.impl.ob.ab */
public class C2800ab {

    /* renamed from: a */
    public final String f7386a;

    /* renamed from: b */
    public final String f7387b;

    /* renamed from: c */
    public final C2832bb f7388c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2800ab(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C2832bb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.f7386a + '\'' + ", identifier='" + this.f7387b + '\'' + ", screen=" + this.f7388c + '}';
    }

    public C2800ab(String str, String str2, C2832bb bbVar) {
        this.f7386a = str;
        this.f7387b = str2;
        this.f7388c = bbVar;
    }
}
