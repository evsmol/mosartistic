package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;
import p150io.bidmachine.utils.IabUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzbyt {
    private final zzcno zza;
    private final String zzb;

    public zzbyt(zzcno zzcno, String str) {
        this.zza = zzcno;
        this.zzb = str;
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(IabUtils.KEY_WIDTH, i3).put(IabUtils.KEY_HEIGHT, i4));
        } catch (JSONException e) {
            zze.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcno zzcno = this.zza;
            if (zzcno != null) {
                zzcno.zze("onError", put);
            }
        } catch (JSONException e) {
            zze.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zze.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zze("onScreenInfoChanged", new JSONObject().put(IabUtils.KEY_WIDTH, i).put(IabUtils.KEY_HEIGHT, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            zze.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(IabUtils.KEY_WIDTH, i3).put(IabUtils.KEY_HEIGHT, i4));
        } catch (JSONException e) {
            zze.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zze("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zze.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
