package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Oh */
public class C2402Oh {

    /* renamed from: a */
    public final List<Pair<String, C2403a>> f6376a;

    /* renamed from: com.yandex.metrica.impl.ob.Oh$a */
    public static class C2403a {

        /* renamed from: a */
        public final String f6377a;

        public C2403a(String str) {
            this.f6377a = str;
        }

        public String toString() {
            return this.f6377a;
        }
    }

    public C2402Oh(List<Pair<String, C2403a>> list) {
        this.f6376a = list;
    }

    public String toString() {
        return "AttributionConfig{deeplinkConditions=" + this.f6376a + '}';
    }
}
