package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C6809ai;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.k */
public final class C7339k {
    /* renamed from: a */
    public static int m20219a(C7279i iVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int c = iVar.mo53906c(bArr, i + i3, i2 - i3);
            if (c == -1) {
                break;
            }
            i3 += c;
        }
        return i3;
    }

    /* renamed from: a */
    public static void m20220a(boolean z, String str) throws C6809ai {
        if (!z) {
            throw C6809ai.m17540b(str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public static boolean m20221a(C7279i iVar, int i) throws IOException {
        try {
            iVar.mo53902b(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m20222a(C7279i iVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return iVar.mo53905b(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public static boolean m20223b(C7279i iVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            iVar.mo53903b(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
