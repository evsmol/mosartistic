package com.yandex.metrica.impl.p082ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Uh */
public final class C2637Uh {

    /* renamed from: a */
    private final String f6961a;

    /* renamed from: b */
    private final int f6962b;

    /* renamed from: c */
    private final int f6963c;

    /* renamed from: d */
    private final boolean f6964d;

    /* renamed from: e */
    private final boolean f6965e;

    public C2637Uh(String str, int i, int i2, boolean z, boolean z2) {
        this.f6961a = str;
        this.f6962b = i;
        this.f6963c = i2;
        this.f6964d = z;
        this.f6965e = z2;
    }

    /* renamed from: a */
    public final int mo16842a() {
        return this.f6963c;
    }

    /* renamed from: b */
    public final int mo16843b() {
        return this.f6962b;
    }

    /* renamed from: c */
    public final String mo16844c() {
        return this.f6961a;
    }

    /* renamed from: d */
    public final boolean mo16845d() {
        return this.f6964d;
    }

    /* renamed from: e */
    public final boolean mo16846e() {
        return this.f6965e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2637Uh)) {
            return false;
        }
        C2637Uh uh = (C2637Uh) obj;
        return Intrinsics.areEqual((Object) this.f6961a, (Object) uh.f6961a) && this.f6962b == uh.f6962b && this.f6963c == uh.f6963c && this.f6964d == uh.f6964d && this.f6965e == uh.f6965e;
    }

    public int hashCode() {
        String str = this.f6961a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f6962b) * 31) + this.f6963c) * 31;
        boolean z = this.f6964d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f6965e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "EgressConfig(url=" + this.f6961a + ", repeatedDelay=" + this.f6962b + ", randomDelayWindow=" + this.f6963c + ", isBackgroundAllowed=" + this.f6964d + ", isDiagnosticsEnabled=" + this.f6965e + ")";
    }
}
