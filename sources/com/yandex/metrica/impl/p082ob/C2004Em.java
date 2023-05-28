package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Em */
public enum C2004Em {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);
    

    /* renamed from: a */
    private final int f5356a;

    private C2004Em(int i) {
        this.f5356a = i;
    }

    /* renamed from: a */
    public int mo15735a() {
        return this.f5356a;
    }

    /* renamed from: a */
    public static C2004Em m7149a(Integer num) {
        if (num != null) {
            C2004Em[] values = values();
            for (int i = 0; i < 3; i++) {
                C2004Em em = values[i];
                if (em.f5356a == num.intValue()) {
                    return em;
                }
            }
        }
        return NONE;
    }
}
