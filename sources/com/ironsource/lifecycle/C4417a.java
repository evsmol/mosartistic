package com.ironsource.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo38199d2 = {"Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "Lcom/ironsource/lifecycle/IronsourceLifecycleListener;", "task", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/lifecycle/SessionCalcTask;)V", "sessionStartTime", "", "appPaused", "", "appResumed", "appStarted", "appStopped", "getSessionTime", "updateSessionStartTime", "environment_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.lifecycle.a */
public final class C4417a implements C4420c {

    /* renamed from: a */
    private long f10517a = System.currentTimeMillis();

    /* renamed from: b */
    private final C4431g f10518b;

    public C4417a(C4431g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "task");
        this.f10518b = gVar;
        C4421d.m12604a().mo33234a((C4420c) this);
    }

    /* renamed from: a */
    public final void mo33224a() {
        this.f10517a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo33225b() {
        this.f10518b.f10550a = Long.valueOf(System.currentTimeMillis() - this.f10517a);
        this.f10518b.run();
    }
}
