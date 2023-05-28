package com.bykv.p271vk.openvk.component.video.api.p291f;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.b */
/* compiled from: MD5 */
public class C10201b {

    /* renamed from: a */
    private static final MessageDigest f25213a = m29281a();

    /* renamed from: b */
    private static final char[] f25214b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C10201b() {
    }

    /* renamed from: a */
    private static MessageDigest m29281a() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m29279a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f25213a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C10201b.class) {
            digest = messageDigest.digest(bytes);
        }
        return m29280a(digest);
    }

    /* renamed from: a */
    public static String m29280a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f25214b;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f15551SI];
        }
        return new String(cArr);
    }
}
