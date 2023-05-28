package com.bytedance.sdk.openadsdk.core.p024h;

import android.content.Context;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.mobsec.metasec.p292ov.PglMSConfig;
import com.bytedance.mobsec.metasec.p292ov.PglMSManager;
import com.bytedance.mobsec.metasec.p292ov.PglMSManagerUtils;
import com.bytedance.sdk.component.p328f.C10615e;
import com.bytedance.sdk.component.p328f.C10618g;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0517j;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.p042h.C0796b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.h.b */
/* compiled from: MSSdkImpl */
public class C0506b implements C0505a {

    /* renamed from: b */
    private static volatile boolean f1824b = false;

    /* renamed from: c */
    private static volatile boolean f1825c = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PglMSManager f1826a;

    /* renamed from: d */
    private volatile String f1827d = C0503h.m2281d().mo1603f();

    /* renamed from: e */
    private volatile String f1828e;

    public C0506b() {
        Context a = C0558m.m2663a();
        this.f1828e = C0517j.m2474a(a);
        f1824b = m2335a(this.f1827d, this.f1828e);
    }

    /* renamed from: a */
    private boolean m2335a(String str, String str2) {
        try {
            C10638l.m31238c("mssdk", "Sdk.APP_ID: 1371\n appId: " + str + " \n MS_SDK_LICENCE:" + "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj" + " \n did: " + str2 + " ");
            Context a = C0558m.m2663a();
            PglMSConfig build = new PglMSConfig.Builder("1371", str, "6QsgjKNXt0ThHEOR/wpJGqVuDr4bHw6oKiicVF73p9+zvKfmlFZpi9d4zgrMWd9vbyPsZIdIHuN5cgNZGzmWdjdpJjlERMNPwKHauPaQbfRfY4VRpA5s7BaQ3NqhlpVXhpJcCGkhG0r8GX6Q1ys7HXrrwSLpidXsl992B79+GPi4GB9tgR1CtqsLFzcKbbd+/j76xqkGzAl1p2JxYeZswgj5c/Mg5K2bA7MquHtxWz4N1Tkj", m2338e()).setDeviceID(str2).setClientType(1).setOVRegionType(0).build();
            long currentTimeMillis = System.currentTimeMillis();
            PglMSManagerUtils.init(a, build);
            C0796b.m3985a().mo2607a(Constants.INIT, currentTimeMillis);
            m2337d();
            if (this.f1826a != null) {
                this.f1826a.setDeviceID(str2);
            }
            C10638l.m31238c("mssdk", "init: 成功");
            return true;
        } catch (Throwable th) {
            C10638l.m31238c("mssdk", "init: 失败");
            C10638l.m31236b("MSSdkImpl", "appid 为空，初始化失败！或不包含mssdk模块", th);
            m2339f();
            return false;
        }
    }

    /* renamed from: c */
    private synchronized boolean m2336c() {
        if (!f1824b && f1825c) {
            this.f1827d = C0503h.m2281d().mo1603f();
            this.f1828e = C0517j.m2474a(C0558m.m2663a());
            f1824b = m2335a(this.f1827d, this.f1828e);
        }
        return f1824b;
    }

    /* renamed from: d */
    private void m2337d() {
        if (this.f1826a == null) {
            PglMSManager pglMSManager = PglMSManagerUtils.get("1371");
            this.f1826a = pglMSManager;
            if (pglMSManager != null) {
                pglMSManager.setCollectMode(m2338e());
            }
        }
    }

    /* renamed from: e */
    private int m2338e() {
        int o = C0996u.m4691o();
        if (o == 4 || o == 5) {
            C10638l.m31238c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_USEA");
            return 503;
        }
        C10638l.m31238c("mssdk", "getCollectMode() PglMSConfig.COLLECT_MODE_TIKTOK_NONUSEA");
        return 603;
    }

    /* renamed from: a */
    public void mo1625a(final String str) {
        if (m2336c()) {
            m2337d();
            if (this.f1826a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C10615e.m31159a((C10618g) new C10618g("updateDid") {
                        public void run() {
                            if (C0506b.this.f1826a != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                C0506b.this.f1826a.setDeviceID(str);
                                C0796b.m3985a().mo2607a("setDeviceID", currentTimeMillis);
                            }
                        }
                    });
                } else {
                    this.f1826a.setDeviceID(str);
                }
                C10638l.m31238c("mssdk did: ", str);
            }
        }
    }

    /* renamed from: b */
    public void mo1627b(String str) {
        if (m2336c()) {
            m2337d();
            if (this.f1826a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f1826a.report(str);
                C0796b.m3985a().mo2607a("report", currentTimeMillis);
            }
        }
    }

    /* renamed from: a */
    public String mo1623a() {
        if (!m2336c()) {
            return "";
        }
        m2337d();
        if (this.f1826a == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String token = this.f1826a.getToken();
        C0796b.m3985a().mo2607a("getToken", currentTimeMillis);
        C10638l.m31238c("mssdk", "secDeviceToken: " + token);
        return token;
    }

    /* renamed from: a */
    public Map<String, String> mo1624a(String str, byte[] bArr) {
        if (!m2336c()) {
            return new HashMap();
        }
        m2337d();
        if (this.f1826a == null) {
            return new HashMap();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> featureHash = this.f1826a.getFeatureHash(str, bArr);
        C0796b.m3985a().mo2607a("getFeatureHash", currentTimeMillis);
        return featureHash;
    }

    /* renamed from: b */
    public String mo1626b() {
        try {
            Context a = C0558m.m2663a();
            return m2334a(MessageDigest.getInstance("SHA1").digest(a.getPackageManager().getPackageInfo(a.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    /* renamed from: a */
    private static String m2334a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(bArr.length * 2)];
        for (byte b = 0; b < bArr.length; b = (byte) (b + 1)) {
            byte b2 = bArr[b] & 255;
            int i = b * 2;
            cArr[i] = charArray[b2 >>> 4];
            cArr[i + 1] = charArray[b2 & Ascii.f15551SI];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    private Class m2339f() {
        Class<?> cls = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ov.PglMS");
            f1825c = true;
            C10638l.m31238c("mssdk", "class found");
            return cls;
        } catch (Throwable unused) {
            C10638l.m31238c("mssdk", "class not found ");
            f1825c = false;
            return cls;
        }
    }
}
