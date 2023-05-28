package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Um */
public class C2643Um implements C2671Vm {

    /* renamed from: a */
    public final int f7018a;

    public C2643Um(int i) {
        this.f7018a = i;
    }

    /* renamed from: a */
    public int mo16355a() {
        return this.f7018a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f7018a + '}';
    }

    /* renamed from: a */
    public static C2671Vm m8747a(C2671Vm... vmArr) {
        int i = 0;
        for (C2671Vm vm : vmArr) {
            if (vm != null) {
                i += vm.mo16355a();
            }
        }
        return new C2643Um(i);
    }
}
