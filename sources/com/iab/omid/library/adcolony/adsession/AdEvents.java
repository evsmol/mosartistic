package com.iab.omid.library.adcolony.adsession;

import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.iab.omid.library.adcolony.p095d.C4123e;

public final class AdEvents {
    private final C4102a adSession;

    private AdEvents(C4102a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4102a aVar = (C4102a) adSession2;
        C4123e.m11372a((Object) adSession2, "AdSession is null");
        C4123e.m11377d(aVar);
        C4123e.m11375b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32192a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4123e.m11375b(this.adSession);
        C4123e.m11379f(this.adSession);
        if (!this.adSession.mo32107f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo32107f()) {
            this.adSession.mo32104c();
        }
    }

    public void loaded() {
        C4123e.m11376c(this.adSession);
        C4123e.m11379f(this.adSession);
        this.adSession.mo32105d();
    }

    public void loaded(VastProperties vastProperties) {
        C4123e.m11372a((Object) vastProperties, "VastProperties is null");
        C4123e.m11376c(this.adSession);
        C4123e.m11379f(this.adSession);
        this.adSession.mo32102a(vastProperties.mo32128a());
    }
}
