package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.fj */
class C2970fj {

    /* renamed from: a */
    private final Context f7864a;

    /* renamed from: b */
    private final C1877B0 f7865b;

    /* renamed from: c */
    private final C3106jm f7866c;

    C2970fj(Context context, C1877B0 b0, C3106jm jmVar) {
        this.f7864a = context;
        this.f7865b = b0;
        this.f7866c = jmVar;
    }

    /* renamed from: a */
    public String mo17604a() {
        return C2254L0.m7686a(this.f7865b.mo15519a(this.f7864a, "uuid.dat"));
    }

    /* renamed from: a */
    public String mo17605a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f7866c.mo17769a();
            }
            File a = this.f7865b.mo15519a(this.f7864a, "uuid.dat");
            if (a != null) {
                C2254L0.m7689a(str, "uuid.dat", new FileOutputStream(a));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }
}
