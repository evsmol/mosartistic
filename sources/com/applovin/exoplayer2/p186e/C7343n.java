package com.applovin.exoplayer2.p186e;

import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.p186e.C7346p;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.p201c.C7412a;
import com.applovin.exoplayer2.p198g.p203e.C7435g;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.exoplayer2.e.n */
public final class C7343n {

    /* renamed from: com.applovin.exoplayer2.e.n$a */
    public static final class C7344a {

        /* renamed from: a */
        public C7346p f16748a;

        public C7344a(C7346p pVar) {
            this.f16748a = pVar;
        }
    }

    /* renamed from: a */
    private static C7346p.C7347a m20236a(C7279i iVar, int i) throws IOException {
        C7772y yVar = new C7772y(i);
        iVar.mo53903b(yVar.mo55077d(), 0, i);
        return m20237a(yVar);
    }

    /* renamed from: a */
    public static C7346p.C7347a m20237a(C7772y yVar) {
        yVar.mo55079e(1);
        int m = yVar.mo55089m();
        long c = ((long) yVar.mo55074c()) + ((long) m);
        int i = m / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long s = yVar.mo55095s();
            if (s == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = s;
            jArr2[i2] = yVar.mo55095s();
            yVar.mo55079e(2);
            i2++;
        }
        yVar.mo55079e((int) (c - ((long) yVar.mo55074c())));
        return new C7346p.C7347a(jArr, jArr2);
    }

    /* renamed from: a */
    public static C7399a m20238a(C7279i iVar, boolean z) throws IOException {
        C7399a a = new C7350s().mo54087a(iVar, z ? null : C7435g.f17038a);
        if (a == null || a.mo54200a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m20239a(C7279i iVar) throws IOException {
        C7772y yVar = new C7772y(4);
        iVar.mo53908d(yVar.mo55077d(), 0, 4);
        return yVar.mo55091o() == 1716281667;
    }

    /* renamed from: a */
    public static boolean m20240a(C7279i iVar, C7344a aVar) throws IOException {
        C7346p b;
        iVar.mo53899a();
        C7771x xVar = new C7771x(new byte[4]);
        iVar.mo53908d(xVar.f18340a, 0, 4);
        boolean e = xVar.mo55058e();
        int c = xVar.mo55054c(7);
        int c2 = xVar.mo55054c(24) + 4;
        if (c == 0) {
            b = m20246d(iVar);
        } else {
            C7346p pVar = aVar.f16748a;
            if (pVar == null) {
                throw new IllegalArgumentException();
            } else if (c == 3) {
                b = pVar.mo54078a(m20236a(iVar, c2));
            } else if (c == 4) {
                b = pVar.mo54079a(m20242b(iVar, c2));
            } else if (c == 6) {
                b = pVar.mo54083b((List<C7412a>) Collections.singletonList(m20245c(iVar, c2)));
            } else {
                iVar.mo53902b(c2);
                return e;
            }
        }
        aVar.f16748a = b;
        return e;
    }

    /* renamed from: b */
    public static C7399a m20241b(C7279i iVar, boolean z) throws IOException {
        iVar.mo53899a();
        long b = iVar.mo53891b();
        C7399a a = m20238a(iVar, z);
        iVar.mo53902b((int) (iVar.mo53891b() - b));
        return a;
    }

    /* renamed from: b */
    private static List<String> m20242b(C7279i iVar, int i) throws IOException {
        C7772y yVar = new C7772y(i);
        iVar.mo53903b(yVar.mo55077d(), 0, i);
        yVar.mo55079e(4);
        return Arrays.asList(C7360z.m20303a(yVar, false, false).f16796b);
    }

    /* renamed from: b */
    public static void m20243b(C7279i iVar) throws IOException {
        C7772y yVar = new C7772y(4);
        iVar.mo53903b(yVar.mo55077d(), 0, 4);
        if (yVar.mo55091o() != 1716281667) {
            throw C6809ai.m17540b("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    /* renamed from: c */
    public static int m20244c(C7279i iVar) throws IOException {
        iVar.mo53899a();
        C7772y yVar = new C7772y(2);
        iVar.mo53908d(yVar.mo55077d(), 0, 2);
        int i = yVar.mo55085i();
        int i2 = i >> 2;
        iVar.mo53899a();
        if (i2 == 16382) {
            return i;
        }
        throw C6809ai.m17540b("First frame does not start with sync code.", (Throwable) null);
    }

    /* renamed from: c */
    private static C7412a m20245c(C7279i iVar, int i) throws IOException {
        C7772y yVar = new C7772y(i);
        iVar.mo53903b(yVar.mo55077d(), 0, i);
        yVar.mo55079e(4);
        int q = yVar.mo55093q();
        String a = yVar.mo55066a(yVar.mo55093q(), Charsets.US_ASCII);
        String f = yVar.mo55081f(yVar.mo55093q());
        int q2 = yVar.mo55093q();
        int q3 = yVar.mo55093q();
        int q4 = yVar.mo55093q();
        int q5 = yVar.mo55093q();
        int q6 = yVar.mo55093q();
        byte[] bArr = new byte[q6];
        yVar.mo55071a(bArr, 0, q6);
        return new C7412a(q, a, f, q2, q3, q4, q5, bArr);
    }

    /* renamed from: d */
    private static C7346p m20246d(C7279i iVar) throws IOException {
        byte[] bArr = new byte[38];
        iVar.mo53903b(bArr, 0, 38);
        return new C7346p(bArr, 4);
    }
}
