package com.iab.omid.library.ironsrc;

import com.iab.omid.library.ironsrc.p113d.C4330e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.ironsrc.c */
class C4319c {

    /* renamed from: a */
    private static final Pattern f10308a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b */
    private static final Pattern f10309b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c */
    private static final Pattern f10310c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d */
    private static final Pattern f10311d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e */
    private static final Pattern f10312e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f */
    private static final Pattern f10313f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g */
    private static final Pattern f10314g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    /* renamed from: a */
    static String m12258a(String str, String str2) {
        return m12262b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    /* renamed from: a */
    private static boolean m12259a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12260a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m12259a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    /* renamed from: a */
    private static int[][] m12261a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
    }

    /* renamed from: b */
    static String m12262b(String str, String str2) {
        C4330e.m12304a(str, "HTML is null or empty");
        int[][] a = m12261a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (m12263b(str, sb, f10309b, str2, a)) {
            return sb.toString();
        }
        if (m12260a(str, sb, f10308a, str2, a)) {
            return sb.toString();
        }
        if (m12263b(str, sb, f10311d, str2, a)) {
            return sb.toString();
        }
        if (m12260a(str, sb, f10310c, str2, a)) {
            return sb.toString();
        }
        if (m12263b(str, sb, f10313f, str2, a)) {
            return sb.toString();
        }
        if (m12260a(str, sb, f10312e, str2, a)) {
            return sb.toString();
        }
        if (m12260a(str, sb, f10314g, str2, a)) {
            return sb.toString();
        }
        return str2 + str;
    }

    /* renamed from: b */
    private static boolean m12263b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!m12259a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}
