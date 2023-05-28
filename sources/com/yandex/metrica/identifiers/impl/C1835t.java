package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.yandex.metrica.identifiers.impl.t */
class C1835t implements C1837v {

    /* renamed from: a */
    private IBinder f5009a;

    C1835t(IBinder iBinder) {
        this.f5009a = iBinder;
    }

    /* renamed from: a */
    public String mo15402a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f5009a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f5009a;
    }

    /* renamed from: c */
    public boolean mo15404c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            boolean z = false;
            this.f5009a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
