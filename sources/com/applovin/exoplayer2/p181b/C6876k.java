package com.applovin.exoplayer2.p181b;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.b.k */
public final class C6876k {

    /* renamed from: a */
    public final int f15075a;

    /* renamed from: b */
    public final float f15076b;

    public C6876k(int i, float f) {
        this.f15075a = i;
        this.f15076b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6876k kVar = (C6876k) obj;
        return this.f15075a == kVar.f15075a && Float.compare(kVar.f15076b, this.f15076b) == 0;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f15075a) * 31) + Float.floatToIntBits(this.f15076b);
    }
}
