package com.criteo.publisher.advancednative;

import com.criteo.publisher.p060b0.C1056c;
import java.lang.ref.Reference;
import java.net.URI;

/* renamed from: com.criteo.publisher.advancednative.c */
/* compiled from: AdViewClickHandler */
class C1027c implements C1047n {

    /* renamed from: a */
    private final URI f3410a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Reference<CriteoNativeAdListener> f3411b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1032f f3412c;

    C1027c(URI uri, Reference<CriteoNativeAdListener> reference, C1032f fVar) {
        this.f3410a = uri;
        this.f3411b = reference;
        this.f3412c = fVar;
    }

    /* renamed from: a */
    public void mo3041a() {
        this.f3412c.mo3050a(this.f3411b.get());
        this.f3412c.mo3051a(this.f3410a, new C1028a());
    }

    /* renamed from: com.criteo.publisher.advancednative.c$a */
    /* compiled from: AdViewClickHandler */
    class C1028a implements C1056c {
        C1028a() {
        }

        /* renamed from: b */
        public void mo2981b() {
            C1027c.this.f3412c.mo3053c((CriteoNativeAdListener) C1027c.this.f3411b.get());
        }

        /* renamed from: a */
        public void mo2980a() {
            C1027c.this.f3412c.mo3052b((CriteoNativeAdListener) C1027c.this.f3411b.get());
        }
    }
}
