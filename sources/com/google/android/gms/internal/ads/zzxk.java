package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzxk extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzxi zzd;
    private boolean zze;

    /* synthetic */ zzxk(zzxi zzxi, SurfaceTexture surfaceTexture, boolean z, zzxj zzxj) {
        super(surfaceTexture);
        this.zzd = zzxi;
        this.zza = z;
    }

    public static zzxk zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdd.zzf(z2);
        zzxi zzxi = new zzxi();
        if (z) {
            i = zzb;
        }
        return zzxi.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzxk.class) {
            if (!zzc) {
                int i2 = 2;
                if (zzen.zza >= 24) {
                    if (zzen.zza < 26) {
                        if (!"samsung".equals(zzen.zzc)) {
                            if ("XT1650".equals(zzen.zzd)) {
                            }
                        }
                    }
                    if (zzen.zza >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i2 = 1;
                            }
                            zzb = i2;
                            zzc = true;
                        }
                    }
                }
                i2 = 0;
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
