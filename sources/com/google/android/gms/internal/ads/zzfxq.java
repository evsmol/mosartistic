package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzfxq implements zzfyf {
    protected zzfxq() {
    }

    public static zzfxq zzc(char c) {
        return new zzfxn(c);
    }

    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
