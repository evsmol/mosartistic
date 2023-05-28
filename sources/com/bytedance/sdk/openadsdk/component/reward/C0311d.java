package com.bytedance.sdk.openadsdk.component.reward;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10187b;
import com.bykv.p271vk.openvk.component.video.api.p288c.C10188c;
import com.bykv.p271vk.openvk.component.video.api.p290e.C10199b;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10201b;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10631h;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.C0296b;
import com.bytedance.sdk.openadsdk.core.C0492g;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.p021e.C0448a;
import com.bytedance.sdk.openadsdk.core.p021e.C0449b;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.video.p033b.C0642a;
import com.bytedance.sdk.openadsdk.core.video.p035d.C0668a;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p046i.C0833b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.d */
/* compiled from: FullScreenVideoLoadManager */
public class C0311d {

    /* renamed from: a */
    private static volatile C0311d f1024a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f1025b;

    /* renamed from: c */
    private final C0561n f1026c = C0558m.m2671f();

    /* renamed from: d */
    private AtomicBoolean f1027d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C0319a> f1028e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10618g f1029f;

    /* renamed from: g */
    private final BroadcastReceiver f1030g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (C0311d.this.f1029f == null) {
                    C0311d dVar = C0311d.this;
                    C10618g unused = dVar.f1029f = new C0263a("fsv net connect task", dVar.f1028e);
                }
                C10631h.m31217a().post(C0311d.this.f1029f);
            }
        }
    };

    /* renamed from: a */
    public static C0311d m1344a(Context context) {
        if (f1024a == null) {
            synchronized (C0311d.class) {
                if (f1024a == null) {
                    f1024a = new C0311d(context);
                }
            }
        }
        return f1024a;
    }

    private C0311d(Context context) {
        this.f1025b = context == null ? C0558m.m2663a() : context.getApplicationContext();
        m1351c();
    }

    /* renamed from: a */
    public void mo860a() {
        try {
            C0296b.m1271a(this.f1025b).mo830a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public void mo865b() {
        AdSlot b = C0296b.m1271a(this.f1025b).mo835b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C0296b.m1271a(this.f1025b).mo838c(b.getCodeId()) == null) {
            mo866b(b);
        }
    }

    /* renamed from: a */
    public void mo861a(AdSlot adSlot) {
        C0296b.m1271a(this.f1025b).mo837b(adSlot);
    }

    /* renamed from: a */
    public void mo862a(AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        C10638l.m31235b("FullScreenVideoLoadManager", "load full screen video: " + String.valueOf(adSlot));
        C10638l.m31235b("bidding", "load full video: BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
        C0296b.m1271a(this.f1025b).mo831a(adSlot);
        m1345a(adSlot, false, fullScreenVideoAdListener);
    }

    /* renamed from: b */
    public void mo866b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C10638l.m31235b("FullScreenVideoLoadManager", "preload full screen video: " + String.valueOf(adSlot));
            m1345a(adSlot, true, (TTAdNative.FullScreenVideoAdListener) null);
            return;
        }
        C10638l.m31235b("bidding", "preload not request bidding ：BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m1345a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m1346a(adSlot, true, fullScreenVideoAdListener, currentTimeMillis);
            return;
        }
        C0477n c = C0296b.m1271a(this.f1025b).mo838c(adSlot.getCodeId());
        if (c != null) {
            C0348k kVar = new C0348k(this.f1025b, c, adSlot);
            if (!C0480p.m2198i(c)) {
                kVar.mo914a(C0296b.m1271a(this.f1025b).mo828a(c));
            }
            C0136e.m606a(c);
            if (fullScreenVideoAdListener != null) {
                fullScreenVideoAdListener.onFullScreenVideoAdLoad(kVar);
                if (!C0480p.m2198i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C10187b J = c.mo1330J();
                        C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(c.mo1373aD()).mo62649b(), c);
                        a.mo62940a("material_meta", c);
                        a.mo62940a("ad_slot", adSlot);
                        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
                        final C0477n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C0668a.m3283a(a, new C10199b() {
                            /* renamed from: a */
                            public void mo591a(C10188c cVar, int i) {
                                if (fullScreenVideoAdListener2 != null) {
                                    C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onFullScreenVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo592a(C10188c cVar, int i, String str) {
                                C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail");
                                if (fullScreenVideoAdListener2 != null && J.mo62934s()) {
                                    C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j);
                                    fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: Cached ad onVideoPreloadFail and exec onFullScreenVideoCached");
                                }
                            }
                        });
                    } else {
                        C0136e.m618b(this.f1025b, c, C0996u.m4632b(adSlot.getDurationSlotType()), currentTimeMillis);
                        fullScreenVideoAdListener.onFullScreenVideoCached();
                    }
                }
            }
            final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener3 = fullScreenVideoAdListener;
            final C0477n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C0642a.m3091a().mo2122a(c, (C0642a.C0647a) new C0642a.C0647a() {
                /* renamed from: a */
                public void mo868a(boolean z) {
                    if (fullScreenVideoAdListener3 != null && C0480p.m2198i(nVar2)) {
                        C0136e.m618b(C0311d.this.f1025b, nVar2, C0996u.m4632b(adSlot3.getDurationSlotType()), j2);
                        fullScreenVideoAdListener3.onFullScreenVideoCached();
                    }
                }
            });
            C10638l.m31235b("FullScreenVideoLoadManager", "get cache data success");
            C10638l.m31235b("bidding", "full video get cache data success");
            return;
        }
        m1346a(adSlot, false, fullScreenVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m1346a(AdSlot adSlot, boolean z, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener, long j) {
        C10638l.m31235b("bidding", "full video doNetwork , get new materials:BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C0479o oVar = new C0479o();
        oVar.f1728c = z ? 2 : 1;
        if (C0558m.m2673h().mo1697h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f1731f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener2 = fullScreenVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f1026c.mo1840a(adSlot, oVar, 8, new C0561n.C0562a() {
            /* renamed from: a */
            public void mo186a(int i, String str) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo187a(C0448a aVar, C0449b bVar) {
                TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener;
                if (aVar.mo1199b() != null && !aVar.mo1199b().isEmpty()) {
                    C10638l.m31235b("FullScreenVideoLoadManager", "get material data success isPreload=" + z2);
                    final C0477n nVar = aVar.mo1199b().get(0);
                    try {
                        if (nVar.mo1333M() != null && !TextUtils.isEmpty(nVar.mo1333M().mo1281a())) {
                            C0833b bVar2 = new C0833b(true);
                            bVar2.mo2645a(adSlot2.getCodeId());
                            bVar2.mo2644a(8);
                            bVar2.mo2647c(nVar.mo1345Y());
                            bVar2.mo2648d(nVar.mo1382ac());
                            bVar2.mo2646b(C0996u.m4669h(nVar));
                            C0750a.m3820a(nVar.mo1333M()).mo64102a((C10565n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C0348k kVar = new C0348k(C0311d.this.f1025b, nVar, adSlot2);
                    if (!z2 && fullScreenVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C0136e.m608a(nVar, "fullscreen_interstitial_ad", System.currentTimeMillis() - currentTimeMillis);
                        }
                        fullScreenVideoAdListener2.onFullScreenVideoAdLoad(kVar);
                    }
                    C0642a.m3091a().mo2122a(nVar, (C0642a.C0647a) new C0642a.C0647a() {
                        /* renamed from: a */
                        public void mo868a(boolean z) {
                            C0477n nVar;
                            if (!z2 && fullScreenVideoAdListener2 != null && (nVar = nVar) != null && C0480p.m2198i(nVar)) {
                                C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                fullScreenVideoAdListener2.onFullScreenVideoCached();
                            }
                        }
                    });
                    if (z2 && !C0480p.m2198i(nVar) && C0558m.m2673h().mo1711n(adSlot2.getCodeId()).f1842d == 1 && !C10642o.m31261d(C0311d.this.f1025b)) {
                        C0311d.this.m1347a(new C0319a(nVar, adSlot2));
                    } else if (C0480p.m2198i(nVar)) {
                        C0296b.m1271a(C0311d.this.f1025b).mo832a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C10187b J = nVar.mo1330J();
                        if (J != null) {
                            C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(nVar.mo1373aD()).mo62649b(), nVar);
                            a.mo62940a("material_meta", nVar);
                            a.mo62940a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                            C0668a.m3283a(a, new C10199b() {
                                /* renamed from: a */
                                public void mo591a(C10188c cVar, int i) {
                                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadSuccess");
                                    if (!z2) {
                                        if (fullScreenVideoAdListener2 != null) {
                                            C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                            fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        }
                                        C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: onFullScreenVideoCached");
                                        return;
                                    }
                                    C0296b.m1271a(C0311d.this.f1025b).mo832a(adSlot2, nVar);
                                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog:  ad json save");
                                }

                                /* renamed from: a */
                                public void mo592a(C10188c cVar, int i, String str) {
                                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail");
                                    if (fullScreenVideoAdListener2 != null && J.mo62934s()) {
                                        C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                        C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog:  onVideoPreloadFail and exec onFullScreenVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C0296b.m1271a(C0311d.this.f1025b).mo833a(nVar, (C0296b.C0300a<Object>) new C0296b.C0300a<Object>() {
                            /* renamed from: a */
                            public void mo841a(boolean z, Object obj) {
                                C10638l.m31235b("FullScreenVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    kVar.mo914a(C0296b.m1271a(C0311d.this.f1025b).mo828a(nVar));
                                }
                                if (!z2) {
                                    C0136e.m606a(nVar);
                                    if (z && fullScreenVideoAdListener2 != null) {
                                        C0136e.m618b(C0311d.this.f1025b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                        fullScreenVideoAdListener2.onFullScreenVideoCached();
                                    }
                                } else if (z) {
                                    C0296b.m1271a(C0311d.this.f1025b).mo832a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (fullScreenVideoAdListener = fullScreenVideoAdListener2) != null) {
                    fullScreenVideoAdListener.onError(-3, C0492g.m2254a(-3));
                    bVar.mo1204a(-3);
                    C0449b.m1835a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo863a(String str) {
        C0296b.m1271a(this.f1025b).mo834a(str);
    }

    /* renamed from: b */
    public AdSlot mo864b(String str) {
        return C0296b.m1271a(this.f1025b).mo836b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1347a(C0319a aVar) {
        if (aVar != null) {
            if (this.f1028e.size() >= 1) {
                this.f1028e.remove(0);
            }
            this.f1028e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m1351c() {
        if (!this.f1027d.get()) {
            this.f1027d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f1025b.registerReceiver(this.f1030g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private void m1352d() {
        if (this.f1027d.get()) {
            this.f1027d.set(false);
            try {
                this.f1025b.unregisterReceiver(this.f1030g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f1029f != null) {
            try {
                C10631h.m31217a().removeCallbacks(this.f1029f);
            } catch (Exception unused) {
            }
            this.f1029f = null;
        }
        m1352d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.d$a */
    /* compiled from: FullScreenVideoLoadManager */
    private static class C0319a extends C10618g {

        /* renamed from: a */
        C0477n f1057a;

        /* renamed from: b */
        AdSlot f1058b;

        C0319a(C0477n nVar, AdSlot adSlot) {
            super("Fullscreen Task");
            this.f1057a = nVar;
            this.f1058b = adSlot;
        }

        public void run() {
            if (this.f1057a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C0296b.m1271a(C0558m.m2663a()).mo833a(this.f1057a, (C0296b.C0300a<Object>) new C0296b.C0300a<Object>() {
                        /* renamed from: a */
                        public void mo841a(boolean z, Object obj) {
                            if (z) {
                                C0296b.m1271a(C0558m.m2663a()).mo832a(C0319a.this.f1058b, C0319a.this.f1057a);
                                C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                                return;
                            }
                            C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail ");
                        }
                    });
                } else if (this.f1057a.mo1330J() != null) {
                    C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f1057a.mo1373aD()).mo62649b(), this.f1057a);
                    a.mo62940a("material_meta", this.f1057a);
                    a.mo62940a("ad_slot", this.f1058b);
                    C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video ");
                    C0668a.m3283a(a, new C10199b() {
                        /* renamed from: a */
                        public void mo591a(C10188c cVar, int i) {
                            C0296b.m1271a(C0558m.m2663a()).mo832a(C0319a.this.f1058b, C0319a.this.f1057a);
                            C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net change ");
                        }

                        /* renamed from: a */
                        public void mo592a(C10188c cVar, int i, String str) {
                            C10638l.m31238c("FullScreenVideoLoadManager", "FullScreenLog: preload video success with net fail with net change ");
                        }
                    });
                }
            }
        }
    }
}
