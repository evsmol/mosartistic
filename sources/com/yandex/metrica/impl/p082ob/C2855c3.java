package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.billing_interface.C1798a;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.p082ob.C2947fa;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.c3 */
public class C2855c3 implements C3242n {

    /* renamed from: a */
    private final ProtobufStateStorage<C2700X2> f7548a;

    /* renamed from: b */
    private C2700X2 f7549b;

    public C2855c3(Context context) {
        this(C2947fa.C2949b.m9536a(C2700X2.class).mo17592a(context));
    }

    /* renamed from: a */
    public void mo17364a(List<C1798a> list, boolean z) {
        for (C1798a next : list) {
        }
        C2700X2 x2 = new C2700X2(list, z);
        this.f7549b = x2;
        this.f7548a.save(x2);
    }

    /* renamed from: b */
    public boolean mo17365b() {
        return this.f7549b.f7111b;
    }

    C2855c3(ProtobufStateStorage<C2700X2> protobufStateStorage) {
        this.f7548a = protobufStateStorage;
        this.f7549b = (C2700X2) protobufStateStorage.read();
    }

    /* renamed from: a */
    public List<C1798a> mo17363a() {
        return this.f7549b.f7110a;
    }
}
