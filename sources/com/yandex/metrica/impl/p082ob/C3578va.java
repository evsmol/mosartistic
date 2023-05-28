package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

/* renamed from: com.yandex.metrica.impl.ob.va */
public class C3578va {

    /* renamed from: a */
    private final Context f9311a;

    /* renamed from: b */
    private final String f9312b;

    /* renamed from: c */
    private final C3613wa f9313c;

    /* renamed from: d */
    private final C2444Q0 f9314d;

    /* renamed from: e */
    private final TimeProvider f9315e;

    /* renamed from: f */
    private final C3641x2 f9316f;

    public C3578va(Context context, String str, C3613wa waVar, C2444Q0 q0) {
        this(context, str, waVar, q0, new SystemTimeProvider(), new C3641x2());
    }

    /* renamed from: a */
    public boolean mo18326a(C3392qa qaVar) {
        long currentTimeSeconds = this.f9315e.currentTimeSeconds();
        if (qaVar == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = currentTimeSeconds <= qaVar.f8722a;
        if (!z2) {
            z = z2;
        } else if (currentTimeSeconds + this.f9314d.mo16498a() > qaVar.f8722a) {
            z = false;
        }
        if (!z) {
            return false;
        }
        C2764Z8 z8 = new C2764Z8(C3093ja.m9805a(this.f9311a).mo17745g());
        C3641x2 x2Var = this.f9316f;
        long a = this.f9313c.mo17911a(z8);
        long j = (long) qaVar.f8723b;
        return x2Var.mo18390b(a, j, this.f9312b + " diagnostics event");
    }

    C3578va(Context context, String str, C3613wa waVar, C2444Q0 q0, TimeProvider timeProvider, C3641x2 x2Var) {
        this.f9311a = context;
        this.f9312b = str;
        this.f9313c = waVar;
        this.f9314d = q0;
        this.f9315e = timeProvider;
        this.f9316f = x2Var;
    }
}
