package com.applovin.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;

/* renamed from: com.applovin.exoplayer2.f */
public final class C7365f extends Binder {

    /* renamed from: a */
    private static final int f16812a = (C7728ai.f18249a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);

    /* renamed from: b */
    private final C7033s<Bundle> f16813b;

    /* renamed from: a */
    public static C7033s<Bundle> m20313a(IBinder iBinder) {
        int readInt;
        C7033s.C7034a i = C7033s.m18804i();
        int i2 = 1;
        int i3 = 0;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    i.mo53515a((Bundle) C7717a.m22120b(obtain2.readBundle()));
                    i3++;
                }
                obtain2.recycle();
                obtain.recycle();
                i2 = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return i.mo53531a();
    }

    /* access modifiers changed from: protected */
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = 0;
        if (parcel2 == null) {
            return false;
        }
        int size = this.f16813b.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f16812a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) this.f16813b.get(readInt));
            readInt++;
        }
        if (readInt < size) {
            i3 = 2;
        }
        parcel2.writeInt(i3);
        return true;
    }
}
