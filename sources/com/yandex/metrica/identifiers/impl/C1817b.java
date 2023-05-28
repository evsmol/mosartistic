package com.yandex.metrica.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.yandex.metrica.identifiers.impl.b */
public abstract class C1817b extends Binder implements C1818c {

    /* renamed from: a */
    public static final /* synthetic */ int f4984a = 0;

    /* renamed from: a */
    public static C1818c m6743a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C1818c)) ? new C1816a(iBinder) : (C1818c) queryLocalInterface;
    }
}
