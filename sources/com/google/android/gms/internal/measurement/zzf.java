package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzf {
    final zzax zza;
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public zzf() {
        zzax zzax = new zzax();
        this.zza = zzax;
        zzg zzg = new zzg((zzg) null, zzax);
        this.zzc = zzg;
        this.zzb = zzg.zza();
        zzj zzj = new zzj();
        this.zzd = zzj;
        this.zzc.zzg("require", new zzw(zzj));
        this.zzd.zza("internal.platform", zze.zza);
        this.zzc.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzg, zzgy... zzgyArr) {
        zzap zzap = zzap.zzf;
        for (zzgy zza2 : zzgyArr) {
            zzap = zzi.zza(zza2);
            zzh.zzc(this.zzc);
            if ((zzap instanceof zzaq) || (zzap instanceof zzao)) {
                zzap = this.zza.zza(zzg, zzap);
            }
        }
        return zzap;
    }
}
