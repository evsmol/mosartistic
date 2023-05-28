package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.xd */
class C3662xd implements C3618wd {

    /* renamed from: a */
    private final boolean f9458a;

    C3662xd(boolean z) {
        this.f9458a = z;
    }

    /* renamed from: a */
    public boolean mo15785a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f9458a;
        }
        return true;
    }

    public String toString() {
        return "LocationFlagStrategy{mEnabled=" + this.f9458a + '}';
    }
}
