package com.yandex.metrica.impl.p082ob;

import com.yandex.metrica.IReporter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Y4 */
public class C2733Y4 extends C2702X4 {

    /* renamed from: b */
    private final IReporter f7220b;

    public C2733Y4(C2259L3 l3, IReporter iReporter) {
        super(l3);
        this.f7220b = iReporter;
    }

    /* renamed from: a */
    public boolean mo16069a(C2851c0 c0Var) {
        C3433r6 a = C3433r6.m10607a(c0Var.mo17346o());
        HashMap hashMap = new HashMap();
        hashMap.put("type", a.f8997a);
        hashMap.put("delivery_method", a.f8998b);
        this.f7220b.reportEvent("crash_saved", (Map<String, Object>) hashMap);
        return false;
    }
}
