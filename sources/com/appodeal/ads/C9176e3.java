package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.e3 */
public final class C9176e3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23028a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9176e3(C9336b bVar) {
        super(1);
        this.f23028a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("session_id", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60550e()));
        jsonObjectBuilder.hasValue("session_uuid", ((C9336b.C9356l) this.f23028a).mo60557j());
        jsonObjectBuilder.hasValue("session_uptime", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60554h()));
        jsonObjectBuilder.hasValue("session_uptime_m", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60556i()));
        jsonObjectBuilder.hasValue("session_start_ts", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60552f()));
        jsonObjectBuilder.hasValue("session_start_ts_m", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60553g()));
        jsonObjectBuilder.hasValue("app_uptime", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60548c()));
        jsonObjectBuilder.hasValue("app_uptime_m", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60549d()));
        jsonObjectBuilder.hasValue("app_session_average_length", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60546a()));
        jsonObjectBuilder.hasValue("app_session_average_length_m", Long.valueOf(((C9336b.C9356l) this.f23028a).mo60547b()));
        return Unit.INSTANCE;
    }
}
