package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p186e.C7360z;
import com.applovin.exoplayer2.p186e.p194h.C7273h;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.h.i */
final class C7277i extends C7273h {

    /* renamed from: a */
    private C7278a f16331a;

    /* renamed from: b */
    private int f16332b;

    /* renamed from: c */
    private boolean f16333c;

    /* renamed from: d */
    private C7360z.C7364d f16334d;

    /* renamed from: e */
    private C7360z.C7362b f16335e;

    /* renamed from: com.applovin.exoplayer2.e.h.i$a */
    static final class C7278a {

        /* renamed from: a */
        public final C7360z.C7364d f16336a;

        /* renamed from: b */
        public final C7360z.C7362b f16337b;

        /* renamed from: c */
        public final byte[] f16338c;

        /* renamed from: d */
        public final C7360z.C7363c[] f16339d;

        /* renamed from: e */
        public final int f16340e;

        public C7278a(C7360z.C7364d dVar, C7360z.C7362b bVar, byte[] bArr, C7360z.C7363c[] cVarArr, int i) {
            this.f16336a = dVar;
            this.f16337b = bVar;
            this.f16338c = bArr;
            this.f16339d = cVarArr;
            this.f16340e = i;
        }
    }

    C7277i() {
    }

    /* renamed from: a */
    static int m19868a(byte b, int i, int i2) {
        return (b >> i2) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - i));
    }

    /* renamed from: a */
    private static int m19869a(byte b, C7278a aVar) {
        return !aVar.f16339d[m19868a(b, aVar.f16340e, 1)].f16798a ? aVar.f16336a.f16808g : aVar.f16336a.f16809h;
    }

    /* renamed from: a */
    static void m19870a(C7772y yVar, long j) {
        if (yVar.mo55078e() < yVar.mo55072b() + 4) {
            yVar.mo55069a(Arrays.copyOf(yVar.mo55077d(), yVar.mo55072b() + 4));
        } else {
            yVar.mo55075c(yVar.mo55072b() + 4);
        }
        byte[] d = yVar.mo55077d();
        d[yVar.mo55072b() - 4] = (byte) ((int) (j & 255));
        d[yVar.mo55072b() - 3] = (byte) ((int) ((j >>> 8) & 255));
        d[yVar.mo55072b() - 2] = (byte) ((int) ((j >>> 16) & 255));
        d[yVar.mo55072b() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: a */
    public static boolean m19871a(C7772y yVar) {
        try {
            return C7360z.m20306a(1, yVar, true);
        } catch (C6809ai unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53993a(boolean z) {
        super.mo53993a(z);
        if (z) {
            this.f16331a = null;
            this.f16334d = null;
            this.f16335e = null;
        }
        this.f16332b = 0;
        this.f16333c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo53994a(C7772y yVar, long j, C7273h.C7275a aVar) throws IOException {
        if (this.f16331a != null) {
            C7717a.m22120b(aVar.f16329a);
            return false;
        }
        C7278a c = mo54012c(yVar);
        this.f16331a = c;
        if (c == null) {
            return true;
        }
        C7360z.C7364d dVar = c.f16336a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f16811j);
        arrayList.add(c.f16338c);
        aVar.f16329a = new C7864v.C7866a().mo55435f("audio/vorbis").mo55430d(dVar.f16806e).mo55432e(dVar.f16805d).mo55440k(dVar.f16803b).mo55441l(dVar.f16804c).mo55422a((List<byte[]>) arrayList).mo55424a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo53995b(C7772y yVar) {
        int i = 0;
        if ((yVar.mo55077d()[0] & 1) == 1) {
            return -1;
        }
        int a = m19869a(yVar.mo55077d()[0], (C7278a) C7717a.m22115a(this.f16331a));
        if (this.f16333c) {
            i = (this.f16332b + a) / 4;
        }
        long j = (long) i;
        m19870a(yVar, j);
        this.f16333c = true;
        this.f16332b = a;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7278a mo54012c(C7772y yVar) throws IOException {
        C7360z.C7364d dVar = this.f16334d;
        if (dVar == null) {
            this.f16334d = C7360z.m20304a(yVar);
            return null;
        }
        C7360z.C7362b bVar = this.f16335e;
        if (bVar == null) {
            this.f16335e = C7360z.m20309b(yVar);
            return null;
        }
        byte[] bArr = new byte[yVar.mo55072b()];
        System.arraycopy(yVar.mo55077d(), 0, bArr, 0, yVar.mo55072b());
        C7360z.C7363c[] a = C7360z.m20308a(yVar, dVar.f16803b);
        return new C7278a(dVar, bVar, bArr, a, C7360z.m20301a(a.length - 1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo54011c(long j) {
        super.mo54011c(j);
        int i = 0;
        this.f16333c = j != 0;
        C7360z.C7364d dVar = this.f16334d;
        if (dVar != null) {
            i = dVar.f16808g;
        }
        this.f16332b = i;
    }
}
