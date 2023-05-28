package com.bytedance.sdk.openadsdk.p000b;

import com.bytedance.sdk.openadsdk.multipro.p054c.C0938a;
import com.bytedance.sdk.openadsdk.p042h.p045c.C0818c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.r */
/* compiled from: StatsDispatcher4MultiProcess */
public class C0161r extends C0132c<C0818c.C0821a> {

    /* renamed from: a */
    private AtomicBoolean f612a = new AtomicBoolean(false);

    /* renamed from: b */
    private boolean f613b = true;

    /* renamed from: b */
    public void mo395b() {
    }

    public C0161r(boolean z) {
        this.f613b = z;
    }

    /* renamed from: a */
    public void mo393a() {
        if (!this.f612a.getAndSet(true)) {
            C0938a.m4350a(this.f613b);
        }
    }

    /* renamed from: a */
    public void mo394a(C0818c.C0821a aVar) {
        if (!this.f612a.get()) {
            mo393a();
        }
        if (this.f612a.get()) {
            C0938a.m4348a(aVar.mo2630a(), this.f613b);
        }
    }
}
