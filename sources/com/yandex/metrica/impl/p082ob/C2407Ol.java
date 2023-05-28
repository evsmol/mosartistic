package com.yandex.metrica.impl.p082ob;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ol */
public final class C2407Ol {

    /* renamed from: a */
    private static final BigInteger f6378a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    private static final BigInteger f6379b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static final Pair m8087a(BigDecimal bigDecimal) {
        int i = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        Intrinsics.checkNotNullExpressionValue(unscaledValue, "value.unscaledValue()");
        while (true) {
            if (unscaledValue.compareTo(f6378a) <= 0 && unscaledValue.compareTo(f6379b) >= 0) {
                return TuplesKt.m14544to(Long.valueOf(unscaledValue.longValue()), Integer.valueOf(i));
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            Intrinsics.checkNotNullExpressionValue(unscaledValue, "bigIntMantissa.divide(BigInteger.TEN)");
            i++;
        }
    }
}
