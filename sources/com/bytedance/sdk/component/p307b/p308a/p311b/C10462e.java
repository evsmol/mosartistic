package com.bytedance.sdk.component.p307b.p308a.p311b;

/* renamed from: com.bytedance.sdk.component.b.a.b.e */
/* compiled from: Segment */
final class C10462e {

    /* renamed from: a */
    final byte[] f26076a;

    /* renamed from: b */
    int f26077b;

    /* renamed from: c */
    int f26078c;

    /* renamed from: d */
    boolean f26079d;

    /* renamed from: e */
    boolean f26080e;

    /* renamed from: f */
    C10462e f26081f;

    /* renamed from: g */
    C10462e f26082g;

    C10462e() {
        this.f26076a = new byte[8192];
        this.f26080e = true;
        this.f26079d = false;
    }

    C10462e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f26076a = bArr;
        this.f26077b = i;
        this.f26078c = i2;
        this.f26079d = z;
        this.f26080e = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C10462e mo63942a() {
        this.f26079d = true;
        return new C10462e(this.f26076a, this.f26077b, this.f26078c, true, false);
    }

    /* renamed from: b */
    public final C10462e mo63944b() {
        C10462e eVar = this.f26081f;
        if (eVar == this) {
            eVar = null;
        }
        C10462e eVar2 = this.f26082g;
        if (eVar2 != null) {
            eVar2.f26081f = this.f26081f;
        }
        C10462e eVar3 = this.f26081f;
        if (eVar3 != null) {
            eVar3.f26082g = this.f26082g;
        }
        this.f26081f = null;
        this.f26082g = null;
        return eVar;
    }

    /* renamed from: a */
    public final C10462e mo63943a(C10462e eVar) {
        eVar.f26082g = this;
        eVar.f26081f = this.f26081f;
        this.f26081f.f26082g = eVar;
        this.f26081f = eVar;
        return eVar;
    }
}
