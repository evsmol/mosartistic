package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;
import com.google.protobuf.nano.p091ym.CodedOutputByteBufferNano;
import com.yandex.metrica.impl.p082ob.C3398qf;
import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.O1 */
class C2362O1 implements C2810ak {

    /* renamed from: a */
    final /* synthetic */ C3398qf f6296a;

    /* renamed from: b */
    final /* synthetic */ C2412P1 f6297b;

    C2362O1(C2412P1 p1, C3398qf qfVar) {
        this.f6297b = p1;
        this.f6296a = qfVar;
    }

    /* renamed from: a */
    public void mo15406a(C2778Zj zj) {
        C3398qf qfVar = this.f6296a;
        List<C2570Tj> c = zj.mo17125c();
        if (!C1848A2.m6814b((Collection) c)) {
            qfVar.f8768d = new C3398qf.C3409e[c.size()];
            for (int i = 0; i < c.size(); i++) {
                C2570Tj tj = c.get(i);
                C3398qf.C3409e[] eVarArr = qfVar.f8768d;
                int i2 = C2171J1.f5823e;
                C3398qf.C3409e eVar = new C3398qf.C3409e();
                if (tj.mo16720b() != null) {
                    eVar.f8841a = tj.mo16720b().intValue();
                }
                if (tj.mo16721c() != null) {
                    eVar.f8842b = tj.mo16721c().intValue();
                }
                if (!TextUtils.isEmpty(tj.mo16719a())) {
                    eVar.f8843c = tj.mo16719a();
                }
                eVar.f8844d = tj.mo16722d();
                eVarArr[i] = eVar;
                C2412P1.m8101a(this.f6297b, CodedOutputByteBufferNano.computeMessageSizeNoTag(qfVar.f8768d[i]));
                C2412P1.m8101a(this.f6297b, CodedOutputByteBufferNano.computeTagSize(10));
            }
        }
    }
}
