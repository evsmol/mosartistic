package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.P */
public class C2410P {

    /* renamed from: j */
    private static volatile C2410P f6381j;

    /* renamed from: a */
    private final C2726Xl f6382a;

    /* renamed from: b */
    private final C3138l0 f6383b;

    /* renamed from: c */
    private final C2166Im f6384c;

    /* renamed from: d */
    private final C3717z1 f6385d;

    /* renamed from: e */
    private final C3364q f6386e;

    /* renamed from: f */
    private final C3302o2 f6387f;

    /* renamed from: g */
    private final C2786a0 f6388g;

    /* renamed from: h */
    private final C3330p f6389h;

    /* renamed from: i */
    private final C3735zg f6390i;

    private C2410P() {
        this(new C2726Xl(), new C3364q(), new C2166Im());
    }

    /* renamed from: g */
    public static C2410P m8089g() {
        if (f6381j == null) {
            synchronized (C2410P.class) {
                if (f6381j == null) {
                    f6381j = new C2410P(new C2726Xl(), new C3364q(), new C2166Im());
                }
            }
        }
        return f6381j;
    }

    /* renamed from: a */
    public C3330p mo16428a() {
        return this.f6389h;
    }

    /* renamed from: b */
    public C3364q mo16429b() {
        return this.f6386e;
    }

    /* renamed from: c */
    public ICommonExecutor mo16430c() {
        return this.f6384c.mo15960a();
    }

    /* renamed from: d */
    public C2166Im mo16431d() {
        return this.f6384c;
    }

    /* renamed from: e */
    public C2786a0 mo16432e() {
        return this.f6388g;
    }

    /* renamed from: f */
    public C3138l0 mo16433f() {
        return this.f6383b;
    }

    /* renamed from: h */
    public C2726Xl mo16434h() {
        return this.f6382a;
    }

    /* renamed from: i */
    public C3717z1 mo16435i() {
        return this.f6385d;
    }

    /* renamed from: j */
    public C2848bm mo16436j() {
        return this.f6382a;
    }

    /* renamed from: k */
    public C3735zg mo16437k() {
        return this.f6390i;
    }

    /* renamed from: l */
    public C3302o2 mo16438l() {
        return this.f6387f;
    }

    private C2410P(C2726Xl xl, C3364q qVar, C2166Im im) {
        this(xl, qVar, im, new C3330p(qVar, im.mo15960a()));
    }

    private C2410P(C2726Xl xl, C3364q qVar, C2166Im im, C3330p pVar) {
        this(xl, new C3138l0(), im, pVar, new C3717z1(xl), qVar, new C3302o2(qVar, im.mo15960a(), pVar), new C2786a0(qVar), new C3735zg());
    }

    C2410P(C2726Xl xl, C3138l0 l0Var, C2166Im im, C3330p pVar, C3717z1 z1Var, C3364q qVar, C3302o2 o2Var, C2786a0 a0Var, C3735zg zgVar) {
        this.f6382a = xl;
        this.f6383b = l0Var;
        this.f6384c = im;
        this.f6389h = pVar;
        this.f6385d = z1Var;
        this.f6386e = qVar;
        this.f6387f = o2Var;
        this.f6388g = a0Var;
        this.f6390i = zgVar;
    }
}
