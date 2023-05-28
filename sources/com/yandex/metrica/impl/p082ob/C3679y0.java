package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.y0 */
public enum C3679y0 {
    NATIVE(0),
    JS(1);
    

    /* renamed from: a */
    public final int f9487a;

    private C3679y0(int i) {
        this.f9487a = i;
    }

    /* renamed from: a */
    public static C3679y0 m11052a(int i) {
        C3679y0[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            C3679y0 y0Var = values[i2];
            if (y0Var.f9487a == i) {
                return y0Var;
            }
        }
        return NATIVE;
    }
}
