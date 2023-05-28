package com.applovin.exoplayer2.p198g.p203e;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.p198g.C7399a;
import com.applovin.exoplayer2.p198g.C7416d;
import com.applovin.exoplayer2.p198g.C7460g;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.applovin.exoplayer2.g.e.g */
public final class C7435g extends C7460g {

    /* renamed from: a */
    public static final C7436a f17038a = $$Lambda$g$k1XRr02Td0ZR_6qrKsLkLkVUk.INSTANCE;

    /* renamed from: b */
    private final C7436a f17039b;

    /* renamed from: com.applovin.exoplayer2.g.e.g$a */
    public interface C7436a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.applovin.exoplayer2.g.e.g$b */
    private static final class C7437b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f17040a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f17041b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f17042c;

        public C7437b(int i, boolean z, int i2) {
            this.f17040a = i;
            this.f17041b = z;
            this.f17042c = i2;
        }
    }

    public C7435g() {
        this((C7436a) null);
    }

    public C7435g(C7436a aVar) {
        this.f17039b = aVar;
    }

    /* renamed from: a */
    private static int m20682a(byte[] bArr, int i, int i2) {
        int b = m20694b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if ((b - i) % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m20694b(bArr, b + 1);
        }
        return bArr.length;
    }

    /* renamed from: a */
    private static C7423a m20683a(C7772y yVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int h = yVar.mo55084h();
        String a = m20689a(h);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        yVar.mo55071a(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m20694b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, i3, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i5 = i3 + 2;
        int a2 = m20682a(bArr, i5, h);
        return new C7423a(str, new String(bArr, i5, a2 - i5, a), bArr[i3 + 1] & 255, m20699b(bArr, a2 + m20693b(h), i4));
    }

    /* renamed from: a */
    private static C7427c m20684a(C7772y yVar, int i, int i2, boolean z, int i3, C7436a aVar) throws UnsupportedEncodingException {
        C7772y yVar2 = yVar;
        int c = yVar.mo55074c();
        int b = m20694b(yVar.mo55077d(), c);
        String str = new String(yVar.mo55077d(), c, b - c, "ISO-8859-1");
        yVar.mo55076d(b + 1);
        int q = yVar.mo55093q();
        int q2 = yVar.mo55093q();
        long o = yVar.mo55091o();
        long j = o == 4294967295L ? -1 : o;
        long o2 = yVar.mo55091o();
        long j2 = o2 == 4294967295L ? -1 : o2;
        ArrayList arrayList = new ArrayList();
        int i4 = c + i;
        while (yVar.mo55074c() < i4) {
            C7438h a = m20686a(i2, yVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new C7427c(str, q, q2, j, j2, (C7438h[]) arrayList.toArray(new C7438h[0]));
    }

    /* renamed from: a */
    private static C7437b m20685a(C7772y yVar) {
        StringBuilder sb;
        String str;
        if (yVar.mo55064a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m = yVar.mo55089m();
            boolean z = false;
            if (m != 4801587) {
                sb = new StringBuilder();
                sb.append("Unexpected first three bytes of ID3 tag header: 0x");
                sb.append(String.format("%06X", new Object[]{Integer.valueOf(m)}));
            } else {
                int h = yVar.mo55084h();
                yVar.mo55079e(1);
                int h2 = yVar.mo55084h();
                int v = yVar.mo55098v();
                if (h == 2) {
                    if ((h2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (h == 3) {
                    if ((h2 & 64) != 0) {
                        int q = yVar.mo55093q();
                        yVar.mo55079e(q);
                        v -= q + 4;
                    }
                } else if (h == 4) {
                    if ((h2 & 64) != 0) {
                        int v2 = yVar.mo55098v();
                        yVar.mo55079e(v2 - 4);
                        v -= v2;
                    }
                    if ((h2 & 16) != 0) {
                        v -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(h);
                }
                if (h < 4 && (h2 & 128) != 0) {
                    z = true;
                }
                return new C7437b(h, z, v);
            }
            str = sb.toString();
        }
        C7755q.m22361c("Id3Decoder", str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.p198g.p203e.C7438h m20686a(int r19, com.applovin.exoplayer2.p221l.C7772y r20, boolean r21, int r22, com.applovin.exoplayer2.p198g.p203e.C7435g.C7436a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo55084h()
            int r9 = r20.mo55084h()
            int r10 = r20.mo55084h()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo55084h()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo55099w()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo55099w()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo55089m()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo55085i()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo55072b()
            r7.mo55076d(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo55074c()
            int r5 = r1 + r15
            int r1 = r20.mo55072b()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r4, r0)
            int r0 = r20.mo55072b()
            r7.mo55076d(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.evaluate(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo55076d(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo55079e(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo55079e(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m20705g(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            com.applovin.exoplayer2.g.e.l r1 = m20687a((com.applovin.exoplayer2.p221l.C7772y) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m20690a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.l r1 = m20688a((com.applovin.exoplayer2.p221l.C7772y) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            com.applovin.exoplayer2.g.e.m r1 = m20696b((com.applovin.exoplayer2.p221l.C7772y) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m20690a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.m r1 = m20697b((com.applovin.exoplayer2.p221l.C7772y) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            com.applovin.exoplayer2.g.e.k r1 = m20701c(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            com.applovin.exoplayer2.g.e.f r1 = m20702d(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            com.applovin.exoplayer2.g.e.a r1 = m20683a((com.applovin.exoplayer2.p221l.C7772y) r7, (int) r15, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            com.applovin.exoplayer2.g.e.e r1 = m20703e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.exoplayer2.g.e.c r1 = m20684a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.exoplayer2.g.e.d r1 = m20695b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            com.applovin.exoplayer2.g.e.j r1 = m20704f(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = m20690a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.b r1 = m20700c(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = m20690a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.mo55076d(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo55076d(r14)
            return r16
        L_0x0221:
            r7.mo55076d(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.applovin.exoplayer2.p221l.C7755q.m22361c(r12, r0)
            r7.mo55076d(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p198g.p203e.C7435g.m20686a(int, com.applovin.exoplayer2.l.y, boolean, int, com.applovin.exoplayer2.g.e.g$a):com.applovin.exoplayer2.g.e.h");
    }

    /* renamed from: a */
    private static C7445l m20687a(C7772y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h = yVar.mo55084h();
        String a = m20689a(h);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.mo55071a(bArr, 0, i2);
        int a2 = m20682a(bArr, 0, h);
        String str = new String(bArr, 0, a2, a);
        int b = a2 + m20693b(h);
        return new C7445l("TXXX", str, m20691a(bArr, b, m20682a(bArr, b, h), a));
    }

    /* renamed from: a */
    private static C7445l m20688a(C7772y yVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h = yVar.mo55084h();
        String a = m20689a(h);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.mo55071a(bArr, 0, i2);
        return new C7445l(str, (String) null, new String(bArr, 0, m20682a(bArr, 0, h), a));
    }

    /* renamed from: a */
    private static String m20689a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: a */
    private static String m20690a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    private static String m20691a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m20692a(com.applovin.exoplayer2.p221l.C7772y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo55074c()
        L_0x0008:
            int r3 = r18.mo55064a()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo55093q()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.mo55091o()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.mo55085i()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo55089m()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.mo55089m()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo55076d(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo55076d(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.mo55076d(r2)
            return r6
        L_0x009b:
            int r3 = r18.mo55064a()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.mo55076d(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.mo55079e(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.mo55076d(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.mo55076d(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p198g.p203e.C7435g.m20692a(com.applovin.exoplayer2.l.y, int, int, boolean):boolean");
    }

    /* renamed from: b */
    private static int m20693b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static int m20694b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static C7429d m20695b(C7772y yVar, int i, int i2, boolean z, int i3, C7436a aVar) throws UnsupportedEncodingException {
        C7772y yVar2 = yVar;
        int c = yVar.mo55074c();
        int b = m20694b(yVar.mo55077d(), c);
        String str = new String(yVar.mo55077d(), c, b - c, "ISO-8859-1");
        yVar2.mo55076d(b + 1);
        int h = yVar.mo55084h();
        boolean z2 = (h & 2) != 0;
        boolean z3 = (h & 1) != 0;
        int h2 = yVar.mo55084h();
        String[] strArr = new String[h2];
        for (int i4 = 0; i4 < h2; i4++) {
            int c2 = yVar.mo55074c();
            int b2 = m20694b(yVar.mo55077d(), c2);
            strArr[i4] = new String(yVar.mo55077d(), c2, b2 - c2, "ISO-8859-1");
            yVar2.mo55076d(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (yVar.mo55074c() < i5) {
            C7438h a = m20686a(i2, yVar2, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new C7429d(str, z2, z3, strArr, (C7438h[]) arrayList.toArray(new C7438h[0]));
    }

    /* renamed from: b */
    private static C7447m m20696b(C7772y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h = yVar.mo55084h();
        String a = m20689a(h);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.mo55071a(bArr, 0, i2);
        int a2 = m20682a(bArr, 0, h);
        String str = new String(bArr, 0, a2, a);
        int b = a2 + m20693b(h);
        return new C7447m("WXXX", str, m20691a(bArr, b, m20694b(bArr, b), "ISO-8859-1"));
    }

    /* renamed from: b */
    private static C7447m m20697b(C7772y yVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.mo55071a(bArr, 0, i);
        return new C7447m(str, (String) null, new String(bArr, 0, m20694b(bArr, 0), "ISO-8859-1"));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ boolean m20698b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: b */
    private static byte[] m20699b(byte[] bArr, int i, int i2) {
        return i2 <= i ? C7728ai.f18254f : Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: c */
    private static C7425b m20700c(C7772y yVar, int i, String str) {
        byte[] bArr = new byte[i];
        yVar.mo55071a(bArr, 0, i);
        return new C7425b(str, bArr);
    }

    /* renamed from: c */
    private static C7443k m20701c(C7772y yVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.mo55071a(bArr, 0, i);
        int b = m20694b(bArr, 0);
        return new C7443k(new String(bArr, 0, b, "ISO-8859-1"), m20699b(bArr, b + 1, i));
    }

    /* renamed from: d */
    private static C7433f m20702d(C7772y yVar, int i) throws UnsupportedEncodingException {
        int h = yVar.mo55084h();
        String a = m20689a(h);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.mo55071a(bArr, 0, i2);
        int b = m20694b(bArr, 0);
        String str = new String(bArr, 0, b, "ISO-8859-1");
        int i3 = b + 1;
        int a2 = m20682a(bArr, i3, h);
        String a3 = m20691a(bArr, i3, a2, a);
        int b2 = a2 + m20693b(h);
        int a4 = m20682a(bArr, b2, h);
        return new C7433f(str, a3, m20691a(bArr, b2, a4, a), m20699b(bArr, a4 + m20693b(h), i2));
    }

    /* renamed from: e */
    private static C7431e m20703e(C7772y yVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int h = yVar.mo55084h();
        String a = m20689a(h);
        byte[] bArr = new byte[3];
        yVar.mo55071a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yVar.mo55071a(bArr2, 0, i2);
        int a2 = m20682a(bArr2, 0, h);
        String str2 = new String(bArr2, 0, a2, a);
        int b = a2 + m20693b(h);
        return new C7431e(str, str2, m20691a(bArr2, b, m20682a(bArr2, b, h), a));
    }

    /* renamed from: f */
    private static C7441j m20704f(C7772y yVar, int i) {
        int i2 = yVar.mo55085i();
        int m = yVar.mo55089m();
        int m2 = yVar.mo55089m();
        int h = yVar.mo55084h();
        int h2 = yVar.mo55084h();
        C7771x xVar = new C7771x();
        xVar.mo55046a(yVar);
        int i3 = ((i - 10) * 8) / (h + h2);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int c = xVar.mo55054c(h);
            int c2 = xVar.mo55054c(h2);
            iArr[i4] = c;
            iArr2[i4] = c2;
        }
        return new C7441j(i2, m, m2, iArr, iArr2);
    }

    /* renamed from: g */
    private static int m20705g(C7772y yVar, int i) {
        byte[] d = yVar.mo55077d();
        int c = yVar.mo55074c();
        int i2 = c;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - c)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7399a mo54223a(C7416d dVar, ByteBuffer byteBuffer) {
        return mo54318a(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: a */
    public C7399a mo54318a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C7772y yVar = new C7772y(bArr, i);
        C7437b a = m20685a(yVar);
        if (a == null) {
            return null;
        }
        int c = yVar.mo55074c();
        int i2 = a.f17040a == 2 ? 6 : 10;
        int b = a.f17042c;
        if (a.f17041b) {
            b = m20705g(yVar, a.f17042c);
        }
        yVar.mo55075c(c + b);
        boolean z = false;
        if (!m20692a(yVar, a.f17040a, i2, false)) {
            if (a.f17040a != 4 || !m20692a(yVar, 4, i2, true)) {
                C7755q.m22361c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a.f17040a);
                return null;
            }
            z = true;
        }
        while (yVar.mo55064a() >= i2) {
            C7438h a2 = m20686a(a.f17040a, yVar, z, i2, this.f17039b);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new C7399a((List<? extends C7399a.C7401a>) arrayList);
    }
}
