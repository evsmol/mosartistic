package com.bytedance.sdk.component.p313d.p322d;

import com.bytedance.sdk.component.p313d.C10565n;
import com.bytedance.sdk.component.p313d.p316c.C10499a;
import com.bytedance.sdk.component.p313d.p316c.C10523c;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.d.h */
/* compiled from: FailVisitor */
public class C10549h extends C10541a {

    /* renamed from: a */
    private Throwable f26335a;

    /* renamed from: b */
    private int f26336b;

    /* renamed from: c */
    private String f26337c;

    /* renamed from: a */
    public String mo64146a() {
        return "failed";
    }

    public C10549h(int i, String str, Throwable th) {
        this.f26336b = i;
        this.f26337c = str;
        this.f26335a = th;
    }

    /* renamed from: a */
    public void mo64147a(C10523c cVar) {
        cVar.mo64074a(new C10499a(this.f26336b, this.f26337c, this.f26335a));
        String r = cVar.mo64096r();
        Map<String, List<C10523c>> f = cVar.mo64094p().mo64143f();
        List<C10523c> list = f.get(r);
        if (list == null) {
            m30920b(cVar);
            return;
        }
        synchronized (list) {
            for (C10523c b : list) {
                m30920b(b);
            }
            list.clear();
            f.remove(r);
        }
    }

    /* renamed from: b */
    private void m30920b(C10523c cVar) {
        C10565n f = cVar.mo64084f();
        if (f != null) {
            f.mo256a(this.f26336b, this.f26337c, this.f26335a);
        }
    }
}
