package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;

/* renamed from: com.yandex.metrica.impl.ob.wc */
public class C3617wc {

    /* renamed from: a */
    private final IHandlerExecutor f9387a = C2007F0.m7154g().mo15754q().mo16488b();

    /* renamed from: b */
    private final C2594U7 f9388b;

    /* renamed from: c */
    private final C2555T7 f9389c;

    /* renamed from: d */
    private final C1987Ed f9390d;

    /* renamed from: e */
    private final C3697yd f9391e;

    public C3617wc(Context context) {
        this.f9388b = C3093ja.m9805a(context).mo17744f();
        this.f9389c = C3093ja.m9805a(context).mo17743e();
        C1987Ed ed = new C1987Ed();
        this.f9390d = ed;
        this.f9391e = new C3697yd(ed.mo15683a());
    }

    /* renamed from: a */
    public IHandlerExecutor mo18363a() {
        return this.f9387a;
    }

    /* renamed from: b */
    public C2555T7 mo18364b() {
        return this.f9389c;
    }

    /* renamed from: c */
    public C2594U7 mo18365c() {
        return this.f9388b;
    }

    /* renamed from: d */
    public C3697yd mo18366d() {
        return this.f9391e;
    }

    /* renamed from: e */
    public C1987Ed mo18367e() {
        return this.f9390d;
    }
}
