package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7339k;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.applovin.exoplayer2.e.h.d */
final class C7269d {

    /* renamed from: a */
    private final C7270e f16298a = new C7270e();

    /* renamed from: b */
    private final C7772y f16299b = new C7772y(new byte[65025], 0);

    /* renamed from: c */
    private int f16300c = -1;

    /* renamed from: d */
    private int f16301d;

    /* renamed from: e */
    private boolean f16302e;

    C7269d() {
    }

    /* renamed from: a */
    private int m19834a(int i) {
        int i2 = 0;
        this.f16301d = 0;
        while (this.f16301d + i < this.f16298a.f16309g) {
            int[] iArr = this.f16298a.f16312j;
            int i3 = this.f16301d;
            this.f16301d = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void mo53997a() {
        this.f16298a.mo54002a();
        this.f16299b.mo55067a(0);
        this.f16300c = -1;
        this.f16302e = false;
    }

    /* renamed from: a */
    public boolean mo53998a(C7279i iVar) throws IOException {
        int i;
        C7717a.m22121b(iVar != null);
        if (this.f16302e) {
            this.f16302e = false;
            this.f16299b.mo55067a(0);
        }
        while (!this.f16302e) {
            if (this.f16300c < 0) {
                if (!this.f16298a.mo54003a(iVar) || !this.f16298a.mo54005a(iVar, true)) {
                    return false;
                }
                int i2 = this.f16298a.f16310h;
                if ((this.f16298a.f16304b & 1) == 1 && this.f16299b.mo55072b() == 0) {
                    i2 += m19834a(0);
                    i = this.f16301d + 0;
                } else {
                    i = 0;
                }
                if (!C7339k.m20221a(iVar, i2)) {
                    return false;
                }
                this.f16300c = i;
            }
            int a = m19834a(this.f16300c);
            int i3 = this.f16300c + this.f16301d;
            if (a > 0) {
                C7772y yVar = this.f16299b;
                yVar.mo55073b(yVar.mo55072b() + a);
                if (!C7339k.m20223b(iVar, this.f16299b.mo55077d(), this.f16299b.mo55072b(), a)) {
                    return false;
                }
                C7772y yVar2 = this.f16299b;
                yVar2.mo55075c(yVar2.mo55072b() + a);
                this.f16302e = this.f16298a.f16312j[i3 + -1] != 255;
            }
            if (i3 == this.f16298a.f16309g) {
                i3 = -1;
            }
            this.f16300c = i3;
        }
        return true;
    }

    /* renamed from: b */
    public C7270e mo53999b() {
        return this.f16298a;
    }

    /* renamed from: c */
    public C7772y mo54000c() {
        return this.f16299b;
    }

    /* renamed from: d */
    public void mo54001d() {
        if (this.f16299b.mo55077d().length != 65025) {
            C7772y yVar = this.f16299b;
            yVar.mo55070a(Arrays.copyOf(yVar.mo55077d(), Math.max(65025, this.f16299b.mo55072b())), this.f16299b.mo55072b());
        }
    }
}
