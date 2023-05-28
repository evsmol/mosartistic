package com.appodeal.consent.internal;

import com.appnext.base.p264b.C8849c;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.advertising.AdvertisingInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.appodeal.consent.internal.j */
public final class C9778j {

    /* renamed from: com.appodeal.consent.internal.j$a */
    public static final class C9779a extends Lambda implements Function1<JsonObjectBuilder, Unit> {

        /* renamed from: a */
        public final /* synthetic */ C9749a f24801a;

        /* renamed from: b */
        public final /* synthetic */ AdvertisingInfo.AdvertisingProfile f24802b;

        /* renamed from: c */
        public final /* synthetic */ Pair<Integer, Integer> f24803c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9779a(AdvertisingInfo.AdvertisingProfile advertisingProfile, C9749a aVar, Pair pair) {
            super(1);
            this.f24801a = aVar;
            this.f24802b = advertisingProfile;
            this.f24803c = pair;
        }

        public final Object invoke(Object obj) {
            JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
            Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
            jsonObjectBuilder.hasObject("app", JsonObjectBuilderKt.jsonObject(new C9776h(this.f24801a)));
            jsonObjectBuilder.hasObject("device", JsonObjectBuilderKt.jsonObject(new C9777i(this.f24802b, this.f24801a, this.f24803c)));
            jsonObjectBuilder.hasObject("consent", this.f24801a.mo61317d().toJson());
            jsonObjectBuilder.hasValue("sdk_ver", this.f24801a.mo61316c());
            jsonObjectBuilder.hasValue("ver", this.f24801a.mo61318e());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static JSONObject m28608a(C9749a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C8849c.DATA);
        AdvertisingInfo.AdvertisingProfile a = aVar.mo61314a();
        Pair<Integer, Integer> n = aVar.mo61327n();
        JSONObject jSONObject = new JSONObject(aVar.mo61322i());
        JsonObjectBuilderKt.jsonObject(jSONObject, new C9779a(a, aVar, n));
        return jSONObject;
    }
}
