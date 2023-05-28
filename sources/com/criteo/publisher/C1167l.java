package com.criteo.publisher;

import android.webkit.WebViewClient;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1272s;
import com.criteo.publisher.p059a0.C1019b;
import com.criteo.publisher.p060b0.C1053a;
import com.criteo.publisher.p060b0.C1056c;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p072m0.C1213a;
import com.criteo.publisher.p072m0.C1215b;
import com.criteo.publisher.p074n0.C1288a;
import java.lang.ref.WeakReference;

/* renamed from: com.criteo.publisher.l */
/* compiled from: CriteoBannerEventController */
public class C1167l {

    /* renamed from: a */
    private final WeakReference<CriteoBannerView> f3704a;

    /* renamed from: b */
    private final CriteoBannerAdListener f3705b;

    /* renamed from: c */
    private final Criteo f3706c;

    /* renamed from: d */
    private final C1019b f3707d;

    /* renamed from: e */
    private final C1076c f3708e;

    public C1167l(CriteoBannerView criteoBannerView, Criteo criteo, C1019b bVar, C1076c cVar) {
        this.f3704a = new WeakReference<>(criteoBannerView);
        this.f3705b = criteoBannerView.getCriteoBannerAdListener();
        this.f3706c = criteo;
        this.f3707d = bVar;
        this.f3708e = cVar;
    }

    /* renamed from: com.criteo.publisher.l$a */
    /* compiled from: CriteoBannerEventController */
    class C1168a implements C1069d {
        C1168a() {
        }

        /* renamed from: a */
        public void mo3034a(C1272s sVar) {
            C1167l.this.mo3273a(C1319p.VALID);
            C1167l.this.mo3274a(sVar.mo3572d());
        }

        /* renamed from: a */
        public void mo3033a() {
            C1167l.this.mo3273a(C1319p.INVALID);
        }
    }

    /* renamed from: a */
    public void mo3272a(AdUnit adUnit, ContextData contextData) {
        this.f3706c.getBidForAdUnit(adUnit, contextData, new C1168a());
    }

    /* renamed from: a */
    public void mo3271a(Bid bid) {
        String a = bid == null ? null : bid.mo2939a(C1288a.CRITEO_BANNER);
        if (a == null) {
            mo3273a(C1319p.INVALID);
            return;
        }
        mo3273a(C1319p.VALID);
        mo3274a(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3273a(C1319p pVar) {
        this.f3708e.mo3126a(new C1213a(this.f3705b, this.f3704a, pVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3274a(String str) {
        this.f3708e.mo3126a(new C1215b(this.f3704a, mo3270a(), this.f3706c.getConfig(), str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public WebViewClient mo3270a() {
        return new C1053a(new C1169b(), this.f3707d.mo2996a());
    }

    /* renamed from: com.criteo.publisher.l$b */
    /* compiled from: CriteoBannerEventController */
    class C1169b implements C1056c {
        /* renamed from: a */
        public void mo2980a() {
        }

        C1169b() {
        }

        /* renamed from: b */
        public void mo2981b() {
            C1167l.this.mo3273a(C1319p.CLICK);
        }
    }
}
