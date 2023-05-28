package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends C6201b {

    /* renamed from: j */
    AdColonyAdView f13177j;

    public AdColonyAdViewActivity() {
        AdColonyAdView adColonyAdView;
        if (!C6185a.m14890d()) {
            adColonyAdView = null;
        } else {
            adColonyAdView = C6185a.m14887b().mo50800k();
        }
        this.f13177j = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo50266b() {
        ViewParent parent = this.f13315a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f13315a);
        }
        this.f13177j.mo50237a();
        C6185a.m14887b().mo50777a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo50267c() {
        this.f13177j.mo50238b();
    }

    public void onBackPressed() {
        mo50266b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C6185a.m14890d() || (adColonyAdView = this.f13177j) == null) {
            C6185a.m14887b().mo50777a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f13316b = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f13177j.mo50238b();
        AdColonyAdViewListener listener = this.f13177j.getListener();
        if (listener != null) {
            listener.onOpened(this.f13177j);
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
