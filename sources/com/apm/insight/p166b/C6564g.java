package com.apm.insight.p166b;

import android.content.Context;

/* renamed from: com.apm.insight.b.g */
public class C6564g {

    /* renamed from: a */
    private static volatile C6564g f14046a;

    /* renamed from: c */
    private static C6565h f14047c;

    /* renamed from: b */
    private final C6555b f14048b;

    private C6564g(Context context) {
        this.f14048b = new C6555b(context);
        C6565h hVar = new C6565h(0);
        f14047c = hVar;
        hVar.mo52002b();
    }

    /* renamed from: a */
    public static C6564g m16054a(Context context) {
        if (f14046a == null) {
            synchronized (C6564g.class) {
                if (f14046a == null) {
                    f14046a = new C6564g(context);
                }
            }
        }
        return f14046a;
    }

    /* renamed from: b */
    public static C6565h m16055b() {
        return f14047c;
    }

    /* renamed from: a */
    public C6555b mo51997a() {
        return this.f14048b;
    }

    /* renamed from: c */
    public void mo51998c() {
        this.f14048b.mo51981a();
    }

    /* renamed from: d */
    public void mo51999d() {
        this.f14048b.mo51983b();
    }
}
