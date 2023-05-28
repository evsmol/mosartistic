package com.criteo.publisher.advancednative;

import com.criteo.publisher.C1330x;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p069k0.C1166g;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Executor;

/* renamed from: com.criteo.publisher.advancednative.i */
/* compiled from: ImpressionHelper */
public class C1040i {

    /* renamed from: a */
    private final C1166g f3430a;

    /* renamed from: b */
    private final Executor f3431b;

    /* renamed from: c */
    private final C1076c f3432c;

    public C1040i(C1166g gVar, Executor executor, C1076c cVar) {
        this.f3430a = gVar;
        this.f3431b = executor;
        this.f3432c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3060a(Iterable<URL> iterable) {
        for (URL bVar : iterable) {
            this.f3431b.execute(new C1042b(bVar, this.f3430a, (C1041a) null));
        }
    }

    /* renamed from: com.criteo.publisher.advancednative.i$a */
    /* compiled from: ImpressionHelper */
    class C1041a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ CriteoNativeAdListener f3433c;

        C1041a(C1040i iVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f3433c = criteoNativeAdListener;
        }

        /* renamed from: a */
        public void mo3040a() {
            this.f3433c.onAdImpression();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3059a(CriteoNativeAdListener criteoNativeAdListener) {
        this.f3432c.mo3126a(new C1041a(this, criteoNativeAdListener));
    }

    /* renamed from: com.criteo.publisher.advancednative.i$b */
    /* compiled from: ImpressionHelper */
    private static class C1042b extends C1330x {

        /* renamed from: c */
        private final URL f3434c;

        /* renamed from: d */
        private final C1166g f3435d;

        /* synthetic */ C1042b(URL url, C1166g gVar, C1041a aVar) {
            this(url, gVar);
        }

        private C1042b(URL url, C1166g gVar) {
            this.f3434c = url;
            this.f3435d = gVar;
        }

        /* renamed from: a */
        public void mo3040a() throws IOException {
            InputStream a = this.f3435d.mo3265a(this.f3434c);
            if (a != null) {
                a.close();
            }
        }
    }
}
