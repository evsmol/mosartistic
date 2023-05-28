package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p201c.C7412a;
import com.applovin.exoplayer2.p198g.p201c.C7414b;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.p */
public final class C7346p {

    /* renamed from: a */
    public final int f16751a;

    /* renamed from: b */
    public final int f16752b;

    /* renamed from: c */
    public final int f16753c;

    /* renamed from: d */
    public final int f16754d;

    /* renamed from: e */
    public final int f16755e;

    /* renamed from: f */
    public final int f16756f;

    /* renamed from: g */
    public final int f16757g;

    /* renamed from: h */
    public final int f16758h;

    /* renamed from: i */
    public final int f16759i;

    /* renamed from: j */
    public final long f16760j;

    /* renamed from: k */
    public final C7347a f16761k;

    /* renamed from: l */
    private final C7399a f16762l;

    /* renamed from: com.applovin.exoplayer2.e.p$a */
    public static class C7347a {

        /* renamed from: a */
        public final long[] f16763a;

        /* renamed from: b */
        public final long[] f16764b;

        public C7347a(long[] jArr, long[] jArr2) {
            this.f16763a = jArr;
            this.f16764b = jArr2;
        }
    }

    private C7346p(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C7347a aVar, C7399a aVar2) {
        this.f16751a = i;
        this.f16752b = i2;
        this.f16753c = i3;
        this.f16754d = i4;
        this.f16755e = i5;
        this.f16756f = m20251a(i5);
        this.f16757g = i6;
        this.f16758h = i7;
        this.f16759i = m20253b(i7);
        this.f16760j = j;
        this.f16761k = aVar;
        this.f16762l = aVar2;
    }

    public C7346p(byte[] bArr, int i) {
        C7771x xVar = new C7771x(bArr);
        xVar.mo55044a(i * 8);
        this.f16751a = xVar.mo55054c(16);
        this.f16752b = xVar.mo55054c(16);
        this.f16753c = xVar.mo55054c(24);
        this.f16754d = xVar.mo55054c(24);
        int c = xVar.mo55054c(20);
        this.f16755e = c;
        this.f16756f = m20251a(c);
        this.f16757g = xVar.mo55054c(3) + 1;
        int c2 = xVar.mo55054c(5) + 1;
        this.f16758h = c2;
        this.f16759i = m20253b(c2);
        this.f16760j = xVar.mo55055d(36);
        this.f16761k = null;
        this.f16762l = null;
    }

    /* renamed from: a */
    private static int m20251a(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private static C7399a m20252a(List<String> list, List<C7412a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] b = C7728ai.m22242b(str, "=");
            if (b.length != 2) {
                C7755q.m22361c("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new C7414b(b[0], b[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7399a((List<? extends C7399a.C7401a>) arrayList);
    }

    /* renamed from: b */
    private static int m20253b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: a */
    public long mo54076a() {
        long j = this.f16760j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f16755e);
    }

    /* renamed from: a */
    public long mo54077a(long j) {
        return C7728ai.m22192a((j * ((long) this.f16755e)) / 1000000, 0, this.f16760j - 1);
    }

    /* renamed from: a */
    public C7346p mo54078a(C7347a aVar) {
        return new C7346p(this.f16751a, this.f16752b, this.f16753c, this.f16754d, this.f16755e, this.f16757g, this.f16758h, this.f16760j, aVar, this.f16762l);
    }

    /* renamed from: a */
    public C7346p mo54079a(List<String> list) {
        return new C7346p(this.f16751a, this.f16752b, this.f16753c, this.f16754d, this.f16755e, this.f16757g, this.f16758h, this.f16760j, this.f16761k, mo54080a(m20252a(list, (List<C7412a>) Collections.emptyList())));
    }

    /* renamed from: a */
    public C7399a mo54080a(C7399a aVar) {
        C7399a aVar2 = this.f16762l;
        return aVar2 == null ? aVar : aVar2.mo54202a(aVar);
    }

    /* renamed from: a */
    public C7864v mo54081a(byte[] bArr, C7399a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f16754d;
        if (i <= 0) {
            i = -1;
        }
        return new C7864v.C7866a().mo55435f("audio/flac").mo55434f(i).mo55440k(this.f16757g).mo55441l(this.f16755e).mo55422a((List<byte[]>) Collections.singletonList(bArr)).mo55419a(mo54080a(aVar)).mo55424a();
    }

    /* renamed from: b */
    public long mo54082b() {
        long j;
        long j2;
        int i = this.f16754d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f16753c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f16751a;
            j = ((((i2 != this.f16752b || i2 <= 0) ? 4096 : (long) i2) * ((long) this.f16757g)) * ((long) this.f16758h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: b */
    public C7346p mo54083b(List<C7412a> list) {
        return new C7346p(this.f16751a, this.f16752b, this.f16753c, this.f16754d, this.f16755e, this.f16757g, this.f16758h, this.f16760j, this.f16761k, mo54080a(m20252a((List<String>) Collections.emptyList(), list)));
    }
}
