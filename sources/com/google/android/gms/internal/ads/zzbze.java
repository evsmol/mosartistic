package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbze implements NativeCustomFormatAd {
    private final zzbnf zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomFormatAd.DisplayOpenMeasurement zzd;

    public zzbze(zzbnf zzbnf) {
        Context context;
        this.zza = zzbnf;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbnf.zzh());
        } catch (RemoteException | NullPointerException e) {
            zzcho.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzr(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzcho.zzh("", e2);
            }
        }
        this.zzb = mediaView;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbyw(this.zza);
            }
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
        return this.zzd;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzbml zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbyx(zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return null;
        }
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new zzep(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            zzcho.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            zzdq zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e) {
            zzcho.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzc;
    }

    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            zzcho.zzh("", e);
        }
    }
}
