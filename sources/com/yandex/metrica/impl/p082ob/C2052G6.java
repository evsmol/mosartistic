package com.yandex.metrica.impl.p082ob;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.G6 */
public final class C2052G6 {

    /* renamed from: a */
    public static final C2052G6 f5445a = new C2052G6();

    private C2052G6() {
    }

    /* renamed from: a */
    public static final C2016F6 m7253a(Throwable th) {
        return f5445a.m7254a(th, 1, 0);
    }

    /* renamed from: a */
    private final C2016F6 m7254a(Throwable th, int i, int i2) {
        StackTraceElement[] stackTraceElementArr;
        C2016F6 f6;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        Intrinsics.checkNotNullExpressionValue(stackTraceElementArr, "Utils.getStackTraceSafely(throwable)");
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement d6 : stackTraceElementArr) {
            arrayList2.add(new C1947D6(d6));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (!(i2 < i)) {
                cause = null;
            }
            if (cause != null) {
                f6 = f5445a.m7254a(cause, 30, i2 + 1);
                if (C1848A2.m6808a(19) || i2 >= i) {
                    arrayList = null;
                } else {
                    Throwable[] suppressed = th.getSuppressed();
                    Intrinsics.checkNotNullExpressionValue(suppressed, "throwable.suppressed");
                    ArrayList arrayList3 = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        C2052G6 g6 = f5445a;
                        Intrinsics.checkNotNullExpressionValue(th2, "it");
                        arrayList3.add(g6.m7254a(th2, 1, i2));
                    }
                    arrayList = arrayList3;
                }
                return new C2016F6(name, message, arrayList2, f6, arrayList);
            }
        }
        f6 = null;
        if (C1848A2.m6808a(19)) {
        }
        arrayList = null;
        return new C2016F6(name, message, arrayList2, f6, arrayList);
    }
}
