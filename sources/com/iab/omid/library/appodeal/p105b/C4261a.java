package com.iab.omid.library.appodeal.p105b;

import com.iab.omid.library.appodeal.adsession.C4259a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.appodeal.b.a */
public class C4261a {

    /* renamed from: a */
    private static C4261a f10171a = new C4261a();

    /* renamed from: b */
    private final ArrayList<C4259a> f10172b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4259a> f10173c = new ArrayList<>();

    private C4261a() {
    }

    /* renamed from: a */
    public static C4261a m11989a() {
        return f10171a;
    }

    /* renamed from: a */
    public void mo32743a(C4259a aVar) {
        this.f10172b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4259a> mo32744b() {
        return Collections.unmodifiableCollection(this.f10172b);
    }

    /* renamed from: b */
    public void mo32745b(C4259a aVar) {
        boolean d = mo32748d();
        this.f10173c.add(aVar);
        if (!d) {
            C4268f.m12029a().mo32786b();
        }
    }

    /* renamed from: c */
    public Collection<C4259a> mo32746c() {
        return Collections.unmodifiableCollection(this.f10173c);
    }

    /* renamed from: c */
    public void mo32747c(C4259a aVar) {
        boolean d = mo32748d();
        this.f10172b.remove(aVar);
        this.f10173c.remove(aVar);
        if (d && !mo32748d()) {
            C4268f.m12029a().mo32787c();
        }
    }

    /* renamed from: d */
    public boolean mo32748d() {
        return this.f10173c.size() > 0;
    }
}
