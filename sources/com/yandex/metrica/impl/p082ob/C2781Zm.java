package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Zm */
public class C2781Zm {

    /* renamed from: a */
    private final String f7290a;

    /* renamed from: b */
    private final C2875cm f7291b;

    public C2781Zm(int i, String str, C2875cm cmVar) {
        this.f7290a = str;
        this.f7291b = cmVar;
    }

    /* renamed from: a */
    public boolean mo17130a(C2812am amVar, String str, String str2) {
        int a = amVar.mo17196a();
        if (str2 != null) {
            a += str2.length();
        }
        if (amVar.containsKey(str)) {
            String str3 = (String) amVar.get(str);
            if (str3 != null) {
                a -= str3.length();
            }
        } else {
            a += str.length();
        }
        return a > 4500;
    }

    /* renamed from: a */
    public void mo17129a(String str) {
        if (this.f7291b.isEnabled()) {
            this.f7291b.mo15270fw("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f7290a, 4500, str);
        }
    }
}
