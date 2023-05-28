package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.C8656R;

public class MaxHybridNativeAdActivity extends C8640b {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public MaxNativeAdView f21832c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58004a(C8072c cVar, final MaxNativeAd maxNativeAd, C8490n nVar, MaxAdapterListener maxAdapterListener) {
        super.mo58009a(cVar, nVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(C8656R.layout.max_hybrid_native_ad_view).setTitleTextViewId(C8656R.C8660id.applovin_native_title_text_view).setBodyTextViewId(C8656R.C8660id.applovin_native_body_text_view).setAdvertiserTextViewId(C8656R.C8660id.applovin_native_advertiser_text_view).setIconImageViewId(C8656R.C8660id.applovin_native_icon_image_view).setMediaContentViewGroupId(C8656R.C8660id.applovin_native_media_content_view).setOptionsContentViewGroupId(C8656R.C8660id.applovin_native_options_view).setCallToActionButtonId(C8656R.C8660id.applovin_native_cta_button).build(), (Context) this);
        this.f21832c = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        C86371 r1 = new Runnable() {
            public void run() {
                if (!maxNativeAd.prepareForInteraction(MaxHybridNativeAdActivity.this.f21832c.getClickableViews(), MaxHybridNativeAdActivity.this.f21832c)) {
                    maxNativeAd.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f21832c);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(r1);
        } else {
            nVar.mo57337V().mo57228a((C8401a) new C8458z(nVar, r1), C8432o.C8434a.MEDIATION_MAIN);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(16908290)).addView(this.f21832c);
        this.f21836a.bringToFront();
    }
}
