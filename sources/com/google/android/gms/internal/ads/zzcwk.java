package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcwk implements zzbqd {
    final /* synthetic */ zzcwn zza;

    zzcwk(zzcwn zzcwn) {
        this.zza = zzcwn;
    }

    public final void zza(Object obj, Map map) {
        if (zzcwn.zzg(this.zza, map)) {
            this.zza.zzc.execute(new zzcwj(this));
        }
    }
}
