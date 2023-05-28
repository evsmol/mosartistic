package com.yandex.metrica.impl.p082ob;

import android.content.Context;
import com.yandex.metrica.coreutils.logger.BaseLogger;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.Vl */
public abstract class C2670Vl extends BaseLogger {

    /* renamed from: b */
    private static String f7063b = "";

    /* renamed from: a */
    private final String f7064a;

    public C2670Vl(String str) {
        super(false);
        this.f7064a = "[" + C1848A2.m6797a(str) + "] ";
    }

    /* renamed from: a */
    public static void m8797a(Context context) {
        f7063b = "[" + context.getPackageName() + "] : ";
    }

    /* access modifiers changed from: protected */
    public String formatMessage(String str, Object[] objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public String getPrefix() {
        String str = f7063b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f7064a;
        if (str3 != null) {
            str2 = str3;
        }
        return str + str2;
    }
}
