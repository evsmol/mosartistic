package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class AdColonyInterstitialActivity extends C6201b {

    /* renamed from: j */
    AdColonyInterstitial f13220j;

    /* renamed from: k */
    private C6313i f13221k;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!C6185a.m14890d()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = C6185a.m14887b().mo50799j();
        }
        this.f13220j = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50384a(C6312h0 h0Var) {
        String e;
        super.mo50384a(h0Var);
        C6252d c = C6185a.m14887b().mo50787c();
        C6294f1 f = C6235c0.m15085f(h0Var.mo50732a(), "v4iap");
        C6290e1 a = C6235c0.m15060a(f, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.f13220j;
        if (!(adColonyInterstitial == null || adColonyInterstitial.getListener() == null || (e = a.mo50657e(0)) == null)) {
            this.f13220j.getListener().onIAPEvent(this.f13220j, e, C6235c0.m15083d(f, "engagement_type"));
        }
        c.mo50609a(this.f13315a);
        if (this.f13220j != null) {
            c.mo50621f().remove(this.f13220j.mo50344b());
            if (this.f13220j.getListener() != null) {
                this.f13220j.getListener().onClosed(this.f13220j);
                this.f13220j.mo50339a((C6223c) null);
                this.f13220j.setListener((AdColonyInterstitialListener) null);
            }
            this.f13220j.mo50367o();
            this.f13220j = null;
        }
        C6313i iVar = this.f13221k;
        if (iVar != null) {
            iVar.mo50737a();
            this.f13221k = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f13220j;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.mo50355f();
        }
        this.f13316b = i;
        super.onCreate(bundle);
        if (C6185a.m14890d() && (adColonyInterstitial = this.f13220j) != null) {
            C6401p0 e = adColonyInterstitial.mo50353e();
            if (e != null) {
                e.mo50899a(this.f13315a);
            }
            this.f13221k = new C6313i(new Handler(Looper.getMainLooper()), this.f13220j);
            if (this.f13220j.getListener() != null) {
                this.f13220j.getListener().onOpened(this.f13220j);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
