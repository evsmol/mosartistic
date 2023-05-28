package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcvy implements zzdfi {
    private final zzfkb zza;

    public zzcvy(zzfkb zzfkb) {
        this.zza = zzfkb;
    }

    public final void zzbr(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfjl e) {
            zze.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfjl e) {
            zze.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzbu(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfjl e) {
            zze.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
