package com.iab.omid.library.amazon.adsession.media;

import com.iab.omid.library.amazon.adsession.AdSession;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p099b.C4161f;
import com.iab.omid.library.amazon.p101d.C4169b;
import com.iab.omid.library.amazon.p101d.C4173e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4152a adSession;

    private MediaEvents(C4152a aVar) {
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
        C4152a aVar = (C4152a) adSession2;
        C4173e.m11602a((Object) adSession2, "AdSession is null");
        C4173e.m11610g(aVar);
        C4173e.m11601a(aVar);
        C4173e.m11605b(aVar);
        C4173e.m11608e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32396a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4173e.m11602a((Object) interactionType, "InteractionType is null");
        C4173e.m11606c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4169b.m11585a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo32399a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("bufferFinish");
    }

    public void bufferStart() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("bufferStart");
    }

    public void complete() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("complete");
    }

    public void firstQuartile() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("firstQuartile");
    }

    public void midpoint() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("midpoint");
    }

    public void pause() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C4173e.m11602a((Object) playerState, "PlayerState is null");
        C4173e.m11606c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4169b.m11585a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo32399a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("resume");
    }

    public void skipped() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4173e.m11606c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4169b.m11585a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4169b.m11585a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4169b.m11585a(jSONObject, "deviceVolume", Float.valueOf(C4161f.m11548a().mo32381d()));
        this.adSession.getAdSessionStatePublisher().mo32399a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4173e.m11606c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32397a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4173e.m11606c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4169b.m11585a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4169b.m11585a(jSONObject, "deviceVolume", Float.valueOf(C4161f.m11548a().mo32381d()));
        this.adSession.getAdSessionStatePublisher().mo32399a("volumeChange", jSONObject);
    }
}
