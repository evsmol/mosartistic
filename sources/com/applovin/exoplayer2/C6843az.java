package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.p221l.C7717a;

/* renamed from: com.applovin.exoplayer2.az */
public final class C6843az extends C6826aq {

    /* renamed from: a */
    public static final C7397g.C7398a<C6843az> f14967a = $$Lambda$az$Hfby8d0AKGSd4PSO0efsqRw0g.INSTANCE;

    /* renamed from: c */
    private final boolean f14968c;

    /* renamed from: d */
    private final boolean f14969d;

    public C6843az() {
        this.f14968c = false;
        this.f14969d = false;
    }

    public C6843az(boolean z) {
        this.f14968c = true;
        this.f14969d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6843az m17922a(Bundle bundle) {
        C7717a.m22118a(bundle.getInt(m17923a(0), -1) == 3);
        return bundle.getBoolean(m17923a(1), false) ? new C6843az(bundle.getBoolean(m17923a(2), false)) : new C6843az();
    }

    /* renamed from: a */
    private static String m17923a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6843az)) {
            return false;
        }
        C6843az azVar = (C6843az) obj;
        return this.f14969d == azVar.f14969d && this.f14968c == azVar.f14968c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f14968c), Boolean.valueOf(this.f14969d));
    }
}
