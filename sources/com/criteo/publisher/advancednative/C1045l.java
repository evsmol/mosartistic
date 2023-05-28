package com.criteo.publisher.advancednative;

import com.criteo.publisher.model.p073b0.C1243n;
import java.lang.ref.WeakReference;

/* renamed from: com.criteo.publisher.advancednative.l */
/* compiled from: NativeAdMapper */
public class C1045l {

    /* renamed from: a */
    private final C1050q f3443a;

    /* renamed from: b */
    private final C1040i f3444b;

    /* renamed from: c */
    private final C1030e f3445c;

    /* renamed from: d */
    private final C1032f f3446d;

    /* renamed from: e */
    private final C1026b f3447e;

    /* renamed from: f */
    private final RendererHelper f3448f;

    public C1045l(C1050q qVar, C1040i iVar, C1030e eVar, C1032f fVar, C1026b bVar, RendererHelper rendererHelper) {
        this.f3443a = qVar;
        this.f3444b = iVar;
        this.f3445c = eVar;
        this.f3446d = fVar;
        this.f3447e = bVar;
        this.f3448f = rendererHelper;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CriteoNativeAd mo3062a(C1243n nVar, WeakReference<CriteoNativeAdListener> weakReference, CriteoNativeRenderer criteoNativeRenderer) {
        C1043j jVar = new C1043j(nVar.mo3487g(), weakReference, this.f3444b);
        C1027c cVar = new C1027c(nVar.mo3491n().mo3457b(), weakReference, this.f3446d);
        C1024a aVar = new C1024a(nVar.mo3489l(), weakReference, this.f3446d);
        this.f3448f.preloadMedia(nVar.mo3491n().mo3493e());
        this.f3448f.preloadMedia(nVar.mo3486f());
        this.f3448f.preloadMedia(nVar.mo3490m());
        return new CriteoNativeAd(nVar, this.f3443a, jVar, this.f3445c, cVar, aVar, this.f3447e, criteoNativeRenderer, this.f3448f);
    }
}
