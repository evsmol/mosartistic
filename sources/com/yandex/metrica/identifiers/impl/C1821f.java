package com.yandex.metrica.identifiers.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.f */
public final class C1821f {

    /* renamed from: a */
    private final String f4992a;

    /* renamed from: b */
    private final String f4993b;

    /* renamed from: c */
    private final Boolean f4994c;

    public C1821f(String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, IronSourceConstants.EVENTS_PROVIDER);
        this.f4992a = str;
        this.f4993b = str2;
        this.f4994c = bool;
    }

    /* renamed from: a */
    public final Bundle mo15391a() {
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f4992a);
        bundle.putString("com.yandex.metrica.identifiers.extra.ID", this.f4993b);
        Boolean bool = this.f4994c;
        if (bool != null) {
            bundle.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", bool.booleanValue());
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1821f)) {
            return false;
        }
        C1821f fVar = (C1821f) obj;
        return Intrinsics.areEqual((Object) this.f4992a, (Object) fVar.f4992a) && Intrinsics.areEqual((Object) this.f4993b, (Object) fVar.f4993b) && Intrinsics.areEqual((Object) this.f4994c, (Object) fVar.f4994c);
    }

    public int hashCode() {
        String str = this.f4992a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4993b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f4994c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "AdsIdInfo(provider=" + this.f4992a + ", advId=" + this.f4993b + ", limitedAdTracking=" + this.f4994c + ")";
    }
}
