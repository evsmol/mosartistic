package com.yandex.metrica.impl.p082ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.dj */
public class C2901dj {

    /* renamed from: a */
    private final C2843bj f7683a;

    /* renamed from: b */
    private final C3487sm f7684b;

    /* renamed from: c */
    private final C2970fj f7685c;

    /* renamed from: d */
    private final C2872cj f7686d;

    C2901dj(C2843bj bjVar, C2872cj cjVar, C3487sm smVar, C2970fj fjVar) {
        this.f7683a = bjVar;
        this.f7686d = cjVar;
        this.f7684b = smVar;
        this.f7685c = fjVar;
    }

    /* renamed from: a */
    public C2673W0 mo17469a() {
        String str;
        try {
            this.f7684b.mo18221a();
            str = this.f7685c.mo17604a();
            try {
                if (TextUtils.isEmpty(str)) {
                    str = this.f7683a.mo17312a();
                    if (!TextUtils.isEmpty(str) || this.f7686d.mo17194a()) {
                        str = this.f7685c.mo17605a(str);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        this.f7684b.mo18222b();
        if (str == null) {
            return new C2673W0((String) null, C2577U0.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)");
        }
        return new C2673W0(str, C2577U0.OK, (String) null);
    }
}
