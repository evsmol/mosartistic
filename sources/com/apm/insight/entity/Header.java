package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.C6617h;
import com.apm.insight.p178l.C6686p;
import com.apm.insight.p178l.C6688q;
import com.apm.insight.runtime.C6766s;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public final class Header {

    /* renamed from: a */
    private static final String[] f14143a = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d */
    private static String f14144d = null;

    /* renamed from: e */
    private static int f14145e = -1;

    /* renamed from: f */
    private static int f14146f = -1;

    /* renamed from: b */
    private Context f14147b;

    /* renamed from: c */
    private JSONObject f14148c = new JSONObject();

    public Header(Context context) {
        this.f14147b = context;
    }

    /* renamed from: a */
    public static Header m16138a(Context context) {
        Header header = new Header(context);
        header.m16148e(header.mo52042f());
        return header;
    }

    /* renamed from: a */
    public static Header m16139a(Context context, long j) {
        Header header;
        C6766s a = C6766s.m17031a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject a2 = a.mo52315a(j);
        if (a2 == null || a2.length() == 0) {
            header = m16138a(C6617h.m16313g());
            header.mo52039c();
            try {
                header.mo52042f().put("errHeader", 1);
            } catch (Throwable unused) {
            }
        } else {
            header = new Header(C6617h.m16313g());
        }
        m16143b(header);
        header.mo52038a(a2);
        return header;
    }

    /* renamed from: a */
    public static Header m16140a(Header header) {
        addRuntimeHeader(header.mo52042f());
        return header;
    }

    /* renamed from: a */
    public static boolean m16141a() {
        if (f14145e == -1) {
            f14145e = m16150g().contains("64") ? 1 : 0;
        }
        return f14145e == 1;
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        if (jSONObject != null) {
            m16153h(jSONObject);
            m16149f(jSONObject);
            m16151g(jSONObject);
            try {
                jSONObject.put("os", APSAnalytics.OS_NAME);
                jSONObject.put("device_id", C6617h.m16309c().mo52322a());
                jSONObject.put("os_version", m16152h());
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                String str = Build.MODEL;
                String str2 = Build.BRAND;
                if (str == null) {
                    str = str2;
                } else if (str2 != null && !str.contains(str2)) {
                    str = str2 + ' ' + str;
                }
                jSONObject.put("device_model", str);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("cpu_abi", m16150g());
                Context g = C6617h.m16313g();
                String packageName = g.getPackageName();
                jSONObject.put("package", packageName);
                PackageInfo packageInfo = g.getPackageManager().getPackageInfo(packageName, 0);
                if (packageInfo.applicationInfo != null) {
                    int i = packageInfo.applicationInfo.labelRes;
                    jSONObject.put("display_name", i > 0 ? g.getString(i) : g.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            C6598d.m16213a(jSONObject);
        }
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        m16154i(jSONObject);
        m16155j(jSONObject);
    }

    /* renamed from: b */
    public static Header m16142b(Context context) {
        Header a = m16138a(context);
        m16140a(a);
        m16143b(a);
        a.mo52039c();
        a.mo52040d();
        a.mo52041e();
        return a;
    }

    /* renamed from: b */
    public static void m16143b(Header header) {
        if (header != null) {
            addOtherHeader(header.mo52042f());
        }
    }

    /* renamed from: b */
    public static boolean m16144b() {
        if (f14146f == -1) {
            f14146f = m16150g().contains("86") ? 1 : 0;
        }
        return f14146f == 1;
    }

    /* renamed from: b */
    public static boolean m16145b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    /* renamed from: c */
    public static boolean m16146c(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0 || (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    /* renamed from: d */
    public static boolean m16147d(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            String optString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(optString)) {
                return true;
            }
            try {
                return Integer.parseInt(optString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* renamed from: e */
    private void m16148e(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 1030820);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-alpha.0");
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static void m16149f(JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = C6617h.m16313g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            String str = i != 120 ? i != 240 ? i != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", str);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static String m16150g() {
        if (f14144d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f14144d = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
                }
                f14144d = sb.toString();
            } catch (Exception e) {
                C6688q.m16632b((Throwable) e);
                f14144d = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
        }
        return f14144d;
    }

    /* renamed from: g */
    private static void m16151g(JSONObject jSONObject) {
        try {
            String language = C6617h.m16313g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put("language", language);
            }
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put("region", country);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static String m16152h() {
        String str = Build.VERSION.RELEASE;
        if (str.contains(".")) {
            return str;
        }
        return str + ".0";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ all -> 0x0052 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m16153h(org.json.JSONObject r3) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = com.apm.insight.p178l.C6668d.m16500c()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = "MIUI-"
        L_0x000d:
            r0.append(r1)     // Catch:{ all -> 0x0052 }
            goto L_0x0035
        L_0x0011:
            boolean r1 = com.apm.insight.p178l.C6668d.m16502d()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = "FLYME-"
            goto L_0x000d
        L_0x001a:
            java.lang.String r1 = com.apm.insight.p178l.C6668d.m16495a()     // Catch:{ all -> 0x0052 }
            boolean r2 = com.apm.insight.p178l.C6668d.m16496a(r1)     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r2 = "EMUI-"
            r0.append(r2)     // Catch:{ all -> 0x0052 }
        L_0x0029:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x0035
            r0.append(r1)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "-"
            goto L_0x000d
        L_0x0035:
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x0052 }
            r0.append(r1)     // Catch:{ all -> 0x0052 }
            int r1 = r0.length()     // Catch:{ all -> 0x0052 }
            if (r1 <= 0) goto L_0x0049
            java.lang.String r1 = "rom"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0052 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0052 }
        L_0x0049:
            java.lang.String r0 = "rom_version"
            java.lang.String r1 = com.apm.insight.p178l.C6691t.m16641a()     // Catch:{ all -> 0x0052 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0052 }
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.entity.Header.m16153h(org.json.JSONObject):void");
    }

    /* renamed from: i */
    private static void m16154i(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C6686p.m16621a(C6617h.m16313g()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    private static void m16155j(JSONObject jSONObject) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C6617h.m16313g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put("carrier", networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (!TextUtils.isEmpty(networkOperator)) {
                    jSONObject.put("mcc_mnc", networkOperator);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|41) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[Catch:{ all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4 A[Catch:{ all -> 0x00b4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo52037a(java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "manifest_version_code"
            java.lang.String r1 = "version_code"
            java.lang.String r2 = "version_name"
            java.lang.String r3 = "iid"
            if (r11 != 0) goto L_0x000d
            org.json.JSONObject r11 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            return r11
        L_0x000d:
            java.util.Set r4 = r11.entrySet()     // Catch:{ all -> 0x00b4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00b4 }
        L_0x0015:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00b4 }
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00b4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00b4 }
            org.json.JSONObject r6 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r5.getKey()     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00b4 }
            boolean r6 = r6.has(r7)     // Catch:{ all -> 0x00b4 }
            if (r6 != 0) goto L_0x0015
            org.json.JSONObject r6 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            java.lang.Object r7 = r5.getKey()     // Catch:{ all -> 0x00b4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00b4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00b4 }
            r6.put(r7, r5)     // Catch:{ all -> 0x00b4 }
            goto L_0x0015
        L_0x003f:
            java.lang.String[] r4 = f14143a     // Catch:{ all -> 0x00b4 }
            int r5 = r4.length     // Catch:{ all -> 0x00b4 }
            r6 = 0
        L_0x0043:
            if (r6 >= r5) goto L_0x006b
            r7 = r4[r6]     // Catch:{ all -> 0x00b4 }
            boolean r8 = r11.containsKey(r7)     // Catch:{ all -> 0x00b4 }
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r11.get(r7)     // Catch:{ all -> 0x005f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x005f }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x005f }
            org.json.JSONObject r9 = r10.f14148c     // Catch:{ all -> 0x005f }
            r9.put(r7, r8)     // Catch:{ all -> 0x005f }
            goto L_0x0068
        L_0x005f:
            org.json.JSONObject r8 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            java.lang.Object r9 = r11.get(r7)     // Catch:{ all -> 0x00b4 }
            r8.put(r7, r9)     // Catch:{ all -> 0x00b4 }
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x0043
        L_0x006b:
            boolean r4 = r11.containsKey(r1)     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x0088
            boolean r4 = r11.containsKey(r0)     // Catch:{ all -> 0x00b4 }
            if (r4 != 0) goto L_0x0088
            java.lang.Object r1 = r11.get(r1)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0088 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0088 }
            org.json.JSONObject r4 = r10.f14148c     // Catch:{ all -> 0x0088 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0088 }
        L_0x0088:
            boolean r0 = r11.containsKey(r3)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x009e
            org.json.JSONObject r0 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "udid"
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x00b4 }
            r0.put(r1, r4)     // Catch:{ all -> 0x00b4 }
            org.json.JSONObject r0 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            r0.remove(r3)     // Catch:{ all -> 0x00b4 }
        L_0x009e:
            boolean r0 = r11.containsKey(r2)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b4
            org.json.JSONObject r0 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            java.lang.String r1 = "app_version"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x00b4 }
            r0.put(r1, r11)     // Catch:{ all -> 0x00b4 }
            org.json.JSONObject r11 = r10.f14148c     // Catch:{ all -> 0x00b4 }
            r11.remove(r2)     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            org.json.JSONObject r11 = r10.f14148c
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.entity.Header.mo52037a(java.util.Map):org.json.JSONObject");
    }

    /* renamed from: a */
    public JSONObject mo52038a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f14148c;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.f14148c.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return this.f14148c;
    }

    /* renamed from: c */
    public JSONObject mo52039c() {
        return mo52037a(C6617h.m16297a().mo52290a());
    }

    /* renamed from: d */
    public JSONObject mo52040d() {
        try {
            this.f14148c.put("device_id", C6617h.m16309c().mo52322a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f14148c;
    }

    /* renamed from: e */
    public JSONObject mo52041e() {
        try {
            long f = C6617h.m16297a().mo52295f();
            if (f > 0) {
                this.f14148c.put("user_id", f);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f14148c;
    }

    /* renamed from: f */
    public JSONObject mo52042f() {
        return this.f14148c;
    }
}
