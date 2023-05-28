package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C1943D4;
import com.yandex.metrica.networktasks.api.ConfigProvider;

/* renamed from: com.yandex.metrica.impl.ob.z4 */
public class C3720z4 implements C2416P3, C2447Q3, ConfigProvider<C1943D4> {

    /* renamed from: a */
    private final Context f9569a;

    /* renamed from: b */
    private final C2108I3 f9570b;

    /* renamed from: c */
    private final C3333p0 f9571c;

    /* renamed from: d */
    private C1852A4 f9572d;

    /* renamed from: e */
    private C2941f4 f9573e;

    /* renamed from: com.yandex.metrica.impl.ob.z4$a */
    static class C3721a {
        C3721a() {
        }

        /* renamed from: a */
        public C1852A4 mo18448a(Context context, C2108I3 i3, C3356pi piVar, C1943D4.C1944a aVar) {
            return new C1852A4(new C1943D4.C1945b(context, i3.mo15879b()), piVar, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z4$b */
    static class C3722b {

        /* renamed from: a */
        private final C2938f1 f9574a;

        C3722b() {
            this(C2007F0.m7154g().mo15745h());
        }

        /* renamed from: a */
        public C3333p0<C3720z4> mo18449a(C3720z4 z4Var, C3592vi viVar, C1976E4 e4, C2827b8 b8Var) {
            C3333p0<C3720z4> p0Var = new C3333p0<>(z4Var, viVar.mo18339a(), e4, b8Var);
            this.f9574a.mo17563a(p0Var);
            return p0Var;
        }

        C3722b(C2938f1 f1Var) {
            this.f9574a = f1Var;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3720z4(android.content.Context r13, com.yandex.metrica.impl.p082ob.C2108I3 r14, com.yandex.metrica.impl.p082ob.C1941D3.C1942a r15, com.yandex.metrica.impl.p082ob.C3356pi r16, com.yandex.metrica.impl.p082ob.C3592vi r17, com.yandex.metrica.CounterConfiguration.C10685b r18) {
        /*
            r12 = this;
            r2 = r14
            com.yandex.metrica.impl.ob.E4 r7 = new com.yandex.metrica.impl.ob.E4
            r7.<init>()
            com.yandex.metrica.impl.ob.z4$b r8 = new com.yandex.metrica.impl.ob.z4$b
            r8.<init>()
            com.yandex.metrica.impl.ob.z4$a r9 = new com.yandex.metrica.impl.ob.z4$a
            r9.<init>()
            com.yandex.metrica.impl.ob.f4 r10 = new com.yandex.metrica.impl.ob.f4
            r1 = r13
            r10.<init>(r13, r14)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.e8 r0 = r0.mo15760w()
            com.yandex.metrica.impl.ob.b8 r11 = r0.mo17500a(r14)
            r0 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3720z4.<init>(android.content.Context, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3$a, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.vi, com.yandex.metrica.CounterConfiguration$b):void");
    }

    /* renamed from: a */
    public void mo16119a(C1941D3.C1942a aVar) {
        this.f9572d.mo15827a(aVar);
    }

    /* renamed from: a */
    public void mo15770a(C3004gi giVar, C3356pi piVar) {
    }

    /* renamed from: b */
    public Context mo18447b() {
        return this.f9569a;
    }

    public Object getConfig() {
        return (C1943D4) this.f9572d.mo15828b();
    }

    /* renamed from: a */
    public void mo16120a(C2851c0 c0Var) {
        this.f9571c.mo17925a(c0Var);
    }

    /* renamed from: a */
    public void mo18446a() {
        if (this.f9573e.mo17573a(((C1943D4) this.f9572d.mo15828b()).mo15612D())) {
            this.f9571c.mo17925a(C3716z0.m11103a());
            this.f9573e.mo17571a();
        }
    }

    /* renamed from: a */
    public synchronized void mo15772a(C3356pi piVar) {
        this.f9572d.mo15826a(piVar);
        this.f9573e.mo17572a(piVar.mo17962P());
    }

    public C3720z4(Context context, C2108I3 i3, C1941D3.C1942a aVar, C3356pi piVar, C3592vi viVar, CounterConfiguration.C10685b bVar, C1976E4 e4, C3722b bVar2, C3721a aVar2, C2941f4 f4Var, C2827b8 b8Var) {
        this.f9569a = context;
        this.f9570b = i3;
        this.f9573e = f4Var;
        this.f9571c = bVar2.mo18449a(this, viVar, e4, b8Var);
        synchronized (this) {
            this.f9573e.mo17572a(piVar.mo17962P());
            this.f9572d = aVar2.mo18448a(context, i3, piVar, new C1943D4.C1944a(aVar));
        }
    }
}
