package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbc extends zzasg implements zzbe {
    zzbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void zzb() throws RemoteException {
        zzbl(1, zza());
    }
}
