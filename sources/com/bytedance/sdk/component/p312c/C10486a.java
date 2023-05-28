package com.bytedance.sdk.component.p312c;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.utils.C10638l;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.sdk.component.c.a */
/* compiled from: AES */
public class C10486a {

    /* renamed from: a */
    private static String f26144a;

    /* renamed from: a */
    public static String m30631a(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(instance.doFinal(str.getBytes("utf-8")), 0);
        } catch (Throwable th) {
            C10638l.m31234b(th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m30633b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(instance.doFinal(decode));
        } catch (Throwable th) {
            C10638l.m31234b(th.getMessage());
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static String m30630a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(f26144a)) {
                f26144a = m30629a("AES/CBC/PKCS5Padding");
            }
            Cipher instance = Cipher.getInstance(f26144a);
            instance.init(2, secretKeySpec);
            return new String(instance.doFinal(decode));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m30629a(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(m30632a(str.getBytes(), iArr));
    }

    /* renamed from: a */
    public static byte[] m30632a(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ iArr[i % iArr.length]);
        }
        return bArr2;
    }
}
