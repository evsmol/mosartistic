package com.iab.omid.library.appodeal.p105b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.adsession.C4259a;
import com.iab.omid.library.appodeal.p104a.C4255b;
import com.iab.omid.library.appodeal.p104a.C4256c;
import com.iab.omid.library.appodeal.p104a.C4257d;
import com.iab.omid.library.appodeal.p104a.C4258e;
import com.iab.omid.library.appodeal.p105b.C4262b;
import com.iab.omid.library.appodeal.walking.TreeWalker;

/* renamed from: com.iab.omid.library.appodeal.b.f */
public class C4268f implements C4256c, C4262b.C4263a {

    /* renamed from: a */
    private static C4268f f10188a;

    /* renamed from: b */
    private float f10189b = 0.0f;

    /* renamed from: c */
    private final C4258e f10190c;

    /* renamed from: d */
    private final C4255b f10191d;

    /* renamed from: e */
    private C4257d f10192e;

    /* renamed from: f */
    private C4261a f10193f;

    public C4268f(C4258e eVar, C4255b bVar) {
        this.f10190c = eVar;
        this.f10191d = bVar;
    }

    /* renamed from: a */
    public static C4268f m12029a() {
        if (f10188a == null) {
            f10188a = new C4268f(new C4258e(), new C4255b());
        }
        return f10188a;
    }

    /* renamed from: e */
    private C4261a m12030e() {
        if (this.f10193f == null) {
            this.f10193f = C4261a.m11989a();
        }
        return this.f10193f;
    }

    /* renamed from: a */
    public void mo32670a(float f) {
        this.f10189b = f;
        for (C4259a adSessionStatePublisher : m12030e().mo32746c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32796a(f);
        }
    }

    /* renamed from: a */
    public void mo32785a(Context context) {
        this.f10192e = this.f10190c.mo32674a(new Handler(), context, this.f10191d.mo32669a(), this);
    }

    /* renamed from: a */
    public void mo32761a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo32821a();
        } else {
            TreeWalker.getInstance().mo32824c();
        }
    }

    /* renamed from: b */
    public void mo32786b() {
        C4262b.m11996a().mo32750a((C4262b.C4263a) this);
        C4262b.m11996a().mo32751b();
        TreeWalker.getInstance().mo32821a();
        this.f10192e.mo32671a();
    }

    /* renamed from: c */
    public void mo32787c() {
        TreeWalker.getInstance().mo32823b();
        C4262b.m11996a().mo32752c();
        this.f10192e.mo32672b();
    }

    /* renamed from: d */
    public float mo32788d() {
        return this.f10189b;
    }
}
