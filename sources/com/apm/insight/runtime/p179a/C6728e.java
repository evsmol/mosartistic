package com.apm.insight.runtime.p179a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C6594a;
import com.apm.insight.entity.Header;
import com.apm.insight.p178l.C6690s;

/* renamed from: com.apm.insight.runtime.a.e */
public class C6728e extends C6723c {
    C6728e(Context context, C6720b bVar, C6725d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    /* renamed from: a */
    public C6594a mo52248a(C6594a aVar) {
        C6594a a = super.mo52248a(aVar);
        mo52273g(a);
        C6690s.m16639a(a, (Header) null, this.f14457a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52249a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo52268c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo52270d() {
        return false;
    }
}
