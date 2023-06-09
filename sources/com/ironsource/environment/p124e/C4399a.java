package com.ironsource.environment.p124e;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo38199d2 = {"Lcom/ironsource/environment/thread/ISAdPlayerThreadManager;", "", "()V", "backgroundHandler", "Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "publisherCallbackHandler", "uiHandler", "Landroid/os/Handler;", "getBackgroundThreadLooper", "Landroid/os/Looper;", "postBackgroundTask", "", "action", "Ljava/lang/Runnable;", "delay", "", "postCallbacks", "postOnUiThreadTask", "environment_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.a */
public final class C4399a {

    /* renamed from: a */
    public static final C4399a f10491a = new C4399a();

    /* renamed from: b */
    private static final Handler f10492b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final C4400b f10493c;

    /* renamed from: d */
    private static final C4400b f10494d;

    static {
        C4400b bVar = new C4400b("isadplayer-background");
        bVar.start();
        bVar.mo33208a();
        f10493c = bVar;
        C4400b bVar2 = new C4400b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.mo33208a();
        f10494d = bVar2;
    }

    private C4399a() {
    }

    /* renamed from: a */
    public static Looper m12508a() {
        return f10493c.getLooper();
    }

    /* renamed from: a */
    public final void mo33205a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10492b.postDelayed(runnable, 0);
    }

    /* renamed from: b */
    public final void mo33206b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10493c.mo33209a(runnable, 0);
    }

    /* renamed from: c */
    public final void mo33207c(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "action");
        f10494d.mo33209a(runnable, 0);
    }
}
