package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.kn */
public class C3136kn extends C3043hn<String, C2671Vm> {
    public C3136kn(int i) {
        super(i);
    }

    /* renamed from: a */
    public C3011gn<String, C2671Vm> mo17691a(String str) {
        int i = 0;
        if (str != null && str.length() > mo17690a()) {
            String substring = str.substring(0, mo17690a());
            int length = C2814b.m9072b(str).length;
            int length2 = C2814b.m9072b(substring).length;
            String str2 = substring;
            i = str.getBytes().length - substring.getBytes().length;
            str = str2;
        }
        return new C3011gn<>(str, new C2643Um(i));
    }
}
