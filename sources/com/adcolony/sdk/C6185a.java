package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import com.adcolony.sdk.C6288e0;

/* renamed from: com.adcolony.sdk.a */
class C6185a {

    /* renamed from: a */
    private static Context f13240a = null;

    /* renamed from: b */
    private static C6328k f13241b = null;

    /* renamed from: c */
    static boolean f13242c = false;

    /* renamed from: d */
    static boolean f13243d = false;

    /* renamed from: e */
    static boolean f13244e = false;

    /* renamed from: a */
    static void m14884a(AdColonyAppOptions adColonyAppOptions) {
        f13244e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    /* renamed from: b */
    static C6328k m14887b() {
        if (!m14890d()) {
            Context a = m14880a();
            if (a == null) {
                return new C6328k();
            }
            f13241b = new C6328k();
            f13241b.mo50779a(new AdColonyAppOptions().mo50288a(C6235c0.m15087h(C6235c0.m15082c(a.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), "appId")), false);
        }
        return f13241b;
    }

    /* renamed from: c */
    static boolean m14889c() {
        return f13240a != null;
    }

    /* renamed from: d */
    static boolean m14890d() {
        return f13241b != null;
    }

    /* renamed from: e */
    static boolean m14891e() {
        return f13242c;
    }

    /* renamed from: f */
    static void m14892f() {
        m14887b().mo50807r().mo50754j();
    }

    /* renamed from: a */
    static void m14883a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m14882a((!z || !(context instanceof Activity)) ? context : ((Activity) context).getApplication());
        f13243d = true;
        if (f13241b == null) {
            f13241b = new C6328k();
            adColonyAppOptions.mo50291b(context);
            f13241b.mo50779a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo50291b(context);
            f13241b.mo50778a(adColonyAppOptions);
        }
        m14884a(adColonyAppOptions);
        C6405q n = f13241b.mo50803n();
        n.mo50926a(context);
        n.mo50933b(context);
        new C6288e0.C6289a().mo50644a("Configuring AdColony").mo50645a(C6288e0.f13493d);
        f13241b.mo50788c(false);
        f13241b.mo50813x().mo51018g(false);
        f13241b.mo50791d(true);
        f13241b.mo50813x().mo51011c(false);
        f13241b.mo50813x().mo51013d(true);
    }

    /* renamed from: b */
    static void m14888b(String str, C6327j0 j0Var) {
        m14887b().mo50807r().mo50744b(str, j0Var);
    }

    /* renamed from: a */
    static void m14882a(Context context) {
        f13240a = context;
    }

    /* renamed from: a */
    static Context m14880a() {
        return f13240a;
    }

    /* renamed from: a */
    static void m14886a(String str, C6327j0 j0Var) {
        m14887b().mo50807r().mo50743a(str, j0Var);
    }

    /* renamed from: a */
    static C6327j0 m14881a(String str, C6327j0 j0Var, boolean z) {
        m14887b().mo50807r().mo50743a(str, j0Var);
        return j0Var;
    }

    /* renamed from: a */
    static void m14885a(String str, C6294f1 f1Var) {
        if (f1Var == null) {
            f1Var = C6235c0.m15073b();
        }
        C6235c0.m15070a(f1Var, "m_type", str);
        m14887b().mo50807r().mo50748c(f1Var);
    }
}
