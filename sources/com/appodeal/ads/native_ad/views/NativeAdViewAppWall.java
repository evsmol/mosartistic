package com.appodeal.ads.native_ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.C9182f1;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.NativeIconView;

public class NativeAdViewAppWall extends NativeAdView {
    public NativeAdViewAppWall(Context context) {
        super(context);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NativeAdViewAppWall(Context context, NativeAd nativeAd) {
        super(context, nativeAd, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public NativeAdViewAppWall(Context context, NativeAd nativeAd, String str) {
        super(context, nativeAd, str);
    }

    /* renamed from: a */
    public final void mo60340a() {
        if (!this.f23594q) {
            TypedArray obtainStyledAttributes = this.f23593p.obtainStyledAttributes(new int[]{16843534});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setBackground(drawable);
            this.f23588k = new RelativeLayout(this.f23593p);
            this.f23588k.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            int round = Math.round(C9182f1.m27290l(this.f23593p) * 5.0f);
            this.f23588k.setPadding(round, round, round, round);
            this.f23588k.setVisibility(8);
            addView(this.f23588k);
            LinearLayout linearLayout = new LinearLayout(this.f23593p);
            this.f23591n = linearLayout;
            linearLayout.setOrientation(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            this.f23591n.setLayoutParams(layoutParams);
            this.f23591n.setId(View.generateViewId());
            this.f23588k.addView(this.f23591n);
            TextView textView = new TextView(this.f23593p);
            this.f23590m = textView;
            textView.setTextSize(2, 10.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.f23590m.setLayoutParams(layoutParams2);
            mo60342c();
            this.f23591n.addView(this.f23590m);
            this.f23589l = new RelativeLayout(this.f23593p);
            this.f23589l.setLayoutParams(new RelativeLayout.LayoutParams(-2, Math.round(C9182f1.m27290l(this.f23593p) * 20.0f)));
            this.f23591n.addView(this.f23589l);
            this.f22744h = new NativeIconView(this.f23593p);
            this.f23595r = Math.round(C9182f1.m27290l(this.f23593p) * 70.0f);
            int i = this.f23595r;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i, i);
            layoutParams3.setMargins(0, 0, Math.round(C9182f1.m27290l(this.f23593p) * 10.0f), 0);
            layoutParams3.addRule(10);
            layoutParams3.addRule(9);
            this.f22744h.setLayoutParams(layoutParams3);
            this.f22744h.setId(View.generateViewId());
            this.f23588k.addView(this.f22744h);
            TextView textView2 = new TextView(this.f23593p);
            this.f22739c = textView2;
            TextView textView3 = textView2;
            textView2.setTextSize(2, 16.0f);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.setMargins(0, 0, 0, Math.round(C9182f1.m27290l(this.f23593p) * 5.0f));
            layoutParams4.addRule(1, this.f22744h.getId());
            layoutParams4.addRule(0, this.f23591n.getId());
            this.f22739c.setLayoutParams(layoutParams4);
            this.f22739c.setId(View.generateViewId());
            this.f23588k.addView(this.f22739c);
            this.f22740d = new TextView(this.f23593p);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            int round2 = Math.round(C9182f1.m27290l(this.f23593p) * 3.0f);
            int round3 = Math.round(C9182f1.m27290l(this.f23593p) * 5.0f);
            layoutParams5.setMargins(round2, 0, 3, 3);
            layoutParams5.addRule(11);
            layoutParams5.addRule(15);
            this.f22740d.setLayoutParams(layoutParams5);
            this.f22740d.setPadding(round3, round3, round3, round3);
            this.f22740d.setId(View.generateViewId());
            mo60341b();
            this.f23588k.addView(this.f22740d);
            TextView textView4 = new TextView(this.f23593p);
            this.f22742f = textView4;
            TextView textView5 = textView4;
            textView4.setTextSize(2, 12.0f);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams6.setMargins(0, 0, 0, Math.round(C9182f1.m27290l(this.f23593p) * 5.0f));
            layoutParams6.addRule(1, this.f22744h.getId());
            layoutParams6.addRule(0, this.f22740d.getId());
            layoutParams6.addRule(3, this.f22739c.getId());
            this.f22742f.setLayoutParams(layoutParams6);
            ((TextView) this.f22742f).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f22742f).setMaxLines(3);
            ((TextView) this.f22742f).setMinLines(3);
            this.f22742f.setId(View.generateViewId());
            this.f23588k.addView(this.f22742f);
            RatingBar ratingBar = new RatingBar(this.f23593p, (AttributeSet) null, 16842877);
            this.f22741e = ratingBar;
            ratingBar.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams7.addRule(1, this.f22744h.getId());
            layoutParams7.addRule(3, this.f22742f.getId());
            this.f22741e.setLayoutParams(layoutParams7);
            this.f22741e.setId(View.generateViewId());
            this.f23588k.addView(this.f22741e);
            this.f23594q = true;
        }
        NativeAd nativeAd = this.f23592o;
        if (nativeAd != null) {
            ((TextView) this.f22739c).setText(nativeAd.getTitle());
            ((TextView) this.f22742f).setText(this.f23592o.getDescription());
            if (this.f23592o.getRating() > 0.0f) {
                ((RatingBar) this.f22741e).setRating(this.f23592o.getRating());
                this.f22741e.setVisibility(0);
            } else {
                this.f22741e.setVisibility(8);
            }
            if (this.f23592o.getCallToAction() == null || this.f23592o.getCallToAction().isEmpty() || this.f23592o.getCallToAction().equals("")) {
                this.f22740d.setVisibility(8);
            } else {
                ((TextView) this.f22740d).setText(this.f23592o.getCallToAction());
                this.f22740d.setVisibility(0);
            }
            View providerView = this.f23592o.getProviderView(this.f23593p);
            this.f22743g = providerView;
            if (providerView != null) {
                if (providerView.getParent() != null && (this.f22743g.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f22743g.getParent()).removeView(this.f22743g);
                }
                this.f23589l.removeAllViews();
                this.f23589l.addView(this.f22743g, new ViewGroup.LayoutParams(-2, -2));
            } else {
                RelativeLayout relativeLayout = this.f23589l;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
            }
            registerView(this.f23592o, this.f23597t);
            this.f23588k.setVisibility(0);
        }
    }
}
