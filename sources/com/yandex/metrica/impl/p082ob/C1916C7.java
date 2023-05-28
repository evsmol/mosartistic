package com.yandex.metrica.impl.p082ob;

import android.os.Process;

/* renamed from: com.yandex.metrica.impl.ob.C7 */
class C1916C7 {

    /* renamed from: a */
    public final String f5161a;

    /* renamed from: b */
    public final boolean f5162b;

    /* renamed from: c */
    public final boolean f5163c;

    /* renamed from: d */
    public final C3343p7 f5164d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    C1916C7(String str, boolean z, C3343p7 p7Var) {
        this(str, z, p7Var, C1848A2.m6808a(23) && Process.is64Bit());
    }

    C1916C7(String str, boolean z, C3343p7 p7Var, boolean z2) {
        this.f5161a = str;
        this.f5163c = z;
        this.f5164d = p7Var;
        this.f5162b = z2;
    }
}
