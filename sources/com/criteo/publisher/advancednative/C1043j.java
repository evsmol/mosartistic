package com.criteo.publisher.advancednative;

import java.lang.ref.Reference;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.criteo.publisher.advancednative.j */
/* compiled from: ImpressionTask */
class C1043j implements C1049p {

    /* renamed from: a */
    private final Iterable<URL> f3436a;

    /* renamed from: b */
    private final Reference<CriteoNativeAdListener> f3437b;

    /* renamed from: c */
    private final C1040i f3438c;

    /* renamed from: d */
    private final AtomicBoolean f3439d = new AtomicBoolean(false);

    C1043j(Iterable<URL> iterable, Reference<CriteoNativeAdListener> reference, C1040i iVar) {
        this.f3436a = iterable;
        this.f3437b = reference;
        this.f3438c = iVar;
    }

    /* renamed from: a */
    public void mo3061a() {
        if (this.f3439d.compareAndSet(false, true)) {
            this.f3438c.mo3060a(this.f3436a);
            CriteoNativeAdListener criteoNativeAdListener = this.f3437b.get();
            if (criteoNativeAdListener != null) {
                this.f3438c.mo3059a(criteoNativeAdListener);
            }
        }
    }
}
