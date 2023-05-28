package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.g */
public final class C1822g {

    /* renamed from: a */
    private final C1827l f4995a;

    /* renamed from: b */
    private final C1821f f4996b;

    /* renamed from: c */
    private final String f4997c;

    public C1822g(C1827l lVar, C1821f fVar, String str) {
        Intrinsics.checkNotNullParameter(lVar, "status");
        this.f4995a = lVar;
        this.f4996b = fVar;
        this.f4997c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1822g(C1827l lVar, C1821f fVar, String str, int i) {
        this(lVar, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : str);
    }

    /* renamed from: a */
    public final Bundle mo15395a() {
        Bundle bundle = new Bundle();
        C1821f fVar = this.f4996b;
        if (fVar != null) {
            bundle.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", fVar.mo15391a());
        }
        bundle.putString("com.yandex.metrica.identifiers.extra.STATUS", this.f4995a.mo15401a());
        bundle.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", this.f4997c);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822g)) {
            return false;
        }
        C1822g gVar = (C1822g) obj;
        return Intrinsics.areEqual((Object) this.f4995a, (Object) gVar.f4995a) && Intrinsics.areEqual((Object) this.f4996b, (Object) gVar.f4996b) && Intrinsics.areEqual((Object) this.f4997c, (Object) gVar.f4997c);
    }

    public int hashCode() {
        C1827l lVar = this.f4995a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C1821f fVar = this.f4996b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str = this.f4997c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AdsIdResult(status=" + this.f4995a + ", adsIdInfo=" + this.f4996b + ", errorExplanation=" + this.f4997c + ")";
    }
}
