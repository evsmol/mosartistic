package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.C4197a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.internal.c */
public class C4207c {

    /* renamed from: c */
    private static C4207c f10061c = new C4207c();

    /* renamed from: a */
    private final ArrayList<C4197a> f10062a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C4197a> f10063b = new ArrayList<>();

    private C4207c() {
    }

    /* renamed from: c */
    public static C4207c m11754c() {
        return f10061c;
    }

    /* renamed from: a */
    public Collection<C4197a> mo32544a() {
        return Collections.unmodifiableCollection(this.f10063b);
    }

    /* renamed from: a */
    public void mo32545a(C4197a aVar) {
        this.f10062a.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4197a> mo32546b() {
        return Collections.unmodifiableCollection(this.f10062a);
    }

    /* renamed from: b */
    public void mo32547b(C4197a aVar) {
        boolean d = mo32549d();
        this.f10062a.remove(aVar);
        this.f10063b.remove(aVar);
        if (d && !mo32549d()) {
            C4214h.m11798c().mo32590e();
        }
    }

    /* renamed from: c */
    public void mo32548c(C4197a aVar) {
        boolean d = mo32549d();
        this.f10063b.add(aVar);
        if (!d) {
            C4214h.m11798c().mo32589d();
        }
    }

    /* renamed from: d */
    public boolean mo32549d() {
        return this.f10063b.size() > 0;
    }
}
