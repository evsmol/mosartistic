package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.n4 */
public class C3247n4 implements C2213K, C3116k4 {

    /* renamed from: a */
    private C2011F3 f8412a;

    /* renamed from: b */
    private final ResultReceiver f8413b;

    public C3247n4(Context context, C2011F3 f3, C1941D3 d3) {
        this.f8412a = f3;
        this.f8413b = d3.f5201c;
        f3.mo15771a(this);
    }

    /* renamed from: a */
    public void mo17622a(C2851c0 c0Var, C1941D3 d3) {
        this.f8412a.mo15766a(d3.f5200b);
        this.f8412a.mo15769a(c0Var, this);
    }

    /* renamed from: b */
    public C2011F3 mo17882b() {
        return this.f8412a;
    }

    /* renamed from: a */
    public void mo16053a(C2253L l) {
        ResultReceiver resultReceiver = this.f8413b;
        int i = C2936f0.f7782b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            l.mo16093c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    /* renamed from: a */
    public void mo17621a() {
        this.f8412a.mo15774b(this);
    }
}
