package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p082ob.C1941D3;
import com.yandex.metrica.impl.p082ob.C3480sg;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.U3 */
public class C2588U3 extends C2259L3 implements C3033hg, C3062ig {

    /* renamed from: A */
    private final C3480sg f6866A;

    /* renamed from: B */
    private final C3510tg f6867B;

    /* renamed from: C */
    private final C3464s2 f6868C;

    /* renamed from: D */
    private final C2915e7<File> f6869D;

    /* renamed from: E */
    private final C2910e3 f6870E;

    /* renamed from: com.yandex.metrica.impl.ob.U3$a */
    class C2589a implements C3240mm<File> {
        C2589a() {
        }

        /* renamed from: b */
        public void mo15447b(Object obj) {
            C2588U3.m8591a(C2588U3.this, (File) obj);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.U3$b */
    public class C2590b implements C3480sg.C3481a {
        public C2590b() {
        }

        /* renamed from: a */
        public void mo16760a(C2895dg dgVar) {
            if (dgVar != null) {
                C2588U3.this.mo16120a(new C2851c0().mo15967a(dgVar.mo17458a()).mo17320a(C2788a1.EVENT_TYPE_SEND_REFERRER.mo17139b()));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2588U3(android.content.Context r21, com.yandex.metrica.impl.p082ob.C3356pi r22, com.yandex.metrica.impl.p082ob.C2108I3 r23, com.yandex.metrica.impl.p082ob.C1941D3.C1942a r24, com.yandex.metrica.impl.p082ob.C3480sg r25, com.yandex.metrica.impl.p082ob.C3464s2 r26, com.yandex.metrica.impl.p082ob.C3592vi r27) {
        /*
            r20 = this;
            com.yandex.metrica.impl.ob.B3 r5 = new com.yandex.metrica.impl.ob.B3
            r5.<init>()
            com.yandex.metrica.impl.ob.x2 r6 = new com.yandex.metrica.impl.ob.x2
            r6.<init>()
            com.yandex.metrica.impl.ob.B0 r7 = new com.yandex.metrica.impl.ob.B0
            r7.<init>()
            com.yandex.metrica.impl.ob.V3 r19 = new com.yandex.metrica.impl.ob.V3
            com.yandex.metrica.impl.ob.T3 r14 = new com.yandex.metrica.impl.ob.T3
            r4 = r26
            r14.<init>(r4)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r0 = r0.mo15754q()
            com.yandex.metrica.core.api.executors.ICommonExecutor r15 = r0.mo16491d()
            java.lang.String r0 = r23.mo15879b()
            r1 = r21
            int r16 = com.yandex.metrica.impl.p082ob.C1848A2.m6812b(r1, r0)
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.Pm r17 = r0.mo15754q()
            com.yandex.metrica.impl.ob.F0 r0 = com.yandex.metrica.impl.p082ob.C2007F0.m7154g()
            com.yandex.metrica.impl.ob.f1 r18 = r0.mo15745h()
            r8 = r19
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r20
            r2 = r23
            r3 = r22
            r4 = r24
            r9 = r25
            r10 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2588U3.<init>(android.content.Context, com.yandex.metrica.impl.ob.pi, com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3$a, com.yandex.metrica.impl.ob.sg, com.yandex.metrica.impl.ob.s2, com.yandex.metrica.impl.ob.vi):void");
    }

    /* renamed from: a */
    private void m8590a(Context context, C1877B0 b0) {
        File a = b0.mo15519a(context, "YandexMetricaNativeCrashes");
        if (a != null) {
            new C2735Y6(a, new C2589a()).mo17077a();
        }
    }

    /* renamed from: G */
    public void mo16118G() {
        this.f6866A.mo18213a(this.f6867B);
    }

    /* renamed from: s */
    public CounterConfiguration.C10685b mo15581s() {
        return CounterConfiguration.C10685b.MAIN;
    }

    /* renamed from: a */
    public void mo16759a() {
        mo16145x().mo17228c(true);
    }

    /* renamed from: a */
    public synchronized void mo16119a(C1941D3.C1942a aVar) {
        super.mo16119a(aVar);
        this.f6868C.mo18194a(aVar.f5213l);
    }

    /* renamed from: a */
    public void mo15772a(C3356pi piVar) {
        super.mo15772a(piVar);
        this.f6870E.mo17479a(piVar);
    }

    /* renamed from: a */
    static void m8591a(C2588U3 u3, File file) {
        u3.f6869D.mo17498a(file);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2588U3(Context context, C2108I3 i3, C3356pi piVar, C1941D3.C1942a aVar, C1880B3 b3, C3641x2 x2Var, C1877B0 b0, C2650V3 v3, C3480sg sgVar, C3464s2 s2Var) {
        super(context, i3, b3, x2Var, v3);
        C2650V3 v32 = v3;
        this.f6866A = sgVar;
        C2109I4 k = mo16133k();
        k.mo15884a(C2788a1.EVENT_TYPE_REGULAR, new C1914C5(k.mo15885b()));
        this.f6867B = v32.mo16950c(this);
        this.f6868C = s2Var;
        C3250n7 a = v32.mo16948a(v3.mo16951f(), v32.mo16949b(this), mo16128f());
        this.f6869D = a;
        a.mo17497a();
        Context context2 = context;
        C1877B0 b02 = b0;
        m8590a(context, b0);
        C2910e3 a2 = v32.mo16947a(this);
        this.f6870E = a2;
        C3356pi piVar2 = piVar;
        a2.mo17480a(piVar, aVar.f5218q);
    }
}
