package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxg extends zzgxk {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgxg(byte[] bArr, int i, int i2) {
        super((zzgxj) null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i2) | i2) >= 0) {
                this.zza = bArr;
                this.zzc = 0;
                this.zzb = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
        }
        throw new NullPointerException("buffer");
    }

    public final void zzN() {
    }

    public final void zzP(int i, boolean z) throws IOException {
        zzs(i << 3);
        zzO(z ? (byte) 1 : 0);
    }

    public final void zzQ(int i, zzgwv zzgwv) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgwv.zzd());
        zzgwv.zzo(this);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, i, i2);
    }

    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zzh(int i, int i2) throws IOException {
        zzs((i << 3) | 5);
        zzi(i2);
    }

    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            this.zzc = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.zzc = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzc = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzj(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzk(j);
    }

    public final void zzk(long j) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            int i2 = i + 1;
            this.zzc = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i2 + 1;
            this.zzc = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            this.zzc = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.zzc = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            this.zzc = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i6 + 1;
            this.zzc = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i7 + 1;
            this.zzc = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.zzc = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzl(int i, int i2) throws IOException {
        zzs(i << 3);
        zzm(i2);
    }

    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i, zzgzn zzgzn, zzhag zzhag) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzgwe) zzgzn).zzas(zzhag));
        zzhag.zzn(zzgzn, this.zze);
    }

    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzE = zzE(str.length() * 3);
            int zzE2 = zzE(str.length());
            if (zzE2 == zzE) {
                int i2 = i + zzE2;
                this.zzc = i2;
                int zzd = zzhbm.zzd(str, this.zza, i2, this.zzb - i2);
                this.zzc = i;
                zzs((zzd - i) - zzE2);
                this.zzc = zzd;
                return;
            }
            zzs(zzhbm.zze(str));
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            this.zzc = zzhbm.zzd(str, bArr, i3, this.zzb - i3);
        } catch (zzhbl e) {
            this.zzc = i;
            zzJ(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgxh(e2);
        }
    }

    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    public final void zzr(int i, int i2) throws IOException {
        zzs(i << 3);
        zzs(i2);
    }

    public final void zzt(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    public final void zzO(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i2)}), e);
        }
    }

    public final void zzs(int i) throws IOException {
        while ((i & -128) != 0) {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            this.zzc = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.zza;
            int i3 = this.zzc;
            this.zzc = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
        }
    }

    public final void zzu(long j) throws IOException {
        if (!zzgxk.zzb || this.zzb - this.zzc < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.zza;
                int i = this.zzc;
                this.zzc = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.zza;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new zzgxh(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zzhbh.zzq(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            zzhbh.zzq(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
