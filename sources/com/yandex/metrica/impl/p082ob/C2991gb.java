package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.gb */
public final class C2991gb {

    /* renamed from: a */
    private C2933em f7893a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f7894b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ICommonExecutor f7895c;

    /* renamed from: com.yandex.metrica.impl.ob.gb$a */
    public static final class C2992a extends C2933em {

        /* renamed from: a */
        final /* synthetic */ C2991gb f7896a;

        /* renamed from: b */
        final /* synthetic */ C2993b f7897b;

        /* renamed from: c */
        final /* synthetic */ C3123kb f7898c;

        /* renamed from: d */
        final /* synthetic */ long f7899d;

        C2992a(C2991gb gbVar, C2993b bVar, C3123kb kbVar, long j) {
            this.f7896a = gbVar;
            this.f7897b = bVar;
            this.f7898c = kbVar;
            this.f7899d = j;
        }

        /* renamed from: a */
        public void mo15597a() {
            if (!this.f7896a.f7894b) {
                this.f7897b.mo17631a(true);
                this.f7898c.mo17779a();
                this.f7896a.f7895c.executeDelayed(C2991gb.m9617b(this.f7896a), this.f7899d, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gb$b */
    public static final class C2993b {

        /* renamed from: a */
        private volatile boolean f7900a;

        public C2993b(boolean z) {
            this.f7900a = z;
        }

        /* renamed from: a */
        public final boolean mo17632a() {
            return this.f7900a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2993b(boolean z, int i) {
            this((i & 1) != 0 ? false : z);
        }

        /* renamed from: a */
        public final void mo17631a(boolean z) {
            this.f7900a = z;
        }
    }

    public C2991gb(C2637Uh uh, C2993b bVar, Random random, ICommonExecutor iCommonExecutor, C3123kb kbVar) {
        this.f7895c = iCommonExecutor;
        this.f7893a = new C2992a(this, bVar, kbVar, (long) uh.mo16843b());
        if (bVar.mo17632a()) {
            C2933em emVar = this.f7893a;
            if (emVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
            }
            emVar.run();
            return;
        }
        long nextInt = (long) random.nextInt(uh.mo16842a() + 1);
        C2933em emVar2 = this.f7893a;
        if (emVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        iCommonExecutor.executeDelayed(emVar2, nextInt, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public static final /* synthetic */ C2933em m9617b(C2991gb gbVar) {
        C2933em emVar = gbVar.f7893a;
        if (emVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        return emVar;
    }

    /* renamed from: a */
    public final void mo17630a() {
        this.f7894b = true;
        ICommonExecutor iCommonExecutor = this.f7895c;
        C2933em emVar = this.f7893a;
        if (emVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicRunnable");
        }
        iCommonExecutor.remove(emVar);
    }
}
