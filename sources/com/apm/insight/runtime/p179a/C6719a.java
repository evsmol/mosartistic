package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import com.apm.insight.p178l.C6662a;
import com.apm.insight.p178l.C6690s;

/* renamed from: com.apm.insight.runtime.a.a */
class C6719a extends C6723c {
    C6719a(Context context, C6720b bVar, C6725d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    /* renamed from: a */
    public C6594a mo52248a(C6594a aVar) {
        C6594a a = super.mo52248a(aVar);
        Header a2 = Header.m16138a(this.f14458b);
        Header.m16140a(a2);
        Header.m16143b(a2);
        a2.mo52039c();
        a2.mo52040d();
        a2.mo52041e();
        a.mo52045a(a2);
        a.mo52052a("process_name", (Object) C6662a.m16480c(this.f14458b));
        C6690s.m16639a(a, a2, this.f14457a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52249a() {
        return true;
    }
}
