package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.billing.p079v4.library.C1796c;
import com.yandex.metrica.billing.p333v3.library.C10716c;
import com.yandex.metrica.billing_interface.C1799b;
import com.yandex.metrica.billing_interface.C1805g;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.d3 */
public final class C2882d3 {
    /* renamed from: a */
    public final C3108k mo17430a(Context context, Executor executor, Executor executor2, C1799b bVar, C3242n nVar, C3170m mVar) {
        C3242n nVar2 = nVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return new C10716c(context, executor, executor2, new C2850c(nVar2), new C2877d(), mVar);
        } else if (ordinal != 1) {
            return new C2983g3();
        } else {
            return new C1796c(context, executor, executor2, nVar, mVar, new C2935f(nVar2), new C3012h((C1805g) null, 1));
        }
    }
}
