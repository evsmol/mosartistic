package com.criteo.publisher.logging;

import com.criteo.publisher.C1321s;
import com.criteo.publisher.p065g0.C1134a;
import java.util.List;

/* renamed from: com.criteo.publisher.logging.h */
/* compiled from: LoggerFactory */
public class C1197h {

    /* renamed from: a */
    private final List<C1134a<C1192d>> f3754a;

    public C1197h(List<C1134a<C1192d>> list) {
        this.f3754a = list;
    }

    /* renamed from: b */
    public static C1195g m5407b(Class<?> cls) {
        return C1321s.m5824c().mo3672J0().mo3342a(cls);
    }

    /* renamed from: a */
    public C1195g mo3342a(Class<?> cls) {
        return new C1195g(cls, this.f3754a);
    }
}
