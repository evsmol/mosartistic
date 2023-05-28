package com.criteo.publisher;

import android.app.Application;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p066h0.C1142c;
import com.criteo.publisher.p068j0.C1154a;
import com.criteo.publisher.p070l0.C1173c;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.criteo.publisher.m */
/* compiled from: CriteoInternal */
class C1211m extends Criteo {

    /* renamed from: a */
    private final C1195g f3789a = C1197h.m5407b(getClass());

    /* renamed from: b */
    private final C1321s f3790b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1071e f3791c;

    /* renamed from: d */
    private final C1278u f3792d;

    /* renamed from: e */
    private final C1276t f3793e;

    /* renamed from: f */
    private final C1173c f3794f;

    /* renamed from: g */
    private final C1152j f3795g;

    /* renamed from: h */
    private final C1142c f3796h;

    /* renamed from: i */
    private final C1154a f3797i;

    C1211m(Application application, List<AdUnit> list, Boolean bool, String str, C1321s sVar) {
        this.f3790b = sVar;
        sVar.mo3703f1();
        C1278u z0 = sVar.mo3730z0();
        this.f3792d = z0;
        z0.mo3603d();
        sVar.mo3698d0().mo3615f();
        this.f3793e = sVar.mo3721q0();
        this.f3791c = sVar.mo3712k0();
        this.f3795g = sVar.mo3725u0();
        this.f3796h = sVar.mo3665C0();
        this.f3797i = sVar.mo3669G0();
        C1173c l1 = sVar.mo3715l1();
        this.f3794f = l1;
        if (bool != null) {
            l1.mo3280a(bool.booleanValue());
        }
        if (str != null) {
            this.f3794f.mo3279a(str);
        }
        application.registerActivityLifecycleCallbacks(sVar.mo3704g0());
        sVar.mo3709i1().mo2997a(application);
        sVar.mo3710j0().mo3071a();
        m5444a((Executor) sVar.mo3696c1(), list);
    }

    /* renamed from: com.criteo.publisher.m$a */
    /* compiled from: CriteoInternal */
    class C1212a extends C1330x {

        /* renamed from: c */
        final /* synthetic */ List f3798c;

        C1212a(List list) {
            this.f3798c = list;
        }

        /* renamed from: a */
        public void mo3040a() {
            C1211m.this.f3791c.mo3115a((List<AdUnit>) this.f3798c);
        }
    }

    /* renamed from: a */
    private void m5444a(Executor executor, List<AdUnit> list) {
        executor.execute(new C1212a(list));
    }

    public void enrichAdObjectWithBid(Object obj, Bid bid) {
        try {
            m5443a(obj, bid);
        } catch (Throwable th) {
            this.f3789a.mo3337a(C1328v.m5922b(th));
        }
    }

    /* renamed from: a */
    private void m5443a(Object obj, Bid bid) {
        this.f3796h.mo3240a(obj, bid);
    }

    /* access modifiers changed from: package-private */
    public void getBidForAdUnit(AdUnit adUnit, ContextData contextData, C1069d dVar) {
        this.f3791c.mo3113a(adUnit, contextData, dVar);
    }

    public void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        try {
            this.f3795g.mo3249a(adUnit, contextData, bidResponseListener);
        } catch (Throwable th) {
            this.f3789a.mo3337a(C1328v.m5922b(th));
            bidResponseListener.onResponse((Bid) null);
        }
    }

    /* access modifiers changed from: package-private */
    public C1278u getDeviceInfo() {
        return this.f3792d;
    }

    /* access modifiers changed from: package-private */
    public C1276t getConfig() {
        return this.f3793e;
    }

    /* access modifiers changed from: package-private */
    public C1154a getInterstitialActivityHelper() {
        return this.f3797i;
    }

    public C1167l createBannerController(CriteoBannerView criteoBannerView) {
        return new C1167l(criteoBannerView, this, this.f3790b.mo3709i1(), this.f3790b.mo3696c1());
    }

    public void setUsPrivacyOptOut(boolean z) {
        this.f3794f.mo3280a(z);
    }

    public void setMopubConsent(String str) {
        this.f3794f.mo3279a(str);
    }

    public void setUserData(UserData userData) {
        this.f3790b.mo3713k1().mo3105a(userData);
    }
}
