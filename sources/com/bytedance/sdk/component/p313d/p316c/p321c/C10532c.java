package com.bytedance.sdk.component.p313d.p316c.p321c;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;

/* renamed from: com.bytedance.sdk.component.d.c.c.c */
/* compiled from: MD5Util */
public class C10532c {

    /* renamed from: a */
    private static final char[] f26293a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m30853a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m30854a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m30854a(byte[] bArr) {
        if (bArr != null) {
            return m30855a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public static String m30855a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + i] & 255;
                int i6 = i4 + 1;
                char[] cArr2 = f26293a;
                cArr[i4] = cArr2[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = cArr2[b & Ascii.f15551SI];
            }
            return new String(cArr, 0, i3);
        }
    }
}
