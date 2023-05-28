package com.bytedance.sdk.openadsdk.p000b;

import com.bytedance.sdk.openadsdk.multipro.p054c.C0938a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.b.d */
/* compiled from: AdEventDispatcher4MultiProcess */
public class C0135d extends C0132c<C0106a> {

    /* renamed from: a */
    private AtomicBoolean f530a = new AtomicBoolean(false);

    /* renamed from: b */
    public void mo395b() {
    }

    /* renamed from: a */
    public void mo393a() {
        if (!this.f530a.getAndSet(true)) {
            C0938a.m4352c();
        }
    }

    /* renamed from: a */
    public void mo394a(C0106a aVar) {
        if (!this.f530a.get()) {
            mo393a();
        }
        if (this.f530a.get()) {
            try {
                C0938a.m4347a(aVar.mo305a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
