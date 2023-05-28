package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0308c;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import java.util.HashMap;
import java.util.Map;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
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
        C0146j jVar2 = jVar;
        if (this.f56L == null || !(this.f56L instanceof C0308c) || this.f57M) {
            this.f91m.mo732a(this.f90l.mo992b(), this.f81c, this.f71a, mo51I(), jVar2);
        } else {
            this.f91m.mo732a(((C0308c) this.f56L).mo859d(), this.f81c, this.f71a, mo51I(), jVar2);
        }
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
                TTFullScreenExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.mo47E();
                TTFullScreenExpressVideoActivity.this.f90l.mo993b(true);
                TTFullScreenExpressVideoActivity.this.mo159M();
                if (TTFullScreenExpressVideoActivity.this.mo75i()) {
                    TTFullScreenExpressVideoActivity.this.mo58a(false);
                } else if (C0477n.m2012c(TTFullScreenExpressVideoActivity.this.f81c)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                } else if (TTFullScreenExpressVideoActivity.this.f90l != null && TTFullScreenExpressVideoActivity.this.f90l.mo985a() != null) {
                    TTFullScreenExpressVideoActivity.this.f90l.mo985a().mo1879a((CharSequence) BuildConfig.ADAPTER_VERSION, 0, 0);
                    if (TTFullScreenExpressVideoActivity.this.f90l.mo999h()) {
                        TTFullScreenExpressVideoActivity.this.f89k.mo701a(BuildConfig.ADAPTER_VERSION, (CharSequence) "X");
                        TTFullScreenExpressVideoActivity.this.f89k.mo712e(true);
                    }
                }
            }

            /* renamed from: b */
            public void mo35b(long j, int i) {
                TTFullScreenExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.mo46D();
                if (!TTFullScreenExpressVideoActivity.this.f91m.mo744b()) {
                    TTFullScreenExpressVideoActivity.this.mo47E();
                    TTFullScreenExpressVideoActivity.this.f91m.mo756m();
                    C10638l.m31242e("TTFullScreenExpressVideoActivity", "onError、、、、、、、、");
                    TTFullScreenExpressVideoActivity.this.f90l.mo991a(true);
                    if (TTFullScreenExpressVideoActivity.this.mo75i()) {
                        TTFullScreenExpressVideoActivity.this.mo58a(false);
                        TTFullScreenExpressVideoActivity.this.f91m.mo730a(true ^ TTFullScreenExpressVideoActivity.this.f91m.mo725B() ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo32a() {
                TTFullScreenExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.mo47E();
                C10638l.m31235b("TTFullScreenExpressVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenExpressVideoActivity.this.mo75i()) {
                    TTFullScreenExpressVideoActivity.this.mo58a(false);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.f91m.mo730a(TTFullScreenExpressVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0, TTFullScreenExpressVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.f91m.mo756m();
            }

            /* renamed from: a */
            public void mo34a(long j, long j2) {
                if (!TTFullScreenExpressVideoActivity.this.f52H && TTFullScreenExpressVideoActivity.this.f91m.mo744b()) {
                    TTFullScreenExpressVideoActivity.this.f91m.mo758o();
                }
                if (!TTFullScreenExpressVideoActivity.this.f100v.get()) {
                    TTFullScreenExpressVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                    if (j != TTFullScreenExpressVideoActivity.this.f91m.mo749f()) {
                        TTFullScreenExpressVideoActivity.this.mo47E();
                    }
                    if (TTFullScreenExpressVideoActivity.this.f91m.mo744b()) {
                        TTFullScreenExpressVideoActivity.this.f91m.mo731a(j);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTFullScreenExpressVideoActivity.f97s = (int) (tTFullScreenExpressVideoActivity.f91m.mo726C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTFullScreenExpressVideoActivity.this.f45A.get() || TTFullScreenExpressVideoActivity.this.f103y.get()) && TTFullScreenExpressVideoActivity.this.f91m.mo744b()) {
                            TTFullScreenExpressVideoActivity.this.f91m.mo758o();
                        }
                        if (!(TTFullScreenExpressVideoActivity.this.f90l == null || TTFullScreenExpressVideoActivity.this.f90l.mo985a() == null)) {
                            TTFullScreenExpressVideoActivity.this.f90l.mo985a().mo1879a((CharSequence) String.valueOf(TTFullScreenExpressVideoActivity.this.f97s), i, 0);
                        }
                        if (TTFullScreenExpressVideoActivity.this.f90l.mo999h()) {
                            TTFullScreenExpressVideoActivity.this.mo160e(i);
                            if (TTFullScreenExpressVideoActivity.this.f97s >= 0) {
                                TTFullScreenExpressVideoActivity.this.f89k.mo711d(true);
                                TTFullScreenExpressVideoActivity.this.f89k.mo701a(String.valueOf(TTFullScreenExpressVideoActivity.this.f97s), (CharSequence) null);
                            }
                        }
                        if (TTFullScreenExpressVideoActivity.this.f97s <= 0) {
                            C10638l.m31235b("TTFullScreenExpressVideoActivity", "onProgressUpdate、、、、、、、、");
                            if (TTFullScreenExpressVideoActivity.this.mo75i()) {
                                TTFullScreenExpressVideoActivity.this.mo58a(false);
                            } else if (C0477n.m2012c(TTFullScreenExpressVideoActivity.this.f81c)) {
                                TTFullScreenExpressVideoActivity.this.finish();
                            }
                        }
                    }
                }
            }
        });
        return mo61a(j, z, (Map<String, Object>) hashMap);
    }
}
