package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.i3 */
public final class C9220i3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23182a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9220i3(C9336b bVar) {
        super(1);
        this.f23182a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue(Constants.DEBUG_INTERSTITIAL, ((C9336b.C9351g) this.f23182a).mo60528a());
        jsonObjectBuilder.hasArray("sa", ((C9336b.C9351g) this.f23182a).mo60530c());
        jsonObjectBuilder.hasValue("check_sdk_version", ((C9336b.C9351g) this.f23182a).mo60529b());
        return Unit.INSTANCE;
    }
}
