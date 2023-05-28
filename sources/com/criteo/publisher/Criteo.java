package com.criteo.publisher;

import android.app.Application;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.logging.C1195g;
import com.criteo.publisher.logging.C1197h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1276t;
import com.criteo.publisher.model.C1278u;
import com.criteo.publisher.p068j0.C1154a;
import java.util.ArrayList;
import java.util.List;

public abstract class Criteo {
    private static Criteo criteo;

    public abstract C1167l createBannerController(CriteoBannerView criteoBannerView);

    public abstract void enrichAdObjectWithBid(Object obj, Bid bid);

    /* access modifiers changed from: package-private */
    public abstract void getBidForAdUnit(AdUnit adUnit, ContextData contextData, C1069d dVar);

    /* access modifiers changed from: package-private */
    public abstract C1276t getConfig();

    /* access modifiers changed from: package-private */
    public abstract C1278u getDeviceInfo();

    /* access modifiers changed from: package-private */
    public abstract C1154a getInterstitialActivityHelper();

    public abstract void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener);

    public abstract void setMopubConsent(String str);

    public abstract void setUsPrivacyOptOut(boolean z);

    public abstract void setUserData(UserData userData);

    public static class Builder {
        /* access modifiers changed from: private */
        public List<AdUnit> adUnits = new ArrayList();
        /* access modifiers changed from: private */
        public final Application application;
        /* access modifiers changed from: private */
        public final String criteoPublisherId;
        /* access modifiers changed from: private */
        public boolean isDebugLogsEnabled = false;
        /* access modifiers changed from: private */
        public String mopubConsent;
        /* access modifiers changed from: private */
        public Boolean usPrivacyOptOut;

        public Builder(Application application2, String str) {
            this.application = application2;
            this.criteoPublisherId = str;
        }

        public Builder adUnits(List<AdUnit> list) {
            if (list == null) {
                this.adUnits = new ArrayList();
            } else {
                this.adUnits = list;
            }
            return this;
        }

        public Builder usPrivacyOptOut(boolean z) {
            this.usPrivacyOptOut = Boolean.valueOf(z);
            return this;
        }

        public Builder mopubConsent(String str) {
            this.mopubConsent = str;
            return this;
        }

        public Builder debugLogsEnabled(boolean z) {
            this.isDebugLogsEnabled = z;
            return this;
        }

        public Criteo init() throws CriteoInitException {
            return Criteo.init(this);
        }
    }

    /* access modifiers changed from: private */
    public static Criteo init(Builder builder) throws CriteoInitException {
        Criteo criteo2;
        Class<Criteo> cls = Criteo.class;
        C1195g b = C1197h.m5407b(cls);
        synchronized (cls) {
            if (criteo == null) {
                try {
                    C1321s c = C1321s.m5824c();
                    c.mo3690a(builder.application);
                    c.mo3691a(builder.criteoPublisherId);
                    if (builder.isDebugLogsEnabled) {
                        c.mo3724t0().mo3329b(4);
                    }
                    if (c.mo3663A0().mo3658d()) {
                        criteo = new C1211m(builder.application, builder.adUnits, builder.usPrivacyOptOut, builder.mopubConsent, c);
                        b.mo3337a(C1331y.m5933a(builder.criteoPublisherId, builder.adUnits, getVersion()));
                    } else {
                        criteo = new C1323t();
                        b.mo3337a(C1331y.m5931a());
                    }
                } catch (Throwable th) {
                    criteo = new C1323t();
                    CriteoInitException criteoInitException = new CriteoInitException("Internal error initializing Criteo instance.", th);
                    b.mo3337a(C1331y.m5932a(criteoInitException));
                    throw criteoInitException;
                }
            } else {
                b.mo3337a(C1331y.m5934b());
            }
            criteo2 = criteo;
        }
        return criteo2;
    }

    public static Criteo getInstance() {
        Criteo criteo2 = criteo;
        if (criteo2 != null) {
            return criteo2;
        }
        throw new C1320q("You must initialize the SDK before calling Criteo.getInstance()");
    }

    static void setInstance(Criteo criteo2) {
        criteo = criteo2;
    }

    public void loadBid(AdUnit adUnit, BidResponseListener bidResponseListener) {
        loadBid(adUnit, new ContextData(), bidResponseListener);
    }

    public static String getVersion() {
        try {
            return C1321s.m5824c().mo3716m0().mo3645q();
        } catch (Throwable th) {
            C1197h.m5407b(Criteo.class).mo3337a(C1328v.m5922b(th));
            return "";
        }
    }
}
