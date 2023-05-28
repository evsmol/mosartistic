package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.tb */
public class C3504tb {

    /* renamed from: a */
    public final C3505a f9141a;

    /* renamed from: b */
    public final String f9142b;

    /* renamed from: c */
    public final Boolean f9143c;

    /* renamed from: com.yandex.metrica.impl.ob.tb$a */
    public enum C3505a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C3504tb(C3505a aVar, String str, Boolean bool) {
        this.f9141a = aVar;
        this.f9142b = str;
        this.f9143c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.f9141a + ", advId='" + this.f9142b + '\'' + ", limitedAdTracking=" + this.f9143c + '}';
    }
}
