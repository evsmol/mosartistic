package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X6 */
public class C2706X6 implements ProtobufConverter<C2085H6, C3000gf> {

    /* renamed from: a */
    private final C2680W6 f7138a;

    /* renamed from: b */
    private final C2179J6 f7139b;

    /* renamed from: c */
    private final C2264L6 f7140c;

    /* renamed from: d */
    private final C2554T6 f7141d;

    /* renamed from: e */
    private final C2450Q6 f7142e;

    /* renamed from: f */
    private final C2475R6 f7143f;

    public C2706X6() {
        this(new C2680W6(), new C2179J6(new C2654V6()), new C2264L6(), new C2554T6(), new C2450Q6(), new C2475R6());
    }

    /* renamed from: a */
    public C3000gf fromModel(C2085H6 h6) {
        C3000gf gfVar = new C3000gf();
        C2016F6 f6 = h6.f5512a;
        if (f6 != null) {
            gfVar.f7908a = this.f7138a.fromModel(f6);
        }
        C3607w6 w6Var = h6.f5513b;
        if (w6Var != null) {
            gfVar.f7909b = this.f7139b.fromModel(w6Var);
        }
        List<C1947D6> list = h6.f5514c;
        if (list != null) {
            gfVar.f7912e = this.f7141d.fromModel(list);
        }
        String str = h6.f5518g;
        if (str != null) {
            gfVar.f7910c = str;
        }
        gfVar.f7911d = this.f7140c.mo15762a(h6.f5519h);
        if (!TextUtils.isEmpty(h6.f5515d)) {
            gfVar.f7915h = this.f7142e.fromModel(h6.f5515d);
        }
        if (!TextUtils.isEmpty(h6.f5516e)) {
            gfVar.f7916i = h6.f5516e.getBytes();
        }
        if (!C1848A2.m6815b((Map) h6.f5517f)) {
            gfVar.f7917j = this.f7143f.fromModel(h6.f5517f);
        }
        return gfVar;
    }

    public Object toModel(Object obj) {
        C3000gf gfVar = (C3000gf) obj;
        throw new UnsupportedOperationException();
    }

    C2706X6(C2680W6 w6, C2179J6 j6, C2264L6 l6, C2554T6 t6, C2450Q6 q6, C2475R6 r6) {
        this.f7139b = j6;
        this.f7138a = w6;
        this.f7140c = l6;
        this.f7141d = t6;
        this.f7142e = q6;
        this.f7143f = r6;
    }
}
