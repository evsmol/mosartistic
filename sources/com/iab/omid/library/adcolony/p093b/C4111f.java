package com.iab.omid.library.adcolony.p093b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.adsession.C4102a;
import com.iab.omid.library.adcolony.p092a.C4098b;
import com.iab.omid.library.adcolony.p092a.C4099c;
import com.iab.omid.library.adcolony.p092a.C4100d;
import com.iab.omid.library.adcolony.p092a.C4101e;
import com.iab.omid.library.adcolony.p093b.C4105b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

/* renamed from: com.iab.omid.library.adcolony.b.f */
public class C4111f implements C4099c, C4105b.C4106a {

    /* renamed from: a */
    private static C4111f f9830a;

    /* renamed from: b */
    private float f9831b = 0.0f;

    /* renamed from: c */
    private final C4101e f9832c;

    /* renamed from: d */
    private final C4098b f9833d;

    /* renamed from: e */
    private C4100d f9834e;

    /* renamed from: f */
    private C4104a f9835f;

    public C4111f(C4101e eVar, C4098b bVar) {
        this.f9832c = eVar;
        this.f9833d = bVar;
    }

    /* renamed from: a */
    public static C4111f m11318a() {
        if (f9830a == null) {
            f9830a = new C4111f(new C4101e(), new C4098b());
        }
        return f9830a;
    }

    /* renamed from: e */
    private C4104a m11319e() {
        if (this.f9835f == null) {
            this.f9835f = C4104a.m11278a();
        }
        return this.f9835f;
    }

    /* renamed from: a */
    public void mo32060a(float f) {
        this.f9831b = f;
        for (C4102a adSessionStatePublisher : m11319e().mo32140c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32190a(f);
        }
    }

    /* renamed from: a */
    public void mo32179a(Context context) {
        this.f9834e = this.f9832c.mo32064a(new Handler(), context, this.f9833d.mo32059a(), this);
    }

    /* renamed from: a */
    public void mo32155a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo32215a();
        } else {
            TreeWalker.getInstance().mo32218c();
        }
    }

    /* renamed from: b */
    public void mo32180b() {
        C4105b.m11285a().mo32144a((C4105b.C4106a) this);
        C4105b.m11285a().mo32145b();
        TreeWalker.getInstance().mo32215a();
        this.f9834e.mo32061a();
    }

    /* renamed from: c */
    public void mo32181c() {
        TreeWalker.getInstance().mo32217b();
        C4105b.m11285a().mo32146c();
        this.f9834e.mo32062b();
    }

    /* renamed from: d */
    public float mo32182d() {
        return this.f9831b;
    }
}
