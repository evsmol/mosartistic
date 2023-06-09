package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzcnv;
import com.google.android.gms.internal.ads.zzcoq;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzaa {
    private zzaa() {
    }

    /* synthetic */ zzaa(zzz zzz) {
    }

    public static zzaa zzn(int i) {
        return i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : i >= 24 ? new zzu() : i >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zze.zzh("Failed to obtain CookieManager.", th);
            zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcnv zzd(zzcno zzcno, zzbew zzbew, boolean z) {
        return new zzcoq(zzcno, zzbew, z);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzg(Context context, String str, String str2) {
    }

    public boolean zzh(Context context, String str) {
        return false;
    }

    public int zzi(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzk(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
