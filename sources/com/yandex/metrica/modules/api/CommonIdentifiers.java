package com.yandex.metrica.modules.api;

import kotlin.jvm.internal.Intrinsics;

public final class CommonIdentifiers {

    /* renamed from: a */
    private final String f9612a;

    /* renamed from: b */
    private final String f9613b;

    public CommonIdentifiers(String str, String str2) {
        this.f9612a = str;
        this.f9613b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonIdentifiers)) {
            return false;
        }
        CommonIdentifiers commonIdentifiers = (CommonIdentifiers) obj;
        return Intrinsics.areEqual((Object) this.f9612a, (Object) commonIdentifiers.f9612a) && Intrinsics.areEqual((Object) this.f9613b, (Object) commonIdentifiers.f9613b);
    }

    public int hashCode() {
        String str = this.f9612a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9613b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CommonIdentifiers(uuid=" + this.f9612a + ", device=" + this.f9613b + ")";
    }
}
