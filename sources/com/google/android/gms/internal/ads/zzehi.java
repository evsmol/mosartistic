package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzehi implements zzgen {
    final /* synthetic */ zzcbx zza;

    zzehi(zzehm zzehm, zzcbx zzcbx) {
        this.zza = zzcbx;
    }

    public final void zza(Throwable th) {
        try {
            this.zza.zze(zzaz.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
