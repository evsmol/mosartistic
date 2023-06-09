package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbov implements zzbqd {
    private final zzbow zza;

    public zzbov(zzbow zzbow) {
        this.zza = zzbow;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza != null) {
            String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (str == null) {
                zze.zzi("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzbu.zza(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    zze.zzh("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                zze.zzg("Failed to convert ad metadata to Bundle.");
            } else {
                this.zza.zza(str, bundle);
            }
        }
    }
}
