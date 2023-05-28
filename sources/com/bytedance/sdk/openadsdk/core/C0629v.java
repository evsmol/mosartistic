package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10644q;
import com.bytedance.sdk.component.utils.C10651w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.common.C0205b;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C0586d;
import com.bytedance.sdk.openadsdk.core.p015a.C0382b;
import com.bytedance.sdk.openadsdk.core.p015a.C0385c;
import com.bytedance.sdk.openadsdk.core.p015a.C0388d;
import com.bytedance.sdk.openadsdk.core.p015a.C0392e;
import com.bytedance.sdk.openadsdk.core.p015a.C0395f;
import com.bytedance.sdk.openadsdk.core.p015a.C0398g;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p022f.C0489a;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0995t;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.v */
/* compiled from: TTAdNativeImpl */
public class C0629v implements TTAdNative {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0561n f2343a = C0558m.m2671f();

    /* renamed from: b */
    private volatile Context f2344b;

    public C0629v(Context context) {
        this.f2344b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Context m3044a() {
        if (this.f2344b == null) {
            this.f2344b = C0558m.m2663a();
        }
        return this.f2344b;
    }

    public void loadFeedAd(AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        C0385c cVar = new C0385c(feedAdListener);
        final C0385c cVar2 = cVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.FeedAdListener feedAdListener2 = feedAdListener;
        m3046a(new C10618g("loadFeedAd") {
            public void run() {
                if (!C0629v.this.m3049a((C0205b) cVar2)) {
                    try {
                        C0629v.this.m3054c(adSlot2);
                        try {
                            Method a = C10651w.m31317a("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, TTAdNative.FeedAdListener.class);
                            if (a != null) {
                                a.invoke((Object) null, new Object[]{C0629v.this.m3044a(), adSlot2, cVar2});
                            }
                        } catch (Throwable th) {
                            C10638l.m31236b("TTAdNativeImpl", "feed component maybe not exist, pls check1", th);
                        }
                    } catch (Exception unused) {
                        C10638l.m31234b("Ad Slot not Valid, please check");
                        feedAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, cVar, adSlot);
    }

    public void loadNativeAd(AdSlot adSlot, TTAdNative.NativeAdListener nativeAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        adSlot.setDurationSlotType(adSlot.getNativeAdType());
        C0392e eVar = new C0392e(nativeAdListener);
        final C0392e eVar2 = eVar;
        final AdSlot adSlot2 = adSlot;
        final TTAdNative.NativeAdListener nativeAdListener2 = nativeAdListener;
        m3046a(new C10618g("loadNativeAd") {
            public void run() {
                if (!C0629v.this.m3049a((C0205b) eVar2)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    try {
                        C0629v.this.m3052b(adSlot2);
                        C0561n b = C0629v.this.f2343a;
                        AdSlot adSlot = adSlot2;
                        b.mo1840a(adSlot, (C0479o) null, adSlot.getNativeAdType(), new C0561n.C0562a() {
                            /* renamed from: a */
                            public void mo186a(int i, String str) {
                                eVar2.onError(i, str);
                            }

                            /* renamed from: a */
                            public void mo187a(C0448a aVar, C0449b bVar) {
                                if (aVar.mo1199b() == null || aVar.mo1199b().isEmpty()) {
                                    eVar2.onError(-3, C0492g.m2254a(-3));
                                    bVar.mo1204a(-3);
                                    C0449b.m1835a(bVar);
                                    return;
                                }
                                List<C0477n> b = aVar.mo1199b();
                                ArrayList arrayList = new ArrayList(b.size());
                                for (C0477n next : b) {
                                    if (next.mo1394ao()) {
                                        arrayList.add(new C0489a(C0629v.this.m3044a(), next, adSlot2.getNativeAdType()) {
                                        });
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                                        C0136e.m608a(b.get(0), C0996u.m4632b(adSlot2.getNativeAdType()), System.currentTimeMillis() - currentTimeMillis);
                                    } else {
                                        C0136e.m618b(C0629v.this.m3044a(), b.get(0), C0996u.m4632b(adSlot2.getDurationSlotType()), currentTimeMillis);
                                    }
                                    eVar2.onNativeAdLoad(arrayList);
                                    return;
                                }
                                eVar2.onError(-4, C0492g.m2254a(-4));
                                bVar.mo1204a(-4);
                                C0449b.m1835a(bVar);
                            }
                        });
                    } catch (Exception unused) {
                        C10638l.m31234b("Ad Slot not Valid, please check");
                        nativeAdListener2.onError(-1, "Ad Slot not Valid, please check");
                    }
                }
            }
        }, eVar, adSlot);
    }

    public void loadRewardVideoAd(final AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final C0398g gVar = new C0398g(rewardVideoAdListener);
        m3046a(new C10618g("loadRewardVideoAd") {
            public void run() {
                if (!C0629v.this.m3049a((C0205b) gVar)) {
                    try {
                        Method a = C10651w.m31317a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, TTAdNative.RewardVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C0629v.this.m3044a(), adSlot, gVar});
                        }
                    } catch (Throwable th) {
                        C10638l.m31236b("TTAdNativeImpl", "reward component maybe not exist, pls check1", th);
                    }
                }
            }
        }, gVar, adSlot);
    }

    public void loadFullScreenVideoAd(final AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final C0388d dVar = new C0388d(fullScreenVideoAdListener);
        m3046a(new C10618g("loadFullScreenVideoAd") {
            public void run() {
                if (!C0629v.this.m3049a((C0205b) dVar)) {
                    try {
                        Method a = C10651w.m31317a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, TTAdNative.FullScreenVideoAdListener.class);
                        if (a != null) {
                            a.invoke((Object) null, new Object[]{C0629v.this.m3044a(), adSlot, dVar});
                        }
                    } catch (Throwable th) {
                        C10638l.m31236b("TTAdNativeImpl", "reward component maybe not exist, pls check2", th);
                    }
                }
            }
        }, dVar, adSlot);
    }

    public void loadBannerExpressAd(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        final C0395f fVar = new C0395f(nativeExpressAdListener);
        m3046a(new C10618g("loadBannerExpressAd") {
            public void run() {
                if (!C0629v.this.m3049a((C0205b) fVar)) {
                    adSlot.setNativeAdType(1);
                    adSlot.setDurationSlotType(1);
                    C0586d.m2824a(C0629v.this.m3044a()).mo1956a(adSlot, 1, fVar, 5000);
                }
            }
        }, fVar, adSlot);
    }

    public void loadAppOpenAd(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        C0382b bVar = new C0382b(appOpenAdListener);
        final C0382b bVar2 = bVar;
        final AdSlot adSlot2 = adSlot;
        final int i2 = i;
        m3046a(new C10618g("loadSplashAd b") {
            public void run() {
                Method a;
                try {
                    if (!C0629v.this.m3049a((C0205b) bVar2) && (a = C10651w.m31317a("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, TTAdNative.AppOpenAdListener.class, Integer.TYPE)) != null) {
                        a.invoke((Object) null, new Object[]{C0629v.this.m3044a(), adSlot2, bVar2, Integer.valueOf(i2)});
                    }
                } catch (Throwable th) {
                    C10638l.m31239c("TTAdNativeImpl", "open component maybe not exist, please check", th);
                }
            }
        }, bVar, adSlot);
    }

    /* renamed from: a */
    private void m3047a(AdSlot adSlot) {
        boolean z = true;
        C10644q.m31267a(adSlot.getImgAcceptedWidth() > 0, "Image material size must be set");
        if (adSlot.getImgAcceptedHeight() <= 0) {
            z = false;
        }
        C10644q.m31267a(z, "Image material size must be set");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3052b(AdSlot adSlot) {
        m3047a(adSlot);
        C10644q.m31267a(adSlot.getNativeAdType() > 0, "Must set the type of requesting native ads, currently supports TYPE_BANNER and TYPE_INTERACTION_AD");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m3054c(AdSlot adSlot) {
        m3047a(adSlot);
        C10644q.m31267a(adSlot.getNativeAdType() == 0, "Request the type of non-native ad, please do not call the setNativeAdType() method");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m3049a(C0205b bVar) {
        if (C0515e.m2397a()) {
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    /* renamed from: a */
    private void m3046a(final C10618g gVar, final C0205b bVar, final AdSlot adSlot) {
        C06387 r0 = new Runnable() {
            public void run() {
                int e = C0547k.m2623e();
                if (e == 0 || e == 2) {
                    C10638l.m31242e("TTAdNativeImpl", "please exec TTAdSdk.init before load ad");
                    C0205b bVar = bVar;
                    if (bVar != null) {
                        bVar.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                C0136e.m605a(adSlot);
                C0547k.m2621c().post(gVar);
            }
        };
        if (C0995t.m4608a()) {
            C10615e.m31156a().execute(r0);
        } else {
            r0.run();
        }
    }
}
