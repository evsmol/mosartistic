package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.Oc */
public class C2373Oc {

    /* renamed from: a */
    private final LocationManager f6310a;

    /* renamed from: b */
    private final C2081H2 f6311b;

    /* renamed from: c */
    private final C2723Xj f6312c = C2007F0.m7154g().mo15759v();

    public C2373Oc(Context context) {
        this.f6310a = (LocationManager) context.getSystemService("location");
        this.f6311b = C2081H2.m7295a(context);
    }

    /* renamed from: a */
    public LocationManager mo16391a() {
        return this.f6310a;
    }

    /* renamed from: b */
    public C2723Xj mo16392b() {
        return this.f6312c;
    }

    /* renamed from: c */
    public C2081H2 mo16393c() {
        return this.f6311b;
    }
}
