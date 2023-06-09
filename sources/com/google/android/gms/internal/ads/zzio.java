package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzio implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzgl, zzgp, zzhb, zzkf, zznq, zzrh, zzuj, zzye {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzis zza;

    /* synthetic */ zzio(zzis zzis, zzin zzin) {
        this.zza = zzis;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzis.zzN(this.zza, surfaceTexture);
        this.zza.zzao(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzar((Object) null);
        this.zza.zzao(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzao(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzao(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzao(0, 0);
    }

    public final void zza(boolean z) {
        this.zza.zzav();
    }

    public final void zzb(Exception exc) {
        this.zza.zzr.zzy(exc);
    }

    public final void zzc(String str, long j, long j2) {
        this.zza.zzr.zzz(str, j, j2);
    }

    public final void zzd(String str) {
        this.zza.zzr.zzA(str);
    }

    public final void zze(zzgs zzgs) {
        this.zza.zzr.zzB(zzgs);
        this.zza.zzM = null;
        this.zza.zzU = null;
    }

    public final void zzf(zzgs zzgs) {
        this.zza.zzU = zzgs;
        this.zza.zzr.zzC(zzgs);
    }

    public final void zzg(zzaf zzaf, zzgt zzgt) {
        this.zza.zzM = zzaf;
        this.zza.zzr.zzD(zzaf, zzgt);
    }

    public final void zzh(long j) {
        this.zza.zzr.zzE(j);
    }

    public final void zzi(Exception exc) {
        this.zza.zzr.zzF(exc);
    }

    public final void zzj(int i, long j, long j2) {
        this.zza.zzr.zzG(i, j, j2);
    }

    public final void zzk(int i, long j) {
        this.zza.zzr.zzH(i, j);
    }

    public final void zzl(Object obj, long j) {
        this.zza.zzr.zzI(obj, j);
        zzis zzis = this.zza;
        if (zzis.zzO == obj) {
            zzdt zzz = zzis.zzl;
            zzz.zzd(26, zzii.zza);
            zzz.zzc();
        }
    }

    public final void zzm(boolean z) {
        zzis zzis = this.zza;
        if (zzis.zzY != z) {
            zzis.zzY = z;
            zzdt zzz = this.zza.zzl;
            zzz.zzd(23, new zzil(z));
            zzz.zzc();
        }
    }

    public final void zzn(Exception exc) {
        this.zza.zzr.zzJ(exc);
    }

    public final void zzo(String str, long j, long j2) {
        this.zza.zzr.zzK(str, j, j2);
    }

    public final void zzp(String str) {
        this.zza.zzr.zzL(str);
    }

    public final void zzq(zzgs zzgs) {
        this.zza.zzr.zzM(zzgs);
        this.zza.zzL = null;
        this.zza.zzT = null;
    }

    public final void zzr(zzgs zzgs) {
        this.zza.zzT = zzgs;
        this.zza.zzr.zzN(zzgs);
    }

    public final void zzs(long j, int i) {
        this.zza.zzr.zzO(j, i);
    }

    public final void zzt(zzaf zzaf, zzgt zzgt) {
        this.zza.zzL = zzaf;
        this.zza.zzr.zzP(zzaf, zzgt);
    }

    public final void zzu(zzda zzda) {
        this.zza.zzad = zzda;
        zzdt zzz = this.zza.zzl;
        zzz.zzd(25, new zzim(zzda));
        zzz.zzc();
    }
}
