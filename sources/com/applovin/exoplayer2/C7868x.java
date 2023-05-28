package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.x */
public final class C7868x extends C6826aq {

    /* renamed from: a */
    public static final C7397g.C7398a<C7868x> f18968a = $$Lambda$x$ZnAIZuLi96U9yFVSicQt2fz4VxA.INSTANCE;

    /* renamed from: c */
    private final boolean f18969c;

    /* renamed from: d */
    private final boolean f18970d;

    public C7868x() {
        this.f18969c = false;
        this.f18970d = false;
    }

    public C7868x(boolean z) {
        this.f18969c = true;
        this.f18970d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C7868x m23300a(Bundle bundle) {
        C7717a.m22118a(bundle.getInt(m23301a(0), -1) == 0);
        return bundle.getBoolean(m23301a(1), false) ? new C7868x(bundle.getBoolean(m23301a(2), false)) : new C7868x();
    }

    /* renamed from: a */
    private static String m23301a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7868x)) {
            return false;
        }
        C7868x xVar = (C7868x) obj;
        return this.f18970d == xVar.f18970d && this.f18969c == xVar.f18969c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f18969c), Boolean.valueOf(this.f18970d));
    }
}
