package com.yandex.metrica.impl.p082ob;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.P4 */
public class C2417P4 extends C2298M4 {
    public C2417P4(C2011F3 f3) {
        super(f3);
    }

    /* renamed from: a */
    public boolean mo16261a(C2851c0 c0Var, C3247n4 n4Var) {
        Bundle l = c0Var.mo17343l();
        mo16260a().mo15765a(l != null ? (ResultReceiver) l.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
