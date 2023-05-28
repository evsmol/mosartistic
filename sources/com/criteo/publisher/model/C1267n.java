package com.criteo.publisher.model;

import com.criteo.publisher.p074n0.C1288a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.model.n */
/* compiled from: CacheAdUnit.kt */
public class C1267n {

    /* renamed from: a */
    private final AdSize f3939a;

    /* renamed from: b */
    private final String f3940b;

    /* renamed from: c */
    private final C1288a f3941c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267n)) {
            return false;
        }
        C1267n nVar = (C1267n) obj;
        return Intrinsics.areEqual((Object) mo3554c(), (Object) nVar.mo3554c()) && Intrinsics.areEqual((Object) mo3553b(), (Object) nVar.mo3553b()) && Intrinsics.areEqual((Object) mo3552a(), (Object) nVar.mo3552a());
    }

    public int hashCode() {
        AdSize c = mo3554c();
        int i = 0;
        int hashCode = (c != null ? c.hashCode() : 0) * 31;
        String b = mo3553b();
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C1288a a = mo3552a();
        if (a != null) {
            i = a.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CacheAdUnit(size=" + mo3554c() + ", placementId=" + mo3553b() + ", adUnitType=" + mo3552a() + ")";
    }

    public C1267n(AdSize adSize, String str, C1288a aVar) {
        Intrinsics.checkParameterIsNotNull(adSize, "size");
        Intrinsics.checkParameterIsNotNull(str, "placementId");
        Intrinsics.checkParameterIsNotNull(aVar, "adUnitType");
        this.f3939a = adSize;
        this.f3940b = str;
        this.f3941c = aVar;
    }

    /* renamed from: c */
    public AdSize mo3554c() {
        return this.f3939a;
    }

    /* renamed from: b */
    public String mo3553b() {
        return this.f3940b;
    }

    /* renamed from: a */
    public C1288a mo3552a() {
        return this.f3941c;
    }
}
