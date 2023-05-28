package com.criteo.publisher.advancednative;

import com.criteo.publisher.C1330x;
import com.criteo.publisher.p059a0.C1019b;
import com.criteo.publisher.p060b0.C1054b;
import com.criteo.publisher.p060b0.C1056c;
import com.criteo.publisher.p063e0.C1076c;
import java.net.URI;

/* renamed from: com.criteo.publisher.advancednative.f */
/* compiled from: ClickHelper */
public class C1032f {

    /* renamed from: a */
    private final C1054b f3416a;

    /* renamed from: b */
    private final C1019b f3417b;

    /* renamed from: c */
    private final C1076c f3418c;

    public C1032f(C1054b bVar, C1019b bVar2, C1076c cVar) {
        this.f3416a = bVar;
        this.f3417b = bVar2;
        this.f3418c = cVar;
    }

    /* renamed from: com.criteo.publisher.advancednative.f$a */
    /* compiled from: ClickHelper */
    class C1033a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ CriteoNativeAdListener f3419c;

        C1033a(C1032f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f3419c = criteoNativeAdListener;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3419c.onAdClicked();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3050a(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f3418c.mo3126a(new C1033a(this, criteoNativeAdListener));
        }
    }

    /* renamed from: com.criteo.publisher.advancednative.f$b */
    /* compiled from: ClickHelper */
    class C1034b extends C1330x {

        /* renamed from: c */
        final /* synthetic */ CriteoNativeAdListener f3420c;

        C1034b(C1032f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f3420c = criteoNativeAdListener;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3420c.onAdLeftApplication();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3053c(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f3418c.mo3126a(new C1034b(this, criteoNativeAdListener));
        }
    }

    /* renamed from: com.criteo.publisher.advancednative.f$c */
    /* compiled from: ClickHelper */
    class C1035c extends C1330x {

        /* renamed from: c */
        final /* synthetic */ CriteoNativeAdListener f3421c;

        C1035c(C1032f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f3421c = criteoNativeAdListener;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3421c.onAdClosed();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3052b(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f3418c.mo3126a(new C1035c(this, criteoNativeAdListener));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3051a(URI uri, C1056c cVar) {
        this.f3416a.mo3069a(uri.toString(), this.f3417b.mo2996a(), cVar);
    }
}
