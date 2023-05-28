package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.e4 */
public final class C9177e4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23029a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9177e4(C9336b bVar) {
        super(1);
        this.f23029a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasObject("services_data", JsonObjectBuilderKt.jsonObject(new C9170d4(this.f23029a)));
        return Unit.INSTANCE;
    }
}
