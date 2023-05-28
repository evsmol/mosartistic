package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z1 */
public class C3717z1 {

    /* renamed from: a */
    private final C1877B0 f9565a;

    /* renamed from: b */
    private boolean f9566b;

    public C3717z1(C2726Xl xl) {
        this(xl, new C1877B0());
    }

    /* renamed from: a */
    public void mo18442a(Context context) {
        long j;
        synchronized (this) {
        }
        if (!this.f9566b) {
            synchronized (this) {
                try {
                    String a = C2254L0.m7686a(this.f9565a.mo15519a(context, "metrica_service_settings.dat"));
                    if (!TextUtils.isEmpty(a)) {
                        j = new JSONObject(a).optLong("delay");
                    }
                } catch (Throwable unused) {
                }
                j = 0;
            }
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (Throwable unused2) {
                }
            }
            this.f9566b = true;
        }
    }

    C3717z1(C2726Xl xl, C1877B0 b0) {
        this.f9566b = false;
        this.f9565a = b0;
    }
}
