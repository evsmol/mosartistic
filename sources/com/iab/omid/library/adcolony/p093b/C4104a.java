package com.iab.omid.library.adcolony.p093b;

import com.iab.omid.library.adcolony.adsession.C4102a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.a */
public class C4104a {

    /* renamed from: a */
    private static C4104a f9813a = new C4104a();

    /* renamed from: b */
    private final ArrayList<C4102a> f9814b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4102a> f9815c = new ArrayList<>();

    private C4104a() {
    }

    /* renamed from: a */
    public static C4104a m11278a() {
        return f9813a;
    }

    /* renamed from: a */
    public void mo32137a(C4102a aVar) {
        this.f9814b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4102a> mo32138b() {
        return Collections.unmodifiableCollection(this.f9814b);
    }

    /* renamed from: b */
    public void mo32139b(C4102a aVar) {
        boolean d = mo32142d();
        this.f9815c.add(aVar);
        if (!d) {
            C4111f.m11318a().mo32180b();
        }
    }

    /* renamed from: c */
    public Collection<C4102a> mo32140c() {
        return Collections.unmodifiableCollection(this.f9815c);
    }

    /* renamed from: c */
    public void mo32141c(C4102a aVar) {
        boolean d = mo32142d();
        this.f9814b.remove(aVar);
        this.f9815c.remove(aVar);
        if (d && !mo32142d()) {
            C4111f.m11318a().mo32181c();
        }
    }

    /* renamed from: d */
    public boolean mo32142d() {
        return this.f9815c.size() > 0;
    }
}
