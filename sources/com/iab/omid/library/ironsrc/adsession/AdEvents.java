package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.p113d.C4330e;

public final class AdEvents {
    private final C4309a adSession;

    private AdEvents(C4309a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4309a aVar = (C4309a) adSession2;
        C4330e.m12302a((Object) adSession2, "AdSession is null");
        C4330e.m12307d(aVar);
        C4330e.m12305b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32984a(adEvents);
        return adEvents;
    }

    public final void impressionOccurred() {
        C4330e.m12305b(this.adSession);
        C4330e.m12309f(this.adSession);
        if (!this.adSession.mo32907e()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo32907e()) {
            this.adSession.mo32904b();
        }
    }

    public final void loaded() {
        C4330e.m12306c(this.adSession);
        C4330e.m12309f(this.adSession);
        this.adSession.mo32905c();
    }

    public final void loaded(VastProperties vastProperties) {
        C4330e.m12302a((Object) vastProperties, "VastProperties is null");
        C4330e.m12306c(this.adSession);
        C4330e.m12309f(this.adSession);
        this.adSession.mo32903a(vastProperties.mo32928a());
    }
}
