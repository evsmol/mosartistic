package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1956Df;
import com.yandex.metrica.impl.p082ob.C2076H1;
import com.yandex.metrica.impl.p082ob.C2188Jf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.R9 */
public class C2478R9 implements ProtobufConverter<C2188Jf.C2193e, C1956Df> {

    /* renamed from: a */
    private static final Map<Integer, C2076H1.C2080d> f6559a = Collections.unmodifiableMap(new C2479a());

    /* renamed from: b */
    private static final Map<C2076H1.C2080d, Integer> f6560b = Collections.unmodifiableMap(new C2480b());

    /* renamed from: com.yandex.metrica.impl.ob.R9$a */
    class C2479a extends HashMap<Integer, C2076H1.C2080d> {
        C2479a() {
            put(1, C2076H1.C2080d.WIFI);
            put(2, C2076H1.C2080d.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R9$b */
    class C2480b extends HashMap<C2076H1.C2080d, Integer> {
        C2480b() {
            put(C2076H1.C2080d.WIFI, 1);
            put(C2076H1.C2080d.CELL, 2);
        }
    }

    public Object fromModel(Object obj) {
        C2188Jf.C2193e eVar = (C2188Jf.C2193e) obj;
        C1956Df df = new C1956Df();
        Set<String> a = eVar.mo16010a();
        df.f5240b = (String[]) a.toArray(new String[((HashSet) a).size()]);
        List<C2188Jf.C2193e.C2194a> b = eVar.mo16012b();
        C1956Df.C1957a[] aVarArr = new C1956Df.C1957a[b.size()];
        for (int i = 0; i < b.size(); i++) {
            C2188Jf.C2193e.C2194a aVar = b.get(i);
            C1956Df.C1957a aVar2 = new C1956Df.C1957a();
            aVar2.f5242a = aVar.f5869a;
            aVar2.f5243b = aVar.f5870b;
            C1956Df.C1957a.C1958a[] aVarArr2 = new C1956Df.C1957a.C1958a[aVar.f5872d.mo18186c()];
            int i2 = 0;
            for (Map.Entry entry : aVar.f5872d.mo18182a()) {
                for (String str : (Collection) entry.getValue()) {
                    C1956Df.C1957a.C1958a aVar3 = new C1956Df.C1957a.C1958a();
                    aVar3.f5249a = (String) entry.getKey();
                    aVar3.f5250b = str;
                    aVarArr2[i2] = aVar3;
                    i2++;
                }
            }
            aVar2.f5245d = aVarArr2;
            aVar2.f5244c = aVar.f5871c;
            aVar2.f5246e = aVar.f5873e;
            List<C2076H1.C2080d> list = aVar.f5874f;
            int[] iArr = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                iArr[i3] = f6560b.get(list.get(i3)).intValue();
            }
            aVar2.f5247f = iArr;
            aVarArr[i] = aVar2;
        }
        df.f5239a = aVarArr;
        return df;
    }

    public Object toModel(Object obj) {
        C1956Df df = (C1956Df) obj;
        ArrayList arrayList = new ArrayList();
        C1956Df.C1957a[] aVarArr = df.f5239a;
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            C1956Df.C1957a aVar = aVarArr[i];
            String str = aVar.f5242a;
            String str2 = aVar.f5243b;
            String str3 = aVar.f5244c;
            C1956Df.C1957a.C1958a[] aVarArr2 = aVar.f5245d;
            C3458rm rmVar = new C3458rm(z);
            int length2 = aVarArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                C1956Df.C1957a.C1958a aVar2 = aVarArr2[i2];
                rmVar.mo18181a(aVar2.f5249a, aVar2.f5250b);
                i2++;
                aVarArr = aVarArr;
            }
            C1956Df.C1957a[] aVarArr3 = aVarArr;
            long j = aVar.f5246e;
            int[] iArr = aVar.f5247f;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i3 = 0;
            while (i3 < length3) {
                arrayList2.add(f6559a.get(Integer.valueOf(iArr[i3])));
                i3++;
                iArr = iArr;
                length = length;
            }
            int i4 = length;
            C2188Jf.C2193e.C2194a aVar3 = r8;
            C2188Jf.C2193e.C2194a aVar4 = new C2188Jf.C2193e.C2194a(str, str2, str3, rmVar, j, arrayList2);
            arrayList.add(aVar3);
            i++;
            aVarArr = aVarArr3;
            z = false;
        }
        return new C2188Jf.C2193e(arrayList, Arrays.asList(df.f5240b));
    }
}
