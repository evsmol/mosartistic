package com.criteo.publisher.logging;

import com.criteo.publisher.C1330x;
import com.criteo.publisher.p064f0.C1102k;
import com.criteo.publisher.p069k0.C1166g;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1300g;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.n */
/* compiled from: RemoteLogSendingQueueConsumer.kt */
public class C1209n {

    /* renamed from: a */
    private final C1102k<RemoteLogRecords> f3780a;

    /* renamed from: b */
    private final C1166g f3781b;

    /* renamed from: c */
    private final C1300g f3782c;

    /* renamed from: d */
    private final C1289b f3783d;

    /* renamed from: e */
    private final Executor f3784e;

    public C1209n(C1102k<RemoteLogRecords> kVar, C1166g gVar, C1300g gVar2, C1289b bVar, Executor executor) {
        Intrinsics.checkParameterIsNotNull(kVar, "sendingQueue");
        Intrinsics.checkParameterIsNotNull(gVar, "api");
        Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
        Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        this.f3780a = kVar;
        this.f3781b = gVar;
        this.f3782c = gVar2;
        this.f3783d = bVar;
        this.f3784e = executor;
    }

    /* renamed from: a */
    public void mo3354a() {
        this.f3784e.execute(new C1210a(this.f3780a, this.f3781b, this.f3782c, this.f3783d));
    }

    /* renamed from: com.criteo.publisher.logging.n$a */
    /* compiled from: RemoteLogSendingQueueConsumer.kt */
    public static final class C1210a extends C1330x {

        /* renamed from: c */
        private final C1102k<RemoteLogRecords> f3785c;

        /* renamed from: d */
        private final C1166g f3786d;

        /* renamed from: e */
        private final C1300g f3787e;

        /* renamed from: f */
        private final C1289b f3788f;

        public C1210a(C1102k<RemoteLogRecords> kVar, C1166g gVar, C1300g gVar2, C1289b bVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "sendingQueue");
            Intrinsics.checkParameterIsNotNull(gVar, "api");
            Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
            Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
            this.f3785c = kVar;
            this.f3786d = gVar;
            this.f3787e = gVar2;
            this.f3788f = bVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            List<RemoteLogRecords> a = this.f3785c.mo3194a(this.f3787e.mo3643o());
            if (!a.isEmpty()) {
                try {
                    m5440a(a);
                    this.f3786d.mo3269a(a);
                } catch (Throwable th) {
                    for (RemoteLogRecords a2 : a) {
                        this.f3785c.mo3195a(a2);
                    }
                    throw th;
                }
            }
        }

        /* renamed from: a */
        private final void m5440a(List<? extends RemoteLogRecords> list) {
            String b = this.f3788f.mo3613b();
            if (b != null) {
                for (RemoteLogRecords remoteLogRecords : list) {
                    if (remoteLogRecords.mo3303a().mo3311b() == null) {
                        remoteLogRecords.mo3303a().mo3310a(b);
                    }
                }
            }
        }
    }
}
