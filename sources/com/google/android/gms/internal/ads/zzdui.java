package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdui extends zzbnb {
    private final String zza;
    private final zzdqb zzb;
    private final zzdqg zzc;

    public zzdui(String str, zzdqb zzdqb, zzdqg zzdqg) {
        this.zza = str;
        this.zzb = zzdqb;
        this.zzc = zzdqg;
    }

    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    public final zzdq zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbmd zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbml zze() throws RemoteException {
        return this.zzc.zzo();
    }

    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzt();
    }

    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzh() throws RemoteException {
        return this.zzc.zzv();
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzw();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzk() throws RemoteException {
        return this.zzc.zzz();
    }

    public final String zzl() throws RemoteException {
        return this.zza;
    }

    public final List zzm() throws RemoteException {
        return this.zzc.zzE();
    }

    public final void zzn() throws RemoteException {
        this.zzb.zzaa();
    }

    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzC(bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzH(bundle);
    }

    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzU(bundle);
    }
}
