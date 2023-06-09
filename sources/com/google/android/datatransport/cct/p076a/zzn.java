package com.google.android.datatransport.cct.p076a;

import com.google.android.datatransport.cct.p076a.zzy;

/* renamed from: com.google.android.datatransport.cct.a.zzn */
/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
final class zzn extends zzy {
    private final zzy.zzc zza;
    private final zzy.zzb zzb;

    /* renamed from: com.google.android.datatransport.cct.a.zzn$zza */
    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends zzy.zza {
        private zzy.zzc zza;
        private zzy.zzb zzb;

        zza() {
        }

        public zzy.zza zza(zzy.zzc zzc) {
            this.zza = zzc;
            return this;
        }

        public zzy.zza zza(zzy.zzb zzb2) {
            this.zzb = zzb2;
            return this;
        }

        public zzy zza() {
            return new zzn(this.zza, this.zzb, (zzm) null);
        }
    }

    /* synthetic */ zzn(zzy.zzc zzc, zzy.zzb zzb2, zzm zzm) {
        this.zza = zzc;
        this.zzb = zzb2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy.zzc zzc = this.zza;
        if (zzc != null ? zzc.equals(((zzn) obj).zza) : ((zzn) obj).zza == null) {
            zzy.zzb zzb2 = this.zzb;
            if (zzb2 == null) {
                if (((zzn) obj).zzb == null) {
                    return true;
                }
            } else if (zzb2.equals(((zzn) obj).zzb)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        zzy.zzc zzc = this.zza;
        int i = 0;
        int hashCode = ((zzc == null ? 0 : zzc.hashCode()) ^ 1000003) * 1000003;
        zzy.zzb zzb2 = this.zzb;
        if (zzb2 != null) {
            i = zzb2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.zza + ", mobileSubtype=" + this.zzb + "}";
    }

    public zzy.zzb zzb() {
        return this.zzb;
    }

    public zzy.zzc zzc() {
        return this.zza;
    }
}
