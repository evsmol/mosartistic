package com.criteo.publisher.p074n0;

/* renamed from: com.criteo.publisher.n0.t */
/* compiled from: URLUtil */
public class C1316t {
    /* renamed from: c */
    public static boolean m5792c(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (m5790a(str) || m5791b(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m5790a(String str) {
        if (str == null || str.length() <= 6 || !str.substring(0, 7).equalsIgnoreCase("http://")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m5791b(String str) {
        if (str == null || str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("https://")) {
            return false;
        }
        return true;
    }
}
