package com.appnext.base.operations;

import android.os.Bundle;
import com.appnext.base.C8829a;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8857j;

/* renamed from: com.appnext.base.operations.c */
public abstract class C8864c extends C8861a {
    /* renamed from: aD */
    public final void mo58781aD() {
    }

    public C8864c(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* renamed from: aC */
    public final void mo58780aC() {
        boolean z = false;
        try {
            Object a = C8857j.m26697a(C8850d.f22435fo, C8850d.C8851a.Boolean);
            if (a != null && (a instanceof Boolean)) {
                z = !((Boolean) a).booleanValue();
            }
            if (mo58782aE()) {
                if (!z) {
                    mo58785av();
                    return;
                }
            }
            mo58777a(new C8829a(C8829a.C8830a.NoPermission$1d8b5b4a));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public C8850d.C8851a mo58784aG() {
        return C8850d.C8851a.String;
    }
}
