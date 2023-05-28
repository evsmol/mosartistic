package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.yandex.metrica.impl.ob.Kb */
public class C2239Kb implements C3579vb {

    /* renamed from: a */
    private final String f5970a;

    /* renamed from: b */
    private final C2184Jb f5971b;

    public C2239Kb(String str) {
        this(str, new C2184Jb());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.yandex.metrica.impl.ob.tb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.yandex.metrica.impl.p082ob.C3539ub m7635b(android.content.Context r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "com.yandex.metrica.identifiers.AdsIdentifiersProvider"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "requestIdentifiers"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r7.f5970a
            java.lang.String r6 = "com.yandex.metrica.identifiers.extra.PROVIDER"
            r2.putString(r6, r3)
            com.yandex.metrica.impl.ob.Jb r3 = r7.f5971b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            r1[r5] = r2
            r8 = 0
            java.lang.Object r0 = r0.invoke(r8, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r3.getClass()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.TRACKING_INFO"
            android.os.Bundle r1 = r0.getBundle(r1)
            if (r1 == 0) goto L_0x0090
            java.util.Map<java.lang.String, com.yandex.metrica.impl.ob.tb$a> r2 = com.yandex.metrica.impl.p082ob.C2116Ib.f5555a
            java.lang.String r3 = r1.getString(r6)
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L_0x006c
            com.yandex.metrica.impl.ob.tb$a r2 = (com.yandex.metrica.impl.p082ob.C3504tb.C3505a) r2
            java.lang.String r3 = "com.yandex.metrica.identifiers.extra.ID"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "com.yandex.metrica.identifiers.extra.LIMITED"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L_0x0065
            boolean r8 = r1.getBoolean(r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L_0x0065:
            com.yandex.metrica.impl.ob.tb r1 = new com.yandex.metrica.impl.ob.tb
            r1.<init>(r2, r3, r8)
            r8 = r1
            goto L_0x0090
        L_0x006c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Provider "
            r8.append(r0)
            java.lang.String r0 = r1.getString(r6)
            r8.append(r0)
            java.lang.String r0 = " is invalid"
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x0090:
            java.lang.String r1 = "com.yandex.metrica.identifiers.extra.STATUS"
            java.lang.String r1 = r0.getString(r1)
            com.yandex.metrica.impl.ob.U0 r1 = com.yandex.metrica.impl.p082ob.C2577U0.m8555a(r1)
            java.lang.String r2 = "com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"
            java.lang.String r0 = r0.getString(r2)
            com.yandex.metrica.impl.ob.ub r2 = new com.yandex.metrica.impl.ob.ub
            r2.<init>(r8, r1, r0)
            r8 = r2
        L_0x00a6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2239Kb.m7635b(android.content.Context):com.yandex.metrica.impl.ob.ub");
    }

    /* renamed from: a */
    public C3539ub mo16075a(Context context) {
        return mo16076a(context, new C2021Fb());
    }

    C2239Kb(String str, C2184Jb jb) {
        this.f5970a = str;
        this.f5971b = jb;
    }

    /* renamed from: a */
    public C3539ub mo16076a(Context context, C2057Gb gb) {
        C3539ub ubVar;
        gb.mo15821c();
        C3539ub ubVar2 = null;
        while (gb.mo15820b()) {
            try {
                return m7635b(context);
            } catch (InvocationTargetException e) {
                String message = e.getTargetException() != null ? e.getTargetException().getMessage() : null;
                ubVar = new C3539ub((C3504tb) null, C2577U0.UNKNOWN, "exception while fetching " + this.f5970a + " adv_id: " + message);
                ubVar2 = ubVar;
                try {
                    Thread.sleep((long) gb.mo15819a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                ubVar = new C3539ub((C3504tb) null, C2577U0.UNKNOWN, "exception while fetching " + this.f5970a + " adv_id: " + th.getMessage());
                ubVar2 = ubVar;
                Thread.sleep((long) gb.mo15819a());
            }
        }
        return ubVar2 == null ? new C3539ub() : ubVar2;
    }
}
