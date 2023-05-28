package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Qa */
public class C2454Qa implements C2020Fa<C2890db> {

    /* renamed from: a */
    private final C2183Ja f6523a;

    /* renamed from: b */
    private final C2304Ma f6524b;

    public C2454Qa() {
        this(new C2183Ja(), new C2304Ma());
    }

    public Object fromModel(Object obj) {
        C2336Na<C3211mf.C3225m, C2671Vm> na;
        C2890db dbVar = (C2890db) obj;
        C3211mf mfVar = new C3211mf();
        mfVar.f8325a = 3;
        mfVar.f8328d = new C3211mf.C3228p();
        C2336Na<C3211mf.C3223k, C2671Vm> a = this.f6523a.fromModel(dbVar.f7635b);
        mfVar.f8328d.f8376a = (C3211mf.C3223k) a.f6259a;
        C2800ab abVar = dbVar.f7636c;
        if (abVar != null) {
            na = this.f6524b.fromModel(abVar);
            mfVar.f8328d.f8377b = (C3211mf.C3225m) na.f6259a;
        } else {
            na = null;
        }
        return Collections.singletonList(new C2336Na(mfVar, C2643Um.m8747a(a, na)));
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    C2454Qa(C2183Ja ja, C2304Ma ma) {
        this.f6523a = ja;
        this.f6524b = ma;
    }
}
