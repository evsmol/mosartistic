package com.appodeal.ads;

import android.view.View;
import com.appodeal.ads.Native;
import com.appodeal.ads.utils.C9618d0;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.C9623a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.appodeal.ads.m2 */
public final class C9275m2 implements C9618d0.C9621b {

    /* renamed from: a */
    public final /* synthetic */ C9263l2 f23341a;

    public C9275m2(C9263l2 l2Var) {
        this.f23341a = l2Var;
    }

    /* renamed from: a */
    public final void mo60131a() {
        C9263l2 l2Var = this.f23341a;
        l2Var.f23308w = true;
        l2Var.f23287b.onAdImpression(l2Var.f23299n);
        l2Var.mo60116a(l2Var.f23287b.getImpressionNotifyUrls());
        C9263l2 l2Var2 = this.f23341a;
        l2Var2.f23288c.onAdShown(l2Var2.f23287b);
        C9263l2 l2Var3 = this.f23341a;
        NativeAdView nativeAdView = l2Var3.f23299n;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (nativeAdView.getTitleView() == null) {
            arrayList2.add("Title");
        } else {
            hashMap.put(nativeAdView.getTitleView(), "Title");
        }
        if (nativeAdView.getCallToActionView() == null) {
            arrayList2.add("CallToAction");
        } else {
            hashMap.put(nativeAdView.getCallToActionView(), "CallToAction");
        }
        if (nativeAdView.getNativeIconView() == null && nativeAdView.getNativeMediaView() == null) {
            arrayList2.add("NativeIconView/NativeMediaView");
        } else {
            if (Native.f22733c != Native.MediaAssetType.IMAGE) {
                hashMap.put(nativeAdView.getNativeIconView(), "NativeIconView");
            } else if (nativeAdView.getNativeIconView() != null) {
                arrayList.add("NativeIconView");
            }
            if (Native.f22733c != Native.MediaAssetType.ICON) {
                hashMap.put(nativeAdView.getNativeMediaView(), "NativeMediaView");
            } else if (nativeAdView.getNativeMediaView() != null) {
                arrayList.add("NativeMediaView");
            }
        }
        if (l2Var3.f23287b.obtainProviderView(nativeAdView.getContext()) != null) {
            if (nativeAdView.getProviderView() == null) {
                arrayList2.add("ProviderView");
            } else {
                hashMap.put(nativeAdView.getProviderView(), "ProviderView");
            }
        }
        if (!arrayList2.isEmpty()) {
            Log.log(new C9623a(String.format("Required assets: %s are not added to NativeAdView", new Object[]{arrayList2})));
        }
        if (!arrayList.isEmpty()) {
            Log.log(new C9623a(String.format("Non necessary assets: %s are not added to NativeAdView", new Object[]{arrayList})));
        }
        HashMap hashMap2 = (HashMap) C9263l2.m27437a(C9326n5.m27527a((View) nativeAdView), (View) nativeAdView, hashMap);
        if (!hashMap2.isEmpty()) {
            Log.log(new C9623a(String.format("Required assets: %s are not visible or not found", new Object[]{hashMap2.values()})));
        }
    }

    /* renamed from: b */
    public final void mo60132b() {
        C9263l2 l2Var = this.f23341a;
        l2Var.f23287b.onAdFinish();
        l2Var.mo60116a(l2Var.f23287b.getFinishNotifyUrls());
        C9263l2 l2Var2 = this.f23341a;
        l2Var2.f23288c.onAdFinished(l2Var2.f23287b);
    }
}
