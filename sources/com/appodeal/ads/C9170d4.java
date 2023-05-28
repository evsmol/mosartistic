package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.d4 */
public final class C9170d4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23010a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9170d4(C9336b bVar) {
        super(1);
        this.f23010a = bVar;
    }

    public final Object invoke(Object obj) {
        JSONObject jsonObject;
        String str;
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (ServiceData serviceData : ((C9336b.C9355k) this.f23010a).mo60545a()) {
            if (serviceData instanceof ServiceData.AppsFlyer) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new C9724y3(serviceData));
                str = "appsflyer";
            } else if (serviceData instanceof ServiceData.Adjust) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new C9005a4(serviceData));
                str = "adjust";
            } else if (serviceData instanceof ServiceData.FacebookAnalytics) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new C9134b4(serviceData));
                str = "facebook_analytics";
            } else if (serviceData instanceof ServiceData.Firebase) {
                jsonObject = JsonObjectBuilderKt.jsonObject(new C9143c4(serviceData));
                str = "firebase";
            }
            jsonObjectBuilder.hasObject(str, jsonObject);
        }
        return Unit.INSTANCE;
    }
}
