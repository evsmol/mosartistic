package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonArrayBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.q3 */
public final class C9408q3 extends Lambda implements Function1<JsonArrayBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23838a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9408q3(C9336b bVar) {
        super(1);
        this.f23838a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonArrayBuilder jsonArrayBuilder = (JsonArrayBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonArrayBuilder, "$this$jsonArray");
        jsonArrayBuilder.putValues(((C9336b.C9347c) this.f23838a).mo60473b());
        return Unit.INSTANCE;
    }
}
