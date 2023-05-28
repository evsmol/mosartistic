package com.iab.omid.library.amazon.p099b;

import com.iab.omid.library.amazon.adsession.C4152a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.amazon.b.a */
public class C4154a {

    /* renamed from: a */
    private static C4154a f9930a = new C4154a();

    /* renamed from: b */
    private final ArrayList<C4152a> f9931b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4152a> f9932c = new ArrayList<>();

    private C4154a() {
    }

    /* renamed from: a */
    public static C4154a m11508a() {
        return f9930a;
    }

    /* renamed from: a */
    public void mo32336a(C4152a aVar) {
        this.f9931b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4152a> mo32337b() {
        return Collections.unmodifiableCollection(this.f9931b);
    }

    /* renamed from: b */
    public void mo32338b(C4152a aVar) {
        boolean d = mo32341d();
        this.f9932c.add(aVar);
        if (!d) {
            C4161f.m11548a().mo32379b();
        }
    }

    /* renamed from: c */
    public Collection<C4152a> mo32339c() {
        return Collections.unmodifiableCollection(this.f9932c);
    }

    /* renamed from: c */
    public void mo32340c(C4152a aVar) {
        boolean d = mo32341d();
        this.f9931b.remove(aVar);
        this.f9932c.remove(aVar);
        if (d && !mo32341d()) {
            C4161f.m11548a().mo32380c();
        }
    }

    /* renamed from: d */
    public boolean mo32341d() {
        return this.f9932c.size() > 0;
    }
}
