package com.criteo.publisher.logging;

import com.criteo.publisher.p064f0.C1084a0;
import com.criteo.publisher.p074n0.C1300g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.logging.m */
/* compiled from: RemoteLogSendingQueueConfiguration.kt */
public final class C1208m implements C1084a0<RemoteLogRecords> {

    /* renamed from: a */
    private final Class<RemoteLogRecords> f3778a = RemoteLogRecords.class;

    /* renamed from: b */
    private final C1300g f3779b;

    public C1208m(C1300g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f3779b = gVar;
    }

    /* renamed from: c */
    public int mo3158c() {
        return this.f3779b.mo3641m();
    }

    /* renamed from: d */
    public String mo3159d() {
        String p = this.f3779b.mo3644p();
        Intrinsics.checkExpressionValueIsNotNull(p, "buildConfigWrapper.remoteLogQueueFilename");
        return p;
    }

    /* renamed from: b */
    public Class<RemoteLogRecords> mo3157b() {
        return this.f3778a;
    }

    /* renamed from: a */
    public int mo3156a() {
        return this.f3779b.mo3637i();
    }
}
