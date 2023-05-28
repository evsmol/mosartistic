package com.google.android.p075a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* compiled from: BaseProxy */
public class C1736a implements IInterface {

    /* renamed from: a */
    private final IBinder f4837a;

    /* renamed from: b */
    private final String f4838b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C1736a(IBinder iBinder) {
        this.f4837a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo11845a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4838b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f4837a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo11847b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f4837a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
