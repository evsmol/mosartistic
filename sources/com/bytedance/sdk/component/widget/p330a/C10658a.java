package com.bytedance.sdk.component.widget.p330a;

/* renamed from: com.bytedance.sdk.component.widget.a.a */
/* compiled from: BaseAdapterInstance */
public class C10658a {

    /* renamed from: b */
    private static volatile C10658a f26567b;

    /* renamed from: a */
    private volatile C10659b f26568a;

    private C10658a() {
    }

    /* renamed from: a */
    public static C10658a m31358a() {
        if (f26567b == null) {
            synchronized (C10658a.class) {
                if (f26567b == null) {
                    f26567b = new C10658a();
                }
            }
        }
        return f26567b;
    }

    /* renamed from: a */
    public void mo64367a(C10659b bVar) {
        this.f26568a = bVar;
    }

    /* renamed from: b */
    public C10659b mo64368b() {
        return this.f26568a;
    }
}
