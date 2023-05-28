package com.yandex.metrica.impl.p082ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eh */
public class C2926eh {

    /* renamed from: a */
    public final List<C3034hh> f7761a;

    /* renamed from: b */
    public final String f7762b;

    /* renamed from: c */
    public final long f7763c;

    /* renamed from: d */
    public final boolean f7764d;

    /* renamed from: e */
    public final boolean f7765e;

    public C2926eh(List<C3034hh> list, String str, long j, boolean z, boolean z2) {
        this.f7761a = C1848A2.m6816c(list);
        this.f7762b = str;
        this.f7763c = j;
        this.f7764d = z;
        this.f7765e = z2;
    }

    public String toString() {
        return "SdkFingerprintingState{sdkItemList=" + this.f7761a + ", etag='" + this.f7762b + '\'' + ", lastAttemptTime=" + this.f7763c + ", hasFirstCollectionOccurred=" + this.f7764d + ", shouldRetry=" + this.f7765e + '}';
    }
}
