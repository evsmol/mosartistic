package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbdf {
    final long zza;
    final String zzb;
    final int zzc;

    zzbdf(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbdf)) {
            zzbdf zzbdf = (zzbdf) obj;
            if (zzbdf.zza == this.zza && zzbdf.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
