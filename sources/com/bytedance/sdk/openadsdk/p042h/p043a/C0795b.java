package com.bytedance.sdk.openadsdk.p042h.p043a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p313d.p316c.p320b.C10522a;
import com.bytedance.sdk.component.p313d.p322d.C10545d;
import com.bytedance.sdk.openadsdk.core.C0503h;
import com.bytedance.sdk.openadsdk.core.C0558m;
import com.bytedance.sdk.openadsdk.p042h.p043a.C0795b;
import com.bytedance.sdk.openadsdk.utils.C0996u;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.com.bytedance.overseas.sdk.p057b.C1010a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.a.b */
/* compiled from: LogStatsBase */
public class C0795b<T extends C0795b> implements C0794a {

    /* renamed from: a */
    private String f2963a;

    /* renamed from: b */
    private String f2964b;

    /* renamed from: c */
    private String f2965c;

    /* renamed from: d */
    private String f2966d = C10545d.d1657027613261dc("4/7-4+0");

    /* renamed from: e */
    private String f2967e;

    /* renamed from: f */
    private long f2968f = (System.currentTimeMillis() / 1000);

    /* renamed from: g */
    private int f2969g = 0;

    /* renamed from: h */
    private String f2970h;

    /* renamed from: i */
    private int f2971i = 0;

    /* renamed from: j */
    private String f2972j;

    /* renamed from: k */
    private String f2973k;

    /* renamed from: l */
    private String f2974l;

    /* renamed from: m */
    private String f2975m;

    /* renamed from: n */
    private String f2976n;

    /* renamed from: b */
    public static C0795b<C0795b> m3955b() {
        return new C0795b<>();
    }

    @JProtect
    /* renamed from: q */
    private JSONObject m3956q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C10522a.a1657027613264dc("or"), 1);
            jSONObject.put(C10522a.a1657027613264dc("mnffh"), Build.MODEL);
            jSONObject.put(C10522a.a1657027613264dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C10522a.a1657027613264dc("p`ahebcXfhgn"), C0996u.m4648d());
            jSONObject.put(C10522a.a1657027613264dc("u`"), C0996u.m4631b());
            jSONObject.put(C10522a.a1657027613264dc("g`kg"), C1010a.m4777a().mo2932b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: r */
    private T m3957r() {
        return this;
    }

    /* renamed from: a */
    public T mo2577a(int i) {
        this.f2969g = i;
        return m3957r();
    }

    /* renamed from: a */
    public T mo2578a(long j) {
        this.f2968f = j;
        return m3957r();
    }

    /* renamed from: a */
    public T mo2579a(String str) {
        this.f2963a = str;
        return m3957r();
    }

    @JProtect
    /* renamed from: a */
    public JSONObject mo2576a() {
        String a1657027613264dc;
        String f;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(mo2583c())) {
                jSONObject.put(C10522a.a1657027613264dc("txrf"), mo2583c());
            }
            if (!TextUtils.isEmpty(mo2587e())) {
                jSONObject.put(C10522a.a1657027613264dc("rhv"), mo2587e());
            }
            if (!TextUtils.isEmpty(mo2589f())) {
                jSONObject.put(C10522a.a1657027613264dc("csgbplpbW`n"), mo2589f());
            }
            if (!TextUtils.isEmpty(mo2591g())) {
                jSONObject.put(C10522a.a1657027613264dc("ae]p`nYqm{ybcc"), mo2591g());
            }
            if (!TextUtils.isEmpty(mo2593h())) {
                a1657027613264dc = C10522a.a1657027613264dc("aqr\\r`ttafd");
                f = mo2593h();
            } else {
                a1657027613264dc = C10522a.a1657027613264dc("aqr\\r`ttafd");
                f = C0996u.m4660f();
            }
            jSONObject.put(a1657027613264dc, f);
            if (mo2594i() > 0) {
                jSONObject.put(C10522a.a1657027613264dc("thofwqgjx"), mo2594i());
            }
            if (mo2595j() > 0) {
                jSONObject.put(C10522a.a1657027613264dc("aevzt`"), mo2595j());
            }
            if (!TextUtils.isEmpty(mo2596k())) {
                jSONObject.put(C10522a.a1657027613264dc("rds\\ma"), mo2596k());
            }
            jSONObject.put(C10522a.a1657027613264dc("esplvZehll"), mo2597l());
            if (!TextUtils.isEmpty(mo2598m())) {
                jSONObject.put(C10522a.a1657027613264dc("esplvZkto"), mo2598m());
            }
            if (!TextUtils.isEmpty(mo2599n())) {
                jSONObject.put(C10522a.a1657027613264dc("eyvqe"), mo2599n());
            }
            if (!TextUtils.isEmpty(mo2600o())) {
                jSONObject.put(C10522a.a1657027613264dc("ilcdaZsud"), mo2600o());
            }
            if (!TextUtils.isEmpty(mo2585d())) {
                jSONObject.put(C10522a.a1657027613264dc("ewgmpZc|{k"), mo2585d());
            }
            if (!TextUtils.isEmpty(mo2601p())) {
                jSONObject.put(C10522a.a1657027613264dc("dtpbplii"), mo2601p());
            }
            if (!TextUtils.isEmpty(C0503h.m2281d().mo1603f())) {
                jSONObject.put(C10522a.a1657027613264dc("aqrj`"), C0503h.m2281d().mo1603f());
            }
            jSONObject.put(C10522a.a1657027613264dc("cnlm[qwm"), NetworkTools.m4453b(C0558m.m2663a()));
            jSONObject.put(C10522a.a1657027613264dc("ddtjg`Ynfoe"), m3956q());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public T mo2580b(int i) {
        this.f2971i = i;
        return m3957r();
    }

    /* renamed from: b */
    public T mo2581b(String str) {
        this.f2975m = str;
        return m3957r();
    }

    /* renamed from: c */
    public T mo2582c(String str) {
        this.f2964b = str;
        return m3957r();
    }

    /* renamed from: c */
    public String mo2583c() {
        return this.f2963a;
    }

    /* renamed from: d */
    public T mo2584d(String str) {
        this.f2965c = str;
        return m3957r();
    }

    /* renamed from: d */
    public String mo2585d() {
        return this.f2975m;
    }

    /* renamed from: e */
    public T mo2586e(String str) {
        this.f2970h = str;
        return m3957r();
    }

    /* renamed from: e */
    public String mo2587e() {
        return this.f2964b;
    }

    /* renamed from: f */
    public T mo2588f(String str) {
        this.f2972j = str;
        return m3957r();
    }

    /* renamed from: f */
    public String mo2589f() {
        return this.f2965c;
    }

    /* renamed from: g */
    public T mo2590g(String str) {
        this.f2973k = str;
        return m3957r();
    }

    /* renamed from: g */
    public String mo2591g() {
        return this.f2966d;
    }

    /* renamed from: h */
    public T mo2592h(String str) {
        this.f2976n = str;
        return m3957r();
    }

    /* renamed from: h */
    public String mo2593h() {
        return this.f2967e;
    }

    /* renamed from: i */
    public long mo2594i() {
        long j = this.f2968f;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    /* renamed from: j */
    public int mo2595j() {
        int i = this.f2969g;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    /* renamed from: k */
    public String mo2596k() {
        return this.f2970h;
    }

    /* renamed from: l */
    public int mo2597l() {
        int i = this.f2971i;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    public String mo2598m() {
        return this.f2972j;
    }

    /* renamed from: n */
    public String mo2599n() {
        return this.f2973k;
    }

    /* renamed from: o */
    public String mo2600o() {
        return this.f2974l;
    }

    /* renamed from: p */
    public String mo2601p() {
        return this.f2976n;
    }
}
