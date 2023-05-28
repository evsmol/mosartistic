package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.impl.p082ob.C2121If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Di */
public class C1961Di {

    /* renamed from: a */
    private final C3612w9 f5251a;

    public C1961Di() {
        this(new C3612w9());
    }

    /* renamed from: a */
    public C2435Ph mo15636a(JSONObject jSONObject) {
        C2121If.C2126c cVar = new C2121If.C2126c();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long a = C2572Tl.m8510a(optJSONObject, "cells_around_ttl", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f5614a = C2572Tl.m8504a(a, timeUnit, cVar.f5614a);
            cVar.f5615b = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "wifi_networks_ttl", (Long) null), timeUnit, cVar.f5615b);
            cVar.f5616c = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "last_known_location_ttl", (Long) null), timeUnit, cVar.f5616c);
            cVar.f5617d = C2572Tl.m8504a(C2572Tl.m8510a(optJSONObject, "net_interfaces_ttl", (Long) null), timeUnit, cVar.f5617d);
        }
        return this.f5251a.toModel(cVar);
    }

    C1961Di(C3612w9 w9Var) {
        this.f5251a = w9Var;
    }
}
