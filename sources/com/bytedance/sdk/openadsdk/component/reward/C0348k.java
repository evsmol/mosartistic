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
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.component.reward.p014b.C0308c;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0625t;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0480p;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.p051a.C0908f;
import com.bytedance.sdk.openadsdk.multipro.aidl.p052b.C0919c;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.utils.C0984l;
import com.bytedance.sdk.openadsdk.utils.C0992q;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.com.bytedance.overseas.sdk.p056a.C1008c;
import com.com.bytedance.overseas.sdk.p056a.C1009d;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.k */
/* compiled from: TTFullScreenVideoAdImpl */
class C0348k implements TTFullScreenVideoAd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1125a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0477n f1126b;

    /* renamed from: c */
    private final AdSlot f1127c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f1128d;

    /* renamed from: e */
    private C1008c f1129e;

    /* renamed from: f */
    private boolean f1130f = true;

    /* renamed from: g */
    private boolean f1131g;

    /* renamed from: h */
    private String f1132h;

    /* renamed from: i */
    private String f1133i;

    /* renamed from: j */
    private AtomicBoolean f1134j = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f1135k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f1136l;

    /* renamed from: m */
    private boolean f1137m;

    /* renamed from: n */
    private boolean f1138n;

    /* renamed from: o */
    private Double f1139o = null;

    C0348k(Context context, C0477n nVar, AdSlot adSlot) {
        this.f1125a = context;
        this.f1126b = nVar;
        this.f1127c = adSlot;
        if (getInteractionType() == 4) {
            this.f1129e = C1009d.m4776a(this.f1125a, this.f1126b, "fullscreen_interstitial_ad");
        }
        this.f1131g = false;
        this.f1136l = C0984l.m4553a();
    }

    /* renamed from: a */
    public void mo915a(boolean z) {
        this.f1135k = z;
    }

    /* renamed from: a */
    public void mo914a(String str) {
        if (!this.f1134j.get()) {
            this.f1131g = true;
            this.f1132h = str;
        }
    }

    public void setFullScreenVideoAdInteractionListener(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f1128d = fullScreenVideoAdInteractionListener;
        m1443a(1);
    }

    public int getInteractionType() {
        C0477n nVar = this.f1126b;
        if (nVar == null) {
            return -1;
        }
        return nVar.mo1332L();
    }

    public void showFullScreenVideoAd(Activity activity) {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            C10638l.m31242e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C0136e.m610a(this.f1126b, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            C10638l.m31242e("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        } else if (!this.f1134j.get()) {
            this.f1134j.set(true);
            C0477n nVar = this.f1126b;
            if (nVar == null || (nVar.mo1330J() == null && this.f1126b.mo1336P() == null)) {
                C0136e.m610a(this.f1126b, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context context = activity == null ? this.f1125a : activity;
            if (context == null) {
                context = C0558m.m2663a();
            }
            if (this.f1126b.mo1447l() != 2 || this.f1126b.mo1428f() == 5 || this.f1126b.mo1428f() == 6) {
                if (C0308c.m1325a(this.f1126b)) {
                    intent = new Intent(context, TTInterstitialActivity.class);
                } else {
                    intent = new Intent(context, TTFullScreenVideoActivity.class);
                }
            } else if (C0308c.m1325a(this.f1126b)) {
                intent = new Intent(context, TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(context, TTFullScreenExpressVideoActivity.class);
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
            intent.putExtra("show_download_bar", this.f1130f);
            intent.putExtra("is_verity_playable", this.f1135k);
            Double d = this.f1139o;
            intent.putExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, d == null ? "" : String.valueOf(d));
            if (!TextUtils.isEmpty(this.f1133i)) {
                intent.putExtra("rit_scene", this.f1133i);
            }
            if (this.f1131g) {
                intent.putExtra("video_cache_url", this.f1132h);
            }
            if (C0934b.m4334c()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.f1126b.mo1397ar().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f1136l);
            } else {
                C0625t.m3022a().mo2036h();
                C0625t.m3022a().mo2026a(this.f1126b);
                C0625t.m3022a().mo2024a(this.f1128d);
                C0625t.m3022a().mo2027a(this.f1129e);
                this.f1128d = null;
            }
            C10622b.m31190a(context, intent, new C10622b.C10623a() {
                /* renamed from: a */
                public void mo299a() {
                    if (C0348k.this.f1135k) {
                        try {
                            C0796b.m3985a().mo2605a(C0348k.this.f1126b.mo1330J().mo62925j());
                        } catch (Throwable unused) {
                        }
                    }
                }

                /* renamed from: a */
                public void mo300a(Throwable th) {
                    C10638l.m31239c("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                    if (C0348k.this.f1135k) {
                        try {
                            C0796b.m3985a().mo2606a(C0348k.this.f1126b.mo1330J().mo62925j(), -1, th != null ? th.getMessage() : "playable tool error open");
                        } catch (Throwable unused) {
                        }
                    }
                    C0136e.m610a(C0348k.this.f1126b, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            String a = C0996u.m4618a(this.f1126b, (String) null);
            if (a != null) {
                try {
                    AdSlot b = C0311d.m1344a(this.f1125a).mo864b(a);
                    C0311d.m1344a(this.f1125a).mo863a(a);
                    if (b == null) {
                        return;
                    }
                    if (!this.f1131g || TextUtils.isEmpty(this.f1132h)) {
                        C0311d.m1344a(this.f1125a).mo861a(b);
                    } else {
                        C0311d.m1344a(this.f1125a).mo866b(b);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void showFullScreenVideoAd(Activity activity, TTAdConstant.RitScenes ritScenes, String str) {
        if (ritScenes == null) {
            C10638l.m31242e("TTFullScreenVideoAdImpl", "The param ritScenes can not be null!");
            return;
        }
        if (ritScenes == TTAdConstant.RitScenes.CUSTOMIZE_SCENES) {
            this.f1133i = str;
        } else {
            this.f1133i = ritScenes.getScenesName();
        }
        showFullScreenVideoAd(activity);
    }

    public void setShowDownLoadBar(boolean z) {
        this.f1130f = z;
    }

    public Map<String, Object> getMediaExtraInfo() {
        C0477n nVar = this.f1126b;
        if (nVar != null) {
            return nVar.mo1389aj();
        }
        return null;
    }

    public int getFullVideoAdType() {
        C0477n nVar = this.f1126b;
        if (nVar == null) {
            return -1;
        }
        if (C0480p.m2198i(nVar)) {
            return 2;
        }
        return C0480p.m2199j(this.f1126b) ? 1 : 0;
    }

    public String getAdCreativeToken() {
        return this.f1126b.mo1453n();
    }

    /* renamed from: a */
    private void m1443a(final int i) {
        if (C0934b.m4334c()) {
            C10615e.m31168c(new C10618g("FullScreen_registerMultiProcessListener") {
                public void run() {
                    C0898a a = C0898a.m4299a(C0348k.this.f1125a);
                    if (i == 1 && C0348k.this.f1128d != null) {
                        C10638l.m31235b("MultiProcess", "start registerFullScreenVideoListener ! ");
                        C0919c cVar = new C0919c(C0348k.this.f1128d);
                        IListenerManager asInterface = C0908f.asInterface(a.mo2767a(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(C0348k.this.f1136l, cVar);
                                C10638l.m31235b("MultiProcess", "end registerFullScreenVideoListener ! ");
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
        if (!this.f1137m) {
            C0992q.m4596a(this.f1126b, d);
            this.f1137m = true;
        }
    }

    public void loss(Double d, String str, String str2) {
        if (!this.f1138n) {
            C0992q.m4597a(this.f1126b, d, str, str2);
            this.f1138n = true;
        }
    }

    public void setPrice(Double d) {
        this.f1139o = d;
    }
}
