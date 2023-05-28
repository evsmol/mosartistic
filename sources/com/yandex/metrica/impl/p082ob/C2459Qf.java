package com.yandex.metrica.impl.p082ob;

/* renamed from: com.yandex.metrica.impl.ob.Qf */
public class C2459Qf implements C2252Kn<Void> {

    /* renamed from: a */
    private final C2522Sf f6528a;

    public C2459Qf(C2522Sf sf) {
        this.f6528a = sf;
    }

    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        Void voidR = (Void) obj;
        this.f6528a.getClass();
        if (C2470R2.m8229h()) {
            return C2167In.m7452a(this);
        }
        return C2167In.m7453a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public C2167In mo16520a() {
        this.f6528a.getClass();
        if (C2470R2.m8229h()) {
            return C2167In.m7452a(this);
        }
        return C2167In.m7453a(this, "YandexMetrica isn't initialized. Use YandexMetrica#activate(android.content.Context, String) method to activate.");
    }
}
