package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;

@Deprecated
/* renamed from: com.apm.insight.runtime.a.g */
class C6731g extends C6723c {
    C6731g(Context context, C6720b bVar, C6725d dVar) {
        super(CrashType.CUSTOM_JAVA, context, bVar, dVar);
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
        return a;
    }
}
