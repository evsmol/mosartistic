package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.x3 */
public final class C9705x3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Map<String, Object> f24549a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9705x3(Map<String, ? extends Object> map) {
        super(1);
        this.f24549a = map;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (Map.Entry next : this.f24549a.entrySet()) {
            jsonObjectBuilder.hasValue((String) next.getKey(), next.getValue());
        }
        return Unit.INSTANCE;
    }
}
