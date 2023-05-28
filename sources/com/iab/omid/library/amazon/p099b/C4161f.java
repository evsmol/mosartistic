package com.iab.omid.library.amazon.p099b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.adsession.C4152a;
import com.iab.omid.library.amazon.p098a.C4148b;
import com.iab.omid.library.amazon.p098a.C4149c;
import com.iab.omid.library.amazon.p098a.C4150d;
import com.iab.omid.library.amazon.p098a.C4151e;
import com.iab.omid.library.amazon.p099b.C4155b;
import com.iab.omid.library.amazon.walking.TreeWalker;

/* renamed from: com.iab.omid.library.amazon.b.f */
public class C4161f implements C4149c, C4155b.C4156a {

    /* renamed from: a */
    private static C4161f f9947a;

    /* renamed from: b */
    private float f9948b = 0.0f;

    /* renamed from: c */
    private final C4151e f9949c;

    /* renamed from: d */
    private final C4148b f9950d;

    /* renamed from: e */
    private C4150d f9951e;

    /* renamed from: f */
    private C4154a f9952f;

    public C4161f(C4151e eVar, C4148b bVar) {
        this.f9949c = eVar;
        this.f9950d = bVar;
    }

    /* renamed from: a */
    public static C4161f m11548a() {
        if (f9947a == null) {
            f9947a = new C4161f(new C4151e(), new C4148b());
        }
        return f9947a;
    }

    /* renamed from: e */
    private C4154a m11549e() {
        if (this.f9952f == null) {
            this.f9952f = C4154a.m11508a();
        }
        return this.f9952f;
    }

    /* renamed from: a */
    public void mo32259a(float f) {
        this.f9948b = f;
        for (C4152a adSessionStatePublisher : m11549e().mo32339c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32389a(f);
        }
    }

    /* renamed from: a */
    public void mo32378a(Context context) {
        this.f9951e = this.f9949c.mo32263a(new Handler(), context, this.f9950d.mo32258a(), this);
    }

    /* renamed from: a */
    public void mo32354a(boolean z) {
        if (z) {
            TreeWalker.getInstance().mo32414a();
        } else {
            TreeWalker.getInstance().mo32417c();
        }
    }

    /* renamed from: b */
    public void mo32379b() {
        C4155b.m11515a().mo32343a((C4155b.C4156a) this);
        C4155b.m11515a().mo32344b();
        TreeWalker.getInstance().mo32414a();
        this.f9951e.mo32260a();
    }

    /* renamed from: c */
    public void mo32380c() {
        TreeWalker.getInstance().mo32416b();
        C4155b.m11515a().mo32345c();
        this.f9951e.mo32261b();
    }

    /* renamed from: d */
    public float mo32381d() {
        return this.f9948b;
    }
}
