package com.bytedance.sdk.component.p307b.p308a.p309a.p310a;

import android.text.TextUtils;
import com.bytedance.sdk.component.p307b.p308a.C10457b;
import com.bytedance.sdk.component.p307b.p308a.C10468d;
import com.bytedance.sdk.component.p307b.p308a.C10476i;
import com.bytedance.sdk.component.p307b.p308a.C10479k;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.c */
/* compiled from: NetClient */
public class C10451c extends C10476i {

    /* renamed from: h */
    public C10452d f26055h = new C10452d();

    public C10451c(C10476i.C10477a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public C10468d mo63869a() {
        return this.f26055h;
    }

    /* renamed from: a */
    public C10457b mo63868a(C10479k kVar) {
        kVar.mo63974a(this);
        if (kVar == null || kVar.mo63975b() == null || kVar.mo63975b().mo63948a() == null || TextUtils.isEmpty(kVar.mo63975b().mo63948a().toString())) {
            return null;
        }
        C10447a aVar = new C10447a(kVar, this.f26055h);
        this.f26055h.mo63873c().add(aVar);
        return aVar;
    }
}
