package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.V6 */
public class C2654V6 implements ProtobufConverter<C1979E6, C3128kf> {

    /* renamed from: a */
    private final C2554T6 f7046a;

    public C2654V6() {
        this(new C2554T6());
    }

    /* renamed from: a */
    public C3128kf fromModel(C1979E6 e6) {
        C3128kf kfVar = new C3128kf();
        Integer num = e6.f5306e;
        kfVar.f8193e = num == null ? -1 : num.intValue();
        kfVar.f8192d = e6.f5305d;
        kfVar.f8190b = e6.f5303b;
        kfVar.f8189a = e6.f5302a;
        kfVar.f8191c = e6.f5304c;
        C2554T6 t6 = this.f7046a;
        List<StackTraceElement> list = e6.f5307f;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement d6 : list) {
            arrayList.add(new C1947D6(d6));
        }
        kfVar.f8194f = t6.fromModel(arrayList);
        return kfVar;
    }

    public Object toModel(Object obj) {
        C3128kf kfVar = (C3128kf) obj;
        throw new UnsupportedOperationException();
    }

    C2654V6(C2554T6 t6) {
        this.f7046a = t6;
    }
}
