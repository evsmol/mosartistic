package com.applovin.exoplayer2;

@Deprecated
/* renamed from: com.applovin.exoplayer2.j */
public class C7623j implements C7539i {

    /* renamed from: a */
    private final long f17816a = -9223372036854775807L;

    /* renamed from: b */
    private final long f17817b = -9223372036854775807L;

    /* renamed from: c */
    private final boolean f17818c = false;

    /* renamed from: a */
    private static void m21718a(C6814an anVar, long j) {
        long I = anVar.mo52752I() + j;
        long H = anVar.mo52751H();
        if (H != -9223372036854775807L) {
            I = Math.min(I, H);
        }
        anVar.mo52766a(Math.max(I, 0));
    }

    /* renamed from: a */
    public boolean mo54624a() {
        return !this.f17818c || this.f17816a > 0;
    }

    /* renamed from: a */
    public boolean mo54625a(C6814an anVar) {
        anVar.mo52788w();
        return true;
    }

    /* renamed from: a */
    public boolean mo54626a(C6814an anVar, int i) {
        anVar.mo52778c(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo54627a(C6814an anVar, int i, long j) {
        anVar.mo52765a(i, j);
        return true;
    }

    /* renamed from: a */
    public boolean mo54628a(C6814an anVar, boolean z) {
        anVar.mo52770a(z);
        return true;
    }

    /* renamed from: b */
    public boolean mo54629b() {
        return !this.f17818c || this.f17817b > 0;
    }

    /* renamed from: b */
    public boolean mo54630b(C6814an anVar) {
        anVar.mo52781g();
        return true;
    }

    /* renamed from: b */
    public boolean mo54631b(C6814an anVar, boolean z) {
        anVar.mo52776b(z);
        return true;
    }

    /* renamed from: c */
    public boolean mo54632c(C6814an anVar) {
        anVar.mo52782j();
        return true;
    }

    /* renamed from: d */
    public boolean mo54633d(C6814an anVar) {
        if (!this.f17818c) {
            anVar.mo52777c();
            return true;
        } else if (!mo54624a() || !anVar.mo52783o()) {
            return true;
        } else {
            m21718a(anVar, -this.f17816a);
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo54634e(C6814an anVar) {
        if (!this.f17818c) {
            anVar.mo52779d();
            return true;
        } else if (!mo54629b() || !anVar.mo52783o()) {
            return true;
        } else {
            m21718a(anVar, this.f17817b);
            return true;
        }
    }
}
