package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.adcolony.sdk.i */
class C6313i extends ContentObserver {

    /* renamed from: a */
    private AudioManager f13545a;

    /* renamed from: b */
    private AdColonyInterstitial f13546b;

    C6313i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context a = C6185a.m14880a();
        if (a != null) {
            this.f13545a = (AudioManager) a.getSystemService("audio");
            this.f13546b = adColonyInterstitial;
            a.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50737a() {
        Context a = C6185a.m14880a();
        if (a != null) {
            a.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f13546b = null;
        this.f13545a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f13545a != null && (adColonyInterstitial = this.f13546b) != null && adColonyInterstitial.mo50350d() != null) {
            double streamVolume = (double) ((((float) this.f13545a.getStreamVolume(3)) / 15.0f) * 100.0f);
            C6294f1 b = C6235c0.m15073b();
            C6235c0.m15067a(b, "audio_percentage", streamVolume);
            C6235c0.m15070a(b, "ad_session_id", this.f13546b.mo50350d().mo50523a());
            C6235c0.m15077b(b, "id", this.f13546b.mo50350d().mo50532c());
            new C6312h0("AdContainer.on_audio_change", this.f13546b.mo50350d().mo50551k(), b).mo50736c();
        }
    }
}
