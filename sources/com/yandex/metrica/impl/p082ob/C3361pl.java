package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pl */
public class C3361pl {

    /* renamed from: a */
    private final C2248Kk f8645a;

    /* renamed from: b */
    private final C2164Ik f8646b;

    /* renamed from: c */
    private final C2209Jk f8647c;

    /* renamed from: d */
    private final C2066Gk f8648d;

    /* renamed from: e */
    private final String f8649e;

    public C3361pl(C2248Kk kk, C2164Ik ik, C2209Jk jk, C2066Gk gk, String str) {
        this.f8645a = kk;
        this.f8646b = ik;
        this.f8647c = jk;
        this.f8648d = gk;
        this.f8649e = str;
    }

    /* renamed from: a */
    public JSONObject mo18047a(Activity activity, C2903dl dlVar, C3040hl hlVar, C1870Ak ak, long j) {
        JSONObject a = this.f8645a.mo16085a(activity, j);
        try {
            this.f8647c.mo16049a(a, new JSONObject(), this.f8649e);
            this.f8647c.mo16049a(a, this.f8646b.mo15956a(dlVar, hlVar, ak, (a.toString().getBytes().length + (this.f8648d.mo15833a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f8649e);
        } catch (Throwable unused) {
        }
        return a;
    }
}
