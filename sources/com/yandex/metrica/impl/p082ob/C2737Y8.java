package com.yandex.metrica.impl.p082ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Y8 */
public final class C2737Y8 {

    /* renamed from: a */
    private final C2827b8 f7226a;

    public C2737Y8(C2827b8 b8Var) {
        this.f7226a = b8Var;
    }

    /* renamed from: a */
    public final int mo17078a(int i) {
        JSONObject d = this.f7226a.mo17229d();
        if (d != null) {
            return d.optInt(String.valueOf(i));
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo17079a(int i, int i2) {
        JSONObject d = this.f7226a.mo17229d();
        if (d == null) {
            d = new JSONObject();
        }
        d.put(String.valueOf(i), i2);
        this.f7226a.mo17220a(d);
    }
}
