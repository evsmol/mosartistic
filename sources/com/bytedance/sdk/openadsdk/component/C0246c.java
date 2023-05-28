package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10652x;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.C0224a;
import com.bytedance.sdk.openadsdk.component.p008c.C0251a;
import com.bytedance.sdk.openadsdk.component.p009d.C0253a;
import com.bytedance.sdk.openadsdk.component.p009d.C0254b;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0482r;
import com.bytedance.sdk.openadsdk.p000b.C0106a;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0831b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.c */
/* compiled from: TTAppOpenAdLoadManager */
public class C0246c implements C10652x.C10653a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f811a = 0;

    /* renamed from: b */
    private AdSlot f812b;

    /* renamed from: c */
    private final Context f813c;

    /* renamed from: d */
    private final C0561n<C0106a> f814d;

    /* renamed from: e */
    private TTAdNative.AppOpenAdListener f815e;

    /* renamed from: f */
    private C10652x f816f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0224a f817g;

    /* renamed from: h */
    private int f818h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile int f819i = 0;

    /* renamed from: j */
    private final AtomicBoolean f820j = new AtomicBoolean(false);

    /* renamed from: k */
    private C0482r f821k;

    public C0246c(Context context) {
        if (context != null) {
            this.f813c = context.getApplicationContext();
        } else {
            this.f813c = C0558m.m2663a();
        }
        this.f814d = C0558m.m2671f();
        this.f817g = C0224a.m881a(this.f813c);
    }

    /* renamed from: a */
    public static C0246c m958a(Context context) {
        return new C0246c(context);
    }

    /* renamed from: a */
    public void mo621a(AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i) {
        if (appOpenAdListener != null) {
            if (i <= 0) {
                C10638l.m31235b("TTAppOpenAdLoadManager", "Since the timeout value passed by loadAppOpenAd is <=0, now it is set to the default value of 3500ms");
                i = IronSourceConstants.BN_AUCTION_REQUEST;
            }
            this.f812b = adSlot;
            this.f815e = appOpenAdListener;
            this.f811a = mo620a(adSlot);
            this.f818h = i;
            C10652x xVar = new C10652x(C0547k.m2621c().getLooper(), this);
            this.f816f = xVar;
            xVar.sendEmptyMessageDelayed(1, (long) i);
            m966b(this.f812b);
            m967c(this.f812b);
        }
    }

    /* renamed from: b */
    private void m966b(final AdSlot adSlot) {
        long currentTimeMillis = System.currentTimeMillis();
        C0482r rVar = new C0482r();
        this.f821k = rVar;
        rVar.mo1508a(currentTimeMillis);
        this.f819i = 1;
        C0479o oVar = new C0479o();
        oVar.f1732g = currentTimeMillis;
        oVar.f1734i = this.f821k;
        oVar.f1729d = 1;
        this.f814d.mo1840a(adSlot, oVar, 3, new C0561n.C0562a() {
            /* renamed from: a */
            public void mo186a(int i, String str) {
                int unused = C0246c.this.f819i = 3;
                C10638l.m31235b("TTAppOpenAdLoadManager", "try load app open ad from network fail");
                C0246c.this.m962a(new C0254b(2, 100, i, str));
            }

            /* renamed from: a */
            public void mo187a(C0448a aVar, C0449b bVar) {
                int unused = C0246c.this.f819i = 2;
                C10638l.m31235b("TTAppOpenAdLoadManager", "try load app open ad from network success");
                if (aVar == null || aVar.mo1199b() == null || aVar.mo1199b().size() == 0) {
                    int unused2 = C0246c.this.f819i = 3;
                    C0246c.this.m962a(new C0254b(2, 100, 20001, C0492g.m2254a(20001)));
                    bVar.mo1204a(-3);
                    C0449b.m1835a(bVar);
                    return;
                }
                C0477n nVar = aVar.mo1199b().get(0);
                if (C0477n.m2012c(nVar)) {
                    C0246c.this.m964a(nVar, adSlot);
                } else {
                    C0246c.this.m963a(nVar);
                }
            }
        });
    }

    /* renamed from: c */
    private void m967c(AdSlot adSlot) {
        C10615e.m31160a(new C10618g("tryGetAppOpenAdFromCache") {
            public void run() {
                if (!C0246c.this.f817g.mo583e(C0246c.this.f811a)) {
                    return;
                }
                if (C0246c.this.f817g.mo579b(C0246c.this.f811a) || C0246c.this.f817g.mo582d(C0246c.this.f811a)) {
                    C0477n f = C0246c.this.f817g.mo584f(C0246c.this.f811a);
                    C0246c.this.f817g.mo585g(C0246c.this.f811a);
                    if (f == null) {
                        C10638l.m31235b("TTAppOpenAdLoadManager", "Cached material resolution failed");
                        return;
                    }
                    C10638l.m31235b("TTAppOpenAdLoadManager", "Cached material resolution success");
                    if (C0477n.m2012c(f)) {
                        if (!TextUtils.isEmpty(C0246c.this.f817g.mo569a(f)) || Build.VERSION.SDK_INT < 23) {
                            C0246c.this.m962a(new C0254b(1, 101, f));
                            return;
                        }
                        C10638l.m31235b("TTAppOpenAdLoadManager", "Video cache path not found");
                        C0251a.m984b(f);
                    } else if (C0246c.this.f817g.mo580b(f)) {
                        C0246c.this.m962a(new C0254b(1, 101, f));
                    } else {
                        C10638l.m31235b("TTAppOpenAdLoadManager", "Image cache path not found");
                        C0251a.m984b(f);
                    }
                } else {
                    C0246c.this.f817g.mo585g(C0246c.this.f811a);
                }
            }
        }, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m964a(final C0477n nVar, AdSlot adSlot) {
        this.f817g.mo575a(nVar, adSlot, this.f821k, (C0224a.C0234c) new C0224a.C0234c() {
            /* renamed from: a */
            public void mo587a() {
                int unused = C0246c.this.f819i = 4;
                C0246c.this.m962a(new C0254b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo588a(int i, String str) {
                int unused = C0246c.this.f819i = 5;
                C0246c.this.m962a(new C0254b(2, 100, 10003, C0492g.m2254a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m963a(final C0477n nVar) {
        this.f817g.mo576a(nVar, this.f821k, (C0224a.C0233b) new C0224a.C0233b() {
            /* renamed from: a */
            public void mo590a(C0831b bVar) {
                int unused = C0246c.this.f819i = 4;
                C0246c.this.m962a(new C0254b(1, 100, nVar));
            }

            /* renamed from: a */
            public void mo589a() {
                int unused = C0246c.this.f819i = 5;
                C0246c.this.m962a(new C0254b(2, 100, 10003, C0492g.m2254a(10003)));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m962a(C0254b bVar) {
        int a = bVar.mo625a();
        int b = bVar.mo626b();
        if (this.f820j.get()) {
            if (a == 1 && b == 100) {
                C0224a.m881a(C0558m.m2663a()).mo574a(new C0253a(this.f811a, bVar.mo627c()));
                C0251a.m980a(bVar.mo627c(), 1, this.f821k);
            }
        } else if (a == 1) {
            C0238b bVar2 = new C0238b(this.f813c, bVar.mo627c(), b == 101);
            TTAdNative.AppOpenAdListener appOpenAdListener = this.f815e;
            if (appOpenAdListener != null) {
                appOpenAdListener.onAppOpenAdLoaded(bVar2);
            }
            this.f820j.set(true);
            if (b == 101) {
                C0251a.m981a(bVar.mo627c(), System.currentTimeMillis() - this.f821k.mo1506a());
            } else if (b == 100) {
                C0251a.m980a(bVar.mo627c(), 0, this.f821k);
                this.f817g.mo573a(this.f812b);
            }
        } else if (a == 2 || a == 3) {
            TTAdNative.AppOpenAdListener appOpenAdListener2 = this.f815e;
            if (appOpenAdListener2 != null) {
                appOpenAdListener2.onError(bVar.mo628d(), bVar.mo629e());
            }
            this.f820j.set(true);
            if (a == 3) {
                C0251a.m977a(this.f819i, this.f818h);
            }
        }
    }

    /* renamed from: a */
    public int mo620a(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            m962a(new C0254b(2, 102, 40006, C0492g.m2254a(40006)));
            return 0;
        }
    }

    /* renamed from: a */
    public void mo5a(Message message) {
        if (message.what == 1 && !this.f820j.get()) {
            m962a(new C0254b(3, 102, 10002, C0492g.m2254a(10002)));
        }
    }
}
