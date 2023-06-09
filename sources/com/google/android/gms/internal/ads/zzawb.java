package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawb extends zzawd {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzawb(int i, long j) {
        super(i);
        this.zza = j;
    }

    public final String toString() {
        String zzg = zzg(this.zzaR);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzg + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzawb zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzawb zzawb = (zzawb) this.zzc.get(i2);
            if (zzawb.zzaR == i) {
                return zzawb;
            }
        }
        return null;
    }

    public final zzawc zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzawc zzawc = (zzawc) this.zzb.get(i2);
            if (zzawc.zzaR == i) {
                return zzawc;
            }
        }
        return null;
    }

    public final void zzc(zzawb zzawb) {
        this.zzc.add(zzawb);
    }

    public final void zzd(zzawc zzawc) {
        this.zzb.add(zzawc);
    }
}
