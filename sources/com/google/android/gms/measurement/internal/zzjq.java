package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class zzjq implements Runnable {
    public final /* synthetic */ zzjt zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzeh zzc;
    public final /* synthetic */ Intent zzd;

    public /* synthetic */ zzjq(zzjt zzjt, int i, zzeh zzeh, Intent intent) {
        this.zza = zzjt;
        this.zzb = i;
        this.zzc = zzeh;
        this.zzd = intent;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc, this.zzd);
    }
}
