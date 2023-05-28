package com.applovin.exoplayer2.p186e.p195i;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p181b.C6853c;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p186e.p195i.C7287ad;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;

/* renamed from: com.applovin.exoplayer2.e.i.d */
public final class C7296d implements C7302j {

    /* renamed from: a */
    private final C7771x f16415a;

    /* renamed from: b */
    private final C7772y f16416b;

    /* renamed from: c */
    private final String f16417c;

    /* renamed from: d */
    private String f16418d;

    /* renamed from: e */
    private C7357x f16419e;

    /* renamed from: f */
    private int f16420f;

    /* renamed from: g */
    private int f16421g;

    /* renamed from: h */
    private boolean f16422h;

    /* renamed from: i */
    private boolean f16423i;

    /* renamed from: j */
    private long f16424j;

    /* renamed from: k */
    private C7864v f16425k;

    /* renamed from: l */
    private int f16426l;

    /* renamed from: m */
    private long f16427m;

    public C7296d() {
        this((String) null);
    }

    public C7296d(String str) {
        C7771x xVar = new C7771x(new byte[16]);
        this.f16415a = xVar;
        this.f16416b = new C7772y(xVar.f18340a);
        this.f16420f = 0;
        this.f16421g = 0;
        this.f16422h = false;
        this.f16423i = false;
        this.f16427m = -9223372036854775807L;
        this.f16417c = str;
    }

    /* renamed from: a */
    private boolean m19974a(C7772y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.mo55064a(), i - this.f16421g);
        yVar.mo55071a(bArr, this.f16421g, min);
        int i2 = this.f16421g + min;
        this.f16421g = i2;
        return i2 == i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19975b(com.applovin.exoplayer2.p221l.C7772y r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.mo55064a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f16422h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.mo55084h()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f16422h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.mo55084h()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f16422h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f16423i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p195i.C7296d.m19975b(com.applovin.exoplayer2.l.y):boolean");
    }

    /* renamed from: c */
    private void m19976c() {
        this.f16415a.mo55044a(0);
        C6853c.C6855a a = C6853c.m17945a(this.f16415a);
        if (this.f16425k == null || a.f14996c != this.f16425k.f18934y || a.f14995b != this.f16425k.f18935z || !"audio/ac4".equals(this.f16425k.f18921l)) {
            C7864v a2 = new C7864v.C7866a().mo55421a(this.f16418d).mo55435f("audio/ac4").mo55440k(a.f14996c).mo55441l(a.f14995b).mo55429c(this.f16417c).mo55424a();
            this.f16425k = a2;
            this.f16419e.mo53953a(a2);
        }
        this.f16426l = a.f14997d;
        this.f16424j = (((long) a.f14998e) * 1000000) / ((long) this.f16425k.f18935z);
    }

    /* renamed from: a */
    public void mo54029a() {
        this.f16420f = 0;
        this.f16421g = 0;
        this.f16422h = false;
        this.f16423i = false;
        this.f16427m = -9223372036854775807L;
    }

    /* renamed from: a */
    public void mo54030a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f16427m = j;
        }
    }

    /* renamed from: a */
    public void mo54031a(C7329j jVar, C7287ad.C7291d dVar) {
        dVar.mo54024a();
        this.f16418d = dVar.mo54026c();
        this.f16419e = jVar.mo53894a(dVar.mo54025b(), 1);
    }

    /* renamed from: a */
    public void mo54032a(C7772y yVar) {
        C7717a.m22115a(this.f16419e);
        while (yVar.mo55064a() > 0) {
            int i = this.f16420f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yVar.mo55064a(), this.f16426l - this.f16421g);
                        this.f16419e.mo53951a(yVar, min);
                        int i2 = this.f16421g + min;
                        this.f16421g = i2;
                        int i3 = this.f16426l;
                        if (i2 == i3) {
                            long j = this.f16427m;
                            if (j != -9223372036854775807L) {
                                this.f16419e.mo53950a(j, 1, i3, 0, (C7357x.C7358a) null);
                                this.f16427m += this.f16424j;
                            }
                            this.f16420f = 0;
                        }
                    }
                } else if (m19974a(yVar, this.f16416b.mo55077d(), 16)) {
                    m19976c();
                    this.f16416b.mo55076d(0);
                    this.f16419e.mo53951a(this.f16416b, 16);
                    this.f16420f = 2;
                }
            } else if (m19975b(yVar)) {
                this.f16420f = 1;
                this.f16416b.mo55077d()[0] = -84;
                this.f16416b.mo55077d()[1] = (byte) (this.f16423i ? 65 : 64);
                this.f16421g = 2;
            }
        }
    }

    /* renamed from: b */
    public void mo54033b() {
    }
}
