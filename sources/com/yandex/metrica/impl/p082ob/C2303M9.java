package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C1967E;
import com.yandex.metrica.impl.p082ob.C2121If;
import com.yandex.metrica.impl.p082ob.C3598w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.M9 */
public class C2303M9 implements ProtobufConverter<C1862Ac, C2121If.C2134k.C2140b> {
    /* renamed from: a */
    public C2121If.C2134k.C2140b fromModel(C1862Ac ac) {
        C2121If.C2134k.C2140b bVar = new C2121If.C2134k.C2140b();
        bVar.f5688a = new int[ac.f5039a.size()];
        Iterator<C1967E.C1969b.C1970a> it = ac.f5039a.iterator();
        int i = 0;
        while (true) {
            int i2 = 3;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = bVar.f5688a;
            int ordinal = it.next().ordinal();
            if (ordinal == 1) {
                i2 = 0;
            } else if (ordinal == 2) {
                i2 = 1;
            } else if (ordinal == 3) {
                i2 = 2;
            } else if (ordinal != 4) {
                i2 = 4;
            }
            iArr[i] = i2;
            i++;
        }
        bVar.f5689b = new int[ac.f5040b.size()];
        int i3 = 0;
        for (C3598w.C3599a ordinal2 : ac.f5040b) {
            int[] iArr2 = bVar.f5689b;
            int ordinal3 = ordinal2.ordinal();
            iArr2[i3] = ordinal3 != 1 ? ordinal3 != 2 ? 3 : 2 : 0;
            i3++;
        }
        return bVar;
    }

    /* renamed from: a */
    public C1862Ac toModel(C2121If.C2134k.C2140b bVar) {
        C3598w.C3599a aVar;
        C1967E.C1969b.C1970a aVar2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (bVar.f5688a.length != 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = bVar.f5688a;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 0) {
                    aVar2 = C1967E.C1969b.C1970a.NONE;
                } else if (i3 == 1) {
                    aVar2 = C1967E.C1969b.C1970a.USB;
                } else if (i3 == 2) {
                    aVar2 = C1967E.C1969b.C1970a.WIRELESS;
                } else if (i3 != 3) {
                    aVar2 = C1967E.C1969b.C1970a.UNKNOWN;
                } else {
                    aVar2 = C1967E.C1969b.C1970a.AC;
                }
                arrayList.add(aVar2);
                i2++;
            }
        } else {
            arrayList.addAll(Arrays.asList(C1967E.C1969b.C1970a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f5689b.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f5689b;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == 0) {
                    aVar = C3598w.C3599a.BACKGROUND;
                } else if (i4 != 2) {
                    aVar = C3598w.C3599a.UNKNOWN;
                } else {
                    aVar = C3598w.C3599a.VISIBLE;
                }
                arrayList2.add(aVar);
                i++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C3598w.C3599a.values()));
        }
        return new C1862Ac(arrayList, arrayList2);
    }
}
