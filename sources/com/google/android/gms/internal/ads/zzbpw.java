package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpw implements zzbqd {
    zzbpw() {
    }

    public final void zza(Object obj, Map map) {
        zze.zzi("Received log message: ".concat(String.valueOf((String) map.get("string"))));
    }
}
