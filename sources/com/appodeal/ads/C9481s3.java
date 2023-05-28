package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.s3 */
public final class C9481s3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f24073a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9481s3(C9336b bVar) {
        super(1);
        this.f24073a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("ifa", ((C9336b.C9348d) this.f24073a).mo60479c());
        jsonObjectBuilder.hasValue("advertising_tracking", ((C9336b.C9348d) this.f24073a).mo60478b());
        jsonObjectBuilder.hasValue("adidg", Boolean.valueOf(((C9336b.C9348d) this.f24073a).mo60477a()));
        return Unit.INSTANCE;
    }
}
