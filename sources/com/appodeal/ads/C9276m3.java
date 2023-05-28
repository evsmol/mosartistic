package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.m3 */
public final class C9276m3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23342a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9276m3(C9336b bVar) {
        super(1);
        this.f23342a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (ServiceInfo serviceInfo : ((C9336b.C9354j) this.f23342a).mo60544a()) {
            jsonObjectBuilder.hasObject(serviceInfo.getName(), JsonObjectBuilderKt.jsonObject(new C9267l3(serviceInfo)));
        }
        return Unit.INSTANCE;
    }
}
