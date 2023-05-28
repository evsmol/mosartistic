package com.yandex.metrica.impl.p082ob;

import android.app.Activity;
import com.yandex.metrica.impl.p082ob.C3710yl;
import com.yandex.metrica.uiaccessor.C3786b;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Lk */
class C2285Lk implements C3673xl {

    /* renamed from: a */
    private final C3786b f6118a;

    /* renamed from: b */
    private final C3710yl.C3711a f6119b;

    /* renamed from: c */
    private final C2003El f6120c;

    /* renamed from: d */
    private final C1964Dl f6121d;

    C2285Lk(C3240mm<Activity> mmVar, C2003El el) {
        this(new C3710yl.C3711a(), mmVar, el, new C2000Ek(), new C1964Dl());
    }

    /* renamed from: a */
    public void mo16227a(Activity activity, long j) {
    }

    /* renamed from: a */
    public void mo16228a(Activity activity, boolean z) {
        if (!z) {
            try {
                this.f6118a.subscribe(activity);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean mo16230a(C2972fl flVar) {
        return false;
    }

    C2285Lk(C3710yl.C3711a aVar, C3240mm<Activity> mmVar, C2003El el, C2000Ek ek, C1964Dl dl) {
        this.f6119b = aVar;
        this.f6120c = el;
        this.f6118a = ek.mo15729a(mmVar);
        this.f6121d = dl;
    }

    /* renamed from: a */
    public void mo16225a(long j, Activity activity, C2903dl dlVar, List<C3454rl> list, C2972fl flVar, C1900Bk bk) {
        C3040hl hlVar;
        C3040hl hlVar2;
        if (flVar.f7868b && (hlVar2 = flVar.f7872f) != null) {
            this.f6120c.mo15734b(this.f6121d.mo18047a(activity, dlVar, hlVar2, bk.mo15569b(), j));
        }
        if (flVar.f7870d && (hlVar = flVar.f7874h) != null) {
            this.f6120c.mo15733a(this.f6121d.mo18047a(activity, dlVar, hlVar, bk.mo15571d(), j));
        }
    }

    /* renamed from: a */
    public void mo16229a(Throwable th, C3634wl wlVar) {
        this.f6119b.getClass();
        new C3710yl(wlVar, C3322oh.m10248a()).mo18437a("ui_parsing", th);
    }

    /* renamed from: a */
    public void mo16226a(Activity activity) {
        try {
            this.f6118a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
