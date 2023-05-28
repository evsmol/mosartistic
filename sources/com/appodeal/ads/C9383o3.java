package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9335a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.o3 */
public final class C9383o3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9335a f23804a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9383o3(C9335a aVar) {
        super(1);
        this.f23804a = aVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ver", this.f23804a.mo60431b());
        jsonObjectBuilder.hasValue("sdk", this.f23804a.mo60430a());
        return Unit.INSTANCE;
    }
}
