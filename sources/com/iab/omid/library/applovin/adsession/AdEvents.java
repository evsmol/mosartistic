package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.utils.C4233g;

public final class AdEvents {
    private final C4197a adSession;

    private AdEvents(C4197a aVar) {
        this.adSession = aVar;
    }

    public static AdEvents createAdEvents(AdSession adSession2) {
        C4197a aVar = (C4197a) adSession2;
        C4233g.m11883a((Object) adSession2, "AdSession is null");
        C4233g.m11891g(aVar);
        C4233g.m11886b(aVar);
        AdEvents adEvents = new AdEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32600a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C4233g.m11886b(this.adSession);
        C4233g.m11889e(this.adSession);
        if (!this.adSession.mo32498f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.mo32498f()) {
            this.adSession.mo32503k();
        }
    }

    public void loaded() {
        C4233g.m11882a(this.adSession);
        C4233g.m11889e(this.adSession);
        this.adSession.mo32504l();
    }

    public void loaded(VastProperties vastProperties) {
        C4233g.m11883a((Object) vastProperties, "VastProperties is null");
        C4233g.m11882a(this.adSession);
        C4233g.m11889e(this.adSession);
        this.adSession.mo32494a(vastProperties.mo32521a());
    }
}
