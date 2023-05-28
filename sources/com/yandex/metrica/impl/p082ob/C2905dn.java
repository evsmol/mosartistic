package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.dn */
public class C2905dn extends C2538Sm<String> {
    public C2905dn(int i, String str) {
        this(i, str, C2875cm.m9327a());
    }

    public C2905dn(int i, String str, C2875cm cmVar) {
        super(i, str, cmVar);
    }

    /* renamed from: a */
    public String mo16729a(String str) {
        if (str == null || str.length() <= super.mo16652b()) {
            return str;
        }
        String substring = str.substring(0, super.mo16652b());
        if (this.f6743c.isEnabled()) {
            this.f6743c.mo15270fw("\"%s\" %s size exceeded limit of %d characters", super.mo16651a(), str, Integer.valueOf(super.mo16652b()));
        }
        return substring;
    }
}
