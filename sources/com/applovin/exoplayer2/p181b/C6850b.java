package com.applovin.exoplayer2.p181b;

import com.applovin.exoplayer2.C7864v;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7771x;
import com.applovin.exoplayer2.p221l.C7772y;
import com.explorestack.protobuf.openrtb.LossReason;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.exoplayer2.b.b */
public final class C6850b {

    /* renamed from: a */
    private static final int[] f14981a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f14982b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f14983c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f14984d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f14985e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f14986f = {69, 87, 104, 121, 139, 174, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.applovin.exoplayer2.b.b$a */
    public static final class C6852a {

        /* renamed from: a */
        public final String f14987a;

        /* renamed from: b */
        public final int f14988b;

        /* renamed from: c */
        public final int f14989c;

        /* renamed from: d */
        public final int f14990d;

        /* renamed from: e */
        public final int f14991e;

        /* renamed from: f */
        public final int f14992f;

        private C6852a(String str, int i, int i2, int i3, int i4, int i5) {
            this.f14987a = str;
            this.f14988b = i;
            this.f14990d = i2;
            this.f14989c = i3;
            this.f14991e = i4;
            this.f14992f = i5;
        }
    }

    /* renamed from: a */
    private static int m17933a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f14982b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f14986f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f14985e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: a */
    public static int m17934a(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f14981a[i] * 256;
    }

    /* renamed from: a */
    public static int m17935a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: a */
    public static int m17936a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return m17933a((bArr[4] & 192) >> 6, (int) bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: a */
    public static C6852a m17937a(C7771x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C7771x xVar2 = xVar;
        int b = xVar.mo55050b();
        xVar2.mo55051b(40);
        boolean z = xVar2.mo55054c(5) > 10;
        xVar2.mo55044a(b);
        int i12 = -1;
        if (z) {
            xVar2.mo55051b(16);
            int c = xVar2.mo55054c(2);
            if (c == 0) {
                i12 = 0;
            } else if (c == 1) {
                i12 = 1;
            } else if (c == 2) {
                i12 = 2;
            }
            xVar2.mo55051b(3);
            int c2 = (xVar2.mo55054c(11) + 1) * 2;
            int c3 = xVar2.mo55054c(2);
            if (c3 == 3) {
                i6 = f14983c[xVar2.mo55054c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = xVar2.mo55054c(2);
                i7 = f14981a[i8];
                i6 = f14982b[c3];
            }
            int i13 = i7 * 256;
            int c4 = xVar2.mo55054c(3);
            boolean e = xVar.mo55058e();
            int i14 = f14984d[c4] + (e ? 1 : 0);
            xVar2.mo55051b(10);
            if (xVar.mo55058e()) {
                xVar2.mo55051b(8);
            }
            if (c4 == 0) {
                xVar2.mo55051b(5);
                if (xVar.mo55058e()) {
                    xVar2.mo55051b(8);
                }
            }
            if (i12 == 1 && xVar.mo55058e()) {
                xVar2.mo55051b(16);
            }
            if (xVar.mo55058e()) {
                if (c4 > 2) {
                    xVar2.mo55051b(2);
                }
                if ((c4 & 1) == 0 || c4 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    xVar2.mo55051b(6);
                }
                if ((c4 & 4) != 0) {
                    xVar2.mo55051b(i10);
                }
                if (e && xVar.mo55058e()) {
                    xVar2.mo55051b(5);
                }
                if (i12 == 0) {
                    if (xVar.mo55058e()) {
                        i11 = 6;
                        xVar2.mo55051b(6);
                    } else {
                        i11 = 6;
                    }
                    if (c4 == 0 && xVar.mo55058e()) {
                        xVar2.mo55051b(i11);
                    }
                    if (xVar.mo55058e()) {
                        xVar2.mo55051b(i11);
                    }
                    int c5 = xVar2.mo55054c(2);
                    if (c5 == 1) {
                        xVar2.mo55051b(5);
                    } else if (c5 == 2) {
                        xVar2.mo55051b(12);
                    } else if (c5 == 3) {
                        int c6 = xVar2.mo55054c(5);
                        if (xVar.mo55058e()) {
                            xVar2.mo55051b(5);
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(4);
                            }
                            if (xVar.mo55058e()) {
                                if (xVar.mo55058e()) {
                                    xVar2.mo55051b(4);
                                }
                                if (xVar.mo55058e()) {
                                    xVar2.mo55051b(4);
                                }
                            }
                        }
                        if (xVar.mo55058e()) {
                            xVar2.mo55051b(5);
                            if (xVar.mo55058e()) {
                                xVar2.mo55051b(7);
                                if (xVar.mo55058e()) {
                                    xVar2.mo55051b(8);
                                }
                            }
                        }
                        xVar2.mo55051b((c6 + 2) * 8);
                        xVar.mo55059f();
                    }
                    if (c4 < 2) {
                        if (xVar.mo55058e()) {
                            xVar2.mo55051b(14);
                        }
                        if (c4 == 0 && xVar.mo55058e()) {
                            xVar2.mo55051b(14);
                        }
                    }
                    if (xVar.mo55058e()) {
                        if (i8 == 0) {
                            xVar2.mo55051b(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (xVar.mo55058e()) {
                                    xVar2.mo55051b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.mo55058e()) {
                xVar2.mo55051b(5);
                if (c4 == 2) {
                    xVar2.mo55051b(4);
                }
                if (c4 >= 6) {
                    xVar2.mo55051b(2);
                }
                if (xVar.mo55058e()) {
                    xVar2.mo55051b(8);
                }
                if (c4 == 0 && xVar.mo55058e()) {
                    xVar2.mo55051b(8);
                }
                if (c3 < 3) {
                    xVar.mo55056d();
                }
            }
            if (i12 == 0 && i8 != 3) {
                xVar.mo55056d();
            }
            if (i12 != 2 || (i8 != 3 && !xVar.mo55058e())) {
                i9 = 6;
            } else {
                i9 = 6;
                xVar2.mo55051b(6);
            }
            str = (xVar.mo55058e() && xVar2.mo55054c(i9) == 1 && xVar2.mo55054c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = c2;
            i3 = i6;
            i4 = i14;
        } else {
            xVar2.mo55051b(32);
            int c7 = xVar2.mo55054c(2);
            String str2 = c7 == 3 ? null : "audio/ac3";
            int a = m17933a(c7, xVar2.mo55054c(6));
            xVar2.mo55051b(8);
            int c8 = xVar2.mo55054c(3);
            if (!((c8 & 1) == 0 || c8 == 1)) {
                xVar2.mo55051b(2);
            }
            if ((c8 & 4) != 0) {
                xVar2.mo55051b(2);
            }
            if (c8 == 2) {
                xVar2.mo55051b(2);
            }
            int[] iArr = f14982b;
            str = str2;
            i2 = a;
            i3 = c7 < iArr.length ? iArr[c7] : -1;
            i4 = f14984d[c8] + (xVar.mo55058e() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new C6852a(str, i5, i4, i3, i2, i);
    }

    /* renamed from: a */
    public static C7864v m17938a(C7772y yVar, String str, String str2, C7148e eVar) {
        int i = f14982b[(yVar.mo55084h() & 192) >> 6];
        int h = yVar.mo55084h();
        int i2 = f14984d[(h & 56) >> 3];
        if ((h & 4) != 0) {
            i2++;
        }
        return new C7864v.C7866a().mo55421a(str).mo55435f("audio/ac3").mo55440k(i2).mo55441l(i).mo55418a(eVar).mo55429c(str2).mo55424a();
    }

    /* renamed from: b */
    public static int m17939b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((C7728ai.m22184a(byteBuffer, i + 4) & -2) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m17940b(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    /* renamed from: b */
    public static C7864v m17941b(C7772y yVar, String str, String str2, C7148e eVar) {
        yVar.mo55079e(2);
        int i = f14982b[(yVar.mo55084h() & 192) >> 6];
        int h = yVar.mo55084h();
        int i2 = f14984d[(h & 14) >> 1];
        if ((h & 1) != 0) {
            i2++;
        }
        if (((yVar.mo55084h() & 30) >> 1) > 0 && (2 & yVar.mo55084h()) != 0) {
            i2 += 2;
        }
        return new C7864v.C7866a().mo55421a(str).mo55435f((yVar.mo55064a() <= 0 || (yVar.mo55084h() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").mo55440k(i2).mo55441l(i).mo55418a(eVar).mo55429c(str2).mo55424a();
    }
}
