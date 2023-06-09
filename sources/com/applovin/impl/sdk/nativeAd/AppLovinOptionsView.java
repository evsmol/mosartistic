package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C8656R;

public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final C8490n sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, C8490n nVar, Context context) {
        super(context);
        this.sdk = nVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            imageView.setImageURI(privacyIconUri);
        } else {
            imageView.setImageResource(C8656R.C8659drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnTouchListener((View.OnTouchListener) null);
        removeAllViews();
    }

    public void onClick(View view) {
        Utils.openUri(this.sdk.mo57332P(), this.privacyDestinationUri, this.sdk);
    }
}
