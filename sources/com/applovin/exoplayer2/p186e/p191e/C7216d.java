package com.applovin.exoplayer2.p186e.p191e;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.C6809ai;
import com.applovin.exoplayer2.C7476h;
import com.applovin.exoplayer2.p181b.C6850b;
import com.applovin.exoplayer2.p185d.C7148e;
import com.applovin.exoplayer2.p186e.C7195c;
import com.applovin.exoplayer2.p186e.C7262h;
import com.applovin.exoplayer2.p186e.C7279i;
import com.applovin.exoplayer2.p186e.C7329j;
import com.applovin.exoplayer2.p186e.C7340l;
import com.applovin.exoplayer2.p186e.C7352u;
import com.applovin.exoplayer2.p186e.C7353v;
import com.applovin.exoplayer2.p186e.C7357x;
import com.applovin.exoplayer2.p220k.C7668g;
import com.applovin.exoplayer2.p221l.C7717a;
import com.applovin.exoplayer2.p221l.C7728ai;
import com.applovin.exoplayer2.p221l.C7755q;
import com.applovin.exoplayer2.p221l.C7756r;
import com.applovin.exoplayer2.p221l.C7762v;
import com.applovin.exoplayer2.p221l.C7772y;
import com.applovin.exoplayer2.p222m.C7790b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* renamed from: com.applovin.exoplayer2.e.e.d */
public class C7216d implements C7262h {

    /* renamed from: a */
    public static final C7340l f15921a = $$Lambda$d$b5Tl46ouRapk5XizpDUp4gtjbIU.INSTANCE;

    /* renamed from: b */
    private static final byte[] f15922b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final byte[] f15923c = C7728ai.m22250c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d */
    private static final byte[] f15924d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final UUID f15925e = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map<String, Integer> f15926f;

    /* renamed from: A */
    private C7219b f15927A;

    /* renamed from: B */
    private boolean f15928B;

    /* renamed from: C */
    private int f15929C;

    /* renamed from: D */
    private long f15930D;

    /* renamed from: E */
    private boolean f15931E;

    /* renamed from: F */
    private long f15932F;

    /* renamed from: G */
    private long f15933G;

    /* renamed from: H */
    private long f15934H;

    /* renamed from: I */
    private C7756r f15935I;

    /* renamed from: J */
    private C7756r f15936J;

    /* renamed from: K */
    private boolean f15937K;

    /* renamed from: L */
    private boolean f15938L;

    /* renamed from: M */
    private int f15939M;

    /* renamed from: N */
    private long f15940N;

    /* renamed from: O */
    private long f15941O;

    /* renamed from: P */
    private int f15942P;

    /* renamed from: Q */
    private int f15943Q;

    /* renamed from: R */
    private int[] f15944R;

    /* renamed from: S */
    private int f15945S;

    /* renamed from: T */
    private int f15946T;

    /* renamed from: U */
    private int f15947U;

    /* renamed from: V */
    private int f15948V;

    /* renamed from: W */
    private boolean f15949W;

    /* renamed from: X */
    private int f15950X;

    /* renamed from: Y */
    private int f15951Y;

    /* renamed from: Z */
    private int f15952Z;

    /* renamed from: aa */
    private boolean f15953aa;

    /* renamed from: ab */
    private boolean f15954ab;

    /* renamed from: ac */
    private boolean f15955ac;

    /* renamed from: ad */
    private int f15956ad;

    /* renamed from: ae */
    private byte f15957ae;

    /* renamed from: af */
    private boolean f15958af;

    /* renamed from: ag */
    private C7329j f15959ag;

    /* renamed from: g */
    private final C7215c f15960g;

    /* renamed from: h */
    private final C7222f f15961h;

    /* renamed from: i */
    private final SparseArray<C7219b> f15962i;

    /* renamed from: j */
    private final boolean f15963j;

    /* renamed from: k */
    private final C7772y f15964k;

    /* renamed from: l */
    private final C7772y f15965l;

    /* renamed from: m */
    private final C7772y f15966m;

    /* renamed from: n */
    private final C7772y f15967n;

    /* renamed from: o */
    private final C7772y f15968o;

    /* renamed from: p */
    private final C7772y f15969p;

    /* renamed from: q */
    private final C7772y f15970q;

    /* renamed from: r */
    private final C7772y f15971r;

    /* renamed from: s */
    private final C7772y f15972s;

    /* renamed from: t */
    private final C7772y f15973t;

    /* renamed from: u */
    private ByteBuffer f15974u;

    /* renamed from: v */
    private long f15975v;

    /* renamed from: w */
    private long f15976w;

    /* renamed from: x */
    private long f15977x;

    /* renamed from: y */
    private long f15978y;

    /* renamed from: z */
    private long f15979z;

    /* renamed from: com.applovin.exoplayer2.e.e.d$a */
    private final class C7218a implements C7214b {
        private C7218a() {
        }

        /* renamed from: a */
        public int mo53912a(int i) {
            return C7216d.this.mo53920a(i);
        }

        /* renamed from: a */
        public void mo53913a(int i, double d) throws C6809ai {
            C7216d.this.mo53921a(i, d);
        }

        /* renamed from: a */
        public void mo53914a(int i, int i2, C7279i iVar) throws IOException {
            C7216d.this.mo53922a(i, i2, iVar);
        }

        /* renamed from: a */
        public void mo53915a(int i, long j) throws C6809ai {
            C7216d.this.mo53923a(i, j);
        }

        /* renamed from: a */
        public void mo53916a(int i, long j, long j2) throws C6809ai {
            C7216d.this.mo53924a(i, j, j2);
        }

        /* renamed from: a */
        public void mo53917a(int i, String str) throws C6809ai {
            C7216d.this.mo53925a(i, str);
        }

        /* renamed from: b */
        public boolean mo53918b(int i) {
            return C7216d.this.mo53928b(i);
        }

        /* renamed from: c */
        public void mo53919c(int i) throws C6809ai {
            C7216d.this.mo53929c(i);
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.e.d$b */
    private static final class C7219b {

        /* renamed from: A */
        public int f15981A;

        /* renamed from: B */
        public int f15982B;

        /* renamed from: C */
        public float f15983C;

        /* renamed from: D */
        public float f15984D;

        /* renamed from: E */
        public float f15985E;

        /* renamed from: F */
        public float f15986F;

        /* renamed from: G */
        public float f15987G;

        /* renamed from: H */
        public float f15988H;

        /* renamed from: I */
        public float f15989I;

        /* renamed from: J */
        public float f15990J;

        /* renamed from: K */
        public float f15991K;

        /* renamed from: L */
        public float f15992L;

        /* renamed from: M */
        public byte[] f15993M;

        /* renamed from: N */
        public int f15994N;

        /* renamed from: O */
        public int f15995O;

        /* renamed from: P */
        public int f15996P;

        /* renamed from: Q */
        public long f15997Q;

        /* renamed from: R */
        public long f15998R;

        /* renamed from: S */
        public C7220c f15999S;

        /* renamed from: T */
        public boolean f16000T;

        /* renamed from: U */
        public boolean f16001U;

        /* renamed from: V */
        public C7357x f16002V;

        /* renamed from: W */
        public int f16003W;
        /* access modifiers changed from: private */

        /* renamed from: X */
        public int f16004X;
        /* access modifiers changed from: private */

        /* renamed from: Y */
        public String f16005Y;

        /* renamed from: a */
        public String f16006a;

        /* renamed from: b */
        public String f16007b;

        /* renamed from: c */
        public int f16008c;

        /* renamed from: d */
        public int f16009d;

        /* renamed from: e */
        public int f16010e;

        /* renamed from: f */
        public int f16011f;

        /* renamed from: g */
        public boolean f16012g;

        /* renamed from: h */
        public byte[] f16013h;

        /* renamed from: i */
        public C7357x.C7358a f16014i;

        /* renamed from: j */
        public byte[] f16015j;

        /* renamed from: k */
        public C7148e f16016k;

        /* renamed from: l */
        public int f16017l;

        /* renamed from: m */
        public int f16018m;

        /* renamed from: n */
        public int f16019n;

        /* renamed from: o */
        public int f16020o;

        /* renamed from: p */
        public int f16021p;

        /* renamed from: q */
        public int f16022q;

        /* renamed from: r */
        public float f16023r;

        /* renamed from: s */
        public float f16024s;

        /* renamed from: t */
        public float f16025t;

        /* renamed from: u */
        public byte[] f16026u;

        /* renamed from: v */
        public int f16027v;

        /* renamed from: w */
        public boolean f16028w;

        /* renamed from: x */
        public int f16029x;

        /* renamed from: y */
        public int f16030y;

        /* renamed from: z */
        public int f16031z;

        private C7219b() {
            this.f16017l = -1;
            this.f16018m = -1;
            this.f16019n = -1;
            this.f16020o = -1;
            this.f16021p = 0;
            this.f16022q = -1;
            this.f16023r = 0.0f;
            this.f16024s = 0.0f;
            this.f16025t = 0.0f;
            this.f16026u = null;
            this.f16027v = -1;
            this.f16028w = false;
            this.f16029x = -1;
            this.f16030y = -1;
            this.f16031z = -1;
            this.f15981A = 1000;
            this.f15982B = 200;
            this.f15983C = -1.0f;
            this.f15984D = -1.0f;
            this.f15985E = -1.0f;
            this.f15986F = -1.0f;
            this.f15987G = -1.0f;
            this.f15988H = -1.0f;
            this.f15989I = -1.0f;
            this.f15990J = -1.0f;
            this.f15991K = -1.0f;
            this.f15992L = -1.0f;
            this.f15994N = 1;
            this.f15995O = -1;
            this.f15996P = 8000;
            this.f15997Q = 0;
            this.f15998R = 0;
            this.f16001U = true;
            this.f16005Y = "eng";
        }

        /* renamed from: a */
        private static Pair<String, List<byte[]>> m19529a(C7772y yVar) throws C6809ai {
            try {
                yVar.mo55079e(16);
                long p = yVar.mo55092p();
                if (p == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (p == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (p == 826496599) {
                    byte[] d = yVar.mo55077d();
                    for (int c = yVar.mo55074c() + 20; c < d.length - 4; c++) {
                        if (d[c] == 0 && d[c + 1] == 0 && d[c + 2] == 1 && d[c + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, c, d.length)));
                        }
                    }
                    throw C6809ai.m17540b("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                C7755q.m22361c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6809ai.m17540b("Error parsing FourCC private data", (Throwable) null);
            }
        }

        /* renamed from: a */
        private static List<byte[]> m19531a(byte[] bArr) throws C6809ai {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += KotlinVersion.MAX_COMPONENT_VALUE;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += KotlinVersion.MAX_COMPONENT_VALUE;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw C6809ai.m17540b("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw C6809ai.m17540b("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C6809ai.m17540b("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C6809ai.m17540b("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6809ai.m17540b("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* renamed from: a */
        private byte[] m19533a(String str) throws C6809ai {
            byte[] bArr = this.f16015j;
            if (bArr != null) {
                return bArr;
            }
            throw C6809ai.m17540b("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        /* renamed from: b */
        private static boolean m19535b(C7772y yVar) throws C6809ai {
            try {
                int j = yVar.mo55086j();
                if (j == 1) {
                    return true;
                }
                if (j != 65534) {
                    return false;
                }
                yVar.mo55076d(24);
                return yVar.mo55095s() == C7216d.f15925e.getMostSignificantBits() && yVar.mo55095s() == C7216d.f15925e.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6809ai.m17540b("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        /* renamed from: c */
        private byte[] m19536c() {
            if (this.f15983C == -1.0f || this.f15984D == -1.0f || this.f15985E == -1.0f || this.f15986F == -1.0f || this.f15987G == -1.0f || this.f15988H == -1.0f || this.f15989I == -1.0f || this.f15990J == -1.0f || this.f15991K == -1.0f || this.f15992L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f15983C * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15984D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15985E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15986F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15987G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15988H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15989I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f15990J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f15991K + 0.5f)));
            order.putShort((short) ((int) (this.f15992L + 0.5f)));
            order.putShort((short) this.f15981A);
            order.putShort((short) this.f15982B);
            return bArr;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m19537d() {
            C7717a.m22120b(this.f16002V);
        }

        /* renamed from: a */
        public void mo53930a() {
            C7220c cVar = this.f15999S;
            if (cVar != null) {
                cVar.mo53934a(this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0216, code lost:
            r1.append(r4);
            r1.append(r0.f15995O);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x021f, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x024b, code lost:
            r1.append(r3);
            r1.append("audio/x-unknown");
            com.applovin.exoplayer2.p221l.C7755q.m22361c("MatroskaExtractor", r1.toString());
            r1 = null;
            r3 = null;
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x028c, code lost:
            r1 = null;
            r3 = null;
            r6 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0300, code lost:
            r3 = null;
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0321, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0356, code lost:
            r6 = -1;
            r15 = -1;
            r17 = r3;
            r3 = r1;
            r1 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0376, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0378, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0379, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x037a, code lost:
            r4 = r0.f15993M;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x037c, code lost:
            if (r4 == null) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x037e, code lost:
            r4 = com.applovin.exoplayer2.p222m.C7791c.m22549a(new com.applovin.exoplayer2.p221l.C7772y(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0387, code lost:
            if (r4 == null) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0389, code lost:
            r3 = r4.f18419c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x038d, code lost:
            r4 = r16;
            r5 = r0.f16001U | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0394, code lost:
            if (r0.f16000T == false) goto L_0x0398;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0396, code lost:
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0398, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0399, code lost:
            r5 = r5 | r7;
            r7 = new com.applovin.exoplayer2.C7864v.C7866a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a3, code lost:
            if (com.applovin.exoplayer2.p221l.C7759u.m22377a(r4) == false) goto L_0x03b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a5, code lost:
            r7.mo55440k(r0.f15994N).mo55441l(r0.f15996P).mo55442m(r6);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03bb, code lost:
            if (com.applovin.exoplayer2.p221l.C7759u.m22380b(r4) == false) goto L_0x0492;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bf, code lost:
            if (r0.f16021p != 0) goto L_0x03d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c1, code lost:
            r2 = r0.f16019n;
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c4, code lost:
            if (r2 != -1) goto L_0x03c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c6, code lost:
            r2 = r0.f16017l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c8, code lost:
            r0.f16019n = r2;
            r2 = r0.f16020o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03cc, code lost:
            if (r2 != -1) goto L_0x03d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ce, code lost:
            r2 = r0.f16018m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d0, code lost:
            r0.f16020o = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d3, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d4, code lost:
            r2 = -1.0f;
            r8 = r0.f16019n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d8, code lost:
            if (r8 == r6) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x03da, code lost:
            r11 = r0.f16020o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03dc, code lost:
            if (r11 == r6) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x03de, code lost:
            r2 = ((float) (r0.f16018m * r8)) / ((float) (r0.f16017l * r11));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03eb, code lost:
            if (r0.f16028w == false) goto L_0x03fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ed, code lost:
            r10 = new com.applovin.exoplayer2.p222m.C7790b(r0.f16029x, r0.f16031z, r0.f16030y, m19536c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03fe, code lost:
            if (r0.f16006a == null) goto L_0x041c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x040a, code lost:
            if (com.applovin.exoplayer2.p186e.p191e.C7216d.m19496b().containsKey(r0.f16006a) == false) goto L_0x041c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x040c, code lost:
            r6 = ((java.lang.Integer) com.applovin.exoplayer2.p186e.p191e.C7216d.m19496b().get(r0.f16006a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x041e, code lost:
            if (r0.f16022q != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0427, code lost:
            if (java.lang.Float.compare(r0.f16023r, 0.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x042f, code lost:
            if (java.lang.Float.compare(r0.f16024s, 0.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0437, code lost:
            if (java.lang.Float.compare(r0.f16025t, 0.0f) != 0) goto L_0x043a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0442, code lost:
            if (java.lang.Float.compare(r0.f16024s, 90.0f) != 0) goto L_0x0447;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0444, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x044f, code lost:
            if (java.lang.Float.compare(r0.f16024s, -180.0f) == 0) goto L_0x0469;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0459, code lost:
            if (java.lang.Float.compare(r0.f16024s, 180.0f) != 0) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0464, code lost:
            if (java.lang.Float.compare(r0.f16024s, -90.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0466, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0469, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x046c, code lost:
            r9 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x046d, code lost:
            r7.mo55436g(r0.f16017l).mo55437h(r0.f16018m).mo55425b(r2).mo55438i(r9).mo55423a(r0.f16026u).mo55439j(r0.f16027v).mo55420a(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0496, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x049c, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x04a2, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x04a8, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ae, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x04b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b7, code lost:
            throw com.applovin.exoplayer2.C6809ai.m17540b("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ba, code lost:
            if (r0.f16006a == null) goto L_0x04cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c6, code lost:
            if (com.applovin.exoplayer2.p186e.p191e.C7216d.m19496b().containsKey(r0.f16006a) != false) goto L_0x04cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c8, code lost:
            r7.mo55427b(r0.f16006a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x04cd, code lost:
            r1 = r7.mo55416a(r20).mo55435f(r4).mo55434f(r15).mo55429c(r0.f16005Y).mo55426b((int) r5).mo55422a((java.util.List<byte[]>) r1).mo55431d(r3).mo55418a(r0.f16016k).mo55424a();
            r2 = r19.mo53894a(r0.f16008c, r8);
            r0.f16002V = r2;
            r2.mo53953a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0504, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53931a(com.applovin.exoplayer2.p186e.C7329j r19, int r20) throws com.applovin.exoplayer2.C6809ai {
            /*
                r18 = this;
                r0 = r18
                java.lang.String r1 = r0.f16007b
                int r2 = r1.hashCode()
                r4 = 16
                r6 = 4
                r7 = 8
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x0179;
                    case -2095575984: goto L_0x016f;
                    case -1985379776: goto L_0x0164;
                    case -1784763192: goto L_0x0159;
                    case -1730367663: goto L_0x014e;
                    case -1482641358: goto L_0x0143;
                    case -1482641357: goto L_0x0138;
                    case -1373388978: goto L_0x012d;
                    case -933872740: goto L_0x0122;
                    case -538363189: goto L_0x0117;
                    case -538363109: goto L_0x010c;
                    case -425012669: goto L_0x0100;
                    case -356037306: goto L_0x00f4;
                    case 62923557: goto L_0x00e8;
                    case 62923603: goto L_0x00dc;
                    case 62927045: goto L_0x00d0;
                    case 82318131: goto L_0x00c5;
                    case 82338133: goto L_0x00ba;
                    case 82338134: goto L_0x00af;
                    case 99146302: goto L_0x00a3;
                    case 444813526: goto L_0x0097;
                    case 542569478: goto L_0x008b;
                    case 635596514: goto L_0x007f;
                    case 725948237: goto L_0x0073;
                    case 725957860: goto L_0x0067;
                    case 738597099: goto L_0x005b;
                    case 855502857: goto L_0x004f;
                    case 1422270023: goto L_0x0043;
                    case 1809237540: goto L_0x0038;
                    case 1950749482: goto L_0x002c;
                    case 1950789798: goto L_0x0020;
                    case 1951062397: goto L_0x0014;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x0183
            L_0x0014:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 12
                goto L_0x0184
            L_0x0020:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 22
                goto L_0x0184
            L_0x002c:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 17
                goto L_0x0184
            L_0x0038:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 3
                goto L_0x0184
            L_0x0043:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 27
                goto L_0x0184
            L_0x004f:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 8
                goto L_0x0184
            L_0x005b:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 28
                goto L_0x0184
            L_0x0067:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 24
                goto L_0x0184
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 25
                goto L_0x0184
            L_0x007f:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 26
                goto L_0x0184
            L_0x008b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 20
                goto L_0x0184
            L_0x0097:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 10
                goto L_0x0184
            L_0x00a3:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 30
                goto L_0x0184
            L_0x00af:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 1
                goto L_0x0184
            L_0x00ba:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 0
                goto L_0x0184
            L_0x00c5:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 2
                goto L_0x0184
            L_0x00d0:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 19
                goto L_0x0184
            L_0x00dc:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 16
                goto L_0x0184
            L_0x00e8:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 13
                goto L_0x0184
            L_0x00f4:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 21
                goto L_0x0184
            L_0x0100:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 29
                goto L_0x0184
            L_0x010c:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 7
                goto L_0x0184
            L_0x0117:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 5
                goto L_0x0184
            L_0x0122:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 31
                goto L_0x0184
            L_0x012d:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 9
                goto L_0x0184
            L_0x0138:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 15
                goto L_0x0184
            L_0x0143:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 14
                goto L_0x0184
            L_0x014e:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 11
                goto L_0x0184
            L_0x0159:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 18
                goto L_0x0184
            L_0x0164:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 23
                goto L_0x0184
            L_0x016f:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 4
                goto L_0x0184
            L_0x0179:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 6
                goto L_0x0184
            L_0x0183:
                r1 = -1
            L_0x0184:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r3 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                r10 = 0
                switch(r1) {
                    case 0: goto L_0x0374;
                    case 1: goto L_0x0371;
                    case 2: goto L_0x036e;
                    case 3: goto L_0x036b;
                    case 4: goto L_0x035e;
                    case 5: goto L_0x035e;
                    case 6: goto L_0x035e;
                    case 7: goto L_0x033d;
                    case 8: goto L_0x0323;
                    case 9: goto L_0x0308;
                    case 10: goto L_0x0304;
                    case 11: goto L_0x02f2;
                    case 12: goto L_0x02b1;
                    case 13: goto L_0x0293;
                    case 14: goto L_0x028a;
                    case 15: goto L_0x0287;
                    case 16: goto L_0x0283;
                    case 17: goto L_0x027f;
                    case 18: goto L_0x0274;
                    case 19: goto L_0x0270;
                    case 20: goto L_0x0270;
                    case 21: goto L_0x026c;
                    case 22: goto L_0x025e;
                    case 23: goto L_0x0223;
                    case 24: goto L_0x0207;
                    case 25: goto L_0x01f1;
                    case 26: goto L_0x01e2;
                    case 27: goto L_0x01dc;
                    case 28: goto L_0x01c9;
                    case 29: goto L_0x01ba;
                    case 30: goto L_0x01b4;
                    case 31: goto L_0x01a1;
                    default: goto L_0x019a;
                }
            L_0x019a:
                java.lang.String r1 = "Unrecognized codec identifier."
                com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.C6809ai.m17540b(r1, r10)
                throw r1
            L_0x01a1:
                byte[] r1 = new byte[r6]
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r6)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r1)
                r16 = r2
                goto L_0x0321
            L_0x01b4:
                r1 = r10
                r3 = r1
                r16 = r11
                goto L_0x0378
            L_0x01ba:
                java.lang.String r1 = r0.f16007b
                byte[] r1 = r0.m19533a((java.lang.String) r1)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.p183a.C7033s.m18793a(r1)
                r3 = r10
                r16 = r12
                goto L_0x0378
            L_0x01c9:
                byte[] r1 = com.applovin.exoplayer2.p186e.p191e.C7216d.f15923c
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.p183a.C7033s.m18794a(r1, r3)
                r3 = r10
                r16 = r13
                goto L_0x0378
            L_0x01dc:
                r1 = r10
                r3 = r1
                r16 = r14
                goto L_0x0378
            L_0x01e2:
                int r1 = r0.f15995O
                r4 = 32
                if (r1 != r4) goto L_0x01e9
                goto L_0x021f
            L_0x01e9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported floating point PCM bit depth: "
                goto L_0x0216
            L_0x01f1:
                int r1 = r0.f15995O
                if (r1 != r7) goto L_0x01fa
                r1 = r10
                r3 = r1
                r6 = 3
                goto L_0x0379
            L_0x01fa:
                if (r1 != r4) goto L_0x01ff
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x021f
            L_0x01ff:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported big endian PCM bit depth: "
                goto L_0x0216
            L_0x0207:
                int r1 = r0.f15995O
                int r6 = com.applovin.exoplayer2.p221l.C7728ai.m22243c((int) r1)
                if (r6 != 0) goto L_0x021f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            L_0x0216:
                r1.append(r4)
                int r4 = r0.f15995O
                r1.append(r4)
                goto L_0x024b
            L_0x021f:
                r1 = r10
                r3 = r1
                goto L_0x0379
            L_0x0223:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r4 = r0.f16007b
                byte[] r4 = r0.m19533a((java.lang.String) r4)
                r1.<init>((byte[]) r4)
                boolean r1 = m19535b((com.applovin.exoplayer2.p221l.C7772y) r1)
                if (r1 == 0) goto L_0x0244
                int r1 = r0.f15995O
                int r6 = com.applovin.exoplayer2.p221l.C7728ai.m22243c((int) r1)
                if (r6 != 0) goto L_0x021f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported PCM bit depth: "
                goto L_0x0216
            L_0x0244:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            L_0x024b:
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.exoplayer2.p221l.C7755q.m22361c(r5, r1)
                r1 = r10
                r3 = r1
                r16 = r15
                goto L_0x0378
            L_0x025e:
                java.lang.String r1 = r0.f16007b
                byte[] r1 = r0.m19533a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x0321
            L_0x026c:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0376
            L_0x0270:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0376
            L_0x0274:
                com.applovin.exoplayer2.e.e.d$c r1 = new com.applovin.exoplayer2.e.e.d$c
                r1.<init>()
                r0.f15999S = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0376
            L_0x027f:
                java.lang.String r16 = "audio/eac3"
                goto L_0x0376
            L_0x0283:
                java.lang.String r16 = "audio/ac3"
                goto L_0x0376
            L_0x0287:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x028c
            L_0x028a:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x028c:
                r1 = r10
                r3 = r1
                r6 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x037a
            L_0x0293:
                java.lang.String r1 = r0.f16007b
                byte[] r1 = r0.m19533a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f16015j
                com.applovin.exoplayer2.b.a$a r3 = com.applovin.exoplayer2.p181b.C6847a.m17929a((byte[]) r3)
                int r4 = r3.f14978a
                r0.f15996P = r4
                int r4 = r3.f14979b
                r0.f15994N = r4
                java.lang.String r3 = r3.f14980c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0378
            L_0x02b1:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.f15997Q
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.f15998R
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x0300
            L_0x02f2:
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f16007b
                byte[] r1 = r0.m19533a((java.lang.String) r1)
                java.util.List r1 = m19531a((byte[]) r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x0300:
                r3 = r10
                r6 = -1
                goto L_0x037a
            L_0x0304:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0376
            L_0x0308:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = m19529a((com.applovin.exoplayer2.p221l.C7772y) r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x0321:
                r3 = r10
                goto L_0x0378
            L_0x0323:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.exoplayer2.m.f r1 = com.applovin.exoplayer2.p222m.C7797f.m22571a(r1)
                java.util.List<byte[]> r3 = r1.f18444a
                int r4 = r1.f18445b
                r0.f16003W = r4
                java.lang.String r1 = r1.f18446c
                java.lang.String r16 = "video/hevc"
                goto L_0x0356
            L_0x033d:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f16007b
                byte[] r3 = r0.m19533a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.exoplayer2.m.a r1 = com.applovin.exoplayer2.p222m.C7776a.m22498a(r1)
                java.util.List<byte[]> r3 = r1.f18357a
                int r4 = r1.f18358b
                r0.f16003W = r4
                java.lang.String r1 = r1.f18362f
                java.lang.String r16 = "video/avc"
            L_0x0356:
                r6 = -1
                r15 = -1
                r17 = r3
                r3 = r1
                r1 = r17
                goto L_0x037a
            L_0x035e:
                byte[] r1 = r0.f16015j
                if (r1 != 0) goto L_0x0364
                r1 = r10
                goto L_0x0368
            L_0x0364:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0368:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0321
            L_0x036b:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0376
            L_0x036e:
                java.lang.String r16 = "video/av01"
                goto L_0x0376
            L_0x0371:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0376
            L_0x0374:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0376:
                r1 = r10
                r3 = r1
            L_0x0378:
                r6 = -1
            L_0x0379:
                r15 = -1
            L_0x037a:
                byte[] r4 = r0.f15993M
                if (r4 == 0) goto L_0x038d
                com.applovin.exoplayer2.l.y r5 = new com.applovin.exoplayer2.l.y
                r5.<init>((byte[]) r4)
                com.applovin.exoplayer2.m.c r4 = com.applovin.exoplayer2.p222m.C7791c.m22549a(r5)
                if (r4 == 0) goto L_0x038d
                java.lang.String r3 = r4.f18419c
                java.lang.String r16 = "video/dolby-vision"
            L_0x038d:
                r4 = r16
                boolean r5 = r0.f16001U
                r5 = r5 | r9
                boolean r7 = r0.f16000T
                if (r7 == 0) goto L_0x0398
                r7 = 2
                goto L_0x0399
            L_0x0398:
                r7 = 0
            L_0x0399:
                r5 = r5 | r7
                com.applovin.exoplayer2.v$a r7 = new com.applovin.exoplayer2.v$a
                r7.<init>()
                boolean r16 = com.applovin.exoplayer2.p221l.C7759u.m22377a((java.lang.String) r4)
                if (r16 == 0) goto L_0x03b7
                int r2 = r0.f15994N
                com.applovin.exoplayer2.v$a r2 = r7.mo55440k((int) r2)
                int r8 = r0.f15996P
                com.applovin.exoplayer2.v$a r2 = r2.mo55441l((int) r8)
                r2.mo55442m((int) r6)
                r8 = 1
                goto L_0x04b8
            L_0x03b7:
                boolean r6 = com.applovin.exoplayer2.p221l.C7759u.m22380b(r4)
                if (r6 == 0) goto L_0x0492
                int r2 = r0.f16021p
                if (r2 != 0) goto L_0x03d3
                int r2 = r0.f16019n
                r6 = -1
                if (r2 != r6) goto L_0x03c8
                int r2 = r0.f16017l
            L_0x03c8:
                r0.f16019n = r2
                int r2 = r0.f16020o
                if (r2 != r6) goto L_0x03d0
                int r2 = r0.f16018m
            L_0x03d0:
                r0.f16020o = r2
                goto L_0x03d4
            L_0x03d3:
                r6 = -1
            L_0x03d4:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.f16019n
                if (r8 == r6) goto L_0x03e9
                int r11 = r0.f16020o
                if (r11 == r6) goto L_0x03e9
                int r2 = r0.f16018m
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.f16017l
                int r8 = r8 * r11
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x03e9:
                boolean r8 = r0.f16028w
                if (r8 == 0) goto L_0x03fc
                byte[] r8 = r18.m19536c()
                com.applovin.exoplayer2.m.b r10 = new com.applovin.exoplayer2.m.b
                int r11 = r0.f16029x
                int r12 = r0.f16031z
                int r13 = r0.f16030y
                r10.<init>(r11, r12, r13, r8)
            L_0x03fc:
                java.lang.String r8 = r0.f16006a
                if (r8 == 0) goto L_0x041c
                java.util.Map r8 = com.applovin.exoplayer2.p186e.p191e.C7216d.f15926f
                java.lang.String r11 = r0.f16006a
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x041c
                java.util.Map r6 = com.applovin.exoplayer2.p186e.p191e.C7216d.f15926f
                java.lang.String r8 = r0.f16006a
                java.lang.Object r6 = r6.get(r8)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
            L_0x041c:
                int r8 = r0.f16022q
                if (r8 != 0) goto L_0x046c
                float r8 = r0.f16023r
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x046c
                float r8 = r0.f16024s
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x046c
                float r8 = r0.f16025t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x043a
                goto L_0x046d
            L_0x043a:
                float r8 = r0.f16024s
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0447
                r9 = 90
                goto L_0x046d
            L_0x0447:
                float r8 = r0.f16024s
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0469
                float r8 = r0.f16024s
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x045c
                goto L_0x0469
            L_0x045c:
                float r8 = r0.f16024s
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x046c
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x046d
            L_0x0469:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x046d
            L_0x046c:
                r9 = r6
            L_0x046d:
                int r6 = r0.f16017l
                com.applovin.exoplayer2.v$a r6 = r7.mo55436g((int) r6)
                int r8 = r0.f16018m
                com.applovin.exoplayer2.v$a r6 = r6.mo55437h((int) r8)
                com.applovin.exoplayer2.v$a r2 = r6.mo55425b((float) r2)
                com.applovin.exoplayer2.v$a r2 = r2.mo55438i((int) r9)
                byte[] r6 = r0.f16026u
                com.applovin.exoplayer2.v$a r2 = r2.mo55423a((byte[]) r6)
                int r6 = r0.f16027v
                com.applovin.exoplayer2.v$a r2 = r2.mo55439j((int) r6)
                r2.mo55420a((com.applovin.exoplayer2.p222m.C7790b) r10)
                r8 = 2
                goto L_0x04b8
            L_0x0492:
                boolean r6 = r14.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r13.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r12.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r11.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x04b1
                goto L_0x04b8
            L_0x04b1:
                java.lang.String r1 = "Unexpected MIME type."
                com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.C6809ai.m17540b(r1, r10)
                throw r1
            L_0x04b8:
                java.lang.String r2 = r0.f16006a
                if (r2 == 0) goto L_0x04cd
                java.util.Map r2 = com.applovin.exoplayer2.p186e.p191e.C7216d.f15926f
                java.lang.String r6 = r0.f16006a
                boolean r2 = r2.containsKey(r6)
                if (r2 != 0) goto L_0x04cd
                java.lang.String r2 = r0.f16006a
                r7.mo55427b((java.lang.String) r2)
            L_0x04cd:
                r2 = r20
                com.applovin.exoplayer2.v$a r2 = r7.mo55416a((int) r2)
                com.applovin.exoplayer2.v$a r2 = r2.mo55435f((java.lang.String) r4)
                com.applovin.exoplayer2.v$a r2 = r2.mo55434f((int) r15)
                java.lang.String r4 = r0.f16005Y
                com.applovin.exoplayer2.v$a r2 = r2.mo55429c((java.lang.String) r4)
                com.applovin.exoplayer2.v$a r2 = r2.mo55426b((int) r5)
                com.applovin.exoplayer2.v$a r1 = r2.mo55422a((java.util.List<byte[]>) r1)
                com.applovin.exoplayer2.v$a r1 = r1.mo55431d((java.lang.String) r3)
                com.applovin.exoplayer2.d.e r2 = r0.f16016k
                com.applovin.exoplayer2.v$a r1 = r1.mo55418a((com.applovin.exoplayer2.p185d.C7148e) r2)
                com.applovin.exoplayer2.v r1 = r1.mo55424a()
                int r2 = r0.f16008c
                r3 = r19
                com.applovin.exoplayer2.e.x r2 = r3.mo53894a(r2, r8)
                r0.f16002V = r2
                r2.mo53953a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p191e.C7216d.C7219b.mo53931a(com.applovin.exoplayer2.e.j, int):void");
        }

        /* renamed from: b */
        public void mo53932b() {
            C7220c cVar = this.f15999S;
            if (cVar != null) {
                cVar.mo53933a();
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.e.e.d$c */
    private static final class C7220c {

        /* renamed from: a */
        private final byte[] f16032a = new byte[10];

        /* renamed from: b */
        private boolean f16033b;

        /* renamed from: c */
        private int f16034c;

        /* renamed from: d */
        private long f16035d;

        /* renamed from: e */
        private int f16036e;

        /* renamed from: f */
        private int f16037f;

        /* renamed from: g */
        private int f16038g;

        /* renamed from: a */
        public void mo53933a() {
            this.f16033b = false;
            this.f16034c = 0;
        }

        /* renamed from: a */
        public void mo53934a(C7219b bVar) {
            if (this.f16034c > 0) {
                bVar.f16002V.mo53950a(this.f16035d, this.f16036e, this.f16037f, this.f16038g, bVar.f16014i);
                this.f16034c = 0;
            }
        }

        /* renamed from: a */
        public void mo53935a(C7219b bVar, long j, int i, int i2, int i3) {
            if (this.f16033b) {
                int i4 = this.f16034c;
                this.f16034c = i4 + 1;
                if (i4 == 0) {
                    this.f16035d = j;
                    this.f16036e = i;
                    this.f16037f = 0;
                }
                this.f16037f += i2;
                this.f16038g = i3;
                if (this.f16034c >= 16) {
                    mo53934a(bVar);
                }
            }
        }

        /* renamed from: a */
        public void mo53936a(C7279i iVar) throws IOException {
            if (!this.f16033b) {
                iVar.mo53908d(this.f16032a, 0, 10);
                iVar.mo53899a();
                if (C6850b.m17940b(this.f16032a) != 0) {
                    this.f16033b = true;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f15926f = Collections.unmodifiableMap(hashMap);
    }

    public C7216d() {
        this(0);
    }

    public C7216d(int i) {
        this(new C7211a(), i);
    }

    C7216d(C7215c cVar, int i) {
        this.f15976w = -1;
        this.f15977x = -9223372036854775807L;
        this.f15978y = -9223372036854775807L;
        this.f15979z = -9223372036854775807L;
        this.f15932F = -1;
        this.f15933G = -1;
        this.f15934H = -9223372036854775807L;
        this.f15960g = cVar;
        cVar.mo53910a((C7214b) new C7218a());
        this.f15963j = (i & 1) == 0;
        this.f15961h = new C7222f();
        this.f15962i = new SparseArray<>();
        this.f15966m = new C7772y(4);
        this.f15967n = new C7772y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15968o = new C7772y(4);
        this.f15964k = new C7772y(C7762v.f18312a);
        this.f15965l = new C7772y(4);
        this.f15969p = new C7772y();
        this.f15970q = new C7772y();
        this.f15971r = new C7772y(8);
        this.f15972s = new C7772y();
        this.f15973t = new C7772y();
        this.f15944R = new int[1];
    }

    /* renamed from: a */
    private int m19482a(C7279i iVar, C7219b bVar, int i) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(bVar.f16007b)) {
            m19488a(iVar, f15922b, i);
        } else if ("S_TEXT/ASS".equals(bVar.f16007b)) {
            m19488a(iVar, f15924d, i);
        } else {
            C7357x xVar = bVar.f16002V;
            boolean z = true;
            if (!this.f15953aa) {
                if (bVar.f16012g) {
                    this.f15947U &= -1073741825;
                    int i3 = 128;
                    if (!this.f15954ab) {
                        iVar.mo53903b(this.f15966m.mo55077d(), 0, 1);
                        this.f15950X++;
                        if ((this.f15966m.mo55077d()[0] & 128) != 128) {
                            this.f15957ae = this.f15966m.mo55077d()[0];
                            this.f15954ab = true;
                        } else {
                            throw C6809ai.m17540b("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    if ((this.f15957ae & 1) == 1) {
                        boolean z2 = (this.f15957ae & 2) == 2;
                        this.f15947U |= 1073741824;
                        if (!this.f15958af) {
                            iVar.mo53903b(this.f15971r.mo55077d(), 0, 8);
                            this.f15950X += 8;
                            this.f15958af = true;
                            byte[] d = this.f15966m.mo55077d();
                            if (!z2) {
                                i3 = 0;
                            }
                            d[0] = (byte) (i3 | 8);
                            this.f15966m.mo55076d(0);
                            xVar.mo53952a(this.f15966m, 1, 1);
                            this.f15951Y++;
                            this.f15971r.mo55076d(0);
                            xVar.mo53952a(this.f15971r, 8, 1);
                            this.f15951Y += 8;
                        }
                        if (z2) {
                            if (!this.f15955ac) {
                                iVar.mo53903b(this.f15966m.mo55077d(), 0, 1);
                                this.f15950X++;
                                this.f15966m.mo55076d(0);
                                this.f15956ad = this.f15966m.mo55084h();
                                this.f15955ac = true;
                            }
                            int i4 = this.f15956ad * 4;
                            this.f15966m.mo55067a(i4);
                            iVar.mo53903b(this.f15966m.mo55077d(), 0, i4);
                            this.f15950X += i4;
                            short s = (short) ((this.f15956ad / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f15974u;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f15974u = ByteBuffer.allocate(i5);
                            }
                            this.f15974u.position(0);
                            this.f15974u.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f15956ad;
                                if (i6 >= i2) {
                                    break;
                                }
                                int w = this.f15966m.mo55099w();
                                if (i6 % 2 == 0) {
                                    this.f15974u.putShort((short) (w - i7));
                                } else {
                                    this.f15974u.putInt(w - i7);
                                }
                                i6++;
                                i7 = w;
                            }
                            int i8 = (i - this.f15950X) - i7;
                            int i9 = i2 % 2;
                            ByteBuffer byteBuffer2 = this.f15974u;
                            if (i9 == 1) {
                                byteBuffer2.putInt(i8);
                            } else {
                                byteBuffer2.putShort((short) i8);
                                this.f15974u.putInt(0);
                            }
                            this.f15972s.mo55070a(this.f15974u.array(), i5);
                            xVar.mo53952a(this.f15972s, i5, 1);
                            this.f15951Y += i5;
                        }
                    }
                } else if (bVar.f16013h != null) {
                    this.f15969p.mo55070a(bVar.f16013h, bVar.f16013h.length);
                }
                if (bVar.f16011f > 0) {
                    this.f15947U |= 268435456;
                    this.f15973t.mo55067a(0);
                    this.f15966m.mo55067a(4);
                    this.f15966m.mo55077d()[0] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.f15966m.mo55077d()[1] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.f15966m.mo55077d()[2] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.f15966m.mo55077d()[3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                    xVar.mo53952a(this.f15966m, 4, 2);
                    this.f15951Y += 4;
                }
                this.f15953aa = true;
            }
            int b = i + this.f15969p.mo55072b();
            if (!"V_MPEG4/ISO/AVC".equals(bVar.f16007b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f16007b)) {
                if (bVar.f15999S != null) {
                    if (this.f15969p.mo55072b() != 0) {
                        z = false;
                    }
                    C7717a.m22121b(z);
                    bVar.f15999S.mo53936a(iVar);
                }
                while (true) {
                    int i10 = this.f15950X;
                    if (i10 >= b) {
                        break;
                    }
                    int a = m19483a(iVar, xVar, b - i10);
                    this.f15950X += a;
                    this.f15951Y += a;
                }
            } else {
                byte[] d2 = this.f15965l.mo55077d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i11 = bVar.f16003W;
                int i12 = 4 - bVar.f16003W;
                while (this.f15950X < b) {
                    int i13 = this.f15952Z;
                    if (i13 == 0) {
                        m19489a(iVar, d2, i12, i11);
                        this.f15950X += i11;
                        this.f15965l.mo55076d(0);
                        this.f15952Z = this.f15965l.mo55099w();
                        this.f15964k.mo55076d(0);
                        xVar.mo53951a(this.f15964k, 4);
                        this.f15951Y += 4;
                    } else {
                        int a2 = m19483a(iVar, xVar, i13);
                        this.f15950X += a2;
                        this.f15951Y += a2;
                        this.f15952Z -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.f16007b)) {
                this.f15967n.mo55076d(0);
                xVar.mo53951a(this.f15967n, 4);
                this.f15951Y += 4;
            }
            return m19499e();
        }
        return m19499e();
    }

    /* renamed from: a */
    private int m19483a(C7279i iVar, C7357x xVar, int i) throws IOException {
        int a = this.f15969p.mo55064a();
        if (a <= 0) {
            return xVar.mo53948a((C7668g) iVar, i, false);
        }
        int min = Math.min(i, a);
        xVar.mo53951a(this.f15969p, min);
        return min;
    }

    /* renamed from: a */
    private long m19484a(long j) throws C6809ai {
        long j2 = this.f15977x;
        if (j2 != -9223372036854775807L) {
            return C7728ai.m22252d(j, j2, 1000);
        }
        throw C6809ai.m17540b("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: a */
    private C7353v m19485a(C7756r rVar, C7756r rVar2) {
        int i;
        if (this.f15976w == -1 || this.f15979z == -9223372036854775807L || rVar == null || rVar.mo55032a() == 0 || rVar2 == null || rVar2.mo55032a() != rVar.mo55032a()) {
            return new C7353v.C7355b(this.f15979z);
        }
        int a = rVar.mo55032a();
        int[] iArr = new int[a];
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = new long[a];
        int i2 = 0;
        for (int i3 = 0; i3 < a; i3++) {
            jArr3[i3] = rVar.mo55033a(i3);
            jArr[i3] = this.f15976w + rVar2.mo55033a(i3);
        }
        while (true) {
            i = a - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f15976w + this.f15975v) - jArr[i]);
        jArr2[i] = this.f15979z - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            C7755q.m22361c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new C7195c(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: a */
    private void m19486a(C7219b bVar, long j, int i, int i2, int i3) {
        String str;
        if (bVar.f15999S != null) {
            bVar.f15999S.mo53935a(bVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f16007b) || "S_TEXT/ASS".equals(bVar.f16007b)) {
                if (this.f15943Q > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else if (this.f15941O == -9223372036854775807L) {
                    str = "Skipping subtitle sample with no duration.";
                } else {
                    m19490a(bVar.f16007b, this.f15941O, this.f15970q.mo55077d());
                    int c = this.f15970q.mo55074c();
                    while (true) {
                        if (c >= this.f15970q.mo55072b()) {
                            break;
                        } else if (this.f15970q.mo55077d()[c] == 0) {
                            this.f15970q.mo55075c(c);
                            break;
                        } else {
                            c++;
                        }
                    }
                    C7357x xVar = bVar.f16002V;
                    C7772y yVar = this.f15970q;
                    xVar.mo53951a(yVar, yVar.mo55072b());
                    i2 += this.f15970q.mo55072b();
                }
                C7755q.m22361c("MatroskaExtractor", str);
            }
            if ((268435456 & i) != 0) {
                if (this.f15943Q > 1) {
                    i &= -268435457;
                } else {
                    int b = this.f15973t.mo55072b();
                    bVar.f16002V.mo53952a(this.f15973t, b, 2);
                    i2 += b;
                }
            }
            bVar.f16002V.mo53950a(j, i, i2, i3, bVar.f16014i);
        }
        this.f15938L = true;
    }

    /* renamed from: a */
    private void m19487a(C7279i iVar, int i) throws IOException {
        if (this.f15966m.mo55072b() < i) {
            if (this.f15966m.mo55078e() < i) {
                C7772y yVar = this.f15966m;
                yVar.mo55073b(Math.max(yVar.mo55078e() * 2, i));
            }
            iVar.mo53903b(this.f15966m.mo55077d(), this.f15966m.mo55072b(), i - this.f15966m.mo55072b());
            this.f15966m.mo55075c(i);
        }
    }

    /* renamed from: a */
    private void m19488a(C7279i iVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f15970q.mo55078e() < length) {
            this.f15970q.mo55069a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f15970q.mo55077d(), 0, bArr.length);
        }
        iVar.mo53903b(this.f15970q.mo55077d(), bArr.length, i);
        this.f15970q.mo55076d(0);
        this.f15970q.mo55075c(length);
    }

    /* renamed from: a */
    private void m19489a(C7279i iVar, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.f15969p.mo55064a());
        iVar.mo53903b(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f15969p.mo55071a(bArr, i, min);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19490a(java.lang.String r4, long r5, byte[] r7) {
        /*
            int r0 = r4.hashCode()
            r1 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = -1
        L_0x0026:
            if (r4 == 0) goto L_0x003b
            if (r4 != r3) goto L_0x0035
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r4 = m19494a((long) r5, (java.lang.String) r4, (long) r0)
            r5 = 21
            goto L_0x0045
        L_0x0035:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L_0x003b:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "%02d:%02d:%02d,%03d"
            byte[] r4 = m19494a((long) r5, (java.lang.String) r4, (long) r0)
            r5 = 19
        L_0x0045:
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r7, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p191e.C7216d.m19490a(java.lang.String, long, byte[]):void");
    }

    /* renamed from: a */
    private boolean m19491a(C7352u uVar, long j) {
        if (this.f15931E) {
            this.f15933G = j;
            uVar.f16774a = this.f15932F;
            this.f15931E = false;
            return true;
        }
        if (this.f15928B) {
            long j2 = this.f15933G;
            if (j2 != -1) {
                uVar.f16774a = j2;
                this.f15933G = -1;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m19492a(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -2095576542: goto L_0x0170;
                case -2095575984: goto L_0x0166;
                case -1985379776: goto L_0x015b;
                case -1784763192: goto L_0x0150;
                case -1730367663: goto L_0x0145;
                case -1482641358: goto L_0x013a;
                case -1482641357: goto L_0x012f;
                case -1373388978: goto L_0x0124;
                case -933872740: goto L_0x0119;
                case -538363189: goto L_0x010e;
                case -538363109: goto L_0x0103;
                case -425012669: goto L_0x00f7;
                case -356037306: goto L_0x00eb;
                case 62923557: goto L_0x00df;
                case 62923603: goto L_0x00d3;
                case 62927045: goto L_0x00c7;
                case 82318131: goto L_0x00bc;
                case 82338133: goto L_0x00b1;
                case 82338134: goto L_0x00a6;
                case 99146302: goto L_0x009a;
                case 444813526: goto L_0x008e;
                case 542569478: goto L_0x0082;
                case 635596514: goto L_0x0076;
                case 725948237: goto L_0x006a;
                case 725957860: goto L_0x005e;
                case 738597099: goto L_0x0052;
                case 855502857: goto L_0x0046;
                case 1422270023: goto L_0x003a;
                case 1809237540: goto L_0x002f;
                case 1950749482: goto L_0x0023;
                case 1950789798: goto L_0x0017;
                case 1951062397: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x017a
        L_0x000b:
            java.lang.String r0 = "A_OPUS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 11
            goto L_0x017b
        L_0x0017:
            java.lang.String r0 = "A_FLAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 22
            goto L_0x017b
        L_0x0023:
            java.lang.String r0 = "A_EAC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 17
            goto L_0x017b
        L_0x002f:
            java.lang.String r0 = "V_MPEG2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 3
            goto L_0x017b
        L_0x003a:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 27
            goto L_0x017b
        L_0x0046:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 8
            goto L_0x017b
        L_0x0052:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 28
            goto L_0x017b
        L_0x005e:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 24
            goto L_0x017b
        L_0x006a:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 25
            goto L_0x017b
        L_0x0076:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 26
            goto L_0x017b
        L_0x0082:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 20
            goto L_0x017b
        L_0x008e:
            java.lang.String r0 = "V_THEORA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 10
            goto L_0x017b
        L_0x009a:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 30
            goto L_0x017b
        L_0x00a6:
            java.lang.String r0 = "V_VP9"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 1
            goto L_0x017b
        L_0x00b1:
            java.lang.String r0 = "V_VP8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 0
            goto L_0x017b
        L_0x00bc:
            java.lang.String r0 = "V_AV1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 2
            goto L_0x017b
        L_0x00c7:
            java.lang.String r0 = "A_DTS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 19
            goto L_0x017b
        L_0x00d3:
            java.lang.String r0 = "A_AC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 16
            goto L_0x017b
        L_0x00df:
            java.lang.String r0 = "A_AAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 13
            goto L_0x017b
        L_0x00eb:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 21
            goto L_0x017b
        L_0x00f7:
            java.lang.String r0 = "S_VOBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 29
            goto L_0x017b
        L_0x0103:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 7
            goto L_0x017b
        L_0x010e:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 5
            goto L_0x017b
        L_0x0119:
            java.lang.String r0 = "S_DVBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 31
            goto L_0x017b
        L_0x0124:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 9
            goto L_0x017b
        L_0x012f:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 15
            goto L_0x017b
        L_0x013a:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 14
            goto L_0x017b
        L_0x0145:
            java.lang.String r0 = "A_VORBIS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 12
            goto L_0x017b
        L_0x0150:
            java.lang.String r0 = "A_TRUEHD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 18
            goto L_0x017b
        L_0x015b:
            java.lang.String r0 = "A_MS/ACM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 23
            goto L_0x017b
        L_0x0166:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 4
            goto L_0x017b
        L_0x0170:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 6
            goto L_0x017b
        L_0x017a:
            r3 = -1
        L_0x017b:
            switch(r3) {
                case 0: goto L_0x017f;
                case 1: goto L_0x017f;
                case 2: goto L_0x017f;
                case 3: goto L_0x017f;
                case 4: goto L_0x017f;
                case 5: goto L_0x017f;
                case 6: goto L_0x017f;
                case 7: goto L_0x017f;
                case 8: goto L_0x017f;
                case 9: goto L_0x017f;
                case 10: goto L_0x017f;
                case 11: goto L_0x017f;
                case 12: goto L_0x017f;
                case 13: goto L_0x017f;
                case 14: goto L_0x017f;
                case 15: goto L_0x017f;
                case 16: goto L_0x017f;
                case 17: goto L_0x017f;
                case 18: goto L_0x017f;
                case 19: goto L_0x017f;
                case 20: goto L_0x017f;
                case 21: goto L_0x017f;
                case 22: goto L_0x017f;
                case 23: goto L_0x017f;
                case 24: goto L_0x017f;
                case 25: goto L_0x017f;
                case 26: goto L_0x017f;
                case 27: goto L_0x017f;
                case 28: goto L_0x017f;
                case 29: goto L_0x017f;
                case 30: goto L_0x017f;
                case 31: goto L_0x017f;
                default: goto L_0x017e;
            }
        L_0x017e:
            return r1
        L_0x017f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p186e.p191e.C7216d.m19492a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static byte[] m19494a(long j, String str, long j2) {
        C7717a.m22118a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C7728ai.m22250c(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: a */
    private static int[] m19495a(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: d */
    private void m19498d(int i) throws C6809ai {
        if (this.f15927A == null) {
            throw C6809ai.m17540b("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* renamed from: e */
    private int m19499e() {
        int i = this.f15951Y;
        m19502f();
        return i;
    }

    /* renamed from: e */
    private void m19500e(int i) throws C6809ai {
        if (this.f15935I == null || this.f15936J == null) {
            throw C6809ai.m17540b("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: f */
    private C7219b m19501f(int i) throws C6809ai {
        m19498d(i);
        return this.f15927A;
    }

    /* renamed from: f */
    private void m19502f() {
        this.f15950X = 0;
        this.f15951Y = 0;
        this.f15952Z = 0;
        this.f15953aa = false;
        this.f15954ab = false;
        this.f15955ac = false;
        this.f15956ad = 0;
        this.f15957ae = 0;
        this.f15958af = false;
        this.f15969p.mo55067a(0);
    }

    /* renamed from: g */
    private void m19503g() {
        C7717a.m22115a(this.f15959ag);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C7262h[] m19504h() {
        return new C7262h[]{new C7216d()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo53920a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final int mo53876a(C7279i iVar, C7352u uVar) throws IOException {
        this.f15938L = false;
        boolean z = true;
        while (z && !this.f15938L) {
            z = this.f15960g.mo53911a(iVar);
            if (z && m19491a(uVar, iVar.mo53892c())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f15962i.size(); i++) {
            C7219b valueAt = this.f15962i.valueAt(i);
            valueAt.m19537d();
            valueAt.mo53930a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53921a(int i, double d) throws C6809ai {
        if (i == 181) {
            m19501f(i).f15996P = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m19501f(i).f15983C = (float) d;
                    return;
                case 21970:
                    m19501f(i).f15984D = (float) d;
                    return;
                case 21971:
                    m19501f(i).f15985E = (float) d;
                    return;
                case 21972:
                    m19501f(i).f15986F = (float) d;
                    return;
                case 21973:
                    m19501f(i).f15987G = (float) d;
                    return;
                case 21974:
                    m19501f(i).f15988H = (float) d;
                    return;
                case 21975:
                    m19501f(i).f15989I = (float) d;
                    return;
                case 21976:
                    m19501f(i).f15990J = (float) d;
                    return;
                case 21977:
                    m19501f(i).f15991K = (float) d;
                    return;
                case 21978:
                    m19501f(i).f15992L = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m19501f(i).f16023r = (float) d;
                            return;
                        case 30324:
                            m19501f(i).f16024s = (float) d;
                            return;
                        case 30325:
                            m19501f(i).f16025t = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f15978y = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53922a(int i, int i2, C7279i iVar) throws IOException {
        C7219b bVar;
        C7219b bVar2;
        C7219b bVar3;
        long j;
        long j2;
        int i3;
        byte b;
        int[] iArr;
        int i4 = i;
        int i5 = i2;
        C7279i iVar2 = iVar;
        int i6 = 0;
        int i7 = 1;
        if (i4 == 161 || i4 == 163) {
            if (this.f15939M == 0) {
                this.f15945S = (int) this.f15961h.mo53938a(iVar2, false, true, 8);
                this.f15946T = this.f15961h.mo53940b();
                this.f15941O = -9223372036854775807L;
                this.f15939M = 1;
                this.f15966m.mo55067a(0);
            }
            C7219b bVar4 = this.f15962i.get(this.f15945S);
            if (bVar4 == null) {
                iVar2.mo53902b(i5 - this.f15946T);
                this.f15939M = 0;
                return;
            }
            bVar4.m19537d();
            if (this.f15939M == 1) {
                m19487a(iVar2, 3);
                int i8 = (this.f15966m.mo55077d()[2] & 6) >> 1;
                byte b2 = 255;
                if (i8 == 0) {
                    this.f15943Q = 1;
                    int[] a = m19495a(this.f15944R, 1);
                    this.f15944R = a;
                    a[0] = (i5 - this.f15946T) - 3;
                } else {
                    int i9 = 4;
                    m19487a(iVar2, 4);
                    int i10 = (this.f15966m.mo55077d()[3] & 255) + 1;
                    this.f15943Q = i10;
                    int[] a2 = m19495a(this.f15944R, i10);
                    this.f15944R = a2;
                    if (i8 == 2) {
                        int i11 = this.f15943Q;
                        Arrays.fill(a2, 0, i11, ((i5 - this.f15946T) - 4) / i11);
                    } else if (i8 == 1) {
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i3 = this.f15943Q;
                            if (i12 >= i3 - 1) {
                                break;
                            }
                            this.f15944R[i12] = 0;
                            do {
                                i9++;
                                m19487a(iVar2, i9);
                                b = this.f15966m.mo55077d()[i9 - 1] & 255;
                                iArr = this.f15944R;
                                iArr[i12] = iArr[i12] + b;
                            } while (b == 255);
                            i13 += iArr[i12];
                            i12++;
                        }
                        this.f15944R[i3 - 1] = ((i5 - this.f15946T) - i9) - i13;
                    } else if (i8 == 3) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.f15943Q;
                            if (i14 >= i16 - 1) {
                                bVar2 = bVar4;
                                this.f15944R[i16 - 1] = ((i5 - this.f15946T) - i9) - i15;
                                break;
                            }
                            this.f15944R[i14] = i6;
                            i9++;
                            m19487a(iVar2, i9);
                            int i17 = i9 - 1;
                            if (this.f15966m.mo55077d()[i17] != 0) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 8) {
                                        bVar3 = bVar4;
                                        j = 0;
                                        break;
                                    }
                                    int i19 = i7 << (7 - i18);
                                    if ((this.f15966m.mo55077d()[i17] & i19) != 0) {
                                        int i20 = i9 + i18;
                                        m19487a(iVar2, i20);
                                        bVar3 = bVar4;
                                        long j3 = (long) ((~i19) & this.f15966m.mo55077d()[i17] & b2);
                                        int i21 = i17 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i21 >= i20) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.f15966m.mo55077d()[i21] & b2));
                                            i21++;
                                            i20 = i20;
                                            b2 = 255;
                                        }
                                        int i22 = i20;
                                        if (i14 > 0) {
                                            j2 -= (1 << ((i18 * 7) + 6)) - 1;
                                        }
                                        j = j2;
                                        i9 = i22;
                                    } else {
                                        C7219b bVar5 = bVar4;
                                        i18++;
                                        i7 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i23 = (int) j;
                                    int[] iArr2 = this.f15944R;
                                    if (i14 != 0) {
                                        i23 += iArr2[i14 - 1];
                                    }
                                    iArr2[i14] = i23;
                                    i15 += this.f15944R[i14];
                                    i14++;
                                    bVar4 = bVar3;
                                    i6 = 0;
                                    i7 = 1;
                                    b2 = 255;
                                }
                            } else {
                                throw C6809ai.m17540b("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw C6809ai.m17540b("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw C6809ai.m17540b("Unexpected lacing value: " + i8, (Throwable) null);
                    }
                }
                bVar2 = bVar4;
                this.f15940N = this.f15934H + m19484a((long) ((this.f15966m.mo55077d()[0] << 8) | (this.f15966m.mo55077d()[1] & 255)));
                bVar = bVar2;
                this.f15947U = (bVar.f16009d == 2 || (i4 == 163 && (this.f15966m.mo55077d()[2] & 128) == 128)) ? 1 : 0;
                this.f15939M = 2;
                this.f15942P = 0;
            } else {
                bVar = bVar4;
            }
            if (i4 == 163) {
                while (true) {
                    int i24 = this.f15942P;
                    if (i24 < this.f15943Q) {
                        m19486a(bVar, ((long) ((this.f15942P * bVar.f16010e) / 1000)) + this.f15940N, this.f15947U, m19482a(iVar2, bVar, this.f15944R[i24]), 0);
                        this.f15942P++;
                    } else {
                        this.f15939M = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i25 = this.f15942P;
                    if (i25 < this.f15943Q) {
                        int[] iArr3 = this.f15944R;
                        iArr3[i25] = m19482a(iVar2, bVar, iArr3[i25]);
                        this.f15942P++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i4 != 165) {
            if (i4 == 16877) {
                mo53927a(m19501f(i), iVar2, i5);
            } else if (i4 == 16981) {
                m19498d(i);
                this.f15927A.f16013h = new byte[i5];
                iVar2.mo53903b(this.f15927A.f16013h, 0, i5);
            } else if (i4 == 18402) {
                byte[] bArr = new byte[i5];
                iVar2.mo53903b(bArr, 0, i5);
                m19501f(i).f16014i = new C7357x.C7358a(1, bArr, 0, 0);
            } else if (i4 == 21419) {
                Arrays.fill(this.f15968o.mo55077d(), (byte) 0);
                iVar2.mo53903b(this.f15968o.mo55077d(), 4 - i5, i5);
                this.f15968o.mo55076d(0);
                this.f15929C = (int) this.f15968o.mo55091o();
            } else if (i4 == 25506) {
                m19498d(i);
                this.f15927A.f16015j = new byte[i5];
                iVar2.mo53903b(this.f15927A.f16015j, 0, i5);
            } else if (i4 == 30322) {
                m19498d(i);
                this.f15927A.f16026u = new byte[i5];
                iVar2.mo53903b(this.f15927A.f16026u, 0, i5);
            } else {
                throw C6809ai.m17540b("Unexpected id: " + i4, (Throwable) null);
            }
        } else if (this.f15939M == 2) {
            mo53926a(this.f15962i.get(this.f15945S), this.f15948V, iVar2, i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53923a(int i, long j) throws C6809ai {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m19501f(i).f16009d = (int) j;
                        return;
                    case 136:
                        C7219b f = m19501f(i);
                        if (j == 1) {
                            z = true;
                        }
                        f.f16001U = z;
                        return;
                    case 155:
                        this.f15941O = m19484a(j);
                        return;
                    case 159:
                        m19501f(i).f15994N = (int) j;
                        return;
                    case 176:
                        m19501f(i).f16017l = (int) j;
                        return;
                    case 179:
                        m19500e(i);
                        this.f15935I.mo55034a(m19484a(j));
                        return;
                    case 186:
                        m19501f(i).f16018m = (int) j;
                        return;
                    case 215:
                        m19501f(i).f16008c = (int) j;
                        return;
                    case 231:
                        this.f15934H = m19484a(j);
                        return;
                    case 238:
                        this.f15948V = (int) j;
                        return;
                    case 241:
                        if (!this.f15937K) {
                            m19500e(i);
                            this.f15936J.mo55034a(j);
                            this.f15937K = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f15949W = true;
                        return;
                    case 16871:
                        int unused = m19501f(i).f16004X = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw C6809ai.m17540b("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw C6809ai.m17540b("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw C6809ai.m17540b("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw C6809ai.m17540b("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw C6809ai.m17540b("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f15930D = j + this.f15976w;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m19498d(i);
                        if (i2 == 0) {
                            this.f15927A.f16027v = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f15927A.f16027v = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f15927A.f16027v = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f15927A.f16027v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m19501f(i).f16019n = (int) j;
                        return;
                    case 21682:
                        m19501f(i).f16021p = (int) j;
                        return;
                    case 21690:
                        m19501f(i).f16020o = (int) j;
                        return;
                    case 21930:
                        C7219b f2 = m19501f(i);
                        if (j == 1) {
                            z = true;
                        }
                        f2.f16000T = z;
                        return;
                    case 21998:
                        m19501f(i).f16011f = (int) j;
                        return;
                    case 22186:
                        m19501f(i).f15997Q = j;
                        return;
                    case 22203:
                        m19501f(i).f15998R = j;
                        return;
                    case 25188:
                        m19501f(i).f15995O = (int) j;
                        return;
                    case 30321:
                        m19498d(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f15927A.f16022q = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f15927A.f16022q = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f15927A.f16022q = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f15927A.f16022q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m19501f(i).f16010e = (int) j;
                        return;
                    case 2807729:
                        this.f15977x = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m19498d(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f15927A.f16031z = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f15927A.f16031z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m19498d(i);
                                int b = C7790b.m22547b((int) j);
                                if (b != -1) {
                                    this.f15927A.f16030y = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m19498d(i);
                                this.f15927A.f16028w = true;
                                int a = C7790b.m22545a((int) j);
                                if (a != -1) {
                                    this.f15927A.f16029x = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m19501f(i).f15981A = (int) j;
                                return;
                            case 21949:
                                m19501f(i).f15982B = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw C6809ai.m17540b("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw C6809ai.m17540b("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53924a(int i, long j, long j2) throws C6809ai {
        m19503g();
        if (i == 160) {
            this.f15949W = false;
        } else if (i == 174) {
            this.f15927A = new C7219b();
        } else if (i == 187) {
            this.f15937K = false;
        } else if (i == 19899) {
            this.f15929C = -1;
            this.f15930D = -1;
        } else if (i == 20533) {
            m19501f(i).f16012g = true;
        } else if (i == 21968) {
            m19501f(i).f16028w = true;
        } else if (i == 408125543) {
            long j3 = this.f15976w;
            if (j3 == -1 || j3 == j) {
                this.f15976w = j;
                this.f15975v = j2;
                return;
            }
            throw C6809ai.m17540b("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f15935I = new C7756r();
            this.f15936J = new C7756r();
        } else if (i != 524531317 || this.f15928B) {
        } else {
            if (!this.f15963j || this.f15932F == -1) {
                this.f15959ag.mo53896a(new C7353v.C7355b(this.f15979z));
                this.f15928B = true;
                return;
            }
            this.f15931E = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53925a(int i, String str) throws C6809ai {
        if (i == 134) {
            m19501f(i).f16007b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m19501f(i).f16006a = str;
            } else if (i == 2274716) {
                String unused = m19501f(i).f16005Y = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw C6809ai.m17540b("DocType " + str + " not supported", (Throwable) null);
        }
    }

    /* renamed from: a */
    public void mo53877a(long j, long j2) {
        this.f15934H = -9223372036854775807L;
        this.f15939M = 0;
        this.f15960g.mo53909a();
        this.f15961h.mo53939a();
        m19502f();
        for (int i = 0; i < this.f15962i.size(); i++) {
            this.f15962i.valueAt(i).mo53932b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53926a(C7219b bVar, int i, C7279i iVar, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(bVar.f16007b)) {
            iVar.mo53902b(i2);
            return;
        }
        this.f15973t.mo55067a(i2);
        iVar.mo53903b(this.f15973t.mo55077d(), 0, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53927a(C7219b bVar, C7279i iVar, int i) throws IOException {
        if (bVar.f16004X == 1685485123 || bVar.f16004X == 1685480259) {
            bVar.f15993M = new byte[i];
            iVar.mo53903b(bVar.f15993M, 0, i);
            return;
        }
        iVar.mo53902b(i);
    }

    /* renamed from: a */
    public final void mo53878a(C7329j jVar) {
        this.f15959ag = jVar;
    }

    /* renamed from: a */
    public final boolean mo53879a(C7279i iVar) throws IOException {
        return new C7221e().mo53937a(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo53928b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: c */
    public final void mo53880c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo53929c(int i) throws C6809ai {
        m19503g();
        if (i != 160) {
            if (i == 174) {
                C7219b bVar = (C7219b) C7717a.m22115a(this.f15927A);
                if (bVar.f16007b != null) {
                    if (m19492a(bVar.f16007b)) {
                        bVar.mo53931a(this.f15959ag, bVar.f16008c);
                        this.f15962i.put(bVar.f16008c, bVar);
                    }
                    this.f15927A = null;
                    return;
                }
                throw C6809ai.m17540b("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i == 19899) {
                int i2 = this.f15929C;
                if (i2 != -1) {
                    long j = this.f15930D;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f15932F = j;
                            return;
                        }
                        return;
                    }
                }
                throw C6809ai.m17540b("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i == 25152) {
                m19498d(i);
                if (!this.f15927A.f16012g) {
                    return;
                }
                if (this.f15927A.f16014i != null) {
                    this.f15927A.f16016k = new C7148e(new C7148e.C7150a(C7476h.f17122a, "video/webm", this.f15927A.f16014i.f16783b));
                    return;
                }
                throw C6809ai.m17540b("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i == 28032) {
                m19498d(i);
                if (this.f15927A.f16012g && this.f15927A.f16013h != null) {
                    throw C6809ai.m17540b("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i == 357149030) {
                if (this.f15977x == -9223372036854775807L) {
                    this.f15977x = 1000000;
                }
                long j2 = this.f15978y;
                if (j2 != -9223372036854775807L) {
                    this.f15979z = m19484a(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f15928B) {
                        this.f15959ag.mo53896a(m19485a(this.f15935I, this.f15936J));
                        this.f15928B = true;
                    }
                    this.f15935I = null;
                    this.f15936J = null;
                }
            } else if (this.f15962i.size() != 0) {
                this.f15959ag.mo53895a();
            } else {
                throw C6809ai.m17540b("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f15939M == 2) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f15943Q; i4++) {
                i3 += this.f15944R[i4];
            }
            C7219b bVar2 = this.f15962i.get(this.f15945S);
            bVar2.m19537d();
            for (int i5 = 0; i5 < this.f15943Q; i5++) {
                long j3 = ((long) ((bVar2.f16010e * i5) / 1000)) + this.f15940N;
                int i6 = this.f15947U;
                if (i5 == 0 && !this.f15949W) {
                    i6 |= 1;
                }
                int i7 = this.f15944R[i5];
                i3 -= i7;
                m19486a(bVar2, j3, i6, i7, i3);
            }
            this.f15939M = 0;
        }
    }
}
