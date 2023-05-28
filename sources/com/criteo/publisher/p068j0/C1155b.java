package com.criteo.publisher.p068j0;

import com.criteo.publisher.Bid;
import com.criteo.publisher.C1057c;
import com.criteo.publisher.C1318o;
import com.criteo.publisher.CriteoInterstitial;
import com.criteo.publisher.logging.C1186a;
import com.criteo.publisher.logging.C1189b;
import com.criteo.publisher.logging.C1193e;
import com.criteo.publisher.model.InterstitialAdUnit;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.j0.b */
/* compiled from: InterstitialLogMessage.kt */
public final class C1155b {
    static {
        new C1155b();
    }

    private C1155b() {
    }

    /* renamed from: a */
    public static final C1193e m5293a(InterstitialAdUnit interstitialAdUnit) {
        return new C1193e(0, "Interstitial initialized for " + interstitialAdUnit, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static final C1193e m5295c(CriteoInterstitial criteoInterstitial) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new C1193e(0, "Interstitial(" + C1318o.m5793a(criteoInterstitial) + ") is loading", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5291a(CriteoInterstitial criteoInterstitial, Bid bid) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(C1318o.m5793a(criteoInterstitial));
        sb.append(") is loading with bid ");
        sb.append(bid != null ? C1057c.m4931a(bid) : null);
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C1193e m5294b(CriteoInterstitial criteoInterstitial) {
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(criteoInterstitial != null ? C1318o.m5793a(criteoInterstitial) : null);
        sb.append(") is loaded");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5290a(CriteoInterstitial criteoInterstitial) {
        StringBuilder sb = new StringBuilder();
        sb.append("Interstitial(");
        sb.append(criteoInterstitial != null ? C1318o.m5793a(criteoInterstitial) : null);
        sb.append(") failed to load");
        return new C1193e(0, sb.toString(), (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C1193e m5292a(CriteoInterstitial criteoInterstitial, boolean z) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new C1193e(0, "Interstitial(" + C1318o.m5793a(criteoInterstitial) + ") is isAdLoaded=" + z, (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final C1193e m5296d(CriteoInterstitial criteoInterstitial) {
        Intrinsics.checkParameterIsNotNull(criteoInterstitial, "interstitial");
        return new C1193e(0, "Interstitial(" + C1318o.m5793a(criteoInterstitial) + ") is showing", (Throwable) null, (String) null, 13, (DefaultConstructorMarker) null);
    }

    @C1186a.C1187a
    /* renamed from: a */
    public static final C1193e m5289a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calling ");
        Method enclosingMethod = new C1189b().getClass().getEnclosingMethod();
        String str = null;
        if (enclosingMethod != null) {
            if (enclosingMethod.isAnnotationPresent(C1186a.C1187a.class)) {
                C1186a aVar = C1186a.f3742a;
                StackTraceElement stackTraceElement = (StackTraceElement) SequencesKt.elementAtOrNull(SequencesKt.asSequence(ArrayIteratorKt.iterator(new Exception().getStackTrace())), 1);
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkExpressionValueIsNotNull(className, "stackTraceElement.className");
                    str = StringsKt.removePrefix(className, "com.criteo.publisher.") + '#' + stackTraceElement.getMethodName() + ':' + stackTraceElement.getLineNumber();
                }
            } else {
                str = C1186a.f3742a.m5388a(enclosingMethod);
            }
        }
        sb.append(str);
        sb.append(" with a null application");
        return new C1193e(5, sb.toString(), (Throwable) null, "onMethodCalledWithNullApplication", 4, (DefaultConstructorMarker) null);
    }
}
