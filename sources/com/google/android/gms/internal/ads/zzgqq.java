package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgqq extends zzgyd implements zzgzo {
    /* access modifiers changed from: private */
    public static final zzgqq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgqq zzgqq = new zzgqq();
        zzb = zzgqq;
        zzgyd.zzaS(zzgqq.class, zzgqq);
    }

    private zzgqq() {
    }

    public static zzgqp zzc() {
        return (zzgqp) zzb.zzaz();
    }

    public static zzgqq zze(zzgwv zzgwv, zzgxp zzgxp) throws zzgyp {
        return (zzgqq) zzgyd.zzaF(zzb, zzgwv, zzgxp);
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new zzgqq();
        } else {
            if (i2 == 4) {
                return new zzgqp((zzgqo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}