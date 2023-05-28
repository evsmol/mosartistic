package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.aj */
public final class C6810aj extends C6826aq {

    /* renamed from: a */
    public static final C7397g.C7398a<C6810aj> f14805a = $$Lambda$aj$fxgHUOv_ZkvCX2ATzGCP2wXnenA.INSTANCE;

    /* renamed from: c */
    private final float f14806c;

    public C6810aj() {
        this.f14806c = -1.0f;
    }

    public C6810aj(float f) {
        C7717a.m22119a(f >= 0.0f && f <= 100.0f, (Object) "percent must be in the range of [0, 100]");
        this.f14806c = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6810aj m17541a(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m17542a(0), -1) == 1) {
            z = true;
        }
        C7717a.m22118a(z);
        float f = bundle.getFloat(m17542a(1), -1.0f);
        return f == -1.0f ? new C6810aj() : new C6810aj(f);
    }

    /* renamed from: a */
    private static String m17542a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6810aj) && this.f14806c == ((C6810aj) obj).f14806c;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f14806c));
    }
}
