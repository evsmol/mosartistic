package com.appodeal.consent.internal;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilder;
import com.appodeal.advertising.AdvertisingInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150io.bidmachine.utils.IabUtils;

/* renamed from: com.appodeal.consent.internal.i */
public final class C9777i extends Lambda implements Function1<JsonObjectBuilder, Unit> {

    /* renamed from: a */
    public final /* synthetic */ AdvertisingInfo.AdvertisingProfile f24798a;

    /* renamed from: b */
    public final /* synthetic */ C9749a f24799b;

    /* renamed from: c */
    public final /* synthetic */ Pair<Integer, Integer> f24800c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9777i(AdvertisingInfo.AdvertisingProfile advertisingProfile, C9749a aVar, Pair<Integer, Integer> pair) {
        super(1);
        this.f24798a = advertisingProfile;
        this.f24799b = aVar;
        this.f24800c = pair;
    }

    public final Object invoke(Object obj) {
        JsonObjectBuilder jsonObjectBuilder = (JsonObjectBuilder) obj;
        Intrinsics.checkNotNullParameter(jsonObjectBuilder, "$this$jsonObject");
        jsonObjectBuilder.hasValue("id", this.f24798a.getId());
        jsonObjectBuilder.hasValue("advertisingTracking", Boolean.valueOf(this.f24798a.isLimitAdTrackingEnabled()));
        jsonObjectBuilder.hasValue("type", this.f24799b.mo61321h());
        jsonObjectBuilder.hasValue("locale", this.f24799b.mo61323j());
        jsonObjectBuilder.hasValue(IabUtils.KEY_WIDTH, this.f24800c.getFirst());
        jsonObjectBuilder.hasValue(IabUtils.KEY_HEIGHT, this.f24800c.getSecond());
        jsonObjectBuilder.hasValue("hwv", this.f24799b.mo61320g());
        jsonObjectBuilder.hasValue("make", this.f24799b.mo61319f());
        jsonObjectBuilder.hasValue("os", this.f24799b.mo61324k());
        jsonObjectBuilder.hasValue("osv", this.f24799b.mo61325l());
        return Unit.INSTANCE;
    }
}
