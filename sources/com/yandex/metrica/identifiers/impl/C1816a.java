package com.yandex.metrica.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.yandex.metrica.identifiers.impl.a */
class C1816a implements C1818c {

    /* renamed from: a */
    private IBinder f4983a;

    C1816a(IBinder iBinder) {
        this.f4983a = iBinder;
    }

    public IBinder asBinder() {
        return this.f4983a;
    }

    /* renamed from: b */
    public String mo15379b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            if (!this.f4983a.transact(1, obtain, obtain2, 0)) {
                int i = C1817b.f4984a;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public boolean mo15380d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            boolean z = false;
            if (!this.f4983a.transact(2, obtain, obtain2, 0)) {
                int i = C1817b.f4984a;
            }
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
