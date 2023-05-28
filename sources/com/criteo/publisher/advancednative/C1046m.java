package com.criteo.publisher.advancednative;

import com.criteo.publisher.Bid;
import com.criteo.publisher.C1057c;
import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.model.NativeAdUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.criteo.publisher.advancednative.m */
/* compiled from: NativeLogMessage.kt */
public final class C1046m {
    static {
        new C1046m();
    }

    private C1046m() {
    }

    /* renamed from: c */
    public static final C1193e m4911c(NativeAdUnit nativeAdUnit) {
        return new C1193e(0, "NativeLoader initialized for " + nativeAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static final C1193e m4913e(CriteoNativeLoader criteoNativeLoader) {
        Intrinsics.checkParameterIsNotNull(criteoNativeLoader, "nativeLoader");
        return new C1193e(0, "Native(" + criteoNativeLoader.adUnit + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m4906a(CriteoNativeLoader criteoNativeLoader, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoNativeLoader, "nativeLoader");
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader.adUnit);
        sb.append(") is loading with bid ");
        sb.append(bid != null ? C1057c.m4931a(bid) : null);
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final C1193e m4912d(CriteoNativeLoader criteoNativeLoader) {
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
        sb.append(") is loaded");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C1193e m4908b(CriteoNativeLoader criteoNativeLoader) {
        StringBuilder sb = new StringBuilder();
        sb.append("Native(");
        sb.append(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
        sb.append(") failed to load");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final C1193e m4910c(CriteoNativeLoader criteoNativeLoader) {
        return m4909b(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
    }

    /* renamed from: b */
    public static final C1193e m4909b(NativeAdUnit nativeAdUnit) {
        return new C1193e(0, "Native(" + nativeAdUnit + ") impression registered", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m4905a(CriteoNativeLoader criteoNativeLoader) {
        return m4907a(criteoNativeLoader != null ? criteoNativeLoader.adUnit : null);
    }

    /* renamed from: a */
    public static final C1193e m4907a(NativeAdUnit nativeAdUnit) {
        return new C1193e(0, "Native(" + nativeAdUnit + ") clicked", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }
}
