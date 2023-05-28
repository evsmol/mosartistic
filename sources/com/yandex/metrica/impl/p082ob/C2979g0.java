package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.g0 */
class C2979g0 implements C2810ak {

    /* renamed from: a */
    final /* synthetic */ C3045i0 f7880a;

    C2979g0(C3045i0 i0Var) {
        this.f7880a = i0Var;
    }

    /* renamed from: a */
    public void mo15406a(C2778Zj zj) {
        C3555uj b = zj.mo17124b();
        if (b != null) {
            this.f7880a.f8028g.put("cellular_connection_type", b.mo18287m());
        }
        this.f7880a.f8028g.put("call_state", Integer.valueOf(zj.mo17123a()));
    }
}
