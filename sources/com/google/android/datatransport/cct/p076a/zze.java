package com.google.android.datatransport.cct.p076a;

import java.util.List;

/* renamed from: com.google.android.datatransport.cct.a.zze */
/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
final class zze extends zzo {
    private final List<zzv> zza;

    zze(List<zzv> list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzo) {
            return this.zza.equals(((zzo) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.zza + "}";
    }

    public List<zzv> zza() {
        return this.zza;
    }
}
