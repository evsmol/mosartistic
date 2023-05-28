package com.yandex.metrica.impl.p082ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C2841bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.S9 */
public class C2513S9 implements ProtobufConverter<C2841bi, C2121If.C2144o> {

    /* renamed from: a */
    private static final Map<Integer, C2841bi.C2842a> f6627a = Collections.unmodifiableMap(new C2514a());

    /* renamed from: b */
    private static final Map<C2841bi.C2842a, Integer> f6628b = Collections.unmodifiableMap(new C2515b());

    /* renamed from: com.yandex.metrica.impl.ob.S9$a */
    class C2514a extends HashMap<Integer, C2841bi.C2842a> {
        C2514a() {
            put(1, C2841bi.C2842a.WIFI);
            put(2, C2841bi.C2842a.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.S9$b */
    class C2515b extends HashMap<C2841bi.C2842a, Integer> {
        C2515b() {
            put(C2841bi.C2842a.WIFI, 1);
            put(C2841bi.C2842a.CELL, 2);
        }
    }

    /* renamed from: a */
    public C2121If.C2144o fromModel(C2841bi biVar) {
        C2121If.C2144o oVar = new C2121If.C2144o();
        oVar.f5699a = biVar.f7489a;
        oVar.f5700b = biVar.f7490b;
        oVar.f5701c = biVar.f7491c;
        List<Pair<String, String>> list = biVar.f7492d;
        C2121If.C2144o.C2145a[] aVarArr = new C2121If.C2144o.C2145a[list.size()];
        int i = 0;
        for (Pair next : list) {
            C2121If.C2144o.C2145a aVar = new C2121If.C2144o.C2145a();
            aVar.f5706a = (String) next.first;
            aVar.f5707b = (String) next.second;
            aVarArr[i] = aVar;
            i++;
        }
        oVar.f5702d = aVarArr;
        Long l = biVar.f7493e;
        oVar.f5703e = l == null ? 0 : l.longValue();
        List<C2841bi.C2842a> list2 = biVar.f7494f;
        int[] iArr = new int[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iArr[i2] = f6628b.get(list2.get(i2)).intValue();
        }
        oVar.f5704f = iArr;
        return oVar;
    }

    /* renamed from: a */
    public C2841bi toModel(C2121If.C2144o oVar) {
        String str = oVar.f5699a;
        String str2 = oVar.f5700b;
        String str3 = oVar.f5701c;
        C2121If.C2144o.C2145a[] aVarArr = oVar.f5702d;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C2121If.C2144o.C2145a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f5706a, aVar.f5707b));
        }
        Long valueOf = Long.valueOf(oVar.f5703e);
        int[] iArr = oVar.f5704f;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int valueOf2 : iArr) {
            arrayList2.add(f6627a.get(Integer.valueOf(valueOf2)));
        }
        return new C2841bi(str, str2, str3, arrayList, valueOf, arrayList2);
    }
}
