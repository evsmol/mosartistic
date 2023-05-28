package com.bytedance.sdk.openadsdk.core.p025i;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10266a;
import com.bytedance.sdk.component.adexpress.p294a.p296b.C10268b;
import com.bytedance.sdk.component.adexpress.p294a.p297c.C10279b;
import com.bytedance.sdk.component.utils.C10632i;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10642o;
import com.bytedance.sdk.component.utils.C10647t;
import com.bytedance.sdk.component.utils.C10648u;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.i.f */
/* compiled from: TTSdkSettings */
public class C0516f implements C0510b {

    /* renamed from: a */
    public static String f1877a = null;

    /* renamed from: b */
    public static String f1878b = "IABTCF_TCString";

    /* renamed from: c */
    public static String f1879c;

    /* renamed from: d */
    public static String f1880d;

    /* renamed from: e */
    public static String f1881e = (C10647t.m31276a(C0558m.m2663a(), "tt_feedback_thank_text") + "\n" + C10647t.m31276a(C0558m.m2663a(), "tt_feedback_experience_text"));

    /* renamed from: f */
    static ArrayList<String> f1882f;

    /* renamed from: n */
    private static final String f1883n = C0996u.m4685m();

    /* renamed from: p */
    private static final String f1884p = null;

    /* renamed from: q */
    private static final String f1885q = null;

    /* renamed from: r */
    private static final String f1886r = null;

    /* renamed from: A */
    private int f1887A = Integer.MAX_VALUE;

    /* renamed from: B */
    private int f1888B = Integer.MAX_VALUE;

    /* renamed from: C */
    private long f1889C = 0;

    /* renamed from: D */
    private Set<String> f1890D = Collections.synchronizedSet(new HashSet());

    /* renamed from: E */
    private Set<String> f1891E = Collections.synchronizedSet(new HashSet());

    /* renamed from: F */
    private int f1892F = Integer.MAX_VALUE;

    /* renamed from: G */
    private int f1893G = Integer.MAX_VALUE;

    /* renamed from: H */
    private long f1894H = 2147483647L;

    /* renamed from: I */
    private int f1895I = Integer.MAX_VALUE;

    /* renamed from: J */
    private int f1896J = Integer.MAX_VALUE;

    /* renamed from: K */
    private int f1897K = Integer.MAX_VALUE;

    /* renamed from: L */
    private int f1898L = Integer.MAX_VALUE;

    /* renamed from: M */
    private String f1899M;

    /* renamed from: N */
    private String f1900N;

    /* renamed from: O */
    private String f1901O;

    /* renamed from: P */
    private int f1902P = Integer.MAX_VALUE;

    /* renamed from: Q */
    private int f1903Q;

    /* renamed from: R */
    private String f1904R;

    /* renamed from: S */
    private int f1905S = Integer.MAX_VALUE;

    /* renamed from: T */
    private String f1906T;

    /* renamed from: U */
    private int f1907U;

    /* renamed from: V */
    private int f1908V;

    /* renamed from: W */
    private String f1909W = null;

    /* renamed from: X */
    private String f1910X = null;

    /* renamed from: Y */
    private boolean f1911Y = false;

    /* renamed from: Z */
    private String f1912Z = "";

    /* renamed from: aa */
    private int f1913aa = Integer.MAX_VALUE;

    /* renamed from: ab */
    private int f1914ab = Integer.MAX_VALUE;

    /* renamed from: ac */
    private int f1915ac = Integer.MAX_VALUE;

    /* renamed from: ad */
    private int f1916ad = Integer.MAX_VALUE;

    /* renamed from: ae */
    private int f1917ae = Integer.MAX_VALUE;

    /* renamed from: af */
    private int f1918af = Integer.MAX_VALUE;

    /* renamed from: ag */
    private int f1919ag = Integer.MAX_VALUE;

    /* renamed from: ah */
    private int f1920ah = Integer.MAX_VALUE;

    /* renamed from: ai */
    private final Set<String> f1921ai = Collections.synchronizedSet(new HashSet());

    /* renamed from: aj */
    private volatile boolean f1922aj = false;

    /* renamed from: ak */
    private final C10648u f1923ak = C10648u.m31293a("tt_sdk_settings", C0558m.m2663a());

    /* renamed from: al */
    private int f1924al = Integer.MAX_VALUE;

    /* renamed from: am */
    private float f1925am = 2.14748365E9f;

    /* renamed from: an */
    private int f1926an = Integer.MAX_VALUE;

    /* renamed from: ao */
    private int f1927ao = Integer.MAX_VALUE;

    /* renamed from: ap */
    private int f1928ap = 30;

    /* renamed from: g */
    private int f1929g = Integer.MAX_VALUE;

    /* renamed from: h */
    private Map<String, C0509a> f1930h = new HashMap();

    /* renamed from: i */
    private String f1931i;

    /* renamed from: j */
    private String f1932j;

    /* renamed from: k */
    private Set<String> f1933k = new HashSet();

    /* renamed from: l */
    private String f1934l;

    /* renamed from: m */
    private Set<String> f1935m = Collections.synchronizedSet(new HashSet());

    /* renamed from: o */
    private Set<String> f1936o = Collections.synchronizedSet(new HashSet());

    /* renamed from: s */
    private String f1937s;

    /* renamed from: t */
    private int f1938t = Integer.MAX_VALUE;

    /* renamed from: u */
    private int f1939u = Integer.MAX_VALUE;

    /* renamed from: v */
    private String f1940v;

    /* renamed from: w */
    private String f1941w;

    /* renamed from: x */
    private String f1942x;

    /* renamed from: y */
    private String f1943y;

    /* renamed from: z */
    private int f1944z = Integer.MAX_VALUE;

    /* renamed from: a */
    private int m2399a(boolean z) {
        return z ? 20 : 5;
    }

    /* renamed from: k */
    private static boolean m2406k(int i) {
        return i == 1 || i == 2;
    }

    static {
        try {
            f1879c = C10647t.m31276a(C0558m.m2663a(), "tt_txt_skip");
            f1880d = C10647t.m31276a(C0558m.m2663a(), "tt_feedback_submit_text");
            f1882f = new ArrayList<>(Arrays.asList(new String[]{"ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant"}));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:53|54|(1:56)|57|(4:59|60|(2:62|63)|109)|68|(3:72|(2:75|73)|110)|76|(3:80|(2:83|81)|111)|84|(3:86|87|(2:89|(3:91|(2:93|112)(1:113)|94)))|95|96|97|98) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0594 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo1657a() {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            r2 = 1
            r1.f1922aj = r2     // Catch:{ all -> 0x05b6 }
            boolean r3 = com.bytedance.sdk.openadsdk.multipro.C0934b.m4334c()     // Catch:{ all -> 0x05b6 }
            r10 = 3000(0xbb8, float:4.204E-42)
            r11 = 5
            r12 = 3600(0xe10, float:5.045E-42)
            r13 = 50
            r14 = 10000(0x2710, double:4.9407E-320)
            r5 = 30
            r4 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            if (r3 == 0) goto L_0x02ec
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1937s = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "duration"
            long r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4396a((java.lang.String) r3, (java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f1894H = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f1895I = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_network"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1938t = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "download_config_dl_size"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f1939u = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "vbtt"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f1896J = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_template"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f1897K = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1934l = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1940v = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1941w = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1942x = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1943y = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_load_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1944z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "splash_check_type"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1887A = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "if_both_open"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1892F = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "support_tnc"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1893G = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1912Z = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f1913aa = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1926an = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1914ab = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1931i = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1932j = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_list_control"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1888B = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4396a((java.lang.String) r3, (java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1889C = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ads_url"
            java.lang.String r9 = f1885q     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1899M = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "app_log_url"
            java.lang.String r9 = f1884p     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1900N = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "apm_url"
            java.lang.String r9 = ""
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1901O = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1902P = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1903Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C0503h.m2281d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f1902P     // Catch:{ all -> 0x05b6 }
            r3.mo1596d((int) r8)     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f1886r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1904R = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1906T = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "ivrv_downward"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1908V = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1905S = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f1883n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1909W = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "dc"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1910X = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1915ac = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1916ad = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1917ae = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1918af = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1919ag = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1920ah = r3     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r8 = "privacy_fields_allowed"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "webview_cache_count"
            r10 = 20
            int r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r8, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f1898L = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f1936o     // Catch:{ all -> 0x05b6 }
            if (r8 == 0) goto L_0x01f4
            java.util.Set<java.lang.String> r8 = r1.f1936o     // Catch:{ all -> 0x05b6 }
            r8.clear()     // Catch:{ all -> 0x05b6 }
        L_0x01f4:
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "gecko_hosts"
            java.util.Set r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4411b((java.lang.String) r8, (java.lang.String) r9, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1936o = r8     // Catch:{ all -> 0x05b6 }
            java.util.Set r8 = r1.mo1674a((java.util.Set<java.lang.String>) r8)     // Catch:{ all -> 0x05b6 }
            r1.f1936o = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "global_rate"
            r10 = 1065353216(0x3f800000, float:1.0)
            float r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4394a((java.lang.String) r8, (java.lang.String) r9, (float) r10)     // Catch:{ all -> 0x05b6 }
            r1.f1925am = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "sp_key_if_sp_cache"
            int r8 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r8, (java.lang.String) r9, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1929g = r8     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tt_sdk_settings"
            java.lang.String r9 = "landingpage_new_style"
            int r6 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r8, (java.lang.String) r9, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1927ao = r6     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x024c
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0247 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0247 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0247 }
            java.util.Set<java.lang.String> r8 = r1.f1921ai     // Catch:{ JSONException -> 0x0247 }
            r8.clear()     // Catch:{ JSONException -> 0x0247 }
            r8 = 0
        L_0x0239:
            if (r8 >= r3) goto L_0x024c
            java.util.Set<java.lang.String> r9 = r1.f1921ai     // Catch:{ JSONException -> 0x0247 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0247 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0247 }
            int r8 = r8 + 1
            goto L_0x0239
        L_0x0247:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x024c:
            java.util.Set<java.lang.String> r3 = r1.f1890D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4411b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0277
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0277
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0265:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0277
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f1890D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0265
        L_0x0277:
            java.util.Set<java.lang.String> r3 = r1.f1891E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4411b((java.lang.String) r3, (java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x02a2
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02a2
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0290:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x02a2
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f1891E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0290
        L_0x02a2:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4410b((java.lang.String) r3, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x02d6
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02d6 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x02d6 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x02d6 }
            if (r3 <= 0) goto L_0x02d6
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f1930h     // Catch:{ Exception -> 0x02d6 }
            r7.clear()     // Catch:{ Exception -> 0x02d6 }
        L_0x02c0:
            if (r4 >= r3) goto L_0x02d6
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x02d6 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m2401b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x02d6 }
            if (r7 == 0) goto L_0x02d3
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f1930h     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r9 = r7.f1839a     // Catch:{ Exception -> 0x02d6 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x02d6 }
        L_0x02d3:
            int r4 = r4 + 1
            goto L_0x02c0
        L_0x02d6:
            java.lang.String r3 = "tt_sdk_settings"
            java.lang.String r4 = "read_video_from_cache"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r3, (java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1924al = r2     // Catch:{ all -> 0x05b6 }
            java.lang.String r2 = "tt_sdk_settings"
            java.lang.String r3 = "blank_detect_rate"
            int r2 = com.bytedance.sdk.openadsdk.multipro.p055d.C0947a.m4395a((java.lang.String) r2, (java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f1928ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x02ec:
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "xpath"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1937s = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "duration"
            long r8 = r3.mo64281b((java.lang.String) r8, (long) r14)     // Catch:{ all -> 0x05b6 }
            r1.f1894H = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r13)     // Catch:{ all -> 0x05b6 }
            r1.f1895I = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_network"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1938t = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "download_config_dl_size"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f1939u = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_template"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r12)     // Catch:{ all -> 0x05b6 }
            r1.f1897K = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_version"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1940v = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ab_test_param"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1941w = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "vbtt"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r11)     // Catch:{ all -> 0x05b6 }
            r1.f1896J = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "template_ids"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1934l = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "pyload_h5"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1942x = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "playableLoadH5Url"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1943y = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_load_type"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1944z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "splash_check_type"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1887A = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "if_both_open"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1892F = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "support_tnc"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1893G = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "tpl_infos"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1931i = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "insert_js_config"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1932j = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_list_control"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1888B = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "force_language"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1912Z = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "fetch_tpl_timeout_ctrl"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r10)     // Catch:{ all -> 0x05b6 }
            r1.f1913aa = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "disable_rotate_banner_on_dislike"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1926an = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "max_tpl_cnts"
            r9 = 100
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1914ab = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "hit_app_list_time"
            r9 = 0
            long r8 = r3.mo64281b((java.lang.String) r8, (long) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1889C = r8     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ads_url"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1899M = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "app_log_url"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1900N = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "apm_url"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1901O = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "coppa"
            r9 = -99
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1902P = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ccpa"
            r9 = -1
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1903Q = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.openadsdk.core.h r3 = com.bytedance.sdk.openadsdk.core.C0503h.m2281d()     // Catch:{ all -> 0x05b6 }
            int r8 = r1.f1902P     // Catch:{ all -> 0x05b6 }
            r3.mo1596d((int) r8)     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "policy_url"
            java.lang.String r9 = f1886r     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1904R = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "consent_url"
            java.lang.String r9 = "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1906T = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "ivrv_downward"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1908V = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dyn_draw_engine_url"
            java.lang.String r9 = f1883n     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = r3.mo64282b((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1909W = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "dc"
            java.lang.String r3 = r3.mo64271a(r8)     // Catch:{ all -> 0x05b6 }
            r1.f1910X = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "isGdprUser"
            r9 = -1
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1905S = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_ad_enable"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1915ac = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_personalized_ad"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1916ad = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sladar_enable"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1917ae = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_app_log_enable"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1918af = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_sec_enable"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1919ag = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "privacy_debug_unlock"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1920ah = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r3 = r1.f1936o     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x04aa
            java.util.Set<java.lang.String> r3 = r1.f1936o     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
        L_0x04aa:
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "gecko_hosts"
            java.util.Set r3 = r3.mo64283b((java.lang.String) r8, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            r1.f1936o = r3     // Catch:{ all -> 0x05b6 }
            java.util.Set r3 = r1.mo1674a((java.util.Set<java.lang.String>) r3)     // Catch:{ all -> 0x05b6 }
            r1.f1936o = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "global_rate"
            r9 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.mo64278b((java.lang.String) r8, (float) r9)     // Catch:{ all -> 0x05b6 }
            r1.f1925am = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "sp_key_if_sp_cache"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1929g = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r8 = "landingpage_new_style"
            int r3 = r3.mo64280b((java.lang.String) r8, (int) r6)     // Catch:{ all -> 0x05b6 }
            r1.f1927ao = r3     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "privacy_fields_allowed"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x050a
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0505 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0505 }
            int r3 = r6.length()     // Catch:{ JSONException -> 0x0505 }
            java.util.Set<java.lang.String> r8 = r1.f1921ai     // Catch:{ JSONException -> 0x0505 }
            r8.clear()     // Catch:{ JSONException -> 0x0505 }
            r8 = 0
        L_0x04f7:
            if (r8 >= r3) goto L_0x050a
            java.util.Set<java.lang.String> r9 = r1.f1921ai     // Catch:{ JSONException -> 0x0505 }
            java.lang.String r10 = r6.getString(r8)     // Catch:{ JSONException -> 0x0505 }
            r9.add(r10)     // Catch:{ JSONException -> 0x0505 }
            int r8 = r8 + 1
            goto L_0x04f7
        L_0x0505:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()     // Catch:{ all -> 0x05b6 }
        L_0x050a:
            java.util.Set<java.lang.String> r3 = r1.f1890D     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "hit_app_list_data"
            java.util.Set r3 = r3.mo64283b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0535
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0535
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x0523:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0535
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f1890D     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x0523
        L_0x0535:
            java.util.Set<java.lang.String> r3 = r1.f1891E     // Catch:{ all -> 0x05b6 }
            r3.clear()     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "scheme_list_data"
            java.util.Set r3 = r3.mo64283b((java.lang.String) r6, (java.util.Set<java.lang.String>) r7)     // Catch:{ all -> 0x05b6 }
            if (r3 == 0) goto L_0x0560
            boolean r6 = r3.isEmpty()     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0560
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x05b6 }
        L_0x054e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x05b6 }
            if (r6 == 0) goto L_0x0560
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x05b6 }
            java.util.Set<java.lang.String> r8 = r1.f1891E     // Catch:{ all -> 0x05b6 }
            r8.add(r6)     // Catch:{ all -> 0x05b6 }
            goto L_0x054e
        L_0x0560:
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r6 = "ad_slot_conf"
            java.lang.String r3 = r3.mo64282b((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x05b6 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x05b6 }
            if (r6 != 0) goto L_0x0594
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x0594 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0594 }
            int r3 = r6.length()     // Catch:{ Exception -> 0x0594 }
            if (r3 <= 0) goto L_0x0594
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r7 = r1.f1930h     // Catch:{ Exception -> 0x0594 }
            r7.clear()     // Catch:{ Exception -> 0x0594 }
        L_0x057e:
            if (r4 >= r3) goto L_0x0594
            org.json.JSONObject r7 = r6.optJSONObject(r4)     // Catch:{ Exception -> 0x0594 }
            com.bytedance.sdk.openadsdk.core.i.a r7 = m2401b((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x0594 }
            if (r7 == 0) goto L_0x0591
            java.util.Map<java.lang.String, com.bytedance.sdk.openadsdk.core.i.a> r8 = r1.f1930h     // Catch:{ Exception -> 0x0594 }
            java.lang.String r9 = r7.f1839a     // Catch:{ Exception -> 0x0594 }
            r8.put(r9, r7)     // Catch:{ Exception -> 0x0594 }
        L_0x0591:
            int r4 = r4 + 1
            goto L_0x057e
        L_0x0594:
            com.bytedance.sdk.component.utils.u r3 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r4 = "read_video_from_cache"
            int r2 = r3.mo64280b((java.lang.String) r4, (int) r2)     // Catch:{ all -> 0x05b6 }
            r1.f1924al = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "webview_cache_count"
            r4 = 20
            int r2 = r2.mo64280b((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x05b6 }
            r1.f1898L = r2     // Catch:{ all -> 0x05b6 }
            com.bytedance.sdk.component.utils.u r2 = r1.f1923ak     // Catch:{ all -> 0x05b6 }
            java.lang.String r3 = "blank_detect_rate"
            int r2 = r2.mo64280b((java.lang.String) r3, (int) r5)     // Catch:{ all -> 0x05b6 }
            r1.f1928ap = r2     // Catch:{ all -> 0x05b6 }
            monitor-exit(r16)
            return
        L_0x05b6:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p025i.C0516f.mo1657a():void");
    }

    /* renamed from: b */
    private static C0509a m2401b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return null;
        }
        String optString = jSONObject2.optString("code_id");
        int optInt = jSONObject2.optInt("auto_play", 1);
        int optInt2 = jSONObject2.optInt("voice_control", 1);
        int optInt3 = jSONObject2.optInt("rv_preload", 2);
        int optInt4 = jSONObject2.optInt("nv_preload", 1);
        int optInt5 = jSONObject2.optInt("proportion_watching", 100);
        int optInt6 = jSONObject2.optInt("skip_time_displayed", 0);
        int optInt7 = jSONObject2.optInt("video_skip_result", 2);
        int optInt8 = jSONObject2.optInt("reg_creative_control", 1);
        int optInt9 = jSONObject2.optInt("play_bar_show_time", 3);
        int optInt10 = jSONObject2.optInt("rv_skip_time", -1);
        int optInt11 = jSONObject2.optInt("voice_control", 2);
        int optInt12 = jSONObject2.optInt("if_show_win", 1);
        int optInt13 = jSONObject2.optInt("sp_preload", 2);
        int optInt14 = jSONObject2.optInt("stop_time", 1500);
        int optInt15 = jSONObject2.optInt("native_playable_delay", 2);
        int optInt16 = jSONObject2.optInt("time_out_control", -1);
        int optInt17 = jSONObject2.optInt("playable_close_time", -1);
        int optInt18 = jSONObject2.optInt("playable_reward_type", 0);
        int optInt19 = jSONObject2.optInt("reward_is_callback", 0);
        int optInt20 = jSONObject2.optInt("iv_skip_time", 5);
        JSONArray optJSONArray = jSONObject2.optJSONArray("parent_tpl_ids");
        int i = optInt20;
        int optInt21 = jSONObject2.optInt("slot_type", 2);
        boolean optBoolean = jSONObject2.optBoolean("close_on_click", false);
        int optInt22 = jSONObject2.optInt("allow_system_back", 0);
        int optInt23 = jSONObject2.optInt("splash_skip_time", 0);
        int optInt24 = jSONObject2.optInt("splash_image_count_down_time", 5);
        if (!m2406k(optInt2)) {
            optInt2 = 1;
        }
        return C0509a.m2346a().mo1631a(optString).mo1643k(optInt).mo1644l(optInt2).mo1645m(optInt3).mo1646n(optInt4).mo1647o(optInt5).mo1648p(optInt6).mo1649q(optInt7).mo1650r(optInt8).mo1642j(optInt9).mo1641i(optInt10).mo1640h(!m2406k(optInt11) ? 1 : optInt11).mo1651s(optInt12).mo1637e(optInt13).mo1638f(optInt14).mo1639g(optInt15).mo1636d(optInt16).mo1634b(optInt18).mo1635c(optInt19).mo1630a(optInt17).mo1652t(optInt21).mo1653u(i).mo1632a(optJSONArray).mo1633a(optBoolean).mo1654v(optInt22).mo1655w(optInt23).mo1656x(optInt24);
    }

    /* renamed from: b */
    public int mo1677b() {
        if (this.f1914ab == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1914ab = C0947a.m4395a("tt_sdk_settings", "max_tpl_cnts", 100);
            } else {
                this.f1914ab = this.f1923ak.mo64280b("max_tpl_cnts", 100);
            }
        }
        return this.f1914ab;
    }

    /* renamed from: a */
    public void mo1658a(JSONObject jSONObject) {
        String str;
        this.f1927ao = jSONObject.optInt("lp_new_style", Integer.MAX_VALUE);
        int optInt = jSONObject.optInt("blank_detect_rate", 30);
        this.f1928ap = optInt;
        if (optInt < 0 || optInt > 100) {
            this.f1928ap = 30;
        }
        this.f1937s = jSONObject.optString("xpath");
        JSONObject optJSONObject = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject != null) {
            this.f1894H = optJSONObject.optLong(IronSourceConstants.EVENTS_DURATION) * 1000;
            this.f1895I = optJSONObject.optInt(AppLovinMediationProvider.MAX);
        }
        this.f1896J = jSONObject.optInt("vbtt", 5);
        this.f1897K = jSONObject.optInt("fetch_tpl_interval", 3600);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("abtest");
        if (optJSONObject2 != null) {
            this.f1940v = optJSONObject2.optString("version");
            this.f1941w = optJSONObject2.optString("param");
        } else {
            m2398J();
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject3 != null) {
            this.f1925am = (float) optJSONObject3.optDouble("global_rate", 1.0d);
        }
        this.f1942x = jSONObject.optString("pyload_h5");
        this.f1943y = jSONObject.optString("pure_pyload_h5");
        this.f1899M = jSONObject.optString("ads_url");
        this.f1900N = jSONObject.optString("app_log_url");
        this.f1901O = jSONObject.optString("apm_url");
        this.f1902P = jSONObject.optInt("coppa", -99);
        this.f1903Q = jSONObject.optInt("ccpa", -1);
        C0503h.m2281d().mo1596d(this.f1902P);
        this.f1904R = jSONObject.optString("privacy_url", f1886r);
        this.f1906T = jSONObject.optString("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
        this.f1907U = jSONObject.optInt("network_module", 1);
        this.f1908V = jSONObject.optInt("ivrv_downward", 0);
        this.f1910X = jSONObject.optString("dc");
        m2402c(jSONObject);
        m2403d(jSONObject);
        this.f1944z = m2404e(jSONObject);
        C10638l.m31242e("splashLoad", "setting-》mSplashLoadType=" + this.f1944z);
        this.f1887A = m2405f(jSONObject);
        C10638l.m31242e("splashLoad", "setting-》mSplashCheckType=" + this.f1887A);
        this.f1892F = jSONObject.optInt("if_both_open", 0);
        this.f1893G = jSONObject.optInt("support_tnc", 1);
        this.f1932j = jSONObject.optString("insert_js_config", "");
        this.f1888B = jSONObject.optInt("al", 0);
        this.f1914ab = jSONObject.optInt("max_tpl_cnts", 100);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject4 != null) {
            this.f1912Z = optJSONObject4.optString("force_language");
            this.f1913aa = optJSONObject4.optInt("fetch_tpl_timeout_ctrl", 3000);
            this.f1926an = optJSONObject4.optInt("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            this.f1929g = optJSONObject4.optInt("if_sp_cache", 0);
            this.f1898L = optJSONObject4.optInt("webview_cache_count", 20);
            try {
                this.f1936o.clear();
                JSONArray optJSONArray = optJSONObject4.optJSONArray("gecko_hosts");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f1936o.add(optJSONArray.getString(i));
                    }
                }
                this.f1936o = mo1674a(this.f1936o);
            } catch (Throwable th) {
                C10638l.m31234b("GeckoLog: settings json error " + th);
            }
        }
        this.f1889C = System.currentTimeMillis();
        this.f1890D.clear();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("spam_app_list");
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.f1890D.add(optString);
                }
            }
        }
        this.f1891E.clear();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("scheme_check_list");
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String optString2 = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f1891E.add(optString2);
                }
            }
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("download_config");
        if (optJSONObject5 != null) {
            this.f1938t = optJSONObject5.optInt("dl_network", 1);
            this.f1939u = optJSONObject5.optInt("dl_size", 30);
        }
        this.f1924al = jSONObject.optInt("read_video_from_cache", 1);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("ad_slot_conf_list");
        if (optJSONArray4 != null) {
            str = optJSONArray4.toString();
            int length3 = optJSONArray4.length();
            if (length3 > 0) {
                this.f1930h.clear();
                for (int i4 = 0; i4 < length3; i4++) {
                    C0509a b = m2401b(optJSONArray4.optJSONObject(i4));
                    if (b != null) {
                        this.f1930h.put(b.f1839a, b);
                    }
                }
            }
        } else {
            str = null;
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            this.f1915ac = optJSONObject6.optInt("ad_enable", Integer.MAX_VALUE);
            this.f1916ad = optJSONObject6.optInt("personalized_ad", Integer.MAX_VALUE);
            this.f1917ae = optJSONObject6.optInt("sladar_enable", Integer.MAX_VALUE);
            this.f1918af = optJSONObject6.optInt("app_log_enable", Integer.MAX_VALUE);
            this.f1919ag = optJSONObject6.optInt("sec_enable", Integer.MAX_VALUE);
            this.f1920ah = optJSONObject6.optInt("debug_unlock", Integer.MAX_VALUE);
            String optString3 = optJSONObject6.optString("fields_allowed", "");
            if (!TextUtils.isEmpty(optString3)) {
                try {
                    JSONArray jSONArray = new JSONArray(optString3);
                    int length4 = jSONArray.length();
                    this.f1921ai.clear();
                    for (int i5 = 0; i5 < length4; i5++) {
                        this.f1921ai.add(jSONArray.getString(i5));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f1921ai.clear();
            }
        } else {
            this.f1915ac = Integer.MAX_VALUE;
            this.f1916ad = Integer.MAX_VALUE;
            this.f1917ae = Integer.MAX_VALUE;
            this.f1918af = Integer.MAX_VALUE;
            this.f1919ag = Integer.MAX_VALUE;
            this.f1920ah = Integer.MAX_VALUE;
            this.f1921ai.clear();
        }
        m2400a(str, (String) null);
        mo1675a((Boolean) true);
        this.f1911Y = true;
    }

    /* renamed from: J */
    private void m2398J() {
        this.f1941w = null;
        this.f1940v = null;
        if (C0934b.m4334c()) {
            C0947a.m4412b("tt_sdk_settings", "ab_test_version");
            C0947a.m4412b("tt_sdk_settings", "ab_test_param");
            return;
        }
        this.f1923ak.mo64285c("ab_test_version");
        this.f1923ak.mo64285c("ab_test_param");
    }

    /* renamed from: c */
    private void m2402c(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            if (C0934b.m4334c()) {
                str = C0947a.m4410b("tt_sdk_settings", "dyn_draw_engine_url", f1883n);
            } else {
                str = this.f1923ak.mo64282b("dyn_draw_engine_url", f1883n);
            }
            this.f1909W = jSONObject.optString("dyn_draw_engine_url", f1883n);
            C10638l.m31242e("TemplateManager", "settinng---TTDynamic.init().....oldDynDrawEngineUrl=" + str);
            C10638l.m31242e("TemplateManager", "settinng---TTDynamic.init().....newmDynDrawEngineUrl=" + this.f1909W);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f1909W) && !this.f1909W.equals(str)) {
                C10638l.m31235b("TemplateManager", "Reinitialize the template TTDynamic.init().....");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C10268b.m29502a().mo63105g();
                C10268b.m29502a().mo63101b(false);
                C10266a.m29496b();
                C10268b.m29502a().mo63100b();
            }
        }
    }

    /* renamed from: a */
    public int mo1672a(String str) {
        if (str == null) {
            return 0;
        }
        return C0558m.m2673h().mo1711n(String.valueOf(str)).f1856r;
    }

    /* renamed from: d */
    private void m2403d(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("is_gdpr_user", -1);
        this.f1905S = optInt;
        if (optInt != -1 && optInt != 1 && optInt != 0) {
            this.f1905S = -1;
        }
    }

    /* renamed from: e */
    private int m2404e(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_load_type", 1);
        this.f1944z = optInt;
        if (optInt == 0 || optInt == 1 || optInt == 2 || optInt == 3) {
            return this.f1944z;
        }
        return 1;
    }

    /* renamed from: f */
    private int m2405f(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("splash_check_type", 1);
        this.f1887A = optInt;
        if (optInt == 0 || optInt == 1) {
            return this.f1887A;
        }
        return 1;
    }

    /* renamed from: a */
    private void m2400a(String str, String str2) {
        String str3 = str;
        String str4 = "scheme_list_data";
        String str5 = "hit_app_list_data";
        String str6 = "hit_app_list_time";
        String str7 = "disable_rotate_banner_on_dislike";
        String str8 = "fetch_tpl_timeout_ctrl";
        String str9 = "max_tpl_cnts";
        String str10 = "app_list_control";
        if (C0934b.m4334c()) {
            String str11 = "privacy_fields_allowed";
            C0947a.m4404a("tt_sdk_settings", "xpath", this.f1937s);
            C0947a.m4403a("tt_sdk_settings", IronSourceConstants.EVENTS_DURATION, Long.valueOf(this.f1894H));
            C0947a.m4402a("tt_sdk_settings", AppLovinMediationProvider.MAX, Integer.valueOf(this.f1895I));
            C0947a.m4402a("tt_sdk_settings", "download_config_dl_network", Integer.valueOf(this.f1938t));
            C0947a.m4402a("tt_sdk_settings", "download_config_dl_size", Integer.valueOf(this.f1939u));
            C0947a.m4402a("tt_sdk_settings", "vbtt", Integer.valueOf(this.f1896J));
            C0947a.m4402a("tt_sdk_settings", "fetch_template", Integer.valueOf(this.f1897K));
            C0947a.m4402a("tt_sdk_settings", "splash_load_type", Integer.valueOf(this.f1944z));
            C0947a.m4402a("tt_sdk_settings", "splash_check_type", Integer.valueOf(this.f1887A));
            C0947a.m4402a("tt_sdk_settings", "if_both_open", Integer.valueOf(this.f1892F));
            C0947a.m4402a("tt_sdk_settings", "support_tnc", Integer.valueOf(this.f1893G));
            C0947a.m4404a("tt_sdk_settings", "insert_js_config", this.f1932j);
            C0947a.m4404a("tt_sdk_settings", "pyload_h5", this.f1942x);
            C0947a.m4404a("tt_sdk_settings", "playableLoadH5Url", this.f1943y);
            C0947a.m4402a("tt_sdk_settings", str10, Integer.valueOf(this.f1888B));
            C0947a.m4402a("tt_sdk_settings", str9, Integer.valueOf(this.f1914ab));
            C0947a.m4402a("tt_sdk_settings", str8, Integer.valueOf(this.f1913aa));
            C0947a.m4402a("tt_sdk_settings", str7, Integer.valueOf(this.f1926an));
            C0947a.m4403a("tt_sdk_settings", str6, Long.valueOf(this.f1889C));
            C0947a.m4405a("tt_sdk_settings", str5, this.f1890D);
            C0947a.m4405a("tt_sdk_settings", str4, this.f1891E);
            C0947a.m4404a("tt_sdk_settings", "ads_url", this.f1899M);
            C0947a.m4404a("tt_sdk_settings", "app_log_url", this.f1900N);
            C0947a.m4404a("tt_sdk_settings", "apm_url", this.f1901O);
            C0947a.m4402a("tt_sdk_settings", "coppa", Integer.valueOf(this.f1902P));
            C0947a.m4402a("tt_sdk_settings", "ccpa", Integer.valueOf(this.f1903Q));
            C0947a.m4404a("tt_sdk_settings", "policy_url", this.f1904R);
            C0947a.m4404a("tt_sdk_settings", "consent_url", this.f1906T);
            C0947a.m4402a("tt_sdk_settings", "ivrv_downward", Integer.valueOf(this.f1908V));
            C0947a.m4404a("tt_sdk_settings", "dyn_draw_engine_url", this.f1909W);
            C0947a.m4404a("tt_sdk_settings", "dc", this.f1910X);
            C0947a.m4402a("tt_sdk_settings", "isGdprUser", Integer.valueOf(this.f1905S));
            C0947a.m4402a("tt_sdk_settings", "sp_key_if_sp_cache", Integer.valueOf(this.f1929g));
            C0947a.m4402a("tt_sdk_settings", "landingpage_new_style", Integer.valueOf(this.f1927ao));
            if (!TextUtils.isEmpty(this.f1912Z) && f1882f.contains(this.f1912Z)) {
                C0947a.m4404a("tt_sdk_settings", "force_language", this.f1912Z);
            }
            String str12 = this.f1940v;
            if (str12 != null) {
                C0947a.m4404a("tt_sdk_settings", "ab_test_version", str12);
            }
            String str13 = this.f1941w;
            if (str13 != null) {
                C0947a.m4404a("tt_sdk_settings", "ab_test_param", str13);
            }
            if (!TextUtils.isEmpty(str)) {
                C0947a.m4404a("tt_sdk_settings", "ad_slot_conf", str);
            }
            if (!TextUtils.isEmpty(this.f1934l)) {
                C0947a.m4404a("tt_sdk_settings", "template_ids", this.f1934l);
            }
            if (!TextUtils.isEmpty(this.f1931i)) {
                C0947a.m4404a("tt_sdk_settings", "tpl_infos", this.f1931i);
            }
            C0947a.m4402a("tt_sdk_settings", "privacy_ad_enable", Integer.valueOf(this.f1915ac));
            C0947a.m4402a("tt_sdk_settings", "privacy_personalized_ad", Integer.valueOf(this.f1916ad));
            C0947a.m4402a("tt_sdk_settings", "privacy_sladar_enable", Integer.valueOf(this.f1917ae));
            C0947a.m4402a("tt_sdk_settings", "privacy_app_log_enable", Integer.valueOf(this.f1918af));
            C0947a.m4402a("tt_sdk_settings", "privacy_sec_enable", Integer.valueOf(this.f1919ag));
            C0947a.m4402a("tt_sdk_settings", "privacy_debug_unlock", Integer.valueOf(this.f1920ah));
            C0947a.m4405a("tt_sdk_settings", "gecko_hosts", this.f1936o);
            if (this.f1921ai.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f1921ai) {
                    jSONArray.put(put);
                }
                C0947a.m4404a("tt_sdk_settings", str11, jSONArray.toString());
            } else {
                C0947a.m4404a("tt_sdk_settings", str11, "");
            }
            C0947a.m4402a("tt_sdk_settings", "read_video_from_cache", Integer.valueOf(this.f1924al));
            C0947a.m4401a("tt_sdk_settings", "global_rate", Float.valueOf(this.f1925am));
            C0947a.m4402a("tt_sdk_settings", "webview_cache_count", Integer.valueOf(this.f1898L));
            C0947a.m4402a("tt_sdk_settings", "blank_detect_rate", Integer.valueOf(this.f1928ap));
            return;
        }
        String str14 = "privacy_fields_allowed";
        String str15 = str10;
        this.f1923ak.mo64275a("xpath", this.f1937s);
        this.f1923ak.mo64274a(IronSourceConstants.EVENTS_DURATION, this.f1894H);
        this.f1923ak.mo64273a(AppLovinMediationProvider.MAX, this.f1895I);
        this.f1923ak.mo64273a("download_config_dl_network", this.f1938t);
        this.f1923ak.mo64273a("download_config_dl_size", this.f1939u);
        this.f1923ak.mo64273a("fetch_template", this.f1897K);
        this.f1923ak.mo64275a("pyload_h5", this.f1942x);
        this.f1923ak.mo64275a("insert_js_config", this.f1932j);
        this.f1923ak.mo64275a("playableLoadH5Url", this.f1943y);
        this.f1923ak.mo64273a("splash_load_type", this.f1944z);
        this.f1923ak.mo64273a("splash_check_type", this.f1887A);
        this.f1923ak.mo64273a("if_both_open", this.f1892F);
        this.f1923ak.mo64273a("support_tnc", this.f1893G);
        this.f1923ak.mo64273a(str10, this.f1888B);
        this.f1923ak.mo64273a(str9, this.f1914ab);
        this.f1923ak.mo64273a(str8, this.f1913aa);
        this.f1923ak.mo64273a(str7, this.f1926an);
        this.f1923ak.mo64274a(str6, this.f1889C);
        this.f1923ak.mo64276a(str5, this.f1890D);
        this.f1923ak.mo64276a(str4, this.f1891E);
        this.f1923ak.mo64275a("ads_url", this.f1899M);
        this.f1923ak.mo64275a("app_log_url", this.f1900N);
        this.f1923ak.mo64275a("apm_url", this.f1901O);
        this.f1923ak.mo64273a("coppa", this.f1902P);
        this.f1923ak.mo64273a("ccpa", this.f1903Q);
        this.f1923ak.mo64275a("policy_url", this.f1904R);
        this.f1923ak.mo64275a("consent_url", this.f1906T);
        this.f1923ak.mo64273a("ivrv_downward", this.f1908V);
        this.f1923ak.mo64275a("dyn_draw_engine_url", this.f1909W);
        this.f1923ak.mo64275a("dc", this.f1910X);
        this.f1923ak.mo64273a("isGdprUser", this.f1905S);
        this.f1923ak.mo64273a("sp_key_if_sp_cache", this.f1929g);
        this.f1923ak.mo64273a("landingpage_new_style", this.f1927ao);
        if (!TextUtils.isEmpty(this.f1912Z) && f1882f.contains(this.f1912Z)) {
            this.f1923ak.mo64275a("force_language", this.f1912Z);
        }
        String str16 = this.f1940v;
        if (str16 != null) {
            this.f1923ak.mo64275a("ab_test_version", str16);
        }
        String str17 = this.f1941w;
        if (str17 != null) {
            this.f1923ak.mo64275a("ab_test_param", str17);
        }
        this.f1923ak.mo64273a("vbtt", this.f1896J);
        if (!TextUtils.isEmpty(str)) {
            this.f1923ak.mo64275a("ad_slot_conf", str);
        }
        if (!TextUtils.isEmpty(this.f1934l)) {
            this.f1923ak.mo64275a("template_ids", this.f1934l);
        }
        if (!TextUtils.isEmpty(this.f1931i)) {
            this.f1923ak.mo64275a("tpl_infos", this.f1931i);
        }
        this.f1923ak.mo64273a("privacy_ad_enable", this.f1915ac);
        this.f1923ak.mo64273a("privacy_personalized_ad", this.f1916ad);
        this.f1923ak.mo64273a("privacy_sladar_enable", this.f1917ae);
        this.f1923ak.mo64273a("privacy_app_log_enable", this.f1918af);
        this.f1923ak.mo64273a("privacy_sec_enable", this.f1919ag);
        this.f1923ak.mo64273a("privacy_debug_unlock", this.f1920ah);
        this.f1923ak.mo64276a("gecko_hosts", this.f1936o);
        if (this.f1921ai.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (String put2 : this.f1921ai) {
                jSONArray2.put(put2);
            }
            this.f1923ak.mo64275a(str14, jSONArray2.toString());
        } else {
            this.f1923ak.mo64275a(str14, "");
        }
        this.f1923ak.mo64273a("read_video_from_cache", this.f1924al);
        this.f1923ak.mo64272a("global_rate", this.f1925am);
        this.f1923ak.mo64273a("webview_cache_count", this.f1898L);
        this.f1923ak.mo64273a("blank_detect_rate", this.f1928ap);
    }

    /* renamed from: c */
    public boolean mo1681c() {
        if (this.f1892F == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1892F = C0947a.m4395a("tt_sdk_settings", "if_both_open", 0);
            } else {
                this.f1892F = this.f1923ak.mo64280b("if_both_open", 0);
            }
        }
        if (this.f1892F == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo1684d() {
        if (this.f1893G == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1893G = C0947a.m4395a("tt_sdk_settings", "support_tnc", 1);
            } else {
                this.f1893G = this.f1923ak.mo64280b("support_tnc", 1);
            }
        }
        if (this.f1893G == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public String mo1688e() {
        if (this.f1940v == null) {
            if (C0934b.m4334c()) {
                this.f1940v = C0947a.m4410b("tt_sdk_settings", "ab_test_version", (String) null);
            } else {
                this.f1940v = this.f1923ak.mo64271a("ab_test_version");
            }
        }
        return this.f1940v;
    }

    /* renamed from: f */
    public String mo1691f() {
        if (this.f1941w == null) {
            if (C0934b.m4334c()) {
                this.f1941w = C0947a.m4410b("tt_sdk_settings", "ab_test_param", (String) null);
            } else {
                this.f1941w = this.f1923ak.mo64271a("ab_test_param");
            }
        }
        return this.f1941w;
    }

    /* renamed from: g */
    public boolean mo1693g() {
        if (this.f1927ao == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1927ao = C0947a.m4395a("tt_sdk_settings", "landingpage_new_style", -1);
            } else {
                this.f1927ao = this.f1923ak.mo64279b("landingpage_new_style");
            }
        }
        return this.f1927ao == 1;
    }

    /* renamed from: h */
    public long mo1696h() {
        if (this.f1894H == 2147483647L) {
            if (C0934b.m4334c()) {
                this.f1894H = C0947a.m4396a("tt_sdk_settings", IronSourceConstants.EVENTS_DURATION, 10000);
            } else {
                this.f1894H = this.f1923ak.mo64281b(IronSourceConstants.EVENTS_DURATION, 10000);
            }
        }
        return this.f1894H;
    }

    /* renamed from: i */
    public int mo1698i() {
        if (this.f1895I == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1895I = C0947a.m4395a("tt_sdk_settings", AppLovinMediationProvider.MAX, 50);
            } else {
                this.f1895I = this.f1923ak.mo64280b(AppLovinMediationProvider.MAX, 50);
            }
        }
        return this.f1895I;
    }

    /* renamed from: j */
    public String mo1703j() {
        if (TextUtils.isEmpty(this.f1942x)) {
            if (C0934b.m4334c()) {
                this.f1942x = C0947a.m4410b("tt_sdk_settings", "pyload_h5", (String) null);
            } else {
                this.f1942x = this.f1923ak.mo64282b("pyload_h5", (String) null);
            }
        }
        return this.f1942x;
    }

    /* renamed from: k */
    public C0511c mo1705k() {
        if (TextUtils.isEmpty(this.f1932j)) {
            if (C0934b.m4334c()) {
                this.f1932j = C0947a.m4410b("tt_sdk_settings", "insert_js_config", (String) null);
            } else {
                this.f1932j = this.f1923ak.mo64282b("insert_js_config", (String) null);
            }
        }
        return new C0511c(this.f1932j);
    }

    /* renamed from: l */
    public String mo1706l() {
        if (TextUtils.isEmpty(this.f1943y)) {
            if (C0934b.m4334c()) {
                this.f1943y = C0947a.m4410b("tt_sdk_settings", "playableLoadH5Url", (String) null);
            } else {
                this.f1943y = this.f1923ak.mo64282b("playableLoadH5Url", (String) null);
            }
        }
        return this.f1943y;
    }

    /* renamed from: m */
    public int mo1708m() {
        if (this.f1913aa == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1913aa = C0947a.m4395a("tt_sdk_settings", "fetch_tpl_timeout_ctrl", 3000);
            } else {
                this.f1913aa = this.f1923ak.mo64280b("fetch_tpl_timeout_ctrl", 3000);
            }
        }
        if (this.f1913aa <= 0) {
            this.f1913aa = 3000;
        }
        return this.f1913aa;
    }

    /* renamed from: a */
    public void mo1675a(Boolean bool) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (bool.booleanValue() && (TextUtils.isEmpty(this.f1912Z) || !f1882f.contains(this.f1912Z))) {
                if (C0934b.m4334c()) {
                    this.f1912Z = C0947a.m4410b("tt_sdk_settings", "force_language", "");
                } else {
                    this.f1912Z = this.f1923ak.mo64282b("force_language", "");
                }
            }
            if (!TextUtils.isEmpty(this.f1912Z)) {
                if (this.f1912Z.equals("zh-Hant")) {
                    C10632i.m31219a(C0558m.m2663a(), "zh", "tw");
                } else {
                    C10632i.m31219a(C0558m.m2663a(), this.f1912Z, (String) null);
                }
                try {
                    f1879c = C10647t.m31276a(C0558m.m2663a(), "tt_txt_skip");
                    f1880d = C10647t.m31276a(C0558m.m2663a(), "tt_feedback_submit_text");
                    f1881e = C10647t.m31276a(C0558m.m2663a(), "tt_feedback_thank_text") + "\n" + C10647t.m31276a(C0558m.m2663a(), "tt_feedback_experience_text");
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: n */
    public int mo1710n() {
        if (this.f1926an == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1926an = C0947a.m4395a("tt_sdk_settings", "disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            } else {
                this.f1926an = this.f1923ak.mo64280b("disable_rotate_banner_on_dislike", Integer.MAX_VALUE);
            }
        }
        return this.f1926an;
    }

    /* renamed from: a */
    public boolean mo1676a(int i) {
        return mo1711n(String.valueOf(i)).f1841c == 1;
    }

    /* renamed from: b */
    public boolean mo1679b(String str) {
        int i = C0558m.m2673h().mo1711n(String.valueOf(str)).f1843e;
        if (i == 1) {
            return C10642o.m31261d(C0558m.m2663a());
        }
        if (i == 2 && C10642o.m31260c(C0558m.m2663a()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo1682c(String str) {
        return mo1711n(String.valueOf(str)).f1845g == 1;
    }

    /* renamed from: d */
    public boolean mo1685d(String str) {
        if (str == null || C0558m.m2673h().mo1711n(String.valueOf(str)).f1851m == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int mo1687e(String str) {
        if (str == null) {
            return 1500;
        }
        return C0558m.m2673h().mo1711n(String.valueOf(str)).f1853o;
    }

    /* renamed from: f */
    public int mo1690f(String str) {
        return C0558m.m2673h().mo1711n(String.valueOf(str)).f1849k;
    }

    /* renamed from: g */
    public JSONArray mo1692g(String str) {
        try {
            Set<String> b = C10266a.m29495b(str);
            if (b != null) {
                if (b.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (String a : b) {
                        C10279b a2 = C10266a.m29490a(a);
                        if (a2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", a2.mo63144b());
                            jSONObject.put("md5", a2.mo63146c());
                            jSONArray.put(jSONObject);
                        }
                    }
                    return jSONArray;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo1697h(String str) {
        try {
            C0509a n = C0558m.m2673h().mo1711n(String.valueOf(str));
            return (n == null || n.f1860v == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo1700i(String str) {
        try {
            C0509a n = C0558m.m2673h().mo1711n(String.valueOf(str));
            return n != null && n.f1861w == 8;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public boolean mo1713o() {
        return this.f1911Y;
    }

    /* renamed from: j */
    public int mo1702j(String str) {
        return mo1711n(String.valueOf(str)).f1846h;
    }

    /* renamed from: k */
    public int mo1704k(String str) {
        return mo1711n(str).f1848j;
    }

    /* renamed from: a */
    public int mo1673a(String str, boolean z) {
        if (str == null) {
            return m2399a(z);
        }
        C0509a n = C0558m.m2673h().mo1711n(str);
        return n.f1862x != -1 ? n.f1862x : m2399a(z);
    }

    /* renamed from: l */
    public boolean mo1707l(String str) {
        return mo1711n(String.valueOf(str)).f1859u == 0;
    }

    /* renamed from: b */
    public boolean mo1678b(int i) {
        if (i == 0 || C0558m.m2673h().mo1711n(String.valueOf(i)).f1850l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public String mo1714p() {
        if (TextUtils.isEmpty(this.f1899M)) {
            if (C0934b.m4334c()) {
                this.f1899M = C0947a.m4410b("tt_sdk_settings", "ads_url", f1885q);
            } else {
                this.f1899M = this.f1923ak.mo64282b("ads_url", f1885q);
            }
            if (TextUtils.isEmpty(this.f1899M)) {
                this.f1899M = f1885q;
            }
        }
        return this.f1899M;
    }

    /* renamed from: q */
    public String mo1716q() {
        if (TextUtils.isEmpty(this.f1900N)) {
            if (C0934b.m4334c()) {
                this.f1900N = C0947a.m4410b("tt_sdk_settings", "app_log_url", f1884p);
            } else {
                this.f1900N = this.f1923ak.mo64271a("app_log_url");
            }
            if (TextUtils.isEmpty(this.f1900N)) {
                this.f1900N = f1884p;
            }
        }
        return this.f1900N;
    }

    /* renamed from: r */
    public String mo1717r() {
        if (TextUtils.isEmpty(this.f1901O)) {
            if (C0934b.m4334c()) {
                this.f1901O = C0947a.m4410b("tt_sdk_settings", "apm_url", "");
            } else {
                this.f1901O = this.f1923ak.mo64282b("apm_url", "");
            }
        }
        return this.f1901O;
    }

    /* renamed from: s */
    public String mo1718s() {
        if (TextUtils.isEmpty(this.f1904R)) {
            if (C0934b.m4334c()) {
                this.f1904R = C0947a.m4410b("tt_sdk_settings", "policy_url", f1886r);
            } else {
                this.f1904R = this.f1923ak.mo64282b("policy_url", f1886r);
            }
        }
        return this.f1904R;
    }

    /* renamed from: t */
    public String mo1719t() {
        if (TextUtils.isEmpty(this.f1906T)) {
            if (C0934b.m4334c()) {
                this.f1906T = C0947a.m4410b("tt_sdk_settings", "consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            } else {
                this.f1906T = this.f1923ak.mo64282b("consent_url", "https://lf-hs-sg.ibytedtos.com/obj/union-platform-i18n/union_platform_gdpr_607_en.html");
            }
        }
        return this.f1906T;
    }

    /* renamed from: u */
    public int mo1720u() {
        if (this.f1908V == 0) {
            if (C0934b.m4334c()) {
                this.f1908V = C0947a.m4395a("tt_sdk_settings", "ivrv_downward", 0);
            } else {
                this.f1908V = this.f1923ak.mo64280b("ivrv_downward", 0);
            }
        }
        return this.f1908V;
    }

    /* renamed from: v */
    public String mo1721v() {
        if (TextUtils.isEmpty(this.f1909W)) {
            if (C0934b.m4334c()) {
                this.f1909W = C0947a.m4410b("tt_sdk_settings", "dyn_draw_engine_url", f1883n);
            } else {
                this.f1909W = this.f1923ak.mo64282b("dyn_draw_engine_url", f1883n);
            }
        }
        return this.f1909W;
    }

    /* renamed from: w */
    public String mo1722w() {
        if (TextUtils.isEmpty(this.f1910X)) {
            if (C0934b.m4334c()) {
                this.f1910X = C0947a.m4410b("tt_sdk_settings", "dc", (String) null);
            } else {
                this.f1910X = this.f1923ak.mo64271a("dc");
            }
        }
        return this.f1910X;
    }

    /* renamed from: x */
    public int mo1723x() {
        if (this.f1905S == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1905S = C0947a.m4395a("tt_sdk_settings", "isGdprUser", -1);
            } else {
                this.f1905S = this.f1923ak.mo64280b("isGdprUser", -1);
            }
        }
        return this.f1905S;
    }

    /* renamed from: c */
    public int mo1680c(int i) {
        return mo1711n(String.valueOf(i)).f1840b;
    }

    /* renamed from: d */
    public int mo1683d(int i) {
        return mo1711n(String.valueOf(i)).f1847i;
    }

    /* renamed from: y */
    public int mo1724y() {
        if (this.f1896J == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1896J = C0947a.m4395a("tt_sdk_settings", "vbtt", 5);
            } else {
                this.f1896J = this.f1923ak.mo64280b("vbtt", 5);
            }
        }
        return this.f1896J;
    }

    /* renamed from: e */
    public int mo1686e(int i) {
        return mo1711n(String.valueOf(i)).f1857s;
    }

    /* renamed from: f */
    public int mo1689f(int i) {
        return mo1711n(String.valueOf(i)).f1849k;
    }

    /* renamed from: g */
    public boolean mo1694g(int i) {
        return mo1711n(String.valueOf(i)).f1858t;
    }

    /* renamed from: h */
    public int mo1695h(int i) {
        return mo1711n(String.valueOf(i)).f1863y;
    }

    /* renamed from: i */
    public int mo1699i(int i) {
        return mo1711n(String.valueOf(i)).f1864z;
    }

    /* renamed from: j */
    public int mo1701j(int i) {
        return mo1711n(String.valueOf(i)).f1838A;
    }

    /* renamed from: m */
    public boolean mo1709m(String str) {
        if (str != null && C0558m.m2673h().mo1711n(str).f1852n == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public C0509a mo1711n(String str) {
        C0509a aVar = this.f1930h.get(str);
        return aVar == null ? m2407q(str) : aVar;
    }

    /* renamed from: q */
    private C0509a m2407q(String str) {
        return C0509a.m2346a().mo1631a(str).mo1643k(1).mo1644l(this.f1933k.contains(str) ^ true ? 1 : 0).mo1645m(2).mo1646n(1).mo1647o(100).mo1648p(0).mo1650r(1).mo1642j(3).mo1641i(-1).mo1640h(1).mo1651s(1).mo1636d(-1).mo1630a(-1).mo1652t(2).mo1653u(5).mo1632a((JSONArray) null).mo1633a(false).mo1654v(0).mo1655w(0).mo1656x(5);
    }

    /* renamed from: o */
    public void mo1712o(String str) {
        this.f1933k.add(str);
    }

    /* renamed from: z */
    public boolean mo1725z() {
        if (this.f1915ac == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1915ac = C0947a.m4395a("tt_sdk_settings", "privacy_ad_enable", Integer.MAX_VALUE);
            } else {
                this.f1915ac = this.f1923ak.mo64280b("privacy_ad_enable", Integer.MAX_VALUE);
            }
        }
        int i = this.f1915ac;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C0996u.m4691o();
        return o == 1 || o == 2 || o == 3;
    }

    /* renamed from: A */
    public int mo1663A() {
        if (this.f1916ad == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1916ad = C0947a.m4395a("tt_sdk_settings", "privacy_personalized_ad", Integer.MAX_VALUE);
            } else {
                this.f1916ad = this.f1923ak.mo64280b("privacy_personalized_ad", Integer.MAX_VALUE);
            }
        }
        int i = this.f1916ad;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int o = C0996u.m4691o();
        if (o == 1 || o == 2) {
            return 2;
        }
        return o != 3 ? 0 : 1;
    }

    /* renamed from: B */
    public boolean mo1664B() {
        if (this.f1917ae == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1917ae = C0947a.m4395a("tt_sdk_settings", "privacy_sladar_enable", Integer.MAX_VALUE);
            } else {
                this.f1917ae = this.f1923ak.mo64280b("privacy_sladar_enable", Integer.MAX_VALUE);
            }
        }
        return this.f1917ae == 1;
    }

    /* renamed from: C */
    public boolean mo1665C() {
        if (this.f1919ag == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1919ag = C0947a.m4395a("tt_sdk_settings", "privacy_sec_enable", Integer.MAX_VALUE);
            } else {
                this.f1919ag = this.f1923ak.mo64280b("privacy_sec_enable", Integer.MAX_VALUE);
            }
        }
        if ("VA".equalsIgnoreCase(mo1722w()) || C0996u.m4691o() == 3) {
            return false;
        }
        int i = this.f1919ag;
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int o = C0996u.m4691o();
        if (o == 1 || o == 2 || o == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo1666D() {
        if (this.f1920ah == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1920ah = C0947a.m4395a("tt_sdk_settings", "privacy_debug_unlock", Integer.MAX_VALUE);
            } else {
                this.f1920ah = this.f1923ak.mo64280b("privacy_debug_unlock", Integer.MAX_VALUE);
            }
        }
        return this.f1920ah != 0;
    }

    /* renamed from: p */
    public boolean mo1715p(String str) {
        if (this.f1921ai.size() != 0) {
            return this.f1921ai.contains(str);
        }
        int o = C0996u.m4691o();
        if (o != 1) {
            if (o == 2) {
                return "mcc".equals(str) || "mnc".equals(str);
            }
            if (o != 3) {
                return false;
            }
            return "mcc".equals(str) || "mnc".equals(str);
        }
    }

    /* renamed from: a */
    public Set<String> mo1674a(Set<String> set) {
        if (set == null) {
            try {
                return new HashSet();
            } catch (Throwable unused) {
                return new HashSet();
            }
        } else {
            HashSet hashSet = new HashSet();
            for (String next : set) {
                if (!TextUtils.isEmpty(next)) {
                    hashSet.add(next);
                }
            }
            return hashSet;
        }
    }

    /* renamed from: E */
    public boolean mo1667E() {
        return this.f1922aj;
    }

    /* renamed from: F */
    public boolean mo1668F() {
        if (this.f1925am == 2.14748365E9f) {
            if (C0934b.m4334c()) {
                this.f1925am = C0947a.m4394a("tt_sdk_settings", "global_rate", 1.0f);
            } else {
                this.f1925am = this.f1923ak.mo64278b("global_rate", 1.0f);
            }
        }
        return this.f1925am == 1.0f;
    }

    /* renamed from: G */
    public boolean mo1669G() {
        if (this.f1924al == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1924al = C0947a.m4395a("tt_sdk_settings", "read_video_from_cache", 1);
            } else {
                this.f1924al = this.f1923ak.mo64280b("read_video_from_cache", 1);
            }
        }
        if (this.f1924al == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public int mo1670H() {
        if (this.f1898L == Integer.MAX_VALUE) {
            if (C0934b.m4334c()) {
                this.f1898L = C0947a.m4395a("tt_sdk_settings", "webview_cache_count", 20);
            } else {
                this.f1898L = this.f1923ak.mo64280b("webview_cache_count", 20);
            }
        }
        int i = this.f1898L;
        if (i < 0) {
            return 20;
        }
        return i;
    }

    /* renamed from: I */
    public int mo1671I() {
        return this.f1928ap;
    }
}
