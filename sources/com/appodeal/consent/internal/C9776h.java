package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.consent.internal.h */
public final class C9776h extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9749a f24797a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9776h(C9749a aVar) {
        super(1);
        this.f24797a = aVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("key", this.f24797a.mo61315b());
        jsonObjectBuilder.hasValue("packageName", this.f24797a.mo61326m());
        return Unit.INSTANCE;
    }
}
