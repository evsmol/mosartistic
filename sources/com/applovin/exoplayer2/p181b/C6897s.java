package com.applovin.exoplayer2.p181b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.b.s */
public class C6897s {
    /* renamed from: a */
    public static int m18265a(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: a */
    private static byte[] m18266a(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: b */
    private static long m18267b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: b */
    public static List<byte[]> m18268b(byte[] bArr) {
        long b = m18267b((long) m18269c(bArr));
        long b2 = m18267b(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m18266a(b));
        arrayList.add(m18266a(b2));
        return arrayList;
    }

    /* renamed from: c */
    private static int m18269c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }
}
