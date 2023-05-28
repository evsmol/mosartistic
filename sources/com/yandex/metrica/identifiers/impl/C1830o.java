package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.appodeal.ads.AppodealNetworks;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.o */
public final class C1830o implements C1824i {

    /* renamed from: a */
    private final C1820e f5004a;

    public C1830o() {
        this(new C1820e(C1831p.f5005a, C1829n.f5003a, AppodealNetworks.YANDEX));
    }

    public C1830o(C1820e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "connectionController");
        this.f5004a = eVar;
    }

    /* renamed from: b */
    private final C1822g m6758b(Context context) {
        C1818c cVar = (C1818c) this.f5004a.mo15389a(context);
        String b = cVar.mo15379b();
        Intrinsics.checkNotNullExpressionValue(b, "service.advId");
        return new C1822g(C1827l.OK, new C1821f(AppodealNetworks.YANDEX, b, Boolean.valueOf(cVar.mo15380d())), (String) null, 4);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x003b=Splitter:B:15:0x003b, B:21:0x004d=Splitter:B:21:0x004d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.metrica.identifiers.impl.C1822g mo15400a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 2
            r1 = 0
            com.yandex.metrica.identifiers.impl.g r0 = r7.m6758b(r8)     // Catch:{ m -> 0x0043, j -> 0x0031, all -> 0x0011 }
            com.yandex.metrica.identifiers.impl.e r1 = r7.f5004a     // Catch:{ all -> 0x0059 }
            r1.mo15390b(r8)     // Catch:{ all -> 0x0059 }
            goto L_0x0059
        L_0x0011:
            r2 = move-exception
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.C1827l.UNKNOWN     // Catch:{ all -> 0x005a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            r5.<init>()     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "exception while fetching yandex adv_id: "
            r5.append(r6)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            r5.append(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
        L_0x002e:
            com.yandex.metrica.identifiers.impl.e r0 = r7.f5004a     // Catch:{ all -> 0x0058 }
            goto L_0x0055
        L_0x0031:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            java.lang.String r2 = "unknown exception while binding yandex adv_id service"
        L_0x003b:
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.C1827l.IDENTIFIER_PROVIDER_UNAVAILABLE     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
            goto L_0x002e
        L_0x0043:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            java.lang.String r2 = "No yandex adv_id service"
        L_0x004d:
            com.yandex.metrica.identifiers.impl.g r3 = new com.yandex.metrica.identifiers.impl.g     // Catch:{ all -> 0x005a }
            com.yandex.metrica.identifiers.impl.l r4 = com.yandex.metrica.identifiers.impl.C1827l.IDENTIFIER_PROVIDER_UNAVAILABLE     // Catch:{ all -> 0x005a }
            r3.<init>(r4, r1, r2, r0)     // Catch:{ all -> 0x005a }
            goto L_0x002e
        L_0x0055:
            r0.mo15390b(r8)     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = r3
        L_0x0059:
            return r0
        L_0x005a:
            r0 = move-exception
            com.yandex.metrica.identifiers.impl.e r1 = r7.f5004a     // Catch:{ all -> 0x0060 }
            r1.mo15390b(r8)     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.C1830o.mo15400a(android.content.Context):com.yandex.metrica.identifiers.impl.g");
    }
}
