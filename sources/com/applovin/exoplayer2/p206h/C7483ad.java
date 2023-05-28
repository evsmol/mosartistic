package com.applovin.exoplayer2.p206h;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;
import com.applovin.exoplayer2.common.p183a.C7033s;
import com.applovin.exoplayer2.p221l.C7731c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.h.ad */
public final class C7483ad implements C7397g {

    /* renamed from: a */
    public static final C7483ad f17172a = new C7483ad(new C7482ac[0]);

    /* renamed from: c */
    public static final C7397g.C7398a<C7483ad> f17173c = $$Lambda$ad$uMtsTlt05wF0QGFZkPAW37R4W4I.INSTANCE;

    /* renamed from: b */
    public final int f17174b;

    /* renamed from: d */
    private final C7482ac[] f17175d;

    /* renamed from: e */
    private int f17176e;

    public C7483ad(C7482ac... acVarArr) {
        this.f17175d = acVarArr;
        this.f17174b = acVarArr.length;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7483ad m20858a(Bundle bundle) {
        return new C7483ad((C7482ac[]) C7731c.m22275a(C7482ac.f17168b, (List<Bundle>) bundle.getParcelableArrayList(m20859b(0)), C7033s.m18803g()).toArray(new C7482ac[0]));
    }

    /* renamed from: b */
    private static String m20859b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public int mo54482a(C7482ac acVar) {
        for (int i = 0; i < this.f17174b; i++) {
            if (this.f17175d[i] == acVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C7482ac mo54483a(int i) {
        return this.f17175d[i];
    }

    /* renamed from: a */
    public boolean mo54484a() {
        return this.f17174b == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7483ad adVar = (C7483ad) obj;
        return this.f17174b == adVar.f17174b && Arrays.equals(this.f17175d, adVar.f17175d);
    }

    public int hashCode() {
        if (this.f17176e == 0) {
            this.f17176e = Arrays.hashCode(this.f17175d);
        }
        return this.f17176e;
    }
}
