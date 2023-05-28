package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1924Cf;
import com.yandex.metrica.impl.p082ob.C2600Ud;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.Wd */
public class C2687Wd implements ProtobufConverter<C2600Ud, C1924Cf> {

    /* renamed from: a */
    private final C2965fe f7088a;

    /* renamed from: b */
    private final C2520Sd f7089b;

    public C2687Wd() {
        this(new C2965fe(), new C2520Sd());
    }

    public Object fromModel(Object obj) {
        C2600Ud ud = (C2600Ud) obj;
        C1924Cf cf = new C1924Cf();
        cf.f5172a = this.f7088a.fromModel(ud.f6881a);
        cf.f5173b = new C1924Cf.C1926b[ud.f6882b.size()];
        int i = 0;
        for (C2600Ud.C2601a a : ud.f6882b) {
            cf.f5173b[i] = this.f7089b.fromModel(a);
            i++;
        }
        return cf;
    }

    public Object toModel(Object obj) {
        C2923ee eeVar;
        C1924Cf cf = (C1924Cf) obj;
        ArrayList arrayList = new ArrayList(cf.f5173b.length);
        for (C1924Cf.C1926b a : cf.f5173b) {
            arrayList.add(this.f7089b.toModel(a));
        }
        C1924Cf.C1925a aVar = cf.f5172a;
        if (aVar == null) {
            eeVar = this.f7088a.toModel(new C1924Cf.C1925a());
        } else {
            eeVar = this.f7088a.toModel(aVar);
        }
        return new C2600Ud(eeVar, arrayList);
    }

    C2687Wd(C2965fe feVar, C2520Sd sd) {
        this.f7088a = feVar;
        this.f7089b = sd;
    }
}
