package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10498c;
import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.p316c.C10523c;

/* renamed from: com.bytedance.sdk.component.d.d.f */
/* compiled from: DiskCacheVisitor */
public class C10547f extends C10541a {
    /* renamed from: a */
    public String mo64146a() {
        return "disk_cache";
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        String g = cVar.mo64085g();
        C10498c c = cVar.mo64094p().mo64139c(cVar.mo64095q());
        if (c == null) {
            cVar.mo64078a((C10550i) new C10552k());
            return;
        }
        byte[] bArr = (byte[]) c.mo63991a(g);
        if (bArr == null) {
            cVar.mo64078a((C10550i) new C10552k());
            return;
        }
        cVar.mo64078a((C10550i) new C10542b(bArr, (C10557f) null));
        cVar.mo64094p().mo64137b(cVar.mo64095q()).mo63992a(g, bArr);
    }
}
