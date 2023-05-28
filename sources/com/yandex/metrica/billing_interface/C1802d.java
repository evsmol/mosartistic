package com.yandex.metrica.billing_interface;

/* renamed from: com.yandex.metrica.billing_interface.d */
public class C1802d {

    /* renamed from: a */
    public final C1803e f4927a;

    /* renamed from: b */
    public final String f4928b;

    /* renamed from: c */
    public final int f4929c;

    /* renamed from: d */
    public final long f4930d;

    /* renamed from: e */
    public final String f4931e;

    /* renamed from: f */
    public final long f4932f;

    /* renamed from: g */
    public final C1800c f4933g;

    /* renamed from: h */
    public final int f4934h;

    /* renamed from: i */
    public final C1800c f4935i;

    /* renamed from: j */
    public final String f4936j;

    /* renamed from: k */
    public final String f4937k;

    /* renamed from: l */
    public final long f4938l;

    /* renamed from: m */
    public final boolean f4939m;

    /* renamed from: n */
    public final String f4940n;

    public C1802d(C1803e eVar, String str, int i, long j, String str2, long j2, C1800c cVar, int i2, C1800c cVar2, String str3, String str4, long j3, boolean z, String str5) {
        this.f4927a = eVar;
        this.f4928b = str;
        this.f4929c = i;
        this.f4930d = j;
        this.f4931e = str2;
        this.f4932f = j2;
        this.f4933g = cVar;
        this.f4934h = i2;
        this.f4935i = cVar2;
        this.f4936j = str3;
        this.f4937k = str4;
        this.f4938l = j3;
        this.f4939m = z;
        this.f4940n = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1802d.class != obj.getClass()) {
            return false;
        }
        C1802d dVar = (C1802d) obj;
        if (this.f4929c != dVar.f4929c || this.f4930d != dVar.f4930d || this.f4932f != dVar.f4932f || this.f4934h != dVar.f4934h || this.f4938l != dVar.f4938l || this.f4939m != dVar.f4939m || this.f4927a != dVar.f4927a || !this.f4928b.equals(dVar.f4928b) || !this.f4931e.equals(dVar.f4931e)) {
            return false;
        }
        C1800c cVar = this.f4933g;
        if (cVar == null ? dVar.f4933g != null : !cVar.equals(dVar.f4933g)) {
            return false;
        }
        C1800c cVar2 = this.f4935i;
        if (cVar2 == null ? dVar.f4935i != null : !cVar2.equals(dVar.f4935i)) {
            return false;
        }
        if (this.f4936j.equals(dVar.f4936j) && this.f4937k.equals(dVar.f4937k)) {
            return this.f4940n.equals(dVar.f4940n);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4930d;
        long j2 = this.f4932f;
        int hashCode = ((((((((((this.f4927a.hashCode() * 31) + this.f4928b.hashCode()) * 31) + this.f4929c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f4931e.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C1800c cVar = this.f4933g;
        int i = 0;
        int hashCode2 = (((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f4934h) * 31;
        C1800c cVar2 = this.f4935i;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        long j3 = this.f4938l;
        return ((((((((((hashCode2 + i) * 31) + this.f4936j.hashCode()) * 31) + this.f4937k.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f4939m ? 1 : 0)) * 31) + this.f4940n.hashCode();
    }

    public String toString() {
        return "ProductInfo{type=" + this.f4927a + ", sku='" + this.f4928b + '\'' + ", quantity=" + this.f4929c + ", priceMicros=" + this.f4930d + ", priceCurrency='" + this.f4931e + '\'' + ", introductoryPriceMicros=" + this.f4932f + ", introductoryPricePeriod=" + this.f4933g + ", introductoryPriceCycles=" + this.f4934h + ", subscriptionPeriod=" + this.f4935i + ", signature='" + this.f4936j + '\'' + ", purchaseToken='" + this.f4937k + '\'' + ", purchaseTime=" + this.f4938l + ", autoRenewing=" + this.f4939m + ", purchaseOriginalJson='" + this.f4940n + '\'' + '}';
    }
}
