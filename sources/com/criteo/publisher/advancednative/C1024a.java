package com.criteo.publisher.advancednative;

import com.criteo.publisher.p060b0.C1056c;
import java.lang.ref.Reference;
import java.net.URI;

/* renamed from: com.criteo.publisher.advancednative.a */
/* compiled from: AdChoiceClickHandler */
class C1024a implements C1047n {

    /* renamed from: a */
    private final URI f3403a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Reference<CriteoNativeAdListener> f3404b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1032f f3405c;

    C1024a(URI uri, Reference<CriteoNativeAdListener> reference, C1032f fVar) {
        this.f3403a = uri;
        this.f3404b = reference;
        this.f3405c = fVar;
    }

    /* renamed from: com.criteo.publisher.advancednative.a$a */
    /* compiled from: AdChoiceClickHandler */
    class C1025a implements C1056c {
        C1025a() {
        }

        /* renamed from: b */
        public void mo2981b() {
            C1024a.this.f3405c.mo3053c((CriteoNativeAdListener) C1024a.this.f3404b.get());
        }

        /* renamed from: a */
        public void mo2980a() {
            C1024a.this.f3405c.mo3052b((CriteoNativeAdListener) C1024a.this.f3404b.get());
        }
    }

    /* renamed from: a */
    public void mo3041a() {
        this.f3405c.mo3051a(this.f3403a, new C1025a());
    }
}
