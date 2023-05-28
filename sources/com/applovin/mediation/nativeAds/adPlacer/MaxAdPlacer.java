package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.nativeAds.p250a.C8289a;
import com.applovin.impl.mediation.nativeAds.p250a.C8290b;
import com.applovin.impl.mediation.p234a.C8073d;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;

public class MaxAdPlacer implements C8290b.C8291a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f21893a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f21894b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8289a f21895c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8290b f21896d;

    /* renamed from: e */
    private Listener f21897e;
    protected final C8626v logger;
    protected final C8490n sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f21893a = AppLovinSdkUtils.Size.ZERO;
        C8490n nVar = appLovinSdk.coreSdk;
        this.sdk = nVar;
        this.logger = nVar.mo57320D();
        this.f21895c = new C8289a(maxAdPlacerSettings);
        this.f21896d = new C8290b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        if (C8626v.m26252a()) {
            C8626v vVar = this.logger;
            vVar.mo57818b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* renamed from: a */
    private void m26326a() {
        int a;
        while (this.f21896d.mo56700b() && (a = this.f21895c.mo56681a()) != -1) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.logger;
                vVar.mo57818b("MaxAdPlacer", "Placing ad at position: " + a);
            }
            this.f21895c.mo56683a(this.f21896d.mo56702d(), a);
            Listener listener = this.f21897e;
            if (listener != null) {
                listener.onAdLoaded(a);
            }
        }
    }

    /* renamed from: a */
    private void m26327a(Collection<Integer> collection, Runnable runnable) {
        for (Integer intValue : collection) {
            this.f21896d.mo56698a(this.f21895c.mo56689c(intValue.intValue()));
        }
        runnable.run();
        if (!collection.isEmpty()) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.logger;
                vVar.mo57818b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
            }
            if (this.f21897e != null) {
                for (Integer intValue2 : collection) {
                    this.f21897e.onAdRemoved(intValue2.intValue());
                }
            }
        }
    }

    public void clearAds() {
        m26327a(this.f21895c.mo56686b(), new Runnable() {
            public void run() {
                C8626v vVar = MaxAdPlacer.this.logger;
                if (C8626v.m26252a()) {
                    MaxAdPlacer.this.logger.mo57818b("MaxAdPlacer", "Clearing all cached ads");
                }
                MaxAdPlacer.this.f21895c.mo56690c();
                MaxAdPlacer.this.f21896d.mo56703e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> d = this.f21895c.mo56691d(i);
        if (!d.isEmpty()) {
            m26327a(d, new Runnable() {
                public void run() {
                    C8626v vVar = MaxAdPlacer.this.logger;
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = MaxAdPlacer.this.logger;
                        vVar2.mo57818b("MaxAdPlacer", "Clearing trailing ads after position " + i);
                    }
                    MaxAdPlacer.this.f21895c.mo56684a((Collection<Integer>) d);
                }
            });
        }
        return d;
    }

    public void destroy() {
        if (C8626v.m26252a()) {
            this.logger.mo57818b("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f21896d.mo56697a();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return (long) (-System.identityHashCode(this.f21895c.mo56689c(i)));
        }
        return 0;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        if (isFilledPosition(i)) {
            boolean z = this.f21893a != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z ? this.f21893a.getWidth() : 360, i2);
            C8073d dVar = (C8073d) this.f21895c.mo56689c(i);
            if ("small_template_1".equalsIgnoreCase(dVar.mo56130A())) {
                return new AppLovinSdkUtils.Size(min, z ? this.f21893a.getHeight() : 120);
            } else if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(dVar.mo56130A())) {
                return new AppLovinSdkUtils.Size(min, (int) (((double) min) / (z ? ((double) this.f21893a.getWidth()) / ((double) this.f21893a.getHeight()) : 1.2d)));
            } else if (z) {
                return this.f21893a;
            } else {
                if (dVar.mo56113z() != null) {
                    View mainView = dVar.mo56113z().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f21895c.mo56692e(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f21895c.mo56693f(i);
    }

    public int getOriginalPosition(int i) {
        return this.f21895c.mo56694g(i);
    }

    public void insertItem(int i) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.logger;
            vVar.mo57818b("MaxAdPlacer", "Inserting item at position: " + i);
        }
        this.f21895c.mo56695h(i);
    }

    public boolean isAdPosition(int i) {
        return this.f21895c.mo56685a(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f21895c.mo56688b(i);
    }

    public void loadAds() {
        if (C8626v.m26252a()) {
            this.logger.mo57818b("MaxAdPlacer", "Loading ads");
        }
        this.f21896d.mo56701c();
    }

    public void moveItem(int i, int i2) {
        this.f21895c.mo56687b(i, i2);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f21897e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f21897e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.logger;
            vVar.mo57822e("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    public void onNativeAdLoaded() {
        if (C8626v.m26252a()) {
            this.logger.mo57818b("MaxAdPlacer", "Native ad enqueued");
        }
        m26326a();
    }

    public void removeItem(final int i) {
        m26327a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.emptyList(), new Runnable() {
            public void run() {
                C8626v vVar = MaxAdPlacer.this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = MaxAdPlacer.this.logger;
                    vVar2.mo57818b("MaxAdPlacer", "Removing item at position: " + i);
                }
                MaxAdPlacer.this.f21895c.mo56696i(i);
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void renderAd(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.nativeAds.a.a r0 = r6.f21895c
            com.applovin.mediation.MaxAd r0 = r0.mo56689c(r7)
            java.lang.String r1 = "MaxAdPlacer"
            if (r0 != 0) goto L_0x0027
            boolean r8 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r8 == 0) goto L_0x0026
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An ad is not available for position: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.mo57818b(r1, r7)
        L_0x0026:
            return
        L_0x0027:
            r2 = r0
            com.applovin.impl.mediation.a.d r2 = (com.applovin.impl.mediation.p234a.C8073d) r2
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = r2.mo56113z()
            if (r2 == 0) goto L_0x004d
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Using pre-rendered ad at position: "
        L_0x003f:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.mo57818b(r1, r7)
            goto L_0x0090
        L_0x004d:
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r2 = r6.f21894b
            java.lang.String r3 = "Unable to render ad at position: "
            if (r2 == 0) goto L_0x00b8
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = new com.applovin.mediation.nativeAds.MaxNativeAdView
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r6.f21894b
            android.content.Context r5 = r8.getContext()
            r2.<init>((com.applovin.mediation.nativeAds.MaxNativeAdViewBinder) r4, (android.content.Context) r5)
            com.applovin.impl.mediation.nativeAds.a.b r4 = r6.f21896d
            boolean r0 = r4.mo56699a(r2, r0)
            if (r0 == 0) goto L_0x0076
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Rendered ad at position: "
            goto L_0x003f
        L_0x0076:
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x0090
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r0.mo57822e(r1, r7)
        L_0x0090:
            int r7 = r8.getChildCount()
        L_0x0094:
            if (r7 < 0) goto L_0x00a4
            android.view.View r0 = r8.getChildAt(r7)
            boolean r0 = r0 instanceof com.applovin.mediation.nativeAds.MaxNativeAdView
            if (r0 == 0) goto L_0x00a1
            r8.removeViewAt(r7)
        L_0x00a1:
            int r7 = r7 + -1
            goto L_0x0094
        L_0x00a4:
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L_0x00b3
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r2)
        L_0x00b3:
            r7 = -1
            r8.addView(r2, r7, r7)
            return
        L_0x00b8:
            boolean r8 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r8 == 0) goto L_0x00d7
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r7 = ". If you're using a custom ad template, check that nativeAdViewBinder is set."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.mo57822e(r1, r7)
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.renderAd(int, android.view.ViewGroup):void");
    }

    public void setAdSize(int i, int i2) {
        this.f21893a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f21897e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f21894b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f21895c.mo56682a(i, i2);
        if (i != -1 && i2 != -1) {
            m26326a();
        }
    }
}
