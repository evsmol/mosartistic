package com.applovin.exoplayer2.p222m.p223a;

import android.media.MediaFormat;
import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p221l.C7725af;
import com.applovin.exoplayer2.p222m.C7806l;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.exoplayer2.m.a.h */
final class C7787h implements C7777a, C7806l {

    /* renamed from: a */
    private final AtomicBoolean f18393a;

    /* renamed from: b */
    private final C7779c f18394b;

    /* renamed from: c */
    private final C7725af<Long> f18395c;

    /* renamed from: d */
    private final C7725af<C7782e> f18396d;

    /* renamed from: e */
    private volatile int f18397e;

    /* renamed from: f */
    private int f18398f;

    /* renamed from: g */
    private byte[] f18399g;

    /* renamed from: a */
    private void m22534a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f18399g;
        int i2 = this.f18398f;
        this.f18399g = bArr;
        if (i == -1) {
            i = this.f18397e;
        }
        this.f18398f = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f18399g)) {
            C7782e eVar = null;
            byte[] bArr3 = this.f18399g;
            if (bArr3 != null) {
                eVar = C7785f.m22527a(bArr3, this.f18398f);
            }
            if (eVar == null || !C7786g.m22533a(eVar)) {
                eVar = C7782e.m22523a(this.f18398f);
            }
            this.f18396d.mo54983a(j, eVar);
        }
    }

    /* renamed from: a */
    public void mo52888a() {
        this.f18395c.mo54982a();
        this.f18394b.mo55131a();
        this.f18393a.set(true);
    }

    /* renamed from: a */
    public void mo55138a(int i) {
        this.f18397e = i;
    }

    /* renamed from: a */
    public void mo52889a(long j, long j2, C7864v vVar, MediaFormat mediaFormat) {
        this.f18395c.mo54983a(j2, Long.valueOf(j));
        m22534a(vVar.f18931v, vVar.f18932w, j2);
    }

    /* renamed from: a */
    public void mo52890a(long j, float[] fArr) {
        this.f18394b.mo55132a(j, fArr);
    }
}
