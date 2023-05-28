package com.applovin.exoplayer2.p198g.p200b;

import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7416d;
import com.applovin.exoplayer2.p198g.C7460g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.g.b.b */
public final class C7408b extends C7460g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer) {
        return new C7399a(mo54234a(new C7772y(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: a */
    public C7406a mo54234a(C7772y yVar) {
        return new C7406a((String) C7717a.m22120b(yVar.mo55061B()), (String) C7717a.m22120b(yVar.mo55061B()), yVar.mo55095s(), yVar.mo55095s(), Arrays.copyOfRange(yVar.mo55077d(), yVar.mo55074c(), yVar.mo55072b()));
    }
}
