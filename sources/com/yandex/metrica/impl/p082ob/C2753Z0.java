package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Z0 */
public class C2753Z0 {

    /* renamed from: com.yandex.metrica.impl.ob.Z0$a */
    static class C2754a extends RuntimeException {
        public C2754a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String m8929a(int i) {
        Map<String, Integer> map = C2982g2.f7885a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : C2982g2.f7885a.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        return String.format("One of %s", new Object[]{arrayList});
    }

    /* renamed from: a */
    public static boolean m8930a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
