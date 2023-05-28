package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.k */
public final class C1826k implements C1824i {
    /* renamed from: a */
    public C1822g mo15400a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "AdvertisingIdClient.getAdvertisingIdInfo(context)");
            return new C1822g(C1827l.OK, new C1821f("google", advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), (String) null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new C1822g(C1827l.IDENTIFIER_PROVIDER_UNAVAILABLE, (C1821f) null, "could not resolve google services", 2);
        } catch (Throwable th) {
            C1827l lVar = C1827l.UNKNOWN;
            return new C1822g(lVar, (C1821f) null, "exception while fetching google adv_id: " + th.getMessage(), 2);
        }
    }
}
