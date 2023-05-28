package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C8135d;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C8105a;
import com.applovin.impl.mediation.p234a.C8071b;
import com.applovin.impl.mediation.p236c.C8134c;
import com.applovin.impl.sdk.C8385d;
import com.applovin.impl.sdk.C8397e;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.C8630y;
import com.applovin.impl.sdk.C8631z;
import com.applovin.impl.sdk.p254c.C8379a;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.C8565c;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.C8619r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

public class MaxAdViewImpl extends C8105a implements C8385d.C8387a, C8397e.C8400a, C8631z.C8634a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f19629a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MaxAdView f19630b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f19631c = UUID.randomUUID().toString().toLowerCase(Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f19632d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f19633e = Long.MAX_VALUE;

    /* renamed from: f */
    private C8071b f19634f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f19635g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f19636h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C8084a f19637i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C8086c f19638j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C8385d f19639k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C8630y f19640l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C8631z f19641m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Object f19642n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8071b f19643o = null;

    /* renamed from: p */
    private boolean f19644p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f19645q;

    /* renamed from: r */
    private boolean f19646r;

    /* renamed from: s */
    private boolean f19647s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f19648t = false;

    /* renamed from: u */
    private boolean f19649u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f19650v;

    /* renamed from: w */
    private boolean f19651w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f19652x;

    /* renamed from: y */
    private boolean f19653y;

    /* renamed from: z */
    private boolean f19654z;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$a */
    private class C8084a extends C8085b {
        private C8084a() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            C8626v vVar = MaxAdViewImpl.this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar2.mo57818b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            C8575k.m26133a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m24175a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f19648t) {
                C8626v vVar = MaxAdViewImpl.this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar2.mo57818b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo57324H().destroyAd(maxAd);
                return;
            }
            C8071b bVar = (C8071b) maxAd;
            bVar.mo56185e(MaxAdViewImpl.this.f19635g);
            bVar.mo56186f(MaxAdViewImpl.this.f19636h);
            if (bVar.mo56095o() != null) {
                MaxAdViewImpl.this.m24164a(bVar);
                if (bVar.mo56109C()) {
                    long D = bVar.mo56110D();
                    MaxAdViewImpl.this.sdk.mo57320D();
                    if (C8626v.m26252a()) {
                        C8626v D2 = MaxAdViewImpl.this.sdk.mo57320D();
                        String str2 = MaxAdViewImpl.this.tag;
                        D2.mo57818b(str2, "Scheduling banner ad refresh " + D + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.f19639k.mo57110a(D);
                    if (MaxAdViewImpl.this.f19639k.mo57116f() || MaxAdViewImpl.this.f19645q) {
                        C8626v vVar3 = MaxAdViewImpl.this.logger;
                        if (C8626v.m26252a()) {
                            MaxAdViewImpl.this.logger.mo57818b(MaxAdViewImpl.this.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f19639k.mo57114d();
                    }
                }
                C8626v vVar4 = MaxAdViewImpl.this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar5 = MaxAdViewImpl.this.logger;
                    String str3 = MaxAdViewImpl.this.tag;
                    vVar5.mo57818b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
                }
                C8575k.m26131a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.mo57324H().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    private abstract class C8085b implements C8105a.C8106a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a */
        private boolean f19663a;

        private C8085b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                C8575k.m26164d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                if ((MaxAdViewImpl.this.f19643o.mo56111E() || MaxAdViewImpl.this.f19652x) && this.f19663a) {
                    this.f19663a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C8575k.m26172h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                C8575k.m26128a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                C8575k.m26155b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                if ((MaxAdViewImpl.this.f19643o.mo56111E() || MaxAdViewImpl.this.f19652x) && !MaxAdViewImpl.this.f19639k.mo57116f()) {
                    this.f19663a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C8575k.m26170g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f19643o)) {
                C8575k.m26161c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRequestStarted(String str) {
            C8575k.m26135a(MaxAdViewImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C8575k.m26137a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    private class C8086c extends C8085b {
        private C8086c() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            C8626v vVar = MaxAdViewImpl.this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar2.mo57818b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m24175a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f19648t) {
                C8626v vVar = MaxAdViewImpl.this.logger;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar2.mo57818b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo57324H().destroyAd(maxAd);
                return;
            }
            C8626v vVar3 = MaxAdViewImpl.this.logger;
            if (C8626v.m26252a()) {
                MaxAdViewImpl.this.logger.mo57818b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.m24174a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, C8490n nVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", nVar);
        if (context != null) {
            this.f19629a = context.getApplicationContext();
            this.f19630b = maxAdView;
            this.f19632d = view;
            this.f19637i = new C8084a();
            this.f19638j = new C8086c();
            this.f19639k = new C8385d(nVar, this);
            this.f19640l = new C8630y(maxAdView, nVar);
            this.f19641m = new C8631z(maxAdView, nVar, this);
            nVar.mo57321E().mo57162a((C8397e.C8400a) this);
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo57818b(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24161a() {
        C8071b bVar;
        MaxAdView maxAdView = this.f19630b;
        if (maxAdView != null) {
            C8565c.m26063a(maxAdView, this.f19632d);
        }
        this.f19641m.mo57832a();
        synchronized (this.f19642n) {
            bVar = this.f19643o;
        }
        if (bVar != null) {
            this.sdk.mo57324H().destroyAd(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24162a(long j) {
        if (!Utils.bitMaskContainsFlag(j, ((Long) this.sdk.mo57342a(C8379a.f20694x)).longValue()) || this.f19653y) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57818b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f19644p = false;
            m24179b();
            return;
        }
        C8626v vVar2 = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar3 = this.logger;
            String str = this.tag;
            vVar3.mo57818b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
        }
        C8626v vVar4 = this.logger;
        if (C8626v.m26252a()) {
            this.logger.mo57818b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f19644p = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24163a(View view, C8071b bVar) {
        int z = bVar.mo56113z();
        int A = bVar.mo56107A();
        int i = -1;
        int dpToPx = z == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), z);
        if (A != -1) {
            i = AppLovinSdkUtils.dpToPx(view.getContext(), A);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, i);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = i;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57818b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + i + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : C8619r.m26226a(this.f19630b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24164a(final C8071b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                */
            public void run() {
                /*
                    r7 = this;
                    com.applovin.impl.mediation.a.b r0 = r2
                    android.view.View r0 = r0.mo56095o()
                    if (r0 != 0) goto L_0x000b
                    java.lang.String r1 = "MaxAdView does not have a loaded ad view"
                    goto L_0x000c
                L_0x000b:
                    r1 = 0
                L_0x000c:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.ads.MaxAdView r2 = r2.f19630b
                    if (r2 != 0) goto L_0x0016
                    java.lang.String r1 = "MaxAdView does not have a parent view"
                L_0x0016:
                    if (r1 == 0) goto L_0x003d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
                    if (r0 == 0) goto L_0x002d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.tag
                    r0.mo57822e(r2, r1)
                L_0x002d:
                    com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl
                    r2 = -1
                    r0.<init>(r2, r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdListener r1 = r1.adListener
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.sdk.utils.C8575k.m26127a((com.applovin.mediation.MaxAdListener) r1, (com.applovin.mediation.MaxAd) r2, (com.applovin.mediation.MaxError) r0)
                    return
                L_0x003d:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    r1.m24161a()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r2
                    r1.mo56251a(r3)
                    com.applovin.impl.mediation.a.b r1 = r2
                    boolean r1 = r1.mo56147N()
                    if (r1 == 0) goto L_0x005c
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.z r1 = r1.f19641m
                    com.applovin.impl.mediation.a.b r3 = r2
                    r1.mo57833a((com.applovin.impl.mediation.p234a.C8075e) r3)
                L_0x005c:
                    r1 = 393216(0x60000, float:5.51013E-40)
                    r2.setDescendantFocusability(r1)
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r3 = r1.mo56112F()
                    r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 == 0) goto L_0x0081
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f19632d
                    com.applovin.impl.mediation.a.b r3 = r2
                    long r3 = r3.mo56112F()
                L_0x007c:
                    int r4 = (int) r3
                    r1.setBackgroundColor(r4)
                    goto L_0x00a2
                L_0x0081:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r3 = r1.f19633e
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 == 0) goto L_0x0098
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f19632d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r3 = r3.f19633e
                    goto L_0x007c
                L_0x0098:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r1 = r1.f19632d
                    r3 = 0
                    r1.setBackgroundColor(r3)
                L_0x00a2:
                    r2.addView(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2
                    r1.m24163a((android.view.View) r0, (com.applovin.impl.mediation.p234a.C8071b) r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.n r0 = r0.sdk
                    com.applovin.impl.a.a.a r0 = r0.mo57373an()
                    com.applovin.impl.mediation.a.b r1 = r2
                    r0.mo55453a((java.lang.Object) r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r1 = r2
                    r0.m24180b((com.applovin.impl.mediation.p234a.C8071b) r1)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.Object r0 = r0.f19642n
                    monitor-enter(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.a.b r2 = r2     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.p234a.C8071b unused = r1.f19643o = r2     // Catch:{ all -> 0x0130 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0130 }
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
                    if (r0 == 0) goto L_0x00e6
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r1 = r1.tag
                    java.lang.String r2 = "Scheduling impression for ad manually..."
                    r0.mo57818b(r1, r2)
                L_0x00e6:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.n r0 = r0.sdk
                    com.applovin.impl.mediation.MediationServiceImpl r0 = r0.mo57324H()
                    com.applovin.impl.mediation.a.b r1 = r2
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$a r2 = r2.f19637i
                    r0.processRawAdImpressionPostback(r1, r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r0 = r0.f19643o
                    java.lang.String r0 = r0.getAdReviewCreativeId()
                    boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
                    if (r0 == 0) goto L_0x0121
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdReviewListener r0 = r0.adReviewListener
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r1 = r1.f19643o
                    java.lang.String r1 = r1.getAdReviewCreativeId()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2.f19643o
                    r3 = 1
                    com.applovin.impl.sdk.utils.C8575k.m26139a((com.applovin.mediation.MaxAdReviewListener) r0, (java.lang.String) r1, (com.applovin.mediation.MaxAd) r2, (boolean) r3)
                L_0x0121:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1 r0 = new com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1
                    r0.<init>()
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r1 = r1.mo56108B()
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r0, r1)
                    return
                L_0x0130:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0130 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.C80812.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24165a(C8071b bVar, long j) {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            this.logger.mo57818b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.mo57324H().processViewabilityAdImpressionPostback(bVar, j, this.f19637i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24173a(final C8135d.C8137a aVar, final C8105a.C8106a aVar2) {
        if (m24186e()) {
            C8626v.m26258i(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                public void run() {
                    if (MaxAdViewImpl.this.f19643o != null) {
                        long a = MaxAdViewImpl.this.f19640l.mo57831a(MaxAdViewImpl.this.f19643o);
                        MaxAdViewImpl.this.extraParameters.put("visible_ad_ad_unit_id", MaxAdViewImpl.this.f19643o.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f19630b.getContext(), MaxAdViewImpl.this.f19630b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f19630b.getContext(), MaxAdViewImpl.this.f19630b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl.this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(MaxAdViewImpl.this.f19639k.mo57116f() || MaxAdViewImpl.this.f19645q));
                    MaxAdViewImpl.this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(MaxAdViewImpl.this.f19650v));
                    C8626v vVar = MaxAdViewImpl.this.logger;
                    if (C8626v.m26252a()) {
                        C8626v vVar2 = MaxAdViewImpl.this.logger;
                        String str = MaxAdViewImpl.this.tag;
                        vVar2.mo57818b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + aVar2 + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    MaxAdViewImpl.this.sdk.mo57324H().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.f19631c, MaxAdViewImpl.this.adFormat, aVar, MaxAdViewImpl.this.localExtraParameters, MaxAdViewImpl.this.extraParameters, MaxAdViewImpl.this.f19629a, aVar2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24174a(MaxAd maxAd) {
        this.f19647s = false;
        if (this.f19646r) {
            this.f19646r = false;
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.logger;
                String str = this.tag;
                vVar2.mo57818b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f19637i.onAdLoaded(maxAd);
            return;
        }
        C8626v vVar3 = this.logger;
        if (C8626v.m26252a()) {
            this.logger.mo57818b(this.tag, "Saving pre-cache ad...");
        }
        C8071b bVar = (C8071b) maxAd;
        this.f19634f = bVar;
        bVar.mo56185e(this.f19635g);
        this.f19634f.mo56186f(this.f19636h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24175a(MaxError maxError) {
        if (this.sdk.mo57380b(C8379a.f20684n).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.mo57320D();
            if (C8626v.m26252a()) {
                C8626v D = this.sdk.mo57320D();
                String str = this.tag;
                D.mo57818b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f19645q || this.f19639k.mo57116f()) {
            if (this.f19647s) {
                C8626v vVar = this.logger;
                if (C8626v.m26252a()) {
                    this.logger.mo57818b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                }
                this.f19647s = false;
            }
            if (this.f19646r) {
                C8626v vVar2 = this.logger;
                if (C8626v.m26252a()) {
                    this.logger.mo57818b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                }
                C8575k.m26132a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.f19644p = true;
            this.f19647s = false;
            long longValue = ((Long) this.sdk.mo57342a(C8379a.f20683m)).longValue();
            if (longValue >= 0) {
                this.sdk.mo57320D();
                if (C8626v.m26252a()) {
                    C8626v D2 = this.sdk.mo57320D();
                    String str2 = this.tag;
                    D2.mo57818b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f19639k.mo57110a(longValue);
            }
        }
    }

    /* renamed from: a */
    private void m24176a(String str, String str2) {
        if (AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE.equalsIgnoreCase(str)) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.logger;
                String str3 = this.tag;
                vVar2.mo57818b(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f19649u = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES.equalsIgnoreCase(str)) {
            C8626v vVar3 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar4 = this.logger;
                String str4 = this.tag;
                vVar4.mo57818b(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f19650v = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_PRECACHE.equalsIgnoreCase(str)) {
            C8626v vVar5 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar6 = this.logger;
                String str5 = this.tag;
                vVar6.mo57818b(str5, "Updated precached disabled to: " + str2);
            }
            this.f19651w = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_REFRESH_ON_AD_EXPAND.equals(str)) {
            C8626v vVar7 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar8 = this.logger;
                String str6 = this.tag;
                vVar8.mo57818b(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f19652x = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.FORCE_PRECACHE.equals(str)) {
            C8626v vVar9 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar10 = this.logger;
                String str7 = this.tag;
                vVar10.mo57818b(str7, "Updated force precache to: " + str2);
            }
            this.f19653y = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER.equalsIgnoreCase(str)) {
            C8626v vVar11 = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar12 = this.logger;
                String str8 = this.tag;
                vVar12.mo57818b(str8, "Updated is adaptive banner to: " + str2);
            }
            this.f19654z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* renamed from: b */
    private void m24179b() {
        if (m24185d()) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57818b(this.tag, "Scheduling refresh precache request now");
            }
            this.f19647s = true;
            this.sdk.mo57337V().mo57228a((C8401a) new C8458z(this.sdk, new Runnable() {
                public void run() {
                    C8626v vVar = MaxAdViewImpl.this.logger;
                    if (C8626v.m26252a()) {
                        MaxAdViewImpl.this.logger.mo57818b(MaxAdViewImpl.this.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl.this.m24173a(C8135d.C8137a.SEQUENTIAL_OR_PRECACHE, (C8105a.C8106a) MaxAdViewImpl.this.f19638j);
                }
            }), C8134c.m24354a(this.adFormat));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24180b(C8071b bVar) {
        int height = this.f19630b.getHeight();
        int width = this.f19630b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f19629a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f19629a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.f19654z ? format.getAdaptiveSize(pxToDp2, this.f19629a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.f19654z ? "adaptive " : "");
                sb.append("size: ");
                sb.append(width2);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String sb2 = sb.toString();
                C8626v vVar = this.logger;
                if (C8626v.m26252a()) {
                    this.logger.mo57822e("AppLovinSdk", sb2);
                }
            }
        }
    }

    /* renamed from: c */
    private void m24182c() {
        C8626v vVar = this.logger;
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.logger;
            String str = this.tag;
            vVar2.mo57818b(str, "Rendering for cached ad: " + this.f19634f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f19637i.onAdLoaded(this.f19634f);
        this.f19634f = null;
    }

    /* renamed from: d */
    private boolean m24185d() {
        if (this.f19651w) {
            return false;
        }
        return ((Boolean) this.sdk.mo57342a(C8379a.f20695y)).booleanValue();
    }

    /* renamed from: e */
    private boolean m24186e() {
        boolean z;
        synchronized (this.f19642n) {
            z = this.f19648t;
        }
        return z;
    }

    public void destroy() {
        m24161a();
        if (this.f19634f != null) {
            this.sdk.mo57324H().destroyAd(this.f19634f);
        }
        synchronized (this.f19642n) {
            this.f19648t = true;
        }
        this.f19639k.mo57113c();
        this.sdk.mo57321E().mo57163b((C8397e.C8400a) this);
        this.sdk.mo57329M().mo56295a(this.adUnitId, this.f19631c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f19635g;
    }

    public void loadAd() {
        loadAd(C8135d.C8137a.PUBLISHER_INITIATED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        if (com.applovin.impl.sdk.C8626v.m26252a() != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (com.applovin.impl.sdk.C8626v.m26252a() != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadAd(com.applovin.impl.mediation.C8135d.C8137a r5) {
        /*
            r4 = this;
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x002f
            com.applovin.impl.sdk.v r0 = r4.logger
            java.lang.String r1 = r4.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r4.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo57818b(r1, r2)
        L_0x002f:
            boolean r0 = r4.f19649u
            r1 = 1
            if (r0 != 0) goto L_0x0047
            com.applovin.impl.sdk.n r0 = r4.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p254c.C8379a.f20690t
            java.lang.Object r0 = r0.mo57342a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = 0
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 == 0) goto L_0x0082
            com.applovin.impl.sdk.d r2 = r4.f19639k
            boolean r2 = r2.mo57116f()
            if (r2 != 0) goto L_0x0082
            com.applovin.impl.sdk.d r2 = r4.f19639k
            boolean r2 = r2.mo57111a()
            if (r2 == 0) goto L_0x0082
            java.lang.String r5 = r4.tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r0.append(r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r2 = r4.f19639k
            long r2 = r2.mo57112b()
            long r1 = r1.toSeconds(r2)
            r0.append(r1)
            java.lang.String r1 = " seconds."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.applovin.impl.sdk.C8626v.m26258i(r5, r0)
            return
        L_0x0082:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto L_0x00c0
            com.applovin.impl.mediation.a.b r0 = r4.f19634f
            if (r0 == 0) goto L_0x009f
            com.applovin.impl.sdk.v r5 = r4.logger
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r5 == 0) goto L_0x009b
            com.applovin.impl.sdk.v r5 = r4.logger
            java.lang.String r0 = r4.tag
            java.lang.String r1 = "Rendering cached ad"
            r5.mo57818b(r0, r1)
        L_0x009b:
            r4.m24182c()
            goto L_0x00d4
        L_0x009f:
            boolean r0 = r4.f19647s
            if (r0 == 0) goto L_0x00b7
            com.applovin.impl.sdk.v r5 = r4.logger
            boolean r5 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r5 == 0) goto L_0x00b4
            com.applovin.impl.sdk.v r5 = r4.logger
            java.lang.String r0 = r4.tag
            java.lang.String r2 = "Waiting for precache ad to load to render"
            r5.mo57818b(r0, r2)
        L_0x00b4:
            r4.f19646r = r1
            goto L_0x00d4
        L_0x00b7:
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x00cf
            goto L_0x00c8
        L_0x00c0:
            com.applovin.impl.sdk.v r0 = r4.logger
            boolean r0 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r0 == 0) goto L_0x00cf
        L_0x00c8:
            com.applovin.impl.sdk.v r0 = r4.logger
            java.lang.String r1 = r4.tag
            r0.mo57818b(r1, r2)
        L_0x00cf:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r4.f19637i
            r4.m24173a((com.applovin.impl.mediation.C8135d.C8137a) r5, (com.applovin.impl.mediation.ads.C8105a.C8106a) r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd(com.applovin.impl.mediation.d$a):void");
    }

    public void onAdRefresh() {
        String str;
        String str2;
        C8626v vVar;
        this.f19646r = false;
        if (this.f19634f != null) {
            m24182c();
            return;
        }
        if (!m24185d()) {
            C8626v vVar2 = this.logger;
            if (C8626v.m26252a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network...";
            }
            loadAd(C8135d.C8137a.REFRESH);
        } else if (this.f19644p) {
            C8626v vVar3 = this.logger;
            if (C8626v.m26252a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network due to viewability requirements not met for refresh request...";
            }
            loadAd(C8135d.C8137a.REFRESH);
        } else {
            C8626v vVar4 = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57822e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f19646r = true;
            return;
        }
        vVar.mo57818b(str2, str);
        loadAd(C8135d.C8137a.REFRESH);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C8071b bVar = this.f19643o;
        if (bVar == null || !bVar.mo56071f().equalsIgnoreCase(str)) {
            C8071b bVar2 = this.f19634f;
            if (bVar2 != null && bVar2.mo56071f().equalsIgnoreCase(str)) {
                this.f19634f.mo56067b(str2);
                return;
            }
            return;
        }
        this.f19643o.mo56067b(str2);
        C8575k.m26138a(this.adReviewListener, str2, (MaxAd) this.f19643o);
    }

    public void onLogVisibilityImpression() {
        m24165a(this.f19643o, this.f19640l.mo57831a(this.f19643o));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.mo57342a(C8379a.f20688r)).booleanValue() && this.f19639k.mo57111a()) {
            if (C8619r.m26224a(i)) {
                C8626v vVar = this.logger;
                if (C8626v.m26252a()) {
                    this.logger.mo57818b(this.tag, "Ad view visible");
                }
                this.f19639k.mo57118h();
                return;
            }
            C8626v vVar2 = this.logger;
            if (C8626v.m26252a()) {
                this.logger.mo57818b(this.tag, "Ad view hidden");
            }
            this.f19639k.mo57117g();
        }
    }

    public void setCustomData(String str) {
        if (this.f19643o != null) {
            String str2 = this.tag;
            C8626v.m26258i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f19636h = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m24176a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f19643o != null) {
            String str2 = this.tag;
            C8626v.m26258i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f19635g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f19633e = (long) i;
    }

    public void startAutoRefresh() {
        String str;
        String str2;
        C8626v vVar;
        this.f19645q = false;
        if (this.f19639k.mo57116f()) {
            this.f19639k.mo57115e();
            C8626v vVar2 = this.logger;
            if (C8626v.m26252a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Resumed auto-refresh with remaining time: " + this.f19639k.mo57112b() + "ms";
            } else {
                return;
            }
        } else {
            C8626v vVar3 = this.logger;
            if (C8626v.m26252a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
            } else {
                return;
            }
        }
        vVar.mo57818b(str2, str);
    }

    public void stopAutoRefresh() {
        if (this.f19643o != null) {
            C8626v vVar = this.logger;
            if (C8626v.m26252a()) {
                C8626v vVar2 = this.logger;
                String str = this.tag;
                vVar2.mo57818b(str, "Pausing auto-refresh with remaining time: " + this.f19639k.mo57112b() + "ms");
            }
            this.f19639k.mo57114d();
        } else if (this.f19649u || ((Boolean) this.sdk.mo57342a(C8379a.f20690t)).booleanValue()) {
            this.f19645q = true;
        } else {
            C8626v.m26257h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f19630b ? "this" : this.adListener);
        sb.append(", isDestroyed=");
        sb.append(m24186e());
        sb.append('}');
        return sb.toString();
    }
}
