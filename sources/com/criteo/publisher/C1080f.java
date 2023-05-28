package com.criteo.publisher;

import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.C1267n;
import com.criteo.publisher.p067i0.C1147a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.f */
/* compiled from: BiddingLogMessage.kt */
public final class C1080f {
    static {
        new C1080f();
    }

    private C1080f() {
    }

    /* renamed from: a */
    public static final C1193e m5022a(AdUnit adUnit, Bid bid) {
        Intrinsics.checkParameterIsNotNull(adUnit, "adUnit");
        StringBuilder sb = new StringBuilder();
        sb.append("Getting bid response for ");
        sb.append(adUnit);
        sb.append(". Bid: ");
        Double d = null;
        sb.append(bid != null ? C1057c.m4931a(bid) : null);
        sb.append(", price: ");
        if (bid != null) {
            d = Double.valueOf(bid.getPrice());
        }
        sb.append(d);
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5021a(int i) {
        return new C1193e(0, "Silent mode is enabled, no requests will be fired for the next " + i + " seconds", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5023a(C1267n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "adUnit");
        return new C1193e(5, "Found an invalid AdUnit: " + nVar, (Throwable) null, "onInvalidAdUnit", 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5024a(C1267n nVar, C1147a aVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "cacheAdUnit");
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        return new C1193e(6, nVar + " requested but it is not supported for " + aVar, (Throwable) null, "onUnsupportedAdFormat", 4, (DefaultConstructorMarker) null);
    }
}
