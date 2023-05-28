package com.criteo.publisher.p074n0;

import com.criteo.publisher.C1321s;
import com.criteo.publisher.C1328v;

/* renamed from: com.criteo.publisher.n0.o */
/* compiled from: PreconditionsUtil */
public class C1311o {
    /* renamed from: a */
    public static void m5779a(Throwable th) {
        C1321s.m5824c().mo3672J0().mo3342a(C1311o.class).mo3337a(C1328v.m5921a(th));
        if (C1321s.m5824c().mo3716m0().mo3646r()) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static boolean m5780a(Object obj) {
        if (obj != null) {
            return true;
        }
        m5779a((Throwable) new NullPointerException("Expected non null value, but null occurs."));
        return false;
    }
}
