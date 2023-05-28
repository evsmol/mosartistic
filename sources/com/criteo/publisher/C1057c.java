package com.criteo.publisher;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.c */
/* compiled from: BidExt.kt */
public final class C1057c {
    /* renamed from: a */
    public static final String m4931a(Bid bid) {
        Intrinsics.checkParameterIsNotNull(bid, "$this$loggingId");
        String hexString = Integer.toHexString(bid.hashCode());
        Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(hashCode())");
        return hexString;
    }
}
