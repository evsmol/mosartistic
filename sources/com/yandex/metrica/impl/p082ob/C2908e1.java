package com.yandex.metrica.impl.p082ob;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.e1 */
public class C2908e1 {

    /* renamed from: a */
    private static final Pattern f7689a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b */
    private static final Pattern f7690b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    /* renamed from: a */
    public boolean mo17475a(List<StackTraceElement> list) {
        return m9391a(list, f7689a);
    }

    /* renamed from: b */
    public boolean mo17476b(List<StackTraceElement> list) {
        return m9391a(list, f7690b);
    }

    /* renamed from: a */
    private boolean m9391a(List<StackTraceElement> list, Pattern pattern) {
        for (StackTraceElement className : list) {
            if (pattern.matcher(className.getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
