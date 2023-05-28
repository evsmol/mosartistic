package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3000gf;
import java.util.EnumMap;

/* renamed from: com.yandex.metrica.impl.ob.P6 */
public class C2419P6 implements ProtobufConverter<C2886d7, C3000gf> {

    /* renamed from: a */
    private static final EnumMap<C2987g7, Integer> f6428a;

    static {
        EnumMap<C2987g7, Integer> enumMap = new EnumMap<>(C2987g7.class);
        f6428a = enumMap;
        enumMap.put(C2987g7.UNKNOWN, 0);
        enumMap.put(C2987g7.BREAKPAD, 2);
        enumMap.put(C2987g7.CRASHPAD, 3);
    }

    /* renamed from: a */
    public C3000gf fromModel(C2886d7 d7Var) {
        C3000gf gfVar = new C3000gf();
        gfVar.f7913f = 1;
        C3000gf.C3001a aVar = new C3000gf.C3001a();
        gfVar.f7914g = aVar;
        aVar.f7918a = d7Var.mo17431a();
        C2859c7 b = d7Var.mo17432b();
        gfVar.f7914g.f7919b = new C3061if();
        Integer num = f6428a.get(b.mo17377b());
        if (num != null) {
            gfVar.f7914g.f7919b.f8058a = num.intValue();
        }
        C3061if ifVar = gfVar.f7914g.f7919b;
        String a = b.mo17376a();
        if (a == null) {
            a = "";
        }
        ifVar.f8059b = a;
        return gfVar;
    }

    public Object toModel(Object obj) {
        C3000gf gfVar = (C3000gf) obj;
        throw new UnsupportedOperationException();
    }
}
