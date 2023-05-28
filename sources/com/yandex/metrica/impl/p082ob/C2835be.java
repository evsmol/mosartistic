package com.yandex.metrica.impl.p082ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.be */
public final class C2835be extends C3490t0<C2923ee> {
    /* renamed from: a */
    public boolean mo17303a(Object obj, Object obj2) {
        C2923ee eeVar = (C2923ee) obj;
        C2923ee eeVar2 = (C2923ee) obj2;
        if (eeVar.f7753c) {
            if (eeVar2.f7753c) {
                int intValue = mo18225a().mo17126a(eeVar.f7755e).intValue();
                Integer a = mo18225a().mo17126a(eeVar2.f7755e);
                Intrinsics.checkNotNullExpressionValue(a, "priorities[oldData.source]");
                if (Intrinsics.compare(intValue, a.intValue()) > 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
