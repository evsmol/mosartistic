package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.C10571t;
import com.bytedance.sdk.component.p313d.p316c.C10523c;

/* renamed from: com.bytedance.sdk.component.d.d.j */
/* compiled from: MemoryCacheVisitor */
public class C10551j extends C10541a {
    /* renamed from: a */
    public String mo64146a() {
        return "memory_cache";
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        Object obj;
        C10571t i = cVar.mo64087i();
        if (i == C10571t.BITMAP || i == C10571t.AUTO) {
            obj = cVar.mo64094p().mo64135a(cVar.mo64095q()).mo63991a(cVar.mo64083e());
        } else {
            obj = null;
        }
        if (obj == null) {
            cVar.mo64078a((C10550i) new C10554l());
        } else {
            cVar.mo64078a((C10550i) new C10555m(obj, (C10557f) null, false));
        }
    }
}
