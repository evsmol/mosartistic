package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ya */
public class C2739Ya {

    /* renamed from: a */
    public final String f7227a;

    /* renamed from: b */
    public final String f7228b;

    /* renamed from: c */
    public final List<String> f7229c;

    /* renamed from: d */
    public final Map<String, String> f7230d;

    /* renamed from: e */
    public final C2712Xa f7231e;

    /* renamed from: f */
    public final C2712Xa f7232f;

    /* renamed from: g */
    public final List<String> f7233g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2739Ya(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), C1848A2.m6800a(eCommerceProduct.getCategoriesPath()), C1848A2.m6817c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C2712Xa(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new C2712Xa(eCommerceProduct.getOriginalPrice()), C1848A2.m6800a(eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        return "ProductWrapper{sku='" + this.f7227a + '\'' + ", name='" + this.f7228b + '\'' + ", categoriesPath=" + this.f7229c + ", payload=" + this.f7230d + ", actualPrice=" + this.f7231e + ", originalPrice=" + this.f7232f + ", promocodes=" + this.f7233g + '}';
    }

    public C2739Ya(String str, String str2, List<String> list, Map<String, String> map, C2712Xa xa, C2712Xa xa2, List<String> list2) {
        this.f7227a = str;
        this.f7228b = str2;
        this.f7229c = list;
        this.f7230d = map;
        this.f7231e = xa;
        this.f7232f = xa2;
        this.f7233g = list2;
    }
}
