package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.appodeal.ads.y3 */
public final class C9724y3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ ServiceData f24636a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9724y3(ServiceData serviceData) {
        super(1);
        this.f24636a = serviceData;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("attribution_id", ((ServiceData.AppsFlyer) this.f24636a).getAttributionId());
        Map<String, Object> conversionData = ((ServiceData.AppsFlyer) this.f24636a).getConversionData();
        JSONObject jSONObject = null;
        if ((conversionData.isEmpty() ^ true ? conversionData : null) != null) {
            jSONObject = JsonObjectBuilderKt.jsonObject(new C9705x3(conversionData));
        }
        jsonObjectBuilder.hasObject("conversion_data", jSONObject);
        return Unit.INSTANCE;
    }
}
