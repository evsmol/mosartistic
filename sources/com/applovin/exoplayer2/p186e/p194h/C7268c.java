package com.applovin.exoplayer2.p186e.p194h;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;

/* renamed from: com.applovin.exoplayer2.e.h.c */
public class C7268c implements C7262h {

    /* renamed from: a */
    public static final C7340l f16294a = $$Lambda$c$K6fmmgGoaTguVv27QPZjc_gdhT0.INSTANCE;

    /* renamed from: b */
    private C7329j f16295b;

    /* renamed from: c */
    private C7273h f16296c;

    /* renamed from: d */
    private boolean f16297d;

    /* renamed from: a */
    private static C7772y m19826a(C7772y yVar) {
        yVar.mo55076d(0);
        return yVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C7262h[] m19827a() {
        return new C7262h[]{new C7268c()};
    }

    /* renamed from: b */
    private boolean m19828b(C7279i iVar) throws IOException {
        C7273h gVar;
        C7270e eVar = new C7270e();
        if (eVar.mo54005a(iVar, true) && (eVar.f16304b & 2) == 2) {
            int min = Math.min(eVar.f16311i, 8);
            C7772y yVar = new C7772y(min);
            iVar.mo53908d(yVar.mo55077d(), 0, min);
            if (C7266b.m19816a(m19826a(yVar))) {
                gVar = new C7266b();
            } else if (C7277i.m19871a(m19826a(yVar))) {
                gVar = new C7277i();
            } else if (C7272g.m19848a(m19826a(yVar))) {
                gVar = new C7272g();
            }
            this.f16296c = gVar;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        C7717a.m22115a(this.f16295b);
        if (this.f16296c == null) {
            if (m19828b(iVar)) {
                iVar.mo53899a();
            } else {
                throw C6809ai.m17540b("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f16297d) {
            C7357x a = this.f16295b.mo53894a(0, 1);
            this.f16295b.mo53895a();
            this.f16296c.mo54009a(this.f16295b, a);
            this.f16297d = true;
        }
        return this.f16296c.mo54006a(iVar, uVar);
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        C7273h hVar = this.f16296c;
        if (hVar != null) {
            hVar.mo54008a(j, j2);
        }
    }

    /* renamed from: a */
    public void mo53878a(C7329j jVar) {
        this.f16295b = jVar;
    }

    /* renamed from: a */
    public boolean mo53879a(C7279i iVar) throws IOException {
        try {
            return m19828b(iVar);
        } catch (C6809ai unused) {
            return false;
        }
    }

    /* renamed from: c */
    public void mo53880c() {
    }
}
