package com.ironsource.environment.p124e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo38199d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "uiHandler", "Landroid/os/Handler;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postOnUiThreadTask", "removeBackgroundTask", "removeUiThreadTask", "environment_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.c */
public final class C4401c {

    /* renamed from: a */
    public static final C4401c f10496a = new C4401c();

    /* renamed from: b */
    private static final Handler f10497b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C4400b f10498c;

    static {
        C4400b bVar = new C4400b("background");
        bVar.start();
        bVar.mo33208a();
        f10498c = bVar;
    }

    private C4401c() {
    }

    /* renamed from: a */
    public static void m12515a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10497b.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public static void m12517b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10497b.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public static void m12518b(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10498c.mo33209a(runnable, j);
    }

    /* renamed from: a */
    public final void mo33210a(Runnable runnable) {
        m12515a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo33211c(Runnable runnable) {
        m12518b(runnable, 0);
    }
}
