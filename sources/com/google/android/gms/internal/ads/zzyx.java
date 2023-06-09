package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzyx implements zzaam {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzyx(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
            return;
        }
        this.zzf = 0;
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzaak zzg(long j) {
        int zzd2 = zzen.zzd(this.zze, j, true, true);
        zzaan zzaan = new zzaan(this.zze[zzd2], this.zzc[zzd2]);
        if (zzaan.zzb >= j || zzd2 == this.zza - 1) {
            return new zzaak(zzaan, zzaan);
        }
        int i = zzd2 + 1;
        return new zzaak(zzaan, new zzaan(this.zze[i], this.zzc[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
