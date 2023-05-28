package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.m0 */
public final class C9271m0 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9315n0 f23327a;

    /* renamed from: b */
    public final /* synthetic */ int f23328b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9271m0(C9315n0 n0Var, int i) {
        super(1);
        this.f23327a = n0Var;
        this.f23328b = i;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        Iterator<String> keys = this.f23327a.f23548b.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "defaultWaterfall.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str = next;
                jsonObjectBuilder.hasValue(str, this.f23327a.f23548b.get(str));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        jsonObjectBuilder.hasValue("waterfall_ad_type", Integer.valueOf(this.f23328b));
        jsonObjectBuilder.hasValue("waterfall_start_time", Long.valueOf(System.currentTimeMillis()));
        jsonObjectBuilder.hasArray("ad_units", JsonObjectBuilderKt.jsonArray(C9260l0.f23285a));
        return Unit.INSTANCE;
    }
}
