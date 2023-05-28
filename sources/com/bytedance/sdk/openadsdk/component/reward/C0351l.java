package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10622b;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0910h;
import com.bytedance.sdk.openadsdk.multipro.aidl.p052b.C0925d;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0992q;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.l */
/* compiled from: TTRewardVideoAdImpl */
class C0351l implements TTRewardVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1143a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0477n f1144b;

    /* renamed from: c */
    private final AdSlot f1145c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener f1146d;

    /* renamed from: e */
    private C1008c f1147e;

    /* renamed from: f */
    private boolean f1148f = true;

    /* renamed from: g */
    private boolean f1149g;

    /* renamed from: h */
    private String f1150h;

    /* renamed from: i */
    private String f1151i;

    /* renamed from: j */
    private AtomicBoolean f1152j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f1153k;

    /* renamed from: l */
    private boolean f1154l;

    /* renamed from: m */
    private boolean f1155m;

    /* renamed from: n */
    private Double f1156n = null;

    C0351l(Context context, C0477n nVar, AdSlot adSlot) {
        this.f1143a = context;
        this.f1144b = nVar;
        this.f1145c = adSlot;
        if (getInteractionType() == 4) {
            this.f1147e = C1009d.m4776a(this.f1143a, this.f1144b, "rewarded_video");
        }
        this.f1149g = false;
        this.f1153k = C0984l.m4553a();
    }

    /* renamed from: a */
    public void mo928a(String str) {
        if (!this.f1152j.get()) {
            this.f1149g = true;
            this.f1150h = str;
        }
    }

    public void setRewardAdInteractionListener(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f1146d = rewardAdInteractionListener;
        m1454a(0);
    }

    public int getInteractionType() {
        C0477n nVar = this.f1144b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1332L();
    }

    public void setShowDownLoadBar(boolean z) {
        this.f1148f = z;
    }

    public int getRewardVideoAdType() {
        C0477n nVar = this.f1144b;
        if (nVar == null) {
            return -1;
        }
        if (C0480p.m2198i(nVar)) {
            return 2;
        }
        return C0480p.m2199j(this.f1144b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f1144b.mo1453n();
    }

    public void showRewardVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C10638l.m31242e("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C0136e.m610a(this.f1144b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C10638l.m31242e("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        } else if (!this.f1152j.get()) {
            this.f1152j.set(true);
            C0477n nVar = this.f1144b;
            if (nVar == null || nVar.mo1330J() == null) {
                C0136e.m610a(this.f1144b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f1143a : activity;
            if (context == null) {
                context = C0558m.m2663a();
            }
            if (this.f1144b.mo1447l() != 2 || this.f1144b.mo1428f() == 5 || this.f1144b.mo1428f() == 6) {
                intent = new Intent(context, TTRewardVideoActivity.class);
            } else {
                intent = new Intent(context, TTRewardExpressVideoActivity.class);
            }
            if (activity == null) {
                intent.addFlags(268435456);
            }
            int i = 0;
            try {
                i = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
            }
            intent.putExtra("orientation_angle", i);
            intent.putExtra("reward_name", this.f1144b.mo1441j());
            intent.putExtra("reward_amount", this.f1144b.mo1444k());
            intent.putExtra("media_extra", this.f1145c.getMediaExtra());
            intent.putExtra("user_id", this.f1145c.getUserID());
            intent.putExtra("show_download_bar", this.f1148f);
            Double d = this.f1156n;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f1151i)) {
                intent.putExtra("rit_scene", this.f1151i);
            }
            if (this.f1149g) {
                intent.putExtra("video_cache_url", this.f1150h);
            }
            if (C0934b.m4334c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f1144b.mo1397ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f1153k);
            } else {
                C0625t.m3022a().mo2036h();
                C0625t.m3022a().mo2026a(this.f1144b);
                C0625t.m3022a().mo2025a(this.f1146d);
                C0625t.m3022a().mo2027a(this.f1147e);
                this.f1146d = null;
            }
            C10622b.m31190a(context, intent, new C10622b.C10623a() {
                /* renamed from: a */
                public void mo299a() {
                }

                /* renamed from: a */
                public void mo300a(Throwable th) {
                    C10638l.m31239c("TTRewardVideoAdImpl", "show reward video error: ", th);
                    C0136e.m610a(C0351l.this.f1144b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C0996u.m4618a(this.f1144b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C0336i.m1401a(this.f1143a).mo899b(a);
                    C0336i.m1401a(this.f1143a).mo898a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f1149g || TextUtils.isEmpty(this.f1150h)) {
                        C0336i.m1401a(this.f1143a).mo896a(b);
                    } else {
                        C0336i.m1401a(this.f1143a).mo901b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public Map<String, Object> getMediaExtraInfo() {
        C0477n nVar = this.f1144b;
        if (nVar != null) {
            return nVar.mo1389aj();
        }
        return null;
    }

    public void showRewardVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C10638l.m31242e("TTRewardVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f1151i = str;
        } else {
            this.f1151i = ritScenes.getScenesName();
        }
        showRewardVideoAd(activity);
    }

    /* renamed from: a */
    private void m1454a(final int i) {
        if (C0934b.m4334c()) {
            C10615e.m31168c(new C10618g("Reward_registerMultiProcessListener") {
                public void run() {
                    C0898a a = C0898a.m4299a(C0351l.this.f1143a);
                    if (i == 0 && C0351l.this.f1146d != null) {
                        C10638l.m31235b("MultiProcess", "start registerRewardVideoListener ! ");
                        C0925d dVar = new C0925d(C0351l.this.f1146d);
                        IListenerManager asInterface = C0910h.asInterface(a.mo2767a(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(C0351l.this.f1153k, dVar);
                                C10638l.m31235b("MultiProcess", "end registerRewardVideoListener ! ");
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public void win(Double d) {
        if (!this.f1154l) {
            C0992q.m4596a(this.f1144b, d);
            this.f1154l = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f1155m) {
            C0992q.m4597a(this.f1144b, d, str, str2);
            this.f1155m = true;
        }
    }

    public void setPrice(Double d) {
        this.f1156n = d;
    }
}
