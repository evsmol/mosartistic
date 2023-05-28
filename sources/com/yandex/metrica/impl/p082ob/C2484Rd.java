package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Rd */
public class C2484Rd {

    /* renamed from: a */
    private final String f6570a;

    /* renamed from: b */
    private final String f6571b;

    public C2484Rd(String str) {
        this(str, (String) null);
    }

    /* renamed from: a */
    public String mo16558a() {
        return this.f6571b;
    }

    /* renamed from: b */
    public String mo16560b() {
        return this.f6570a;
    }

    public C2484Rd(String str, String str2) {
        this.f6570a = str;
        this.f6571b = mo16559a(str2);
    }

    /* renamed from: a */
    public final String mo16559a(String str) {
        if (str == null) {
            return this.f6570a;
        }
        return this.f6570a + str;
    }
}
