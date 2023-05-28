package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.C7965b;
import com.applovin.impl.sdk.C8626v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C7965b f14559a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17078a((AppLovinAdSize) null, (String) null, (AppLovinSdk) null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m17078a(appLovinAdSize, str, (AppLovinSdk) null, context, (AttributeSet) null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m17078a(appLovinAdSize, str, appLovinSdk, context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m17077a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    /* renamed from: a */
    private void m17078a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            C7965b bVar = new C7965b();
            this.f14559a = bVar;
            bVar.mo55657a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
            return;
        }
        m17077a(attributeSet, context);
    }

    public void destroy() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55673f();
        }
    }

    public C7965b getController() {
        return this.f14559a;
    }

    public AppLovinAdSize getSize() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            return bVar.mo55668b();
        }
        return null;
    }

    public String getZoneId() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            return bVar.mo55670c();
        }
        return null;
    }

    public void loadNextAd() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55653a();
        } else {
            C8626v.m26256g("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55676i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55677j();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55671d();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55662a(appLovinAd);
        }
    }

    public void resume() {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55672e();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55664a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55665a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55666a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C7965b bVar = this.f14559a;
        if (bVar != null) {
            bVar.mo55658a(appLovinAdViewEventListener);
        }
    }

    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }
}
