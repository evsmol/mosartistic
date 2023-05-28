package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.k3 */
public final class C9254k3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b f23263a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9254k3(C9336b bVar) {
        super(1);
        this.f23263a = bVar;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("type", ((C9336b.C9337a) this.f23263a).mo60436b());
        jsonObjectBuilder.hasValue("main_id", ((C9336b.C9337a) this.f23263a).mo60442g());
        jsonObjectBuilder.hasValue("segment_id", Long.valueOf(((C9336b.C9337a) this.f23263a).mo60445i()));
        jsonObjectBuilder.hasValue("rewarded_video", ((C9336b.C9337a) this.f23263a).mo60443h());
        jsonObjectBuilder.hasValue("large_banners", ((C9336b.C9337a) this.f23263a).mo60441f());
        jsonObjectBuilder.hasValue("show_timestamp", ((C9336b.C9337a) this.f23263a).mo60446j());
        jsonObjectBuilder.hasValue("click_timestamp", ((C9336b.C9337a) this.f23263a).mo60437c());
        jsonObjectBuilder.hasValue("finish_timestamp", ((C9336b.C9337a) this.f23263a).mo60438d());
        jsonObjectBuilder.hasValue("impid", ((C9336b.C9337a) this.f23263a).mo60439e());
        C9336b.C9337a.C9338a a = ((C9336b.C9337a) this.f23263a).mo60435a();
        jsonObjectBuilder.hasObject("ad_properties", a == null ? null : JsonObjectBuilderKt.jsonObject(new C9169d3(a)));
        return Unit.INSTANCE;
    }
}
