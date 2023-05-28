package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.wk */
public class C3633wk {

    /* renamed from: a */
    public final int f9411a;

    /* renamed from: b */
    public final String f9412b;

    /* renamed from: c */
    private final int f9413c = m10978a();

    public C3633wk(int i, String str) {
        this.f9411a = i;
        this.f9412b = str;
    }

    /* renamed from: a */
    private int m10978a() {
        return (this.f9411a * 31) + this.f9412b.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3633wk.class != obj.getClass()) {
            return false;
        }
        C3633wk wkVar = (C3633wk) obj;
        if (this.f9411a != wkVar.f9411a) {
            return false;
        }
        return this.f9412b.equals(wkVar.f9412b);
    }

    public int hashCode() {
        return this.f9413c;
    }
}
