package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzug {
    public static final zzug zza = new zzug(new zzcp[0]);
    public static final zzn zzb = zzuf.zza;
    public final int zzc;
    private final zzgau zzd;
    private int zze;

    public zzug(zzcp... zzcpArr) {
        this.zzd = zzgau.zzn(zzcpArr);
        this.zzc = zzcpArr.length;
        int i = 0;
        while (i < this.zzd.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzd.size(); i3++) {
                if (((zzcp) this.zzd.get(i)).equals(this.zzd.get(i3))) {
                    zzdw.zzc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzug zzug = (zzug) obj;
            return this.zzc == zzug.zzc && this.zzd.equals(zzug.zzd);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzd.hashCode();
        this.zze = hashCode;
        return hashCode;
    }

    public final int zza(zzcp zzcp) {
        int indexOf = this.zzd.indexOf(zzcp);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcp zzb(int i) {
        return (zzcp) this.zzd.get(i);
    }
}
