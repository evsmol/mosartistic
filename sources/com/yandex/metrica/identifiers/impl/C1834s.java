package com.yandex.metrica.identifiers.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.identifiers.impl.s */
public final class C1834s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Intent f5008a;

    static {
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE").setPackage("com.huawei.hwid");
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(\"com.uodis.opende…ackage(\"com.huawei.hwid\")");
        f5008a = intent;
    }
}
