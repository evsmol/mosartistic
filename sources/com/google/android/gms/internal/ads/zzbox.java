package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbox implements zzbqd {
    private final zzboy zza;

    public zzbox(zzboy zzboy) {
        this.zza = zzboy;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zze.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbF(str, (String) map.get("info"));
        }
    }
}
