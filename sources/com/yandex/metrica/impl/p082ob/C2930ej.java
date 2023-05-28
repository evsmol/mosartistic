package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ej */
public class C2930ej {

    /* renamed from: b */
    private static volatile C2930ej f7772b;

    /* renamed from: a */
    private final C3487sm f7773a;

    C2930ej(C3487sm smVar) {
        this.f7773a = smVar;
    }

    /* renamed from: a */
    public static C2930ej m9486a(Context context) {
        if (f7772b == null) {
            synchronized (C2930ej.class) {
                if (f7772b == null) {
                    f7772b = new C2930ej(new C3487sm(context, "uuid.dat"));
                }
            }
        }
        return f7772b;
    }

    /* renamed from: b */
    public C2901dj mo17558b(Context context, C2843bj bjVar) {
        return new C2901dj(bjVar, new C2809aj(), this.f7773a, new C2970fj(context, new C1877B0(), new C3106jm()));
    }

    /* renamed from: a */
    public C2901dj mo17557a(Context context, C2843bj bjVar) {
        return new C2901dj(bjVar, new C3005gj(context, new C1877B0()), this.f7773a, new C2970fj(context, new C1877B0(), new C3106jm()));
    }
}
