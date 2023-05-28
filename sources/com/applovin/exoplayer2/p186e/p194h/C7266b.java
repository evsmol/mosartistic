package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7341m;
import com.applovin.exoplayer2.p186e.C7343n;
import com.applovin.exoplayer2.p186e.C7345o;
import com.applovin.exoplayer2.p186e.C7346p;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.p194h.C7273h;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7772y;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.h.b */
final class C7266b extends C7273h {

    /* renamed from: a */
    private C7346p f16288a;

    /* renamed from: b */
    private C7267a f16289b;

    /* renamed from: com.applovin.exoplayer2.e.h.b$a */
    private static final class C7267a implements C7271f {

        /* renamed from: a */
        private C7346p f16290a;

        /* renamed from: b */
        private C7346p.C7347a f16291b;

        /* renamed from: c */
        private long f16292c = -1;

        /* renamed from: d */
        private long f16293d = -1;

        public C7267a(C7346p pVar, C7346p.C7347a aVar) {
            this.f16290a = pVar;
            this.f16291b = aVar;
        }

        /* renamed from: a */
        public long mo53988a(C7279i iVar) {
            long j = this.f16293d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f16293d = -1;
            return j2;
        }

        /* renamed from: a */
        public void mo53990a(long j) {
            long[] jArr = this.f16291b.f16763a;
            this.f16293d = jArr[C7728ai.m22189a(jArr, j, true, true)];
        }

        /* renamed from: b */
        public C7353v mo53992b() {
            C7717a.m22121b(this.f16292c != -1);
            return new C7345o(this.f16290a, this.f16292c);
        }

        /* renamed from: b */
        public void mo53996b(long j) {
            this.f16292c = j;
        }
    }

    C7266b() {
    }

    /* renamed from: a */
    public static boolean m19816a(C7772y yVar) {
        return yVar.mo55064a() >= 5 && yVar.mo55084h() == 127 && yVar.mo55091o() == 1179402563;
    }

    /* renamed from: a */
    private static boolean m19817a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: c */
    private int m19818c(C7772y yVar) {
        int i = (yVar.mo55077d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yVar.mo55079e(4);
            yVar.mo55063D();
        }
        int a = C7341m.m20226a(yVar, i);
        yVar.mo55076d(0);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53993a(boolean z) {
        super.mo53993a(z);
        if (z) {
            this.f16288a = null;
            this.f16289b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53994a(C7772y yVar, long j, C7273h.C7275a aVar) {
        byte[] d = yVar.mo55077d();
        C7346p pVar = this.f16288a;
        if (pVar == null) {
            C7346p pVar2 = new C7346p(d, 17);
            this.f16288a = pVar2;
            aVar.f16329a = pVar2.mo54081a(Arrays.copyOfRange(d, 9, yVar.mo55072b()), (C7399a) null);
            return true;
        } else if ((d[0] & Ascii.DEL) == 3) {
            C7346p.C7347a a = C7343n.m20237a(yVar);
            C7346p a2 = pVar.mo54078a(a);
            this.f16288a = a2;
            this.f16289b = new C7267a(a2, a);
            return true;
        } else if (!m19817a(d)) {
            return true;
        } else {
            C7267a aVar2 = this.f16289b;
            if (aVar2 != null) {
                aVar2.mo53996b(j);
                aVar.f16330b = this.f16289b;
            }
            C7717a.m22120b(aVar.f16329a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo53995b(C7772y yVar) {
        if (!m19817a(yVar.mo55077d())) {
            return -1;
        }
        return (long) m19818c(yVar);
    }
}
