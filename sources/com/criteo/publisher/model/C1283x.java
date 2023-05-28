package com.criteo.publisher.model;

import android.content.Context;
import com.criteo.publisher.p067i0.C1150c;
import com.criteo.publisher.p074n0.C1289b;
import com.criteo.publisher.p074n0.C1300g;

/* renamed from: com.criteo.publisher.model.x */
/* compiled from: RemoteConfigRequestFactory */
public class C1283x {

    /* renamed from: a */
    private final Context f3984a;

    /* renamed from: b */
    private final String f3985b;

    /* renamed from: c */
    private final C1300g f3986c;

    /* renamed from: d */
    private final C1150c f3987d;

    /* renamed from: e */
    private final C1289b f3988e;

    public C1283x(Context context, String str, C1300g gVar, C1150c cVar, C1289b bVar) {
        this.f3984a = context;
        this.f3985b = str;
        this.f3986c = gVar;
        this.f3987d = cVar;
        this.f3988e = bVar;
    }

    /* renamed from: a */
    public C1282w mo3606a() {
        return C1282w.m5688a(this.f3985b, this.f3984a.getPackageName(), this.f3986c.mo3645q(), this.f3987d.mo3247b(), this.f3988e.mo3613b());
    }
}
