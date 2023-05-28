package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.ax */
public final class C6838ax extends C6826aq {

    /* renamed from: a */
    public static final C7397g.C7398a<C6838ax> f14955a = $$Lambda$ax$2Ip8Yz0jcLbrAUNmvvYtGSSpeM.INSTANCE;

    /* renamed from: c */
    private final int f14956c;

    /* renamed from: d */
    private final float f14957d;

    public C6838ax(int i) {
        C7717a.m22119a(i > 0, (Object) "maxStars must be a positive integer");
        this.f14956c = i;
        this.f14957d = -1.0f;
    }

    public C6838ax(int i, float f) {
        boolean z = true;
        C7717a.m22119a(i > 0, (Object) "maxStars must be a positive integer");
        C7717a.m22119a((f < 0.0f || f > ((float) i)) ? false : z, (Object) "starRating is out of range [0, maxStars]");
        this.f14956c = i;
        this.f14957d = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6838ax m17908a(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m17909a(0), -1) == 2) {
            z = true;
        }
        C7717a.m22118a(z);
        int i = bundle.getInt(m17909a(1), 5);
        float f = bundle.getFloat(m17909a(2), -1.0f);
        return f == -1.0f ? new C6838ax(i) : new C6838ax(i, f);
    }

    /* renamed from: a */
    private static String m17909a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6838ax)) {
            return false;
        }
        C6838ax axVar = (C6838ax) obj;
        return this.f14956c == axVar.f14956c && this.f14957d == axVar.f14957d;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f14956c), Float.valueOf(this.f14957d));
    }
}
