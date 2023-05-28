package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.r3 */
public final class C9427r3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23935a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9427r3(C9336b bVar) {
        super(1);
        this.f23935a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasObject("adapters", JsonObjectBuilderKt.jsonObject(new C9398p3(this.f23935a)));
        jsonObjectBuilder.hasArray("show_array", JsonObjectBuilderKt.jsonArray(new C9408q3(this.f23935a)));
        return Unit.INSTANCE;
    }
}
