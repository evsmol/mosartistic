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
import com.bytedance.sdk.openadsdk.component.reward.C0330g;
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

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.i */
/* compiled from: RewardVideoLoadManager */
public class C0336i {

    /* renamed from: a */
    private static volatile C0336i f1086a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f1087b;

    /* renamed from: c */
    private final C0561n f1088c = C0558m.m2671f();

    /* renamed from: d */
    private AtomicBoolean f1089d = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C0344a> f1090e = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10618g f1091f;

    /* renamed from: g */
    private final BroadcastReceiver f1092g = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (C0336i.this.f1091f == null) {
                    C0336i iVar = C0336i.this;
                    C10618g unused = iVar.f1091f = new C0263a("net connect task", iVar.f1090e);
                }
                C10631h.m31217a().post(C0336i.this.f1091f);
            }
        }
    };

    /* renamed from: a */
    public static C0336i m1401a(Context context) {
        if (f1086a == null) {
            synchronized (C0336i.class) {
                if (f1086a == null) {
                    f1086a = new C0336i(context);
                }
            }
        }
        return f1086a;
    }

    private C0336i(Context context) {
        this.f1087b = context == null ? C0558m.m2663a() : context.getApplicationContext();
        m1408c();
    }

    /* renamed from: a */
    public void mo895a() {
        AdSlot b = C0330g.m1373a(this.f1087b).mo888b();
        if (b != null && !TextUtils.isEmpty(b.getCodeId()) && C0330g.m1373a(this.f1087b).mo891c(b.getCodeId()) == null) {
            mo901b(b);
        }
    }

    /* renamed from: a */
    public void mo896a(AdSlot adSlot) {
        C0330g.m1373a(this.f1087b).mo890b(adSlot);
    }

    /* renamed from: b */
    public void mo900b() {
        try {
            C0330g.m1373a(this.f1087b).mo883a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo897a(AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        C10638l.m31235b("RewardVideoLoadManager", "load reward vide: " + String.valueOf(adSlot));
        C10638l.m31235b("bidding", "load reward vide: BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
        C0330g.m1373a(this.f1087b).mo884a(adSlot);
        m1402a(adSlot, false, rewardVideoAdListener);
    }

    /* renamed from: b */
    public void mo901b(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            C10638l.m31235b("RewardVideoLoadManager", "preload reward video: " + String.valueOf(adSlot));
            m1402a(adSlot, true, (TTAdNative.RewardVideoAdListener) null);
            return;
        }
        C10638l.m31235b("bidding", "preload not request bidding：BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
    }

    /* renamed from: a */
    private void m1402a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m1403a(adSlot, true, rewardVideoAdListener, currentTimeMillis);
            return;
        }
        C0477n c = C0330g.m1373a(this.f1087b).mo891c(adSlot.getCodeId());
        if (c != null) {
            C0351l lVar = new C0351l(this.f1087b, c, adSlot);
            if (!C0480p.m2198i(c)) {
                lVar.mo928a(C0330g.m1373a(this.f1087b).mo881a(c));
            }
            C0136e.m606a(c);
            if (rewardVideoAdListener != null) {
                rewardVideoAdListener.onRewardVideoAdLoad(lVar);
                if (!C0480p.m2198i(c)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        final C10187b J = c.mo1330J();
                        C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(c.mo1373aD()).mo62649b(), c);
                        a.mo62940a("material_meta", c);
                        a.mo62940a("ad_slot", adSlot);
                        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
                        final C0477n nVar = c;
                        final AdSlot adSlot2 = adSlot;
                        final long j = currentTimeMillis;
                        C0668a.m3283a(a, new C10199b() {
                            /* renamed from: a */
                            public void mo591a(C10188c cVar, int i) {
                                if (rewardVideoAdListener2 != null) {
                                    C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onRewardVideoCached");
                                }
                            }

                            /* renamed from: a */
                            public void mo592a(C10188c cVar, int i, String str) {
                                C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail");
                                if (rewardVideoAdListener2 != null && J.mo62934s()) {
                                    C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j);
                                    rewardVideoAdListener2.onRewardVideoCached();
                                    C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: Cached ad  onVideoPreloadFail and exec onRewardVideoCached");
                                }
                            }
                        });
                    } else {
                        C0136e.m618b(this.f1087b, c, C0996u.m4632b(adSlot.getDurationSlotType()), currentTimeMillis);
                        rewardVideoAdListener.onRewardVideoCached();
                    }
                }
            }
            final TTAdNative.RewardVideoAdListener rewardVideoAdListener3 = rewardVideoAdListener;
            final C0477n nVar2 = c;
            final AdSlot adSlot3 = adSlot;
            final long j2 = currentTimeMillis;
            C0642a.m3091a().mo2122a(c, (C0642a.C0647a) new C0642a.C0647a() {
                /* renamed from: a */
                public void mo868a(boolean z) {
                    if (rewardVideoAdListener3 != null && C0480p.m2198i(nVar2)) {
                        C0136e.m618b(C0336i.this.f1087b, nVar2, C0996u.m4632b(adSlot3.getDurationSlotType()), j2);
                        rewardVideoAdListener3.onRewardVideoCached();
                    }
                }
            });
            C10638l.m31235b("RewardVideoLoadManager", "get cache data success");
            C10638l.m31235b("bidding", "reward video get cache data success");
            return;
        }
        m1403a(adSlot, false, rewardVideoAdListener, currentTimeMillis);
    }

    /* renamed from: a */
    private void m1403a(AdSlot adSlot, boolean z, TTAdNative.RewardVideoAdListener rewardVideoAdListener, long j) {
        C10638l.m31235b("bidding", "reward video doNetwork , get new materials:BidAdm->MD5->" + C10201b.m29279a(adSlot.getBidAdm()));
        final long currentTimeMillis = System.currentTimeMillis();
        C0479o oVar = new C0479o();
        oVar.f1727b = z ? 2 : 1;
        if (C0558m.m2673h().mo1697h(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            oVar.f1731f = 2;
        }
        final boolean z2 = z;
        final TTAdNative.RewardVideoAdListener rewardVideoAdListener2 = rewardVideoAdListener;
        final AdSlot adSlot2 = adSlot;
        final long j2 = j;
        AdSlot adSlot3 = adSlot;
        this.f1088c.mo1840a(adSlot, oVar, 7, new C0561n.C0562a() {
            /* renamed from: a */
            public void mo186a(int i, String str) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(i, str);
                }
            }

            /* renamed from: a */
            public void mo187a(C0448a aVar, C0449b bVar) {
                TTAdNative.RewardVideoAdListener rewardVideoAdListener;
                if (aVar.mo1199b() != null && !aVar.mo1199b().isEmpty()) {
                    C10638l.m31235b("RewardVideoLoadManager", "get material data success isPreload=" + z2);
                    final C0477n nVar = aVar.mo1199b().get(0);
                    try {
                        if (nVar.mo1333M() != null && !TextUtils.isEmpty(nVar.mo1333M().mo1281a())) {
                            C0833b bVar2 = new C0833b(true);
                            bVar2.mo2645a(adSlot2.getCodeId());
                            bVar2.mo2644a(7);
                            bVar2.mo2647c(nVar.mo1345Y());
                            bVar2.mo2648d(nVar.mo1382ac());
                            bVar2.mo2646b(C0996u.m4669h(nVar));
                            C0750a.m3820a(nVar.mo1333M()).mo64102a((C10565n) bVar2);
                        }
                    } catch (Throwable unused) {
                    }
                    final C0351l lVar = new C0351l(C0336i.this.f1087b, nVar, adSlot2);
                    if (!z2 && rewardVideoAdListener2 != null) {
                        if (!TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C0136e.m608a(nVar, "rewarded_video", System.currentTimeMillis() - currentTimeMillis);
                        }
                        rewardVideoAdListener2.onRewardVideoAdLoad(lVar);
                    }
                    C0642a.m3091a().mo2122a(nVar, (C0642a.C0647a) new C0642a.C0647a() {
                        /* renamed from: a */
                        public void mo868a(boolean z) {
                            C0477n nVar;
                            if (!z2 && rewardVideoAdListener2 != null && (nVar = nVar) != null && C0480p.m2198i(nVar)) {
                                C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                rewardVideoAdListener2.onRewardVideoCached();
                            }
                        }
                    });
                    if (z2 && !C0480p.m2198i(nVar) && C0558m.m2673h().mo1711n(adSlot2.getCodeId()).f1842d == 1 && !C10642o.m31261d(C0336i.this.f1087b)) {
                        C0336i.this.m1404a(new C0344a(nVar, adSlot2));
                    } else if (C0480p.m2198i(nVar)) {
                        C0330g.m1373a(C0336i.this.f1087b).mo885a(adSlot2, nVar);
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        final C10187b J = nVar.mo1330J();
                        if (J != null) {
                            C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(nVar.mo1373aD()).mo62649b(), nVar);
                            a.mo62940a("material_meta", nVar);
                            a.mo62940a("ad_slot", adSlot2);
                            SystemClock.elapsedRealtime();
                            C0668a.m3283a(a, new C10199b() {
                                /* renamed from: a */
                                public void mo591a(C10188c cVar, int i) {
                                    C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess");
                                    if (z2) {
                                        C0330g.m1373a(C0336i.this.f1087b).mo885a(adSlot2, nVar);
                                        C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: ad json save");
                                    } else if (rewardVideoAdListener2 != null) {
                                        C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onRewardVideoCached");
                                    }
                                }

                                /* renamed from: a */
                                public void mo592a(C10188c cVar, int i, String str) {
                                    C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail");
                                    if (rewardVideoAdListener2 != null && J.mo62934s()) {
                                        C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                        C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog:  onVideoPreloadFail and exec onRewardVideoCached");
                                    }
                                }
                            });
                        }
                    } else {
                        C0330g.m1373a(C0336i.this.f1087b).mo886a(nVar, (C0330g.C0334a<Object>) new C0330g.C0334a<Object>() {
                            /* renamed from: a */
                            public void mo894a(boolean z, Object obj) {
                                C10638l.m31235b("RewardVideoLoadManager", "download video file: " + z + ", preload: " + z2);
                                if (z) {
                                    lVar.mo928a(C0330g.m1373a(C0336i.this.f1087b).mo881a(nVar));
                                }
                                if (!z2) {
                                    C0136e.m606a(nVar);
                                    if (z && rewardVideoAdListener2 != null) {
                                        C0136e.m618b(C0336i.this.f1087b, nVar, C0996u.m4632b(adSlot2.getDurationSlotType()), j2);
                                        rewardVideoAdListener2.onRewardVideoCached();
                                    }
                                } else if (z) {
                                    C0330g.m1373a(C0336i.this.f1087b).mo885a(adSlot2, nVar);
                                }
                            }
                        });
                    }
                } else if (!z2 && (rewardVideoAdListener = rewardVideoAdListener2) != null) {
                    rewardVideoAdListener.onError(-3, C0492g.m2254a(-3));
                    bVar.mo1204a(-3);
                    C0449b.m1835a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo898a(String str) {
        C0330g.m1373a(this.f1087b).mo887a(str);
    }

    /* renamed from: b */
    public AdSlot mo899b(String str) {
        return C0330g.m1373a(this.f1087b).mo889b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1404a(C0344a aVar) {
        if (aVar != null) {
            if (this.f1090e.size() >= 1) {
                this.f1090e.remove(0);
            }
            this.f1090e.add(aVar);
        }
    }

    /* renamed from: c */
    private void m1408c() {
        if (!this.f1089d.get()) {
            this.f1089d.set(true);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                this.f1087b.registerReceiver(this.f1092g, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    private void m1409d() {
        if (this.f1089d.get()) {
            this.f1089d.set(false);
            try {
                this.f1087b.unregisterReceiver(this.f1092g);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        if (this.f1091f != null) {
            try {
                C10631h.m31217a().removeCallbacks(this.f1091f);
            } catch (Exception unused) {
            }
            this.f1091f = null;
        }
        m1409d();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.i$a */
    /* compiled from: RewardVideoLoadManager */
    public static class C0344a extends C10618g {

        /* renamed from: a */
        C0477n f1119a;

        /* renamed from: b */
        AdSlot f1120b;

        C0344a(C0477n nVar, AdSlot adSlot) {
            super("Reward Task");
            this.f1119a = nVar;
            this.f1120b = adSlot;
        }

        public void run() {
            if (this.f1119a != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    C0330g.m1373a(C0558m.m2663a()).mo886a(this.f1119a, (C0330g.C0334a<Object>) new C0330g.C0334a<Object>() {
                        /* renamed from: a */
                        public void mo894a(boolean z, Object obj) {
                            if (z) {
                                C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                                C0330g.m1373a(C0558m.m2663a()).mo885a(C0344a.this.f1120b, C0344a.this.f1119a);
                                return;
                            }
                            C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                } else if (this.f1119a.mo1330J() != null) {
                    C10188c a = C0477n.m2007a(CacheDirFactory.getICacheDir(this.f1119a.mo1373aD()).mo62649b(), this.f1119a);
                    a.mo62940a("material_meta", this.f1119a);
                    a.mo62940a("ad_slot", this.f1120b);
                    C0668a.m3283a(a, new C10199b() {
                        /* renamed from: a */
                        public void mo591a(C10188c cVar, int i) {
                            C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadSuccess with net change !!");
                            C0330g.m1373a(C0558m.m2663a()).mo885a(C0344a.this.f1120b, C0344a.this.f1119a);
                        }

                        /* renamed from: a */
                        public void mo592a(C10188c cVar, int i, String str) {
                            C10638l.m31238c("RewardVideoLoadManager", "RewardVideoLog: onVideoPreloadFail with net change !!");
                        }
                    });
                }
            }
        }
    }
}
