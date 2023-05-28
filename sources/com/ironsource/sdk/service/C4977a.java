package com.ironsource.sdk.service;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo38197bv = {1, 0, 3}, mo38198d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo38199d2 = {"Lcom/ironsource/sdk/service/AdInstanceTimingService;", "", "()V", "instanceToTimingValuesMapping", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getInstanceToTimingValuesMapping", "()Ljava/util/HashMap;", "addTimingValueForInstance", "", "instance", "timingValue", "clearTimingValueForInstance", "getTimeElapsedForInstanceTimer", "getTimingValueForInstance", "sdk5_release"}, mo38200k = 1, mo38201mv = {1, 4, 2})
/* renamed from: com.ironsource.sdk.service.a */
public final class C4977a {

    /* renamed from: a */
    public static final C4977a f12725a = new C4977a();

    /* renamed from: b */
    private static final HashMap<String, Long> f12726b = new HashMap<>();

    private C4977a() {
    }

    /* renamed from: a */
    public static long m14471a(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        Long l = f12726b.get(str);
        if (l == null) {
            return -1;
        }
        Intrinsics.checkNotNullExpressionValue(l, "it");
        return l.longValue();
    }

    /* renamed from: a */
    public static boolean m14472a(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "instance");
        if ((str.length() == 0) || f12726b.containsKey(str)) {
            return false;
        }
        f12726b.put(str, Long.valueOf(j));
        return true;
    }

    /* renamed from: b */
    public static boolean m14473b(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        if (f12726b.get(str) == null) {
            return false;
        }
        f12726b.remove(str);
        return true;
    }

    /* renamed from: c */
    public static long m14474c(String str) {
        Intrinsics.checkNotNullParameter(str, "instance");
        Long l = f12726b.get(str);
        if (l == null) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullExpressionValue(l, "it");
        return currentTimeMillis - l.longValue();
    }
}
