package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ListConverter;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.T6 */
public class C2554T6 implements ListConverter<C1947D6, C3099jf> {

    /* renamed from: a */
    private C2593U6 f6777a = new C2593U6();

    /* renamed from: a */
    public C3099jf[] fromModel(List<C1947D6> list) {
        C3099jf[] jfVarArr = new C3099jf[list.size()];
        int i = 0;
        for (C1947D6 a : list) {
            jfVarArr[i] = this.f6777a.fromModel(a);
            i++;
        }
        return jfVarArr;
    }

    public Object toModel(Object obj) {
        C3099jf[] jfVarArr = (C3099jf[]) obj;
        throw new UnsupportedOperationException();
    }
}
