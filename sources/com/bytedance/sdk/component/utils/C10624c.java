package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.component.utils.c */
/* compiled from: AppSigning */
public class C10624c {

    /* renamed from: a */
    private static HashMap<String, ArrayList<String>> f26508a = new HashMap<>();

    /* renamed from: a */
    public static ArrayList<String> m31195a(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (!(context == null || str == null)) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f26508a.get(str) != null) {
                return f26508a.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : m31196b(context, packageName)) {
                    String str2 = "error!";
                    if ("MD5".equals(str)) {
                        str2 = m31194a(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        str2 = m31194a(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = m31194a(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e) {
                C10638l.m31234b(e.toString());
            }
            f26508a.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m31193a(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> a = m31195a(context, "SHA1");
        if (!(a == null || a.size() == 0)) {
            for (int i = 0; i < a.size(); i++) {
                sb.append(a.get(i));
                if (i < a.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static Signature[] m31196b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            C10638l.m31234b(e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static String m31194a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "error!";
            }
            byte[] digest = instance.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | Ascii.NUL).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            C10638l.m31234b(e.toString());
            return "error!";
        }
    }
}
