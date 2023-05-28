package com.bytedance.sdk.component.p323e.p326c;

import com.bytedance.sdk.component.p307b.p308a.C10473g;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import java.io.IOException;

/* renamed from: com.bytedance.sdk.component.e.c.f */
/* compiled from: TncHostInterceptor */
public class C10593f implements C10473g {

    /* renamed from: a */
    private int f26446a;

    /* renamed from: a */
    public void mo64220a(int i) {
        this.f26446a = i;
    }

    /* renamed from: a */
    public C10483m mo63864a(C10473g.C10474a aVar) throws IOException {
        C10483m mVar;
        C10479k a = aVar.mo63866a();
        if (C10594g.m31112a().mo64222a(this.f26446a).mo64212b() != null) {
            C10594g.m31112a().mo64222a(this.f26446a).mo64212b().mo64195e();
        }
        String fVar = a.mo63975b().toString();
        String a2 = C10594g.m31112a().mo64222a(this.f26446a).mo64206a(fVar);
        if (!fVar.equals(a2)) {
            a = a.mo63980g().mo63986a(a2).mo63989b();
        }
        try {
            mVar = aVar.mo63867a(a);
        } catch (Exception e) {
            C10594g.m31112a().mo64222a(this.f26446a).mo64209a(a, e);
            mVar = null;
        }
        C10594g.m31112a().mo64222a(this.f26446a).mo64208a(a, mVar);
        return mVar == null ? aVar.mo63867a(a) : mVar;
    }
}
