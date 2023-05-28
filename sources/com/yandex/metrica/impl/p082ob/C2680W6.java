package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.W6 */
public class C2680W6 implements ProtobufConverter<C2016F6, C3158lf> {

    /* renamed from: a */
    private final C2554T6 f7076a;

    public C2680W6() {
        this(new C2554T6());
    }

    /* renamed from: a */
    public C3158lf fromModel(C2016F6 f6) {
        C3158lf lfVar = new C3158lf();
        String b = f6.mo15779b();
        String str = "";
        if (b == null) {
            b = str;
        }
        lfVar.f8248a = b;
        String c = f6.mo15780c();
        if (c != null) {
            str = c;
        }
        lfVar.f8249b = str;
        lfVar.f8250c = this.f7076a.fromModel(f6.mo15781d());
        if (f6.mo15778a() != null) {
            lfVar.f8251d = fromModel(f6.mo15778a());
        }
        List<C2016F6> e = f6.mo15782e();
        int i = 0;
        if (e == null) {
            lfVar.f8252e = new C3158lf[0];
        } else {
            lfVar.f8252e = new C3158lf[e.size()];
            for (C2016F6 a : e) {
                lfVar.f8252e[i] = fromModel(a);
                i++;
            }
        }
        return lfVar;
    }

    public Object toModel(Object obj) {
        C3158lf lfVar = (C3158lf) obj;
        throw new UnsupportedOperationException();
    }

    C2680W6(C2554T6 t6) {
        this.f7076a = t6;
    }
}
