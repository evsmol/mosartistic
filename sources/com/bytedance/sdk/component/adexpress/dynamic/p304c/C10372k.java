package com.bytedance.sdk.component.adexpress.dynamic.p304c;

import com.bytedance.sdk.component.adexpress.dynamic.p304c.C10354a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.k */
/* compiled from: FlexComputeRuler */
public class C10372k {
    /* renamed from: a */
    public static float m30199a(float f) {
        return (float) Math.ceil((double) ((f * 16.0f) / 16.0f));
    }

    /* renamed from: a */
    public static List<C10354a.C10355a> m30200a(float f, List<C10354a.C10355a> list) {
        ArrayList<C10354a.C10355a> arrayList = new ArrayList<>();
        for (C10354a.C10355a clone : list) {
            arrayList.add((C10354a.C10355a) clone.clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (C10354a.C10355a aVar : arrayList) {
            if (aVar.f25694b) {
                i = (int) (((float) i) + aVar.f25693a);
            } else {
                i2 = (int) (((float) i2) + aVar.f25693a);
                z = false;
            }
        }
        if (z && f > ((float) i)) {
            return arrayList;
        }
        float f2 = (float) i;
        int i3 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f3 = i3 < 0 ? f / f2 : 1.0f;
        int i4 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        float f4 = i4 > 0 ? (f - f2) / ((float) i2) : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C10354a.C10355a aVar2 : arrayList) {
                if (!aVar2.f25694b && aVar2.f25695c != 0.0f && aVar2.f25693a * f4 > aVar2.f25695c) {
                    aVar2.f25693a = aVar2.f25695c;
                    aVar2.f25694b = true;
                    z2 = true;
                }
                arrayList2.add(aVar2);
            }
            if (z2) {
                return m30200a(f, arrayList2);
            }
        }
        int i5 = 0;
        for (C10354a.C10355a aVar3 : arrayList) {
            if (aVar3.f25694b) {
                aVar3.f25693a = m30199a(aVar3.f25693a * f3);
            } else {
                aVar3.f25693a = m30199a(aVar3.f25693a * f4);
            }
            i5 = (int) (((float) i5) + aVar3.f25693a);
        }
        float f5 = (float) i5;
        if (f5 < f) {
            float f6 = f - f5;
            for (int i6 = 0; i6 < arrayList.size() && f6 > 0.0f; i6 = (i6 + 1) % arrayList.size()) {
                C10354a.C10355a aVar4 = (C10354a.C10355a) arrayList.get(i6);
                if ((i3 < 0 && aVar4.f25694b) || (i4 > 0 && !aVar4.f25694b)) {
                    aVar4.f25693a += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
