package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.identifiers.impl.q */
final class C1832q extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C1832q f5006a = new C1832q();

    C1832q() {
        super(1);
    }

    public Object invoke(Object obj) {
        C1837v vVar;
        IBinder iBinder = (IBinder) obj;
        Intrinsics.checkNotNullParameter(iBinder, "it");
        int i = C1836u.f5010a;
        if (iBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            vVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C1837v)) ? new C1835t(iBinder) : (C1837v) queryLocalInterface;
        }
        Intrinsics.checkNotNullExpressionValue(vVar, "OpenDeviceIdentifierService.Stub.asInterface(it)");
        return vVar;
    }
}
