package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C8108b;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8070a;
import com.applovin.impl.mediation.p234a.C8072c;
import com.applovin.impl.sdk.C8360b;
import com.applovin.impl.sdk.C8397e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8572i;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends C8105a implements C8360b.C8362a, C8397e.C8400a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8093a f19666a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8360b f19667b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8108b f19668c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f19669d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C8072c f19670e = null;

    /* renamed from: f */
    private C8100c f19671f = C8100c.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicBoolean f19672g = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19673h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f19674i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<Activity> f19675j = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ViewGroup> f19676k = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WeakReference<Lifecycle> f19677l = new WeakReference<>((Object) null);
    protected final C8094b listenerWrapper;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface C8093a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    private class C8094b implements C8105a.C8106a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private C8094b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            C8575k.m26164d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            final boolean e = MaxFullscreenAdImpl.this.f19674i;
            boolean unused = MaxFullscreenAdImpl.this.f19674i = false;
            final C8072c cVar = (C8072c) maxAd;
            final MaxAd maxAd2 = maxAd;
            final MaxError maxError2 = maxError;
            MaxFullscreenAdImpl.this.m24206a(C8100c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m24211a(maxAd2);
                    if (e || !cVar.mo56120G() || !MaxFullscreenAdImpl.this.sdk.mo57329M().mo56297a(MaxFullscreenAdImpl.this.adUnitId)) {
                        C8575k.m26128a(MaxFullscreenAdImpl.this.adListener, maxAd2, maxError2, true);
                    } else {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                            public void run() {
                                boolean unused = MaxFullscreenAdImpl.this.f19674i = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f19666a != null ? MaxFullscreenAdImpl.this.f19666a.getActivity() : null);
                            }
                        });
                    }
                }
            });
        }

        public void onAdDisplayed(MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f19674i = false;
            MaxFullscreenAdImpl.this.f19667b.mo57052a();
            C8575k.m26155b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(final MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f19674i = false;
            MaxFullscreenAdImpl.this.f19668c.mo56261a(maxAd);
            MaxFullscreenAdImpl.this.m24206a(C8100c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m24211a(maxAd);
                    C8575k.m26161c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.m24217b();
            MaxFullscreenAdImpl.this.m24206a(C8100c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    C8575k.m26133a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m24205a((C8072c) maxAd);
            if (MaxFullscreenAdImpl.this.f19672g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.m24206a(C8100c.READY, (Runnable) new Runnable() {
                    public void run() {
                        if (MaxFullscreenAdImpl.this.f19674i) {
                            Activity activity = (Activity) MaxFullscreenAdImpl.this.f19675j.get();
                            if (activity == null) {
                                activity = MaxFullscreenAdImpl.this.sdk.mo57377ar();
                            }
                            Activity activity2 = activity;
                            if (MaxFullscreenAdImpl.this.f19673h) {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f19670e.getPlacement(), MaxFullscreenAdImpl.this.f19670e.mo56174ag(), (ViewGroup) MaxFullscreenAdImpl.this.f19676k.get(), (Lifecycle) MaxFullscreenAdImpl.this.f19677l.get(), activity2);
                            } else {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f19670e.getPlacement(), MaxFullscreenAdImpl.this.f19670e.mo56174ag(), activity2);
                            }
                        } else {
                            C8575k.m26131a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                        }
                    }
                });
            }
        }

        public void onAdRequestStarted(String str) {
            C8575k.m26135a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C8575k.m26136a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C8575k.m26168f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C8575k.m26166e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C8575k.m26130a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum C8100c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, C8093a aVar, String str2, C8490n nVar) {
        super(str, maxAdFormat, str2, nVar);
        this.f19666a = aVar;
        this.listenerWrapper = new C8094b();
        this.f19667b = new C8360b(nVar, this);
        this.f19668c = new C8108b(nVar, this.listenerWrapper);
        nVar.mo57321E().mo57162a((C8397e.C8400a) this);
        C8626v.m26255f(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* renamed from: a */
    private void m24204a() {
        C8072c cVar;
        synchronized (this.f19669d) {
            cVar = this.f19670e;
            this.f19670e = null;
        }
        this.sdk.mo57324H().destroyAd(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24205a(C8072c cVar) {
        if (this.f19667b.mo57053a((C8070a) cVar)) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.logger;
                String str = this.tag;
                vVar2.mo57818b(str, "Handle ad loaded for regular ad: " + cVar);
            }
            this.f19670e = cVar;
            return;
        }
        C8626v vVar3 = this.logger;
        if (C8626v.m26252a()) {
            this.logger.mo57818b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0192  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24206a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = r6.f19671f
            java.lang.Object r1 = r6.f19669d
            monitor-enter(r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.IDLE     // Catch:{ all -> 0x01c5 }
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0041
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0011
            goto L_0x015e
        L_0x0011:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0017
            goto L_0x015e
        L_0x0017:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0020
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "No ad is loading or loaded"
            goto L_0x0053
        L_0x0020:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
        L_0x003d:
            r0.mo57822e(r2, r3)     // Catch:{ all -> 0x01c5 }
            goto L_0x0056
        L_0x0041:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x008c
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x004b
            goto L_0x015e
        L_0x004b:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0059
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is already loading"
        L_0x0053:
            com.applovin.impl.sdk.C8626v.m26258i(r0, r2)     // Catch:{ all -> 0x01c5 }
        L_0x0056:
            r3 = 0
            goto L_0x015e
        L_0x0059:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x005f
            goto L_0x015e
        L_0x005f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0068
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is not ready to be shown yet"
            goto L_0x0053
        L_0x0068:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x006e
            goto L_0x015e
        L_0x006e:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x008c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.READY     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x00dd
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0096
            goto L_0x015e
        L_0x0096:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x009f
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "An ad is already loaded"
            goto L_0x0053
        L_0x009f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00b2
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = "An ad is already marked as ready"
            goto L_0x003d
        L_0x00b2:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00b8
            goto L_0x015e
        L_0x00b8:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00be
            goto L_0x015e
        L_0x00be:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x00dd:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x0133
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.IDLE     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00e7
            goto L_0x015e
        L_0x00e7:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.LOADING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x00f1
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "Can not load another ad while the ad is showing"
            goto L_0x0053
        L_0x00f1:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.READY     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0105
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = "An ad is already showing, ignoring"
            goto L_0x003d
        L_0x0105:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.SHOWING     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x010f
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "The ad is already showing, not showing another one"
            goto L_0x0053
        L_0x010f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r7 != r0) goto L_0x0114
            goto L_0x015e
        L_0x0114:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            r3.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x0133:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C8100c.DESTROYED     // Catch:{ all -> 0x01c5 }
            if (r0 != r2) goto L_0x013d
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = "No operations are allowed on a destroyed instance"
            goto L_0x0053
        L_0x013d:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r3.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Unknown state: "
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f19671f     // Catch:{ all -> 0x01c5 }
            r3.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c5 }
            goto L_0x003d
        L_0x015e:
            if (r3 == 0) goto L_0x0192
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x018f
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r4.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Transitioning from "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f19671f     // Catch:{ all -> 0x01c5 }
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            r4.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01c5 }
            r0.mo57818b(r2, r4)     // Catch:{ all -> 0x01c5 }
        L_0x018f:
            r6.f19671f = r7     // Catch:{ all -> 0x01c5 }
            goto L_0x01bc
        L_0x0192:
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()     // Catch:{ all -> 0x01c5 }
            if (r0 == 0) goto L_0x01bc
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01c5 }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r4.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "Not allowed transition from "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f19671f     // Catch:{ all -> 0x01c5 }
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01c5 }
            r4.append(r7)     // Catch:{ all -> 0x01c5 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x01c5 }
            r0.mo57821d(r2, r7)     // Catch:{ all -> 0x01c5 }
        L_0x01bc:
            monitor-exit(r1)     // Catch:{ all -> 0x01c5 }
            if (r3 == 0) goto L_0x01c4
            if (r8 == 0) goto L_0x01c4
            r8.run()
        L_0x01c4:
            return
        L_0x01c5:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01c5 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.m24206a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24211a(MaxAd maxAd) {
        this.f19667b.mo57052a();
        m24204a();
        this.sdk.mo57326J().mo57825b((C8070a) maxAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24212a(String str, String str2) {
        this.f19668c.mo56262b(this.f19670e);
        this.f19670e.mo56185e(str);
        this.f19670e.mo56186f(str2);
        this.sdk.mo57373an().mo55453a((Object) this.f19670e);
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str3 = this.tag;
            vVar2.mo57818b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f19670e + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo56251a(this.f19670e);
    }

    /* renamed from: a */
    private boolean m24213a(Activity activity) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        } else if (!isReady()) {
            String str = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            C8626v.m26258i(this.tag, str);
            C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-24, str), true);
            return false;
        } else {
            if (Utils.getAlwaysFinishActivitiesSetting(this.sdk.mo57332P()) != 0 && this.sdk.mo57400q().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (Utils.isPubInDebugMode(this.sdk.mo57332P(), this.sdk)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                } else if (((Boolean) this.sdk.mo57342a(C8379a.f20665T)).booleanValue()) {
                    C8626v.m26258i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.mo57342a(C8379a.f20696z)).booleanValue() && (this.sdk.mo57367ah().mo57673a() || this.sdk.mo57367ah().mo57675b())) {
                C8626v.m26258i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (!((Boolean) this.sdk.mo57342a(C8379a.f20646A)).booleanValue() || C8572i.m26102a(this.sdk.mo57332P())) {
                String str2 = this.sdk.mo57400q().getExtraParameters().get(AppLovinSdkExtraParameterKey.BLOCK_FULLSCREEN_ADS_SHOWING_IF_ACTIVITY_FINISHING);
                if ((!(StringUtils.isValidString(str2) && Boolean.valueOf(str2).booleanValue()) && !((Boolean) this.sdk.mo57342a(C8379a.f20647B)).booleanValue()) || activity == null || !activity.isFinishing()) {
                    return true;
                }
                C8626v.m26258i(this.tag, "Attempting to show ad when activity is finishing");
                C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                return false;
            } else {
                C8626v.m26258i(this.tag, "Attempting to show ad with no internet connection");
                C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24217b() {
        C8072c cVar;
        if (this.f19672g.compareAndSet(true, false)) {
            synchronized (this.f19669d) {
                cVar = this.f19670e;
                this.f19670e = null;
            }
            this.sdk.mo57324H().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void destroy() {
        m24206a(C8100c.DESTROYED, (Runnable) new Runnable() {
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f19669d) {
                    if (MaxFullscreenAdImpl.this.f19670e != null) {
                        C8626v vVar = MaxFullscreenAdImpl.this.logger;
                        if (C8626v.m26252a()) {
                            C8626v vVar2 = MaxFullscreenAdImpl.this.logger;
                            String str = MaxFullscreenAdImpl.this.tag;
                            vVar2.mo57818b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f19670e + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        MaxFullscreenAdImpl.this.sdk.mo57324H().destroyAd(MaxFullscreenAdImpl.this.f19670e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.mo57321E().mo57163b((C8397e.C8400a) MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f19669d) {
            z = this.f19670e != null && this.f19670e.mo56070e() && this.f19671f == C8100c.READY;
        }
        return z;
    }

    public void loadAd(Activity activity) {
        loadAd(activity, C8135d.C8137a.PUBLISHER_INITIATED);
    }

    public void loadAd(final Activity activity, final C8135d.C8137a aVar) {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            C8626v vVar3 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.logger;
                String str2 = this.tag;
                vVar4.mo57818b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            C8575k.m26131a(this.adListener, (MaxAd) this.f19670e, true);
            return;
        }
        m24206a(C8100c.LOADING, (Runnable) new Runnable() {
            public void run() {
                Context context = activity;
                if (context == null) {
                    context = MaxFullscreenAdImpl.this.sdk.mo57377ar() != null ? MaxFullscreenAdImpl.this.sdk.mo57377ar() : MaxFullscreenAdImpl.this.sdk.mo57332P();
                }
                MaxFullscreenAdImpl.this.sdk.mo57324H().loadAd(MaxFullscreenAdImpl.this.adUnitId, (String) null, MaxFullscreenAdImpl.this.adFormat, aVar, MaxFullscreenAdImpl.this.localExtraParameters, MaxFullscreenAdImpl.this.extraParameters, context, MaxFullscreenAdImpl.this.listenerWrapper);
            }
        });
    }

    public void onAdExpired() {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Ad expired " + getAdUnitId());
        }
        this.f19672g.set(true);
        C8093a aVar = this.f19666a;
        Activity activity = aVar != null ? aVar.getActivity() : this.sdk.mo57368ai().mo56831a();
        if (activity == null) {
            m24217b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.mo57324H().loadAd(this.adUnitId, (String) null, this.adFormat, C8135d.C8137a.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C8072c cVar = this.f19670e;
        if (cVar != null && cVar.mo56071f().equalsIgnoreCase(str)) {
            this.f19670e.mo56067b(str2);
            C8575k.m26138a(this.adReviewListener, str2, (MaxAd) this.f19670e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        String c = this.sdk.mo57330N().mo56531c();
        if (!this.sdk.mo57330N().mo56530b() || c == null || c.equals(this.f19670e.mo56152S())) {
            if (activity == null) {
                activity = this.sdk.mo57377ar();
            }
            if (m24213a(activity)) {
                m24206a(C8100c.SHOWING, (Runnable) new Runnable() {
                    public void run() {
                        MaxFullscreenAdImpl.this.m24212a(str, str2);
                        boolean unused = MaxFullscreenAdImpl.this.f19673h = false;
                        WeakReference unused2 = MaxFullscreenAdImpl.this.f19675j = new WeakReference(activity);
                        MaxFullscreenAdImpl.this.sdk.mo57324H().showFullscreenAd(MaxFullscreenAdImpl.this.f19670e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f19670e.mo56152S() + "> which does not match selected ad network <" + c + ">";
        C8626v.m26258i(this.tag, str3);
        m24206a(C8100c.IDLE, (Runnable) new Runnable() {
            public void run() {
                C8072c b = MaxFullscreenAdImpl.this.f19670e;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.m24211a((MaxAd) maxFullscreenAdImpl.f19670e);
                C8575k.m26128a(MaxFullscreenAdImpl.this.adListener, (MaxAd) b, (MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str3), true);
            }
        });
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        if (viewGroup == null || lifecycle == null) {
            C8626v.m26258i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            C8575k.m26128a(this.adListener, (MaxAd) this.f19670e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        String c = this.sdk.mo57330N().mo56531c();
        if (!this.sdk.mo57330N().mo56530b() || c == null || c.equals(this.f19670e.mo56152S())) {
            if (activity == null) {
                activity = this.sdk.mo57377ar();
            }
            final Activity activity2 = activity;
            if (m24213a(activity2)) {
                final String str3 = str;
                final String str4 = str2;
                final ViewGroup viewGroup2 = viewGroup;
                final Lifecycle lifecycle2 = lifecycle;
                m24206a(C8100c.SHOWING, (Runnable) new Runnable() {
                    public void run() {
                        MaxFullscreenAdImpl.this.m24212a(str3, str4);
                        boolean unused = MaxFullscreenAdImpl.this.f19673h = true;
                        WeakReference unused2 = MaxFullscreenAdImpl.this.f19675j = new WeakReference(activity2);
                        WeakReference unused3 = MaxFullscreenAdImpl.this.f19676k = new WeakReference(viewGroup2);
                        WeakReference unused4 = MaxFullscreenAdImpl.this.f19677l = new WeakReference(lifecycle2);
                        MaxFullscreenAdImpl.this.sdk.mo57324H().showFullscreenAd(MaxFullscreenAdImpl.this.f19670e, viewGroup2, lifecycle2, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                    }
                });
                return;
            }
            return;
        }
        final String str5 = "Attempting to show ad from <" + this.f19670e.mo56152S() + "> which does not match selected ad network <" + c + ">";
        C8626v.m26258i(this.tag, str5);
        m24206a(C8100c.IDLE, (Runnable) new Runnable() {
            public void run() {
                C8072c b = MaxFullscreenAdImpl.this.f19670e;
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.m24211a((MaxAd) maxFullscreenAdImpl.f19670e);
                C8575k.m26128a(MaxFullscreenAdImpl.this.adListener, (MaxAd) b, (MaxError) new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str5), true);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f19666a ? "this" : this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
