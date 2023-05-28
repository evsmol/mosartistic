package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bykv.p271vk.openvk.component.video.api.C10184b;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10202c;
import com.bykv.p271vk.openvk.component.video.p272a.C10063a;
import com.bytedance.sdk.component.adexpress.p294a.p295a.C10262a;
import com.bytedance.sdk.component.p323e.p326c.C10584a;
import com.bytedance.sdk.component.p328f.C10612c;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10645r;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0547k;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.core.C0621r;
import com.bytedance.sdk.openadsdk.core.C0627u;
import com.bytedance.sdk.openadsdk.core.p025i.C0510b;
import com.bytedance.sdk.openadsdk.core.p025i.C0512d;
import com.bytedance.sdk.openadsdk.core.p025i.C0515e;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.C0946d;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0898a;
import com.bytedance.sdk.openadsdk.multipro.aidl.C0911b;
import com.bytedance.sdk.openadsdk.p037d.C0750a;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.p042h.p044b.C0814a;
import com.bytedance.sdk.openadsdk.p046i.C0835d;
import com.bytedance.sdk.openadsdk.utils.C0967e;
import com.bytedance.sdk.openadsdk.utils.C0980h;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class TTAdSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    public static final long INIT_TIME = System.currentTimeMillis();

    /* renamed from: a */
    private static AtomicBoolean f26677a = new AtomicBoolean(false);

    /* renamed from: b */
    private static SharedPreferences.OnSharedPreferenceChangeListener f26678b;

    /* renamed from: c */
    private static final TTAdManager f26679c = new C0627u();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f26680d = 0;

    public interface InitCallback {
        void fail(int i, String str);

        void success();
    }

    public static boolean isInitSuccess() {
        return C0547k.m2623e() == 1;
    }

    public static void init(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        f26680d = SystemClock.elapsedRealtime();
        if (initCallback != null && !C0547k.f2055d.contains(initCallback)) {
            C0547k.f2055d.add(initCallback);
        }
        C0547k.m2617a(3);
        if (isInitSuccess()) {
            m31407e();
        } else if (context == null && initCallback != null) {
            m31399b((int) INIT_LOCAL_FAIL_CODE, "Context is null, please check. ");
        } else if (tTAdConfig != null || initCallback == null) {
            m31406d(context, tTAdConfig);
            try {
                C0503h.m2279a(initCallback);
                try {
                    C10647t.m31276a(C0558m.m2663a(), "tt_ad_logo_txt");
                    if (isInitSuccess()) {
                        if (initCallback != null) {
                            m31407e();
                        }
                    } else if (!tTAdConfig.isSupportMultiProcess()) {
                        m31402b(context, tTAdConfig, initCallback);
                    } else {
                        C0898a.m4300a((C0911b) new C0911b() {
                            /* renamed from: a */
                            public void mo2792a() {
                                TTAdSdk.m31402b(context, tTAdConfig, initCallback);
                            }
                        });
                        C0898a.m4299a(context).mo2768a();
                    }
                } catch (Throwable unused) {
                    if (initCallback != null) {
                        m31399b((int) INIT_LOCAL_FAIL_CODE, "resources not found, if you use aab please call TTAdConfig.setPackageName");
                    }
                }
            } catch (Throwable unused2) {
                if (initCallback != null) {
                    m31399b((int) INIT_LOCAL_FAIL_CODE, "Internal Error, setting exception. ");
                }
            }
        } else {
            m31399b((int) INIT_LOCAL_FAIL_CODE, "TTAdConfig is null, please check.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31402b(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        C0547k.m2621c().post(new Runnable() {
            public void run() {
                boolean z;
                try {
                    if (!TTAdSdk.isInitSuccess()) {
                        TTAdSdk.m31408e(context, tTAdConfig);
                        TTAdSdk.m31409f(context, tTAdConfig);
                        if (initCallback != null) {
                            TTAdSdk.m31407e();
                        }
                        z = true;
                        TTAdSdk.m31400b(context, SystemClock.elapsedRealtime() - TTAdSdk.f26680d, z, tTAdConfig);
                    } else if (initCallback != null) {
                        TTAdSdk.m31407e();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (initCallback != null) {
                        TTAdSdk.m31399b((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, th.getMessage());
                    }
                    z = false;
                }
            }
        });
    }

    public static TTAdManager getAdManager() {
        C0996u.m4686m("getAdManager");
        return f26679c;
    }

    /* renamed from: c */
    private static void m31404c(final Context context, TTAdConfig tTAdConfig) {
        m31403c();
        C0547k.f2052a = tTAdConfig.isAsyncInit();
        f26679c.setAppId(tTAdConfig.getAppId()).setCoppa(tTAdConfig.getCoppa()).setGdpr(tTAdConfig.getGDPR()).setCcpa(tTAdConfig.getCcpa()).setName(tTAdConfig.getAppName()).setIconId(tTAdConfig.getAppIconId()).setPaid(tTAdConfig.isPaid()).setKeywords(tTAdConfig.getKeywords()).setData(tTAdConfig.getData()).setTitleBarTheme(tTAdConfig.getTitleBarTheme()).setAllowShowNotifiFromSDK(tTAdConfig.isAllowShowNotify()).isUseTextureView(tTAdConfig.isUseTextureView()).setNeedClearTaskReset(tTAdConfig.getNeedClearTaskReset()).debugLog(tTAdConfig.getDebugLog());
        try {
            if (tTAdConfig.isDebug()) {
                C10638l.m31233b();
                f26679c.openDebugMode();
                C0980h.m4544a();
                C10202c.m29283a();
            }
        } catch (Throwable unused) {
        }
        C0516f.f1877a = C0512d.m2384b(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        C106733 r0 = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (C0516f.f1878b.equals(str)) {
                    C10615e.m31159a((C10618g) new C10618g("onSharedPreferenceChanged") {
                        public void run() {
                            String b = C0512d.m2384b(context);
                            if ((TextUtils.isEmpty(b) && !TextUtils.isEmpty(C0516f.f1877a)) || !b.equals(C0516f.f1877a)) {
                                C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
                                C0516f.f1877a = b;
                            }
                        }
                    });
                }
            }
        };
        f26678b = r0;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(r0);
    }

    /* renamed from: c */
    private static void m31403c() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context a = C0558m.m2663a();
                if (a != null && (shortcutManager = (ShortcutManager) a.getSystemService(ShortcutManager.class)) != null) {
                    C0503h.m2281d().mo1585a(shortcutManager.isRequestPinShortcutSupported());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m31406d(Context context, TTAdConfig tTAdConfig) {
        if (!TextUtils.isEmpty(tTAdConfig.getPackageName())) {
            C10647t.m31278a(tTAdConfig.getPackageName());
        }
        C0558m.m2665a(context);
        if (!tTAdConfig.isSupportMultiProcess()) {
            C0934b.m4333b();
        }
        C0547k.m2619b();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m31408e(Context context, TTAdConfig tTAdConfig) {
        if (C0515e.m2397a()) {
            C10615e.m31164b(-1);
            C0946d.m4389a(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) C10615e.m31156a();
            C10584a.m31043a(context).mo64189a(threadPoolExecutor);
            C0547k.f2053b.set(true);
            if (tTAdConfig.isSupportMultiProcess()) {
                C0934b.m4332a();
            }
            try {
                C10262a.m29464a().mo63093a(C0750a.m3822a());
            } catch (Exception e) {
                e.printStackTrace();
            }
            updateAdConfig(tTAdConfig);
            m31404c(context, tTAdConfig);
            C0547k.m2616a();
            C10184b.m29124a(context, (String) null, threadPoolExecutor, C0547k.m2621c());
            C10184b.m29126a(tTAdConfig.isSupportMultiProcess());
            C10184b.m29125a(C0835d.m4093a().mo2660b().mo64153e());
            if (Build.VERSION.SDK_INT < 23) {
                C10063a.m28637a(context);
            }
            if (C0558m.m2673h().mo1665C()) {
                C0621r.m3009a();
            }
            NetworkTools.m4456c(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m31409f(final Context context, final TTAdConfig tTAdConfig) {
        C10615e.m31161a(new C10618g("init sync") {
            public void run() {
                C0516f h = C0558m.m2673h();
                if (!h.mo1667E()) {
                    synchronized (h) {
                        if (!h.mo1667E()) {
                            h.mo1657a();
                            h.mo1675a((Boolean) false);
                        }
                    }
                }
                C0967e.m4501f();
                C0547k.m2618a(context);
                C10615e.m31162a(true);
                C10615e.m31158a((C10612c) new C0814a());
                if (Build.VERSION.SDK_INT != 29 || !C0985m.m4575r()) {
                    C0967e.m4485a(context);
                }
                C0967e.m4502f(context);
                C0967e.m4509j(context);
                C0967e.m4511k(context);
            }
        }, 10, 5);
        C0547k.m2621c().post(new Runnable() {
            public void run() {
                if (!tTAdConfig.isSupportMultiProcess()) {
                    C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
                } else if (C10645r.m31269a(context)) {
                    C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
                    C10638l.m31238c("TTAdSdk", "Load setting in main process");
                }
                C0558m.m2668c().mo393a();
                C0558m.m2670e().mo393a();
                C0558m.m2669d().mo393a();
            }
        });
        m31405d();
    }

    /* renamed from: d */
    private static void m31405d() {
        C10615e.m31166b(new C10618g("Disk Event") {
            public void run() {
                C0796b.m3989b();
            }
        }, 5);
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        if (tTAdConfig != null) {
            if (!TextUtils.isEmpty(tTAdConfig.getData())) {
                C0503h.m2281d().mo1597d(tTAdConfig.getData());
            }
            if (!TextUtils.isEmpty(tTAdConfig.getKeywords())) {
                C0503h.m2281d().mo1594c(tTAdConfig.getKeywords());
            }
        }
    }

    public static void setCoppa(int i) {
        C0996u.m4686m("setCoppa");
        if (i != getCoppa()) {
            f26679c.setCoppa(i);
            C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
        }
    }

    public static int getCoppa() {
        C0996u.m4686m("getCoppa");
        return f26679c.getCoppa();
    }

    public static void setGdpr(int i) {
        C0996u.m4686m("setGdpr");
        if (i != getGdpr()) {
            f26679c.setGdpr(i);
            C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
        }
    }

    public static int getGdpr() {
        C0996u.m4686m("getGdpr");
        return f26679c.getGdpr();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31400b(Context context, long j, boolean z, TTAdConfig tTAdConfig) {
        final Context context2 = context;
        final TTAdConfig tTAdConfig2 = tTAdConfig;
        final long j2 = j;
        final boolean z2 = z;
        C10615e.m31160a(new C10618g("initMustBeCall") {
            public void run() {
                ApmHelper.initApm(context2, tTAdConfig2);
                if (C0558m.m2673h().mo1668F()) {
                    try {
                        boolean e = C0503h.m2281d().mo1602e();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j2);
                        jSONObject.put("is_async", true);
                        jSONObject.put("is_multi_process", tTAdConfig2.isSupportMultiProcess());
                        jSONObject.put("is_debug", tTAdConfig2.isDebug());
                        jSONObject.put("is_use_texture_view", tTAdConfig2.isUseTextureView());
                        jSONObject.put("is_activate_init", e);
                        jSONObject.put("minSdkVersion", C0996u.m4692o(context2));
                        jSONObject.put("targetSdkVersion", C0996u.m4688n(context2));
                        jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                        jSONObject.put("is_success", z2);
                        C0503h.m2281d().mo1590b(false);
                        C0796b.m3985a().mo2608a("pangle_sdk_init", jSONObject);
                        C10638l.m31231a("TTAdSdk", "pangle_sdk_init = ", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m31407e() {
        synchronized (C0547k.f2055d) {
            C0547k.m2617a(1);
            for (InitCallback success : C0547k.f2055d) {
                try {
                    success.success();
                } catch (Throwable unused) {
                }
            }
            C0547k.f2055d.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31399b(int i, String str) {
        synchronized (C0547k.f2055d) {
            C0547k.m2617a(2);
            for (InitCallback fail : C0547k.f2055d) {
                try {
                    fail.fail(i, str);
                } catch (Throwable unused) {
                }
            }
            C0547k.f2055d.clear();
        }
    }

    public static void setCCPA(int i) {
        C0996u.m4686m("setCCPA");
        if (i != getCCPA()) {
            C0503h.m2281d().mo1604f(i);
            C0512d.m2378a((C0510b) C0558m.m2673h()).mo1659a(true);
        }
    }

    public static int getCCPA() {
        C0996u.m4686m("getCCPA");
        return C0503h.m2281d().mo1621v();
    }

    public static void addInitCallback(InitCallback initCallback) {
        if (initCallback != null) {
            synchronized (C0547k.f2055d) {
                if (isInitSuccess()) {
                    initCallback.success();
                } else if (C0547k.m2623e() == 2) {
                    initCallback.fail(INIT_LOCAL_FAIL_CODE, "Pangle Sdk initialization has failed before addPAGInitCallback");
                } else {
                    C0547k.f2055d.add(initCallback);
                }
            }
        }
    }
}
