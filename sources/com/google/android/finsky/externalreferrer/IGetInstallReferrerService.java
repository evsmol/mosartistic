package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p075a.C1736a;
import com.google.android.p075a.C1737b;
import com.google.android.p075a.C1738c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C1737b implements IGetInstallReferrerService {

        public static class Proxy extends C1736a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo12264c(Bundle bundle) throws RemoteException {
                Parcel a = mo11845a();
                C1738c.m6658b(a, bundle);
                Parcel b = mo11847b(a);
                Bundle bundle2 = (Bundle) C1738c.m6657a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m6671b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo11848a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle c = mo12264c((Bundle) C1738c.m6657a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C1738c.m6659c(parcel2, c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo12264c(Bundle bundle) throws RemoteException;
}
