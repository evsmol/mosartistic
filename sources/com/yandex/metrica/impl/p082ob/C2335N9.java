package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.N9 */
public final class C2335N9 implements Converter<Map<String, ? extends Object>, C2121If.C2141l[]> {

    /* renamed from: a */
    private final C3097jd f6258a;

    public C2335N9() {
        C2007F0 g = C2007F0.m7154g();
        Intrinsics.checkNotNullExpressionValue(g, "GlobalServiceLocator.getInstance()");
        C3097jd j = g.mo15747j();
        Intrinsics.checkNotNullExpressionValue(j, "GlobalServiceLocator.get…tance().modulesController");
        this.f6258a = j;
    }

    /* renamed from: a */
    public C2121If.C2141l[] fromModel(Map<String, ? extends Object> map) {
        C2121If.C2141l lVar;
        Map<String, C3029hd> c = this.f6258a.mo17765c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            C3029hd hdVar = c.get(str);
            if (hdVar == null || value == null) {
                lVar = null;
            } else {
                lVar = new C2121If.C2141l();
                lVar.f5691a = str;
                lVar.f5692b = hdVar.mo17664a(value);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Object[] array = arrayList.toArray(new C2121If.C2141l[0]);
        if (array != null) {
            return (C2121If.C2141l[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public Map<String, Object> toModel(C2121If.C2141l[] lVarArr) {
        Map<String, C3029hd> c = this.f6258a.mo17765c();
        ArrayList arrayList = new ArrayList();
        for (C2121If.C2141l lVar : lVarArr) {
            C3029hd hdVar = c.get(lVar.f5691a);
            Pair pair = hdVar != null ? TuplesKt.m14544to(lVar.f5691a, hdVar.mo17663a(lVar.f5692b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
