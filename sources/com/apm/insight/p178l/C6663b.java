package com.apm.insight.p178l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.apm.insight.l.b */
public class C6663b {

    /* renamed from: a */
    private static DateFormat f14347a;

    /* renamed from: a */
    public static DateFormat m16485a() {
        if (f14347a == null) {
            f14347a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f14347a;
    }
}
