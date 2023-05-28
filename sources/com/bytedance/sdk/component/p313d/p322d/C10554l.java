package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.p316c.C10523c;

/* renamed from: com.bytedance.sdk.component.d.d.l */
/* compiled from: RawCacheVisitor */
public class C10554l extends C10541a {
    /* renamed from: a */
    public String mo64146a() {
        return "raw_cache";
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        byte[] bArr = (byte[]) cVar.mo64094p().mo64137b(cVar.mo64095q()).mo63991a(cVar.mo64085g());
        if (bArr == null) {
            cVar.mo64078a((C10550i) new C10547f());
        } else {
            cVar.mo64078a((C10550i) new C10542b(bArr, (C10557f) null));
        }
    }
}
