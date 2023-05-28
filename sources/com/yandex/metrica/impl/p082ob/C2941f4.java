package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.f4 */
public class C2941f4 {

    /* renamed from: a */
    private final C2861c9 f7796a;

    /* renamed from: b */
    private final TimeProvider f7797b;

    /* renamed from: c */
    private final C3641x2 f7798c;

    /* renamed from: d */
    private C3512ti f7799d;

    /* renamed from: e */
    private long f7800e;

    public C2941f4(Context context, C2108I3 i3) {
        this(new C2861c9(C3093ja.m9805a(context).mo17739b(i3)), new SystemTimeProvider(), new C3641x2());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r7 = r6.f7799d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17573a(java.lang.Boolean r7) {
        /*
            r6 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.ti r7 = r6.f7799d
            if (r7 == 0) goto L_0x001c
            com.yandex.metrica.impl.ob.x2 r0 = r6.f7798c
            long r1 = r6.f7800e
            long r3 = r7.f9164a
            java.lang.String r5 = "should report diagnostic"
            boolean r7 = r0.mo18389a((long) r1, (long) r3, (java.lang.String) r5)
            if (r7 == 0) goto L_0x001c
            r7 = 1
            goto L_0x001d
        L_0x001c:
            r7 = 0
        L_0x001d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C2941f4.mo17573a(java.lang.Boolean):boolean");
    }

    public C2941f4(C2861c9 c9Var, TimeProvider timeProvider, C3641x2 x2Var) {
        this.f7796a = c9Var;
        this.f7797b = timeProvider;
        this.f7798c = x2Var;
        this.f7800e = c9Var.mo17400k();
    }

    /* renamed from: a */
    public void mo17571a() {
        long currentTimeMillis = this.f7797b.currentTimeMillis();
        this.f7800e = currentTimeMillis;
        this.f7796a.mo17389d(currentTimeMillis).mo17448d();
    }

    /* renamed from: a */
    public void mo17572a(C3512ti tiVar) {
        this.f7799d = tiVar;
    }
}
