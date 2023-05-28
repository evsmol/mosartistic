package com.yandex.metrica.impl.p082ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j0 */
public class C3071j0 {

    /* renamed from: a */
    private final C2214K0 f8071a;

    /* renamed from: b */
    private final Map<Boolean, String> f8072b = new HashMap();

    public C3071j0(C2214K0 k0) {
        this.f8071a = k0;
    }

    /* renamed from: a */
    public void mo17719a(Intent intent) {
        if (intent != null) {
            m9767a(intent.getDataString(), false);
        }
    }

    /* renamed from: b */
    public void mo17721b(String str) {
        m9767a(str, true);
    }

    /* renamed from: a */
    public void mo17720a(String str) {
        m9767a(str, false);
    }

    /* renamed from: a */
    private void m9767a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (!C1848A2.m6810a((Object) str, (Object) this.f8072b.get(Boolean.valueOf(!z)))) {
                this.f8071a.mo16059a(str, z);
            }
            this.f8072b.put(Boolean.valueOf(z), str);
        }
    }
}
