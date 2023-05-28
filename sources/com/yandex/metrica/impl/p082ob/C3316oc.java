package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3598w;

/* renamed from: com.yandex.metrica.impl.ob.oc */
public class C3316oc {

    /* renamed from: a */
    public final C3208mc f8509a;

    /* renamed from: b */
    public final C1862Ac f8510b;

    /* renamed from: com.yandex.metrica.impl.ob.oc$a */
    public enum C3317a {
        UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");
        

        /* renamed from: a */
        private final String f8516a;

        private C3317a(String str) {
            this.f8516a = str;
        }

        /* renamed from: a */
        public String mo17917a() {
            return this.f8516a;
        }

        public String toString() {
            return this.f8516a;
        }

        /* renamed from: a */
        public static C3317a m10242a(String str) {
            C3317a aVar = UNKNOWN;
            C3317a[] values = values();
            for (int i = 0; i < 4; i++) {
                C3317a aVar2 = values[i];
                if (aVar2.f8516a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        /* renamed from: a */
        public static C3317a m10241a(C3598w.C3599a aVar) {
            C3317a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                return BACKGROUND;
            }
            if (ordinal != 2) {
                return aVar2;
            }
            return VISIBLE;
        }
    }

    public C3316oc(C3208mc mcVar, C1862Ac ac) {
        this.f8509a = mcVar;
        this.f8510b = ac;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.f8509a + ", preconditions=" + this.f8510b + '}';
    }
}
