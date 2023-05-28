package com.applovin.exoplayer2.p186e.p193g;

import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7755q;

/* renamed from: com.applovin.exoplayer2.e.g.l */
public final class C7259l {

    /* renamed from: a */
    public final boolean f16243a;

    /* renamed from: b */
    public final String f16244b;

    /* renamed from: c */
    public final C7357x.C7358a f16245c;

    /* renamed from: d */
    public final int f16246d;

    /* renamed from: e */
    public final byte[] f16247e;

    public C7259l(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        boolean z2 = true;
        C7717a.m22118a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f16243a = z;
        this.f16244b = str;
        this.f16246d = i;
        this.f16247e = bArr2;
        this.f16245c = new C7357x.C7358a(m19786a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    private static int m19786a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        C7755q.m22361c("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        return 1;
    }
}
