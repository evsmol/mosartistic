package com.ironsource.sdk.p144g;

import com.ironsource.sdk.p147j.C4953a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.g.c */
public final class C4935c {

    /* renamed from: a */
    public String f12637a;

    /* renamed from: b */
    public String f12638b;

    /* renamed from: c */
    public int f12639c = -1;

    /* renamed from: d */
    public Map<String, String> f12640d;

    /* renamed from: e */
    public int f12641e;

    /* renamed from: f */
    public boolean f12642f;

    /* renamed from: g */
    public C4953a f12643g;

    public C4935c(String str, String str2, Map<String, String> map, C4953a aVar) {
        this.f12638b = str;
        this.f12637a = str2;
        this.f12640d = map;
        this.f12643g = aVar;
        this.f12641e = 0;
        this.f12642f = false;
    }

    /* renamed from: a */
    public final Map<String, String> mo34664a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f12638b);
        hashMap.put("demandSourceName", this.f12637a);
        Map<String, String> map = this.f12640d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo34665a(int i) {
        this.f12641e = i;
    }
}
