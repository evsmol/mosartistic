package com.criteo.publisher;

import com.criteo.publisher.model.C1268o;
import com.criteo.publisher.model.C1271r;
import com.criteo.publisher.p061c0.C1058a;
import com.criteo.publisher.p070l0.C1170a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.h */
/* compiled from: CdbCallListener.kt */
public abstract class C1135h {

    /* renamed from: a */
    private final C1058a f3627a;

    /* renamed from: b */
    private final C1071e f3628b;

    /* renamed from: c */
    private final C1170a f3629c;

    public C1135h(C1058a aVar, C1071e eVar, C1170a aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "bidLifecycleListener");
        Intrinsics.checkParameterIsNotNull(eVar, "bidManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "consentData");
        this.f3627a = aVar;
        this.f3628b = eVar;
        this.f3629c = aVar2;
    }

    /* renamed from: a */
    public void mo3230a(C1268o oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        this.f3627a.mo3073a(oVar);
    }

    /* renamed from: a */
    public void mo3231a(C1268o oVar, Exception exc) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        Intrinsics.checkParameterIsNotNull(exc, "exception");
        this.f3627a.mo3075a(oVar, exc);
    }

    /* renamed from: a */
    public void mo3121a(C1268o oVar, C1271r rVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        Intrinsics.checkParameterIsNotNull(rVar, "cdbResponse");
        Boolean a = rVar.mo3562a();
        if (a != null) {
            C1170a aVar = this.f3629c;
            Intrinsics.checkExpressionValueIsNotNull(a, "it");
            aVar.mo3276a(a.booleanValue());
        }
        this.f3628b.mo3112a(rVar.mo3564c());
        this.f3627a.mo3074a(oVar, rVar);
    }
}
