package com.appodeal.ads.native_ad.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.NativeIconView;
import com.appodeal.ads.NativeMediaView;

public abstract class NativeAdView extends com.appodeal.ads.NativeAdView {

    /* renamed from: k */
    public RelativeLayout f23588k;

    /* renamed from: l */
    public RelativeLayout f23589l;

    /* renamed from: m */
    public TextView f23590m;

    /* renamed from: n */
    public LinearLayout f23591n;

    /* renamed from: o */
    public NativeAd f23592o;

    /* renamed from: p */
    public Context f23593p;

    /* renamed from: q */
    public boolean f23594q;

    /* renamed from: r */
    public int f23595r;

    /* renamed from: s */
    public boolean f23596s;

    /* renamed from: t */
    public String f23597t;

    public NativeAdView(Context context) {
        super(context);
        this.f23594q = false;
        this.f23596s = false;
        this.f23597t = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.f23593p = context;
        mo60340a();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23594q = false;
        this.f23596s = false;
        this.f23597t = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.f23593p = context;
        mo60340a();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23594q = false;
        this.f23596s = false;
        this.f23597t = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.f23593p = context;
        mo60340a();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f23594q = false;
        this.f23596s = false;
        this.f23597t = RewardedVideo.VIDEO_MODE_DEFAULT;
        this.f23593p = context;
        mo60340a();
    }

    public NativeAdView(Context context, NativeAd nativeAd, String str) {
        super(context);
        this.f23594q = false;
        this.f23596s = false;
        this.f23593p = context;
        this.f23592o = nativeAd;
        this.f23597t = str;
        mo60340a();
    }

    /* renamed from: a */
    public void mo60340a() {
    }

    /* renamed from: b */
    public final void mo60341b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(2, ((TextView) this.f22740d).getCurrentTextColor());
        gradientDrawable.setCornerRadius(8.0f);
        this.f22740d.setBackground(gradientDrawable);
    }

    /* renamed from: c */
    public final void mo60342c() {
        int i;
        TextView textView;
        TextView textView2 = this.f23590m;
        if (textView2 != null) {
            if (this.f23596s) {
                textView2.setText("Sponsored");
                this.f23590m.setBackgroundColor(0);
                textView = this.f23590m;
                i = -3355444;
            } else {
                textView2.setText(" Ad ");
                this.f23590m.setBackgroundColor(Color.parseColor("#fcb41c"));
                textView = this.f23590m;
                i = -1;
            }
            textView.setTextColor(i);
        }
    }

    public TextView getCallToActionView() {
        return (TextView) this.f22740d;
    }

    public TextView getDescriptionView() {
        return (TextView) this.f22742f;
    }

    public NativeIconView getNativeIconView() {
        return this.f22744h;
    }

    public NativeMediaView getNativeMediaView() {
        return this.f22745i;
    }

    public RatingBar getRatingBar() {
        return (RatingBar) this.f22741e;
    }

    public TextView getTitleView() {
        return (TextView) this.f22739c;
    }

    public void setCallToActionColor(int i) {
        ((TextView) this.f22740d).setTextColor(i);
        mo60341b();
    }

    public void setCallToActionColor(String str) {
        try {
            ((TextView) this.f22740d).setTextColor(Color.parseColor(str));
        } catch (Exception unused) {
        }
        mo60341b();
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f23592o = nativeAd;
        mo60340a();
    }

    public void setPlacement(String str) {
        this.f23597t = str;
    }

    public void showSponsored(boolean z) {
        this.f23596s = z;
        mo60342c();
    }
}
