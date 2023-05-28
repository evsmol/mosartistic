package com.yandex.metrica.impl.p082ob;

import java.util.LinkedList;

/* renamed from: com.yandex.metrica.impl.ob.J4 */
public class C2177J4 extends C2230K4<C2702X4> {

    /* renamed from: a */
    private final C3019h5 f5831a;

    /* renamed from: b */
    private final C2231K5 f5832b;

    /* renamed from: c */
    private final C2884d5 f5833c;

    public C2177J4(C2259L3 l3) {
        this.f5831a = new C3019h5(l3);
        this.f5832b = new C2231K5(l3);
        this.f5833c = new C2884d5(l3);
    }

    /* renamed from: a */
    public C2083H4<C2702X4> mo15815a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = C2788a1.m8989a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.f5831a);
        } else if (ordinal == 3) {
            linkedList.add(this.f5833c);
        } else if (ordinal == 40) {
            linkedList.add(this.f5832b);
            linkedList.add(this.f5831a);
        }
        return new C2083H4<>(linkedList);
    }
}
