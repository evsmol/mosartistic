package com.appnext.base.operations.imp;

import android.os.Bundle;
import com.appnext.base.operations.C8864c;
import com.appnext.base.p260a.C8831a;
import com.appnext.base.p260a.p262b.C8837b;
import com.appnext.base.p260a.p262b.C8838c;
import com.appnext.base.p264b.C8850d;
import com.appnext.core.C8917f;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public class sals extends C8864c {
    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public final boolean mo58779aA() {
        return false;
    }

    /* renamed from: aF */
    public final boolean mo58783aF() {
        return true;
    }

    public sals(C8838c cVar, Bundle bundle, Object obj) {
        super(cVar, bundle, obj);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return sals.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public List<C8837b> getData() {
        try {
            String a = C8917f.m26922a(C8850d.f22421fa, (HashMap<String, String>) null, true, 60000);
            C8831a.m26576X().mo58684Z().delete();
            C8831a.m26576X().mo58684Z().mo58712a(new JSONArray(a));
        } catch (Throwable th) {
            th.getMessage();
        }
        return null;
    }
}
