package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p105b.C4268f;
import com.iab.omid.library.appodeal.p107d.C4276b;
import com.iab.omid.library.appodeal.p107d.C4280e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public final class MediaEvents {
    private final C4259a adSession;

    private MediaEvents(C4259a aVar) {
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
        C4259a aVar = (C4259a) adSession2;
        C4280e.m12081a((Object) adSession2, "AdSession is null");
        C4280e.m12089g(aVar);
        C4280e.m12080a(aVar);
        C4280e.m12084b(aVar);
        C4280e.m12087e(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().mo32803a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C4280e.m12081a((Object) interactionType, "InteractionType is null");
        C4280e.m12085c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4276b.m12065a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().mo32806a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("bufferFinish");
    }

    public void bufferStart() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("bufferStart");
    }

    public void complete() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("complete");
    }

    public void firstQuartile() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("firstQuartile");
    }

    public void midpoint() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("midpoint");
    }

    public void pause() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C4280e.m12081a((Object) playerState, "PlayerState is null");
        C4280e.m12085c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4276b.m12065a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().mo32806a("playerStateChange", jSONObject);
    }

    public void resume() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("resume");
    }

    public void skipped() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C4280e.m12085c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4276b.m12065a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f));
        C4276b.m12065a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C4276b.m12065a(jSONObject, "deviceVolume", Float.valueOf(C4268f.m12029a().mo32788d()));
        this.adSession.getAdSessionStatePublisher().mo32806a("start", jSONObject);
    }

    public void thirdQuartile() {
        C4280e.m12085c(this.adSession);
        this.adSession.getAdSessionStatePublisher().mo32804a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C4280e.m12085c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C4276b.m12065a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C4276b.m12065a(jSONObject, "deviceVolume", Float.valueOf(C4268f.m12029a().mo32788d()));
        this.adSession.getAdSessionStatePublisher().mo32806a("volumeChange", jSONObject);
    }
}
