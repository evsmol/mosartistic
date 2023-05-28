package com.iab.omid.library.amazon.adsession;

import com.iab.omid.library.amazon.adsession.media.VastProperties;
import com.iab.omid.library.amazon.p101d.C4173e;

public final class AdEvents {
    private final C4152a adSession;

    private AdEvents(C4152a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4152a aVar = (C4152a) adSession2;
        C4173e.m11602a((Object) adSession2, "AdSession is null");
        C4173e.m11607d(aVar);
        C4173e.m11605b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32391a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4173e.m11605b(this.adSession);
        C4173e.m11609f(this.adSession);
        if (!this.adSession.mo32306f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo32306f()) {
            this.adSession.mo32303c();
        }
    }

    public void loaded() {
        C4173e.m11606c(this.adSession);
        C4173e.m11609f(this.adSession);
        this.adSession.mo32304d();
    }

    public void loaded(VastProperties vastProperties) {
        C4173e.m11602a((Object) vastProperties, "VastProperties is null");
        C4173e.m11606c(this.adSession);
        C4173e.m11609f(this.adSession);
        this.adSession.mo32301a(vastProperties.mo32327a());
    }
}
