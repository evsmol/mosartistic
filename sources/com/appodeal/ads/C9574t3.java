package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.t3 */
public final class C9574t3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f24270a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9574t3(C9336b bVar) {
        super(1);
        this.f24270a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("connection", ((C9336b.C9350f) this.f24270a).mo60523a());
        jsonObjectBuilder.hasValue("connection_subtype", ((C9336b.C9350f) this.f24270a).mo60524b());
        return Unit.INSTANCE;
    }
}
