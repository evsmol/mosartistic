package com.yandex.metrica.impl.p082ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Mn */
public class C2323Mn implements C2252Kn<String> {

    /* renamed from: a */
    private final Map<String, ?> f6235a;

    public C2323Mn(Map<String, ?> map) {
        this.f6235a = map;
    }

    /* renamed from: a */
    public C2167In mo15517a(Object obj) {
        String str = (String) obj;
        if (!this.f6235a.containsKey(str)) {
            return C2167In.m7452a(this);
        }
        return C2167In.m7453a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", new Object[]{str}));
    }
}
