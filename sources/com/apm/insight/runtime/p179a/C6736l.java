package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;
import com.apm.insight.p178l.C6690s;

/* renamed from: com.apm.insight.runtime.a.l */
class C6736l extends C6723c {
    C6736l(Context context, C6720b bVar, C6725d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
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
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52249a() {
        return false;
    }

    /* renamed from: b */
    public int mo52265b() {
        return NativeCrashCollector.m16693a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo52270d() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo52274h(C6594a aVar) {
    }
}
