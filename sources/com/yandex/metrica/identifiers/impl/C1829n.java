package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.identifiers.impl.n */
final class C1829n extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C1829n f5003a = new C1829n();

    C1829n() {
        super(1);
    }

    public Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        Intrinsics.checkNotNullParameter(iBinder, "it");
        C1818c a = C1817b.m6743a(iBinder);
        Intrinsics.checkNotNullExpressionValue(a, "YandexAdvIdInterface.Stub.asInterface(it)");
        return a;
    }
}
