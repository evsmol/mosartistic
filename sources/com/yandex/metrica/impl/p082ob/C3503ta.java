package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.ta */
public class C3503ta<T> {

    /* renamed from: a */
    private final Context f9133a;

    /* renamed from: b */
    private final String f9134b;

    /* renamed from: c */
    private final C3474sa<T> f9135c;

    /* renamed from: d */
    private final C3293nm<C3437ra, C3392qa> f9136d;

    /* renamed from: e */
    private final C3613wa f9137e;

    /* renamed from: f */
    private final C3578va f9138f;

    /* renamed from: g */
    private final C2291M0 f9139g;

    /* renamed from: h */
    private final TimeProvider f9140h;

    public C3503ta(Context context, C2444Q0 q0, String str, C3474sa<T> saVar, C3293nm<C3437ra, C3392qa> nmVar, C3613wa waVar) {
        this(context, str, saVar, nmVar, waVar, new C3578va(context, str, waVar, q0), C3322oh.m10248a(), new SystemTimeProvider());
    }

    /* renamed from: a */
    public synchronized void mo18230a(T t, C3437ra raVar) {
        if (this.f9138f.mo18326a(this.f9136d.mo15448a(raVar))) {
            this.f9139g.mo15482a(this.f9134b, this.f9135c.mo17884a(t));
            this.f9137e.mo17912a(new C2764Z8(C3093ja.m9805a(this.f9133a).mo17745g()), this.f9140h.currentTimeSeconds());
        }
    }

    public C3503ta(Context context, String str, C3474sa<T> saVar, C3293nm<C3437ra, C3392qa> nmVar, C3613wa waVar, C3578va vaVar, C2291M0 m0, TimeProvider timeProvider) {
        this.f9133a = context;
        this.f9134b = str;
        this.f9135c = saVar;
        this.f9136d = nmVar;
        this.f9137e = waVar;
        this.f9138f = vaVar;
        this.f9139g = m0;
        this.f9140h = timeProvider;
    }
}
