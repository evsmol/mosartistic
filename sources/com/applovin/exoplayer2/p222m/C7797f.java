package com.applovin.exoplayer2.p222m;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p221l.C7773z;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.m.f */
public final class C7797f {

    /* renamed from: a */
    public final List<byte[]> f18444a;

    /* renamed from: b */
    public final int f18445b;

    /* renamed from: c */
    public final String f18446c;

    private C7797f(List<byte[]> list, int i, String str) {
        this.f18444a = list;
        this.f18445b = i;
        this.f18446c = str;
    }

    /* renamed from: a */
    public static C7797f m22571a(C7772y yVar) throws C6809ai {
        C7772y yVar2 = yVar;
        try {
            yVar2.mo55079e(21);
            int h = yVar.mo55084h() & 3;
            int h2 = yVar.mo55084h();
            int c = yVar.mo55074c();
            int i = 0;
            for (int i2 = 0; i2 < h2; i2++) {
                yVar2.mo55079e(1);
                int i3 = yVar.mo55085i();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = yVar.mo55085i();
                    i += i5 + 4;
                    yVar2.mo55079e(i5);
                }
            }
            yVar2.mo55076d(c);
            byte[] bArr = new byte[i];
            String str = null;
            int i6 = 0;
            for (int i7 = 0; i7 < h2; i7++) {
                int h3 = yVar.mo55084h() & 127;
                int i8 = yVar.mo55085i();
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = yVar.mo55085i();
                    System.arraycopy(C7762v.f18312a, 0, bArr, i6, C7762v.f18312a.length);
                    int length = i6 + C7762v.f18312a.length;
                    System.arraycopy(yVar.mo55077d(), yVar.mo55074c(), bArr, length, i10);
                    if (h3 == 33 && i9 == 0) {
                        str = C7733e.m22283a(new C7773z(bArr, length, length + i10));
                    }
                    i6 = length + i10;
                    yVar2.mo55079e(i10);
                }
            }
            return new C7797f(i == 0 ? null : Collections.singletonList(bArr), h + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C6809ai.m17540b("Error parsing HEVC config", e);
        }
    }
}
