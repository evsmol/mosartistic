package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2600Ud;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Td */
public final class C2561Td implements C3718z2<C2600Ud.C2601a, C2923ee> {

    /* renamed from: a */
    private final boolean f6783a;

    public C2561Td(C2600Ud ud) {
        boolean z;
        List<C2600Ud.C2601a> list = ud.f6882b;
        Intrinsics.checkNotNullExpressionValue(list, "stateFromDisk.candidates");
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2600Ud.C2601a) it.next()).f6885c == C3522u0.APP) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        this.f6783a = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.yandex.metrica.impl.p082ob.C2600Ud.C2601a> invoke(java.util.List<? extends com.yandex.metrica.impl.p082ob.C2600Ud.C2601a> r7, com.yandex.metrica.impl.p082ob.C2923ee r8) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.Ud$a r0 = new com.yandex.metrica.impl.ob.Ud$a
            java.lang.String r1 = r8.f7751a
            org.json.JSONObject r2 = r8.f7752b
            com.yandex.metrica.impl.ob.u0 r3 = r8.f7755e
            r0.<init>(r1, r2, r3)
            boolean r1 = r7 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0018:
            java.util.Iterator r1 = r7.iterator()
        L_0x001c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0034
            java.lang.Object r4 = r1.next()
            com.yandex.metrica.impl.ob.Ud$a r4 = (com.yandex.metrica.impl.p082ob.C2600Ud.C2601a) r4
            com.yandex.metrica.impl.ob.u0 r4 = r4.f6885c
            com.yandex.metrica.impl.ob.u0 r5 = r8.f7755e
            if (r4 != r5) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x001c
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0048
            com.yandex.metrica.impl.ob.u0 r8 = r0.f6885c
            com.yandex.metrica.impl.ob.u0 r1 = com.yandex.metrica.impl.p082ob.C3522u0.APP
            if (r8 != r1) goto L_0x0046
            boolean r8 = r6.f6783a
            if (r8 == 0) goto L_0x0046
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r0)
            goto L_0x004c
        L_0x0046:
            r7 = 0
            goto L_0x004c
        L_0x0048:
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r0)
        L_0x004c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2561Td.invoke(java.util.List, com.yandex.metrica.impl.ob.ee):java.util.List");
    }
}
