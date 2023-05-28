package com.appodeal.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.native_ad.views.NativeAdViewContainer;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.utils.C9618d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class NativeAdView extends NativeAdViewContainer {

    /* renamed from: c */
    public View f22739c;

    /* renamed from: d */
    public View f22740d;

    /* renamed from: e */
    public View f22741e;

    /* renamed from: f */
    public View f22742f;

    /* renamed from: g */
    public View f22743g;

    /* renamed from: h */
    public NativeIconView f22744h;

    /* renamed from: i */
    public NativeMediaView f22745i;

    /* renamed from: j */
    public C9263l2 f22746j;

    public NativeAdView(Context context) {
        super(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void destroy() {
        C9204h1.f23145j.mo59986a((String) null);
        C9263l2 l2Var = this.f22746j;
        if (l2Var != null) {
            l2Var.destroy();
        }
    }

    public View getCallToActionView() {
        return this.f22740d;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList();
        View view = this.f22739c;
        if (view != null) {
            arrayList.add(view);
        }
        View view2 = this.f22742f;
        if (view2 != null) {
            arrayList.add(view2);
        }
        View view3 = this.f22740d;
        if (view3 != null) {
            arrayList.add(view3);
        }
        View view4 = this.f22741e;
        if (view4 != null) {
            arrayList.add(view4);
        }
        NativeIconView nativeIconView = this.f22744h;
        if (nativeIconView != null) {
            arrayList.add(nativeIconView);
        }
        NativeMediaView nativeMediaView = this.f22745i;
        if (nativeMediaView != null) {
            arrayList.add(nativeMediaView);
        }
        return arrayList;
    }

    public View getDescriptionView() {
        return this.f22742f;
    }

    public View getNativeIconView() {
        return this.f22744h;
    }

    public NativeMediaView getNativeMediaView() {
        return this.f22745i;
    }

    public View getProviderView() {
        return this.f22743g;
    }

    public View getRatingView() {
        return this.f22741e;
    }

    public View getTitleView() {
        return this.f22739c;
    }

    public void registerView(NativeAd nativeAd) {
        registerView(nativeAd, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public void registerView(NativeAd nativeAd, String str) {
        Timer timer;
        Timer timer2;
        C9204h1.f23143h.mo59985a();
        NativeIconView nativeIconView = this.f22744h;
        if (nativeIconView != null) {
            nativeIconView.removeAllViews();
        }
        NativeMediaView nativeMediaView = this.f22745i;
        if (nativeMediaView != null) {
            nativeMediaView.removeAllViews();
        }
        C9263l2 l2Var = this.f22746j;
        if (l2Var != null) {
            NativeAdView nativeAdView = l2Var.f23299n;
            if (nativeAdView != null) {
                nativeAdView.setOnClickListener((View.OnClickListener) null);
                for (View next : nativeAdView.getClickableViews()) {
                    if (!(next instanceof C9195g2)) {
                        next.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap = C9618d0.f24378a;
            synchronized (hashMap) {
                C9618d0.C9619a aVar = (C9618d0.C9619a) hashMap.get(l2Var);
                if (aVar != null) {
                    aVar.mo61078b();
                    hashMap.remove(l2Var);
                }
            }
            C9195g2 g2Var = l2Var.f23300o;
            if (!(g2Var == null || (timer2 = g2Var.f23107i) == null)) {
                timer2.cancel();
                g2Var.f23107i = null;
            }
            UnifiedNativeAd unifiedNativeAd = l2Var.f23287b;
            if (unifiedNativeAd != null) {
                unifiedNativeAd.onUnregisterForInteraction();
            }
        }
        C9263l2 l2Var2 = (C9263l2) nativeAd;
        this.f22746j = l2Var2;
        if (l2Var2 != null) {
            NativeAdView nativeAdView2 = l2Var2.f23299n;
            if (nativeAdView2 != null) {
                nativeAdView2.setOnClickListener((View.OnClickListener) null);
                for (View next2 : nativeAdView2.getClickableViews()) {
                    if (!(next2 instanceof C9195g2)) {
                        next2.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap2 = C9618d0.f24378a;
            synchronized (hashMap2) {
                C9618d0.C9619a aVar2 = (C9618d0.C9619a) hashMap2.get(l2Var2);
                if (aVar2 != null) {
                    aVar2.mo61078b();
                    hashMap2.remove(l2Var2);
                }
            }
            C9195g2 g2Var2 = l2Var2.f23300o;
            if (!(g2Var2 == null || (timer = g2Var2.f23107i) == null)) {
                timer.cancel();
                g2Var2.f23107i = null;
            }
            UnifiedNativeAd unifiedNativeAd2 = l2Var2.f23287b;
            if (unifiedNativeAd2 != null) {
                unifiedNativeAd2.onUnregisterForInteraction();
            }
        }
        NativeIconView nativeIconView2 = this.f22744h;
        if (nativeIconView2 != null) {
            this.f22746j.mo60114a(nativeIconView2);
        }
        NativeMediaView nativeMediaView2 = this.f22745i;
        if (nativeMediaView2 != null) {
            this.f22746j.mo60115a(nativeMediaView2);
        }
        this.f22746j.mo60113a(this, str);
    }

    public void setCallToActionView(View view) {
        C9204h1.f23137b.mo59986a((String) null);
        this.f22740d = view;
    }

    public void setDescriptionView(View view) {
        C9204h1.f23139d.mo59986a((String) null);
        this.f22742f = view;
    }

    public void setNativeIconView(NativeIconView nativeIconView) {
        C9204h1.f23141f.mo59986a((String) null);
        this.f22744h = nativeIconView;
    }

    public void setNativeMediaView(NativeMediaView nativeMediaView) {
        C9204h1.f23142g.mo59986a((String) null);
        this.f22745i = nativeMediaView;
    }

    public void setProviderView(View view) {
        C9204h1.f23140e.mo59986a((String) null);
        this.f22743g = view;
    }

    public void setRatingView(View view) {
        C9204h1.f23138c.mo59986a((String) null);
        this.f22741e = view;
    }

    public void setTitleView(View view) {
        C9204h1.f23136a.mo59986a((String) null);
        this.f22739c = view;
    }

    public void unregisterViewForInteraction() {
        Timer timer;
        C9204h1.f23144i.mo59986a((String) null);
        C9263l2 l2Var = this.f22746j;
        if (l2Var != null) {
            NativeAdView nativeAdView = l2Var.f23299n;
            if (nativeAdView != null) {
                nativeAdView.setOnClickListener((View.OnClickListener) null);
                for (View next : nativeAdView.getClickableViews()) {
                    if (!(next instanceof C9195g2)) {
                        next.setOnClickListener((View.OnClickListener) null);
                    }
                }
            }
            HashMap hashMap = C9618d0.f24378a;
            synchronized (hashMap) {
                C9618d0.C9619a aVar = (C9618d0.C9619a) hashMap.get(l2Var);
                if (aVar != null) {
                    aVar.mo61078b();
                    hashMap.remove(l2Var);
                }
            }
            C9195g2 g2Var = l2Var.f23300o;
            if (!(g2Var == null || (timer = g2Var.f23107i) == null)) {
                timer.cancel();
                g2Var.f23107i = null;
            }
            UnifiedNativeAd unifiedNativeAd = l2Var.f23287b;
            if (unifiedNativeAd != null) {
                unifiedNativeAd.onUnregisterForInteraction();
            }
        }
    }
}
