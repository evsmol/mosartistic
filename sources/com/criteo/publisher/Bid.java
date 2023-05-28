package com.criteo.publisher;

import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.model.p073b0.C1243n;
import com.criteo.publisher.p074n0.C1288a;

public class Bid {

    /* renamed from: a */
    private final double f3367a;

    /* renamed from: b */
    private final C1288a f3368b;

    /* renamed from: c */
    private final C1146i f3369c;

    /* renamed from: d */
    private C1272s f3370d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C1272s m4840a(C1272s sVar) {
        return sVar;
    }

    Bid(C1288a aVar, C1146i iVar, C1272s sVar) {
        this.f3367a = sVar.mo3570b().doubleValue();
        this.f3368b = aVar;
        this.f3370d = sVar;
        this.f3369c = iVar;
    }

    public double getPrice() {
        return this.f3367a;
    }

    /* renamed from: c */
    public C1288a mo2941c() {
        return this.f3368b;
    }

    /* renamed from: b */
    public C1272s mo2940b() {
        return (C1272s) m4841a($$Lambda$Bid$p_9GkxYzDd6nc_h1epMI6NKODQ.INSTANCE);
    }

    /* renamed from: a */
    public String mo2939a(C1288a aVar) {
        if (!aVar.equals(this.f3368b)) {
            return null;
        }
        return (String) m4841a($$Lambda$PQ3TBaarq9RzlkaMhZw53YWVsg.INSTANCE);
    }

    /* renamed from: a */
    public C1243n mo2938a() {
        return (C1243n) m4841a($$Lambda$0uZbirHMqJRHY7pTWcqX5jLvOw.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized <T> T m4841a(kotlin.jvm.functions.Function1<com.criteo.publisher.model.C1272s, T> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.criteo.publisher.model.s r0 = r3.f3370d     // Catch:{ all -> 0x001b }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.criteo.publisher.i r2 = r3.f3369c     // Catch:{ all -> 0x001b }
            boolean r0 = r0.mo3569a((com.criteo.publisher.C1146i) r2)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000f
            goto L_0x0019
        L_0x000f:
            com.criteo.publisher.model.s r0 = r3.f3370d     // Catch:{ all -> 0x001b }
            java.lang.Object r4 = r4.invoke(r0)     // Catch:{ all -> 0x001b }
            r3.f3370d = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r3)
            return r4
        L_0x0019:
            monitor-exit(r3)
            return r1
        L_0x001b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.Bid.m4841a(kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
