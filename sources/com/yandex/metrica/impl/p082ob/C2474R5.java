package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.p082ob.C2703X5;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.R5 */
public abstract class C2474R5 implements C2592U5<C2679W5> {

    /* renamed from: a */
    private final C2259L3 f6553a;

    /* renamed from: b */
    private final C2794a6 f6554b;

    /* renamed from: c */
    private final C2914e6 f6555c;

    /* renamed from: d */
    private final C2759Z5 f6556d;

    /* renamed from: e */
    private final C2291M0 f6557e;

    /* renamed from: f */
    private final SystemTimeProvider f6558f;

    public C2474R5(C2259L3 l3, C2794a6 a6Var, C2914e6 e6Var, C2759Z5 z5, C2291M0 m0, SystemTimeProvider systemTimeProvider) {
        this.f6553a = l3;
        this.f6554b = a6Var;
        this.f6555c = e6Var;
        this.f6556d = z5;
        this.f6557e = m0;
        this.f6558f = systemTimeProvider;
    }

    /* renamed from: a */
    public C2652V5 mo16548a(Object obj) {
        C2679W5 w5 = (C2679W5) obj;
        if (this.f6555c.mo17495h()) {
            this.f6557e.reportEvent("create session with non-empty storage");
        }
        C2259L3 l3 = this.f6553a;
        C2914e6 e6Var = this.f6555c;
        long a = this.f6554b.mo17153a();
        C2914e6 d = this.f6555c.mo17489d(a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d.mo17491e(timeUnit.toSeconds(w5.f7074a)).mo17482a(w5.f7074a).mo17487c(0).mo17483a(true).mo17486b();
        this.f6553a.mo16131i().mo16155a(a, this.f6556d.mo17090b(), timeUnit.toSeconds(w5.f7075b));
        return new C2652V5(l3, e6Var, mo16549a(), new SystemTimeProvider());
    }

    /* renamed from: b */
    public final C2652V5 mo16550b() {
        if (this.f6555c.mo17495h()) {
            return new C2652V5(this.f6553a, this.f6555c, mo16549a(), this.f6558f);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2703X5 mo16549a() {
        C2703X5.C2705b d = new C2703X5.C2705b(this.f6556d).mo17021a(this.f6555c.mo17496i()).mo17023b(this.f6555c.mo17492e()).mo17022a(this.f6555c.mo17488c()).mo17024c(this.f6555c.mo17493f()).mo17025d(this.f6555c.mo17494g());
        d.f7130a = this.f6555c.mo17490d();
        return new C2703X5(d);
    }
}
