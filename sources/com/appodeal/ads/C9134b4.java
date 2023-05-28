package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.b4 */
public final class C9134b4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ ServiceData f22946a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9134b4(ServiceData serviceData) {
        super(1);
        this.f22946a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("user_id", ((ServiceData.FacebookAnalytics) this.f22946a).getUserId());
        jsonObjectBuilder.hasValue("app_id", ((ServiceData.FacebookAnalytics) this.f22946a).getAppId());
        return Unit.INSTANCE;
    }
}
