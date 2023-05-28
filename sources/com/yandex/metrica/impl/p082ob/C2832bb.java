package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bb */
public class C2832bb {

    /* renamed from: a */
    public final String f7466a;

    /* renamed from: b */
    public final List<String> f7467b;

    /* renamed from: c */
    public final String f7468c;

    /* renamed from: d */
    public final Map<String, String> f7469d;

    public C2832bb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), C1848A2.m6800a(eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), C1848A2.m6817c(eCommerceScreen.getPayload()));
    }

    public String toString() {
        return "ScreenWrapper{name='" + this.f7466a + '\'' + ", categoriesPath=" + this.f7467b + ", searchQuery='" + this.f7468c + '\'' + ", payload=" + this.f7469d + '}';
    }

    public C2832bb(String str, List<String> list, String str2, Map<String, String> map) {
        this.f7466a = str;
        this.f7467b = list;
        this.f7468c = str2;
        this.f7469d = map;
    }
}
