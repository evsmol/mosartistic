package com.yandex.metrica;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.yandex.metrica.impl.p082ob.C1939D2;
import com.yandex.metrica.impl.p082ob.C2410P;
import com.yandex.metrica.impl.p082ob.C2470R2;
import com.yandex.metrica.impl.p082ob.C2522Sf;
import com.yandex.metrica.impl.p082ob.C2603Uf;
import com.yandex.metrica.impl.p082ob.C2786a0;
import com.yandex.metrica.impl.p082ob.C3302o2;
import com.yandex.metrica.impl.p082ob.C3364q;

/* renamed from: com.yandex.metrica.f */
public class C10722f {

    /* renamed from: a */
    private final C2522Sf f26861a;

    /* renamed from: b */
    private final C1939D2 f26862b;

    /* renamed from: c */
    private final C3364q f26863c;

    /* renamed from: d */
    private final C3302o2 f26864d;

    /* renamed from: e */
    private final C2786a0 f26865e;

    public C10722f(C2522Sf sf, C1939D2 d2) {
        this(sf, d2, C2410P.m8089g().mo16429b(), C2410P.m8089g().mo16438l(), C2410P.m8089g().mo16432e());
    }

    /* renamed from: a */
    public void mo64738a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C10725i iVar = (C10725i) yandexMetricaConfig;
        this.f26865e.mo17136a(context);
        Boolean bool = iVar.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            this.f26864d.mo17904a();
        }
        this.f26861a.getClass();
        C2470R2.m8217a(context).mo16542b(iVar);
    }

    /* renamed from: b */
    public void mo64740b(Context context) {
        this.f26865e.mo17136a(context);
    }

    /* renamed from: c */
    public void mo64741c(Context context) {
        this.f26865e.mo17136a(context);
    }

    public C10722f(C2522Sf sf, C1939D2 d2, C3364q qVar, C3302o2 o2Var, C2786a0 a0Var) {
        this.f26861a = sf;
        this.f26862b = d2;
        this.f26863c = qVar;
        this.f26864d = o2Var;
        this.f26865e = a0Var;
    }

    /* renamed from: a */
    public C3364q.C3367c mo64736a(Application application) {
        this.f26863c.mo18054a(application);
        return this.f26864d.mo17904a();
    }

    /* renamed from: a */
    public void mo64737a(Context context) {
        this.f26865e.mo17136a(context);
    }

    /* renamed from: a */
    public void mo64739a(WebView webView, C2603Uf uf) {
        this.f26862b.mo15603a(webView, uf);
    }
}
