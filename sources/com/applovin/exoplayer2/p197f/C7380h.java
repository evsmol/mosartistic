package com.applovin.exoplayer2.p197f;

import android.media.MediaCodec;
import com.applovin.exoplayer2.p182c.C6921f;

/* renamed from: com.applovin.exoplayer2.f.h */
public class C7380h extends C6921f {

    /* renamed from: a */
    public final C7381i f16873a;

    /* renamed from: b */
    public final String f16874b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7380h(java.lang.Throwable r4, com.applovin.exoplayer2.p197f.C7381i r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f16875a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f16873a = r5
            int r5 = com.applovin.exoplayer2.p221l.C7728ai.f18249a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = m20417a(r4)
        L_0x0027:
            r3.f16874b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p197f.C7380h.<init>(java.lang.Throwable, com.applovin.exoplayer2.f.i):void");
    }

    /* renamed from: a */
    private static String m20417a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
