package com.applovin.exoplayer2.p198g.p205g;

import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7416d;
import com.applovin.exoplayer2.p198g.C7460g;
import com.applovin.exoplayer2.p221l.C7726ag;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.g.g.c */
public final class C7464c extends C7460g {

    /* renamed from: a */
    private final C7772y f17087a = new C7772y();

    /* renamed from: b */
    private final C7771x f17088b = new C7771x();

    /* renamed from: c */
    private C7726ag f17089c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer) {
        if (this.f17089c == null || dVar.f17002f != this.f17089c.mo54990c()) {
            C7726ag agVar = new C7726ag(dVar.f15334d);
            this.f17089c = agVar;
            agVar.mo54991c(dVar.f15334d - dVar.f17002f);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f17087a.mo55070a(array, limit);
        this.f17088b.mo55048a(array, limit);
        this.f17088b.mo55051b(39);
        long c = (((long) this.f17088b.mo55054c(1)) << 32) | ((long) this.f17088b.mo55054c(32));
        this.f17088b.mo55051b(20);
        int c2 = this.f17088b.mo55054c(12);
        int c3 = this.f17088b.mo55054c(8);
        C7399a.C7401a aVar = null;
        this.f17087a.mo55079e(14);
        if (c3 == 0) {
            aVar = new C7468e();
        } else if (c3 == 255) {
            aVar = C7461a.m20765a(this.f17087a, c2, c);
        } else if (c3 == 4) {
            aVar = C7470f.m20779a(this.f17087a);
        } else if (c3 == 5) {
            aVar = C7465d.m20772a(this.f17087a, c, this.f17089c);
        } else if (c3 == 6) {
            aVar = C7474g.m20793a(this.f17087a, c, this.f17089c);
        }
        if (aVar == null) {
            return new C7399a(new C7399a.C7401a[0]);
        }
        return new C7399a(aVar);
    }
}
