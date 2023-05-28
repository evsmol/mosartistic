package com.criteo.publisher.p066h0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.C1057c;
import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.p067i0.C1147a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.h0.a */
/* compiled from: AppBiddingLogMessage.kt */
public final class C1136a {
    static {
        new C1136a();
    }

    private C1136a() {
    }

    /* renamed from: a */
    public static final C1193e m5227a(Bid bid) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to set bids as AppBidding from bid ");
        sb.append(bid != null ? C1057c.m4931a(bid) : null);
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5228a(C1147a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        return new C1193e(0, "Failed to set bids as " + aVar + ": No bid found", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5229a(C1147a aVar, String str) {
        Intrinsics.checkParameterIsNotNull(aVar, "integration");
        Intrinsics.checkParameterIsNotNull(str, "enrichment");
        return new C1193e(0, aVar + " bid set as targeting: " + str, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5230a(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to set bids: unknown '");
        sb.append(obj != null ? obj.getClass() : null);
        sb.append("' object given");
        return new C1193e(6, sb.toString(), (Throwable) null, "onUnknownAdObjectEnriched", 4, (DefaultConstructorMarker) null);
    }
}
