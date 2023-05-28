package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9335a;
import com.appodeal.ads.networking.binders.C9336b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.p3 */
public final class C9398p3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23821a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9398p3(C9336b bVar) {
        super(1);
        this.f23821a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (Map.Entry next : ((C9336b.C9347c) this.f23821a).mo60472a().entrySet()) {
            jsonObjectBuilder.hasObject((String) next.getKey(), JsonObjectBuilderKt.jsonObject(new C9383o3((C9335a) next.getValue())));
        }
        return Unit.INSTANCE;
    }
}
