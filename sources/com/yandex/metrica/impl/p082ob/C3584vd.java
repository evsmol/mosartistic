package com.yandex.metrica.impl.p082ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vd */
public final class C3584vd {
    /* renamed from: a */
    public static final boolean m10893a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }
}
