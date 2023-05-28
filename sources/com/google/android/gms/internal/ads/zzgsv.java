package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public enum zzgsv implements zzgyf {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzgyg zzg = null;
    private final int zzi;

    static {
        zzg = new zzgsu();
    }

    private zzgsv(int i) {
        this.zzi = i;
    }

    public static zzgsv zzb(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
