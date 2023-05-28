package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ja */
public class C3093ja {

    /* renamed from: y */
    private static volatile C3093ja f8134y;

    /* renamed from: a */
    private final Map<String, C2368O7> f8135a = new HashMap();

    /* renamed from: b */
    private final Map<String, C2511S7> f8136b = new HashMap();

    /* renamed from: c */
    private final Map<String, C2476R7> f8137c = new HashMap();

    /* renamed from: d */
    private final C2301M7 f8138d;

    /* renamed from: e */
    private final Context f8139e;

    /* renamed from: f */
    private C2368O7 f8140f;

    /* renamed from: g */
    private C2368O7 f8141g;

    /* renamed from: h */
    private C2476R7 f8142h;

    /* renamed from: i */
    private C2476R7 f8143i;

    /* renamed from: j */
    private C2476R7 f8144j;

    /* renamed from: k */
    private C2476R7 f8145k;

    /* renamed from: l */
    private C2511S7 f8146l;

    /* renamed from: m */
    private C2511S7 f8147m;

    /* renamed from: n */
    private C2511S7 f8148n;

    /* renamed from: o */
    private C2511S7 f8149o;

    /* renamed from: p */
    private C2511S7 f8150p;

    /* renamed from: q */
    private C2511S7 f8151q;

    /* renamed from: r */
    private C2594U7 f8152r;

    /* renamed from: s */
    private C2555T7 f8153s;

    /* renamed from: t */
    private C2655V7 f8154t;

    /* renamed from: u */
    private C2511S7 f8155u;

    /* renamed from: v */
    private C3022h8 f8156v;

    /* renamed from: w */
    private final C1877B0 f8157w;

    /* renamed from: x */
    private final C3122ka f8158x;

    public C3093ja(Context context, C2301M7 m7, C1877B0 b0) {
        this.f8139e = context;
        this.f8138d = m7;
        this.f8157w = b0;
        this.f8158x = new C3122ka(context, b0);
    }

    /* renamed from: a */
    public static C3093ja m9805a(Context context) {
        if (f8134y == null) {
            synchronized (C3093ja.class) {
                if (f8134y == null) {
                    f8134y = new C3093ja(context.getApplicationContext(), C3084j8.m9804a(), new C1877B0());
                }
            }
        }
        return f8134y;
    }

    /* renamed from: k */
    private C2476R7 m9807k() {
        C2368O7 o7;
        if (this.f8144j == null) {
            synchronized (this) {
                if (this.f8141g == null) {
                    this.f8141g = new C2368O7(this.f8139e, m9806a("metrica_aip.db"), this.f8138d.mo16265a());
                }
                o7 = this.f8141g;
            }
            this.f8144j = new C3024ha(new C3053i8(o7), "binary_data");
        }
        return this.f8144j;
    }

    /* renamed from: l */
    private C2511S7 m9808l() {
        C3022h8 h8Var;
        if (this.f8150p == null) {
            synchronized (this) {
                if (this.f8156v == null) {
                    String a = m9806a("metrica_client_data.db");
                    Context context = this.f8139e;
                    this.f8156v = new C3022h8(context, a, new C3518tm(context, "metrica_client_data.db"), this.f8138d.mo16266b());
                }
                h8Var = this.f8156v;
            }
            this.f8150p = new C3152la("preferences", (C2988g8) h8Var);
        }
        return this.f8150p;
    }

    /* renamed from: m */
    private C2476R7 m9809m() {
        if (this.f8142h == null) {
            this.f8142h = new C3024ha(new C3053i8(mo17753r()), "binary_data");
        }
        return this.f8142h;
    }

    /* renamed from: b */
    public synchronized C2511S7 mo17739b(C2108I3 i3) {
        C2511S7 s7;
        String i32 = i3.toString();
        s7 = this.f8136b.get(i32);
        if (s7 == null) {
            s7 = new C3152la(mo17740c(i3), "preferences");
            this.f8136b.put(i32, s7);
        }
        return s7;
    }

    /* renamed from: c */
    public synchronized C2511S7 mo17741c() {
        if (this.f8151q == null) {
            this.f8151q = new C3206ma(this.f8139e, C2681W7.CLIENT, m9808l());
        }
        return this.f8151q;
    }

    /* renamed from: d */
    public synchronized C2511S7 mo17742d() {
        return m9808l();
    }

    /* renamed from: e */
    public synchronized C2555T7 mo17743e() {
        if (this.f8153s == null) {
            this.f8153s = new C2555T7(mo17753r());
        }
        return this.f8153s;
    }

    /* renamed from: f */
    public synchronized C2594U7 mo17744f() {
        if (this.f8152r == null) {
            this.f8152r = new C2594U7(mo17753r());
        }
        return this.f8152r;
    }

    /* renamed from: g */
    public synchronized C2511S7 mo17745g() {
        if (this.f8155u == null) {
            String a = m9806a("metrica_multiprocess_data.db");
            Context context = this.f8139e;
            this.f8155u = new C3152la("preferences", (C2988g8) new C3022h8(context, a, new C3518tm(context, "metrica_multiprocess_data.db"), this.f8138d.mo16268d()));
        }
        return this.f8155u;
    }

    /* renamed from: h */
    public synchronized C2655V7 mo17746h() {
        if (this.f8154t == null) {
            this.f8154t = new C2655V7(mo17753r(), "permissions");
        }
        return this.f8154t;
    }

    /* renamed from: i */
    public synchronized C2511S7 mo17747i() {
        if (this.f8147m == null) {
            Context context = this.f8139e;
            C2681W7 w7 = C2681W7.SERVICE;
            if (this.f8146l == null) {
                this.f8146l = new C3152la(mo17753r(), "preferences");
            }
            this.f8147m = new C3206ma(context, w7, this.f8146l);
        }
        return this.f8147m;
    }

    /* renamed from: j */
    public synchronized C2511S7 mo17748j() {
        if (this.f8146l == null) {
            this.f8146l = new C3152la(mo17753r(), "preferences");
        }
        return this.f8146l;
    }

    /* renamed from: n */
    public synchronized C2476R7 mo17749n() {
        if (this.f8143i == null) {
            this.f8143i = new C3055ia(this.f8139e, C2681W7.SERVICE, m9809m());
        }
        return this.f8143i;
    }

    /* renamed from: o */
    public synchronized C2476R7 mo17750o() {
        return m9809m();
    }

    /* renamed from: p */
    public synchronized C2511S7 mo17751p() {
        if (this.f8149o == null) {
            Context context = this.f8139e;
            C2681W7 w7 = C2681W7.SERVICE;
            if (this.f8148n == null) {
                this.f8148n = new C3152la(mo17753r(), "startup");
            }
            this.f8149o = new C3206ma(context, w7, this.f8148n);
        }
        return this.f8149o;
    }

    /* renamed from: q */
    public synchronized C2511S7 mo17752q() {
        if (this.f8148n == null) {
            this.f8148n = new C3152la(mo17753r(), "startup");
        }
        return this.f8148n;
    }

    /* renamed from: r */
    public synchronized C2368O7 mo17753r() {
        String str;
        if (this.f8140f == null) {
            File c = this.f8157w.mo15524c(this.f8139e);
            C2707X7 e = this.f8138d.mo16269e();
            Context context = this.f8139e;
            if (c == null || (str = this.f8158x.mo17778a("metrica_data.db", c)) == null) {
                str = m9806a("metrica_data.db");
            }
            this.f8140f = new C2368O7(context, str, e);
        }
        return this.f8140f;
    }

    /* renamed from: b */
    public synchronized C2476R7 mo17738b() {
        return m9807k();
    }

    /* renamed from: c */
    public synchronized C2368O7 mo17740c(C2108I3 i3) {
        C2368O7 o7;
        String str;
        String str2 = "db_metrica_" + i3;
        o7 = this.f8135a.get(str2);
        if (o7 == null) {
            File c = this.f8157w.mo15524c(this.f8139e);
            C2707X7 c2 = this.f8138d.mo16267c();
            Context context = this.f8139e;
            if (c == null || (str = this.f8158x.mo17778a(str2, c)) == null) {
                str = m9806a(str2);
            }
            C2368O7 o72 = new C2368O7(context, str, c2);
            this.f8135a.put(str2, o72);
            o7 = o72;
        }
        return o7;
    }

    /* renamed from: a */
    public synchronized C2476R7 mo17737a(C2108I3 i3) {
        C2476R7 r7;
        String i32 = i3.toString();
        r7 = this.f8137c.get(i32);
        if (r7 == null) {
            r7 = new C3024ha(new C3053i8(mo17740c(i3)), "binary_data");
            this.f8137c.put(i32, r7);
        }
        return r7;
    }

    /* renamed from: a */
    public synchronized C2476R7 mo17736a() {
        if (this.f8145k == null) {
            this.f8145k = new C3055ia(this.f8139e, C2681W7.AUTO_INAPP, m9807k());
        }
        return this.f8145k;
    }

    /* renamed from: a */
    private String m9806a(String str) {
        return C1848A2.m6808a(21) ? this.f8158x.mo17777a(str) : str;
    }
}
