package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C3620wf;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.r9 */
public class C3436r9 implements ProtobufConverter<C3507td, C3620wf> {

    /* renamed from: a */
    private final C3532u9 f9002a;

    public C3436r9() {
        this(new C3532u9());
    }

    public Object fromModel(Object obj) {
        C3507td tdVar = (C3507td) obj;
        C3620wf wfVar = new C3620wf();
        wfVar.f9392a = new C3620wf.C3622b[tdVar.f9149a.size()];
        int i = 0;
        int i2 = 0;
        for (C1892Bd next : tdVar.f9149a) {
            C3620wf.C3622b[] bVarArr = wfVar.f9392a;
            C3620wf.C3622b bVar = new C3620wf.C3622b();
            bVar.f9398a = next.f5115a;
            bVar.f9399b = next.f5116b;
            bVarArr[i2] = bVar;
            i2++;
        }
        C3714z zVar = tdVar.f9150b;
        if (zVar != null) {
            wfVar.f9393b = this.f9002a.fromModel(zVar);
        }
        wfVar.f9394c = new String[tdVar.f9151c.size()];
        for (String str : tdVar.f9151c) {
            wfVar.f9394c[i] = str;
            i++;
        }
        return wfVar;
    }

    public Object toModel(Object obj) {
        C3620wf wfVar = (C3620wf) obj;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C3620wf.C3622b[] bVarArr = wfVar.f9392a;
            if (i2 >= bVarArr.length) {
                break;
            }
            C3620wf.C3622b bVar = bVarArr[i2];
            arrayList.add(new C1892Bd(bVar.f9398a, bVar.f9399b));
            i2++;
        }
        C3714z zVar = null;
        C3620wf.C3621a aVar = wfVar.f9393b;
        if (aVar != null) {
            zVar = this.f9002a.toModel(aVar);
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = wfVar.f9394c;
            if (i >= strArr.length) {
                return new C3507td(arrayList, zVar, arrayList2);
            }
            arrayList2.add(strArr[i]);
            i++;
        }
    }

    C3436r9(C3532u9 u9Var) {
        this.f9002a = u9Var;
    }
}
