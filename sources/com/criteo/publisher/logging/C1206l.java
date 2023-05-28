package com.criteo.publisher.logging;

import com.criteo.publisher.p064f0.C1102k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.l */
/* compiled from: RemoteLogSendingQueue.kt */
public interface C1206l extends C1102k<RemoteLogRecords> {

    /* renamed from: com.criteo.publisher.logging.l$a */
    /* compiled from: RemoteLogSendingQueue.kt */
    public static class C1207a implements C1206l {

        /* renamed from: a */
        private final C1102k<RemoteLogRecords> f3777a;

        public C1207a(C1102k<RemoteLogRecords> kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "delegate");
            this.f3777a = kVar;
        }

        /* renamed from: a */
        public boolean mo3195a(RemoteLogRecords remoteLogRecords) {
            Intrinsics.checkParameterIsNotNull(remoteLogRecords, "element");
            return this.f3777a.mo3195a(remoteLogRecords);
        }

        /* renamed from: a */
        public List<RemoteLogRecords> mo3194a(int i) {
            return this.f3777a.mo3194a(i);
        }

        /* renamed from: a */
        public int mo3192a() {
            return this.f3777a.mo3192a();
        }
    }
}
