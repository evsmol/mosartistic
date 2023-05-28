package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.M */
public class C2290M {

    /* renamed from: a */
    private final C3450ri f6128a;

    /* renamed from: b */
    private final C3650xb f6129b;

    /* renamed from: c */
    private final Context f6130c;

    public C2290M(C3450ri riVar, C3650xb xbVar, Context context) {
        this.f6128a = riVar;
        this.f6129b = xbVar;
        this.f6130c = context;
    }

    /* renamed from: a */
    public C2253L mo16236a(Map<String, String> map) {
        return new C2253L(this.f6128a.mo18175d(), this.f6129b.mo18394a(this.f6130c, (C2057Gb) new C2021Fb()), map);
    }
}
