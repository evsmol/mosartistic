package com.applovin.exoplayer2.p221l;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.l.e */
public final class C7733e {

    /* renamed from: a */
    private static final byte[] f18266a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f18267b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static Pair<Integer, Integer> m22281a(byte[] bArr) {
        C7772y yVar = new C7772y(bArr);
        yVar.mo55076d(9);
        int h = yVar.mo55084h();
        yVar.mo55076d(20);
        return Pair.create(Integer.valueOf(yVar.mo55099w()), Integer.valueOf(h));
    }

    /* renamed from: a */
    public static String m22282a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    public static String m22283a(C7773z zVar) {
        zVar.mo55104a(24);
        int c = zVar.mo55108c(2);
        boolean b = zVar.mo55106b();
        int c2 = zVar.mo55108c(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (zVar.mo55106b()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = zVar.mo55108c(8);
        }
        int c3 = zVar.mo55108c(8);
        Object[] objArr = new Object[5];
        objArr[0] = f18267b[c];
        objArr[1] = Integer.valueOf(c2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(b ? 'H' : 'L');
        objArr[4] = Integer.valueOf(c3);
        StringBuilder sb = new StringBuilder(C7728ai.m22200a("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<byte[]> m22284a(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: a */
    public static boolean m22285a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    /* renamed from: a */
    public static byte[] m22286a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f18266a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f18266a.length, i2);
        return bArr3;
    }
}
