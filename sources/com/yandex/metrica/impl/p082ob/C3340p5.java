package com.yandex.metrica.impl.p082ob;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.p5 */
public final class C3340p5 extends C2702X4 {
    public C3340p5(C2259L3 l3) {
        super(l3);
        C2108I3 e = l3.mo16127e();
        Intrinsics.checkNotNullExpressionValue(e, "component.componentId");
        String a = e.mo15878a();
        if (a != null) {
            C1848A2.m6797a(a);
        }
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        Map<String, byte[]> i = c0Var.mo17340i();
        Intrinsics.checkNotNullExpressionValue(i, "reportData.extras");
        for (Map.Entry next : i.entrySet()) {
            C2259L3 a = mo17012a();
            Intrinsics.checkNotNullExpressionValue(a, "component");
            C3020h6 u = a.mo16142u();
            Object key = next.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            u.mo17654a((String) key, (byte[]) next.getValue());
        }
        return true;
    }
}
