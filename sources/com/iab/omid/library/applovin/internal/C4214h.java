package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.devicevolume.C4201b;
import com.iab.omid.library.applovin.devicevolume.C4202c;
import com.iab.omid.library.applovin.devicevolume.C4203d;
import com.iab.omid.library.applovin.devicevolume.C4204e;
import com.iab.omid.library.applovin.internal.C4208d;
import com.iab.omid.library.applovin.walking.TreeWalker;

/* renamed from: com.iab.omid.library.applovin.internal.h */
public class C4214h implements C4202c, C4208d.C4209a {

    /* renamed from: f */
    private static C4214h f10076f;

    /* renamed from: a */
    private float f10077a = 0.0f;

    /* renamed from: b */
    private final C4204e f10078b;

    /* renamed from: c */
    private final C4201b f10079c;

    /* renamed from: d */
    private C4203d f10080d;

    /* renamed from: e */
    private C4207c f10081e;

    public C4214h(C4204e eVar, C4201b bVar) {
        this.f10078b = eVar;
        this.f10079c = bVar;
    }

    /* renamed from: a */
    private C4207c m11797a() {
        if (this.f10081e == null) {
            this.f10081e = C4207c.m11754c();
        }
        return this.f10081e;
    }

    /* renamed from: c */
    public static C4214h m11798c() {
        if (f10076f == null) {
            f10076f = new C4214h(new C4204e(), new C4201b());
        }
        return f10076f;
    }

    /* renamed from: a */
    public void mo32533a(float f) {
        this.f10077a = f;
        for (C4197a adSessionStatePublisher : m11797a().mo32544a()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32598a(f);
        }
    }

    /* renamed from: a */
    public void mo32587a(Context context) {
        this.f10080d = this.f10078b.mo32537a(new Handler(), context, this.f10079c.mo32532a(), this);
    }

    /* renamed from: a */
    public void mo32539a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo32629h();
        } else {
            TreeWalker.getInstance().mo32628g();
        }
    }

    /* renamed from: b */
    public float mo32588b() {
        return this.f10077a;
    }

    /* renamed from: d */
    public void mo32589d() {
        C4206b.m11751g().mo32551a((C4208d.C4209a) this);
        C4206b.m11751g().mo32554e();
        TreeWalker.getInstance().mo32629h();
        this.f10080d.mo32534c();
    }

    /* renamed from: e */
    public void mo32590e() {
        TreeWalker.getInstance().mo32630j();
        C4206b.m11751g().mo32555f();
        this.f10080d.mo32535d();
    }
}
