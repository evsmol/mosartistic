package com.yandex.metrica.impl.p082ob;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.d7 */
public final class C2886d7 {

    /* renamed from: a */
    private final byte[] f7630a;

    /* renamed from: b */
    private final C2859c7 f7631b;

    public C2886d7(byte[] bArr, C2859c7 c7Var) {
        this.f7630a = bArr;
        this.f7631b = c7Var;
    }

    /* renamed from: a */
    public final byte[] mo17431a() {
        return this.f7630a;
    }

    /* renamed from: b */
    public final C2859c7 mo17432b() {
        return this.f7631b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2886d7)) {
            return false;
        }
        C2886d7 d7Var = (C2886d7) obj;
        return Intrinsics.areEqual((Object) this.f7630a, (Object) d7Var.f7630a) && Intrinsics.areEqual((Object) this.f7631b, (Object) d7Var.f7631b);
    }

    public int hashCode() {
        byte[] bArr = this.f7630a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        C2859c7 c7Var = this.f7631b;
        if (c7Var != null) {
            i = c7Var.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashModel(data=" + Arrays.toString(this.f7630a) + ", handlerDescription=" + this.f7631b + ")";
    }
}
