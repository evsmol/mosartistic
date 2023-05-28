package com.yandex.metrica.billing_interface;

/* renamed from: com.yandex.metrica.billing_interface.a */
public class C1798a {

    /* renamed from: a */
    public final C1803e f4909a;

    /* renamed from: b */
    public final String f4910b;

    /* renamed from: c */
    public final String f4911c;

    /* renamed from: d */
    public final long f4912d;

    /* renamed from: e */
    public long f4913e;

    public C1798a(C1803e eVar, String str, String str2, long j, long j2) {
        this.f4909a = eVar;
        this.f4910b = str;
        this.f4911c = str2;
        this.f4912d = j;
        this.f4913e = j2;
    }

    public String toString() {
        return "BillingInfo{type=" + this.f4909a + "sku='" + this.f4910b + "'purchaseToken='" + this.f4911c + "'purchaseTime=" + this.f4912d + "sendTime=" + this.f4913e + "}";
    }
}
