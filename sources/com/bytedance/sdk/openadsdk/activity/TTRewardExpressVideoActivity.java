package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import java.util.HashMap;
import java.util.Map;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo52J() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo81o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo97u() {
        if (this.f81c == null) {
            finish();
            return;
        }
        this.f93o.mo781a(false);
        super.mo97u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo68d() {
        super.mo68d();
        if (C0480p.m2198i(this.f81c)) {
            this.f93o.mo781a(true);
            this.f93o.mo784b();
            mo58a(false);
            return;
        }
        mo69d(0);
    }

    /* renamed from: a */
    public boolean mo156a(long j, boolean z) {
        C0146j jVar;
        if (this.f90l == null || this.f90l.mo985a() == null) {
            jVar = new C0146j();
        } else {
            jVar = this.f90l.mo985a().getAdShowTime();
        }
        this.f91m.mo732a(this.f90l.mo992b(), this.f81c, this.f71a, mo51I(), jVar);
        HashMap hashMap = new HashMap();
        if (this.f90l != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.f90l.mo1000i()));
        }
        if (!TextUtils.isEmpty(this.f48D)) {
            hashMap.put("rit_scene", this.f48D);
        }
        this.f91m.mo737a((Map<String, Object>) hashMap);
        this.f91m.mo733a((C10192c.C10193a) new C10192c.C10193a() {
            /* renamed from: a */
            public void mo33a(long j, int i) {
                TTRewardExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.mo47E();
                TTRewardExpressVideoActivity.this.f90l.mo993b(true);
                TTRewardExpressVideoActivity.this.mo219N();
                if (C0464l.m1967b(TTRewardExpressVideoActivity.this.f81c)) {
                    TTRewardExpressVideoActivity.this.f58N.set(true);
                    TTRewardExpressVideoActivity.this.mo80n();
                } else if (TTRewardExpressVideoActivity.this.mo75i()) {
                    TTRewardExpressVideoActivity.this.mo58a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f254S = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.mo159M();
            }

            /* renamed from: b */
            public void mo35b(long j, int i) {
                TTRewardExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                if (C0934b.m4334c()) {
                    TTRewardExpressVideoActivity.this.mo221c("onVideoError");
                } else if (TTRewardExpressVideoActivity.this.f255T != null) {
                    TTRewardExpressVideoActivity.this.f255T.onVideoError();
                }
                TTRewardExpressVideoActivity.this.mo46D();
                if (!TTRewardExpressVideoActivity.this.f91m.mo744b()) {
                    TTRewardExpressVideoActivity.this.mo47E();
                    TTRewardExpressVideoActivity.this.mo159M();
                    TTRewardExpressVideoActivity.this.f91m.mo756m();
                    if (TTRewardExpressVideoActivity.this.mo75i()) {
                        TTRewardExpressVideoActivity.this.mo58a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                    TTRewardExpressVideoActivity.this.f90l.mo991a(true);
                    TTRewardExpressVideoActivity.this.f91m.mo730a(true ^ TTRewardExpressVideoActivity.this.f91m.mo725B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo32a() {
                TTRewardExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.mo47E();
                if (TTRewardExpressVideoActivity.this.mo75i()) {
                    TTRewardExpressVideoActivity.this.mo58a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.f91m.mo730a(TTRewardExpressVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0, TTRewardExpressVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0);
                TTRewardExpressVideoActivity.this.f91m.mo756m();
            }

            /* renamed from: a */
            public void mo34a(long j, long j2) {
                if (!TTRewardExpressVideoActivity.this.f52H && TTRewardExpressVideoActivity.this.f91m.mo744b()) {
                    TTRewardExpressVideoActivity.this.f91m.mo758o();
                }
                if (!TTRewardExpressVideoActivity.this.f100v.get()) {
                    TTRewardExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                    if (j != TTRewardExpressVideoActivity.this.f91m.mo749f()) {
                        TTRewardExpressVideoActivity.this.mo47E();
                    }
                    if (TTRewardExpressVideoActivity.this.f91m.mo744b()) {
                        TTRewardExpressVideoActivity.this.f91m.mo731a(j);
                        int f = C0558m.m2673h().mo1690f(String.valueOf(TTRewardExpressVideoActivity.this.f98t));
                        boolean z = TTRewardExpressVideoActivity.this.f90l.mo999h() && f != -1 && f >= 0;
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTRewardExpressVideoActivity.f97s = (int) (tTRewardExpressVideoActivity.f91m.mo726C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTRewardExpressVideoActivity.this.f45A.get() || TTRewardExpressVideoActivity.this.f103y.get()) && TTRewardExpressVideoActivity.this.f91m.mo744b()) {
                            TTRewardExpressVideoActivity.this.f91m.mo758o();
                        }
                        if (TTRewardExpressVideoActivity.this.f97s >= 0) {
                            TTRewardExpressVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardExpressVideoActivity.this.f97s), (CharSequence) null);
                        }
                        TTRewardExpressVideoActivity.this.f87i.mo1019c(i);
                        TTRewardExpressVideoActivity.this.mo220a(j, j2);
                        if (!(TTRewardExpressVideoActivity.this.f90l == null || TTRewardExpressVideoActivity.this.f90l.mo985a() == null)) {
                            TTRewardExpressVideoActivity.this.f90l.mo985a().mo1879a((CharSequence) String.valueOf(TTRewardExpressVideoActivity.this.f97s), i, 0);
                        }
                        if (TTRewardExpressVideoActivity.this.f97s > 0) {
                            if (!z || i < f || TTRewardExpressVideoActivity.this.f81c.mo1428f() == 5) {
                                TTRewardExpressVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardExpressVideoActivity.this.f97s), (CharSequence) null);
                                return;
                            }
                            TTRewardExpressVideoActivity.this.f101w.getAndSet(true);
                            TTRewardExpressVideoActivity.this.f89k.mo711d(true);
                            TTRewardExpressVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardExpressVideoActivity.this.f97s), (CharSequence) C0516f.f1879c);
                            TTRewardExpressVideoActivity.this.f89k.mo712e(true);
                        } else if (TTRewardExpressVideoActivity.this.mo75i()) {
                            TTRewardExpressVideoActivity.this.mo58a(false);
                        } else {
                            TTRewardExpressVideoActivity.this.finish();
                        }
                    }
                }
            }
        });
        boolean a = mo61a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f253R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }
}
