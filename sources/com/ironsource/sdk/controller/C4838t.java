package com.ironsource.sdk.controller;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.ironsource.sdk.utils.C4985c;
import java.security.MessageDigest;

/* renamed from: com.ironsource.sdk.controller.t */
final class C4838t {

    /* renamed from: a */
    String f12334a;

    C4838t(String str) {
        this.f12334a = str;
    }

    /* renamed from: a */
    private String m14126a(String str) {
        try {
            return C4985c.m14525a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return m14127b(str);
        }
    }

    /* renamed from: b */
    private String m14127b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = BuildConfig.ADAPTER_VERSION + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo34414a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m14126a(str + str2 + this.f12334a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
