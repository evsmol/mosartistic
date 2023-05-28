package com.applovin.exoplayer2.p222m;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.m.b */
public final class C7790b implements C7397g {

    /* renamed from: e */
    public static final C7397g.C7398a<C7790b> f18411e = $$Lambda$b$PZ_vZiGnXrcCvollwhxu8dATA.INSTANCE;

    /* renamed from: a */
    public final int f18412a;

    /* renamed from: b */
    public final int f18413b;

    /* renamed from: c */
    public final int f18414c;

    /* renamed from: d */
    public final byte[] f18415d;

    /* renamed from: f */
    private int f18416f;

    public C7790b(int i, int i2, int i3, byte[] bArr) {
        this.f18412a = i;
        this.f18413b = i2;
        this.f18414c = i3;
        this.f18415d = bArr;
    }

    /* renamed from: a */
    public static int m22545a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7790b m22546a(Bundle bundle) {
        return new C7790b(bundle.getInt(m22548c(0), -1), bundle.getInt(m22548c(1), -1), bundle.getInt(m22548c(2), -1), bundle.getByteArray(m22548c(3)));
    }

    /* renamed from: b */
    public static int m22547b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: c */
    private static String m22548c(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7790b bVar = (C7790b) obj;
        return this.f18412a == bVar.f18412a && this.f18413b == bVar.f18413b && this.f18414c == bVar.f18414c && Arrays.equals(this.f18415d, bVar.f18415d);
    }

    public int hashCode() {
        if (this.f18416f == 0) {
            this.f18416f = ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f18412a) * 31) + this.f18413b) * 31) + this.f18414c) * 31) + Arrays.hashCode(this.f18415d);
        }
        return this.f18416f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f18412a);
        sb.append(", ");
        sb.append(this.f18413b);
        sb.append(", ");
        sb.append(this.f18414c);
        sb.append(", ");
        sb.append(this.f18415d != null);
        sb.append(")");
        return sb.toString();
    }
}
