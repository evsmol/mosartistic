package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgtr extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgtr zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgtu zze;

    static {
        zzgtr zzgtr = new zzgtr();
        zzb = zzgtr;
        zzgyd.zzaS(zzgtr.class, zzgtr);
    }

    private zzgtr() {
    }

    public static zzgtq zzc() {
        return (zzgtq) zzb.zzaz();
    }

    public static zzgtr zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgtr) zzgyd.zzaF(zzb, zzgwv, zzgxp);
    }

    static /* synthetic */ void zzh(zzgtr zzgtr, zzgtu zzgtu) {
        zzgtu.getClass();
        zzgtr.zze = zzgtu;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgtr();
        } else {
            if (i2 == 4) {
                return new zzgtq((zzgtp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgtu zzf() {
        zzgtu zzgtu = this.zze;
        return zzgtu == null ? zzgtu.zzc() : zzgtu;
    }
}
