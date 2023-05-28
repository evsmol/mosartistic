package com.yandex.metrica.impl.p082ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.c7 */
public final class C2859c7 {

    /* renamed from: a */
    private final C2987g7 f7556a;

    /* renamed from: b */
    private final String f7557b;

    public C2859c7() {
        this((C2987g7) null, (String) null, 3);
    }

    public C2859c7(C2987g7 g7Var, String str) {
        this.f7556a = g7Var;
        this.f7557b = str;
    }

    /* renamed from: a */
    public final String mo17376a() {
        return this.f7557b;
    }

    /* renamed from: b */
    public final C2987g7 mo17377b() {
        return this.f7556a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2859c7)) {
            return false;
        }
        C2859c7 c7Var = (C2859c7) obj;
        return Intrinsics.areEqual((Object) this.f7556a, (Object) c7Var.f7556a) && Intrinsics.areEqual((Object) this.f7557b, (Object) c7Var.f7557b);
    }

    public int hashCode() {
        C2987g7 g7Var = this.f7556a;
        int i = 0;
        int hashCode = (g7Var != null ? g7Var.hashCode() : 0) * 31;
        String str = this.f7557b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "NativeCrashHandlerDescription(source=" + this.f7556a + ", handlerVersion=" + this.f7557b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2859c7(C2987g7 g7Var, String str, int i) {
        this((i & 1) != 0 ? C2987g7.UNKNOWN : null, (String) null);
    }
}
