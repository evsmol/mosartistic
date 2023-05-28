package com.applovin.exoplayer2.p222m;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p221l.C7733e;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.m.a */
public final class C7776a {

    /* renamed from: a */
    public final List<byte[]> f18357a;

    /* renamed from: b */
    public final int f18358b;

    /* renamed from: c */
    public final int f18359c;

    /* renamed from: d */
    public final int f18360d;

    /* renamed from: e */
    public final float f18361e;

    /* renamed from: f */
    public final String f18362f;

    private C7776a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f18357a = list;
        this.f18358b = i;
        this.f18359c = i2;
        this.f18360d = i3;
        this.f18361e = f;
        this.f18362f = str;
    }

    /* renamed from: a */
    public static C7776a m22498a(C7772y yVar) throws C6809ai {
        String str;
        float f;
        int i;
        try {
            yVar.mo55079e(4);
            int h = (yVar.mo55084h() & 3) + 1;
            if (h != 3) {
                ArrayList arrayList = new ArrayList();
                int h2 = yVar.mo55084h() & 31;
                for (int i2 = 0; i2 < h2; i2++) {
                    arrayList.add(m22499b(yVar));
                }
                int h3 = yVar.mo55084h();
                for (int i3 = 0; i3 < h3; i3++) {
                    arrayList.add(m22499b(yVar));
                }
                int i4 = -1;
                if (h2 > 0) {
                    C7762v.C7764b a = C7762v.m22392a((byte[]) arrayList.get(0), h, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f18323e;
                    int i6 = a.f18324f;
                    float f2 = a.f18325g;
                    str = C7733e.m22282a(a.f18319a, a.f18320b, a.f18321c);
                    i4 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    f = 1.0f;
                }
                return new C7776a(arrayList, h, i4, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C6809ai.m17540b("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m22499b(C7772y yVar) {
        int i = yVar.mo55085i();
        int c = yVar.mo55074c();
        yVar.mo55079e(i);
        return C7733e.m22286a(yVar.mo55077d(), c, i);
    }
}
