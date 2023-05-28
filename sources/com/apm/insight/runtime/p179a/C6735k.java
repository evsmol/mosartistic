package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import com.apm.insight.p175i.C6624a;
import com.apm.insight.p178l.C6690s;

/* renamed from: com.apm.insight.runtime.a.k */
class C6735k extends C6723c {
    C6735k(Context context, C6720b bVar, C6725d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    /* renamed from: a */
    public C6594a mo52263a(int i, C6594a aVar) {
        C6594a a = super.mo52263a(i, aVar);
        if (i == 0) {
            Header a2 = Header.m16138a(this.f14458b);
            a2.mo52039c();
            a.mo52045a(a2);
            C6690s.m16639a(a, a2, this.f14457a);
        } else if (i == 1) {
            Header i2 = a.mo52067i();
            i2.mo52040d();
            i2.mo52041e();
        } else if (i == 2) {
            Header.m16140a(a.mo52067i());
            try {
                a.mo52067i().mo52042f().put("launch_did", C6624a.m16344a(this.f14458b));
            } catch (Throwable unused) {
            }
        } else if (i == 5) {
            Header.m16143b(a.mo52067i());
        }
        return a;
    }
}
