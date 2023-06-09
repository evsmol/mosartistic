package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzagt implements zzahd {
    private final zzee zza;
    private final zzef zzb;
    private final String zzc;
    private String zzd;
    private zzaaq zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzagt() {
        this((String) null);
    }

    public final void zza(zzef zzef) {
        zzdd.zzb(this.zze);
        while (zzef.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzef.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzef.zzk() == 11;
                    } else {
                        int zzk2 = zzef.zzk();
                        if (zzk2 == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzef zzef2 = this.zzb;
                            zzef2.zzH()[0] = Ascii.f15555VT;
                            zzef2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk2 == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzef.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzef, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, (zzaap) null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzef.zza(), 128 - this.zzg);
                zzef.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzh(0);
                    zzyj zze2 = zzyk.zze(this.zza);
                    zzaf zzaf = this.zzj;
                    if (zzaf == null || zze2.zzc != zzaf.zzz || zze2.zzb != zzaf.zzA || !zzen.zzT(zze2.zza, zzaf.zzm)) {
                        zzad zzad = new zzad();
                        zzad.zzH(this.zzd);
                        zzad.zzS(zze2.zza);
                        zzad.zzw(zze2.zzc);
                        zzad.zzT(zze2.zzb);
                        zzad.zzK(this.zzc);
                        zzaf zzY = zzad.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze2.zzd;
                    this.zzi = (((long) zze2.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        zzaip.zzc();
        this.zzd = zzaip.zzb();
        this.zze = zzzm.zzv(zzaip.zza(), 1);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzagt(String str) {
        zzee zzee = new zzee(new byte[128], 128);
        this.zza = zzee;
        this.zzb = new zzef(zzee.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
