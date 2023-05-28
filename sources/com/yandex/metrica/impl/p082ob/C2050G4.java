package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.G4 */
public class C2050G4 extends C2230K4<C2298M4> {

    /* renamed from: a */
    private final C3528u5 f5443a;

    public C2050G4(C2011F3 f3) {
        this.f5443a = new C3528u5(f3);
    }

    /* renamed from: a */
    public C2083H4<C2298M4> mo15815a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = C2788a1.m8989a(i).ordinal();
        if (ordinal == 16) {
            arrayList.add(this.f5443a.mo18247a());
        } else if (ordinal == 24) {
            arrayList.add(this.f5443a.mo18248b());
        } else if (ordinal == 47) {
            arrayList.add(this.f5443a.mo18249c());
        }
        return new C2083H4<>(arrayList);
    }
}
