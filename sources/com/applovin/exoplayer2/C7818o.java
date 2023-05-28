package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.exoplayer2.o */
public final class C7818o implements C7397g {

    /* renamed from: a */
    public static final C7818o f18559a = new C7818o(0, 0, 0);

    /* renamed from: e */
    public static final C7397g.C7398a<C7818o> f18560e = $$Lambda$o$lKvSPiFc5eDrEmkBZUTcuRFFGU.INSTANCE;

    /* renamed from: b */
    public final int f18561b;

    /* renamed from: c */
    public final int f18562c;

    /* renamed from: d */
    public final int f18563d;

    public C7818o(int i, int i2, int i3) {
        this.f18561b = i;
        this.f18562c = i2;
        this.f18563d = i3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7818o m22723a(Bundle bundle) {
        return new C7818o(bundle.getInt(m22724a(0), 0), bundle.getInt(m22724a(1), 0), bundle.getInt(m22724a(2), 0));
    }

    /* renamed from: a */
    private static String m22724a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7818o)) {
            return false;
        }
        C7818o oVar = (C7818o) obj;
        return this.f18561b == oVar.f18561b && this.f18562c == oVar.f18562c && this.f18563d == oVar.f18563d;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f18561b) * 31) + this.f18562c) * 31) + this.f18563d;
    }
}
