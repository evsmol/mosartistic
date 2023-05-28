package com.criteo.publisher.p064f0;

import com.criteo.publisher.p074n0.C1300g;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.f0.v */
/* compiled from: MetricSendingQueueConfiguration.kt */
public class C1126v implements C1084a0<C1112n> {

    /* renamed from: a */
    private final Class<C1112n> f3606a = C1112n.class;

    /* renamed from: b */
    private final C1300g f3607b;

    public C1126v(C1300g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f3607b = gVar;
    }

    /* renamed from: c */
    public int mo3158c() {
        return this.f3607b.mo3639k();
    }

    /* renamed from: d */
    public String mo3159d() {
        String f = this.f3607b.mo3634f();
        Intrinsics.checkExpressionValueIsNotNull(f, "buildConfigWrapper.csmQueueFilename");
        return f;
    }

    /* renamed from: b */
    public Class<C1112n> mo3157b() {
        return this.f3606a;
    }

    /* renamed from: a */
    public int mo3156a() {
        return this.f3607b.mo3636h();
    }
}
