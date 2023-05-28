package com.appodeal.ads;

import com.appnext.base.p264b.C8856i;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.u3 */
public final class C9589u3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f24322a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9589u3(C9336b bVar) {
        super(1);
        this.f24322a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("lt", ((C9336b.C9352h) this.f24322a).mo60535b());
        jsonObjectBuilder.hasValue(C8856i.f22445fC, ((C9336b.C9352h) this.f24322a).mo60534a());
        jsonObjectBuilder.hasValue("lon", ((C9336b.C9352h) this.f24322a).mo60536c());
        return Unit.INSTANCE;
    }
}
