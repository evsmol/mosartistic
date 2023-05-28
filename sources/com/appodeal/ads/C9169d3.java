package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.networking.binders.C9336b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p152ms.p153bd.p154o.Pgl.C5643c;

/* renamed from: com.appodeal.ads.d3 */
public final class C9169d3 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ C9336b.C9337a.C9338a f23009a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9169d3(C9336b.C9337a.C9338a aVar) {
        super(1);
        this.f23009a = aVar;
    }

    public final Object invoke(Object obj) {
        int i;
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("type", this.f23009a.getType());
        C9336b.C9337a.C9338a aVar = this.f23009a;
        if (aVar instanceof C9336b.C9337a.C9338a.C9339a) {
            jsonObjectBuilder.hasValue("animation", Boolean.valueOf(((C9336b.C9337a.C9338a.C9339a) aVar).mo60449a()));
            jsonObjectBuilder.hasValue("smart", Boolean.valueOf(((C9336b.C9337a.C9338a.C9339a) this.f23009a).mo60451c()));
            i = ((C9336b.C9337a.C9338a.C9339a) this.f23009a).mo60450b();
        } else {
            if (aVar instanceof C9336b.C9337a.C9338a.C9341c) {
                i = C5643c.COLLECT_MODE_FINANCE;
            }
            return Unit.INSTANCE;
        }
        jsonObjectBuilder.hasValue("size", Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
