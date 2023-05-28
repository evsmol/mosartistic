package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.C7397g;

/* renamed from: com.applovin.exoplayer2.aq */
public abstract class C6826aq implements C7397g {

    /* renamed from: b */
    public static final C7397g.C7398a<C6826aq> f14872b = $$Lambda$aq$qZViowqSCNIjMqRs0PhWhJpxTM.INSTANCE;

    C6826aq() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C6826aq m17696a(Bundle bundle) {
        C7397g.C7398a aVar;
        int i = bundle.getInt(m17697a(0), -1);
        if (i == 0) {
            aVar = C7868x.f18968a;
        } else if (i == 1) {
            aVar = C6810aj.f14805a;
        } else if (i == 2) {
            aVar = C6838ax.f14955a;
        } else if (i == 3) {
            aVar = C6843az.f14967a;
        } else {
            throw new IllegalArgumentException("Encountered unknown rating type: " + i);
        }
        return (C6826aq) aVar.fromBundle(bundle);
    }

    /* renamed from: a */
    private static String m17697a(int i) {
        return Integer.toString(i, 36);
    }
}
