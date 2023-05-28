package com.iab.omid.library.adcolony.adsession.media;

import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p093b.C4111f;
import com.iab.omid.library.adcolony.p095d.C4119b;
import com.iab.omid.library.adcolony.p095d.C4123e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4102a adSession;

    private MediaEvents(C4102a aVar) {
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
        C4102a aVar = (C4102a) adSession2;
        C4123e.m11372a((Object) adSession2, "AdSession is null");
        C4123e.m11380g(aVar);
        C4123e.m11371a(aVar);
        C4123e.m11375b(aVar);
        C4123e.m11378e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32197a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4123e.m11372a((Object) interactionType, "InteractionType is null");
        C4123e.m11376c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4119b.m11355a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo32200a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("bufferFinish");
    }

    public void bufferStart() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("bufferStart");
    }

    public void complete() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("complete");
    }

    public void firstQuartile() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("firstQuartile");
    }

    public void midpoint() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("midpoint");
    }

    public void pause() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C4123e.m11372a((Object) playerState, "PlayerState is null");
        C4123e.m11376c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4119b.m11355a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo32200a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("resume");
    }

    public void skipped() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4123e.m11376c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4119b.m11355a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4119b.m11355a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4119b.m11355a(jSONObject, "deviceVolume", Float.valueOf(C4111f.m11318a().mo32182d()));
        this.adSession.getAdSessionStatePublisher().mo32200a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4123e.m11376c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32198a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4123e.m11376c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4119b.m11355a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4119b.m11355a(jSONObject, "deviceVolume", Float.valueOf(C4111f.m11318a().mo32182d()));
        this.adSession.getAdSessionStatePublisher().mo32200a("volumeChange", jSONObject);
    }
}
