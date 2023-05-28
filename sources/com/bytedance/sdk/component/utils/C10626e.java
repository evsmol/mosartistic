package com.bytedance.sdk.component.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;

/* renamed from: com.bytedance.sdk.component.utils.e */
/* compiled from: DigestUtils */
public class C10626e {

    /* renamed from: a */
    private static final char[] f26509a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m31202a(byte[] bArr) {
        if (bArr != null) {
            return m31203a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public static String m31203a(byte[] bArr, int i, int i2) {
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
                char[] cArr2 = f26509a;
                cArr[i4] = cArr2[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = cArr2[b & Ascii.f15551SI];
            }
            return new String(cArr, 0, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f A[SYNTHETIC, Splitter:B:21:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31200a(java.io.File r6) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002c }
            r2.<init>(r6)     // Catch:{ all -> 0x002c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r6]     // Catch:{ all -> 0x002a }
        L_0x0013:
            r4 = 0
            int r5 = r2.read(r3, r4, r6)     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x001e
            r1.update(r3, r4, r5)     // Catch:{ all -> 0x002a }
            goto L_0x0013
        L_0x001e:
            byte[] r6 = r1.digest()     // Catch:{ all -> 0x002a }
            java.lang.String r6 = m31202a((byte[]) r6)     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            return r6
        L_0x002a:
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.utils.C10626e.m31200a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static String m31201a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m31202a(instance.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
