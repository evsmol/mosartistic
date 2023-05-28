package com.yandex.metrica.impl.p082ob;

import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.p082ob.C3211mf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ga */
public class C2056Ga implements C2020Fa<C2658Va> {

    /* renamed from: a */
    private final C2089Ha f5450a;

    /* renamed from: b */
    private final C1919Ca f5451b;

    /* renamed from: c */
    private final C3136kn f5452c;

    /* renamed from: d */
    private final C2269La f5453d;

    public C2056Ga() {
        this(new C2089Ha(), new C1919Ca(), new C3136kn(100), new C2269La());
    }

    /* renamed from: a */
    private C3211mf m7258a(C3211mf mfVar) {
        C3211mf mfVar2 = new C3211mf();
        mfVar2.f8325a = mfVar.f8325a;
        C3211mf.C3219h hVar = new C3211mf.C3219h();
        mfVar2.f8330f = hVar;
        hVar.f8350a = new C3211mf.C3217f();
        C3211mf.C3217f fVar = mfVar2.f8330f.f8350a;
        C3211mf.C3217f fVar2 = mfVar.f8330f.f8350a;
        fVar.f8343b = fVar2.f8343b;
        fVar.f8342a = fVar2.f8342a;
        fVar.f8346e = fVar2.f8346e;
        fVar.f8344c = fVar2.f8344c;
        return mfVar2;
    }

    public Object fromModel(Object obj) {
        C2336Na<C3211mf.C3220i, C2671Vm> na;
        int i;
        C2658Va va = (C2658Va) obj;
        C3211mf mfVar = new C3211mf();
        mfVar.f8325a = va.f7048b;
        mfVar.f8330f = new C3211mf.C3219h();
        C2684Wa wa = va.f7049c;
        C3211mf.C3217f fVar = new C3211mf.C3217f();
        fVar.f8342a = C2814b.m9072b(wa.f7081a);
        C3011gn<String, C2671Vm> a = this.f5452c.mo17691a(wa.f7082b);
        fVar.f8343b = C2814b.m9072b((String) a.f7938a);
        fVar.f8346e = wa.f7083c.size();
        Map<String, String> map = wa.f7084d;
        if (map != null) {
            na = this.f5450a.fromModel(map);
            fVar.f8344c = (C3211mf.C3220i) na.f6259a;
        } else {
            na = null;
        }
        mfVar.f8330f.f8350a = fVar;
        C2671Vm a2 = C2643Um.m8747a(a, na);
        List<C2597Ua> list = wa.f7083c;
        ArrayList arrayList = new ArrayList();
        this.f5453d.getClass();
        int computeInt32Size = mfVar.f8325a != new C3211mf().f8325a ? CodedOutputByteBufferNano.computeInt32Size(1, mfVar.f8325a) + 0 : 0;
        C3211mf.C3229q qVar = mfVar.f8326b;
        if (qVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, qVar);
        }
        C3211mf.C3227o oVar = mfVar.f8327c;
        if (oVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, oVar);
        }
        C3211mf.C3228p pVar = mfVar.f8328d;
        int i2 = 4;
        if (pVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, pVar);
        }
        C3211mf.C3213b bVar = mfVar.f8329e;
        if (bVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, bVar);
        }
        C3211mf.C3219h hVar = mfVar.f8330f;
        if (hVar != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C3211mf a3 = m7258a(mfVar);
        C2671Vm vm = a2;
        int i3 = computeInt32Size;
        int i4 = 0;
        while (i4 < list.size()) {
            C3211mf.C3218g gVar = new C3211mf.C3218g();
            gVar.f8348a = i4;
            C2336Na<C3211mf.C3214c, C2671Vm> a4 = this.f5451b.fromModel(list.get(i4));
            gVar.f8349b = (C3211mf.C3214c) a4.f6259a;
            this.f5453d.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(gVar);
            if ((computeMessageSizeNoTag & -128) == 0) {
                i = 0;
            } else {
                i = CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag);
            }
            int i5 = computeTagSize + computeMessageSizeNoTag + i;
            if (arrayList2.size() != 0 && i3 + i5 > 204800) {
                a3.f8330f.f8350a.f8345d = (C3211mf.C3218g[]) arrayList2.toArray(new C3211mf.C3218g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C2336Na(a3, vm));
                vm = a2;
                i3 = computeInt32Size;
                a3 = m7258a(mfVar);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            vm = C2643Um.m8747a(vm, a4);
            i3 += i5;
            i4++;
            i2 = 4;
        }
        a3.f8330f.f8350a.f8345d = (C3211mf.C3218g[]) arrayList2.toArray(new C3211mf.C3218g[arrayList2.size()]);
        arrayList.add(new C2336Na(a3, vm));
        return arrayList;
    }

    public Object toModel(Object obj) {
        List list = (List) obj;
        throw new UnsupportedOperationException();
    }

    C2056Ga(C2089Ha ha, C1919Ca ca, C3136kn knVar, C2269La la) {
        this.f5450a = ha;
        this.f5451b = ca;
        this.f5452c = knVar;
        this.f5453d = la;
    }
}
