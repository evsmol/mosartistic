package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.adsession.C4197a;
import com.iab.omid.library.applovin.internal.C4208d;
import com.iab.omid.library.applovin.utils.C4232f;
import java.util.Date;

/* renamed from: com.iab.omid.library.applovin.internal.a */
public class C4205a implements C4208d.C4209a {

    /* renamed from: f */
    private static C4205a f10054f = new C4205a(new C4208d());

    /* renamed from: a */
    protected C4232f f10055a = new C4232f();

    /* renamed from: b */
    private Date f10056b;

    /* renamed from: c */
    private boolean f10057c;

    /* renamed from: d */
    private C4208d f10058d;

    /* renamed from: e */
    private boolean f10059e;

    private C4205a(C4208d dVar) {
        this.f10058d = dVar;
    }

    /* renamed from: a */
    public static C4205a m11745a() {
        return f10054f;
    }

    /* renamed from: c */
    private void m11746c() {
        if (this.f10057c && this.f10056b != null) {
            for (C4197a adSessionStatePublisher : C4207c.m11754c().mo32544a()) {
                adSessionStatePublisher.getAdSessionStatePublisher().mo32609a(mo32540b());
            }
        }
    }

    /* renamed from: a */
    public void mo32538a(Context context) {
        if (!this.f10057c) {
            this.f10058d.mo32550a(context);
            this.f10058d.mo32551a((C4208d.C4209a) this);
            this.f10058d.mo32554e();
            this.f10059e = this.f10058d.mo32553c();
            this.f10057c = true;
        }
    }

    /* renamed from: a */
    public void mo32539a(boolean z) {
        if (!this.f10059e && z) {
            mo32541d();
        }
        this.f10059e = z;
    }

    /* renamed from: b */
    public Date mo32540b() {
        Date date = this.f10056b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void mo32541d() {
        Date a = this.f10055a.mo32625a();
        Date date = this.f10056b;
        if (date == null || a.after(date)) {
            this.f10056b = a;
            m11746c();
        }
    }
}
