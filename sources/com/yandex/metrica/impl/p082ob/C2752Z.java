package com.yandex.metrica.impl.p082ob;

import android.content.ContentValues;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Z */
public final class C2752Z<T> {

    /* renamed from: a */
    private final C2672W<T> f7244a;

    /* renamed from: b */
    private final C2697X<T> f7245b;

    /* renamed from: c */
    private final C1972E0 f7246c;

    /* renamed from: d */
    private final String f7247d;

    public C2752Z(C2672W<T> w, C2697X<T> x, C1972E0 e0, String str) {
        this.f7244a = w;
        this.f7245b = x;
        this.f7246c = e0;
        this.f7247d = str;
    }

    /* renamed from: a */
    public final void mo17086a(Context context, ContentValues contentValues) {
        try {
            Object invoke = this.f7244a.invoke(contentValues);
            if (invoke != null) {
                this.f7246c.mo15645a(context);
                if (((Boolean) this.f7245b.invoke(invoke)).booleanValue()) {
                    C3015h2.m9658a("Successfully saved " + this.f7247d, new Object[0]);
                    return;
                }
                C3015h2.m9664b("Did not save " + this.f7247d + " because data is already present", new Object[0]);
            }
        } catch (Throwable th) {
            C3015h2.m9659a(th, "Unexpected error occurred", new Object[0]);
        }
    }
}
