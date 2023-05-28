package com.applovin.exoplayer2.p222m;

import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.m.c */
public final class C7791c {

    /* renamed from: a */
    public final int f18417a;

    /* renamed from: b */
    public final int f18418b;

    /* renamed from: c */
    public final String f18419c;

    private C7791c(int i, int i2, String str) {
        this.f18417a = i;
        this.f18418b = i2;
        this.f18419c = str;
    }

    /* renamed from: a */
    public static C7791c m22549a(C7772y yVar) {
        String str;
        yVar.mo55079e(2);
        int h = yVar.mo55084h();
        int i = h >> 1;
        int h2 = ((yVar.mo55084h() >> 3) & 31) | ((h & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(str2);
        sb.append(i);
        if (h2 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(h2);
        return new C7791c(i, h2, sb.toString());
    }
}
