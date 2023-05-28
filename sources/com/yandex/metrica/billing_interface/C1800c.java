package com.yandex.metrica.billing_interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.billing_interface.c */
public class C1800c {

    /* renamed from: c */
    private static final Pattern f4918c = Pattern.compile("P(\\d+)(\\S+)");

    /* renamed from: a */
    public final int f4919a;

    /* renamed from: b */
    public final C1801a f4920b;

    /* renamed from: com.yandex.metrica.billing_interface.c$a */
    public enum C1801a {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public C1800c(int i, C1801a aVar) {
        this.f4919a = i;
        this.f4920b = aVar;
    }

    /* renamed from: a */
    public static C1800c m6728a(String str) {
        C1801a aVar;
        Matcher matcher = f4918c.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        if (group == null || group2 == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(group);
            char charAt = group2.charAt(0);
            if (charAt == 'D') {
                aVar = C1801a.DAY;
            } else if (charAt == 'M') {
                aVar = C1801a.MONTH;
            } else if (charAt == 'W') {
                aVar = C1801a.WEEK;
            } else if (charAt != 'Y') {
                aVar = C1801a.TIME_UNIT_UNKNOWN;
            } else {
                aVar = C1801a.YEAR;
            }
            return new C1800c(parseInt, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1800c.class != obj.getClass()) {
            return false;
        }
        C1800c cVar = (C1800c) obj;
        return this.f4919a == cVar.f4919a && this.f4920b == cVar.f4920b;
    }

    public int hashCode() {
        return ((this.f4919a + 0) * 31) + this.f4920b.hashCode();
    }

    public String toString() {
        return "Period{number=" + this.f4919a + "timeUnit=" + this.f4920b + "}";
    }
}
