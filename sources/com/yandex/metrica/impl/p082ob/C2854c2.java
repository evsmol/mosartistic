package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.C10705b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.c2 */
public final class C2854c2 {

    /* renamed from: a */
    private final int f7543a;

    /* renamed from: b */
    private final int f7544b;

    /* renamed from: c */
    private final int f7545c;

    /* renamed from: d */
    private final float f7546d;

    /* renamed from: e */
    private final C10705b f7547e;

    public C2854c2(int i, int i2, int i3, float f, C10705b bVar) {
        this.f7543a = i;
        this.f7544b = i2;
        this.f7545c = i3;
        this.f7546d = f;
        this.f7547e = bVar;
    }

    /* renamed from: a */
    public final C10705b mo17355a() {
        return this.f7547e;
    }

    /* renamed from: b */
    public final int mo17356b() {
        return this.f7545c;
    }

    /* renamed from: c */
    public final int mo17357c() {
        return this.f7544b;
    }

    /* renamed from: d */
    public final float mo17358d() {
        return this.f7546d;
    }

    /* renamed from: e */
    public final int mo17359e() {
        return this.f7543a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2854c2)) {
            return false;
        }
        C2854c2 c2Var = (C2854c2) obj;
        return this.f7543a == c2Var.f7543a && this.f7544b == c2Var.f7544b && this.f7545c == c2Var.f7545c && Float.compare(this.f7546d, c2Var.f7546d) == 0 && Intrinsics.areEqual((Object) this.f7547e, (Object) c2Var.f7547e);
    }

    public int hashCode() {
        int floatToIntBits = ((((((this.f7543a * 31) + this.f7544b) * 31) + this.f7545c) * 31) + Float.floatToIntBits(this.f7546d)) * 31;
        C10705b bVar = this.f7547e;
        return floatToIntBits + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f7543a + ", height=" + this.f7544b + ", dpi=" + this.f7545c + ", scaleFactor=" + this.f7546d + ", deviceType=" + this.f7547e + ")";
    }
}
