package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.D0 */
public enum C1936D0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);
    

    /* renamed from: a */
    public final int f5195a;

    private C1936D0(int i) {
        this.f5195a = i;
    }

    /* renamed from: a */
    public static C1936D0 m6984a(Integer num) {
        if (num != null) {
            C1936D0[] values = values();
            for (int i = 0; i < 3; i++) {
                C1936D0 d0 = values[i];
                if (d0.f5195a == num.intValue()) {
                    return d0;
                }
            }
        }
        return UNKNOWN;
    }
}
