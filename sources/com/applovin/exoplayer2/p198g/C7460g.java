package com.applovin.exoplayer2.p198g;

import com.applovin.exoplayer2.p221l.C7717a;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.g.g */
public abstract class C7460g implements C7405b {
    /* renamed from: a */
    public final C7399a mo54224a(C7416d dVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C7717a.m22120b(dVar.f15332b);
        C7717a.m22118a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.mo53124b()) {
            return null;
        }
        return mo54223a(dVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer);
}
