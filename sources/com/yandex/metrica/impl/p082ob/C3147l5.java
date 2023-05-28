package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.C10723g;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.l5 */
public class C3147l5 extends C2702X4 {
    public C3147l5(C2259L3 l3) {
        super(l3);
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        String p = c0Var.mo17347p();
        C10723g a = C2814b.m9060a(p);
        String h = mo17012a().mo16130h();
        C10723g a2 = C2814b.m9060a(h);
        if (!a.equals(a2)) {
            boolean z = false;
            if (TextUtils.isEmpty(a.mo64747c()) && !TextUtils.isEmpty(a2.mo64747c())) {
                c0Var.mo15970e(h);
                m9944a(c0Var, C3068im.LOGOUT);
            } else {
                if (!TextUtils.isEmpty(a.mo64747c()) && TextUtils.isEmpty(a2.mo64747c())) {
                    m9944a(c0Var, C3068im.LOGIN);
                } else {
                    if (!TextUtils.isEmpty(a.mo64747c()) && !a.mo64747c().equals(a2.mo64747c())) {
                        z = true;
                    }
                    if (z) {
                        m9944a(c0Var, C3068im.SWITCH);
                    } else {
                        m9944a(c0Var, C3068im.UPDATE);
                    }
                }
            }
            mo17012a().mo16121a(p);
        }
        return true;
    }

    /* renamed from: a */
    private void m9944a(C2851c0 c0Var, C3068im imVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", imVar.toString());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        c0Var.mo15971f(str);
        mo17012a().mo16140r().mo17146b(c0Var);
    }
}
