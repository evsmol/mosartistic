package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.am */
public final class C6813am implements C7397g {

    /* renamed from: a */
    public static final C6813am f14830a = new C6813am(1.0f);

    /* renamed from: d */
    public static final C7397g.C7398a<C6813am> f14831d = $$Lambda$am$2JaHuxdc0BBcW9SOBKSIQ2QZ0.INSTANCE;

    /* renamed from: b */
    public final float f14832b;

    /* renamed from: c */
    public final float f14833c;

    /* renamed from: e */
    private final int f14834e;

    public C6813am(float f) {
        this(f, 1.0f);
    }

    public C6813am(float f, float f2) {
        boolean z = true;
        C7717a.m22118a(f > 0.0f);
        C7717a.m22118a(f2 <= 0.0f ? false : z);
        this.f14832b = f;
        this.f14833c = f2;
        this.f14834e = Math.round(f * 1000.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C6813am m17559a(Bundle bundle) {
        return new C6813am(bundle.getFloat(m17560a(0), 1.0f), bundle.getFloat(m17560a(1), 1.0f));
    }

    /* renamed from: a */
    private static String m17560a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public long mo52740a(long j) {
        return j * ((long) this.f14834e);
    }

    /* renamed from: a */
    public C6813am mo52741a(float f) {
        return new C6813am(f, this.f14833c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6813am amVar = (C6813am) obj;
        return this.f14832b == amVar.f14832b && this.f14833c == amVar.f14833c;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f14832b)) * 31) + Float.floatToRawIntBits(this.f14833c);
    }

    public String toString() {
        return C7728ai.m22200a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f14832b), Float.valueOf(this.f14833c));
    }
}
