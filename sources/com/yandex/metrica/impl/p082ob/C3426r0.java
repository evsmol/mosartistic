package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.p082ob.C3462s0;
import com.yandex.metrica.impl.p082ob.C3563v0;

/* renamed from: com.yandex.metrica.impl.ob.r0 */
public class C3426r0<CANDIDATE, CHOSEN extends C3563v0, STORAGE extends C3462s0<CANDIDATE, CHOSEN>> {

    /* renamed from: a */
    private final Context f8959a;

    /* renamed from: b */
    private final ProtobufStateStorage<STORAGE> f8960b;

    /* renamed from: c */
    private final C3490t0<CHOSEN> f8961c;

    /* renamed from: d */
    private final C3718z2<CANDIDATE, CHOSEN> f8962d;

    /* renamed from: e */
    private final C3429r2<CANDIDATE, CHOSEN, STORAGE> f8963e;

    /* renamed from: f */
    private final C2818b2<CHOSEN> f8964f;

    /* renamed from: g */
    private final C2730Y1 f8965g;

    /* renamed from: h */
    private final C2907e0 f8966h;

    /* renamed from: i */
    private STORAGE f8967i;

    public C3426r0(Context context, ProtobufStateStorage<STORAGE> protobufStateStorage, C3490t0<CHOSEN> t0Var, C3718z2<CANDIDATE, CHOSEN> z2Var, C3429r2<CANDIDATE, CHOSEN, STORAGE> r2Var, C2818b2<CHOSEN> b2Var, C2730Y1 y1, C2907e0 e0Var, STORAGE storage, String str) {
        this.f8959a = context;
        this.f8960b = protobufStateStorage;
        this.f8961c = t0Var;
        this.f8962d = z2Var;
        this.f8963e = r2Var;
        this.f8964f = b2Var;
        this.f8965g = y1;
        this.f8966h = e0Var;
        this.f8967i = storage;
    }

    /* renamed from: c */
    private final synchronized CHOSEN m10573c() {
        if (!this.f8965g.mo17075a()) {
            C3563v0 v0Var = (C3563v0) this.f8964f.invoke();
            this.f8965g.mo17076b();
            if (v0Var != null) {
                mo18145b(v0Var);
            }
        }
        C3015h2.m9658a("Choosing distribution data: %s", this.f8967i);
        return (C3563v0) this.f8967i.mo16768b();
    }

    /* renamed from: a */
    public final synchronized STORAGE mo18142a() {
        return this.f8967i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo18145b(CHOSEN r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.yandex.metrica.impl.ob.u0 r0 = r7.mo17550a()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.u0 r1 = com.yandex.metrica.impl.p082ob.C3522u0.UNDEFINED     // Catch:{ all -> 0x0056 }
            r2 = 0
            if (r0 != r1) goto L_0x000c
            monitor-exit(r6)
            return r2
        L_0x000c:
            com.yandex.metrica.impl.ob.z2<CANDIDATE, CHOSEN> r0 = r6.f8962d     // Catch:{ all -> 0x0056 }
            STORAGE r1 = r6.f8967i     // Catch:{ all -> 0x0056 }
            java.util.List r1 = r1.mo16767a()     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r0.invoke(r1, r7)     // Catch:{ all -> 0x0056 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0056 }
            r1 = 1
            if (r0 == 0) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            STORAGE r0 = r6.f8967i     // Catch:{ all -> 0x0056 }
            java.util.List r0 = r0.mo16767a()     // Catch:{ all -> 0x0056 }
        L_0x0029:
            com.yandex.metrica.impl.ob.t0<CHOSEN> r4 = r6.f8961c     // Catch:{ all -> 0x0056 }
            STORAGE r5 = r6.f8967i     // Catch:{ all -> 0x0056 }
            java.lang.Object r5 = r5.mo16768b()     // Catch:{ all -> 0x0056 }
            boolean r4 = r4.mo17303a(r7, r5)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0039
            r2 = 1
            goto L_0x0041
        L_0x0039:
            STORAGE r7 = r6.f8967i     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r7.mo16768b()     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.v0 r7 = (com.yandex.metrica.impl.p082ob.C3563v0) r7     // Catch:{ all -> 0x0056 }
        L_0x0041:
            if (r2 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0054
        L_0x0045:
            com.yandex.metrica.impl.ob.r2<CANDIDATE, CHOSEN, STORAGE> r1 = r6.f8963e     // Catch:{ all -> 0x0056 }
            java.lang.Object r7 = r1.invoke(r7, r0)     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.impl.ob.s0 r7 = (com.yandex.metrica.impl.p082ob.C3462s0) r7     // Catch:{ all -> 0x0056 }
            r6.f8967i = r7     // Catch:{ all -> 0x0056 }
            com.yandex.metrica.core.api.ProtobufStateStorage<STORAGE> r0 = r6.f8960b     // Catch:{ all -> 0x0056 }
            r0.save(r7)     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r6)
            return r2
        L_0x0056:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3426r0.mo18145b(com.yandex.metrica.impl.ob.v0):boolean");
    }

    /* renamed from: a */
    public final CHOSEN mo18143a(CHOSEN chosen) {
        CHOSEN c;
        this.f8966h.mo16978a(this.f8959a);
        synchronized (this) {
            mo18145b(chosen);
            c = m10573c();
        }
        return c;
    }

    /* renamed from: b */
    public final CHOSEN mo18144b() {
        this.f8966h.mo16978a(this.f8959a);
        return m10573c();
    }
}
