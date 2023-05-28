package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C8864c;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.base.p264b.C8852e;
import com.appnext.base.services.p266b.C8873a;
import java.util.List;

public class scdle extends C8864c {
    public scdle(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return scdle.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public List<C8837b> getData() {
        try {
            List<C8838c> as = C8831a.m26576X().mo58686ab().mo58721as();
            if (as == null) {
                return null;
            }
            for (C8838c next : as) {
                if (!next.getKey().equals(scdle.class.getSimpleName()) && next.mo58706ao().equals(C8850d.f22433fm)) {
                    C8873a.m26797d(C8852e.getContext()).mo58815c(next);
                    C8873a.m26797d(C8852e.getContext()).mo58814a(next, true);
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
