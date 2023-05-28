package com.criteo.publisher.logging;

import android.os.Looper;
import com.appodeal.ads.modules.common.internal.Constants;
import com.criteo.publisher.C1330x;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.p064f0.C1102k;
import com.criteo.publisher.p070l0.C1170a;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.j */
/* compiled from: RemoteHandler.kt */
public class C1203j implements C1192d {

    /* renamed from: a */
    private final C1205k f3762a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1102k<RemoteLogRecords> f3763b;

    /* renamed from: c */
    private final C1276t f3764c;

    /* renamed from: d */
    private final Executor f3765d;

    /* renamed from: e */
    private final C1170a f3766e;

    public C1203j(C1205k kVar, C1102k<RemoteLogRecords> kVar2, C1276t tVar, Executor executor, C1170a aVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "remoteLogRecordsFactory");
        Intrinsics.checkParameterIsNotNull(kVar2, "sendingQueue");
        Intrinsics.checkParameterIsNotNull(tVar, Constants.CONFIG);
        Intrinsics.checkParameterIsNotNull(executor, "executor");
        Intrinsics.checkParameterIsNotNull(aVar, "consentData");
        this.f3762a = kVar;
        this.f3763b = kVar2;
        this.f3764c = tVar;
        this.f3765d = executor;
        this.f3766e = aVar;
    }

    /* renamed from: a */
    public void mo3328a(String str, C1193e eVar) {
        RemoteLogRecords.RemoteLogLevel a;
        RemoteLogRecords a2;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        if (this.f3766e.mo3277b() && (a = RemoteLogRecords.RemoteLogLevel.Companion.mo3308a(eVar.mo3330a())) != null) {
            RemoteLogRecords.RemoteLogLevel f = this.f3764c.mo3597f();
            Intrinsics.checkExpressionValueIsNotNull(f, "config.remoteLogLevel");
            if (!(a.compareTo(f) >= 0)) {
                a = null;
            }
            if (a != null && (a2 = this.f3762a.mo3349a(eVar)) != null) {
                if (mo3348a()) {
                    this.f3765d.execute(new C1204a(a2, this));
                } else {
                    this.f3763b.mo3195a(a2);
                }
            }
        }
    }

    /* renamed from: com.criteo.publisher.logging.j$a */
    /* compiled from: RemoteHandler.kt */
    public static final class C1204a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ RemoteLogRecords f3767c;

        /* renamed from: d */
        final /* synthetic */ C1203j f3768d;

        C1204a(RemoteLogRecords remoteLogRecords, C1203j jVar) {
            this.f3767c = remoteLogRecords;
            this.f3768d = jVar;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3768d.f3763b.mo3195a(this.f3767c);
        }
    }

    /* renamed from: a */
    public boolean mo3348a() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        return Intrinsics.areEqual((Object) currentThread, (Object) mainLooper != null ? mainLooper.getThread() : null);
    }
}
