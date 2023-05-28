package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

public class MaxNativeAd extends MaxNativeAdImpl {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final String title;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public MaxAdFormat f21848a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f21849b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f21850c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f21851d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f21852e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public MaxNativeAdImage f21853f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f21854g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View f21855h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public View f21856i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public MaxNativeAdImage f21857j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public float f21858k;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f21848a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f21850c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f21851d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f21852e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f21853f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f21854g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f21857j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f21858k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f21856i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f21855h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f21849b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* renamed from: a */
        private Drawable f21859a;

        /* renamed from: b */
        private Uri f21860b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f21859a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f21860b = uri;
        }

        public Drawable getDrawable() {
            return this.f21859a;
        }

        public Uri getUri() {
            return this.f21860b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f21848a;
        this.title = builder.f21849b;
        this.advertiser = builder.f21850c;
        this.body = builder.f21851d;
        this.callToAction = builder.f21852e;
        this.icon = builder.f21853f;
        this.iconView = builder.f21854g;
        this.optionsView = builder.f21855h;
        this.mediaView = builder.f21856i;
        this.mainImage = builder.f21857j;
        this.mediaContentAspectRatio = builder.f21858k;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }
}
