package com.iab.omid.library.appodeal.adsession;

import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import com.iab.omid.library.appodeal.p107d.C4280e;

public final class AdEvents {
    private final C4259a adSession;

    private AdEvents(C4259a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4259a aVar = (C4259a) adSession2;
        C4280e.m12081a((Object) adSession2, "AdSession is null");
        C4280e.m12086d(aVar);
        C4280e.m12084b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32798a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4280e.m12084b(this.adSession);
        C4280e.m12088f(this.adSession);
        if (!this.adSession.mo32713e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo32713e()) {
            this.adSession.mo32710b();
        }
    }

    public void loaded() {
        C4280e.m12085c(this.adSession);
        C4280e.m12088f(this.adSession);
        this.adSession.mo32711c();
    }

    public void loaded(VastProperties vastProperties) {
        C4280e.m12081a((Object) vastProperties, "VastProperties is null");
        C4280e.m12085c(this.adSession);
        C4280e.m12088f(this.adSession);
        this.adSession.mo32709a(vastProperties.mo32734a());
    }
}
