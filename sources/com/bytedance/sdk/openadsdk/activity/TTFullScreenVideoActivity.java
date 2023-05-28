package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0308c;
import com.bytedance.sdk.openadsdk.component.reward.top.C0358b;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0619p;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a;
import com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* renamed from: S */
    private static TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f149S;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f150R;

    /* renamed from: T */
    private boolean f151T;

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo51I() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m209b(bundle)) {
            mo96t();
            mo97u();
            mo68d();
            mo54a();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f149S = this.f150R;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m211c(final String str) {
        C10615e.m31168c(new C10618g("FullScreen_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.mo53a(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f82d, str);
                } catch (Throwable th) {
                    C10638l.m31239c("TTFullScreenVideoActivity", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55a(Intent intent) {
        super.mo55a(intent);
        if (intent != null) {
            this.f50F = intent.getBooleanExtra("is_verity_playable", false);
        }
    }

    /* renamed from: b */
    private boolean m209b(Bundle bundle) {
        String stringExtra;
        if (C0934b.m4334c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f81c = C0402b.m1636a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C10638l.m31239c("TTFullScreenVideoActivity", "initData MultiGlobalInfo throws ", e);
                }
            }
        } else {
            this.f81c = C0625t.m3022a().mo2031c();
            this.f150R = C0625t.m3022a().mo2033e();
        }
        if (!C0934b.m4334c()) {
            C0625t.m3022a().mo2036h();
        }
        if (bundle != null) {
            if (this.f150R == null) {
                this.f150R = f149S;
                f149S = null;
            }
            try {
                this.f81c = C0402b.m1636a(new JSONObject(bundle.getString("material_meta")));
                this.f101w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f101w.get()) {
                    this.f89k.mo711d(true);
                    m204N();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f81c == null) {
            C10638l.m31242e("TTFullScreenVideoActivity", "mMaterialMeta is null , no data to display ,the TTFullScreenVideoActivity finished !!");
            finish();
            return false;
        }
        this.f92n.mo668a(this.f81c, this.f71a);
        this.f92n.mo666a();
        this.f81c.mo1351a(this.f81c.mo1431g(), 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo50H() {
        View k = this.f87i.mo1028k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTFullScreenVideoActivity.this.f93o.mo804r();
                    TTFullScreenVideoActivity.this.mo95s();
                    TTFullScreenVideoActivity.this.finish();
                }
            });
        }
        this.f89k.mo700a((C0358b) new C0358b() {
            /* renamed from: a */
            public void mo166a(View view) {
                if (C0480p.m2198i(TTFullScreenVideoActivity.this.f81c) || (C0464l.m1965a(TTFullScreenVideoActivity.this.f81c) && !TTFullScreenVideoActivity.this.f85g.get())) {
                    if (C0934b.m4334c()) {
                        TTFullScreenVideoActivity.this.m211c("onSkippedVideo");
                    } else if (TTFullScreenVideoActivity.this.f150R != null) {
                        TTFullScreenVideoActivity.this.f150R.onSkippedVideo();
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                C0130o.C0131a aVar = new C0130o.C0131a();
                aVar.mo372a(TTFullScreenVideoActivity.this.f91m.mo762s());
                aVar.mo379c(TTFullScreenVideoActivity.this.f91m.mo764u());
                aVar.mo376b(TTFullScreenVideoActivity.this.f91m.mo753j());
                aVar.mo383e(3);
                aVar.mo385f(TTFullScreenVideoActivity.this.f91m.mo761r());
                C0113a.m470a(TTFullScreenVideoActivity.this.f91m.mo745c(), aVar, TTFullScreenVideoActivity.this.f91m.mo729a());
                C0619p.m2997c(TTFullScreenVideoActivity.this.f98t);
                TTFullScreenVideoActivity.this.f91m.mo736a("skip", (Map<String, Object>) null);
                TTFullScreenVideoActivity.this.f89k.mo711d(false);
                if (C0934b.m4334c()) {
                    TTFullScreenVideoActivity.this.m211c("onSkippedVideo");
                } else if (TTFullScreenVideoActivity.this.f150R != null) {
                    TTFullScreenVideoActivity.this.f150R.onSkippedVideo();
                }
                if (TTFullScreenVideoActivity.this.mo75i()) {
                    TTFullScreenVideoActivity.this.mo58a(true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.f81c != null && TTFullScreenVideoActivity.this.f81c.mo1403ax() != null && TTFullScreenVideoActivity.this.f91m != null) {
                    TTFullScreenVideoActivity.this.f81c.mo1403ax().mo1726a().mo1803f(TTFullScreenVideoActivity.this.f91m.mo762s());
                    TTFullScreenVideoActivity.this.f81c.mo1403ax().mo1726a().mo1801e(TTFullScreenVideoActivity.this.f91m.mo762s());
                }
            }

            /* renamed from: b */
            public void mo167b(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f96r = !tTFullScreenVideoActivity.f96r;
                if (!(TTFullScreenVideoActivity.this.f56L == null || TTFullScreenVideoActivity.this.f56L.mo842a() == null)) {
                    TTFullScreenVideoActivity.this.f56L.mo842a().mo851a(TTFullScreenVideoActivity.this.f96r);
                }
                TTFullScreenVideoActivity.this.f91m.mo743b(TTFullScreenVideoActivity.this.f96r);
                if (!C0480p.m2199j(TTFullScreenVideoActivity.this.f81c) || TTFullScreenVideoActivity.this.f100v.get()) {
                    if (C0480p.m2190a(TTFullScreenVideoActivity.this.f81c)) {
                        TTFullScreenVideoActivity.this.f49E.mo2566a(TTFullScreenVideoActivity.this.f96r, true);
                    }
                    TTFullScreenVideoActivity.this.f93o.mo790d(TTFullScreenVideoActivity.this.f96r);
                    if (TTFullScreenVideoActivity.this.f81c != null && TTFullScreenVideoActivity.this.f81c.mo1403ax() != null && TTFullScreenVideoActivity.this.f81c.mo1403ax().mo1726a() != null && TTFullScreenVideoActivity.this.f91m != null) {
                        if (TTFullScreenVideoActivity.this.f96r) {
                            TTFullScreenVideoActivity.this.f81c.mo1403ax().mo1726a().mo1807h(TTFullScreenVideoActivity.this.f91m.mo762s());
                        } else {
                            TTFullScreenVideoActivity.this.f81c.mo1403ax().mo1726a().mo1809i(TTFullScreenVideoActivity.this.f91m.mo762s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo168c(View view) {
                TTFullScreenVideoActivity.this.mo49G();
            }
        });
    }

    /* renamed from: a */
    public boolean mo156a(long j, boolean z) {
        C0146j jVar = new C0146j();
        jVar.mo421a(System.currentTimeMillis(), 1.0f);
        if (this.f56L == null || !(this.f56L instanceof C0308c)) {
            this.f91m.mo732a(this.f87i.mo1025h(), this.f81c, this.f71a, mo51I(), jVar);
        } else {
            this.f91m.mo732a(((C0308c) this.f56L).mo859d(), this.f81c, this.f71a, mo51I(), jVar);
        }
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(this.f48D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f48D);
        }
        this.f91m.mo737a((Map<String, Object>) hashMap);
        C00464 r1 = new C10192c.C10193a() {
            /* renamed from: a */
            public void mo33a(long j, int i) {
                TTFullScreenVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.mo47E();
                TTFullScreenVideoActivity.this.mo159M();
                if (C0464l.m1967b(TTFullScreenVideoActivity.this.f81c)) {
                    TTFullScreenVideoActivity.this.mo80n();
                    TTFullScreenVideoActivity.this.f58N.set(true);
                } else if (TTFullScreenVideoActivity.this.mo75i()) {
                    TTFullScreenVideoActivity.this.mo58a(false);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: b */
            public void mo35b(long j, int i) {
                TTFullScreenVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.mo46D();
                if (!TTFullScreenVideoActivity.this.f91m.mo744b()) {
                    TTFullScreenVideoActivity.this.mo47E();
                    TTFullScreenVideoActivity.this.f91m.mo756m();
                    C10638l.m31242e("TTFullScreenVideoActivity", "onError、、、、、、、、");
                    if (TTFullScreenVideoActivity.this.mo75i()) {
                        TTFullScreenVideoActivity.this.mo59a(false, true);
                        TTFullScreenVideoActivity.this.f91m.mo730a(TTFullScreenVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            /* renamed from: a */
            public void mo32a() {
                TTFullScreenVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.mo47E();
                C10638l.m31235b("TTFullScreenVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenVideoActivity.this.mo75i()) {
                    TTFullScreenVideoActivity.this.mo59a(false, true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.f91m.mo730a(TTFullScreenVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0, true ^ TTFullScreenVideoActivity.this.f91m.mo725B() ? 1 : 0);
                TTFullScreenVideoActivity.this.f91m.mo756m();
            }

            /* renamed from: a */
            public void mo34a(long j, long j2) {
                if (!TTFullScreenVideoActivity.this.f52H && TTFullScreenVideoActivity.this.f91m.mo744b()) {
                    TTFullScreenVideoActivity.this.f91m.mo758o();
                }
                if (!TTFullScreenVideoActivity.this.f100v.get()) {
                    TTFullScreenVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                    if (j != TTFullScreenVideoActivity.this.f91m.mo749f()) {
                        TTFullScreenVideoActivity.this.mo47E();
                    }
                    TTFullScreenVideoActivity.this.f91m.mo731a(j);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    long j3 = j / 1000;
                    tTFullScreenVideoActivity.f97s = (int) (tTFullScreenVideoActivity.f91m.mo726C() - ((double) j3));
                    int i = (int) j3;
                    if ((TTFullScreenVideoActivity.this.f45A.get() || TTFullScreenVideoActivity.this.f103y.get()) && TTFullScreenVideoActivity.this.f91m.mo744b()) {
                        TTFullScreenVideoActivity.this.f91m.mo758o();
                    }
                    TTFullScreenVideoActivity.this.mo160e(i);
                    if (TTFullScreenVideoActivity.this.f97s >= 0) {
                        TTFullScreenVideoActivity.this.f89k.mo701a(String.valueOf(TTFullScreenVideoActivity.this.f97s), (CharSequence) null);
                    }
                    if (TTFullScreenVideoActivity.this.f97s <= 0) {
                        TTFullScreenVideoActivity.this.f58N.set(true);
                        C10638l.m31235b("TTFullScreenVideoActivity", "onProgressUpdate、、、、、、、、");
                        if (TTFullScreenVideoActivity.this.mo75i()) {
                            TTFullScreenVideoActivity.this.mo58a(false);
                        } else {
                            TTFullScreenVideoActivity.this.finish();
                        }
                    }
                }
            }
        };
        this.f91m.mo733a((C10192c.C10193a) r1);
        if (this.f87i.f1241x != null) {
            this.f87i.f1241x.mo1295a((C10192c.C10193a) r1);
        }
        return mo61a(j, z, (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo160e(int i) {
        int e = C0558m.m2673h().mo1686e(this.f98t);
        if (e < 0) {
            e = 5;
        }
        if (C0558m.m2673h().mo1682c(String.valueOf(this.f98t)) && (C0477n.m2012c(this.f81c) || mo75i())) {
            if (!this.f101w.getAndSet(true)) {
                this.f89k.mo711d(true);
            }
            if (i <= e) {
                m212g(e - i);
                this.f89k.mo712e(false);
                return;
            }
            m204N();
        } else if (i >= e) {
            if (!this.f101w.getAndSet(true)) {
                this.f89k.mo711d(true);
            }
            m204N();
        }
    }

    /* renamed from: N */
    private void m204N() {
        if (C0477n.m2012c(this.f81c) || mo75i()) {
            this.f89k.mo701a((String) null, (CharSequence) C0516f.f1879c);
        } else {
            this.f89k.mo701a((String) null, (CharSequence) "X");
        }
        this.f89k.mo712e(true);
    }

    /* renamed from: g */
    private void m212g(int i) {
        this.f89k.mo701a((String) null, (CharSequence) new SpannableStringBuilder(String.format(C10647t.m31276a(C0558m.m2663a(), "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(i)})));
    }

    public void onRewardBarClick(View view) {
        if (!(this.f81c == null || this.f81c.mo1393an() == 100.0f)) {
            this.f151T = true;
        }
        if (C0934b.m4334c()) {
            m211c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f150R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: K */
    public void mo157K() {
        if (C0934b.m4334c()) {
            m211c("onAdShow");
        } else {
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f150R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdShow();
            }
        }
        if (mo52J()) {
            this.f90l.mo1001j();
        }
    }

    /* renamed from: L */
    public void mo158L() {
        if (C0934b.m4334c()) {
            m211c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f150R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* renamed from: f */
    public void mo161f(int i) {
        if (i == 10002) {
            mo159M();
        }
    }

    public void finish() {
        this.f94p.mo683b(this.f50F);
        try {
            m205O();
        } catch (Exception unused) {
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m205O();
        if (C0934b.m4334c()) {
            m211c("recycleRes");
        }
        this.f150R = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f149S = null;
    }

    /* renamed from: O */
    private void m205O() {
        if (!this.f51G) {
            this.f51G = true;
            if (C0934b.m4334c()) {
                m211c("onAdClose");
                return;
            }
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f150R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo159M() {
        if (C0934b.m4334c()) {
            m211c("onVideoComplete");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.f150R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (m210b(this.f81c) && !m208a(this.f81c)) {
            if (this.f151T) {
                this.f151T = false;
                finish();
            } else if (this.f93o.mo810x()) {
                finish();
            }
        }
    }

    /* renamed from: a */
    private boolean m208a(C0477n nVar) {
        return nVar == null || nVar.mo1393an() == 100.0f;
    }

    /* renamed from: b */
    private boolean m210b(C0477n nVar) {
        if (nVar == null) {
            return false;
        }
        return C0558m.m2673h().mo1694g(this.f98t);
    }
}
