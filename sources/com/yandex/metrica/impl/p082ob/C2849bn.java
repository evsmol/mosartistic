package com.yandex.metrica.impl.p082ob;

import com.bytedance.sdk.openadsdk.TTAdSdk;

/* renamed from: com.yandex.metrica.impl.ob.bn */
public class C2849bn {

    /* renamed from: a */
    private final C2813an f7519a;

    /* renamed from: b */
    private final C2781Zm f7520b;

    public C2849bn(C2875cm cmVar, String str) {
        this(new C2813an(30, 50, (int) TTAdSdk.INIT_LOCAL_FAIL_CODE, str, cmVar), new C2781Zm(4500, str, cmVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo17314a(C2812am amVar, String str, String str2) {
        if (amVar.size() >= this.f7519a.mo17201a().mo17006a()) {
            if (this.f7519a.mo17201a().mo17006a() != amVar.size() || !amVar.containsKey(str)) {
                this.f7519a.mo17202a(str);
                return false;
            }
        }
        if (!this.f7520b.mo17130a(amVar, str, str2)) {
            amVar.put(str, str2);
            return true;
        }
        this.f7520b.mo17129a(str);
        return false;
    }

    /* renamed from: b */
    public boolean mo17315b(C2812am amVar, String str, String str2) {
        if (amVar == null) {
            return false;
        }
        String a = this.f7519a.mo17203b().mo16729a(str);
        String a2 = this.f7519a.mo17204c().mo16729a(str2);
        if (amVar.containsKey(a)) {
            String str3 = (String) amVar.get(a);
            if (a2 == null || !a2.equals(str3)) {
                return mo17314a(amVar, a, a2);
            }
            return false;
        } else if (a2 != null) {
            return mo17314a(amVar, a, a2);
        } else {
            return false;
        }
    }

    C2849bn(C2813an anVar, C2781Zm zm) {
        this.f7519a = anVar;
        this.f7520b = zm;
    }
}
