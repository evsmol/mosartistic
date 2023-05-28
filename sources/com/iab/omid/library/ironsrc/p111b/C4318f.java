package com.iab.omid.library.ironsrc.p111b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.adsession.C4309a;
import com.iab.omid.library.ironsrc.p110a.C4305b;
import com.iab.omid.library.ironsrc.p110a.C4306c;
import com.iab.omid.library.ironsrc.p110a.C4307d;
import com.iab.omid.library.ironsrc.p110a.C4308e;
import com.iab.omid.library.ironsrc.p111b.C4312b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

/* renamed from: com.iab.omid.library.ironsrc.b.f */
public class C4318f implements C4306c, C4312b.C4313a {

    /* renamed from: a */
    private static C4318f f10302a;

    /* renamed from: b */
    private float f10303b = 0.0f;

    /* renamed from: c */
    private final C4308e f10304c;

    /* renamed from: d */
    private final C4305b f10305d;

    /* renamed from: e */
    private C4307d f10306e;

    /* renamed from: f */
    private C4311a f10307f;

    public C4318f(C4308e eVar, C4305b bVar) {
        this.f10304c = eVar;
        this.f10305d = bVar;
    }

    /* renamed from: a */
    public static C4318f m12251a() {
        if (f10302a == null) {
            f10302a = new C4318f(new C4308e(), new C4305b());
        }
        return f10302a;
    }

    /* renamed from: e */
    private C4311a m12252e() {
        if (this.f10307f == null) {
            this.f10307f = C4311a.m12213a();
        }
        return this.f10307f;
    }

    /* renamed from: a */
    public void mo32864a(float f) {
        this.f10303b = f;
        for (C4309a adSessionStatePublisher : m12252e().mo32940c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32982a(f);
        }
    }

    /* renamed from: a */
    public void mo32971a(Context context) {
        this.f10306e = this.f10304c.mo32868a(new Handler(), context, this.f10305d.mo32863a(), this);
    }

    /* renamed from: b */
    public void mo32972b() {
        C4312b.m12220a().mo32944a((C4312b.C4313a) this);
        C4312b.m12220a().mo32945b();
        if (C4312b.m12220a().mo32947d()) {
            TreeWalker.getInstance().mo33007a();
        }
        this.f10306e.mo32865a();
    }

    /* renamed from: c */
    public void mo32973c() {
        TreeWalker.getInstance().mo33009b();
        C4312b.m12220a().mo32946c();
        this.f10306e.mo32866b();
    }

    /* renamed from: d */
    public float mo32974d() {
        return this.f10303b;
    }
}
