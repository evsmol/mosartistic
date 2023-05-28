package com.applovin.impl.adview.activity.p232b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C7981d;
import com.applovin.impl.adview.C7993i;
import com.applovin.impl.adview.C8008m;
import com.applovin.impl.adview.C8009n;
import com.applovin.impl.adview.C8010o;
import com.applovin.impl.adview.activity.C7904b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C8464h;
import com.applovin.impl.sdk.C8467i;
import com.applovin.impl.sdk.C8490n;
import com.applovin.impl.sdk.C8626v;
import com.applovin.impl.sdk.p252ad.C8350e;
import com.applovin.impl.sdk.p253b.C8369b;
import com.applovin.impl.sdk.p254c.C8380b;
import com.applovin.impl.sdk.p255d.C8392d;
import com.applovin.impl.sdk.p256e.C8401a;
import com.applovin.impl.sdk.p256e.C8432o;
import com.applovin.impl.sdk.p256e.C8451v;
import com.applovin.impl.sdk.p256e.C8458z;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C8561a;
import com.applovin.impl.sdk.utils.C8575k;
import com.applovin.impl.sdk.utils.C8616p;
import com.applovin.impl.sdk.utils.C8619r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.a */
public abstract class C7905a implements AppLovinBroadcastManager.Receiver, C8369b.C8376a {

    /* renamed from: A */
    private long f19077A;

    /* renamed from: B */
    private boolean f19078B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f19079C = 0;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final ArrayList<Long> f19080D = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C8467i f19081E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f19082F = false;

    /* renamed from: a */
    protected final C8350e f19083a;

    /* renamed from: b */
    protected final C8490n f19084b;

    /* renamed from: c */
    protected final C8626v f19085c;

    /* renamed from: d */
    protected final C8392d f19086d;

    /* renamed from: e */
    protected Activity f19087e;

    /* renamed from: f */
    protected AppLovinAdView f19088f;

    /* renamed from: g */
    protected final C8008m f19089g;

    /* renamed from: h */
    protected final C8008m f19090h;

    /* renamed from: i */
    protected final long f19091i = SystemClock.elapsedRealtime();

    /* renamed from: j */
    protected long f19092j = -1;

    /* renamed from: k */
    protected boolean f19093k;

    /* renamed from: l */
    protected int f19094l = 0;

    /* renamed from: m */
    protected int f19095m = 0;

    /* renamed from: n */
    protected int f19096n = C8464h.f21255a;

    /* renamed from: o */
    protected boolean f19097o;

    /* renamed from: p */
    protected AppLovinAdClickListener f19098p;

    /* renamed from: q */
    protected AppLovinAdDisplayListener f19099q;

    /* renamed from: r */
    protected AppLovinAdVideoPlaybackListener f19100r;

    /* renamed from: s */
    protected final C8369b f19101s;

    /* renamed from: t */
    protected C8616p f19102t;

    /* renamed from: u */
    private final Handler f19103u = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private final C8561a f19104v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final AppLovinBroadcastManager.Receiver f19105w;

    /* renamed from: x */
    private final C8464h.C8466a f19106x;

    /* renamed from: y */
    private final AtomicBoolean f19107y = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final AtomicBoolean f19108z = new AtomicBoolean();

    /* renamed from: com.applovin.impl.adview.activity.b.a$a */
    public interface C7919a {
        /* renamed from: a */
        void mo52368a(C7905a aVar);

        /* renamed from: a */
        void mo52369a(String str, Throwable th);
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$b */
    private class C7920b implements View.OnClickListener, AppLovinAdClickListener {
        private C7920b() {
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C8626v vVar = C7905a.this.f19085c;
            if (C8626v.m26252a()) {
                C7905a.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            C8575k.m26143a(C7905a.this.f19098p, appLovinAd);
            C7905a.this.f19086d.mo57131b();
            C7905a.this.f19095m++;
        }

        public void onClick(View view) {
            if (view != C7905a.this.f19089g || !((Boolean) C7905a.this.f19084b.mo57342a(C8380b.f20851cv)).booleanValue()) {
                C8626v vVar = C7905a.this.f19085c;
                if (C8626v.m26252a()) {
                    C8626v vVar2 = C7905a.this.f19085c;
                    vVar2.mo57822e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            C7905a.m23405d(C7905a.this);
            if (C7905a.this.f19083a.mo56964V()) {
                C7905a aVar = C7905a.this;
                aVar.mo55548b("javascript:al_onCloseButtonTapped(" + C7905a.this.f19079C + "," + C7905a.this.f19094l + "," + C7905a.this.f19095m + ");");
            }
            List<Integer> u = C7905a.this.f19083a.mo57022u();
            C8626v vVar3 = C7905a.this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar4 = C7905a.this.f19085c;
                vVar4.mo57818b("AppLovinFullscreenActivity", "Handling close button tap " + C7905a.this.f19079C + " with multi close delay: " + u);
            }
            if (u == null || u.size() <= C7905a.this.f19079C) {
                C7905a.this.mo55555h();
                return;
            }
            C7905a.this.f19080D.add(Long.valueOf(SystemClock.elapsedRealtime() - C7905a.this.f19092j));
            List<C7993i.C7994a> w = C7905a.this.f19083a.mo57024w();
            if (w != null && w.size() > C7905a.this.f19079C) {
                C7905a.this.f19089g.mo55766a(w.get(C7905a.this.f19079C));
            }
            C8626v vVar5 = C7905a.this.f19085c;
            if (C8626v.m26252a()) {
                C8626v vVar6 = C7905a.this.f19085c;
                vVar6.mo57818b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + u.get(C7905a.this.f19079C));
            }
            C7905a.this.f19089g.setVisibility(8);
            C7905a aVar2 = C7905a.this;
            aVar2.mo55541a(aVar2.f19089g, (long) u.get(C7905a.this.f19079C).intValue(), new Runnable() {
                public void run() {
                    C7905a.this.f19092j = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    C7905a(final C8350e eVar, Activity activity, final C8490n nVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f19083a = eVar;
        this.f19084b = nVar;
        this.f19085c = nVar.mo57320D();
        this.f19087e = activity;
        this.f19098p = appLovinAdClickListener;
        this.f19099q = appLovinAdDisplayListener;
        this.f19100r = appLovinAdVideoPlaybackListener;
        C8369b bVar = new C8369b(activity, nVar);
        this.f19101s = bVar;
        bVar.mo57068a((C8369b.C8376a) this);
        this.f19086d = new C8392d(eVar, nVar);
        this.f19081E = new C8467i(nVar);
        C7920b bVar2 = new C7920b();
        if (((Boolean) nVar.mo57342a(C8380b.f20817cN)).booleanValue()) {
            nVar.mo57372am().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        C8009n nVar2 = new C8009n(nVar.mo57361ab(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f19088f = nVar2;
        nVar2.setAdClickListener(bVar2);
        this.f19088f.setAdDisplayListener(new AppLovinAdDisplayListener() {
            public void adDisplayed(AppLovinAd appLovinAd) {
                C8626v vVar = C7905a.this.f19085c;
                if (C8626v.m26252a()) {
                    C7905a.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            public void adHidden(AppLovinAd appLovinAd) {
                C8626v vVar = C7905a.this.f19085c;
                if (C8626v.m26252a()) {
                    C7905a.this.f19085c.mo57818b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                C7905a.this.mo55555h();
            }
        });
        this.f19088f.getController().mo55661a(this.f19086d);
        nVar.mo57406v().trackImpression(eVar);
        List<Integer> u = eVar.mo57022u();
        if (eVar.mo57021t() >= 0 || u != null) {
            C8008m mVar = new C8008m(eVar.mo57023v(), activity);
            this.f19089g = mVar;
            mVar.setVisibility(8);
            this.f19089g.setOnClickListener(bVar2);
        } else {
            this.f19089g = null;
        }
        C8008m mVar2 = new C8008m(C7993i.C7994a.WHITE_ON_TRANSPARENT, activity);
        this.f19090h = mVar2;
        mVar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C7905a.this.mo55555h();
            }
        });
        if (((Boolean) nVar.mo57342a(C8380b.f20853cx)).booleanValue()) {
            this.f19105w = new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    nVar.mo57406v().trackAppKilled(eVar);
                    nVar.mo57372am().unregisterReceiver(this);
                }
            };
        } else {
            this.f19105w = null;
        }
        if (eVar.mo56997al()) {
            this.f19106x = new C8464h.C8466a() {
                /* renamed from: a */
                public void mo55575a(int i) {
                    String str;
                    if (C7905a.this.f19096n != C8464h.f21255a) {
                        C7905a.this.f19097o = true;
                    }
                    C7981d s = C7905a.this.f19088f.getController().mo55686s();
                    if (!C8464h.m25510a(i) || C8464h.m25510a(C7905a.this.f19096n)) {
                        if (i == 2) {
                            str = "javascript:al_muteSwitchOff();";
                        }
                        C7905a.this.f19096n = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.mo55707a(str);
                    C7905a.this.f19096n = i;
                }
            };
        } else {
            this.f19106x = null;
        }
        if (((Boolean) nVar.mo57342a(C8380b.f20921eN)).booleanValue()) {
            this.f19104v = new C8561a() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!C7905a.this.f19108z.get()) {
                        if (activity.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity.getApplicationContext()))) {
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    C8626v.m26258i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    try {
                                        C7905a.this.mo55555h();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }
                }
            };
        } else {
            this.f19104v = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.applovin.impl.adview.activity.b.a] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.applovin.impl.adview.activity.b.b] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.applovin.impl.adview.activity.b.e] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.applovin.impl.adview.activity.b.g] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v33, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.applovin.impl.adview.activity.b.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23400a(com.applovin.impl.sdk.p252ad.C8350e r15, com.applovin.sdk.AppLovinAdClickListener r16, com.applovin.sdk.AppLovinAdDisplayListener r17, com.applovin.sdk.AppLovinAdVideoPlaybackListener r18, com.applovin.impl.sdk.C8490n r19, android.app.Activity r20, com.applovin.impl.adview.activity.p232b.C7905a.C7919a r21) {
        /*
            r8 = r19
            r9 = r21
            boolean r0 = r15.mo56981aH()
            r10 = r15
            boolean r1 = r10 instanceof com.applovin.impl.p233b.C8029a
            java.lang.String r11 = "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter."
            java.lang.String r12 = "AppLovinFullscreenActivity"
            java.lang.String r13 = " and throwable: "
            if (r1 == 0) goto L_0x009d
            java.lang.String r14 = "Failed to create FullscreenVastVideoAdPresenter with sdk: "
            if (r0 == 0) goto L_0x006c
            com.applovin.impl.adview.activity.b.c r0 = new com.applovin.impl.adview.activity.b.c     // Catch:{ all -> 0x002a }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x002a }
            goto L_0x0177
        L_0x002a:
            r0 = move-exception
            r19.mo57320D()
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r1 == 0) goto L_0x003b
            com.applovin.impl.sdk.v r1 = r19.mo57320D()
            r1.mo57817a((java.lang.String) r12, (java.lang.String) r11, (java.lang.Throwable) r0)
        L_0x003b:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x004e }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            goto L_0x0177
        L_0x004e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        L_0x006c:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x007f }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007f }
            goto L_0x0177
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        L_0x009d:
            boolean r1 = r15.hasVideoUrl()
            if (r1 == 0) goto L_0x0166
            boolean r1 = r15.mo56984aK()
            if (r1 == 0) goto L_0x00dc
            com.applovin.impl.adview.activity.b.g r0 = new com.applovin.impl.adview.activity.b.g     // Catch:{ all -> 0x00bc }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bc }
            goto L_0x0177
        L_0x00bc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenWebVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        L_0x00dc:
            if (r0 == 0) goto L_0x0134
            com.applovin.impl.adview.activity.b.e r0 = new com.applovin.impl.adview.activity.b.e     // Catch:{ all -> 0x00f1 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00f1 }
            goto L_0x0177
        L_0x00f1:
            r0 = move-exception
            r19.mo57320D()
            boolean r1 = com.applovin.impl.sdk.C8626v.m26252a()
            if (r1 == 0) goto L_0x0102
            com.applovin.impl.sdk.v r1 = r19.mo57320D()
            r1.mo57817a((java.lang.String) r12, (java.lang.String) r11, (java.lang.Throwable) r0)
        L_0x0102:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0114 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0114 }
            goto L_0x0177
        L_0x0114:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        L_0x0134:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0146 }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0146 }
            goto L_0x0177
        L_0x0146:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        L_0x0166:
            com.applovin.impl.adview.activity.b.b r0 = new com.applovin.impl.adview.activity.b.b     // Catch:{ all -> 0x017e }
            r1 = r0
            r2 = r15
            r3 = r20
            r4 = r19
            r5 = r16
            r6 = r17
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x017e }
        L_0x0177:
            r0.mo55591c()
            r9.mo52368a(r0)
            return
        L_0x017e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenGraphicAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r13)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo52369a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.p232b.C7905a.m23400a(com.applovin.impl.sdk.ad.e, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.impl.sdk.n, android.app.Activity, com.applovin.impl.adview.activity.b.a$a):void");
    }

    /* renamed from: c */
    private void mo55591c() {
        if (this.f19105w != null) {
            this.f19084b.mo57372am().registerReceiver(this.f19105w, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.f19106x != null) {
            this.f19084b.mo57371al().mo57275a(this.f19106x);
        }
        if (this.f19104v != null) {
            this.f19084b.mo57368ai().mo56832a(this.f19104v);
        }
    }

    /* renamed from: d */
    static /* synthetic */ int m23405d(C7905a aVar) {
        int i = aVar.f19079C;
        aVar.f19079C = i + 1;
        return i;
    }

    /* renamed from: a */
    public void mo55536a(int i, KeyEvent keyEvent) {
        if (this.f19085c != null && C8626v.m26252a()) {
            C8626v vVar = this.f19085c;
            vVar.mo57820c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55537a(int i, boolean z, boolean z2, long j) {
        int i2 = i;
        if (this.f19107y.compareAndSet(false, true)) {
            if (this.f19083a.hasVideoUrl() || mo55568t()) {
                C8575k.m26149a(this.f19100r, (AppLovinAd) this.f19083a, (double) i2, z2);
            }
            if (this.f19083a.hasVideoUrl()) {
                this.f19086d.mo57134c((long) i2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19091i;
            this.f19084b.mo57406v().trackVideoEnd(this.f19083a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long j2 = -1;
            if (this.f19092j != -1) {
                j2 = SystemClock.elapsedRealtime() - this.f19092j;
            }
            this.f19084b.mo57406v().trackFullScreenAdClosed(this.f19083a, j2, this.f19080D, j, this.f19097o, this.f19096n);
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19085c;
                vVar.mo57818b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i2 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + j2 + "ms");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo55538a(long j);

    /* renamed from: a */
    public void mo55539a(Configuration configuration) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19085c;
            vVar.mo57820c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* renamed from: a */
    public abstract void mo55540a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55541a(final C8008m mVar, long j, final Runnable runnable) {
        if (j < ((Long) this.f19084b.mo57342a(C8380b.f20850cu)).longValue()) {
            this.f19084b.mo57337V().mo57230a(new C8458z(this.f19084b, new Runnable() {
                public void run() {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            C8619r.m26223a((View) mVar, 400, (Runnable) new Runnable() {
                                public void run() {
                                    mVar.bringToFront();
                                    runnable.run();
                                }
                            });
                        }
                    });
                }
            }), C8432o.C8434a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55542a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f19103u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55543a(String str) {
        if (this.f19083a.mo56965W()) {
            mo55544a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55544a(final String str, long j) {
        if (j >= 0) {
            mo55542a((Runnable) new Runnable() {
                public void run() {
                    C7981d s;
                    if (StringUtils.isValidString(str) && C7905a.this.f19088f != null && (s = C7905a.this.f19088f.getController().mo55686s()) != null) {
                        s.mo55707a(str);
                    }
                }
            }, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55545a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.f19083a, this.f19084b, this.f19087e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (((Boolean) this.f19084b.mo57342a(C8380b.f20925eR)).booleanValue()) {
            if (C8626v.m26252a()) {
                C8626v vVar = this.f19085c;
                vVar.mo57822e("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + checkCachedResourcesExist);
            }
            C8010o.m23788a(this.f19083a, this.f19099q, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            mo55555h();
            return;
        }
        if (C8626v.m26252a()) {
            C8626v vVar2 = this.f19085c;
            vVar2.mo57822e("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + checkCachedResourcesExist);
        }
        this.f19083a.mo55827a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55546a(boolean z, long j) {
        if (this.f19083a.mo56963U()) {
            mo55544a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55547b(long j) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19085c;
            vVar.mo57818b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f19102t = C8616p.m26205a(j, this.f19084b, new Runnable() {
            public void run() {
                if (!C7905a.this.f19083a.mo56992ag().getAndSet(true)) {
                    C7905a.this.f19084b.mo57337V().mo57228a((C8401a) new C8451v(C7905a.this.f19083a, C7905a.this.f19084b), C8432o.C8434a.REWARD);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55548b(String str) {
        mo55544a(str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo55549b(boolean z) {
        mo55546a(z, ((Long) this.f19084b.mo57342a(C8380b.f20814cK)).longValue());
        C8575k.m26144a(this.f19099q, (AppLovinAd) this.f19083a);
        this.f19084b.mo57367ah().mo57671a((Object) this.f19083a);
        if (this.f19083a.hasVideoUrl() || mo55568t()) {
            C8575k.m26148a(this.f19100r, (AppLovinAd) this.f19083a);
        }
        new C7904b(this.f19087e).mo55535a(this.f19083a);
        this.f19086d.mo57129a();
        this.f19083a.setHasShown(true);
    }

    /* renamed from: c */
    public void mo55550c(boolean z) {
        if (C8626v.m26252a()) {
            C8626v vVar = this.f19085c;
            vVar.mo57820c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        mo55543a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: d */
    public abstract void mo55551d();

    /* renamed from: e */
    public abstract void mo55552e();

    /* renamed from: f */
    public void mo55553f() {
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f19086d.mo57136d(SystemClock.elapsedRealtime() - this.f19077A);
        mo55543a("javascript:al_onAppResumed();");
        mo55565q();
        if (this.f19101s.mo57070c()) {
            this.f19101s.mo57066a();
        }
    }

    /* renamed from: g */
    public void mo55554g() {
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "onPause()");
        }
        this.f19077A = SystemClock.elapsedRealtime();
        mo55543a("javascript:al_onAppPaused();");
        if (this.f19101s.mo57070c()) {
            this.f19101s.mo57066a();
        }
        mo55564p();
    }

    /* renamed from: h */
    public void mo55555h() {
        this.f19078B = true;
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "dismiss()");
        }
        C8350e eVar = this.f19083a;
        if (eVar != null) {
            eVar.mo55860o().mo56856e();
        }
        this.f19103u.removeCallbacksAndMessages((Object) null);
        mo55544a("javascript:al_onPoststitialDismiss();", (long) this.f19083a.mo56962T());
        mo55561n();
        this.f19086d.mo57133c();
        this.f19081E.mo57279a();
        if (this.f19105w != null) {
            C8616p.m26205a(TimeUnit.SECONDS.toMillis(2), this.f19084b, new Runnable() {
                public void run() {
                    C7905a.this.f19087e.stopService(new Intent(C7905a.this.f19087e.getApplicationContext(), AppKilledService.class));
                    C7905a.this.f19084b.mo57372am().unregisterReceiver(C7905a.this.f19105w);
                }
            });
        }
        if (this.f19106x != null) {
            this.f19084b.mo57371al().mo57276b(this.f19106x);
        }
        if (this.f19104v != null) {
            this.f19084b.mo57368ai().mo56834b(this.f19104v);
        }
        if (mo55562o()) {
            this.f19087e.finish();
            return;
        }
        this.f19084b.mo57320D();
        if (C8626v.m26252a()) {
            this.f19084b.mo57320D().mo57818b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo55558k();
    }

    /* renamed from: i */
    public boolean mo55556i() {
        return this.f19078B;
    }

    /* renamed from: j */
    public void mo55557j() {
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* renamed from: k */
    public void mo55558k() {
        AppLovinAdView appLovinAdView = this.f19088f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f19088f.destroy();
            this.f19088f = null;
            if ((parent instanceof ViewGroup) && mo55562o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo55560m();
        mo55561n();
        this.f19098p = null;
        this.f19099q = null;
        this.f19100r = null;
        this.f19087e = null;
        this.f19084b.mo57372am().unregisterReceiver(this);
    }

    /* renamed from: l */
    public void mo55559l() {
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f19082F) {
            mo55555h();
        }
        if (this.f19083a.mo56964V()) {
            mo55548b("javascript:onBackPressed();");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo55560m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo55561n() {
        if (this.f19108z.compareAndSet(false, true)) {
            C8575k.m26157b(this.f19099q, (AppLovinAd) this.f19083a);
            this.f19084b.mo57367ah().mo57674b((Object) this.f19083a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo55562o() {
        return this.f19087e instanceof AppLovinFullscreenActivity;
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction()) && !this.f19093k) {
            mo55571w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo55564p() {
        C8616p pVar = this.f19102t;
        if (pVar != null) {
            pVar.mo57780b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo55565q() {
        C8616p pVar = this.f19102t;
        if (pVar != null) {
            pVar.mo57781c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo55566r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo55567s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo55568t() {
        return AppLovinAdType.INCENTIVIZED == this.f19083a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f19083a.getType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo55569u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo55570v() {
        C7981d s;
        AppLovinAdView appLovinAdView = this.f19088f;
        if (appLovinAdView != null && (s = appLovinAdView.getController().mo55686s()) != null) {
            this.f19081E.mo57280a((View) s, (C8467i.C8472a) new C8467i.C8472a() {
                /* renamed from: a */
                public void mo55573a(View view) {
                    C7905a.this.f19081E.mo57644a(CollectionUtils.map("clcode", C7905a.this.f19083a.getClCode()));
                    if (((Boolean) C7905a.this.f19084b.mo57342a(C8380b.f20972fm)).booleanValue()) {
                        C7905a.this.mo55555h();
                        return;
                    }
                    C7905a aVar = C7905a.this;
                    boolean unused = aVar.f19082F = ((Boolean) aVar.f19084b.mo57342a(C8380b.f20973fn)).booleanValue();
                    if (((Boolean) C7905a.this.f19084b.mo57342a(C8380b.f20974fo)).booleanValue() && C7905a.this.f19089g != null) {
                        C7905a.this.f19089g.setVisibility(0);
                    }
                }
            });
        }
    }

    /* renamed from: w */
    public void mo55571w() {
        if (C8626v.m26252a()) {
            this.f19085c.mo57820c("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f19093k = true;
    }
}
