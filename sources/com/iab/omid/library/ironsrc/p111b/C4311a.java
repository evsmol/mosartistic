package com.iab.omid.library.ironsrc.p111b;

import com.iab.omid.library.ironsrc.adsession.C4309a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.b.a */
public class C4311a {

    /* renamed from: a */
    private static C4311a f10284a = new C4311a();

    /* renamed from: b */
    private final ArrayList<C4309a> f10285b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4309a> f10286c = new ArrayList<>();

    private C4311a() {
    }

    /* renamed from: a */
    public static C4311a m12213a() {
        return f10284a;
    }

    /* renamed from: a */
    public void mo32937a(C4309a aVar) {
        this.f10285b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4309a> mo32938b() {
        return Collections.unmodifiableCollection(this.f10285b);
    }

    /* renamed from: b */
    public void mo32939b(C4309a aVar) {
        boolean d = mo32942d();
        this.f10286c.add(aVar);
        if (!d) {
            C4318f.m12251a().mo32972b();
        }
    }

    /* renamed from: c */
    public Collection<C4309a> mo32940c() {
        return Collections.unmodifiableCollection(this.f10286c);
    }

    /* renamed from: c */
    public void mo32941c(C4309a aVar) {
        boolean d = mo32942d();
        this.f10285b.remove(aVar);
        this.f10286c.remove(aVar);
        if (d && !mo32942d()) {
            C4318f.m12251a().mo32973c();
        }
    }

    /* renamed from: d */
    public boolean mo32942d() {
        return this.f10286c.size() > 0;
    }
}
