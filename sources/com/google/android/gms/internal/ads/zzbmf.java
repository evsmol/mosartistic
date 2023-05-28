package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbmf implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzbnf zza;

    public zzbmf(zzbnf zzbnf) {
        this.zza = zzbnf;
        try {
            zzbnf.zzm();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return false;
        }
    }
}
