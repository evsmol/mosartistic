package com.iab.omid.library.applovin.internal;

import android.content.Context;

/* renamed from: com.iab.omid.library.applovin.internal.f */
public class C4211f {

    /* renamed from: b */
    private static C4211f f10071b = new C4211f();

    /* renamed from: a */
    private Context f10072a;

    private C4211f() {
    }

    /* renamed from: b */
    public static C4211f m11776b() {
        return f10071b;
    }

    /* renamed from: a */
    public Context mo32567a() {
        return this.f10072a;
    }

    /* renamed from: a */
    public void mo32568a(Context context) {
        this.f10072a = context != null ? context.getApplicationContext() : null;
    }
}
