package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfzz extends AbstractSet {
    final /* synthetic */ zzgae zza;

    zzfzz(zzgae zzgae) {
        this.zza = zzgae;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzc = this.zza.zzv(entry.getKey());
            if (zzc == -1 || !zzfxz.zza(zzgae.zzj(this.zza, zzc), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        zzgae zzgae = this.zza;
        Map zzl = zzgae.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfzx(zzgae);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = r0.zzu();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzgae r0 = r10.zza
            java.util.Map r0 = r0.zzl()
            if (r0 == 0) goto L_0x0011
            java.util.Set r0 = r0.entrySet()
            boolean r11 = r0.remove(r11)
            return r11
        L_0x0011:
            boolean r0 = r11 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x005f
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            com.google.android.gms.internal.ads.zzgae r0 = r10.zza
            boolean r2 = r0.zzq()
            if (r2 == 0) goto L_0x0021
            return r1
        L_0x0021:
            int r0 = r0.zzu()
            java.lang.Object r3 = r11.getKey()
            java.lang.Object r4 = r11.getValue()
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzgae.zzk(r11)
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            int[] r7 = r11.zzz()
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            java.lang.Object[] r8 = r11.zzA()
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            java.lang.Object[] r9 = r11.zzB()
            r5 = r0
            int r11 = com.google.android.gms.internal.ads.zzgaf.zzb(r3, r4, r5, r6, r7, r8, r9)
            r2 = -1
            if (r11 != r2) goto L_0x004e
            return r1
        L_0x004e:
            com.google.android.gms.internal.ads.zzgae r1 = r10.zza
            r1.zzp(r11, r0)
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            com.google.android.gms.internal.ads.zzgae.zzb(r11)
            com.google.android.gms.internal.ads.zzgae r11 = r10.zza
            r11.zzn()
            r11 = 1
            return r11
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfzz.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.zza.size();
    }
}
