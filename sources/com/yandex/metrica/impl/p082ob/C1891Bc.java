package com.yandex.metrica.impl.p082ob;

import android.location.Location;
import com.yandex.metrica.impl.p082ob.C2071H0;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bc */
public class C1891Bc implements C2170J0 {

    /* renamed from: a */
    private C2425Pc f5106a;

    /* renamed from: b */
    private C1921Cc f5107b;

    /* renamed from: c */
    private final List<C1985Ec<?>> f5108c;

    /* renamed from: d */
    private final C3348pc<C2713Xb> f5109d;

    /* renamed from: e */
    private final C3348pc<C2713Xb> f5110e;

    /* renamed from: f */
    private final C3348pc<C2713Xb> f5111f;

    /* renamed from: g */
    private final C3348pc<C2864cc> f5112g;

    /* renamed from: h */
    private final C2071H0 f5113h;

    /* renamed from: i */
    private boolean f5114i;

    public C1891Bc(C1921Cc cc, C2425Pc pc) {
        this(cc, pc, C2007F0.m7154g().mo15756s());
    }

    /* renamed from: a */
    public void mo15554a() {
        if (this.f5114i) {
            for (C1985Ec<?> c : this.f5108c) {
                c.mo15681c();
            }
        }
    }

    /* renamed from: b */
    public Location mo15557b() {
        if (this.f5114i) {
            return this.f5106a.mo16453a();
        }
        return null;
    }

    /* renamed from: c */
    public void mo15558c() {
        if (this.f5114i) {
            this.f5113h.mo15839c();
            for (C1985Ec<?> a : this.f5108c) {
                a.mo15678a();
            }
        }
    }

    /* renamed from: d */
    public void mo15559d() {
        this.f5113h.mo15840d();
        for (C1985Ec<?> b : this.f5108c) {
            b.mo15680b();
        }
    }

    private C1891Bc(C1921Cc cc, C2425Pc pc, C2917e9 e9Var) {
        this(cc, pc, new C2962fc(cc, e9Var), new C3124kc(cc, e9Var), new C2271Lc(cc), new C2920ec(cc, e9Var, pc), new C2071H0.C2074c());
    }

    C1891Bc(C1921Cc cc, C2425Pc pc, C2424Pb pb, C2424Pb pb2, C2271Lc lc, C2920ec ecVar, C2071H0.C2074c cVar) {
        C2713Xb xb;
        C2713Xb xb2;
        C2713Xb xb3;
        this.f5107b = cc;
        C3208mc mcVar = cc.f5171c;
        C2864cc ccVar = null;
        if (mcVar != null) {
            this.f5114i = mcVar.f8313g;
            C2713Xb xb4 = mcVar.f8320n;
            xb3 = mcVar.f8321o;
            xb2 = mcVar.f8322p;
            C2713Xb xb5 = xb4;
            ccVar = mcVar.f8323q;
            xb = xb5;
        } else {
            xb = null;
            xb3 = null;
            xb2 = null;
        }
        this.f5106a = pc;
        C1985Ec<C2713Xb> a = pb.mo16448a(pc, xb3);
        C1985Ec<C2713Xb> a2 = pb2.mo16448a(pc, xb);
        C1985Ec<C2713Xb> a3 = lc.mo16167a(pc, xb2);
        C1985Ec<C2864cc> a4 = ecVar.mo17545a(ccVar);
        this.f5108c = Arrays.asList(new C1985Ec[]{a, a2, a3, a4});
        this.f5109d = a2;
        this.f5110e = a;
        this.f5111f = a3;
        this.f5112g = a4;
        C2071H0 a5 = cVar.mo15843a(this.f5107b.f5169a.f6632b, this, this.f5106a.mo16457b());
        this.f5113h = a5;
        this.f5106a.mo16457b().mo15801a(a5);
    }

    /* renamed from: a */
    public void mo15556a(C3356pi piVar) {
        this.f5106a.mo16456a(piVar);
    }

    /* renamed from: a */
    public void mo15555a(C3208mc mcVar) {
        this.f5114i = mcVar != null && mcVar.f8313g;
        this.f5106a.mo16455a(mcVar);
        C2864cc ccVar = null;
        ((C1985Ec) this.f5109d).mo15679a(mcVar == null ? null : mcVar.f8320n);
        ((C1985Ec) this.f5110e).mo15679a(mcVar == null ? null : mcVar.f8321o);
        ((C1985Ec) this.f5111f).mo15679a(mcVar == null ? null : mcVar.f8322p);
        C3348pc<C2864cc> pcVar = this.f5112g;
        if (mcVar != null) {
            ccVar = mcVar.f8323q;
        }
        ((C1985Ec) pcVar).mo15679a(ccVar);
        mo15554a();
    }
}
