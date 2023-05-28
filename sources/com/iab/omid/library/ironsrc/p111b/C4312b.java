package com.iab.omid.library.ironsrc.p111b;

import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.C4309a;

/* renamed from: com.iab.omid.library.ironsrc.b.b */
public class C4312b {

    /* renamed from: a */
    private static C4312b f10287a = new C4312b();

    /* renamed from: b */
    private Context f10288b;

    /* renamed from: c */
    private boolean f10289c;

    /* renamed from: d */
    private boolean f10290d;

    /* renamed from: e */
    private C4313a f10291e;

    /* renamed from: com.iab.omid.library.ironsrc.b.b$a */
    public interface C4313a {
    }

    private C4312b() {
    }

    /* renamed from: a */
    public static C4312b m12220a() {
        return f10287a;
    }

    /* renamed from: e */
    private void m12221e() {
        boolean z = !this.f10290d;
        for (C4309a adSessionStatePublisher : C4311a.m12213a().mo32938b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32994a(z);
        }
    }

    /* renamed from: a */
    public void mo32943a(Context context) {
        this.f10288b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo32944a(C4313a aVar) {
        this.f10291e = aVar;
    }

    /* renamed from: b */
    public void mo32945b() {
        this.f10289c = true;
        m12221e();
    }

    /* renamed from: c */
    public void mo32946c() {
        this.f10289c = false;
        this.f10290d = false;
        this.f10291e = null;
    }

    /* renamed from: d */
    public boolean mo32947d() {
        return !this.f10290d;
    }
}
