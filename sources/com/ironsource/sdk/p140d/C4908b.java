package com.ironsource.sdk.p140d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.plus.PlusShare;
import com.ironsource.environment.p124e.C4399a;
import com.ironsource.mediationsdk.adunit.p127a.C4559a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.C4742a;
import com.ironsource.sdk.C4751b;
import com.ironsource.sdk.C4906d;
import com.ironsource.sdk.C4925e;
import com.ironsource.sdk.C4928f;
import com.ironsource.sdk.controller.C4782c;
import com.ironsource.sdk.controller.C4790g;
import com.ironsource.sdk.controller.C4812j;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.p137a.C4743a;
import com.ironsource.sdk.p137a.C4747d;
import com.ironsource.sdk.p137a.C4748e;
import com.ironsource.sdk.p137a.C4749f;
import com.ironsource.sdk.p139c.C4759a;
import com.ironsource.sdk.p143f.C4931b;
import com.ironsource.sdk.p144g.C4932a;
import com.ironsource.sdk.p144g.C4935c;
import com.ironsource.sdk.p144g.C4936d;
import com.ironsource.sdk.p145h.C4950e;
import com.ironsource.sdk.p147j.C4958b;
import com.ironsource.sdk.p147j.C4959c;
import com.ironsource.sdk.p147j.C4961e;
import com.ironsource.sdk.p147j.C4962f;
import com.ironsource.sdk.p147j.p148a.C4954a;
import com.ironsource.sdk.p147j.p148a.C4955b;
import com.ironsource.sdk.p147j.p148a.C4956c;
import com.ironsource.sdk.p147j.p148a.C4957d;
import com.ironsource.sdk.service.C4977a;
import com.ironsource.sdk.service.C4979c;
import com.ironsource.sdk.service.C4980d;
import com.ironsource.sdk.utils.C4983a;
import com.ironsource.sdk.utils.C4984b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.ironsource.sdk.d.b */
public final class C4908b implements C4924c, C4925e, C4928f, C4954a, C4955b, C4956c, C4957d {

    /* renamed from: g */
    private static C4908b f12531g;

    /* renamed from: a */
    public C4790g f12532a;

    /* renamed from: b */
    C4961e f12533b;

    /* renamed from: c */
    String f12534c;

    /* renamed from: d */
    String f12535d;

    /* renamed from: e */
    C4812j f12536e;

    /* renamed from: f */
    private final String f12537f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: h */
    private long f12538h;

    /* renamed from: i */
    private C4980d f12539i;

    /* renamed from: j */
    private C4979c f12540j;

    /* renamed from: k */
    private boolean f12541k = false;

    /* renamed from: l */
    private C4782c f12542l;

    private C4908b(Context context) {
        m14298b(context);
    }

    private C4908b(String str, String str2, Context context) {
        this.f12534c = str;
        this.f12535d = str2;
        m14298b(context);
    }

    /* renamed from: a */
    public static synchronized C4908b m14292a(Context context) {
        C4908b a;
        synchronized (C4908b.class) {
            a = m14293a(context, 0);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C4908b m14293a(Context context, int i) {
        C4908b bVar;
        synchronized (C4908b.class) {
            Logger.m14507i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f12531g == null) {
                f12531g = new C4908b(context);
            }
            bVar = f12531g;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C4925e m14294a(String str, String str2, Context context) {
        C4908b bVar;
        synchronized (C4908b.class) {
            if (f12531g == null) {
                C4747d.m13920a(C4749f.f12037a);
                f12531g = new C4908b(str, str2, context);
            } else {
                C4980d.m14484a().mo34726b(str);
                C4980d.m14484a().mo34721a(str2);
            }
            bVar = f12531g;
        }
        return bVar;
    }

    /* renamed from: a */
    private static C4962f m14295a(C4935c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C4962f) cVar.f12643g;
    }

    /* renamed from: a */
    private void m14296a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f12541k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C4907a(this));
            } catch (Throwable th) {
                C4743a aVar = new C4743a();
                aVar.mo34234a("generalmessage", th.getMessage());
                C4747d.m13921a(C4749f.f12053q, (Map<String, Object>) aVar.f12028a);
            }
        }
    }

    /* renamed from: b */
    private static C4959c m14297b(C4935c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C4959c) cVar.f12643g;
    }

    /* renamed from: b */
    private void m14298b(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            C4984b.m14517a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C4950e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            C4984b.m14516a().mo34731a(SDKUtils.getSDKVersion());
            this.f12539i = m14301c(context);
            this.f12536e = new C4812j();
            C4782c cVar = new C4782c();
            this.f12542l = cVar;
            if (context instanceof Activity) {
                cVar.mo34327a((Activity) context);
            }
            this.f12532a = new C4790g(context, this.f12542l, this.f12539i, this.f12536e, C4399a.f10491a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.m14507i("IronSourceAdsPublisherAgent", "C'tor");
            m14296a(context, networkConfiguration);
            this.f12540j = new C4979c();
            C4559a.m13270a("sdkv", (Object) "5.113");
            this.f12540j.mo34714a();
            this.f12540j.mo34715a(context);
            this.f12540j.mo34716b();
            this.f12540j.mo34718c();
            this.f12540j.mo34717b(context);
            this.f12538h = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m14299b(C4751b bVar, Map<String, String> map) {
        if (bVar.f12067h) {
            m14302c(bVar, map);
        } else {
            m14304d(bVar, map);
        }
    }

    /* renamed from: c */
    private static C4958b m14300c(C4935c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C4958b) cVar.f12643g;
    }

    /* renamed from: c */
    private C4980d m14301c(Context context) {
        C4980d a = C4980d.m14484a();
        a.mo34725b();
        a.mo34720a(context, this.f12534c, this.f12535d);
        return a;
    }

    /* renamed from: c */
    private void m14302c(final C4751b bVar, final Map<String, String> map) {
        Logger.m14503d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f12061b);
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4935c a = C4908b.this.f12536e.mo34390a(C4936d.C4941e.Interstitial, bVar.f12061b);
                if (a != null) {
                    C4908b.this.f12532a.mo34343a(a, (Map<String, String>) map, (C4956c) C4908b.this);
                }
            }
        });
    }

    /* renamed from: d */
    private C4935c m14303d(C4936d.C4941e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f12536e.mo34390a(eVar, str);
    }

    /* renamed from: d */
    private void m14304d(final C4751b bVar, final Map<String, String> map) {
        Logger.m14503d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f12061b);
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4936d.C4941e eVar = bVar.mo34238a() ? C4936d.C4941e.Banner : C4936d.C4941e.Interstitial;
                C4812j jVar = C4908b.this.f12536e;
                C4751b bVar = bVar;
                String str = bVar.f12061b;
                String str2 = bVar.f12062c;
                HashMap hashMap = new HashMap();
                hashMap.put("instanceId", bVar.f12061b);
                hashMap.put("instanceName", bVar.f12062c);
                hashMap.put("rewarded", Boolean.toString(bVar.f12060a));
                hashMap.put("inAppBidding", Boolean.toString(bVar.f12063d));
                hashMap.put("apiVersion", "2");
                C4742a aVar = bVar.f12064e;
                String str3 = BuildConfig.ADAPTER_VERSION;
                hashMap.put(IabUtils.KEY_WIDTH, aVar != null ? Integer.toString(bVar.f12064e.f12025a) : str3);
                if (bVar.f12064e != null) {
                    str3 = Integer.toString(bVar.f12064e.f12026b);
                }
                hashMap.put(IabUtils.KEY_HEIGHT, str3);
                hashMap.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, bVar.f12064e != null ? bVar.f12064e.f12027c : "");
                hashMap.put("isBanner", Boolean.toString(bVar.mo34238a()));
                if (bVar.f12065f != null) {
                    hashMap.putAll(bVar.f12065f);
                }
                C4935c cVar = new C4935c(str, str2, hashMap, bVar.f12066g);
                jVar.mo34393a(eVar, str, cVar);
                C4743a aVar2 = new C4743a();
                C4743a a = aVar2.mo34234a("isbiddinginstance", Boolean.valueOf(bVar.f12063d)).mo34234a("demandsourcename", bVar.f12062c).mo34234a("producttype", C4906d.m14290a(bVar));
                C4977a aVar3 = C4977a.f12725a;
                a.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(bVar.f12061b)));
                C4747d.m13921a(C4749f.f12043g, (Map<String, Object>) aVar2.f12028a);
                if (eVar == C4936d.C4941e.Banner) {
                    C4908b.this.f12532a.mo34346a(C4908b.this.f12534c, C4908b.this.f12535d, cVar, (C4955b) C4908b.this);
                    bVar.f12067h = true;
                    C4908b.this.f12532a.mo34342a(cVar, (Map<String, String>) map, (C4955b) C4908b.this);
                    return;
                }
                C4908b.this.f12532a.mo34347a(C4908b.this.f12534c, C4908b.this.f12535d, cVar, (C4956c) C4908b.this);
                bVar.f12067h = true;
                C4908b.this.f12532a.mo34343a(cVar, (Map<String, String>) map, (C4956c) C4908b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo34594a() {
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34359d();
            }
        });
    }

    /* renamed from: a */
    public final void mo34595a(Activity activity) {
        try {
            Logger.m14507i("IronSourceAdsPublisherAgent", "release()");
            C4983a.m14514a();
            this.f12542l.mo34328b();
            this.f12532a.mo34355b((Context) activity);
            this.f12532a.destroy();
            this.f12532a = null;
        } catch (Exception unused) {
        }
        f12531g = null;
    }

    /* renamed from: a */
    public final void mo34596a(Activity activity, C4751b bVar, Map<String, String> map) {
        this.f12542l.mo34327a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        C4977a aVar = C4977a.f12725a;
        C4977a.m14472a(bVar.f12061b, currentTimeMillis);
        C4743a aVar2 = new C4743a();
        aVar2.mo34234a("isbiddinginstance", Boolean.valueOf(bVar.f12063d)).mo34234a("demandsourcename", bVar.f12062c).mo34234a("producttype", C4906d.m14290a(bVar)).mo34234a("custom_c", Long.valueOf(currentTimeMillis));
        C4747d.m13921a(C4749f.f12041e, (Map<String, Object>) aVar2.f12028a);
        Logger.m14503d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f12061b);
        if (bVar.f12063d) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e) {
                C4743a a = new C4743a().mo34234a("callfailreason", e.getMessage()).mo34234a("generalmessage", bVar.f12067h ? C4931b.f12609a : C4931b.f12610b).mo34234a("isbiddinginstance", Boolean.valueOf(bVar.f12063d)).mo34234a("demandsourcename", bVar.f12062c).mo34234a("producttype", C4906d.m14290a(bVar));
                C4977a aVar3 = C4977a.f12725a;
                C4743a a2 = a.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(bVar.f12061b)));
                C4977a aVar4 = C4977a.f12725a;
                C4977a.m14473b(bVar.f12061b);
                C4747d.m13921a(C4749f.f12046j, (Map<String, Object>) a2.f12028a);
                e.printStackTrace();
                Logger.m14503d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
            }
            m14299b(bVar, map);
            return;
        }
        m14299b(bVar, map);
    }

    /* renamed from: a */
    public final void mo34597a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.f12542l.mo34327a(activity);
        }
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34351a((Map<String, String>) map, C4908b.this.f12533b);
            }
        });
    }

    /* renamed from: a */
    public final void mo34598a(C4751b bVar, final Map<String, String> map) {
        Logger.m14507i("IronSourceAdsPublisherAgent", "showAd " + bVar.f12061b);
        final C4935c a = this.f12536e.mo34390a(C4936d.C4941e.Interstitial, bVar.f12061b);
        if (a != null) {
            this.f12532a.mo34344a((Runnable) new Runnable() {
                public final void run() {
                    C4908b.this.f12532a.mo34356b(a, map, C4908b.this);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34599a(C4936d.C4941e eVar, String str) {
        C4959c b;
        C4935c d = m14303d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C4936d.C4941e.RewardedVideo) {
            C4962f a = m14295a(d);
            if (a != null) {
                a.onRVAdClosed();
            }
        } else if (eVar == C4936d.C4941e.Interstitial && (b = m14297b(d)) != null) {
            b.onInterstitialClose();
        }
    }

    /* renamed from: a */
    public final void mo34600a(C4936d.C4941e eVar, String str, C4932a aVar) {
        C4958b c;
        C4935c d = m14303d(eVar, str);
        if (d != null) {
            d.mo34665a(2);
            if (eVar == C4936d.C4941e.RewardedVideo) {
                C4962f a = m14295a(d);
                if (a != null) {
                    a.onRVInitSuccess(aVar);
                }
            } else if (eVar == C4936d.C4941e.Interstitial) {
                C4959c b = m14297b(d);
                if (b != null) {
                    b.onInterstitialInitSuccess();
                }
            } else if (eVar == C4936d.C4941e.Banner && (c = m14300c(d)) != null) {
                c.onBannerInitSuccess();
            }
        }
    }

    /* renamed from: a */
    public final void mo34601a(C4936d.C4941e eVar, String str, String str2) {
        C4958b c;
        C4935c d = m14303d(eVar, str);
        C4743a a = new C4743a().mo34234a("demandsourcename", str).mo34234a("producttype", eVar).mo34234a("callfailreason", str2);
        C4977a aVar = C4977a.f12725a;
        C4743a a2 = a.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(d.f12638b)));
        C4977a aVar2 = C4977a.f12725a;
        C4977a.m14473b(d.f12638b);
        if (d != null) {
            a2.mo34234a("isbiddinginstance", Boolean.valueOf(C4748e.m13923a(d)));
            d.mo34665a(3);
            if (eVar == C4936d.C4941e.RewardedVideo) {
                C4962f a3 = m14295a(d);
                if (a3 != null) {
                    a3.onRVInitFail(str2);
                }
            } else if (eVar == C4936d.C4941e.Interstitial) {
                C4959c b = m14297b(d);
                if (b != null) {
                    b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C4936d.C4941e.Banner && (c = m14300c(d)) != null) {
                c.onBannerInitFailed(str2);
            }
        }
        C4747d.m13921a(C4749f.f12044h, (Map<String, Object>) a2.f12028a);
    }

    /* renamed from: a */
    public final void mo34602a(C4936d.C4941e eVar, String str, String str2, JSONObject jSONObject) {
        C4958b c;
        C4935c d = m14303d(eVar, str);
        if (d != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.m14507i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d.f12637a);
                if (eVar == C4936d.C4941e.Interstitial) {
                    C4959c b = m14297b(d);
                    if (b != null) {
                        jSONObject.put("demandSourceName", str);
                        b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C4936d.C4941e.RewardedVideo) {
                    C4962f a = m14295a(d);
                    if (a != null) {
                        jSONObject.put("demandSourceName", str);
                        a.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C4936d.C4941e.Banner && (c = m14300c(d)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        c.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo34603a(final C4961e eVar) {
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34349a(C4908b.this.f12534c, C4908b.this.f12535d, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34604a(String str, int i) {
        C4962f a;
        C4935c d = m14303d(C4936d.C4941e.RewardedVideo, str);
        if (d != null && (a = m14295a(d)) != null) {
            a.onRVAdCredited(i);
        }
    }

    /* renamed from: a */
    public final void mo34605a(String str, C4759a aVar) {
        C4958b c;
        C4935c d = m14303d(C4936d.C4941e.Banner, str);
        if (d != null && (c = m14300c(d)) != null) {
            c.onBannerLoadSuccess(aVar);
        }
    }

    /* renamed from: a */
    public final void mo34606a(String str, String str2) {
        C4962f a;
        C4935c d = m14303d(C4936d.C4941e.RewardedVideo, str);
        if (d != null && (a = m14295a(d)) != null) {
            a.onRVShowFail(str2);
        }
    }

    /* renamed from: a */
    public final void mo34607a(String str, String str2, int i) {
        C4936d.C4941e productType;
        C4935c a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a = this.f12536e.mo34390a(productType, str2)) != null) {
            a.f12639c = i;
        }
    }

    /* renamed from: a */
    public final void mo34608a(final String str, final String str2, final C4961e eVar) {
        this.f12534c = str;
        this.f12535d = str2;
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34349a(str, str2, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34609a(final String str, final String str2, String str3, Map<String, String> map, C4959c cVar) {
        this.f12534c = str;
        this.f12535d = str2;
        final C4935c a = this.f12536e.mo34391a(C4936d.C4941e.Interstitial, str3, map, cVar);
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34347a(str, str2, a, (C4956c) C4908b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo34610a(final String str, final String str2, String str3, Map<String, String> map, C4962f fVar) {
        this.f12534c = str;
        this.f12535d = str2;
        final C4935c a = this.f12536e.mo34391a(C4936d.C4941e.RewardedVideo, str3, map, fVar);
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34348a(str, str2, a, (C4957d) C4908b.this);
            }
        });
    }

    /* renamed from: a */
    public final void mo34611a(String str, String str2, Map<String, String> map, C4961e eVar) {
        this.f12534c = str;
        this.f12535d = str2;
        this.f12533b = eVar;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final C4961e eVar2 = eVar;
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34350a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    /* renamed from: a */
    public final void mo34612a(final Map<String, String> map, final C4961e eVar) {
        this.f12533b = eVar;
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34350a(C4908b.this.f12534c, C4908b.this.f12535d, (Map<String, String>) map, eVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo34613a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f12539i.mo34723a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34352a(jSONObject);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo34614a(C4751b bVar) {
        Logger.m14503d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f12061b);
        C4935c a = this.f12536e.mo34390a(C4936d.C4941e.Interstitial, bVar.f12061b);
        if (a == null) {
            return false;
        }
        return a.f12642f;
    }

    /* renamed from: a */
    public final boolean mo34615a(String str) {
        return this.f12532a.mo34358c(str);
    }

    /* renamed from: b */
    public final void mo34616b(Activity activity) {
        if (!this.f12541k) {
            mo34627d(activity);
        }
    }

    /* renamed from: b */
    public final void mo34617b(C4936d.C4941e eVar, String str) {
        C4958b c;
        C4935c d = m14303d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C4936d.C4941e.RewardedVideo) {
            C4962f a = m14295a(d);
            if (a != null) {
                a.onRVAdClicked();
            }
        } else if (eVar == C4936d.C4941e.Interstitial) {
            C4959c b = m14297b(d);
            if (b != null) {
                b.onInterstitialClick();
            }
        } else if (eVar == C4936d.C4941e.Banner && (c = m14300c(d)) != null) {
            c.onBannerClick();
        }
    }

    /* renamed from: b */
    public final void mo34618b(String str) {
        C4962f a;
        C4935c d = m14303d(C4936d.C4941e.RewardedVideo, str);
        if (d != null && (a = m14295a(d)) != null) {
            a.onRVNoMoreOffers();
        }
    }

    /* renamed from: b */
    public final void mo34619b(String str, int i) {
        C4935c d = m14303d(C4936d.C4941e.Interstitial, str);
        C4959c b = m14297b(d);
        if (d != null && b != null) {
            b.onInterstitialAdRewarded(str, i);
        }
    }

    /* renamed from: b */
    public final void mo34620b(String str, String str2) {
        C4935c d = m14303d(C4936d.C4941e.Interstitial, str);
        C4743a aVar = new C4743a();
        aVar.mo34234a("callfailreason", str2).mo34234a("demandsourcename", str);
        if (d != null) {
            C4743a a = aVar.mo34234a("producttype", C4748e.m13922a(d, C4936d.C4941e.Interstitial)).mo34234a("generalmessage", d.f12641e == 2 ? C4931b.f12609a : C4931b.f12610b).mo34234a("isbiddinginstance", Boolean.valueOf(C4748e.m13923a(d)));
            C4977a aVar2 = C4977a.f12725a;
            a.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(d.f12638b)));
            C4977a aVar3 = C4977a.f12725a;
            C4977a.m14473b(d.f12638b);
            C4959c b = m14297b(d);
            if (b != null) {
                b.onInterstitialLoadFailed(str2);
            }
        }
        C4747d.m13921a(C4749f.f12042f, (Map<String, Object>) aVar.f12028a);
    }

    /* renamed from: b */
    public final void mo34621b(final JSONObject jSONObject) {
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34354a(jSONObject, (C4957d) C4908b.this);
            }
        });
    }

    /* renamed from: c */
    public final void mo34622c(Activity activity) {
        if (!this.f12541k) {
            mo34631e(activity);
        }
    }

    /* renamed from: c */
    public final void mo34623c(C4936d.C4941e eVar, String str) {
        C4962f a;
        C4935c d = m14303d(eVar, str);
        if (d == null) {
            return;
        }
        if (eVar == C4936d.C4941e.Interstitial) {
            C4959c b = m14297b(d);
            if (b != null) {
                b.onInterstitialOpen();
            }
        } else if (eVar == C4936d.C4941e.RewardedVideo && (a = m14295a(d)) != null) {
            a.onRVAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo34624c(String str) {
        C4935c d = m14303d(C4936d.C4941e.Interstitial, str);
        C4743a a = new C4743a().mo34234a("demandsourcename", str);
        if (d != null) {
            C4743a a2 = a.mo34234a("producttype", C4748e.m13922a(d, C4936d.C4941e.Interstitial)).mo34234a("isbiddinginstance", Boolean.valueOf(C4748e.m13923a(d)));
            C4977a aVar = C4977a.f12725a;
            a2.mo34234a("custom_c", Long.valueOf(C4977a.m14474c(d.f12638b)));
            C4977a aVar2 = C4977a.f12725a;
            C4977a.m14473b(d.f12638b);
            C4959c b = m14297b(d);
            if (b != null) {
                b.onInterstitialLoadSuccess();
            }
        }
        C4747d.m13921a(C4749f.f12047k, (Map<String, Object>) a.f12028a);
    }

    /* renamed from: c */
    public final void mo34625c(String str, String str2) {
        C4959c b;
        C4935c d = m14303d(C4936d.C4941e.Interstitial, str);
        if (d != null && (b = m14297b(d)) != null) {
            b.onInterstitialShowFailed(str2);
        }
    }

    /* renamed from: c */
    public final void mo34626c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f12532a.mo34344a((Runnable) new Runnable() {
                public final void run() {
                    C4908b.this.f12532a.mo34345a(optString, (C4956c) C4908b.this);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo34627d(Activity activity) {
        try {
            this.f12532a.mo34362f();
            this.f12532a.mo34355b((Context) activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo34628d(String str) {
        C4959c b;
        C4935c d = m14303d(C4936d.C4941e.Interstitial, str);
        if (d != null && (b = m14297b(d)) != null) {
            b.onInterstitialShowSuccess();
        }
    }

    /* renamed from: d */
    public final void mo34629d(String str, String str2) {
        C4958b c;
        C4935c d = m14303d(C4936d.C4941e.Banner, str);
        if (d != null && (c = m14300c(d)) != null) {
            c.onBannerLoadFail(str2);
        }
    }

    /* renamed from: d */
    public final void mo34630d(final JSONObject jSONObject) {
        this.f12532a.mo34344a((Runnable) new Runnable() {
            public final void run() {
                C4908b.this.f12532a.mo34353a(jSONObject, (C4956c) C4908b.this);
            }
        });
    }

    /* renamed from: e */
    public final void mo34631e(Activity activity) {
        this.f12542l.mo34327a(activity);
        this.f12532a.mo34361e();
        this.f12532a.mo34341a((Context) activity);
    }
}
