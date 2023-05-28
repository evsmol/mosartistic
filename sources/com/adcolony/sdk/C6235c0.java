package com.adcolony.sdk;

import com.adcolony.sdk.C6288e0;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.c0 */
class C6235c0 {
    /* renamed from: a */
    static C6294f1 m15063a(String str, String str2) {
        String str3;
        try {
            return new C6294f1(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C6288e0.C6289a().mo50644a(str3).mo50645a(C6288e0.f13498i);
            return new C6294f1();
        }
    }

    /* renamed from: b */
    static C6294f1 m15073b() {
        return new C6294f1();
    }

    /* renamed from: c */
    static double m15081c(C6294f1 f1Var, String str) {
        return f1Var.mo50672a(str, 0.0d);
    }

    /* renamed from: d */
    static int m15083d(C6294f1 f1Var, String str) {
        return f1Var.mo50701j(str);
    }

    /* renamed from: e */
    static C6290e1 m15084e(C6294f1 f1Var, String str) {
        return f1Var.mo50703l(str);
    }

    /* renamed from: f */
    static C6294f1 m15085f(C6294f1 f1Var, String str) {
        return f1Var.mo50704m(str);
    }

    /* renamed from: g */
    static Object m15086g(C6294f1 f1Var, String str) {
        Object o = f1Var.mo50706o(str);
        return o == null ? Boolean.FALSE : o;
    }

    /* renamed from: h */
    static String m15087h(C6294f1 f1Var, String str) {
        return f1Var.mo50707p(str);
    }

    /* renamed from: i */
    static String m15088i(C6294f1 f1Var, String str) {
        return f1Var.mo50708q(str);
    }

    /* renamed from: j */
    static boolean m15089j(C6294f1 f1Var, String str) {
        try {
            C6185a.m14887b().mo50805p().mo51061a(str, f1Var.toString(), false);
            return true;
        } catch (IOException e) {
            new C6288e0.C6289a().mo50644a("IOException in ADCJSON's saveObject: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: b */
    static C6294f1 m15074b(String str) {
        return m15063a(str, (String) null);
    }

    /* renamed from: c */
    static C6294f1 m15082c(String str) {
        try {
            String sb = C6185a.m14887b().mo50805p().mo51060a(str, false).toString();
            return m15063a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C6288e0.C6289a().mo50644a("IOException in ADCJSON's loadObject: ").mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return m15073b();
        }
    }

    /* renamed from: b */
    static String m15075b(C6290e1 e1Var, int i) {
        return e1Var.mo50655d(i);
    }

    /* renamed from: b */
    static boolean m15076b(C6294f1 f1Var, String str) {
        return f1Var.mo50697f(str);
    }

    /* renamed from: b */
    static boolean m15077b(C6294f1 f1Var, String str, int i) {
        try {
            f1Var.mo50686b(str, i);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putInteger(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + i).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static C6290e1 m15059a() {
        return new C6290e1();
    }

    /* renamed from: a */
    static C6290e1 m15061a(String str) {
        try {
            return new C6290e1(str);
        } catch (JSONException e) {
            new C6288e0.C6289a().mo50644a(e.toString()).mo50645a(C6288e0.f13498i);
            return new C6290e1();
        }
    }

    /* renamed from: b */
    static boolean m15078b(C6294f1 f1Var, String str, long j) {
        try {
            f1Var.mo50687b(str, j);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putLong(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + j).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static int m15057a(C6294f1 f1Var, String str, int i) {
        return f1Var.mo50673a(str, i);
    }

    /* renamed from: a */
    static long m15058a(C6294f1 f1Var, String str, long j) {
        return f1Var.mo50674a(str, j);
    }

    /* renamed from: a */
    static boolean m15071a(C6294f1 f1Var, String str, boolean z) {
        return f1Var.mo50683a(str, z);
    }

    /* renamed from: a */
    static C6294f1 m15062a(C6290e1 e1Var, int i) {
        return e1Var.mo50653c(i);
    }

    /* renamed from: a */
    static C6290e1 m15060a(C6294f1 f1Var, String str) {
        return f1Var.mo50702k(str);
    }

    /* renamed from: b */
    static boolean m15079b(C6294f1 f1Var, String str, boolean z) {
        try {
            f1Var.mo50688b(str, z);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putBoolean(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + z).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m15070a(C6294f1 f1Var, String str, String str2) {
        try {
            f1Var.mo50677a(str, str2);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putString(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + str2).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: b */
    static C6294f1[] m15080b(C6290e1 e1Var) {
        return e1Var.mo50654c();
    }

    /* renamed from: a */
    static boolean m15068a(C6294f1 f1Var, String str, C6290e1 e1Var) {
        try {
            f1Var.mo50675a(str, e1Var);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putArray(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + e1Var).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m15069a(C6294f1 f1Var, String str, C6294f1 f1Var2) {
        try {
            f1Var.mo50676a(str, f1Var2);
            return true;
        } catch (JSONException e) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putObject(): ").mo50644a(e.toString());
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + f1Var2).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m15067a(C6294f1 f1Var, String str, double d) {
        try {
            f1Var.mo50685b(str, d);
            return true;
        } catch (JSONException unused) {
            C6288e0.C6289a a = new C6288e0.C6289a().mo50644a("JSON error in ADCJSON putDouble(): ");
            C6288e0.C6289a a2 = a.mo50644a(" with key: " + str);
            a2.mo50644a(" and value: " + d).mo50645a(C6288e0.f13498i);
            return false;
        }
    }

    /* renamed from: a */
    static void m15066a(C6290e1 e1Var, String str) {
        e1Var.mo50652b(str);
    }

    /* renamed from: a */
    static void m15065a(C6290e1 e1Var, C6294f1 f1Var) {
        e1Var.mo50646a(f1Var);
    }

    /* renamed from: a */
    static String[] m15072a(C6290e1 e1Var) {
        return e1Var.mo50656d();
    }

    /* renamed from: a */
    static C6294f1 m15064a(C6294f1... f1VarArr) {
        C6294f1 f1Var = new C6294f1();
        for (C6294f1 a : f1VarArr) {
            f1Var.mo50680a(a);
        }
        return f1Var;
    }
}
