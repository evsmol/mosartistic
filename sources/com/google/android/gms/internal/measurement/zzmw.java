package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmw extends zzmx {
    zzmw(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    public final void zzc(Object obj, long j, boolean z) {
        if (zzmy.zzb) {
            zzmy.zzD(obj, j, r3 ? (byte) 1 : 0);
        } else {
            zzmy.zzE(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    public final void zzd(Object obj, long j, byte b) {
        if (zzmy.zzb) {
            zzmy.zzD(obj, j, b);
        } else {
            zzmy.zzE(obj, j, b);
        }
    }

    public final void zze(Object obj, long j, double d) {
        zzo(obj, j, Double.doubleToLongBits(d));
    }

    public final void zzf(Object obj, long j, float f) {
        zzn(obj, j, Float.floatToIntBits(f));
    }

    public final boolean zzg(Object obj, long j) {
        if (zzmy.zzb) {
            return zzmy.zzt(obj, j);
        }
        return zzmy.zzu(obj, j);
    }
}
