package com.criteo.publisher;

import android.content.Context;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p059a0.C1019b;
import com.criteo.publisher.p063e0.C1076c;
import com.criteo.publisher.p068j0.C1154a;
import com.criteo.publisher.p072m0.C1217d;
import com.criteo.publisher.p074n0.C1301h;
import java.util.concurrent.Future;

/* renamed from: com.criteo.publisher.t */
/* compiled from: DummyCriteo */
public class C1323t extends Criteo {
    public void enrichAdObjectWithBid(Object obj, Bid bid) {
    }

    public void setMopubConsent(String str) {
    }

    public void setUsPrivacyOptOut(boolean z) {
    }

    public void setUserData(UserData userData) {
    }

    /* access modifiers changed from: package-private */
    public void getBidForAdUnit(AdUnit adUnit, ContextData contextData, C1069d dVar) {
        dVar.mo3033a();
    }

    public void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        bidResponseListener.onResponse((Bid) null);
    }

    /* access modifiers changed from: package-private */
    public C1278u getDeviceInfo() {
        return new C1325b();
    }

    /* access modifiers changed from: package-private */
    public C1276t getConfig() {
        return new C1276t();
    }

    /* access modifiers changed from: package-private */
    public C1154a getInterstitialActivityHelper() {
        return new C1326c();
    }

    public C1167l createBannerController(CriteoBannerView criteoBannerView) {
        return new C1167l(criteoBannerView, this, C1321s.m5824c().mo3709i1(), C1321s.m5824c().mo3696c1());
    }

    /* renamed from: com.criteo.publisher.t$b */
    /* compiled from: DummyCriteo */
    private static class C1325b extends C1278u {
        /* renamed from: d */
        public void mo3603d() {
        }

        private C1325b() {
            super((Context) null, new C1076c());
        }

        /* renamed from: b */
        public Future<String> mo3602b() {
            return C1301h.m5765b("");
        }
    }

    /* renamed from: com.criteo.publisher.t$c */
    /* compiled from: DummyCriteo */
    private static class C1326c extends C1154a {
        /* renamed from: a */
        public void mo3251a(String str, C1217d dVar) {
        }

        /* renamed from: b */
        public boolean mo3252b() {
            return false;
        }

        C1326c() {
            super((Context) null, (C1019b) null);
        }
    }
}
