package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.c4 */
public final class C9143c4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ ServiceData f22953a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9143c4(ServiceData serviceData) {
        super(1);
        this.f22953a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("app_instance_id", ((ServiceData.Firebase) this.f22953a).getAppInstanceId());
        jsonObjectBuilder.hasValue("keywords", ((ServiceData.Firebase) this.f22953a).getKeywordsAsString());
        return Unit.INSTANCE;
    }
}
