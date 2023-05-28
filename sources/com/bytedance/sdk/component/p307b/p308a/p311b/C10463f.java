package com.bytedance.sdk.component.p307b.p308a.p311b;

/* renamed from: com.bytedance.sdk.component.b.a.b.f */
/* compiled from: SegmentPool */
final class C10463f {

    /* renamed from: a */
    static C10462e f26083a;

    /* renamed from: b */
    static long f26084b;

    private C10463f() {
    }

    /* renamed from: a */
    static C10462e m30507a() {
        synchronized (C10463f.class) {
            if (f26083a == null) {
                return new C10462e();
            }
            C10462e eVar = f26083a;
            f26083a = eVar.f26081f;
            eVar.f26081f = null;
            f26084b -= 8192;
            return eVar;
        }
    }

    /* renamed from: a */
    static void m30508a(C10462e eVar) {
        if (eVar.f26081f != null || eVar.f26082g != null) {
            throw new IllegalArgumentException();
        } else if (!eVar.f26079d) {
            synchronized (C10463f.class) {
                if (f26084b + 8192 <= 65536) {
                    f26084b += 8192;
                    eVar.f26081f = f26083a;
                    eVar.f26078c = 0;
                    eVar.f26077b = 0;
                    f26083a = eVar;
                }
            }
        }
    }
}
