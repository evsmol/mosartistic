package com.criteo.publisher.p064f0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.f0.u */
/* compiled from: MetricSendingQueue.kt */
public interface C1124u extends C1102k<C1112n> {

    /* renamed from: com.criteo.publisher.f0.u$a */
    /* compiled from: MetricSendingQueue.kt */
    public static final class C1125a implements C1124u {

        /* renamed from: a */
        private final C1102k<C1112n> f3605a;

        public C1125a(C1102k<C1112n> kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "delegate");
            this.f3605a = kVar;
        }

        /* renamed from: a */
        public boolean mo3195a(C1112n nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "element");
            return this.f3605a.mo3195a(nVar);
        }

        /* renamed from: a */
        public List<C1112n> mo3194a(int i) {
            return this.f3605a.mo3194a(i);
        }

        /* renamed from: a */
        public int mo3192a() {
            return this.f3605a.mo3192a();
        }
    }
}
