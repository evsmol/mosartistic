package com.appodeal.ads;

import com.appodeal.ads.UserSettings;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.appodeal.ads.h4 */
public final class C9211h4 extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ Map<String, Object> f23151a;

    /* renamed from: b */
    public final /* synthetic */ UserData f23152b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9211h4(HashMap hashMap, C9269l5 l5Var) {
        super(1);
        this.f23151a = hashMap;
        this.f23152b = l5Var;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        for (Map.Entry next : this.f23151a.entrySet()) {
            jsonObjectBuilder.hasValue((String) next.getKey(), next.getValue());
        }
        UserSettings.Gender gender = this.f23152b.getGender();
        jsonObjectBuilder.hasValue("appodeal_gender", gender == null ? null : Integer.valueOf(gender.getIntValue()));
        jsonObjectBuilder.hasValue("appodeal_age", this.f23152b.getAge());
        return Unit.INSTANCE;
    }
}
