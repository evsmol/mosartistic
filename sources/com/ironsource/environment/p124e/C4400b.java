package com.ironsource.environment.p124e;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo38199d2 = {"Lcom/ironsource/environment/thread/IronSourceHandlerThread;", "Landroid/os/HandlerThread;", "name", "", "(Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "postTask", "", "task", "Ljava/lang/Runnable;", "delay", "", "prepareHandler", "removeCallback", "environment_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.e.b */
public final class C4400b extends HandlerThread {

    /* renamed from: a */
    private Handler f10495a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4400b(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    /* renamed from: a */
    public final void mo33208a() {
        this.f10495a = new Handler(getLooper());
    }

    /* renamed from: a */
    public final void mo33209a(Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "task");
        Handler handler = this.f10495a;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }
}
