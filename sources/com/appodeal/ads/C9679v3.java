package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.v3 */
public final class C9679v3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f24503a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9679v3(C9336b bVar) {
        super(1);
        this.f24503a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("user_id", ((C9336b.C9358n) this.f24503a).mo60566d());
        jsonObjectBuilder.hasValue("locale", ((C9336b.C9358n) this.f24503a).mo60569f());
        jsonObjectBuilder.hasValue("consent", Boolean.valueOf(((C9336b.C9358n) this.f24503a).mo60564b()));
        jsonObjectBuilder.hasObject("consent_report", ((C9336b.C9358n) this.f24503a).mo60565c());
        jsonObjectBuilder.hasObject("token", ((C9336b.C9358n) this.f24503a).mo60571h());
        jsonObjectBuilder.hasValue("user_agent", ((C9336b.C9358n) this.f24503a).mo60563a());
        jsonObjectBuilder.hasValue("timezone", ((C9336b.C9358n) this.f24503a).mo60570g());
        jsonObjectBuilder.hasValue("local_time", Long.valueOf(((C9336b.C9358n) this.f24503a).mo60567e()));
        return Unit.INSTANCE;
    }
}
