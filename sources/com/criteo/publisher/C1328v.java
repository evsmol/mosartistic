package com.criteo.publisher;

import com.criteo.publisher.logging.C1186a;
import com.criteo.publisher.logging.C1189b;
import com.criteo.publisher.logging.C1193e;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* renamed from: com.criteo.publisher.v */
/* compiled from: ErrorLogMessage.kt */
public final class C1328v {
    static {
        new C1328v();
    }

    private C1328v() {
    }

    @C1186a.C1187a
    /* renamed from: b */
    public static final C1193e m5922b(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        StringBuilder sb = new StringBuilder();
        sb.append("Internal error in ");
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
        return new C1193e(6, sb.toString(), th, "onUncaughtErrorAtPublicApi");
    }

    /* renamed from: c */
    public static final C1193e m5923c(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new C1193e(6, "Uncaught error in thread", th, "onUncaughtErrorInThread");
    }

    /* renamed from: a */
    public static final C1193e m5921a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new C1193e(6, "Assertion failed", th, "onAssertFailed");
    }

    /* renamed from: d */
    public static final C1193e m5924d(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return new C1193e(4, "Uncaught expected exception in thread", th, "onUncaughtExpectedExceptionInThread");
    }
}
