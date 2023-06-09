package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzewp implements zzezm {
    private final zzgfc zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzewp(zzgfc zzgfc, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgfc;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzewo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzewq zzc() throws Exception {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfp)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzewq(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        boolean z = null;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfq)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                boolean z2 = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                            z2 = false;
                        }
                        z = Boolean.valueOf(z2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    z = true;
                }
                return new zzewq(z);
            }
        }
        return new zzewq((Boolean) null);
    }
}
