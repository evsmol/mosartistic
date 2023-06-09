package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxu {
    private static final zzgxu zzb = new zzgxu(true);
    final zzhat zza = new zzhaj(16);
    private boolean zzc;
    private boolean zzd;

    private zzgxu() {
    }

    public static zzgxu zza() {
        throw null;
    }

    private static final void zzd(zzgxt zzgxt, Object obj) {
        boolean z;
        zzhbn zzb2 = zzgxt.zzb();
        zzgyn.zze(obj);
        zzhbn zzhbn = zzhbn.DOUBLE;
        zzhbo zzhbo = zzhbo.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgwv) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgyf)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgzn) || (obj instanceof zzgys)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgxt.zza()), zzgxt.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgxu zzgxu = new zzgxu();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgxu.zzc((zzgxt) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgxu.zzc((zzgxt) entry.getKey(), entry.getValue());
        }
        zzgxu.zzd = this.zzd;
        return zzgxu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxu)) {
            return false;
        }
        return this.zza.equals(((zzgxu) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            for (int i = 0; i < this.zza.zzb(); i++) {
                Map.Entry zzg = this.zza.zzg(i);
                if (zzg.getValue() instanceof zzgyd) {
                    ((zzgyd) zzg.getValue()).zzaQ();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzgxt zzgxt, Object obj) {
        if (!zzgxt.zzc()) {
            zzd(zzgxt, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzgxt, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgys) {
            this.zzd = true;
        }
        this.zza.put(zzgxt, obj);
    }

    private zzgxu(boolean z) {
        zzb();
        zzb();
    }
}
