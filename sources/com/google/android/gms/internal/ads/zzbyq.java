package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C1766R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbyq extends zzbyt {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbyq(zzcno zzcno, Map map) {
        super(zzcno, "storePicture");
        this.zza = map;
        this.zzb = zzcno.zzk();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzg("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new zzbit(this.zzb).zzc()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzt.zzp();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zzd = zzt.zzo().zzd();
                zzt.zzp();
                AlertDialog.Builder zzG = zzs.zzG(this.zzb);
                zzG.setTitle(zzd != null ? zzd.getString(C1766R.string.f4844s1) : "Save image");
                zzG.setMessage(zzd != null ? zzd.getString(C1766R.string.f4845s2) : "Allow Ad to store image in Picture gallery?");
                zzG.setPositiveButton(zzd != null ? zzd.getString(C1766R.string.f4846s3) : "Accept", new zzbyo(this, str, lastPathSegment));
                zzG.setNegativeButton(zzd != null ? zzd.getString(C1766R.string.f4847s4) : "Decline", new zzbyp(this));
                zzG.create().show();
                return;
            }
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
        }
    }
}
