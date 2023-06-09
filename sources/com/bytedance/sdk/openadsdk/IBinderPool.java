package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IBinderPool extends IInterface {

    public static class Default implements IBinderPool {
        public IBinder asBinder() {
            return null;
        }

        public IBinder queryBinder(int i) throws RemoteException {
            return null;
        }
    }

    IBinder queryBinder(int i) throws RemoteException;

    public static abstract class Stub extends Binder implements IBinderPool {
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static IBinderPool asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IBinderPool)) {
                return new C10663a(iBinder);
            }
            return (IBinderPool) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
                IBinder queryBinder = queryBinder(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(queryBinder);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                return true;
            }
        }

        /* renamed from: com.bytedance.sdk.openadsdk.IBinderPool$Stub$a */
        private static class C10663a implements IBinderPool {

            /* renamed from: a */
            public static IBinderPool f26625a;

            /* renamed from: b */
            private IBinder f26626b;

            C10663a(IBinder iBinder) {
                this.f26626b = iBinder;
            }

            public IBinder asBinder() {
                return this.f26626b;
            }

            public IBinder queryBinder(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    obtain.writeInt(i);
                    if (!this.f26626b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().queryBinder(i);
                    }
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    obtain2.recycle();
                    obtain.recycle();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IBinderPool iBinderPool) {
            if (C10663a.f26625a != null || iBinderPool == null) {
                return false;
            }
            C10663a.f26625a = iBinderPool;
            return true;
        }

        public static IBinderPool getDefaultImpl() {
            return C10663a.f26625a;
        }
    }
}
