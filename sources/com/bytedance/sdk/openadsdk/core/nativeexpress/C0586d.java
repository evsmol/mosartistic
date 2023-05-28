package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10197a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0424a;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0433b;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0463k;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.video.p035d.C0668a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.p046i.C0826a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.p046i.p047a.C0827a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d */
/* compiled from: ExpressAdLoadManager */
public class C0586d {

    /* renamed from: j */
    private static Set<C0586d> f2210j = Collections.synchronizedSet(new HashSet());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AdSlot f2211a;

    /* renamed from: b */
    private final C0561n f2212b = C0558m.m2671f();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f2213c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTAdNative.NativeExpressAdListener f2214d;

    /* renamed from: e */
    private final AtomicBoolean f2215e = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C0477n> f2216f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C0477n> f2217g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0589a f2218h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f2219i = 5;

    /* renamed from: k */
    private ScheduledFuture<?> f2220k = null;

    /* renamed from: l */
    private ScheduledFuture<?> f2221l = null;

    /* renamed from: m */
    private ScheduledFuture<?> f2222m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f2223n = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.d$a */
    /* compiled from: ExpressAdLoadManager */
    public interface C0589a {
        /* renamed from: a */
        void mo1166a();

        /* renamed from: a */
        void mo1167a(List<C0477n> list);
    }

    private C0586d(Context context) {
        if (context != null) {
            this.f2213c = context.getApplicationContext();
        } else {
            this.f2213c = C0558m.m2663a();
        }
        f2210j.add(this);
    }

    /* renamed from: a */
    public static C0586d m2824a(Context context) {
        return new C0586d(context);
    }

    /* renamed from: a */
    public void mo1956a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, int i2) {
        mo1957a(adSlot, i, nativeExpressAdListener, (C0589a) null, i2);
    }

    /* renamed from: a */
    public void mo1957a(AdSlot adSlot, int i, TTAdNative.NativeExpressAdListener nativeExpressAdListener, C0589a aVar, int i2) {
        this.f2223n = System.currentTimeMillis();
        if (this.f2215e.get()) {
            C10638l.m31242e("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.f2219i = i;
        this.f2215e.set(true);
        this.f2211a = adSlot;
        this.f2214d = nativeExpressAdListener;
        this.f2218h = aVar;
        m2831a(adSlot, nativeExpressAdListener);
    }

    /* renamed from: a */
    private void m2831a(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        if (adSlot != null) {
            C0479o oVar = new C0479o();
            oVar.f1731f = 2;
            this.f2212b.mo1840a(adSlot, oVar, this.f2219i, new C0561n.C0562a() {
                /* renamed from: a */
                public void mo186a(int i, String str) {
                    C0586d.this.m2828a(i, str);
                }

                /* renamed from: a */
                public void mo187a(C0448a aVar, C0449b bVar) {
                    if (aVar.mo1199b() == null || aVar.mo1199b().isEmpty()) {
                        C0586d.this.m2828a(-3, C0492g.m2254a(-3));
                        bVar.mo1204a(-3);
                        C0449b.m1835a(bVar);
                        return;
                    }
                    List unused = C0586d.this.f2216f = aVar.mo1199b();
                    List unused2 = C0586d.this.f2217g = aVar.mo1199b();
                    C0586d.this.m2830a(adSlot);
                    C0586d dVar = C0586d.this;
                    dVar.m2829a(dVar.f2223n);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2830a(AdSlot adSlot) {
        List<C0477n> list = this.f2216f;
        if (list != null) {
            for (C0477n next : list) {
                if (next.mo1394ao() && next.mo1336P() != null && !next.mo1336P().isEmpty()) {
                    for (C0463k next2 : next.mo1336P()) {
                        if (!TextUtils.isEmpty(next2.mo1281a())) {
                            C0835d.m4093a().mo2661c().mo2637a(new C0826a(next2.mo1281a(), next2.mo1292g()), C0827a.m4053b(), next2.mo1285b(), next2.mo1288c(), (String) null);
                        }
                    }
                }
                if (!(!C0477n.m2012c(next) || next.mo1330J() == null || next.mo1330J().mo62923i() == null)) {
                    if (C0558m.m2673h().mo1679b(String.valueOf(C0996u.m4657f(next))) && C0558m.m2673h().mo1669G()) {
                        C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(next.mo1373aD()).mo62645a(), next);
                        a.mo62940a("material_meta", next);
                        a.mo62940a("ad_slot", adSlot);
                        C0668a.m3283a(a, (C10197a.C10198a) null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2829a(final long j) {
        if (this.f2215e.getAndSet(false)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C0586d.this.f2217g == null || C0586d.this.f2217g.size() <= 0) {
                        if (C0586d.this.f2214d != null) {
                            C0586d.this.f2214d.onError(108, C0492g.m2254a(108));
                            C0586d.this.m2827a(108);
                        }
                        if (C0586d.this.f2218h != null) {
                            C0586d.this.f2218h.mo1166a();
                        }
                    } else {
                        if (C0586d.this.f2214d != null) {
                            ArrayList arrayList = new ArrayList(C0586d.this.f2217g.size());
                            for (C0477n a : C0586d.this.f2217g) {
                                arrayList.add(C0586d.this.m2822a(a));
                            }
                            if (!arrayList.isEmpty()) {
                                if (!TextUtils.isEmpty(C0586d.this.f2211a.getBidAdm())) {
                                    C0136e.m608a((C0477n) C0586d.this.f2217g.get(0), C0996u.m4632b(C0586d.this.f2219i), System.currentTimeMillis() - C0586d.this.f2223n);
                                } else {
                                    C0136e.m618b(C0586d.this.f2213c, (C0477n) C0586d.this.f2217g.get(0), C0996u.m4632b(C0586d.this.f2211a.getDurationSlotType()), j);
                                }
                                C0586d.this.f2214d.onNativeExpressAdLoad(arrayList);
                            } else {
                                C0586d.this.f2214d.onError(103, C0492g.m2254a(103));
                                C0586d.this.m2827a(103);
                            }
                        }
                        if (C0586d.this.f2218h != null) {
                            C0586d.this.f2218h.mo1167a(C0586d.this.f2217g);
                        }
                    }
                    C0586d.this.m2826a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2827a(int i) {
        List<C0477n> list = this.f2216f;
        C0795b e = C0795b.m3955b().mo2577a(this.f2219i).mo2582c(this.f2211a.getCodeId()).mo2586e((list == null || list.size() <= 0) ? "" : C0996u.m4669h(this.f2216f.get(0)));
        e.mo2580b(i).mo2588f(C0492g.m2254a(i));
        C0796b.m3985a().mo2610b(e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2828a(int i, String str) {
        if (this.f2215e.getAndSet(false)) {
            TTAdNative.NativeExpressAdListener nativeExpressAdListener = this.f2214d;
            if (nativeExpressAdListener != null) {
                nativeExpressAdListener.onError(i, str);
            }
            C0589a aVar = this.f2218h;
            if (aVar != null) {
                aVar.mo1166a();
            }
            m2826a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TTNativeExpressAd m2822a(C0477n nVar) {
        if (this.f2219i != 1) {
            return null;
        }
        if (nVar.mo1330J() != null) {
            return new C0433b(this.f2213c, nVar, this.f2211a);
        }
        return new C0424a(this.f2213c, nVar, this.f2211a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2826a() {
        List<C0477n> list = this.f2216f;
        if (list != null) {
            list.clear();
        }
        List<C0477n> list2 = this.f2217g;
        if (list2 != null) {
            list2.clear();
        }
        m2836a(true);
        m2840b(true);
        m2842c(true);
        m2839b();
    }

    /* renamed from: a */
    private void m2836a(boolean z) {
        try {
            if (this.f2221l != null && !this.f2221l.isCancelled()) {
                boolean cancel = this.f2221l.cancel(z);
                C10638l.m31242e("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m2840b(boolean z) {
        try {
            if (this.f2222m != null && !this.f2222m.isCancelled()) {
                boolean cancel = this.f2222m.cancel(z);
                C10638l.m31235b("ExpressAdLoadManager", "CheckValidDoneFutureTask-->cancel.....success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m2842c(boolean z) {
        try {
            if (this.f2220k != null && !this.f2220k.isCancelled()) {
                boolean cancel = this.f2220k.cancel(z);
                C10638l.m31242e("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=" + cancel);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m2839b() {
        f2210j.remove(this);
    }
}
