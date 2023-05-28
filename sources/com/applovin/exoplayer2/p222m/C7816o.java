package com.applovin.exoplayer2.p222m;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;

/* renamed from: com.applovin.exoplayer2.m.o */
public final class C7816o implements C7397g {

    /* renamed from: a */
    public static final C7816o f18542a = new C7816o(0, 0);

    /* renamed from: f */
    public static final C7397g.C7398a<C7816o> f18543f = $$Lambda$o$_SvHihiuGVws5zym7HfnDtVCEOA.INSTANCE;

    /* renamed from: b */
    public final int f18544b;

    /* renamed from: c */
    public final int f18545c;

    /* renamed from: d */
    public final int f18546d;

    /* renamed from: e */
    public final float f18547e;

    public C7816o(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public C7816o(int i, int i2, int i3, float f) {
        this.f18544b = i;
        this.f18545c = i2;
        this.f18546d = i3;
        this.f18547e = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7816o m22713a(Bundle bundle) {
        return new C7816o(bundle.getInt(m22714a(0), 0), bundle.getInt(m22714a(1), 0), bundle.getInt(m22714a(2), 0), bundle.getFloat(m22714a(3), 1.0f));
    }

    /* renamed from: a */
    private static String m22714a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7816o)) {
            return false;
        }
        C7816o oVar = (C7816o) obj;
        return this.f18544b == oVar.f18544b && this.f18545c == oVar.f18545c && this.f18546d == oVar.f18546d && this.f18547e == oVar.f18547e;
    }

    public int hashCode() {
        return ((((((217 + this.f18544b) * 31) + this.f18545c) * 31) + this.f18546d) * 31) + Float.floatToRawIntBits(this.f18547e);
    }
}
