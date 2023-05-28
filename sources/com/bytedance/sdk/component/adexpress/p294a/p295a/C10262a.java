package com.bytedance.sdk.component.adexpress.p294a.p295a;

import com.bytedance.sdk.component.p313d.C10564m;

/* renamed from: com.bytedance.sdk.component.adexpress.a.a.a */
/* compiled from: AdapterInstance */
public class C10262a {

    /* renamed from: e */
    private static volatile C10262a f25343e;

    /* renamed from: a */
    private volatile C10263b f25344a;

    /* renamed from: b */
    private volatile C10265d f25345b;

    /* renamed from: c */
    private volatile C10264c f25346c;

    /* renamed from: d */
    private volatile C10564m f25347d;

    private C10262a() {
    }

    /* renamed from: a */
    public static C10262a m29464a() {
        if (f25343e == null) {
            synchronized (C10262a.class) {
                if (f25343e == null) {
                    f25343e = new C10262a();
                }
            }
        }
        return f25343e;
    }

    /* renamed from: a */
    public void mo63090a(C10263b bVar) {
        this.f25344a = bVar;
    }

    /* renamed from: b */
    public C10263b mo63094b() {
        return this.f25344a;
    }

    /* renamed from: a */
    public void mo63091a(C10264c cVar) {
        this.f25346c = cVar;
    }

    /* renamed from: c */
    public C10264c mo63095c() {
        return this.f25346c;
    }

    /* renamed from: a */
    public void mo63092a(C10265d dVar) {
        this.f25345b = dVar;
    }

    /* renamed from: d */
    public C10265d mo63096d() {
        return this.f25345b;
    }

    /* renamed from: a */
    public void mo63093a(C10564m mVar) {
        this.f25347d = mVar;
    }

    /* renamed from: e */
    public C10564m mo63097e() {
        return this.f25347d;
    }
}
