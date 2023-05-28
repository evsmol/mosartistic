package com.appodeal.ads.segments;

import com.appodeal.ads.C9270m;
import com.appodeal.ads.utils.Version;

/* renamed from: com.appodeal.ads.segments.d */
public final class C9487d {
    /* renamed from: a */
    public static boolean m28066a(C9494i iVar, Object obj) {
        int a = C9270m.m27455a(iVar.f24104d);
        return a != 0 ? (a == 1 || a == 3 || a == 5 || a == 6) && obj != null && obj.equals(iVar.f24103c) : ((Version) iVar.f24103c).compareTo((Version) obj) == 0;
    }

    /* renamed from: b */
    public static boolean m28067b(C9494i iVar, Object obj) {
        int a = C9270m.m27455a(iVar.f24104d);
        if (a == 1) {
            return ((String) obj).toLowerCase().contains(((String) iVar.f24103c).toLowerCase());
        }
        if (a == 2) {
            String str = (String) obj;
            for (String equals : (String[]) iVar.f24103c) {
                if (str.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (a == 4) {
            Integer num = (Integer) obj;
            for (Integer equals2 : (Integer[]) iVar.f24103c) {
                if (equals2.equals(num)) {
                    return true;
                }
            }
            return false;
        } else if (a != 7) {
            return false;
        } else {
            String str2 = (String) iVar.f24103c;
            int intValue = ((Integer) obj).intValue();
            return intValue >= 0 && str2.length() > intValue && str2.charAt(intValue) == '1';
        }
    }

    /* renamed from: c */
    public static boolean m28068c(C9494i iVar, Object obj) {
        int i = iVar.f24104d;
        return i == 6 ? ((Float) iVar.f24103c).floatValue() > ((Float) obj).floatValue() : i == 4 ? ((Integer) iVar.f24103c).intValue() > ((Integer) obj).intValue() : i == 1 && ((Version) iVar.f24103c).compareTo((Version) obj) > 0;
    }

    /* renamed from: d */
    public static boolean m28069d(C9494i iVar, Object obj) {
        return m28066a(iVar, obj) || m28068c(iVar, obj);
    }

    /* renamed from: e */
    public static boolean m28070e(C9494i iVar, Object obj) {
        int i = iVar.f24104d;
        return i == 6 ? ((Float) obj).floatValue() % ((Float) iVar.f24103c).floatValue() == 0.0f : i == 4 && ((Integer) obj).intValue() % ((Integer) iVar.f24103c).intValue() == 0;
    }

    /* renamed from: f */
    public static boolean m28071f(C9494i iVar, Object obj) {
        int i = iVar.f24104d;
        return i == 6 ? ((Float) iVar.f24103c).floatValue() < ((Float) obj).floatValue() : i == 4 ? ((Integer) iVar.f24103c).intValue() < ((Integer) obj).intValue() : i == 1 && ((Version) iVar.f24103c).compareTo((Version) obj) < 0;
    }

    /* renamed from: g */
    public static boolean m28072g(C9494i iVar, Object obj) {
        return m28066a(iVar, obj) || m28071f(iVar, obj);
    }
}
