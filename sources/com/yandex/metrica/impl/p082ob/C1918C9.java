package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.p082ob.C2121If;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.C9 */
public final class C1918C9 implements ProtobufConverter<C2637Uh, C2121If.C2131h> {
    /* renamed from: a */
    public C2121If.C2131h fromModel(C2637Uh uh) {
        C2121If.C2131h hVar = new C2121If.C2131h();
        hVar.f5627a = uh.mo16844c();
        hVar.f5628b = uh.mo16843b();
        hVar.f5629c = uh.mo16842a();
        hVar.f5631e = uh.mo16846e();
        hVar.f5630d = uh.mo16845d();
        return hVar;
    }

    /* renamed from: a */
    public C2637Uh toModel(C2121If.C2131h hVar) {
        String str = hVar.f5627a;
        Intrinsics.checkNotNullExpressionValue(str, "nano.url");
        return new C2637Uh(str, hVar.f5628b, hVar.f5629c, hVar.f5630d, hVar.f5631e);
    }
}
