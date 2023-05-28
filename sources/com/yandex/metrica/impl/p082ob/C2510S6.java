package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.S6 */
public class C2510S6 implements ProtobufConverter<C1883B6, C3031hf> {

    /* renamed from: a */
    private final C2680W6 f6621a;

    /* renamed from: b */
    private final C2179J6 f6622b;

    /* renamed from: c */
    private final C2264L6 f6623c;

    /* renamed from: d */
    private final C2554T6 f6624d;

    /* renamed from: e */
    private final C2450Q6 f6625e;

    /* renamed from: f */
    private final C2475R6 f6626f;

    public C2510S6() {
        this(new C2680W6(), new C2179J6(new C2654V6()), new C2264L6(), new C2554T6(), new C2450Q6(), new C2475R6());
    }

    /* renamed from: a */
    public C3031hf fromModel(C1883B6 b6) {
        C3031hf hfVar = new C3031hf();
        String str = b6.f5089a;
        String str2 = hfVar.f7981f;
        if (str == null) {
            str = str2;
        }
        hfVar.f7981f = str;
        C2085H6 h6 = b6.f5090b;
        if (h6 != null) {
            C2016F6 f6 = h6.f5512a;
            if (f6 != null) {
                hfVar.f7976a = this.f6621a.fromModel(f6);
            }
            C3607w6 w6Var = h6.f5513b;
            if (w6Var != null) {
                hfVar.f7977b = this.f6622b.fromModel(w6Var);
            }
            List<C1947D6> list = h6.f5514c;
            if (list != null) {
                hfVar.f7980e = this.f6624d.fromModel(list);
            }
            String str3 = h6.f5518g;
            String str4 = hfVar.f7978c;
            if (str3 == null) {
                str3 = str4;
            }
            hfVar.f7978c = str3;
            hfVar.f7979d = this.f6623c.mo15762a(h6.f5519h);
            if (!TextUtils.isEmpty(h6.f5515d)) {
                hfVar.f7984i = this.f6625e.fromModel(h6.f5515d);
            }
            if (!TextUtils.isEmpty(h6.f5516e)) {
                hfVar.f7985j = h6.f5516e.getBytes();
            }
            if (!C1848A2.m6815b((Map) h6.f5517f)) {
                hfVar.f7986k = this.f6626f.fromModel(h6.f5517f);
            }
        }
        return hfVar;
    }

    public Object toModel(Object obj) {
        C3031hf hfVar = (C3031hf) obj;
        throw new UnsupportedOperationException();
    }

    C2510S6(C2680W6 w6, C2179J6 j6, C2264L6 l6, C2554T6 t6, C2450Q6 q6, C2475R6 r6) {
        this.f6621a = w6;
        this.f6622b = j6;
        this.f6623c = l6;
        this.f6624d = t6;
        this.f6625e = q6;
        this.f6626f = r6;
    }
}
