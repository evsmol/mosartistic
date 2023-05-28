package com.ironsource.sdk.p137a;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sdk.a.a */
public final class C4743a {

    /* renamed from: a */
    public HashMap<String, Object> f12028a = new HashMap<>();

    /* renamed from: a */
    public final C4743a mo34234a(String str, Object obj) {
        if (obj != null) {
            this.f12028a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}
