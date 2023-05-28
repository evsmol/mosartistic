package com.appodeal.ads.networking.binders;

import com.appodeal.ads.C9203h0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.appodeal.ads.networking.binders.a */
public final class C9335a {

    /* renamed from: a */
    public final String f23646a;

    /* renamed from: b */
    public final String f23647b;

    public C9335a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "adapterVersion");
        Intrinsics.checkNotNullParameter(str2, "adapterSdkVersion");
        this.f23646a = str;
        this.f23647b = str2;
    }

    /* renamed from: a */
    public final String mo60430a() {
        return this.f23647b;
    }

    /* renamed from: b */
    public final String mo60431b() {
        return this.f23646a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9335a)) {
            return false;
        }
        C9335a aVar = (C9335a) obj;
        return Intrinsics.areEqual((Object) this.f23646a, (Object) aVar.f23646a) && Intrinsics.areEqual((Object) this.f23647b, (Object) aVar.f23647b);
    }

    public final int hashCode() {
        return this.f23647b.hashCode() + (this.f23646a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = C9203h0.m27334a("ModuleInfo(adapterVersion=");
        a.append(this.f23646a);
        a.append(", adapterSdkVersion=");
        a.append(this.f23647b);
        a.append(')');
        return a.toString();
    }
}
