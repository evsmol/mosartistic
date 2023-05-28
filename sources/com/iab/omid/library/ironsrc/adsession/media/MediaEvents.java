package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p111b.C4318f;
import com.iab.omid.library.ironsrc.p113d.C4326b;
import com.iab.omid.library.ironsrc.p113d.C4330e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4309a adSession;

    private MediaEvents(C4309a aVar) {
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
        C4309a aVar = (C4309a) adSession2;
        C4330e.m12302a((Object) adSession2, "AdSession is null");
        C4330e.m12310g(aVar);
        C4330e.m12301a(aVar);
        C4330e.m12305b(aVar);
        C4330e.m12308e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32989a(mediaEvents);
        return mediaEvents;
    }

    public final void adUserInteraction(InteractionType interactionType) {
        C4330e.m12302a((Object) interactionType, "InteractionType is null");
        C4330e.m12306c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4326b.m12286a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo32992a("adUserInteraction", jSONObject);
    }

    public final void bufferFinish() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("bufferFinish");
    }

    public final void bufferStart() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("bufferStart");
    }

    public final void complete() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("complete");
    }

    public final void firstQuartile() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("firstQuartile");
    }

    public final void midpoint() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("midpoint");
    }

    public final void pause() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("pause");
    }

    public final void playerStateChange(PlayerState playerState) {
        C4330e.m12302a((Object) playerState, "PlayerState is null");
        C4330e.m12306c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4326b.m12286a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo32992a("playerStateChange", jSONObject);
    }

    public final void resume() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("resume");
    }

    public final void skipped() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("skipped");
    }

    public final void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4330e.m12306c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4326b.m12286a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4326b.m12286a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4326b.m12286a(jSONObject, "deviceVolume", Float.valueOf(C4318f.m12251a().mo32974d()));
        this.adSession.getAdSessionStatePublisher().mo32992a("start", jSONObject);
    }

    public final void thirdQuartile() {
        C4330e.m12306c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32990a("thirdQuartile");
    }

    public final void volumeChange(float f) {
        confirmValidVolume(f);
        C4330e.m12306c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4326b.m12286a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4326b.m12286a(jSONObject, "deviceVolume", Float.valueOf(C4318f.m12251a().mo32974d()));
        this.adSession.getAdSessionStatePublisher().mo32992a("volumeChange", jSONObject);
    }
}
