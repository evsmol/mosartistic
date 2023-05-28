package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.al */
public class C2811al implements C3420qk {

    /* renamed from: a */
    private final int f7403a;

    public C2811al(int i) {
        this.f7403a = i;
    }

    /* renamed from: a */
    public void mo17195a(C2845bl blVar) {
        if (blVar.f7498h.length() > this.f7403a) {
            int length = blVar.f7498h.length();
            int i = this.f7403a;
            int i2 = length - i;
            String substring = blVar.f7498h.substring(0, i);
            blVar.f7498h = substring;
            blVar.f7500j = Integer.valueOf(substring.length() + i2);
        }
    }
}
