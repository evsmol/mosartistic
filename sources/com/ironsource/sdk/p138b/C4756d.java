package com.ironsource.sdk.p138b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.d */
public final class C4756d {

    /* renamed from: a */
    HashMap<String, Boolean> f12080a = new HashMap<String, Boolean>() {
        {
            boolean z = true;
            put("isVisible", Boolean.valueOf(C4756d.this.f12081b == 0));
            put("isWindowVisible", Boolean.valueOf(C4756d.this.f12082c != 0 ? false : z));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    /* renamed from: b */
    int f12081b = 4;

    /* renamed from: c */
    int f12082c = 4;

    C4756d() {
    }

    /* renamed from: a */
    public final JSONObject mo34255a() {
        return new JSONObject(this.f12080a);
    }
}
