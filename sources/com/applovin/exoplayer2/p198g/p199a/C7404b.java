package com.applovin.exoplayer2.p198g.p199a;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7416d;
import com.applovin.exoplayer2.p198g.C7460g;
import com.applovin.exoplayer2.p221l.C7771x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.g.a.b */
public final class C7404b extends C7460g {
    /* renamed from: a */
    private static C7399a m20629a(C7771x xVar) {
        xVar.mo55051b(12);
        int c = (xVar.mo55053c() + xVar.mo55054c(12)) - 4;
        xVar.mo55051b(44);
        xVar.mo55057e(xVar.mo55054c(12));
        xVar.mo55051b(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xVar.mo55053c() >= c) {
                break;
            }
            xVar.mo55051b(48);
            int c2 = xVar.mo55054c(8);
            xVar.mo55051b(4);
            int c3 = xVar.mo55053c() + xVar.mo55054c(12);
            String str2 = null;
            while (xVar.mo55053c() < c3) {
                int c4 = xVar.mo55054c(8);
                int c5 = xVar.mo55054c(8);
                int c6 = xVar.mo55053c() + c5;
                if (c4 == 2) {
                    int c7 = xVar.mo55054c(16);
                    xVar.mo55051b(8);
                    if (c7 != 3) {
                    }
                    while (xVar.mo55053c() < c6) {
                        str = xVar.mo55043a(xVar.mo55054c(8), Charsets.US_ASCII);
                        int c8 = xVar.mo55054c(8);
                        for (int i = 0; i < c8; i++) {
                            xVar.mo55057e(xVar.mo55054c(8));
                        }
                    }
                } else if (c4 == 21) {
                    str2 = xVar.mo55043a(c5, Charsets.US_ASCII);
                }
                xVar.mo55044a(c6 * 8);
            }
            xVar.mo55044a(c3 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new C7402a(c2, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7399a((List<? extends C7399a.C7401a>) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m20629a(new C7771x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
