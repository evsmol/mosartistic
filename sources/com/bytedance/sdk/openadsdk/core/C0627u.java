package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p323e.C10572a;
import com.bytedance.sdk.component.utils.C10621a;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10651w;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.C0607o;
import com.bytedance.sdk.openadsdk.core.p021e.C0477n;
import com.bytedance.sdk.openadsdk.core.p021e.C0479o;
import com.bytedance.sdk.openadsdk.core.p025i.C0516f;
import com.bytedance.sdk.openadsdk.p000b.C0136e;
import com.bytedance.sdk.openadsdk.utils.C0985m;
import com.bytedance.sdk.openadsdk.utils.C0988n;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.C1002v;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.u */
/* compiled from: TTAdManagerImpl */
public class C0627u implements TTAdManager {

    /* renamed from: f */
    private static final Map<Integer, String> f2336f = new HashMap<Integer, String>(12) {
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_running_time");
            put(6, "vendor");
            put(7, "model");
            put(8, "user_agent_device");
            put(9, "user_agent_webview");
            put(10, "sys_compiling_time");
            put(11, "sec_did");
            put(12, "url");
            put(13, "X-Argus");
            put(14, "X-Ladon");
            put(15, "X-Khronos");
            put(16, "X-Gorgon");
            put(17, "pangle_m");
            put(18, "screen_height");
            put(19, "screen_width");
            put(20, "rom_version");
            put(21, "carrier_name");
            put(22, "os_version");
            put(23, "conn_type");
            put(24, "boot");
        }
    };

    /* renamed from: a */
    String f2337a;

    /* renamed from: b */
    boolean f2338b = false;

    /* renamed from: c */
    boolean f2339c = false;

    /* renamed from: d */
    String f2340d = "com.union_test.internationad";

    /* renamed from: e */
    String f2341e = "5001121";

    /* renamed from: g */
    private int f2342g = 0;

    /* renamed from: e */
    private void m3038e(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f2337a)) {
            this.f2337a = str;
            try {
                JSONObject a = C0558m.m2671f().mo1839a(new JSONObject(str));
                if (a != null) {
                    C0607o.C0617a a2 = C0607o.C0617a.m2994a(a, (AdSlot) null, (C0479o) null);
                    if (a2.f2307d == 20000 && a2.f2311h != null && a2.f2311h.mo1199b().size() > 0) {
                        boolean z = false;
                        C0477n nVar = a2.f2311h.mo1199b().get(0);
                        this.f2338b = C0996u.m4650d(nVar);
                        if (nVar.mo1327G() != null) {
                            z = true;
                        }
                        this.f2339c = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public C0627u setAppId(String str) {
        C0503h.m2281d().mo1583a(str);
        return this;
    }

    /* renamed from: a */
    public C0627u setPaid(boolean z) {
        C0503h.m2281d().mo1595c(z);
        return this;
    }

    /* renamed from: b */
    public C0627u setName(String str) {
        C0503h.m2281d().mo1589b(str);
        return this;
    }

    /* renamed from: c */
    public C0627u setKeywords(String str) {
        C0503h.m2281d().mo1594c(str);
        return this;
    }

    public TTAdNative createAdNative(Context context) {
        return new C0629v(context);
    }

    /* renamed from: d */
    public C0627u setData(String str) {
        C0503h.m2281d().mo1597d(str);
        return this;
    }

    public TTAdManager debugLog(int i) {
        this.f2342g = i;
        return this;
    }

    public String getBiddingToken() {
        return getBiddingToken((String) null);
    }

    public String getBiddingToken(String str) {
        int i;
        String str2 = str;
        C0996u.m4690n("getBiddingToken");
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", TTAdSdk.isInitSuccess() ? 1 : 0);
            String e = C0558m.m2673h().mo1688e();
            String f = C0558m.m2673h().mo1691f();
            if (!(e == null || f == null)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", e);
                jSONObject3.put("param", f);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", "4.5.0.6");
            jSONObject2.put("package_name", C0996u.m4648d());
            jSONObject2.put("user_data", C0607o.m2931a(TextUtils.isEmpty(str2) ? null : new AdSlot.Builder().setCodeId(str2).build()));
            jSONObject2.put("ts", System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                C0516f h = C0558m.m2673h();
                if (h.mo1715p("gaid")) {
                    jSONObject2.put("gaid", C1010a.m4777a().mo2932b());
                }
                Context a = C0558m.m2663a();
                jSONObject2.put("apk-sign", C0624s.m3017a());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - TTAdSdk.INIT_TIME) / 1000);
                jSONObject2.put("vendor", Build.MANUFACTURER);
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put("user_agent_device", C0996u.m4614a());
                jSONObject2.put("user_agent_webview", C0996u.m4631b());
                jSONObject2.put("sys_compiling_time", C0517j.m2477b(a));
                jSONObject2.put("screen_height", C1002v.m4744d(a));
                jSONObject2.put("screen_width", C1002v.m4740c(a));
                jSONObject2.put("rom_version", C0985m.m4554a());
                jSONObject2.put("carrier_name", C0988n.m4581a());
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", C0996u.m4695p(a));
                if (h.mo1715p("boot")) {
                    jSONObject2.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                }
                C0624s.m3020a(jSONObject2);
                i = f2336f.size();
            } else {
                i = 2;
            }
            while (i >= 1 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(f2336f.get(Integer.valueOf(i)));
                i--;
            }
            jSONObject = C10621a.m31186a(jSONObject2);
            while (i >= 1 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(f2336f.get(Integer.valueOf(i)));
                jSONObject = C10621a.m31186a(jSONObject2);
                i--;
            }
            if (C10638l.m31240c()) {
                C10638l.m31238c("mssdk", "bidding token: " + jSONObject.toString() + "\nbidding token length: " + jSONObject.toString().getBytes().length);
            }
            C0136e.m615a(str);
        } catch (Throwable unused) {
        }
        C10638l.m31235b("TTAdManagerImpl", "bidding token: " + jSONObject.toString());
        return jSONObject.toString();
    }

    public int getCcpa() {
        return C0503h.m2281d().mo1621v();
    }

    public int getCoppa() {
        return C0503h.m2281d().mo1608i();
    }

    public int getDebugLog() {
        return this.f2342g;
    }

    public int getGdpr() {
        return C0503h.m2281d().mo1609j();
    }

    public String getSDKVersion() {
        return "4.5.0.6";
    }

    public String getSupportRegion() {
        return "VA";
    }

    public boolean isExpressAd(String str, String str2) {
        if (C0558m.m2673h().mo1697h(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m3038e(str2);
        return this.f2339c;
    }

    public boolean isFullScreenVideoAd(String str, String str2) {
        if (C0558m.m2673h().mo1700i(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        m3038e(str2);
        return this.f2338b;
    }

    public TTAdManager isUseTextureView(boolean z) {
        C0503h.m2281d().mo1601e(z);
        return this;
    }

    public boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (!this.f2340d.equals(C0558m.m2663a().getPackageName()) || !this.f2341e.equals(C0503h.m2281d().mo1603f()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method a = C10651w.m31317a("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (a != null) {
                a.invoke((Object) null, new Object[]{str, Integer.valueOf(i), str2, str3, str4});
            }
        } catch (Throwable th) {
            C10638l.m31236b("TTAdManagerImpl", "reward component maybe not exist, pls check", th);
        }
        return true;
    }

    public TTAdManager openDebugMode() {
        C10638l.m31233b();
        C10572a.m30985a();
        return this;
    }

    public void requestPermissionIfNecessary(Context context) {
    }

    public TTAdManager setAllowShowNotifiFromSDK(boolean z) {
        C0503h.m2281d().mo1598d(z);
        return this;
    }

    public TTAdManager setCcpa(int i) {
        C0503h.m2281d().mo1604f(i);
        return this;
    }

    public TTAdManager setCoppa(int i) {
        C0503h.m2281d().mo1588b(i);
        return this;
    }

    public TTAdManager setGdpr(int i) {
        C0503h.m2281d().mo1593c(i);
        return this;
    }

    public TTAdManager setIconId(int i) {
        C0503h.m2281d().mo1582a(i);
        return this;
    }

    public TTAdManager setNeedClearTaskReset(String[] strArr) {
        C0503h.m2281d().mo1586a(strArr);
        return this;
    }

    public TTAdManager setTitleBarTheme(int i) {
        C0503h.m2281d().mo1600e(i);
        return this;
    }

    public void showPrivacyProtection() {
        TTDelegateActivity.m182a();
    }
}
