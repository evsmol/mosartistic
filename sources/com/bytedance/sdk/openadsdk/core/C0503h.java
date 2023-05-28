package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.appnext.base.p264b.C8850d;
import com.bykv.p271vk.openvk.component.video.api.p291f.C10200a;
import com.bytedance.sdk.component.utils.C10625d;
import com.bytedance.sdk.component.utils.C10638l;
import com.bytedance.sdk.component.utils.C10648u;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C0424a;
import com.bytedance.sdk.openadsdk.core.video.p033b.C0650c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.multipro.C0934b;
import com.bytedance.sdk.openadsdk.multipro.p055d.C0947a;
import com.bytedance.sdk.openadsdk.utils.C0953a;
import com.bytedance.sdk.openadsdk.utils.C0976f;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.h */
/* compiled from: GlobalInfo */
public class C0503h {

    /* renamed from: a */
    public static TTAdSdk.InitCallback f1801a;

    /* renamed from: b */
    public static final Set<String> f1802b = new HashSet<String>() {
        {
            add("8025677");
            add("5001121");
        }
    };

    /* renamed from: u */
    private static final C0503h f1803u = new C0503h();

    /* renamed from: c */
    private String f1804c;

    /* renamed from: d */
    private String f1805d;

    /* renamed from: e */
    private int f1806e;

    /* renamed from: f */
    private boolean f1807f;

    /* renamed from: g */
    private String f1808g;

    /* renamed from: h */
    private String f1809h;

    /* renamed from: i */
    private AtomicBoolean f1810i = new AtomicBoolean(false);

    /* renamed from: j */
    private int f1811j = 0;

    /* renamed from: k */
    private boolean f1812k = true;

    /* renamed from: l */
    private final Set<Integer> f1813l = Collections.synchronizedSet(new HashSet());

    /* renamed from: m */
    private boolean f1814m = false;

    /* renamed from: n */
    private Bitmap f1815n = null;

    /* renamed from: o */
    private C0953a f1816o = new C0953a();

    /* renamed from: p */
    private String[] f1817p;

    /* renamed from: q */
    private int f1818q = 0;

    /* renamed from: r */
    private int f1819r = 0;

    /* renamed from: s */
    private boolean f1820s = false;

    /* renamed from: t */
    private String f1821t;

    /* renamed from: v */
    private C0650c f1822v;

    /* renamed from: w */
    private volatile ConcurrentHashMap<String, C0424a.C0431a> f1823w = null;

    /* renamed from: a */
    public static void m2279a(TTAdSdk.InitCallback initCallback) {
        f1801a = initCallback;
    }

    /* renamed from: a */
    public boolean mo1587a() {
        return this.f1816o.mo2882a();
    }

    /* renamed from: b */
    public boolean mo1591b() {
        return this.f1820s;
    }

    /* renamed from: c */
    public C0953a mo1592c() {
        return this.f1816o;
    }

    private C0503h() {
        try {
            C10200a.m29278a(C0558m.m2663a());
            this.f1813l.add(4);
            Context a = C0558m.m2663a();
            if (a instanceof Application) {
                ((Application) a).registerActivityLifecycleCallbacks(this.f1816o);
            } else if (a != null && a.getApplicationContext() != null) {
                ((Application) a.getApplicationContext()).registerActivityLifecycleCallbacks(this.f1816o);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static C0503h m2281d() {
        return f1803u;
    }

    /* renamed from: e */
    public boolean mo1602e() {
        if (C0934b.m4334c()) {
            return C0947a.m4407a("sp_global_info", "sdk_activate_init", true);
        }
        return C10648u.m31293a((String) null, C0558m.m2663a()).mo64284b("sdk_activate_init", true);
    }

    /* renamed from: a */
    public void mo1585a(boolean z) {
        this.f1820s = z;
    }

    /* renamed from: b */
    public void mo1590b(boolean z) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("sp_global_info", "sdk_activate_init", Boolean.valueOf(z));
        }
        C10648u.m31293a((String) null, C0558m.m2663a()).mo64277a("sdk_activate_init", z);
    }

    /* renamed from: f */
    public String mo1603f() {
        if (C0934b.m4334c()) {
            return C0947a.m4410b("sp_global_info", "app_id", (String) null);
        }
        return this.f1804c;
    }

    /* renamed from: a */
    public void mo1583a(String str) {
        m2282g(str);
        if (C0934b.m4334c()) {
            C0947a.m4404a("sp_global_info", "app_id", str);
        }
        this.f1804c = str;
    }

    /* renamed from: g */
    public String mo1606g() {
        if (C0934b.m4334c()) {
            return C0947a.m4410b("sp_global_info", AppMeasurementSdk.ConditionalUserProperty.NAME, (String) null);
        }
        return this.f1805d;
    }

    /* renamed from: b */
    public void mo1589b(String str) {
        m2283h(str);
        if (C0934b.m4334c()) {
            C0947a.m4404a("sp_global_info", AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        }
        this.f1805d = str;
    }

    /* renamed from: a */
    public void mo1582a(int i) {
        if (C0934b.m4334c()) {
            C0947a.m4402a("sp_global_info", "icon_id", Integer.valueOf(i));
        }
        this.f1806e = i;
    }

    /* renamed from: h */
    public int mo1607h() {
        if (C0934b.m4334c()) {
            return C0947a.m4395a("sp_global_info", "icon_id", 0);
        }
        return this.f1806e;
    }

    /* renamed from: b */
    public void mo1588b(int i) {
        if (i == 0 || i == 1 || i == -1) {
            if (C0934b.m4334c()) {
                C0947a.m4402a("sp_global_info", "sdk_coppa", Integer.valueOf(i));
            } else {
                C10648u.m31293a((String) null, C0558m.m2663a()).mo64273a("sdk_coppa", i);
            }
            this.f1818q = i;
        }
    }

    /* renamed from: i */
    public int mo1608i() {
        if (C0934b.m4334c()) {
            return C0947a.m4395a("sp_global_info", "sdk_coppa", -1);
        }
        int b = C10648u.m31293a((String) null, C0558m.m2663a()).mo64280b("sdk_coppa", -1);
        this.f1818q = b;
        return b;
    }

    /* renamed from: j */
    public int mo1609j() {
        if (C0934b.m4334c()) {
            return C0947a.m4395a("sp_global_info", "tt_gdpr", -1);
        }
        return C10648u.m31293a((String) null, C0558m.m2663a()).mo64280b("tt_gdpr", -1);
    }

    /* renamed from: c */
    public void mo1593c(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C0934b.m4334c()) {
            C0947a.m4402a("sp_global_info", "tt_gdpr", Integer.valueOf(i));
        } else {
            C10648u.m31293a((String) null, C0558m.m2663a()).mo64273a("tt_gdpr", i);
        }
    }

    /* renamed from: d */
    public void mo1596d(int i) {
        if (!(i == 0 || i == 1)) {
            i = -99;
        }
        if (C0934b.m4334c()) {
            C0947a.m4402a("sp_global_info", "global_coppa", Integer.valueOf(i));
        } else {
            C10648u.m31293a((String) null, C0558m.m2663a()).mo64273a("global_coppa", i);
        }
        this.f1819r = i;
    }

    /* renamed from: k */
    public int mo1610k() {
        if (C0934b.m4334c()) {
            this.f1819r = C0947a.m4395a("sp_global_info", "global_coppa", -99);
        } else {
            this.f1819r = C10648u.m31293a((String) null, C0558m.m2663a()).mo64280b("global_coppa", -99);
        }
        if (this.f1819r == -99) {
            this.f1819r = mo1608i();
        }
        return this.f1819r;
    }

    /* renamed from: l */
    public boolean mo1611l() {
        if (C0934b.m4334c()) {
            return C0947a.m4407a("sp_global_info", "is_paid", false);
        }
        return this.f1807f;
    }

    /* renamed from: c */
    public void mo1595c(boolean z) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("sp_global_info", "is_paid", Boolean.valueOf(z));
        }
        this.f1807f = z;
    }

    /* renamed from: m */
    public String mo1612m() {
        if (C0934b.m4334c()) {
            return C0947a.m4410b("sp_global_info", "keywords", (String) null);
        }
        return this.f1808g;
    }

    /* renamed from: c */
    public void mo1594c(String str) {
        m2284i(str);
        if (C0934b.m4334c()) {
            C0947a.m4404a("sp_global_info", "keywords", str);
        }
        this.f1808g = str;
    }

    /* renamed from: n */
    public String mo1613n() {
        if (C0934b.m4334c()) {
            return C0947a.m4410b("sp_global_info", "extra_data", (String) null);
        }
        return this.f1809h;
    }

    /* renamed from: d */
    public void mo1597d(String str) {
        m2285j(str);
        if (C0934b.m4334c()) {
            C0947a.m4404a("sp_global_info", "extra_data", str);
        }
        this.f1809h = str;
    }

    /* renamed from: e */
    public void mo1600e(int i) {
        if (C0934b.m4334c()) {
            C0947a.m4402a("sp_global_info", "title_bar_theme", Integer.valueOf(i));
        }
        this.f1811j = i;
    }

    /* renamed from: o */
    public int mo1614o() {
        if (C0934b.m4334c()) {
            return C0947a.m4395a("sp_global_info", "title_bar_theme", 0);
        }
        return this.f1811j;
    }

    /* renamed from: d */
    public void mo1598d(boolean z) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("sp_global_info", "allow_show_notify", Boolean.valueOf(z));
        }
        this.f1812k = z;
    }

    /* renamed from: g */
    private static void m2282g(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f1801a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "appid cannot be empty");
        }
        C10638l.m31242e("GlobalInfo", "appid cannot be empty");
    }

    /* renamed from: h */
    private static void m2283h(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f1801a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "name cannot be empty");
        }
        C10638l.m31242e("GlobalInfo", "name cannot be empty");
    }

    /* renamed from: i */
    private static void m2284i(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f1801a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "keyword is super long, the longest is 1000");
            }
            C10638l.m31242e("GlobalInfo", "keyword is super long, the longest is 1000");
        }
    }

    /* renamed from: j */
    private static void m2285j(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f1801a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "Data is very long, the longest is 1000");
            }
            C10638l.m31242e("GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    /* renamed from: p */
    public C0650c mo1615p() {
        if (this.f1822v == null) {
            this.f1822v = new C0650c(10, 8);
        }
        return this.f1822v;
    }

    /* renamed from: q */
    public boolean mo1616q() {
        if (C0934b.m4334c()) {
            return C0947a.m4407a("sp_global_info", "is_use_texture", false);
        }
        return this.f1814m;
    }

    /* renamed from: e */
    public void mo1601e(boolean z) {
        if (C0934b.m4334c()) {
            C0947a.m4400a("sp_global_info", "is_use_texture", Boolean.valueOf(z));
        }
        this.f1814m = z;
    }

    /* renamed from: r */
    public Bitmap mo1617r() {
        if (C0934b.m4334c()) {
            return C10625d.m31198a(C0947a.m4410b("sp_global_info", "pause_icon", (String) null));
        }
        return this.f1815n;
    }

    /* renamed from: a */
    public void mo1586a(String[] strArr) {
        if (C0934b.m4334c() && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i = i2;
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                C0947a.m4404a("sp_global_info", "need_clear_task_reset", sb2);
            }
        }
        this.f1817p = strArr;
    }

    /* renamed from: s */
    public boolean mo1618s() {
        return f1802b.contains(this.f1804c);
    }

    /* renamed from: t */
    public boolean mo1619t() {
        return "com.union_test.internationad".equals(C0996u.m4648d());
    }

    /* renamed from: u */
    public String mo1620u() {
        if (!TextUtils.isEmpty(this.f1821t)) {
            return this.f1821t;
        }
        String a = C0976f.m4531a();
        this.f1821t = a;
        if (!TextUtils.isEmpty(a)) {
            return this.f1821t;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        C0976f.m4532a(valueOf);
        this.f1821t = valueOf;
        return valueOf;
    }

    /* renamed from: k */
    private static JSONObject m2286k(String str) {
        String str2;
        if (C0934b.m4334c()) {
            str2 = C0947a.m4410b("sp_global_info", str, (String) null);
        } else {
            str2 = C10648u.m31293a((String) null, C0558m.m2663a()).mo64282b(str, (String) null);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m2280a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, str2);
                jSONObject.put(C8850d.f22432fl, System.currentTimeMillis());
                if (C0934b.m4334c()) {
                    C0947a.m4404a("sp_global_info", str, jSONObject.toString());
                } else {
                    C10648u.m31293a((String) null, C0558m.m2663a()).mo64275a(str, jSONObject.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m2278a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject k = m2286k(str);
            if (k == null) {
                return null;
            }
            if (System.currentTimeMillis() - k.getLong(C8850d.f22432fl) <= j) {
                return k.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v */
    public int mo1621v() {
        if (C0934b.m4334c()) {
            return C0947a.m4395a("sp_global_info", "global_ccpa", -1);
        }
        return C10648u.m31293a((String) null, C0558m.m2663a()).mo64280b("global_ccpa", -1);
    }

    /* renamed from: f */
    public void mo1604f(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C0934b.m4334c()) {
            C0947a.m4402a("sp_global_info", "global_ccpa", Integer.valueOf(i));
        } else {
            C10648u.m31293a((String) null, C0558m.m2663a()).mo64273a("global_ccpa", i);
        }
    }

    /* renamed from: e */
    public C0424a.C0431a mo1599e(String str) {
        if (this.f1823w == null || str == null) {
            return null;
        }
        return this.f1823w.get(str);
    }

    /* renamed from: a */
    public void mo1584a(String str, C0424a.C0431a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (C0934b.m4334c()) {
                TTDislikeListView.m3846a(6, str, aVar);
                return;
            }
            if (this.f1823w == null) {
                synchronized (C0503h.class) {
                    if (this.f1823w == null) {
                        this.f1823w = new ConcurrentHashMap<>();
                    }
                }
            }
            this.f1823w.put(str, aVar);
        }
    }

    /* renamed from: f */
    public void mo1605f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C0934b.m4334c()) {
            TTDislikeListView.m3845a(6, str);
        } else if (this.f1823w != null) {
            this.f1823w.remove(str);
        }
    }

    /* renamed from: w */
    public void mo1622w() {
        if (this.f1823w != null && this.f1823w.size() == 0) {
            this.f1823w = null;
        }
    }
}
