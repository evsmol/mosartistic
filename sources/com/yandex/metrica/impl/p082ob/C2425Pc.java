package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Pc */
class C2425Pc {

    /* renamed from: a */
    private C2428c f6438a;

    /* renamed from: b */
    private C2426a f6439b;

    /* renamed from: c */
    private C2427b f6440c;

    /* renamed from: d */
    private Context f6441d;

    /* renamed from: e */
    private C3208mc f6442e;

    /* renamed from: f */
    private C2483Rc f6443f;

    /* renamed from: g */
    private C2518Sc f6444g;

    /* renamed from: h */
    private C2482Rb f6445h;

    /* renamed from: i */
    private final C3660xc f6446i;

    /* renamed from: j */
    private C2740Yb f6447j;

    /* renamed from: k */
    private Map<String, C3696yc> f6448k;

    /* renamed from: com.yandex.metrica.impl.ob.Pc$a */
    public static class C2426a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pc$b */
    public static class C2427b {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pc$c */
    public static class C2428c {
    }

    public C2425Pc(Context context, C3208mc mcVar, C2518Sc sc, C2482Rb rb, C2435Ph ph) {
        this(context, mcVar, new C2428c(), new C3660xc(ph), new C2426a(), new C2427b(), sc, rb);
    }

    /* renamed from: a */
    public void mo16454a(Location location) {
        String provider = location.getProvider();
        C3696yc ycVar = this.f6448k.get(provider);
        if (ycVar == null) {
            if (this.f6443f == null) {
                C2428c cVar = this.f6438a;
                Context context = this.f6441d;
                cVar.getClass();
                this.f6443f = new C2483Rc((C2644V<Location>) null, C3093ja.m9805a(context).mo17744f(), new C2659Vb(context), new SystemTimeProvider(), C2007F0.m7154g().mo15741c(), C2007F0.m7154g().mo15740b());
            }
            if (this.f6447j == null) {
                C2426a aVar = this.f6439b;
                C2483Rc rc = this.f6443f;
                C3660xc xcVar = this.f6446i;
                aVar.getClass();
                this.f6447j = new C2740Yb(rc, xcVar);
            }
            C2427b bVar = this.f6440c;
            C3208mc mcVar = this.f6442e;
            C2740Yb yb = this.f6447j;
            C2518Sc sc = this.f6444g;
            C2482Rb rb = this.f6445h;
            bVar.getClass();
            ycVar = new C3696yc(mcVar, yb, (Location) null, 0, new C3641x2(), sc, rb);
            this.f6448k.put(provider, ycVar);
        } else {
            ycVar.mo18422a(this.f6442e);
        }
        ycVar.mo18421a(location);
    }

    /* renamed from: b */
    public C3660xc mo16457b() {
        return this.f6446i;
    }

    C2425Pc(Context context, C3208mc mcVar, C2428c cVar, C3660xc xcVar, C2426a aVar, C2427b bVar, C2518Sc sc, C2482Rb rb) {
        this.f6448k = new HashMap();
        this.f6441d = context;
        this.f6442e = mcVar;
        this.f6438a = cVar;
        this.f6446i = xcVar;
        this.f6439b = aVar;
        this.f6440c = bVar;
        this.f6444g = sc;
        this.f6445h = rb;
    }

    /* renamed from: a */
    public Location mo16453a() {
        return (Location) this.f6446i.mo15800a();
    }

    /* renamed from: a */
    public void mo16455a(C3208mc mcVar) {
        this.f6442e = mcVar;
    }

    /* renamed from: a */
    public void mo16456a(C3356pi piVar) {
        if (piVar.mo17972d() != null) {
            this.f6446i.mo15806c(piVar.mo17972d());
        }
    }
}
