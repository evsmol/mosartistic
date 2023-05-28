package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4214h;
import com.iab.omid.library.applovin.utils.C4226c;
import com.iab.omid.library.applovin.utils.C4233g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4197a adSession;

    private MediaEvents(C4197a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession2) {
        C4197a aVar = (C4197a) adSession2;
        C4233g.m11883a((Object) adSession2, "AdSession is null");
        C4233g.m11890f(aVar);
        C4233g.m11887c(aVar);
        C4233g.m11886b(aVar);
        C4233g.m11892h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32605a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4233g.m11883a((Object) interactionType, "InteractionType is null");
        C4233g.m11882a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo32608a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("bufferFinish");
    }

    public void bufferStart() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("bufferStart");
    }

    public void complete() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("complete");
    }

    public void firstQuartile() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("firstQuartile");
    }

    public void midpoint() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("midpoint");
    }

    public void pause() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C4233g.m11883a((Object) playerState, "PlayerState is null");
        C4233g.m11882a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo32608a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("resume");
    }

    public void skipped() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4233g.m11882a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4226c.m11860a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4226c.m11860a(jSONObject, "deviceVolume", Float.valueOf(C4214h.m11798c().mo32588b()));
        this.adSession.getAdSessionStatePublisher().mo32608a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4233g.m11882a(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32606a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4233g.m11882a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4226c.m11860a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4226c.m11860a(jSONObject, "deviceVolume", Float.valueOf(C4214h.m11798c().mo32588b()));
        this.adSession.getAdSessionStatePublisher().mo32608a("volumeChange", jSONObject);
    }
}
