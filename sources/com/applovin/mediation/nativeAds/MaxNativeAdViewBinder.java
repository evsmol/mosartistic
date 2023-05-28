package com.applovin.mediation.nativeAds;

import android.view.View;

public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a */
        private final View f21880a;

        /* renamed from: b */
        private final int f21881b;

        /* renamed from: c */
        private int f21882c;

        /* renamed from: d */
        private int f21883d;

        /* renamed from: e */
        private int f21884e;

        /* renamed from: f */
        private int f21885f;

        /* renamed from: g */
        private int f21886g;

        /* renamed from: h */
        private int f21887h;

        /* renamed from: i */
        private int f21888i;

        /* renamed from: j */
        private int f21889j;

        /* renamed from: k */
        private int f21890k;

        /* renamed from: l */
        private int f21891l;

        /* renamed from: m */
        private String f21892m;

        public Builder(int i) {
            this(i, (View) null);
        }

        private Builder(int i, View view) {
            this.f21882c = -1;
            this.f21883d = -1;
            this.f21884e = -1;
            this.f21885f = -1;
            this.f21886g = -1;
            this.f21887h = -1;
            this.f21888i = -1;
            this.f21889j = -1;
            this.f21890k = -1;
            this.f21891l = -1;
            this.f21881b = i;
            this.f21880a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f21880a, this.f21881b, this.f21882c, this.f21883d, this.f21884e, this.f21885f, this.f21886g, this.f21887h, this.f21888i, this.f21889j, this.f21890k, this.f21891l, this.f21892m);
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.f21883d = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.f21884e = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.f21891l = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i) {
            this.f21886g = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.f21885f = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i) {
            this.f21890k = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.f21889j = i;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i) {
            this.f21888i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.f21887h = i;
            return this;
        }

        /* access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f21892m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.f21882c = i;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.optionsContentViewGroupId = i7;
        this.optionsContentFrameLayoutId = i8;
        this.mediaContentViewGroupId = i9;
        this.mediaContentFrameLayoutId = i10;
        this.callToActionButtonId = i11;
        this.templateType = str;
    }
}
