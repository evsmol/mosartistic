package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10557f;
import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import com.bytedance.sdk.component.p313d.p316c.C10533d;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.m */
/* compiled from: SuccessVisitor */
public class C10555m<T> extends C10541a {

    /* renamed from: a */
    private T f26342a;

    /* renamed from: b */
    private C10557f f26343b;

    /* renamed from: c */
    private boolean f26344c;

    /* renamed from: a */
    public String mo64146a() {
        return "success";
    }

    public C10555m(T t, C10557f fVar, boolean z) {
        this.f26342a = t;
        this.f26343b = fVar;
        this.f26344c = z;
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        String r = cVar.mo64096r();
        Map<String, List<C10523c>> f = cVar.mo64094p().mo64143f();
        List<C10523c> list = f.get(r);
        if (list == null) {
            m30933b(cVar);
            return;
        }
        synchronized (list) {
            for (C10523c b : list) {
                m30933b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private Map<String, String> m30932b() {
        C10557f fVar = this.f26343b;
        if (fVar != null) {
            return fVar.mo64011e();
        }
        return null;
    }

    /* renamed from: b */
    private void m30933b(C10523c cVar) {
        C10565n f = cVar.mo64084f();
        if (f != null) {
            f.mo257a(new C10533d().mo64114a(cVar, this.f26342a, m30932b(), this.f26344c));
        }
    }
}
