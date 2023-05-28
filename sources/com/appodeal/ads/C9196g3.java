package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.g3 */
public final class C9196g3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23122a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9196g3(C9336b bVar) {
        super(1);
        this.f23122a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue(Constants.SHOW, Integer.valueOf(((C9336b.C9345b) this.f23122a).mo60458a().mo60469g()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((C9336b.C9345b) this.f23122a).mo60458a().mo60462a(), "_show"), Integer.valueOf(((C9336b.C9345b) this.f23122a).mo60458a().mo60468f()));
        jsonObjectBuilder.hasValue(Constants.CLICK, Integer.valueOf(((C9336b.C9345b) this.f23122a).mo60458a().mo60464c()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((C9336b.C9345b) this.f23122a).mo60458a().mo60462a(), "_click"), Integer.valueOf(((C9336b.C9345b) this.f23122a).mo60458a().mo60463b()));
        jsonObjectBuilder.hasValue(Constants.FINISH, Integer.valueOf(((C9336b.C9345b) this.f23122a).mo60458a().mo60466e()));
        jsonObjectBuilder.hasValue(Intrinsics.stringPlus(((C9336b.C9345b) this.f23122a).mo60458a().mo60462a(), "_finish"), ((C9336b.C9345b) this.f23122a).mo60458a().mo60465d());
        return Unit.INSTANCE;
    }
}
