package com.bytedance.sdk.component.adexpress.dynamic.p303b;

import android.graphics.Color;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.adexpress.C10303c;
import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10373l;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.g */
/* compiled from: DynamicLayoutNativeValue */
public class C10350g {

    /* renamed from: a */
    public int f25669a;

    /* renamed from: b */
    public String f25670b;

    /* renamed from: c */
    private C10349f f25671c;

    /* renamed from: d */
    private C10348e f25672d;

    /* renamed from: e */
    private String f25673e;

    public C10350g(C10348e eVar) {
        this.f25672d = eVar;
        this.f25669a = eVar.mo63354a();
        this.f25670b = eVar.mo63360c();
        this.f25673e = eVar.mo63362d();
        if (C10303c.m29745c() == 1) {
            this.f25671c = eVar.mo63364f();
        } else {
            this.f25671c = eVar.mo63363e();
        }
        if (C10303c.m29744b()) {
            this.f25671c = eVar.mo63363e();
        }
    }

    /* renamed from: a */
    public int mo63513a() {
        return (int) this.f25671c.mo63436f();
    }

    /* renamed from: b */
    public int mo63516b() {
        return (int) this.f25671c.mo63451i();
    }

    /* renamed from: c */
    public int mo63517c() {
        return (int) this.f25671c.mo63441g();
    }

    /* renamed from: d */
    public int mo63518d() {
        return (int) this.f25671c.mo63446h();
    }

    /* renamed from: e */
    public float mo63519e() {
        return this.f25671c.mo63456j();
    }

    /* renamed from: f */
    public String mo63520f() {
        return this.f25669a == 0 ? this.f25670b : "";
    }

    /* renamed from: g */
    public int mo63521g() {
        return m30042a(this.f25671c.mo63472n());
    }

    /* renamed from: h */
    public int mo63522h() {
        String m = this.f25671c.mo63468m();
        if ("left".equals(m)) {
            return 2;
        }
        if ("center".equals(m)) {
            return 4;
        }
        if ("right".equals(m)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: i */
    public int mo63523i() {
        int h = mo63522h();
        if (h == 4) {
            return 17;
        }
        return h == 3 ? 5 : 3;
    }

    /* renamed from: j */
    public String mo63524j() {
        int i = this.f25669a;
        if (i == 2 || i == 13) {
            return this.f25670b;
        }
        return "";
    }

    /* renamed from: k */
    public String mo63525k() {
        return this.f25669a == 1 ? this.f25670b : "";
    }

    /* renamed from: l */
    public String mo63526l() {
        return this.f25673e;
    }

    /* renamed from: m */
    public double mo63527m() {
        if (this.f25669a == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f25670b);
                return !C10303c.m29744b() ? (double) ((int) parseDouble) : parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    /* renamed from: n */
    public double mo63528n() {
        return this.f25671c.mo63460k();
    }

    /* renamed from: o */
    public float mo63529o() {
        return this.f25671c.mo63420c();
    }

    /* renamed from: p */
    public int mo63530p() {
        return m30042a(this.f25671c.mo63478p());
    }

    /* renamed from: q */
    public float mo63531q() {
        return this.f25671c.mo63426d();
    }

    /* renamed from: r */
    public int mo63532r() {
        return this.f25671c.mo63405af();
    }

    /* renamed from: s */
    public boolean mo63533s() {
        return this.f25671c.mo63406ag();
    }

    /* renamed from: a */
    public void mo63514a(float f) {
        this.f25671c.mo63394a(f);
    }

    /* renamed from: t */
    public boolean mo63534t() {
        return this.f25671c.mo63500y();
    }

    /* renamed from: u */
    public int mo63535u() {
        return this.f25671c.mo63501z();
    }

    /* renamed from: v */
    public int mo63536v() {
        String u = this.f25671c.mo63492u();
        if ("skip-with-time-skip-btn".equals(this.f25672d.mo63357b()) || "skip".equals(this.f25672d.mo63357b()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f25672d.mo63357b())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f25672d.mo63357b()) && !"skip-with-time".equals(this.f25672d.mo63357b())) {
            if (this.f25669a == 10 && TextUtils.equals(this.f25671c.mo63494v(), Constants.CLICK)) {
                return 5;
            }
            if (m30040L() && m30041M()) {
                return 0;
            }
            if (m30040L()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f25672d.mo63357b())) {
                return 3;
            }
            if (!TextUtils.isEmpty(u) && !u.equals("none")) {
                if (u.equals("video") || (this.f25672d.mo63354a() == 7 && TextUtils.equals(u, "normal"))) {
                    return (!C10303c.m29744b() || this.f25672d.mo63363e() == null || !this.f25672d.mo63363e().mo63408ai()) ? 4 : 11;
                }
                if (u.equals("normal")) {
                    return 1;
                }
                if (!u.equals("creative") && !"slide".equals(this.f25671c.mo63494v())) {
                    return 0;
                }
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: L */
    private boolean m30040L() {
        return "logo-union".equals(this.f25672d.mo63357b()) || "logounion".equals(this.f25672d.mo63357b()) || "logoad".equals(this.f25672d.mo63357b());
    }

    /* renamed from: w */
    public int mo63537w() {
        return m30042a(this.f25671c.mo63475o());
    }

    /* renamed from: x */
    public int mo63538x() {
        return this.f25671c.mo63392a();
    }

    /* renamed from: y */
    public String mo63539y() {
        return this.f25671c.mo63413b();
    }

    /* renamed from: z */
    public String mo63540z() {
        return this.f25671c.mo63494v();
    }

    /* renamed from: M */
    private boolean m30041M() {
        if (C10303c.m29744b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f25670b) || !this.f25670b.contains("adx:")) && !C10373l.m30211b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m30042a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba") || (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) == null || split.length != 4) {
            return -16777216;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
    }

    /* renamed from: b */
    public static float[] m30043b(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split == null || split.length != 4) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    /* renamed from: a */
    public boolean mo63515a(int i) {
        C10348e eVar = this.f25672d;
        if (eVar == null) {
            return false;
        }
        if (i == 1) {
            this.f25671c = eVar.mo63364f();
        } else {
            this.f25671c = eVar.mo63363e();
        }
        if (this.f25671c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean mo63502A() {
        return this.f25671c.mo63383R();
    }

    /* renamed from: B */
    public int mo63503B() {
        return this.f25671c.mo63385T();
    }

    /* renamed from: C */
    public int mo63504C() {
        return this.f25671c.mo63384S();
    }

    /* renamed from: D */
    public String mo63505D() {
        return this.f25671c.mo63490t();
    }

    /* renamed from: E */
    public int mo63506E() {
        return this.f25671c.mo63404ae();
    }

    /* renamed from: F */
    public int mo63507F() {
        return this.f25671c.mo63409aj();
    }

    /* renamed from: G */
    public int mo63508G() {
        return this.f25671c.mo63401ab();
    }

    /* renamed from: H */
    public int mo63509H() {
        return this.f25671c.mo63400aa();
    }

    /* renamed from: I */
    public String mo63510I() {
        return this.f25671c.mo63487s();
    }

    /* renamed from: J */
    public boolean mo63511J() {
        return this.f25671c.mo63435e();
    }

    /* renamed from: K */
    public String mo63512K() {
        return this.f25672d.mo63357b() + ":" + this.f25671c.mo63403ad();
    }
}
