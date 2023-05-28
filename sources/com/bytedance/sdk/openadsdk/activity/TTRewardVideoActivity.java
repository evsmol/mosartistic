package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bykv.p271vk.openvk.component.video.api.p289d.C10192c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.component.reward.top.C0358b;
import com.bytedance.sdk.openadsdk.core.C0402b;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0561n;
import com.bytedance.sdk.openadsdk.core.C0607o;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p021e.C0464l;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.core.widget.C0723a;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.p000b.C0146j;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p152ms.p153bd.p154o.Pgl.C5643c;

public class TTRewardVideoActivity extends TTBaseVideoActivity {

    /* renamed from: U */
    private static final String f247U = C10647t.m31276a(C0558m.m2663a(), "tt_reward_msg");

    /* renamed from: V */
    private static final String f248V = C10647t.m31276a(C0558m.m2663a(), "tt_msgPlayable");

    /* renamed from: W */
    private static final String f249W = C10647t.m31276a(C0558m.m2663a(), "tt_negtiveBtnBtnText");

    /* renamed from: X */
    private static final String f250X = C10647t.m31276a(C0558m.m2663a(), "tt_postiveBtnText");

    /* renamed from: Y */
    private static final String f251Y = C10647t.m31276a(C0558m.m2663a(), "tt_postiveBtnTextPlayable");

    /* renamed from: ad */
    private static TTRewardVideoAd.RewardAdInteractionListener f252ad;

    /* renamed from: R */
    protected int f253R;

    /* renamed from: S */
    protected int f254S;

    /* renamed from: T */
    protected TTRewardVideoAd.RewardAdInteractionListener f255T;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f256Z;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public int f257aa;

    /* renamed from: ab */
    private String f258ab;

    /* renamed from: ac */
    private String f259ac;

    /* renamed from: ae */
    private AtomicBoolean f260ae = new AtomicBoolean(false);

    /* renamed from: af */
    private int f261af = -1;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0066, code lost:
        if (r3.f85g.get() == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0071  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m315O() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.b.b.b.o$a r0 = new com.bytedance.sdk.openadsdk.b.b.b.o$a
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            long r1 = r1.mo762s()
            r0.mo372a((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            long r1 = r1.mo764u()
            r0.mo379c((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            long r1 = r1.mo753j()
            r0.mo376b((long) r1)
            r1 = 3
            r0.mo383e(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            int r1 = r1.mo761r()
            r0.mo385f(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            com.bykv.vk.openvk.component.video.api.b.a r1 = r1.mo745c()
            com.bytedance.sdk.openadsdk.component.reward.a.e r2 = r3.f91m
            com.bytedance.sdk.openadsdk.b.j r2 = r2.mo729a()
            com.bytedance.sdk.openadsdk.p000b.p002b.p003a.C0113a.m470a((com.bykv.p271vk.openvk.component.video.api.p287b.C10185a) r1, (com.bytedance.sdk.openadsdk.p000b.p002b.p004b.C0130o.C0131a) r0, (com.bytedance.sdk.openadsdk.p000b.C0146j) r2)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f91m
            r0.mo756m()
            int r0 = r3.f98t
            com.bytedance.sdk.openadsdk.core.C0619p.m2997c((int) r0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f91m
            java.lang.String r1 = "skip"
            r2 = 0
            r0.mo736a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r0 = r3.mo75i()
            if (r0 == 0) goto L_0x0068
            r0 = 1
            r3.mo58a((boolean) r0)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f81c
            boolean r0 = com.bytedance.sdk.openadsdk.core.p021e.C0464l.m1965a((com.bytedance.sdk.openadsdk.core.p021e.C0477n) r0)
            if (r0 == 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f85g
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006b
        L_0x0068:
            r3.finish()
        L_0x006b:
            boolean r0 = com.bytedance.sdk.openadsdk.multipro.C0934b.m4334c()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "onSkippedVideo"
            r3.mo221c((java.lang.String) r0)
            goto L_0x007e
        L_0x0077:
            com.bytedance.sdk.openadsdk.TTRewardVideoAd$RewardAdInteractionListener r0 = r3.f255T
            if (r0 == 0) goto L_0x007e
            r0.onSkippedVideo()
        L_0x007e:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f81c
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f81c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo1403ax()
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.f91m
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f81c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo1403ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo1726a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            long r1 = r1.mo762s()
            r0.mo1803f((long) r1)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f81c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.mo1403ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.mo1726a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.f91m
            long r1 = r1.mo762s()
            r0.mo1801e((long) r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.m315O():void");
    }

    /* renamed from: P */
    private JSONObject m316P() {
        JSONObject jSONObject = new JSONObject();
        int v = (int) this.f91m.mo765v();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.f256Z);
            jSONObject.put("reward_amount", this.f257aa);
            jSONObject.put("network", C10642o.m31260c(this.f80b));
            jSONObject.put("sdk_version", "4.5.0.6");
            int F = this.f81c.mo1326F();
            String str = "unKnow";
            if (F == 2) {
                str = C0996u.m4614a();
            } else if (F == 1) {
                str = C0996u.m4631b();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f81c.mo1377aH());
            jSONObject.put("media_extra", this.f258ab);
            jSONObject.put("video_duration", this.f81c.mo1330J().mo62916f());
            jSONObject.put("play_start_ts", this.f253R);
            jSONObject.put("play_end_ts", this.f254S);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, v);
            jSONObject.put("user_id", this.f259ac);
            jSONObject.put("trans_id", C0984l.m4553a().replace("-", ""));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Q */
    private void m317Q() {
        if (!this.f51G) {
            this.f51G = true;
            if (C0934b.m4334c()) {
                mo221c("onAdClose");
                return;
            }
            TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
            if (rewardAdInteractionListener != null) {
                rewardAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m321a(String str, boolean z, int i, String str2, int i2, String str3) {
        final String str4 = str;
        final boolean z2 = z;
        final int i3 = i;
        final String str5 = str2;
        final int i4 = i2;
        final String str6 = str3;
        C10615e.m31168c(new C10618g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTRewardVideoActivity.this.mo53a(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f82d, str4, z2, i3, str5, i4, str6);
                } catch (Throwable th) {
                    C10638l.m31239c("TTRewardVideoActivity", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m323b(final boolean z, final boolean z2) {
        String str;
        C0723a aVar;
        if (!C0558m.m2673h().mo1685d(String.valueOf(this.f98t))) {
            if (z) {
                if (!z2) {
                    if (C0934b.m4334c()) {
                        mo221c("onSkippedVideo");
                    } else {
                        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
                        if (rewardAdInteractionListener != null) {
                            rewardAdInteractionListener.onSkippedVideo();
                        }
                    }
                }
                finish();
                return;
            }
            m315O();
        } else if (!this.f260ae.get()) {
            this.f45A.set(true);
            this.f91m.mo758o();
            if (z) {
                mo101y();
            }
            final C0723a aVar2 = new C0723a(this);
            this.f46B = aVar2;
            C0723a aVar3 = this.f46B;
            if (z) {
                aVar = aVar3.mo2461a(f248V);
                str = f251Y;
            } else {
                aVar = aVar3.mo2461a(f247U);
                str = f250X;
            }
            aVar.mo2462b(str).mo2463c(f249W);
            this.f46B.mo2460a((C0723a.C0726a) new C0723a.C0726a() {
                /* renamed from: a */
                public void mo225a() {
                    TTRewardVideoActivity.this.f91m.mo757n();
                    if (z) {
                        TTRewardVideoActivity.this.mo102z();
                    }
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f45A.set(false);
                }

                /* renamed from: b */
                public void mo226b() {
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.f45A.set(false);
                    TTRewardVideoActivity.this.f94p.mo686d(Integer.MAX_VALUE);
                    if (z) {
                        TTRewardVideoActivity.this.mo95s();
                        if (!z2) {
                            if (C0934b.m4334c()) {
                                TTRewardVideoActivity.this.mo221c("onSkippedVideo");
                            } else if (TTRewardVideoActivity.this.f255T != null) {
                                TTRewardVideoActivity.this.f255T.onSkippedVideo();
                            }
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    TTRewardVideoActivity.this.m315O();
                }
            }).show();
        } else if (z) {
            if (!z2) {
                if (C0934b.m4334c()) {
                    mo221c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener2 = this.f255T;
                    if (rewardAdInteractionListener2 != null) {
                        rewardAdInteractionListener2.onSkippedVideo();
                    }
                }
            }
            finish();
        } else {
            m315O();
        }
    }

    /* renamed from: b */
    private boolean m324b(Bundle bundle) {
        String stringExtra;
        if (C0934b.m4334c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f81c = C0402b.m1636a(new JSONObject(stringExtra));
                } catch (Exception e) {
                    C10638l.m31239c("TTRewardVideoActivity", "TTRewardVideoActivity MultiGlobalInfo throw ", e);
                }
            }
        } else {
            this.f81c = C0625t.m3022a().mo2031c();
            this.f255T = C0625t.m3022a().mo2032d();
        }
        if (!C0934b.m4334c()) {
            C0625t.m3022a().mo2036h();
        }
        if (bundle != null) {
            if (this.f255T == null) {
                this.f255T = f252ad;
                f252ad = null;
            }
            try {
                this.f81c = C0402b.m1636a(new JSONObject(bundle.getString("material_meta")));
                this.f101w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.f101w.get()) {
                    this.f89k.mo711d(true);
                    this.f89k.mo701a((String) null, (CharSequence) C0516f.f1879c);
                    this.f89k.mo712e(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f81c == null) {
            C10638l.m31242e("TTRewardVideoActivity", "mMaterialMeta is null , no data to display ,the TTRewardVideoActivity finished !!");
            finish();
            return false;
        }
        this.f92n.mo668a(this.f81c, this.f71a);
        this.f92n.mo666a();
        this.f81c.mo1351a(this.f81c.mo1431g(), 7);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r12.f93o.mo791e().mo2384e() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (((1.0d - (((double) r12.f97s) / r12.f91m.mo726C())) * 100.0d) >= ((double) r0)) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43A() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()
            int r1 = r12.f98t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.i.a r0 = r0.mo1711n(r1)
            int r0 = r0.f1844f
            com.bytedance.sdk.openadsdk.core.e.n r1 = r12.f81c
            boolean r1 = com.bytedance.sdk.openadsdk.core.p021e.C0480p.m2199j(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0034
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r12.f91m
            double r8 = r1.mo726C()
            int r1 = r12.f97s
            double r10 = (double) r1
            double r10 = r10 / r8
            double r6 = r6 - r10
            double r6 = r6 * r4
            double r0 = (double) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            r3 = r2
            goto L_0x0074
        L_0x0034:
            r1 = 1120403456(0x42c80000, float:100.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r12.f81c
            int r5 = r5.mo1399at()
            float r5 = (float) r5
            com.bytedance.sdk.openadsdk.component.reward.a.b r6 = r12.f94p
            int r6 = r6.mo694k()
            float r6 = (float) r6
            float r6 = r6 / r5
            float r4 = r4 - r6
            float r4 = r4 * r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.C0558m.m2673h()
            int r4 = r12.f98t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.mo1672a((java.lang.String) r4)
            if (r1 != 0) goto L_0x0071
            if (r0 == 0) goto L_0x0031
            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = r12.f93o
            com.bytedance.sdk.openadsdk.core.w r0 = r0.mo791e()
            boolean r0 = r0.mo2384e()
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0071:
            if (r1 != r2) goto L_0x0074
            r3 = r0
        L_0x0074:
            if (r3 == 0) goto L_0x007b
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.mo161f(r0)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.mo43A():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo50H() {
        View k = this.f87i.mo1028k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTRewardVideoActivity.this.f93o.mo804r();
                    TTRewardVideoActivity.this.mo95s();
                    if (C0480p.m2198i(TTRewardVideoActivity.this.f81c)) {
                        TTRewardVideoActivity.this.m323b(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            });
        }
        this.f89k.mo700a((C0358b) new C0358b() {
            /* renamed from: a */
            public void mo166a(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.m323b(C0480p.m2198i(tTRewardVideoActivity.f81c), false);
            }

            /* renamed from: b */
            public void mo167b(View view) {
                if (!(TTRewardVideoActivity.this.f56L == null || TTRewardVideoActivity.this.f56L.mo842a() == null)) {
                    TTRewardVideoActivity.this.f56L.mo842a().mo851a(TTRewardVideoActivity.this.f96r);
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f96r = !tTRewardVideoActivity.f96r;
                C10638l.m31235b("TTRewardVideoActivity", "will set is Mute " + TTRewardVideoActivity.this.f96r + " mLastVolume=" + TTRewardVideoActivity.this.f49E.mo2567b());
                TTRewardVideoActivity.this.f91m.mo743b(TTRewardVideoActivity.this.f96r);
                if (!C0480p.m2199j(TTRewardVideoActivity.this.f81c) || TTRewardVideoActivity.this.f100v.get()) {
                    if (C0480p.m2190a(TTRewardVideoActivity.this.f81c)) {
                        TTRewardVideoActivity.this.f49E.mo2566a(TTRewardVideoActivity.this.f96r, true);
                    }
                    TTRewardVideoActivity.this.f93o.mo790d(TTRewardVideoActivity.this.f96r);
                    if (TTRewardVideoActivity.this.f81c != null && TTRewardVideoActivity.this.f81c.mo1403ax() != null && TTRewardVideoActivity.this.f81c.mo1403ax().mo1726a() != null && TTRewardVideoActivity.this.f91m != null) {
                        if (TTRewardVideoActivity.this.f96r) {
                            TTRewardVideoActivity.this.f81c.mo1403ax().mo1726a().mo1807h(TTRewardVideoActivity.this.f91m.mo762s());
                        } else {
                            TTRewardVideoActivity.this.f81c.mo1403ax().mo1726a().mo1809i(TTRewardVideoActivity.this.f91m.mo762s());
                        }
                    }
                }
            }

            /* renamed from: c */
            public void mo168c(View view) {
                TTRewardVideoActivity.this.mo49G();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo51I() {
        return true;
    }

    /* renamed from: K */
    public void mo157K() {
        if (C0934b.m4334c()) {
            mo221c("onAdShow");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdShow();
        }
    }

    /* renamed from: L */
    public void mo158L() {
        if (C0934b.m4334c()) {
            mo221c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo159M() {
        if (!this.f260ae.get()) {
            this.f260ae.set(true);
            if (!C0558m.m2673h().mo1707l(String.valueOf(this.f98t))) {
                C0558m.m2671f().mo1843a(m316P(), (C0561n.C0563b) new C0561n.C0563b() {
                    /* renamed from: a */
                    public void mo228a(int i, String str) {
                        if (C0934b.m4334c()) {
                            TTRewardVideoActivity.this.m321a("onRewardVerify", false, 0, "", i, str);
                        } else if (TTRewardVideoActivity.this.f255T != null) {
                            TTRewardVideoActivity.this.f255T.onRewardVerify(false, 0, "", i, str);
                        }
                    }

                    /* renamed from: a */
                    public void mo229a(final C0607o.C0618b bVar) {
                        final int a = bVar.f2316c.mo1519a();
                        final String b = bVar.f2316c.mo1522b();
                        if (C0934b.m4334c()) {
                            TTRewardVideoActivity.this.m321a("onRewardVerify", bVar.f2315b, a, b, 0, "");
                        } else {
                            TTRewardVideoActivity.this.f95q.post(new Runnable() {
                                public void run() {
                                    if (TTRewardVideoActivity.this.f255T != null) {
                                        TTRewardVideoActivity.this.f255T.onRewardVerify(bVar.f2315b, a, b, 0, "");
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (C0934b.m4334c()) {
                m321a("onRewardVerify", true, this.f257aa, this.f256Z, 0, "");
            } else {
                this.f95q.post(new Runnable() {
                    public void run() {
                        if (TTRewardVideoActivity.this.f255T != null) {
                            TTRewardVideoActivity.this.f255T.onRewardVerify(true, TTRewardVideoActivity.this.f257aa, TTRewardVideoActivity.this.f256Z, 0, "");
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo219N() {
        if (C0934b.m4334c()) {
            mo221c("onVideoComplete");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo220a(long j, long j2) {
        long j3 = j + (((long) this.f59O) * 1000);
        if (this.f261af == -1) {
            this.f261af = C0558m.m2673h().mo1711n(String.valueOf(this.f98t)).f1844f;
        }
        if (j2 > 0) {
            if (j2 >= 30000 && j3 >= 27000) {
                mo159M();
            } else if (((float) (j3 * 100)) / ((float) j2) >= ((float) this.f261af)) {
                mo159M();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55a(Intent intent) {
        super.mo55a(intent);
        if (intent != null) {
            this.f256Z = intent.getStringExtra("reward_name");
            this.f257aa = intent.getIntExtra("reward_amount", 0);
            this.f258ab = intent.getStringExtra("media_extra");
            this.f259ac = intent.getStringExtra("user_id");
        }
    }

    /* renamed from: a */
    public boolean mo156a(long j, boolean z) {
        HashMap hashMap;
        C0146j jVar = new C0146j();
        jVar.mo421a(System.currentTimeMillis(), 1.0f);
        this.f91m.mo732a(this.f87i.mo1025h(), this.f81c, this.f71a, mo51I(), jVar);
        if (!TextUtils.isEmpty(this.f48D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.f48D);
        } else {
            hashMap = null;
        }
        this.f91m.mo737a((Map<String, Object>) hashMap);
        C00735 r1 = new C10192c.C10193a() {
            /* renamed from: a */
            public void mo33a(long j, int i) {
                TTRewardVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.mo47E();
                TTRewardVideoActivity.this.mo219N();
                TTRewardVideoActivity.this.f58N.set(true);
                if (TTRewardVideoActivity.this.mo75i()) {
                    TTRewardVideoActivity.this.mo58a(false);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f254S = (int) (System.currentTimeMillis() / 1000);
                TTRewardVideoActivity.this.mo159M();
            }

            /* renamed from: b */
            public void mo35b(long j, int i) {
                TTRewardVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                if (C0934b.m4334c()) {
                    TTRewardVideoActivity.this.mo221c("onVideoError");
                } else if (TTRewardVideoActivity.this.f255T != null) {
                    TTRewardVideoActivity.this.f255T.onVideoError();
                }
                TTRewardVideoActivity.this.mo46D();
                if (!TTRewardVideoActivity.this.f91m.mo744b()) {
                    TTRewardVideoActivity.this.mo47E();
                    TTRewardVideoActivity.this.f91m.mo756m();
                    TTRewardVideoActivity.this.mo159M();
                    if (TTRewardVideoActivity.this.mo75i()) {
                        TTRewardVideoActivity.this.mo59a(false, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                    TTRewardVideoActivity.this.f91m.mo730a(true ^ TTRewardVideoActivity.this.f91m.mo725B() ? 1 : 0, 2);
                }
            }

            /* renamed from: a */
            public void mo32a() {
                TTRewardVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.mo47E();
                if (TTRewardVideoActivity.this.mo75i()) {
                    TTRewardVideoActivity.this.mo59a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.f91m.mo730a(TTRewardVideoActivity.this.f91m.mo725B() ^ true ? 1 : 0, true ^ TTRewardVideoActivity.this.f91m.mo725B() ? 1 : 0);
                TTRewardVideoActivity.this.f91m.mo756m();
            }

            /* renamed from: a */
            public void mo34a(long j, long j2) {
                if (!TTRewardVideoActivity.this.f52H && TTRewardVideoActivity.this.f91m.mo744b()) {
                    TTRewardVideoActivity.this.f91m.mo758o();
                }
                if (!TTRewardVideoActivity.this.f100v.get()) {
                    TTRewardVideoActivity.this.f95q.removeMessages(C5643c.COLLECT_MODE_FINANCE);
                    if (j != TTRewardVideoActivity.this.f91m.mo749f()) {
                        TTRewardVideoActivity.this.mo47E();
                    }
                    TTRewardVideoActivity.this.f91m.mo731a(j);
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    long j3 = j / 1000;
                    double d = (double) j3;
                    tTRewardVideoActivity.f97s = (int) (tTRewardVideoActivity.f91m.mo726C() - d);
                    if (TTRewardVideoActivity.this.f97s >= 0) {
                        TTRewardVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardVideoActivity.this.f97s), (CharSequence) null);
                    }
                    TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity2.f97s = (int) (tTRewardVideoActivity2.f91m.mo726C() - d);
                    int i = (int) j3;
                    int f = C0558m.m2673h().mo1690f(String.valueOf(TTRewardVideoActivity.this.f98t));
                    boolean z = f >= 0;
                    if ((TTRewardVideoActivity.this.f45A.get() || TTRewardVideoActivity.this.f103y.get()) && TTRewardVideoActivity.this.f91m.mo744b()) {
                        TTRewardVideoActivity.this.f91m.mo758o();
                    }
                    TTRewardVideoActivity.this.f87i.mo1019c(i);
                    TTRewardVideoActivity.this.mo220a(j, j2);
                    if (TTRewardVideoActivity.this.f97s > 0) {
                        TTRewardVideoActivity.this.f89k.mo711d(true);
                        if (!z || i < f) {
                            TTRewardVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardVideoActivity.this.f97s), (CharSequence) null);
                            return;
                        }
                        TTRewardVideoActivity.this.f101w.getAndSet(true);
                        TTRewardVideoActivity.this.f89k.mo701a(String.valueOf(TTRewardVideoActivity.this.f97s), (CharSequence) C0516f.f1879c);
                        TTRewardVideoActivity.this.f89k.mo712e(true);
                    } else if (C0464l.m1969c(TTRewardVideoActivity.this.f81c) || C0464l.m1967b(TTRewardVideoActivity.this.f81c)) {
                        TTRewardVideoActivity.this.mo58a(false);
                    } else if (C0464l.m1965a(TTRewardVideoActivity.this.f81c) && !TTRewardVideoActivity.this.f85g.get()) {
                        TTRewardVideoActivity.this.f101w.getAndSet(true);
                        TTRewardVideoActivity.this.f89k.mo711d(true);
                        TTRewardVideoActivity.this.f89k.mo712e(true);
                    } else if (TTRewardVideoActivity.this.mo75i()) {
                        TTRewardVideoActivity.this.mo58a(false);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            }
        };
        this.f91m.mo733a((C10192c.C10193a) r1);
        this.f91m.mo733a((C10192c.C10193a) r1);
        if (this.f87i.f1241x != null) {
            this.f87i.f1241x.mo1295a((C10192c.C10193a) r1);
        }
        boolean a = mo61a(j, z, (Map<String, Object>) hashMap);
        if (a && !z) {
            this.f253R = (int) (System.currentTimeMillis() / 1000);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo221c(String str) {
        m321a(str, false, 0, "", 0, "");
    }

    /* renamed from: e */
    public void mo70e() {
        mo159M();
    }

    /* renamed from: f */
    public void mo161f(int i) {
        if (i == 10000) {
            mo159M();
        } else if (i == 10001) {
            mo219N();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f252ad = null;
    }

    public void finish() {
        m317Q();
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m324b(bundle)) {
            mo96t();
            mo97u();
            mo68d();
            mo54a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f90l != null) {
            this.f90l.mo997f();
        }
        m317Q();
        if (C0934b.m4334c()) {
            mo221c("recycleRes");
        }
        this.f255T = null;
    }

    public void onRewardBarClick(View view) {
        if (C0934b.m4334c()) {
            mo221c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.f255T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f252ad = this.f255T;
        super.onSaveInstanceState(bundle);
    }
}
