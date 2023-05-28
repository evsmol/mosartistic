package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.l3 */
public final class C9267l3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ ServiceInfo f23312a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9267l3(ServiceInfo serviceInfo) {
        super(1);
        this.f23312a = serviceInfo;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ver", this.f23312a.getBuildVersion());
        jsonObjectBuilder.hasValue("sdk", this.f23312a.getSdkVersion());
        return Unit.INSTANCE;
    }
}
