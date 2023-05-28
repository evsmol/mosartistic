package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.utils.n */
public final class C4729n {

    /* renamed from: a */
    private Map<String, Integer> f11983a = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f11984b = new HashMap();

    /* renamed from: com.ironsource.mediationsdk.utils.n$a */
    public interface C4730a {
        /* renamed from: j */
        int mo33611j();

        /* renamed from: k */
        String mo33612k();
    }

    public C4729n(List<C4730a> list) {
        for (C4730a next : list) {
            this.f11983a.put(next.mo33612k(), 0);
            this.f11984b.put(next.mo33612k(), Integer.valueOf(next.mo33611j()));
        }
    }

    /* renamed from: a */
    public final void mo34202a(C4730a aVar) {
        synchronized (this) {
            String k = aVar.mo33612k();
            if (this.f11983a.containsKey(k)) {
                this.f11983a.put(k, Integer.valueOf(this.f11983a.get(k).intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34203a() {
        for (String next : this.f11984b.keySet()) {
            if (this.f11983a.get(next).intValue() < this.f11984b.get(next).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34204b(com.ironsource.mediationsdk.utils.C4729n.C4730a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.mo33612k()     // Catch:{ all -> 0x0025 }
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f11983a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f11983a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.mo33611j()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C4729n.mo34204b(com.ironsource.mediationsdk.utils.n$a):boolean");
    }
}
