package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.p */
public final class C1831p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Intent f5005a;

    static {
        Intent intent = new Intent("com.yandex.android.advid.IDENTIFIER_SERVICE").setPackage("com.yandex.android.advid");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.yandex.andro…om.yandex.android.advid\")");
        f5005a = intent;
    }
}
