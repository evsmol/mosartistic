package com.applovin.impl.mediation.p234a;

import com.applovin.impl.sdk.C8490n;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.h */
public class C8079h extends C8076f {
    public C8079h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C8490n nVar) {
        super(map, jSONObject, jSONObject2, nVar);
    }

    /* renamed from: a */
    public boolean mo56060a() {
        return mo56177b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    /* renamed from: b */
    public boolean mo56198b() {
        return mo56177b("use_cached_adapter", (Boolean) true).booleanValue();
    }

    public String toString() {
        return "SignalProviderSpec{adObject=" + mo56150Q() + '}';
    }
}
