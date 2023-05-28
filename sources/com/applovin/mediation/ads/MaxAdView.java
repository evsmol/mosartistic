package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.utils.C8565c;
import com.applovin.impl.sdk.utils.C8619r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxAdView extends RelativeLayout {

    /* renamed from: a */
    private MaxAdViewImpl f21819a;

    /* renamed from: b */
    private View f21820b;

    /* renamed from: c */
    private int f21821c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String a = C8565c.m26062a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a2 = C8565c.m26062a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(a2) ? MaxAdFormat.formatFromString(a2) : C8565c.m26060a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (isInEditMode()) {
            m26294a(context);
        } else {
            m26295a(a, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
        }
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        C8105a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        m26295a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, C8565c.m26060a(context), appLovinSdk, context);
    }

    /* renamed from: a */
    private void m26294a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    /* renamed from: a */
    private void m26295a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f21820b = view;
        view.setBackgroundColor(0);
        addView(this.f21820b);
        this.f21820b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f21821c = getVisibility();
        this.f21819a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f21820b, appLovinSdk.coreSdk, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f21819a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f21819a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f21819a.getAdUnitId();
    }

    public String getPlacement() {
        this.f21819a.logApiCall("getPlacement()");
        return this.f21819a.getPlacement();
    }

    public void loadAd() {
        this.f21819a.logApiCall("loadAd()");
        this.f21819a.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!isInEditMode()) {
            MaxAdViewImpl maxAdViewImpl = this.f21819a;
            maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
            if (this.f21819a != null && C8619r.m26225a(this.f21821c, i)) {
                this.f21819a.onWindowVisibilityChanged(i);
            }
            this.f21821c = i;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f21819a.setAdReviewListener(maxAdReviewListener);
    }

    public void setAlpha(float f) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f21820b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f21819a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.f21820b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f21819a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f21819a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f21819a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f21819a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f21819a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f21819a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f21819a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f21819a.logApiCall("startAutoRefresh()");
        this.f21819a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f21819a.logApiCall("stopAutoRefresh()");
        this.f21819a.stopAutoRefresh();
    }

    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f21819a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
