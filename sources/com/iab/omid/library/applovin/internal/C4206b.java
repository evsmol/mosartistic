package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C4197a;

/* renamed from: com.iab.omid.library.applovin.internal.b */
public class C4206b extends C4208d {

    /* renamed from: d */
    private static C4206b f10060d = new C4206b();

    private C4206b() {
    }

    /* renamed from: g */
    public static C4206b m11751g() {
        return f10060d;
    }

    /* renamed from: b */
    public void mo32542b(boolean z) {
        for (C4197a adSessionStatePublisher : C4207c.m11754c().mo32546b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo32611a(z);
        }
    }

    /* renamed from: d */
    public boolean mo32543d() {
        for (C4197a c : C4207c.m11754c().mo32544a()) {
            View c2 = c.mo32495c();
            if (c2 != null && c2.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
