package com.bytedance.sdk.openadsdk.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.bytedance.sdk.openadsdk.utils.l */
/* compiled from: PangleUUID */
public class C0984l {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f3311a = new ThreadLocal<>();

    /* renamed from: a */
    public static String m4553a() {
        byte[] bArr = new byte[16];
        SecureRandom secureRandom = f3311a.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            f3311a.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & Ascii.f15551SI);
        bArr[6] = (byte) (bArr[6] | 64);
        bArr[8] = (byte) (bArr[8] & 63);
        bArr[8] = (byte) (bArr[8] | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new UUID(j2, j).toString();
    }
}
