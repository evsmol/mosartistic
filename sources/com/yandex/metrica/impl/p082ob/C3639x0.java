package com.yandex.metrica.impl.p082ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.x0 */
public class C3639x0 {

    /* renamed from: a */
    private C2812am f9426a = new C2812am();

    /* renamed from: b */
    private C2849bn f9427b;

    C3639x0(C2849bn bnVar) {
        this.f9427b = bnVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18388a(String str, String str2) {
        this.f9427b.mo17315b(this.f9426a, str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo18387a() {
        if (this.f9426a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f9426a).toString();
    }
}
