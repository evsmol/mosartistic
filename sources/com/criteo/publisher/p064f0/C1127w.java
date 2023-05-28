package com.criteo.publisher.p064f0;

import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p074n0.C1300g;
import java.util.concurrent.Executor;

/* renamed from: com.criteo.publisher.f0.w */
/* compiled from: MetricSendingQueueConsumer */
public class C1127w {

    /* renamed from: a */
    private final C1124u f3608a;

    /* renamed from: b */
    private final C1166g f3609b;

    /* renamed from: c */
    private final C1300g f3610c;

    /* renamed from: d */
    private final C1276t f3611d;

    /* renamed from: e */
    private final Executor f3612e;

    public C1127w(C1124u uVar, C1166g gVar, C1300g gVar2, C1276t tVar, Executor executor) {
        this.f3608a = uVar;
        this.f3609b = gVar;
        this.f3610c = gVar2;
        this.f3611d = tVar;
        this.f3612e = executor;
    }

    /* renamed from: a */
    public void mo3221a() {
        if (this.f3611d.mo3598g()) {
            this.f3612e.execute(new C1130y(this.f3608a, this.f3609b, this.f3610c));
        }
    }
}
