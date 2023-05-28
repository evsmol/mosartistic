package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7339k;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.h.e */
final class C7270e {

    /* renamed from: a */
    public int f16303a;

    /* renamed from: b */
    public int f16304b;

    /* renamed from: c */
    public long f16305c;

    /* renamed from: d */
    public long f16306d;

    /* renamed from: e */
    public long f16307e;

    /* renamed from: f */
    public long f16308f;

    /* renamed from: g */
    public int f16309g;

    /* renamed from: h */
    public int f16310h;

    /* renamed from: i */
    public int f16311i;

    /* renamed from: j */
    public final int[] f16312j = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: k */
    private final C7772y f16313k = new C7772y((int) KotlinVersion.MAX_COMPONENT_VALUE);

    C7270e() {
    }

    /* renamed from: a */
    public void mo54002a() {
        this.f16303a = 0;
        this.f16304b = 0;
        this.f16305c = 0;
        this.f16306d = 0;
        this.f16307e = 0;
        this.f16308f = 0;
        this.f16309g = 0;
        this.f16310h = 0;
        this.f16311i = 0;
    }

    /* renamed from: a */
    public boolean mo54003a(C7279i iVar) throws IOException {
        return mo54004a(iVar, -1);
    }

    /* renamed from: a */
    public boolean mo54004a(C7279i iVar, long j) throws IOException {
        int i;
        C7717a.m22118a(iVar.mo53892c() == iVar.mo53891b());
        this.f16313k.mo55067a(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || iVar.mo53892c() + 4 < j) && C7339k.m20222a(iVar, this.f16313k.mo55077d(), 0, 4, true)) {
                this.f16313k.mo55076d(0);
                if (this.f16313k.mo55091o() == 1332176723) {
                    iVar.mo53899a();
                    return true;
                }
                iVar.mo53902b(1);
            }
        }
        do {
            if ((i != 0 && iVar.mo53892c() >= j) || iVar.mo53897a(1) == -1) {
                return false;
            }
            break;
        } while (iVar.mo53897a(1) == -1);
        return false;
    }

    /* renamed from: a */
    public boolean mo54005a(C7279i iVar, boolean z) throws IOException {
        mo54002a();
        this.f16313k.mo55067a(27);
        if (!C7339k.m20222a(iVar, this.f16313k.mo55077d(), 0, 27, z) || this.f16313k.mo55091o() != 1332176723) {
            return false;
        }
        int h = this.f16313k.mo55084h();
        this.f16303a = h;
        if (h == 0) {
            this.f16304b = this.f16313k.mo55084h();
            this.f16305c = this.f16313k.mo55096t();
            this.f16306d = this.f16313k.mo55092p();
            this.f16307e = this.f16313k.mo55092p();
            this.f16308f = this.f16313k.mo55092p();
            int h2 = this.f16313k.mo55084h();
            this.f16309g = h2;
            this.f16310h = h2 + 27;
            this.f16313k.mo55067a(h2);
            if (!C7339k.m20222a(iVar, this.f16313k.mo55077d(), 0, this.f16309g, z)) {
                return false;
            }
            for (int i = 0; i < this.f16309g; i++) {
                this.f16312j[i] = this.f16313k.mo55084h();
                this.f16311i += this.f16312j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw C6809ai.m17538a("unsupported bit stream revision");
        }
    }
}
