package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p4 */
public class C3339p4 {

    /* renamed from: a */
    private final HashMap<String, C2701X3> f8552a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C2011F3> f8553b = new HashMap<>();

    /* renamed from: c */
    private final Context f8554c;

    public C3339p4(Context context) {
        this.f8554c = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized C2701X3 mo17938a(C2108I3 i3) {
        return this.f8552a.get(i3.toString());
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.N3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.X3>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p082ob.C2701X3 mo17939b(com.yandex.metrica.impl.p082ob.C2108I3 r2, com.yandex.metrica.impl.p082ob.C1941D3 r3, com.yandex.metrica.impl.p082ob.C2328N3<com.yandex.metrica.impl.p082ob.C2701X3> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.X3> r0 = r1.f8552a     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.R3 r2 = r1.m10287a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.X3 r2 = (com.yandex.metrica.impl.p082ob.C2701X3) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3339p4.mo17939b(com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3, com.yandex.metrica.impl.ob.N3):com.yandex.metrica.impl.ob.X3");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.yandex.metrica.impl.ob.N3, com.yandex.metrica.impl.ob.N3<com.yandex.metrica.impl.ob.F3>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.yandex.metrica.impl.p082ob.C2011F3 mo17937a(com.yandex.metrica.impl.p082ob.C2108I3 r2, com.yandex.metrica.impl.p082ob.C1941D3 r3, com.yandex.metrica.impl.p082ob.C2328N3<com.yandex.metrica.impl.p082ob.C2011F3> r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, com.yandex.metrica.impl.ob.F3> r0 = r1.f8553b     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.R3 r2 = r1.m10287a(r2, r3, r4, r0)     // Catch:{ all -> 0x000b }
            com.yandex.metrica.impl.ob.F3 r2 = (com.yandex.metrica.impl.p082ob.C2011F3) r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)
            return r2
        L_0x000b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p082ob.C3339p4.mo17937a(com.yandex.metrica.impl.ob.I3, com.yandex.metrica.impl.ob.D3, com.yandex.metrica.impl.ob.N3):com.yandex.metrica.impl.ob.F3");
    }

    /* renamed from: a */
    private <T extends C2472R3> T m10287a(C2108I3 i3, C1941D3 d3, C2328N3<T> n3, Map<String, T> map) {
        T t = (C2472R3) map.get(i3.toString());
        if (t == null) {
            T a = n3.mo15814a(this.f8554c, i3, d3);
            map.put(i3.toString(), a);
            return a;
        }
        t.mo15767a(d3);
        return t;
    }
}
