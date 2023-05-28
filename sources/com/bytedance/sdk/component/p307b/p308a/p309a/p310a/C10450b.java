package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import com.bytedance.sdk.component.p307b.p308a.C10473g;
import com.bytedance.sdk.component.p307b.p308a.C10479k;
import com.bytedance.sdk.component.p307b.p308a.C10483m;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.b */
/* compiled from: NetChain */
public class C10450b implements C10473g.C10474a {

    /* renamed from: a */
    List<C10473g> f26052a;

    /* renamed from: b */
    C10479k f26053b;

    /* renamed from: c */
    int f26054c = 0;

    C10450b(List<C10473g> list, C10479k kVar) {
        this.f26052a = list;
        this.f26053b = kVar;
    }

    /* renamed from: a */
    public C10479k mo63866a() {
        return this.f26053b;
    }

    /* renamed from: a */
    public C10483m mo63867a(C10479k kVar) throws IOException {
        this.f26053b = kVar;
        int i = this.f26054c + 1;
        this.f26054c = i;
        return this.f26052a.get(i).mo63864a(this);
    }
}
